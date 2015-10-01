package pTimEvent;

public class TimEvent {

  public enum Tag {
    LIST, CLIENT_SHUTDOWN, INFO, SENDFILE, SENDRUNNER, FILELIST, GUIFILELIST;
  }

  private final Tag tag;
  private final Object obj;

  public TimEvent(Tag tag, Object obj) {
    this.tag = tag;
    this.obj = obj;
  }

  public Object getObject() {
    return obj;
  }

  public Tag getTag() {
    return tag;
  }

  @Override
  public String toString() {
    return String.format("TimEvent: [%s <--> %s]", tag, obj);
  }

}
