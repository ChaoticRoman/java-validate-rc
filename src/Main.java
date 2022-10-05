import java.util.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Zadej rodné číslo:");
            Scanner sc= new Scanner(System.in);
            String rc = sc.nextLine();
            validate_and_print(rc);
        }
        else {
            for (String rc: args) {
                validate_and_print(rc);
            }
        }

    }

    private static void validate_and_print(String rc) {
        if (ValidatorRC.validate(rc))
        {
            System.out.println(rc + " je OK.");
        }
        else
        {
            System.out.println(rc + " není OK.");
        }
    }
}