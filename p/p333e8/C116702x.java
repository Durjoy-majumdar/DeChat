package p333e8;

import java.util.concurrent.ThreadFactory;

/* renamed from: e8.x */
public final class C116702x implements ThreadFactory {

    /* renamed from: d */
    public final /* synthetic */ String f350018d;

    public C116702x(String str) {
        this.f350018d = str;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f350018d);
    }
}
