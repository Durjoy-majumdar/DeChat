package k11;

import di3.C86312j;
import gy3.C8479f0;
import ht1.C76243a5;

/* renamed from: k11.o */
public final class C108821o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108809b f325860d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<Runnable> f325861e;

    public C108821o(C108809b bVar, C8479f0<Runnable> f0Var) {
        this.f325860d = bVar;
        this.f325861e = f0Var;
    }

    public final void run() {
        if (this.f325860d.f325822f[5]) {
            ((C76243a5) C86312j.m106911c(C76243a5.class)).U80();
        }
        Runnable runnable = (Runnable) this.f325861e.f27484d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
