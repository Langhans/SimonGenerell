package pSimonGenerell;



import de.root1.simon.SimonRemote;
import de.root1.simon.exceptions.SimonRemoteException;




public interface ITimServer extends SimonRemote{
    
    
   public boolean login (IClientCallBack client ) throws SimonRemoteException;

    public void submitRunnable( Runnable r ) throws SimonRemoteException;
    
    public byte[] serveFile( String filename ) throws SimonRemoteException;
    
    public String[] listFiles() throws SimonRemoteException;
    
}