package dao;

import entity.Keyz;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KeyzDao {

    private static final KeyzDao INSTANCE = new KeyzDao();

    private
    KeyzDao() {
    }

    public static final String FIND_ALL_SQL = """
    select id,
    keys 
    from Keyz; 
""";

    public List<Keyz> findAll() {
        try (Connection connection = ConnectionManager.getPool();
        var preparedStatement = connection.prepareStatement(FIND_ALL_SQL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Keyz> keyz = new ArrayList<>();
            while (resultSet.next()) {
                keyz.add(buildKeyz(resultSet));
            }
            return keyz;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Keyz buildKeyz(ResultSet resultSet) throws SQLException {
        return new Keyz(
        resultSet.getLong("id"),
        resultSet.getString("keys"));
    }


    public static KeyzDao getInstance() {
        return INSTANCE;
    }
}
