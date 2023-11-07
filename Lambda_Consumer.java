import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda_Consumer
{
 
    public static void main(String args[])
    {
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(45);
        Arr.add(57);
        Arr.add(342);
        Arr.add(39);
        Consumer<Integer> Meth = (n) -> {System.out.println(n);};
        Arr.forEach(Meth);
    }
    
}
