package p172io.clipworks.analytics;

/* renamed from: io.clipworks.analytics.ALEventSinkDemo */
public class ALEventSinkDemo extends ALEventSink {
    public void sinkEvent(ALEvent aLEvent) {
        System.out.println(aLEvent.getName());
    }
}
