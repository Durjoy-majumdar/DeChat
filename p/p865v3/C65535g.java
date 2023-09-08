package p865v3;

import a14.C0000n0;
import com.google.firebase.analytics.FirebaseAnalytics;
import d14.C45252f;
import d14.C58095x0;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import wx3.C15601d;

/* renamed from: v3.g */
public final class C65535g<T> {

    /* renamed from: a */
    public final C13601g f188555a;

    /* renamed from: b */
    public final C45252f<T> f188556b;

    /* renamed from: c */
    public final C0000n0 f188557c;

    /* renamed from: d */
    public final C45252f<T> f188558d;

    /* renamed from: e */
    public final boolean f188559e;

    /* renamed from: f */
    public final C32227p<T, C15601d<? super C13598b0>, Object> f188560f;

    /* renamed from: g */
    public final boolean f188561g;

    public C65535g(C0000n0 n0Var, int i, C45252f fVar, boolean z, C32227p pVar, boolean z2, int i2, C8480h hVar) {
        i = (i2 & 2) != 0 ? 0 : i;
        z = (i2 & 8) != 0 ? false : z;
        z2 = (i2 & 32) != 0 ? false : z2;
        C87412m.m108594g(n0Var, "scope");
        C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(pVar, "onEach");
        this.f188557c = n0Var;
        this.f188558d = fVar;
        this.f188559e = z;
        this.f188560f = pVar;
        this.f188561g = z2;
        this.f188555a = C36568h.m40986b(C13602i.SYNCHRONIZED, new C65528e(this, i));
        this.f188556b = new C58095x0(new C65529f(this, (C15601d) null));
    }
}
