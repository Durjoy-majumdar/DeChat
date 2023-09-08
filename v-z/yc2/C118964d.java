package yc2;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import yc2.C118965e;

/* renamed from: yc2.d */
public class C118964d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Throwable f356349d;

    /* renamed from: e */
    public final /* synthetic */ boolean[] f356350e;

    /* renamed from: f */
    public final /* synthetic */ C118965e f356351f;

    public C118964d(C118965e eVar, Throwable th, boolean[] zArr) {
        this.f356351f = eVar;
        this.f356349d = th;
        this.f356350e = zArr;
    }

    public void run() {
        C118965e eVar = this.f356351f;
        Throwable th = this.f356349d;
        Iterator it = ((ConcurrentLinkedQueue) eVar.f356374a).iterator();
        while (it.hasNext()) {
            ((C118965e.C118974g) it.next()).onError(th);
        }
        synchronized (this.f356350e) {
            boolean[] zArr = this.f356350e;
            zArr[0] = true;
            zArr.notifyAll();
        }
    }
}
