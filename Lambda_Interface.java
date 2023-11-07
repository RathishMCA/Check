


// /**
//  * StringInterface

//  */
// interface StringFun
// {
//     String ran(String str);
// }


// class Lambda_Interface
// {
//     public static void main(String[] args)
//     {
//         StringFun first = (s) -> s + "!";
//         StringFun second = (s) -> s + "?";
//         PrintFormat("Rathish", first);
//         PrintFormat("Kumar", second);

//     }

//     public static void PrintFormat( String frst, StringFun scnd )
//     {
//         String Print = scnd.ran(frst);
//         System.out.println(Print);
//     }
// }

/**
 * Lambda_Interface
 */
interface StringInter
{
    String Inter(String str);
}

class Lambda_Interface
{
    public static void main (String[] args)
    {
        StringInter First = (f)-> f + " Kumar";
        StringInter Second = (s) -> s + " Shabharis";
        PrintState("Rathish", First);
        PrintState("Siva", Second);


    }

    public static void PrintState(String str, StringInter Iface)
    {
        String Print = Iface.Inter(str);
        System.out.println(Print);
    }
}

