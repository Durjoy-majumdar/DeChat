package xp3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: xp3.d */
public final class C102710d {

    /* renamed from: a */
    public long f303329a;

    /* renamed from: b */
    public long f303330b;

    /* renamed from: c */
    public C32224a<Long> f303331c = new C102711a(this);

    /* renamed from: d */
    public long f303332d;

    /* renamed from: e */
    public final String f303333e;

    /* renamed from: xp3.d$a */
    public static final class C102711a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C102710d f303334d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102711a(C102710d dVar) {
            super(0);
            this.f303334d = dVar;
        }

        public Object invoke() {
            C102710d dVar = this.f303334d;
            long j = dVar.f303330b;
            long j2 = 0;
            if (j > 0) {
                j2 = dVar.f303329a / j;
            }
            return Long.valueOf(j2);
        }
    }

    public C102710d(String str) {
        C87412m.m108595h(str, "tag");
        this.f303333e = str;
    }
}
