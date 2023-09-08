package nr3;

import mp3.C88819d;

/* renamed from: nr3.d */
public class C89058d extends C88819d {
    public void arrange(Runnable runnable) {
        runnable.run();
    }

    public void arrangeInterval(Runnable runnable, long j) {
        runnable.run();
    }

    public void cancel() {
    }

    public String getType() {
        return "WxNoLooperScheduler";
    }
}
