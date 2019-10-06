
public class Tomada_Adapter extends TomadaDeTresPinos_Adaptee
implements TomadaDeDoisPinos_Target {
	public void LigarNaTomadaDeDoisPinos() {
		LigarNaTomadaDeTresPinos();
	}
}
