package ht3;

import ht3.C21003d;

/* renamed from: ht3.r */
public class C21015r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C21003d f59481d;

    /* renamed from: e */
    public final /* synthetic */ C21003d.C21004a f59482e;

    /* renamed from: f */
    public final /* synthetic */ C21017s f59483f;

    /* renamed from: ht3.r$a */
    public class C21016a implements Runnable {
        public C21016a() {
        }

        public void run() {
            C21015r.this.f59482e.mo24438a();
        }
    }

    public C21015r(C21017s sVar, C21003d dVar, C21003d.C21004a aVar) {
        this.f59483f = sVar;
        this.f59481d = dVar;
        this.f59482e = aVar;
    }

    public void run() {
        try {
            ((C21009k) this.f59481d).call();
            if (this.f59482e != null) {
                this.f59483f.f59487b.post(new C21016a());
            }
        } catch (Exception unused) {
        }
    }
}
