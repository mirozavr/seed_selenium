package dao;


import entity.StorageWordsKeys;
import util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StorageDao {
    private static final StorageDao INSTANCE = new StorageDao();

    private
    StorageDao() {
    }

    public static final String SAVE_SQL = """
            INSERT INTO storagewordskeys2_3 (word, bip44btc, bip49btc, bip84btc, bip44eth, bip32eth, ltc, seed11entity) values (?, ?, ?, ?, ?, ?, ?, ?)
            """;
    public final String COMPARE_TEST_BD_SQL = """
    select keyz.keys, keyz2.keys
    from 
    keyz,
    keyz2
    where 
    keyz.keys = keyz2.keys
    and keyz.id != keyz2.id;
""";

    public static final String FIND_ALL_SQL = """
    select id,
    word,
    bip44btc,
    bip49btc,
    bip84btc,
    bip44eth,
    bip32eth,
    ltc,
    seed11entity
    
    from storagewordskeys2_3; 
""";

    public static final String FIND_BIP44_BTC_SQL = """
            select bip44btc
           from storagewordskeys2_3;
            """;

    public List<StorageWordsKeys> findAll() {
        try (Connection connection = ConnectionManager.getPool();
             var preparedStatement = connection.prepareStatement(FIND_ALL_SQL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            List<StorageWordsKeys> keysArray = new ArrayList<>();
            while (resultSet.next()) {
                keysArray.add(buildKeys(resultSet));
            }
            return keysArray;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private StorageWordsKeys buildKeys(ResultSet resultSet) throws SQLException {
        return new StorageWordsKeys(
                resultSet.getLong("id"),
                resultSet.getString("word"),
                resultSet.getString("bip44btc"),
                resultSet.getString("bip49btc"),
                resultSet.getString("bip84btc"),
                resultSet.getString("bip44eth"),
                resultSet.getString("bip32eth"),
                resultSet.getString("ltc"),
                resultSet.getString("seed11entity"));
    }
    public List<StorageWordsKeys> findBip44Btc() {
        try (Connection connection = ConnectionManager.getPool();
             var preparedStatement = connection.prepareStatement(FIND_BIP44_BTC_SQL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            List<StorageWordsKeys> bip44BtcArray = new ArrayList<>();
            while (resultSet.next()) {
                bip44BtcArray.add(buildBip44Btc(resultSet));
            }
            return bip44BtcArray;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private StorageWordsKeys buildBip44Btc(ResultSet resultSet) throws SQLException {
        return new StorageWordsKeys(
                resultSet.getString("bip44btc"));
    }



    public StorageWordsKeys save(StorageWordsKeys storageWordsKeys) {
        try (var connection = ConnectionManager.open();
             var preparedStatement = connection.prepareStatement(SAVE_SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, storageWordsKeys.getWord());
            preparedStatement.setString(2, storageWordsKeys.getBip44Btc());
            preparedStatement.setString(3, storageWordsKeys.getBip49Btc());
            preparedStatement.setString(4, storageWordsKeys.getBip84Btc());
            preparedStatement.setString(5, storageWordsKeys.getBip44Eth());
            preparedStatement.setString(6, storageWordsKeys.getBip32Eth());
            preparedStatement.setString(7, storageWordsKeys.getLtc());
            preparedStatement.setString(8, storageWordsKeys.getSeed11Entity());

            preparedStatement.executeUpdate();
            System.out.println(storageWordsKeys.toString());
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                storageWordsKeys.setId(generatedKeys.getLong("id"));
            }
            return storageWordsKeys;


        } catch (SQLException e) {
            try {
                throw new SQLException(e);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }



    public static void compareBip44Btc() {
    String sql1 = """
            select * from keyz;
            """;
    String sql2 = """
            select * from keyz2;
            """;

        try (Connection connection = ConnectionManager.getPool()) {
            try (Connection connection2 = ConnectionManager.getPool()) {
                var statement2 = connection2.prepareStatement(sql2);
                try
                        (var statement = connection.prepareStatement(sql1)


                ) {

                    var resultSet = statement.executeQuery();
                    var resultSet2 = statement2.executeQuery();

                    while (resultSet2.next()) {
                        resultSet.next();

                        if (Objects.equals(resultSet2.getString("keys"), resultSet.getString("keys"))) {
                            System.out.println(resultSet.toString());
                        } else if (!Objects.equals(resultSet2.getString("keys"), resultSet.getString("keys"))) {
                            System.out.println("чето не то");



                        } else System.out.println("Совпадений не найдено");
                        resultSet2.next();


                }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }

    public static void result2Column() {

    }


    // выяснить почему не работает
//    public void saveBatch(List<StorageWordsKeys> entities) {
//        try (var connection = ConnectionManager.getPool();
//             var preparedStatement = connection.prepareStatement(SAVE_SQL)) {
//            int i = 0;
//
//            for (StorageWordsKeys storageWordsKey : entities) {
//
//            preparedStatement.setString(1, storageWordsKey.getWord());
//            preparedStatement.setString(2, storageWordsKey.getBip44Btc());
//            preparedStatement.setString(3, storageWordsKey.getBip49Btc());
//            preparedStatement.setString(4, storageWordsKey.getBip84Btc());
//            preparedStatement.setString(5, storageWordsKey.getBip44Eth());
//            preparedStatement.setString(6, storageWordsKey.getBip32Eth());
//            preparedStatement.setString(7, storageWordsKey.getLtc());
//            preparedStatement.setString(8, storageWordsKey.getSeed11Entity());
//
//            preparedStatement.addBatch();
//            i++;
//                if (i % 1000 == 0 || i == entities.size()) {
//                    preparedStatement.executeBatch(); // Execute every 1000 items.
//                }
//            }
            //  System.out.println(storageWordsKeys.toString());
   //         ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
//            if (generatedKeys.next()) {
//                storageWordsKey.setId(generatedKeys.getLong("id"));
//            }
//            return storageWordsKey;



    public static StorageDao getInstance() {
        return INSTANCE;
    }
}
