package kn0;

/* renamed from: kn0.i */
public class C21363i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C21365k f60434d;

    public C21363i(C21365k kVar) {
        this.f60434d = kVar;
    }

    public void run() {
        synchronized (this.f60434d) {
            this.f60434d.mo33466M();
            this.f60434d.notifyAll();
        }
    }
}
