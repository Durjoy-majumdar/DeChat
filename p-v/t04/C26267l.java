package t04;

import gy3.C8480h;
import gy3.C87412m;
import t04.C26255f;
import wy3.C26516w;

/* renamed from: t04.l */
public abstract class C26267l implements C26255f {

    /* renamed from: a */
    public final String f73201a;

    /* renamed from: t04.l$a */
    public static final class C26268a extends C26267l {

        /* renamed from: b */
        public static final C26268a f73202b = new C26268a();

        public C26268a() {
            super("must be a member function", (C8480h) null);
        }

        /* renamed from: b */
        public boolean mo53157b(C26516w wVar) {
            C87412m.m108594g(wVar, "functionDescriptor");
            return wVar.mo52626H() != null;
        }
    }

    /* renamed from: t04.l$b */
    public static final class C26269b extends C26267l {

        /* renamed from: b */
        public static final C26269b f73203b = new C26269b();

        public C26269b() {
            super("must be a member or an extension function", (C8480h) null);
        }

        /* renamed from: b */
        public boolean mo53157b(C26516w wVar) {
            C87412m.m108594g(wVar, "functionDescriptor");
            return (wVar.mo52626H() == null && wVar.mo52627I() == null) ? false : true;
        }
    }

    public C26267l(String str, C8480h hVar) {
        this.f73201a = str;
    }

    /* renamed from: a */
    public String mo53156a(C26516w wVar) {
        return C26255f.C26256a.m33748a(this, wVar);
    }

    public String getDescription() {
        return this.f73201a;
    }
}
