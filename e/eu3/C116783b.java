package eu3;

import zt3.C119146d;

/* renamed from: eu3.b */
public final class C116783b extends Thread {
    public C116783b(Runnable runnable, String str) {
        super(runnable, str);
    }

    public void interrupt() {
        super.interrupt();
        C119146d.f356850b.mo174280a(this, getName(), getId());
    }

    public synchronized void start() {
        super.start();
        C119146d.f356850b.mo174281b(this, getName(), getId());
    }
}
