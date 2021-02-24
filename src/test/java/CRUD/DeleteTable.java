package CRUD;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTable {
    DBWorker worker = new DBWorker();

    @Test
    void insertTable() {
        String query = "DELETE FROM group_list WHERE group_id=2;";
        try {
            Statement statement = worker.getConnection().createStatement();
            statement.executeUpdate(query);
            worker.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
