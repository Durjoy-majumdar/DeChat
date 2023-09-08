package ht3;

import ht3.C108261e;

/* renamed from: ht3.o */
public class C21012o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108261e f59476d;

    /* renamed from: e */
    public final /* synthetic */ C108261e.C108262a f59477e;

    /* renamed from: f */
    public final /* synthetic */ C21017s f59478f;

    /* renamed from: ht3.o$a */
    public class C21013a implements Runnable {
        public C21013a() {
        }

        public void run() {
            C21012o.this.f59477e.mo24458a();
        }
    }

    public C21012o(C21017s sVar, C108261e eVar, C108261e.C108262a aVar) {
        this.f59478f = sVar;
        this.f59476d = eVar;
        this.f59477e = aVar;
    }

    public void run() {
        try {
            ((C108264l) this.f59476d).call();
            if (this.f59477e != null) {
                this.f59478f.f59487b.post(new C21013a());
            }
        } catch (Exception unused) {
        }
    }
}
