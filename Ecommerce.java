import java.util.*;
public class Ecommerce {

    /**
     * @param args the command line arguments
     */
    public static Scanner in = new Scanner (System.in);
    public static int a, choice, total;
    public static String username, userpass, input, pass, name, contact;
    public static boolean status = true;
    public static void main(String[] args) 
    {
        mainfunct();
    }
    public static void mainfunct()
    {
        System.out.println("\n\n[1] Log in\n[2] Sign Up\n");
        a = in.nextInt();
        if (a == 1)
        {
            login();
        }
        if (a == 2)
        {
            signup();
        }
        login();
        signup();
        homepage();
        shoplist();
        addcart();
        
    }
    public static void login()
    {
        status = true;
        while(status)
        {
        System.out.println("\n\nLogin");
        
        for (int a = 0; a <= 1; a++)
        {
            System.out.println("\nEnter Username:");
            input = in.next();
            System.out.println("\nEnter Password:");
            pass = in.next();
            
            if (input.equals(username) && pass.equals(userpass))
            {
                System.out.println("Welcome" + username);
                System.out.println("Welcome" + name);
                System.out.println("Welcome" + contact);
                ;
                
                System.out.println("[1]Home Page \n"+
                                   "[2]Shop List \n"+
                                   "[3]Add Cart  \n");
                choice = in.nextInt();
                if (choice == 1)
                {
                    homepage();
                }
                if (choice == 2)
                {
                    shoplist();
                }
                if (choice == 3)
                {
                    addcart();
                }
                
                System.out.println("[1] Keyboard.....195\n"+
                                   "[2] Mouse........299\n"+
                                   "[3] Monitor......399\n");
                status = false;
            }
            else 
            {
                System.out.println("Invalid Credentials");
                status = true;
                mainfunct();
                a++;
                if (a > 1)
                {
                    System.out.println("Login Invalid");
                }
            }
        }
    }
    }
    public static void signup()
    {
        status = true;
        
        System.out.println("\nSign Up");
        System.out.println("\nComplete the details below");
        System.out.println("\nFull Name");
        name = in.next();
        System.out.println("\nFull Contact");
        contact = in.next();
        System.out.println("\nUsername");
        username = in.next();
        System.out.println("\nUserpass");
        userpass = in.next();
        mainfunct();
        
    }
    public static void homepage()
    {
        
    }
    public static void shoplist()
    {
        total = 0;
        System.out.println("[1] Keyboard.....199\n"+
                                         "[2] Mouse........299\n"+
                                         "[3] Monitor......399\n");
                                         
                                         
                                   
                switch (choice) 
                {
                	case 1:
                	total = 199;
                	System.out.println("You add to card keyboard with the price of 199");
                	break;
                	case 2:
                	total = 299;
                	System.out.println("You add to card Mouse with the price of 299") ;
                	break;
                	case 3:
                	total = 399;
                	System.out.println("You add to card Monitor with the price of 299") ;                        break;
                 }
    }
    public static void addcart()
    {
        
    }

    
}