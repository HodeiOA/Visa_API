package COMUN;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface itfPasarelaVisa extends Remote
{
	boolean RealizarPago(String numTarjetaCredito) throws RemoteException;
}
