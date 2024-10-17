package pro.testedetela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTextField;

public class conexao {

    public Connection getConnection() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/conexaoteste";  // URL do seu banco
            String user = "root";                                     // Usuário do banco
            String password = "";                                     // Senha do banco

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
        return connection;
    }

    // Método main para testar a conexão
    public static void main(String[] args) {
        conexao conn = new conexao();
        Connection connection = conn.getConnection();

        if (connection != null) {
            System.out.println("Conexão bem-sucedida!");
        } else {
            System.out.println("Falha na conexão.");
        }
    }
}