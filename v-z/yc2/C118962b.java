package yc2;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import yc2.C118965e;

/* renamed from: yc2.b */
public class C118962b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f356339d;

    /* renamed from: e */
    public final /* synthetic */ View f356340e;

    /* renamed from: f */
    public final /* synthetic */ List f356341f;

    /* renamed from: g */
    public final /* synthetic */ boolean[] f356342g;

    /* renamed from: h */
    public final /* synthetic */ C118965e f356343h;

    public C118962b(C118965e eVar, int i, View view, List list, boolean[] zArr) {
        this.f356343h = eVar;
        this.f356339d = i;
        this.f356340e = view;
        this.f356341f = list;
        this.f356342g = zArr;
    }

    public void run() {
        C118965e eVar = this.f356343h;
        int i = this.f356339d;
        View view = this.f356340e;
        List list = this.f356341f;
        Iterator it = ((ConcurrentLinkedQueue) eVar.f356374a).iterator();
        while (it.hasNext()) {
            ((C118965e.C118974g) it.next()).mo183638b(i, view, list);
        }
        synchronized (this.f356342g) {
            boolean[] zArr = this.f356342g;
            zArr[0] = true;
            zArr.notifyAll();
        }
    }
}
