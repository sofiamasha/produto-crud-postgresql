package CrudJava;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        try {

            String url = "jdbc:postgresql://localhost:5432/crudjava";
            String user = "ti2cc";
            String password = "ti@cc*";

            Connection conn = DriverManager.getConnection(url, user, password);

            return conn;

        } catch (Exception e) {
            System.out.println("Erro na conexão");
            e.printStackTrace();
            return null;
        }
    }
}

