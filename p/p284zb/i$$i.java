package p284zb;

import li0.C88508b;
import li0.C88509c;

/* renamed from: zb.i$$i */
public class i$$i implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ C91640i f262610d;

    /* renamed from: zb.i$$i$a */
    public class C91642a implements Runnable {
        public C91642a() {
        }

        public void run() {
            i$$i.this.f262610d.f262600f.f262484a.notifySuspend();
        }
    }

    public i$$i(C91640i iVar) {
        this.f262610d = iVar;
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        if (C88508b.SUSPEND == bVar) {
            this.f262610d.mo125519F0(new C91642a());
        }
    }
}
