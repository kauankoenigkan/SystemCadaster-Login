import java.sql.*;
import java.util.Scanner;

public class Login
{
    public static void login()
    {
        String url = "jdbc:mysql://localhost:3306/systemlogin";
        String user = "root";
        String password = "";

        Scanner scn = new Scanner(System.in);
        int tentativas = 0;

        while (tentativas < 3)
        {
            System.out.println("--------------------- LOGIN DO BANCO ---------------------");

            System.out.println(" ");

            System.out.println("Email: ");
            String Email = scn.nextLine();

            System.out.println("Senha: ");
            String Senha = scn.nextLine();

            try
            {
                Connection mConn = DriverManager.getConnection(url, user, password);

                String sql = "SELECT * FROM clientes WHERE emailCLIENTE = ? AND senhaCLIENTE = ?";
                PreparedStatement dados = mConn.prepareStatement(sql);

                dados.setString(1, Email);
                dados.setString(2, Senha);

                ResultSet rs = dados.executeQuery();

                if (rs.next())
                {
                    String nomeCompleto = rs.getString("nomeCLIENTE");

                    System.out.println(" ");
                    System.out.println("Login Bem sucedido!");
                    System.out.println("Seja bem-vindo(a) " + nomeCompleto);
                    break;
                }
                else
                {
                    tentativas++;
                    System.out.println("Dados incorretos!");

                    if (tentativas == 3)
                    {
                        System.out.println(" ");
                        System.out.println("Muitas tentivas incorretas. Login bloqueado.");
                    }
                }
                mConn.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}