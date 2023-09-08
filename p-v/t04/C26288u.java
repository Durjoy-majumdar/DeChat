package t04;

import gy3.C8480h;
import gy3.C87412m;
import t04.C26255f;
import wy3.C26516w;

/* renamed from: t04.u */
public abstract class C26288u implements C26255f {

    /* renamed from: a */
    public final String f73244a;

    /* renamed from: t04.u$a */
    public static final class C26289a extends C26288u {

        /* renamed from: b */
        public final int f73245b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26289a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L_0x0018
                java.lang.String r1 = "s"
                goto L_0x001a
            L_0x0018:
                java.lang.String r1 = ""
            L_0x001a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f73245b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t04.C26288u.C26289a.<init>(int):void");
        }

        /* renamed from: b */
        public boolean mo53157b(C26516w wVar) {
            C87412m.m108594g(wVar, "functionDescriptor");
            return wVar.mo52639h().size() >= this.f73245b;
        }
    }

    /* renamed from: t04.u$b */
    public static final class C26290b extends C26288u {

        /* renamed from: b */
        public final int f73246b;

        public C26290b(int i) {
            super("must have exactly " + i + " value parameters", (C8480h) null);
            this.f73246b = i;
        }

        /* renamed from: b */
        public boolean mo53157b(C26516w wVar) {
            C87412m.m108594g(wVar, "functionDescriptor");
            return wVar.mo52639h().size() == this.f73246b;
        }
    }

    /* renamed from: t04.u$c */
    public static final class C26291c extends C26288u {

        /* renamed from: b */
        public static final C26291c f73247b = new C26291c();

        public C26291c() {
            super("must have no value parameters", (C8480h) null);
        }

        /* renamed from: b */
        public boolean mo53157b(C26516w wVar) {
            C87412m.m108594g(wVar, "functionDescriptor");
            return wVar.mo52639h().isEmpty();
        }
    }

    /* renamed from: t04.u$d */
    public static final class C26292d extends C26288u {

        /* renamed from: b */
        public static final C26292d f73248b = new C26292d();

        public C26292d() {
            super("must have a single value parameter", (C8480h) null);
        }

        /* renamed from: b */
        public boolean mo53157b(C26516w wVar) {
            C87412m.m108594g(wVar, "functionDescriptor");
            return wVar.mo52639h().size() == 1;
        }
    }

    public C26288u(String str, C8480h hVar) {
        this.f73244a = str;
    }

    /* renamed from: a */
    public String mo53156a(C26516w wVar) {
        return C26255f.C26256a.m33748a(this, wVar);
    }

    public String getDescription() {
        return this.f73244a;
    }
}
