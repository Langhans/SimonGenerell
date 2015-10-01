package pSimonGenerell;

import java.io.Serializable;

public class TimRunner implements Runnable, Serializable, ITimRunner {

  /**
  * just a quickly programmed Runnable for testing the possibility to run 
  * Runnables from the client remotely on the server.  
  */
  private static final long serialVersionUID = 916258995836680538L;

  public TimRunner() {
  }

  @Override
  public void run() {

    int count = 0;
    while (count < 10) {
      System.out.println("TIMRUNNER RUNNING!");
      count++;
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

  }
}
