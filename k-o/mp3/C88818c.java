package mp3;

import kp3.C88253a;

/* renamed from: mp3.c */
public class C88818c extends C88819d {
    public C88818c() {
        C88253a.m109904c("Vending.NoLooperScheduler", "This is not a handler thread! %s", Thread.currentThread());
    }

    public void arrange(Runnable runnable) {
        C88253a.m109904c("Vending.NoLooperScheduler", "This is not a handler thread!", new Object[0]);
        runnable.run();
    }

    public void arrangeInterval(Runnable runnable, long j) {
        C88253a.m109904c("Vending.NoLooperScheduler", "This is not a handler thread!", new Object[0]);
        runnable.run();
    }

    public void cancel() {
    }

    public String getType() {
        return Thread.currentThread().toString();
    }
}
