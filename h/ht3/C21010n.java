package ht3;

import ht3.C21001c;

/* renamed from: ht3.n */
public class C21010n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C21001c f59472d;

    /* renamed from: e */
    public final /* synthetic */ C21001c.C21002a f59473e;

    /* renamed from: f */
    public final /* synthetic */ C21017s f59474f;

    /* renamed from: ht3.n$a */
    public class C21011a implements Runnable {
        public C21011a() {
        }

        public void run() {
            C21010n.this.f59473e.mo24425a();
        }
    }

    public C21010n(C21017s sVar, C21001c cVar, C21001c.C21002a aVar) {
        this.f59474f = sVar;
        this.f59472d = cVar;
        this.f59473e = aVar;
    }

    public void run() {
        try {
            ((C21007i) this.f59472d).call();
            if (this.f59473e != null) {
                this.f59474f.f59487b.post(new C21011a());
            }
        } catch (Exception unused) {
        }
    }
}
