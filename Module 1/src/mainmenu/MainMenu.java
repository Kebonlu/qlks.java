
package mainmenu;
import java.util.Scanner;

public class MainMenu {

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Dang nhap");
        System.out.println("2.Tao tai khoan");
        System.out.println("3.Thoat");
        int choice = 3;
        try
        {
            choice = scanner.nextInt();
        }catch (Exception e)
        {
            System.out.println("No may sai roi");
            System.exit(0);
        }

        switch (choice)
        {
            case 1 :
            {
                UserMainMenu.login();
            }
            case 2 :
            {
                UserMainMenu.register();
            }
            case 3 :
            {
                System.exit(0);
            }
        }
    }
}
