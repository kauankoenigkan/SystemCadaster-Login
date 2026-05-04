import java.sql.*;
import java.util.Scanner;

public class Cadaster
{
    public static void cadaster()
    {
        String url = "jdbc:mysql://localhost:3306/systemlogin";
        String user = "root";
        String password = "";

        Scanner scn = new Scanner(System.in);

        System.out.println("--------------------- CADASTRO ---------------------");

        System.out.println(" ");

        System.out.println("Nome Completo: ");
        String Nome = scn.nextLine();

        System.out.println("Email: ");
        String Email = scn.nextLine();

        System.out.println("Senha: ");
        String Senha = scn.nextLine();

        try
        {
            Connection mConn = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO clientes (nomeCLIENTE, emailCLIENTE, senhaCLIENTE) VALUES (?, ?, ?)";
            PreparedStatement dados = mConn.prepareStatement(sql);

            dados.setString(1, Nome);
            dados.setString(2, Email);
            dados.setString(3, Senha);

            int setor = dados.executeUpdate();

            if (setor > 0)
            {
                System.out.println("Cadastro realizado com sucesso, " + Nome);
            }
            else
            {
                System.out.println("Cadastro teve problemas...");
            }

            mConn.close();
        }
        catch (SQLException e)
        {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}