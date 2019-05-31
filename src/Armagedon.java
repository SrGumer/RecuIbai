
public class Armagedon {

	static class Muerte{
		String nombre = "Muerte";
		public Muerte() {super();};
		public String Invocar() {return "El fin se acerca, soy: ";};
	}
	
	static class Guerra{
		String nombre = "Guerra";
		public Guerra() {super();};
		public String Invocar() {return "El fin se acerca, soy: ";};
	}
	
	static class Peste{
		String nombre = "Peste";
		public Peste() {super();};
		public String Invocar() {return "El fin se acerca, soy: ";};
	}
	
	static class Hambre{
		String nombre = "Hambre";
		public Hambre() {super();};
		public String Invocar() {return "El fin se acerca, soy: ";};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Muerte jinete1 = new Muerte();
		Guerra jinete2 = new Guerra();
		Peste jinete3 = new Peste();
		Hambre jinete4 = new Hambre();
		System.out.print(jinete1.Invocar());
		System.out.println(jinete1.Invocar());
		System.out.print(jinete2.Invocar());
		System.out.println(jinete2.Invocar());
		System.out.print(jinete3.Invocar());
		System.out.println(jinete3.Invocar());
		System.out.print(jinete4.Invocar());
		System.out.println(jinete4.Invocar());
	}

}
