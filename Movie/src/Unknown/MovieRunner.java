package Unknown;

public class MovieRunner {

	public static void main(String[] args) {
		Auditor1 a = new Auditor1();
		System.out.println(a.adharNo);
		System.out.println("\n");
		
		Company z =a.a;
		System.out.println(z.name);
		System.out.println(z.location);
		System.out.println("\n");
		
		Producer run = z.b;
		System.out.println(run.budget);
		System.out.println(run.mobilNo);

}
}
