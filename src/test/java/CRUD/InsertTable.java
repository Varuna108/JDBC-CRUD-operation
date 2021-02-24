package CRUD;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
    DBWorker worker = new DBWorker();

    @Test
    void insertTable() {
        String query = "INSERT INTO group_list (group_id, deprecated, group_name, group_header, group_footer) " +
                "VALUES (2, CURRENT_TIMESTAMP, 'Hello, there!', 'General Kenobi!', 'StarWars_Meme')";
        try {
            Statement statement = worker.getConnection().createStatement();
            statement.execute(query);
            worker.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

