package in0;

import android.os.Handler;
import kn0.C21365k;
import p396x6.C23002g;

/* renamed from: in0.f */
public class C21109f {

    /* renamed from: a */
    public volatile boolean f59695a = false;

    /* renamed from: b */
    public int f59696b = 1000;

    /* renamed from: c */
    public Handler f59697c;

    /* renamed from: d */
    public C21112c f59698d;

    /* renamed from: e */
    public C21111b f59699e = new C21111b((C21110a) null);

    /* renamed from: in0.f$b */
    public class C21111b implements Runnable {
        public C21111b(C21110a aVar) {
        }

        public void run() {
            C21112c cVar = C21109f.this.f59698d;
            if (cVar != null) {
                C21365k.C21366a aVar = (C21365k.C21366a) cVar;
                synchronized (C21365k.this) {
                    if (!C21365k.this.f60445I) {
                        if (C21365k.this.mo33460G()) {
                            C21365k kVar = C21365k.this;
                            int i = ((C23002g) kVar.f60461p).f66095l;
                            int i2 = 0;
                            if (i != 1) {
                                if (i == 2 || i == 3) {
                                    if (kVar.mo33460G()) {
                                        i2 = ((C23002g) kVar.f60461p).mo36269h();
                                    }
                                    C21365k kVar2 = C21365k.this;
                                    if (i2 != kVar2.f60442F) {
                                        kVar2.mo22556w(i2);
                                        C21365k.this.f60442F = i2;
                                    }
                                } else if (i != 4) {
                                }
                            }
                            kVar.mo33470Q(false);
                        }
                    }
                }
            }
            if (C21109f.this.f59695a) {
                C21109f fVar = C21109f.this;
                fVar.f59697c.postDelayed(fVar.f59699e, (long) fVar.f59696b);
            }
        }
    }

    /* renamed from: in0.f$c */
    public interface C21112c {
    }

    public C21109f(Handler handler) {
        this.f59697c = handler;
    }
}
