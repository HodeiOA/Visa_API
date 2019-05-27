package COMUN;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;

public class clsMain
{

	public static void main(String[] args)
	{
		String IP = "127.0.0.1";
		String Puerto = "1095";
		String NombreServicio = "Visa";
		
		if (System.getSecurityManager() == null)
		{
			System.setSecurityManager(new SecurityManager());
		}

		String name = "//" + IP + ":" + Puerto + "/" + NombreServicio;
		
		try {		
			itfPasarelaVisa objServer = new clsVisa();
			Registry registry = LocateRegistry.createRegistry((Integer.valueOf(Puerto)));
			//Naming.rebind(name, objServer);
			registry.rebind(name, objServer);
			System.out.println("* Server '" + name + "' active and waiting...");
		} catch (Exception e) {
			System.err.println("- Exception running the server: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
