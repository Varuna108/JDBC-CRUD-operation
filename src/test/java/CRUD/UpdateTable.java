package CRUD;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
    DBWorker worker = new DBWorker();

    @Test
    void insertTable() {
        String query = "UPDATE group_list SET group_footer='DualFates' WHERE group_id=2;";
        try {
            Statement statement = worker.getConnection().createStatement();
            statement.executeUpdate(query);
            worker.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
