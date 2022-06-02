package dao;

import entity.Keyz2;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Keyz2Dao {

    private static final Keyz2Dao INSTANCE = new Keyz2Dao();

    private
    Keyz2Dao() {
    }

    public static final String FIND_ALL_SQL = """
    select id,
    keys 
    from Keyz2; 
""";

    public List<Keyz2> findAll() {
        try (Connection connection = ConnectionManager.getPool();
             var preparedStatement = connection.prepareStatement(FIND_ALL_SQL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Keyz2> keyz2 = new ArrayList<>();
            while (resultSet.next()) {
                keyz2.add(buildKeyz2(resultSet));
            }
            return keyz2;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Keyz2 buildKeyz2(ResultSet resultSet) throws SQLException {
        return new Keyz2(
                resultSet.getLong("id"),
                resultSet.getString("keys"));
    }




    public static Keyz2Dao getInstance() {
        return INSTANCE;
    }
}
