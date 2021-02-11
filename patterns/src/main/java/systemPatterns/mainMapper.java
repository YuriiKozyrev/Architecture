package systemPatterns;

import java.sql.*;

public class mainMapper {

    private static Connection connection;
    private static Statement stmt;
    private static ItemIdentityMap iim;



    public static void main(String[] args) throws SQLException, RecordNotFoundException {

       iim = new ItemIdentityMap();

        try {
            connect();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Вывели 1-й раз: " + findById(1).getTitle() + "\n");
        System.out.println("Вывели 2-й раз: " + findById(1).getTitle());

        disconnect();
        
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:stuff.db");
        stmt = connection.createStatement();
    }

    public static void disconnect() throws SQLException {
            connection.close();
    }

    public static Item findById(int id) throws SQLException, RecordNotFoundException {
        Item item;
        try{
            item = iim.getItem(id);
            if (item == null) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e){
            System.out.println("Лезем в базу");
            ItemsMapper itemsMapper = new ItemsMapper(connection);
            item = itemsMapper.findItemById(id);
            iim.addItem(item);
        }
        return item;
    }

}
