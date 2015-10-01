package pSimonGenerell;

import de.root1.simon.SimonRemote;
import de.root1.simon.exceptions.SimonRemoteException;


public interface ITimRunner extends SimonRemote , Runnable{

    public void run() throws SimonRemoteException;
}
