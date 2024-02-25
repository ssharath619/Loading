import java.util.Scanner;
class Weekend{
    public static void main(String args[]){
        Scanner ab=new Scanner(System.in);
        System.out.println("enter the day name");
        String nm=ab.nextLine();
        switch(nm){
            case "Monday" :
            case "tueday" :
            case "wedday" :
            case "thuday" :
            case "Friday" :
                        System.out.println("its a working day");
                        break;
            case "sunday" :
            case "satday" :  
                        System.out.println("its a holiday");          
        }
    }
}