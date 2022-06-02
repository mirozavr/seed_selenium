package dao;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import entity.EtheriumWithBalance;
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

public class EtheriumDao {

    private static final EtheriumDao INSTANCE = new EtheriumDao();

    private EtheriumDao() {
    }

    public static final String CSV_TO_BD__Eth_1 = """
           insert into etherium_balance1 (keys) values (?);
           """;

    public static final String FIND_ALL_BALANCE_SQL_Eth_1 = """
            select id,
            keys
            from etherium_balance1;
            """;

    public static void csvToBd () {
        try (var connection = ConnectionManager.open())
        //       var prepareStatement = connection.prepareStatement(CSV_TO_BD))
        {
//            prepareStatement.setString(1, balanceKey.getKeys());
//            prepareStatement.executeUpdate();

            try (CSVReader reader = new CSVReader(new FileReader("C:\\btcwithbalance\\etherium_1part.csv"));

                 PreparedStatement prepare = connection.prepareStatement(CSV_TO_BD__Eth_1)) {
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

    public List<EtheriumWithBalance> findAll1() {
        try (Connection connection = ConnectionManager.getPool();
             var preparedStatement = connection.prepareStatement(FIND_ALL_BALANCE_SQL_Eth_1)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            List<EtheriumWithBalance> balanceArray = new ArrayList<>();
            while (resultSet.next()) {
                balanceArray.add(buildBalanceKeys(resultSet));
            }
            return balanceArray;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private EtheriumWithBalance buildBalanceKeys(ResultSet resultSet) throws SQLException {
        return new EtheriumWithBalance(
                resultSet.getLong("id"),
                resultSet.getString("keys"));
    }

    public static EtheriumDao getInstance() {
        return INSTANCE;
    }
}
