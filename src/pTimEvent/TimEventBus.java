package pTimEvent;

import java.util.ArrayList;
import java.util.List;

public enum TimEventBus {

  INSTANCE;

  public static final List<IEventHandler> handlers = new ArrayList<>();

  public void registerHandler(IEventHandler handler) {
    handlers.add(handler);
  }

  public boolean unregisterHandler(IEventHandler handler) {
    return handlers.remove(handler);
  }

  public void publish(TimEvent evt) {

    for (IEventHandler h : handlers) {
      h.onEvent(evt);
    }
  }

}
