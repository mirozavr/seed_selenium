package dao;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import entity.KeysWithBalance;
import util.ConnectionManager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BalanceDao3 {

    private static final BalanceDao3 INSTANCE = new BalanceDao3();

    private BalanceDao3() {
    }

    public static final String CSV_TO_BD_3 = """
           insert into keyswithbalance3 (keys) values (?);
           """;

    public static final String FIND_ALL_BALANCE_SQL_3 = """
            select id,
            keys
            from keyswithbalance3;
            """;

    public static void csvToBd3 () {
        try (var connection = ConnectionManager.open())
        //       var prepareStatement = connection.prepareStatement(CSV_TO_BD))
        {
//            prepareStatement.setString(1, balanceKey.getKeys());
//            prepareStatement.executeUpdate();

            try (CSVReader reader = new CSVReader(new FileReader("C:\\btcwithbalance\\blockchair_bitcoin_3part.csv"));

                 PreparedStatement prepare = connection.prepareStatement(CSV_TO_BD_3)) {
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

    public List<KeysWithBalance> findAll3() {
        try (Connection connection = ConnectionManager.getPool();
             var preparedStatement = connection.prepareStatement(FIND_ALL_BALANCE_SQL_3)) {
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

    public static BalanceDao3 getInstance() {
        return INSTANCE;
    }
}
