package eu3;

import zt3.C119146d;

/* renamed from: eu3.c */
public final class C116784c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Runnable f350104d;

    public C116784c(Runnable runnable) {
        this.f350104d = runnable;
    }

    public void run() {
        this.f350104d.run();
        C119146d.f356850b.mo174282c(Thread.currentThread(), Thread.currentThread().getName(), Thread.currentThread().getId());
    }
}
