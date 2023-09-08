package k82;

import fy3.C32226l;
import gy3.C87412m;
import h82.C108172a;
import p80.C110194c;
import p82.C110201e;
import q82.C110374a;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: k82.b */
public abstract class C108957b extends C108172a {

    /* renamed from: k82.b$a */
    public static class C108958a extends C108957b {

        /* renamed from: a */
        public final String f326390a;

        /* renamed from: b */
        public final C110201e f326391b;

        public C108958a(String str, C110201e eVar) {
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(eVar, "renderInfo");
            this.f326390a = str;
            this.f326391b = eVar;
        }
    }

    /* renamed from: k82.b$b */
    public static final class C108959b extends C108957b {
    }

    /* renamed from: k82.b$c */
    public static final class C108960c extends C108957b {

        /* renamed from: a */
        public final C32226l<C15601d<? super C13598b0>, Object> f326392a;

        public C108960c(C32226l<? super C15601d<? super C13598b0>, ? extends Object> lVar) {
            C87412m.m108594g(lVar, "runnable");
            this.f326392a = lVar;
        }
    }

    /* renamed from: k82.b$d */
    public static final class C108961d extends C108958a {

        /* renamed from: c */
        public final C110194c f326393c;

        /* renamed from: d */
        public final boolean f326394d;

        /* renamed from: e */
        public final boolean f326395e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108961d(C110194c cVar, boolean z, boolean z2, String str, C110201e eVar) {
            super(str, eVar);
            C87412m.m108594g(cVar, "inputTexture");
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(eVar, "renderInfo");
            this.f326393c = cVar;
            this.f326394d = z;
            this.f326395e = z2;
        }
    }

    /* renamed from: k82.b$e */
    public static final class C108962e extends C108958a {

        /* renamed from: c */
        public final C110374a.C110375a f326396c;

        /* renamed from: d */
        public final int f326397d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108962e(C110374a.C110375a aVar, String str, C110201e eVar, int i) {
            super(str, eVar);
            C87412m.m108594g(aVar, "bufferData");
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(eVar, "renderInfo");
            this.f326396c = aVar;
            this.f326397d = i;
        }
    }
}
