package l14;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import n14.C25203a;
import n14.C25204b;
import n14.C25205c;
import n14.C25217e;
import n14.C25221g;
import n14.C25222h;
import n14.C25223i;
import ny3.C25235d;
import p14.C25421b;
import p14.C25443k0;
import rx3.C13598b0;

/* renamed from: l14.d */
public final class C24952d<T> extends C25421b<T> {

    /* renamed from: a */
    public final C25217e f71113a;

    /* renamed from: b */
    public final C25235d<T> f71114b;

    /* renamed from: l14.d$a */
    public static final class C24953a extends C87413o implements C32226l<C25203a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C24952d f71115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24953a(C24952d dVar) {
            super(1);
            this.f71115d = dVar;
        }

        public Object invoke(Object obj) {
            C25203a aVar = (C25203a) obj;
            C87412m.m108594g(aVar, "$receiver");
            C25203a.m32146a(aVar, "type", C25443k0.f72045a, (List) null, false, 12, (Object) null);
            C25203a.m32146a(aVar, "value", C25222h.m32168a("kotlinx.serialization.Polymorphic<" + this.f71115d.f71114b.mo51264h() + '>', C25223i.C25224a.f71694a, new C25217e[0], C25221g.f71693d), (List) null, false, 12, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C24952d(C25235d<T> dVar) {
        C87412m.m108594g(dVar, "baseClass");
        this.f71114b = dVar;
        this.f71113a = new C25204b(C25222h.m32168a("kotlinx.serialization.Polymorphic", C25205c.C25206a.f71671a, new C25217e[0], new C24953a(this)), dVar);
    }

    /* renamed from: a */
    public C25217e mo51996a() {
        return this.f71113a;
    }

    /* renamed from: h */
    public C25235d<T> mo51998h() {
        return this.f71114b;
    }
}
