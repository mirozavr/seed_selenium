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

public class EtheriumDao10 {
    private static final EtheriumDao10 INSTANCE = new EtheriumDao10();

    private EtheriumDao10() {
    }

    public static final String CSV_TO_BD__Eth_10 = """
           insert into etherium_balance10 (keys) values (?);
           """;

    public static final String FIND_ALL_BALANCE_SQL_Eth_10 = """
            select id,
            keys
            from etherium_balance10;
            """;

    public static void csvToBd () {
        try (var connection = ConnectionManager.open())

        {


            try (CSVReader reader = new CSVReader(new FileReader("C:\\btcwithbalance\\etherium_10part.csv"));

                 PreparedStatement prepare = connection.prepareStatement(CSV_TO_BD__Eth_10)) {
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

    public List<EtheriumWithBalance> findAll() {
        try (Connection connection = ConnectionManager.getPool();
             var preparedStatement = connection.prepareStatement(FIND_ALL_BALANCE_SQL_Eth_10)) {
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

    public static EtheriumDao10 getInstance() {
        return INSTANCE;
    }
}
