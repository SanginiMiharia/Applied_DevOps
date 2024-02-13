public class test{
	public int sum(int a , int b)
	{
		return(a+b);
	}
	public int diff(int c , int d)
    {
        return(c-d);
    }
	public static void main(String[] args) {
		
	test ob= new test();
		System.out.println(ob.sum(10,2));
        System.out.println(ob.diff(10,2));
		}
	}