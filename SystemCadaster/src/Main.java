import java.util.Scanner;

public class Main
{
    public static void main()
    {
        Scanner scn = new Scanner(System.in);
        int opcao = 0;

        while (true)
        {

            System.out.println("--------------------- MENU ---------------------");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastro");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = scn.nextInt();
            scn.nextLine();

            switch (opcao)
            {
                case 1:
                    System.out.println("Carregando login... ");
                    Login.login();
                    return;

                case 2:
                    System.out.println("Carregando Cadastro... ");
                    Cadaster.cadaster();
                    break;

                case 3:
                    System.out.println("Encerrando sistema... ");
                    scn.close();
                    return;

                default:
                    System.out.println("Número inválido.");
            }
        }
    }
}