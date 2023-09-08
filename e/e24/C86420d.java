package e24;

import java.util.concurrent.ThreadFactory;

/* renamed from: e24.d */
public class C86420d implements ThreadFactory {

    /* renamed from: d */
    public final /* synthetic */ String f251211d;

    /* renamed from: e */
    public final /* synthetic */ boolean f251212e;

    public C86420d(String str, boolean z) {
        this.f251211d = str;
        this.f251212e = z;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f251211d);
        thread.setDaemon(this.f251212e);
        return thread;
    }
}
