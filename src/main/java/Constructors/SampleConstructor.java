package Constructors;

public class SampleConstructor {
	
    public SampleConstructor()
    {
        String a = "George";
        System.out.println(a);
    }
    public SampleConstructor(int b, String c)
    {
        System.out.println(b);
        System.out.println(c);
    }
    public void InstanceStringvalue(String d)
    {
        System.out.println(d);
    }    
    public void InstanceCharvalue(char e)
    {
        System.out.println(e);
    }
    public void StringChar(String f, String g)
    {
        System.out.println(f);
        System.out.println(g);
    }
    public static void main(String[] args)
    {
        SampleConstructor ob = new SampleConstructor(1000, "James");

        ob.InstanceStringvalue("Alvin");
        ob.InstanceCharvalue('A');
        ob.StringChar("India", "Kerala");

        SampleConstructor object = new SampleConstructor();
    }
}