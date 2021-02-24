package CRUD;

import Data.GroupList;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTable {

    @Test
    void viewTable() {
        DBWorker worker = new DBWorker();

        String query = "SELECT * FROM group_list";
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                GroupList groupList = new GroupList();
                groupList.setGroupId(resultSet.getInt("group_id"));
                groupList.setGroupName(resultSet.getString("group_name"));
                groupList.setGroupHeader(resultSet.getString("group_header"));
                groupList.setGroupFooter(resultSet.getString("group_footer"));
                System.out.println(groupList);
            }
            worker.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
