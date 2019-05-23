package COMUN;

import java.rmi.Remote;

public interface itfPasarelaVisa extends Remote
{
	boolean RealizarPago(String numTarjetaCredito);
}
