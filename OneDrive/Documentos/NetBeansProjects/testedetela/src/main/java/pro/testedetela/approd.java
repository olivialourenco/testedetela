package pro.testedetela;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class approd {
    // Lista local para armazenar os produtos temporariamente
    private ArrayList<prod> listaproduto = new ArrayList<>();

    // Getters e Setters para a lista de produtos
    public ArrayList<prod> getListaproduto() {
        return listaproduto;
    }

    public void setListaproduto(ArrayList<prod> listaproduto) {
        this.listaproduto = listaproduto;
    }

    // Método para inserir produto tanto na lista local quanto no banco de dados
    public void insereproduto(prod p) {
        // Adiciona o produto à lista local
        listaproduto.add(p);

        // Variáveis para conexão com o banco e execução de query
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Obtém a conexão com o banco de dados através da classe de conexão
            conexao conexao = new conexao(); 
            conn = conexao.getConnection(); // Obtém o objeto Connection

            // Prepara o comando SQL para inserir os dados no banco
            String sql = "INSERT INTO produtos (nomeprod, quantidade, tipoprod) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);

            // Define os valores dos campos com os dados do objeto 'prod'
            stmt.setString(1, p.getNomeprodP());
            stmt.setString(2, p.getQuantidadeP());
            stmt.setString(3, p.getTipoprodP());

            // Executa a inserção no banco de dados
            stmt.executeUpdate();

            // Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Produto inserido no banco com sucesso!");

        } catch (SQLException e) {
            // Exibe mensagem de erro se algo der errado
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto no banco: " + e.getMessage());
        } finally {
            // Fecha a conexão e o statement para evitar vazamentos de memória
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }

    // Método para listar todos os produtos da lista local
    public String Listaprodutos() {
        String s = "";
        if (listaproduto.isEmpty()) {
            s = "Nenhum produto cadastrado.";
        } else {
            for (prod pe : listaproduto) {
                s = s + pe.status() + "\n-------------\n";
            }
        }
        return s;
    }
}