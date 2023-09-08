package eu3;

import android.os.HandlerThread;
import java.util.concurrent.ConcurrentLinkedQueue;
import zt3.C119146d;

/* renamed from: eu3.e */
public class C97749e {

    /* renamed from: a */
    public static ConcurrentLinkedQueue<Long> f286750a = new ConcurrentLinkedQueue<>();

    /* renamed from: eu3.e$a */
    public static class C97750a extends HandlerThread {
        public C97750a(String str) {
            super(str);
        }

        public void interrupt() {
            super.interrupt();
            C119146d.f356850b.mo174280a(this, getName(), getId());
        }

        public boolean quit() {
            C119146d.f356850b.mo174280a(this, getName(), getId());
            return super.quit();
        }

        public boolean quitSafely() {
            C119146d.f356850b.mo174280a(this, getName(), getId());
            return super.quitSafely();
        }

        public synchronized void start() {
            super.start();
            C119146d.f356850b.mo174281b(this, getName(), getId());
        }
    }

    /* renamed from: a */
    public static HandlerThread m126093a(String str, int i) {
        C97750a aVar = new C97750a("[GT]" + str);
        if (i < 1) {
            i = 1;
        } else if (i > 10) {
            i = 10;
        }
        aVar.setPriority(i);
        return aVar;
    }
}
