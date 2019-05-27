package COMUN;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import APIs.itfPasarelaVisa;

public class clsVisa extends UnicastRemoteObject implements itfPasarelaVisa
{
	ArrayList<String> lTarjetas;

	public clsVisa() throws RemoteException
	{
		lTarjetas = new ArrayList<String>();
		lTarjetas.add("123456789");
		lTarjetas.add("987654321");
		lTarjetas.add("456123789");
	}

	@Override
	public boolean RealizarPago(String numTarjetaCredito) throws RemoteException
	{
		if(lTarjetas.contains(numTarjetaCredito))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
