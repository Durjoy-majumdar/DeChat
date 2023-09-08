package eu3;

import zt3.C119146d;

/* renamed from: eu3.d */
public final class C116785d extends Thread {
    public C116785d(Runnable runnable, String str) {
        super(runnable, str);
    }

    public void interrupt() {
        super.interrupt();
        C97749e.f286750a.remove(Long.valueOf(getId()));
        C119146d.f356850b.mo174280a(this, getName(), getId());
    }

    public synchronized void start() {
        super.start();
        if (!C97749e.f286750a.contains(Long.valueOf(getId()))) {
            C97749e.f286750a.add(Long.valueOf(getId()));
        }
        C119146d.f356850b.mo174281b(this, getName(), getId());
    }
}
