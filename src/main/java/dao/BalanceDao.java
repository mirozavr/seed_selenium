package dao;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import entity.KeysWithBalance;
import util.ConnectionManager;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BalanceDao {

    private static final BalanceDao INSTANCE = new BalanceDao();

    private BalanceDao() {
    }

   public static final String CSV_TO_BD = """
           insert into keyswithbalance (keys) values (?);
           """;

    public static final String FIND_ALL_BALANCE_SQL = """
            select id,
            keys
            from keyswithbalance;
            """;


    public static void csvToBd () {
        try (var connection = ConnectionManager.open())
 //       var prepareStatement = connection.prepareStatement(CSV_TO_BD))
        {
//            prepareStatement.setString(1, balanceKey.getKeys());
//            prepareStatement.executeUpdate();

            try (CSVReader reader = new CSVReader(new FileReader("C:\\btcwithbalance\\blockchair_bitcoin_1part.csv"));

                 PreparedStatement prepare = connection.prepareStatement(CSV_TO_BD)) {
                String record[];
                while ((record = reader.readNext()) != null) {
                    prepare.setString(1, record[0]);
                    prepare.executeUpdate();
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (CsvValidationException e) {
                throw new RuntimeException(e);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<KeysWithBalance> findAll() {
        try (Connection connection = ConnectionManager.getPool();
             var preparedStatement = connection.prepareStatement(FIND_ALL_BALANCE_SQL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            List<KeysWithBalance> balanceArray = new ArrayList<>();
            while (resultSet.next()) {
                balanceArray.add(buildBalanceKeys(resultSet));
            }
            return balanceArray;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private KeysWithBalance buildBalanceKeys(ResultSet resultSet) throws SQLException {
        return new KeysWithBalance(
                resultSet.getLong("id"),
                resultSet.getString("keys"));
    }

    public static BalanceDao getInstance() {
        return INSTANCE;
    }
}

