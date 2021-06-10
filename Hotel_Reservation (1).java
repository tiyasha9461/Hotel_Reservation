import java.util.*;
class Hotel_Reservation
{
    Scanner sc=new Scanner (System.in);
    int days,room;
    boolean Type[];
    String date,gen,occp,add,pur,rname;
    String name="";
    int adults,child,no;
    double bill;
    boolean breakfast;
    public static void main(String args[])
    {
        System.out.println(" o     o          o             o       OOOOO                8    800000   0                         ");
        System.out.println(" 8     8        oo8oo           8       8    O               8    8      00800                       ");
        System.out.println("o8ooooo8  .opyo.  8     .opyo.  8       8    O  .opyo.  .opyo8    8_____   8     .opyo.    8 ooo                   ");
        System.out.println(" 8     8  8    8  8     8oooo8  8       8OOO'   8oooo8  8    8         8   8     8    8    8/   @   ");
        System.out.println(" 8     8  8    8  8     8       8       8   O   8       8    8         8   8  0  8    8 /  8           "); 
        System.out.println(" 8     8  `yoop'  8ooo  `yoop'  8ooo    8    O  `yoop'  `yoop8    000008   8000  `yoop'/   8         ");              
        System.out.println(" *************************************************************************************************");                                     
        Hotel_Reservation ob = new Hotel_Reservation();
        ob.input();
        ob.roomBook();
        ob.registration();
        ob.billCalc();
    }//end of voud main

    public void input()
    {
        System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("                             218,Vivekananda Road korea 700006");
        System.out.println("       Dear customers ,");
        System.out.println("       A warm welcome to our online booking friends,for the greatest hotels in calcutta,");
        System.out.println("       be you a native weekend tourist or an international tourist comming ");
        System.out.println("       to visit yhe famous monuments of India,be assured that we will take up the ");
        System.out.println("       responsibility of making your stay memorable one ");
        System.out.println("");
        System.out.println("       Do you want to book a room in our grand HOTEL RED STAR");
        System.out.println("       Please reply in yes or no: ");
        if((sc.nextLine()).equalsIgnoreCase("yes"))
        {
            System.out.println();
            System.out.println("   please state your date of visit (dd/mm/yyyy),and the number of days you intend to stay ");
            System.out.println("   Date:");
            date="/t"+sc.nextLine();
            System.out.println("   Number of days");
            days=sc.nextInt();
        }
        else
            System.exit(0);
    }//end of void input

    public void roomBook()
    {
        boolean King[]=new boolean[5];
        boolean Queen[]=new boolean[5];
        boolean AC[]=new boolean[15];
        boolean Non[]=new boolean[15];
        King=randomFiller(King);
        Queen=randomFiller(Queen);
        AC=randomFiller(AC);
        Non=randomFiller(Non);
        int fl=0;
        while(fl!=1)
        {
            System.out.println("Please select the type of room you prefer");
            System.out.println("1:King Suite ");
            System.out.println("2:Queen Suite");
            System.out.println("3:Ac deluxe ");
            System.out.println("4:Non Ac deluxe ");
            System.out.println("Enter your choise to view: ");
            int ch=sc.nextInt();
            boolean tmp;
            switch(ch)
            {
                case 1: tmp= RoomDescript.King();
                if(tmp)
                {
                    Type= King;
                    rname="King Suite";fl=1;
                }
                break;
                case 2:tmp=RoomDescript.Queen ();
                if(tmp)
                {
                    Type=Queen;
                    rname="Queen Suite ";fl=1;
                }
                break;
                case 3:tmp=RoomDescript.AC();
                if(tmp)
                {
                    Type=AC;
                    rname="AC Duluxe";fl=1;
                }
                break;
                case 4:tmp=RoomDescript.Non();
                if(tmp)
                {
                    Type=Non ;
                    rname="Nom AC Deluxe";fl=1;
                }
                break;
                default:System.out.println("INPUT IS INVALID !!!PLEASE RE ENTER YOUR CHOISE .");
                roomBook();
            }//end of switch
        }//end of while()
        String bed="double";
        if(rname.equals("AC Deluxe")||rname.equals("Non AC deluxe"))
        {
            System.out.println("Single bed or double ?");
            sc.nextLine();
            bed =sc.nextLine();
        }
        System.out.println("checking for room availity.............");
        for(int i=0;i<1;i++)
            System.out.println("DONE!");
        int cn;
        System.out.println("Rooms available");
        for(int i=0;i<Type.length;i++)
        {
            if(bed.equalsIgnoreCase("Single")||bed.equalsIgnoreCase("single bed"))
            {
                if (Type[i]==true&&i<=(Type.length/2))
                {
                    System.out.println("ROOM "+(i+1));
                    room=i;
                }
            }
            else if ( bed.equalsIgnoreCase("double")||bed.equalsIgnoreCase("double bed"))
            {
                if(Type[i]==true&&i<=(Type.length/2))
                {
                    System.out.println("ROOM "+(i+1));
                    room=i;
                }//end of if
            }//end of else if
        }//end of for
        System.out.println("we have assigned a room"+(room+1)+" for you");
        System.out.println("Let us now proceed towards registration");
    }//end of roombook()

    public boolean[] randomFiller(boolean A[])
    {
        for (int i=0;i<A.length;i++)
        {
            int  rand =(int)(Math.random()+0.5);
            if(rand==1)
                A[i]=true;
            else if (rand==0)
                A[i]=false;
        }//end of randomFiller()
        return A;
    }

    void registration()
    {
        System.out.println ();
        System.out.println ("__________________________________________________");
        System.out.println ("REGISTRATION");
        System.out.println ("__________________________________________________");
        System.out.println ("Name: ");
        name=sc.nextLine();
        System.out.println ("GENDER: ");
        gen=sc.nextLine();
        System.out.println ("RESIDENTIAL ADDERESS: ");
        add=sc.nextLine();
        System.out.println ("OCCUPATION: ");
        occp=sc.nextLine();
        System.out.println ("purpose of visit: ");
        pur=sc.nextLine ();
        System.out.println(" Number of rooms booked: ");
        no=sc.nextInt ();
        System.out.println ("Total number of adults: ");
        adults=sc.nextInt();
        System.out.println ("Total number of children (below 18): ");
        child=sc.nextInt();
        System.out.println ("       :::::THANK YOU::::::");
        System.out.println ("Do you want to have complementary breakfast(yes/no) ");
        sc.nextLine();
        String bk=sc.nextLine ();
        breakfast=bk.equalsIgnoreCase("yes");
    }//end of void registration()

    public void billCalc()
    {
        int rate=0;
        if (rname.equals("KING SUITE"))
            rate=8000;
        else if(rname.equals("QUEEN SUITE"))
            rate=5000;
        else if (rname.equals("AC DELUXE"))
            rate=3000;
        else if (rname.equals("NON-AC DELUXE"))
            rate =2500;
        int add=0,rent=rate*days;
        if (adults>(no*2))
            add=200*days;
        if (child>(no))
            add+=100*days;
        if (breakfast) 
        {
            add+=days*(adults+child)*200;
        }
        int gross =rent+add;
        display(gross);
    }//end of void billCalc()

    void display(int n)
    {
        System.out.println ();
        System.out.println ("_____________________________________________ ");
        System.out.println ("|             ___                           | ");
        System.out.println ("|            |___) * |   |                  |");
        System.out.println ("|            |___) | |__ |__                |");
        System.out.println ();
        System.out.println ("|          -------------------              |");
        System.out.println ("|             HOTEL RED STAR                |");
        System.out.println ("|          -------------------              |");
        System.out.println ();
        System.out.println ("|  Room type:              "+rname+"        |");
        System.out.println ("|  Room number:            "+room+"         |");
        System.out.println ("|  Customer name:          "+name+"         |");
        System.out.println(" |  Gender:                 "+gen+"          |");
        System.out.println ("|  Total number of people: "+(adults+child)+"|");
        System.out.println ("|  Date of check_in:       "+date+"         |");
        System.out.println ("|  Days Stayed:            "+days+"         |");
        System.out.println ();
        System.out.println ("|  Gross amount:           "+n+"            |");
        double servtax=(5.0/100)*n;
        double vat=(14.5/100)*(servtax+n);
        bill =(servtax+vat+n);
        System.out.println ("|  Taxes=                   "+vat+"         |");
        System.out.println ("|  Net amount=              "+bill+"        |");
        System.out.println ("_____________________________________________");
        System.out.println ();
        System.out.println ("      PLease enter the mode of payment: ");
        String mode =sc.nextLine ();
        System.out.println("             ******THANK YOU******");
    }//end of void Display()
}//end of class
class RoomDescript
{
    /**
     *will contain the discription of the rooms.When the usre inputs his or her choice,a discription will 
    be available,which will be accessable through this class
     */
    static Scanner sc=new Scanner (System.in);
    static boolean King()
    {
        boolean a=false;
        System.out.println ("KING SUITE");
        System.out.println ("");
        System.out.println ("The king suite is for the very best of our guest.With our world class");
        System.out.println ("features ,and excellent room decorations ,this suite is nothing sort of ");
        System.out.println ("perfection ,which is desired by many.the room is spaceous and the ");
        System.out.println ("cosiness of it makes one fee at home,albeit a more comfortable and the ");
        System.out.println ("more excqisite one .We assure you that if this shall be your choice,you ");
        System.out.println ("shall regrect the of your departure.");
        System.out.println ("");
        System.out.println ("FEATURES");
        System.out.println ("^^^^^^^^^");
        System.out.println ("");
        System.out.println (">More than 350x200 ft.room ,large,spacy and comfortable");
        System.out.println (">A gigantic double-bed,with Spektron-technology custom made");
        System.out.println ("sleep well mattress for a good night's sleep");
        System.out.println (">Air conditioned with 2 split ac's");
        System.out.println (">42, inches Samsung Smart TV");
        System.out.println (">two large sofas,a bedside table and a coffee table ");
        System.out.println (">A long balcony with a stunning view of Juche Tower,as well as the rest of Pyongyang");
        System.out.println (">A mini bar with an assortment for the finest elixirs of Korea");
        System.out.println (">A huge bathroom,fit for a king.");
        System.out.println ("");
        System.out.println ("The cost for this room (exclusive of all taxes) is = Rs.8000/day");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("Do you want to choose this type?");
        System.out.println ("Enter 'yes' to book,or 'no' to go back to the menu: ");
        if (sc.nextLine().equalsIgnoreCase("yes"))
            a=true;
        System.out.println ("");
        return a;
    }//end of static boolean King()

    static boolean Queen()
    {
        boolean a=false;
        System.out.println ("QUEEN SUITE");
        System.out.println ("");
        System.out.println ("The queen suite has an extraordinary touch of comfort.The features available ");
        System.out.println ("are generally associated with cosy lifestyle .The rooms are made such made");
        System.out.println ("that we assure you that you shall have no problem in blending with it ");
        System.out.println ("the feel of it .The atmosphere created by this room is calm and ");
        System.out.println ("peacefull one ,in contrast to the loudness of King Suite ,if a quite stay you dersir");
        System.out.println ("we take the pleasure in welcoming you to the grandeure of this room .");
        System.out.println ("");
        System.out.println ("FEATURES");
        System.out.println ("^^^^^^^^^");
        System.out.println ("");
        System.out.println (">320x220 ft. room cosy with a home made feeling .");
        System.out.println (">A perfectly home-like double bed,with a plush Kamarov-protocol ");
        System.out.println ("custom made mattress.");
        System.out.println (">Air conditioner ,with a Split ac and a bed Side Ac");
        System.out.println (">42, inches Samsung Smart TV");
        System.out.println (">two large sofas and a bedside table ");
        System.out.println (">A long balcony with a stunning view of Juche Tower,as well as the rest of Pyongyang");
        System.out.println (">A mini bar with vintage wine of Korea");
        System.out.println (">A cosy marble and Graphite bathroom");
        System.out.println ("");
        System.out.println ("The cost for this room (exclusive of all taxes) is = Rs.5000/day");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("Do you want to choose this type?");
        System.out.println ("Enter 'yes' to book,or 'no' to go back to the menu: ");
        if (sc.nextLine().equalsIgnoreCase("yes"))
            a=true;
        System.out.println ("");
        return a;
    }//end of static boolean Queen()

    static boolean AC()
    {
        boolean a=false;
        System.out.println (" A/C Deluxe");
        System.out.println ("");
        System.out.println ("The A/c Deluxe is the standard room for our hotel with an affordable ");
        System.out.println ("price and unbelievable comport .The room will exceed your ");
        System.out.println ("expectation .The ambience is a very tourist friendly one .");
        System.out.println ("The room will surely make your stay at Hotel Red Star a very memorable one.");
        System.out.println ("");
        System.out.println ("FEATURES");
        System.out.println ("^^^^^^^^^");
        System.out.println ("");
        System.out.println ("> 200x150 ft. room fully air conditioned .");
        System.out.println ("> Choice of a single or double bed ,with a sofa and comfortable mattress.");
        System.out.println ("> A 32 inch Samsung smart LED TV. ");
        System.out.println ("> Alarge balcony with spectacular view of Pyongyang.");
        System.out.println ("> A well furnished bathroom .");
        System.out.println ("");
        System.out.println ("The cost of this room (Exclusive of all taxes)is = Rs.3000/day");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("Enter 'yes' to book,or 'no' to go back to the menu: ");
        if (sc.nextLine().equalsIgnoreCase("yes"))
            a=true;
        System.out.println ("");
        return a;
    }//end of static boolean AC()

    static boolean Non()
    {
        boolean a=false;
        System.out.println (" Non A/C Deluxe");
        System.out.println ("");
        System.out.println ("Don't like canned air?Feeling natural ? Don't worry Hotel Red Star ");
        System.out.println ("Offers you a special Non A/C Deluxe suite with open windows to enjoy ");
        System.out.println ("the scenic beauty of Korea.The air here is as fresh as it can it be and the ");
        System.out.println ("natural way of life will surely make you feel like a part of Korea.");
        System.out.println ("");
        System.out.println ("FEATURES");
        System.out.println ("^^^^^^^^^");
        System.out.println ("");
        System.out.println ("> 150x150 ft. room .");
        System.out.println ("> Choice of a single or double bed ,with a sofa ,comfortable mattress ,central table .");
        System.out.println ("> A 32 inch Samsung LED TV. ");
        System.out.println ("> A large balcony with spectacular view of Pyongyang.");
        System.out.println ("> A well-furnished bathroom .");
        System.out.println ("");
        System.out.println ("The cost of this room (Exclusive of all taxes)is = Rs.2500/day");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("Enter 'yes' to book,or 'no' to go back to the menu: ");
        if (sc.nextLine().equalsIgnoreCase("yes"))
            a=true;
        System.out.println ("");
        return a;
    }//end of static boolean non() 
} //end of class