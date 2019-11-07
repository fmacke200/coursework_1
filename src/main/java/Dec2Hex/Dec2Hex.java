package Dec2Hex;

import java.util.logging.Level;
import java.util.logging.Logger;

class Dec2Hex
{

    private static int arg1;
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static void main(String[] args)
    {
        if (args.length > 0)
        {
            try
            {
                arg1 = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException e)
            {
                logger.log(Level.SEVERE, "Argument " +args[0] + " must be an integer", e);
                System.exit(1);
            }
            String hexadecimal = dec2Hex(arg1);
            logger.log(Level.INFO, "Hexadecimal representation is: "+hexadecimal);
        } else {
            logger.log(Level.SEVERE, "An integer argument must be provided.");
            System.exit(1);
        }


    }

    static String dec2Hex(int arg){
        arg1 = arg;
        char[] ch ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        int num;
        num = arg1;
        StringBuilder hexadecimal= new StringBuilder();
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal.insert(0, ch[rem]);
            num= num/16;
        }

        return hexadecimal.toString();
    }
}
