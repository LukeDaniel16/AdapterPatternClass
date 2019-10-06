
public class Tomada_Client{
	
	public static void main(String args[]) {
		TomadaDeDoisPinos_Target t1 = new Tomada_Adapter();
		t1.LigarNaTomadaDeDoisPinos();
	}
}
