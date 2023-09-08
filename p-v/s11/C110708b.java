package s11;

import gy3.C87412m;
import p11.C110101a;
import p80.C110194c;
import x11.C112018e;
import y11.C112358a;

/* renamed from: s11.b */
public abstract class C110708b extends C110101a {

    /* renamed from: s11.b$a */
    public static class C110709a extends C110708b {

        /* renamed from: a */
        public final String f331169a;

        /* renamed from: b */
        public final C112018e f331170b;

        public C110709a(String str, C112018e eVar) {
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(eVar, "renderInfo");
            this.f331169a = str;
            this.f331170b = eVar;
        }
    }

    /* renamed from: s11.b$b */
    public static final class C110710b extends C110708b {
    }

    /* renamed from: s11.b$c */
    public static final class C110711c extends C110708b {
    }

    /* renamed from: s11.b$d */
    public static final class C110712d extends C110709a {

        /* renamed from: c */
        public final C110194c f331171c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110712d(C110194c cVar, boolean z, boolean z2, String str, C112018e eVar) {
            super(str, eVar);
            C87412m.m108594g(cVar, "inputTexture");
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(eVar, "renderInfo");
            this.f331171c = cVar;
        }
    }

    /* renamed from: s11.b$e */
    public static final class C110713e extends C110709a {

        /* renamed from: c */
        public final C112358a.C112359a f331172c;

        /* renamed from: d */
        public final int f331173d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110713e(C112358a.C112359a aVar, String str, C112018e eVar, int i) {
            super(str, eVar);
            C87412m.m108594g(aVar, "bufferData");
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(eVar, "renderInfo");
            this.f331172c = aVar;
            this.f331173d = i;
        }
    }
}
