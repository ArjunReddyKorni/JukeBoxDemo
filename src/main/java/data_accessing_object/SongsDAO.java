package data_accessing_object;

import utility.DB_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SongsDAO {

    public String getPathOfTheSong(int songId) throws SQLException, ClassNotFoundException {

        
        Connection connection = DB_connection.getConnection();
        String sql = "SELECT songPath from songs where songId = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, songId);
        ResultSet resultSet = preparedStatement.executeQuery();
        String songPath = null;
        if (resultSet.next()) {
            songPath = resultSet.getString(1);
        }

        return songPath;
    }


}
