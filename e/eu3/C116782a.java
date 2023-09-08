package eu3;

import zt3.C119146d;

/* renamed from: eu3.a */
public final class C116782a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Runnable f350103d;

    public C116782a(Runnable runnable) {
        this.f350103d = runnable;
    }

    public void run() {
        this.f350103d.run();
        C119146d.f356850b.mo174282c(Thread.currentThread(), Thread.currentThread().getName(), Thread.currentThread().getId());
    }
}
