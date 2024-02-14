package winterpep_github;
// Lecture 24 - Creating Database Enabled Applications

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class lecture24 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost/booksdb";
            Connection conn = DriverManager.getConnection(connectionUrl, "root", "Vaibhav@+=1");
            int bid = 102;
            String bookTitle = "Sql essentials";
            String author = "Jerry Rig";
            int price = 295;
            String insertQuery = "insert into books Values(101,'jdk by Wrox','ivor horton',750)";
            Statement stmt = conn.createStatement();
            stmt.execute(insertQuery);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//        create database booksdb;
//        use booksdb;
//        create table books(
//        book_id int primary key,
//        title varchar(255),
//        author varchar(255),
//        price int);
//
//        select * from books;
