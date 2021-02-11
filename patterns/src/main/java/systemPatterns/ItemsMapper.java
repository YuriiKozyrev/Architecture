package systemPatterns;

import java.sql.*;

public class ItemsMapper {
    private final Connection connection;


    public ItemsMapper(Connection c) {
        this.connection = c;
    }

    public Item findItemById(int id) throws SQLException, RecordNotFoundException {
        String sql = String.format("SELECT id, title, price FROM items WHERE id = ?");
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        try(ResultSet resultSet = statement.executeQuery()){
            while(resultSet.next()){
                Item item = new Item(resultSet.getInt(1), resultSet.getString(2 ), resultSet.getInt(3));
                System.out.println("Достали из базы: " + item.getTitle());
                return item;
            }
        }
        throw new RecordNotFoundException(id);
    }

    public void insert(Item item) throws SQLException {
        int id = item.getId();
        String title = item.getTitle();
        int price = item.getPrice();
        String sql = String.format("INSERT INTO items (id, title, price) VALUES ('%s','%s','%s')", id, title, price);
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeUpdate();
    }

}
