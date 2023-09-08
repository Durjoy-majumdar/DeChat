package p247u3;

import a14.C53896h0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58087u0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CopyOnWriteArrayList;
import p247u3.C65007a1;
import rx3.C13598b0;

/* renamed from: u3.n1 */
public abstract class C65093n1<T> {

    /* renamed from: a */
    public C65007a1<T> f187352a;

    /* renamed from: b */
    public C65053e2 f187353b;

    /* renamed from: c */
    public final C65080m0 f187354c;

    /* renamed from: d */
    public final CopyOnWriteArrayList<C32226l<C65079m, C13598b0>> f187355d;

    /* renamed from: e */
    public final C65199y1 f187356e;

    /* renamed from: f */
    public volatile boolean f187357f;

    /* renamed from: g */
    public volatile int f187358g;

    /* renamed from: h */
    public final C65095b f187359h;

    /* renamed from: i */
    public final C58087u0<C65079m> f187360i;

    /* renamed from: j */
    public final C65165s f187361j;

    /* renamed from: k */
    public final C53896h0 f187362k;

    /* renamed from: u3.n1$a */
    public static final class C65094a extends C87413o implements C32226l<C65079m, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65093n1 f187363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65094a(C65093n1 n1Var) {
            super(1);
            this.f187363d = n1Var;
        }

        public Object invoke(Object obj) {
            C65079m mVar = (C65079m) obj;
            C87412m.m108594g(mVar, LocaleUtil.ITALIAN);
            ((C58052j1) this.f187363d.f187360i).setValue(mVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u3.n1$b */
    public static final class C65095b implements C65007a1.C65008a {

        /* renamed from: a */
        public final /* synthetic */ C65093n1 f187364a;

        public C65095b(C65093n1 n1Var) {
            this.f187364a = n1Var;
        }

        /* renamed from: a */
        public void mo89224a(C65069i0 i0Var, boolean z, C65060g0 g0Var) {
            C87412m.m108594g(i0Var, "loadType");
            C87412m.m108594g(g0Var, "loadState");
            C65080m0 m0Var = this.f187364a.f187354c;
            m0Var.getClass();
            C65066h0 h0Var = z ? m0Var.f187313e : m0Var.f187312d;
            if (!C87412m.m108589b(h0Var != null ? h0Var.mo89264b(i0Var) : null, g0Var)) {
                this.f187364a.f187354c.mo89279b(i0Var, z, g0Var);
                C65079m c = this.f187364a.f187354c.mo89280c();
                for (C32226l invoke : this.f187364a.f187355d) {
                    invoke.invoke(c);
                }
            }
        }

        /* renamed from: b */
        public void mo89295b(int i, int i2) {
            this.f187364a.f187361j.mo75009b(i, i2);
        }
    }

    public C65093n1(C65165s sVar, C53896h0 h0Var) {
        C87412m.m108594g(sVar, "differCallback");
        C87412m.m108594g(h0Var, "mainDispatcher");
        this.f187361j = sVar;
        this.f187362k = h0Var;
        C65007a1<Object> a1Var = C65007a1.f187138e;
        C65007a1<Object> a1Var2 = C65007a1.f187138e;
        if (a1Var2 != null) {
            this.f187352a = a1Var2;
            C65080m0 m0Var = new C65080m0();
            this.f187354c = m0Var;
            CopyOnWriteArrayList<C32226l<C65079m, C13598b0>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f187355d = copyOnWriteArrayList;
            this.f187356e = new C65199y1(false, 1, (C8480h) null);
            this.f187359h = new C65095b(this);
            this.f187360i = C58056k1.m67214a(m0Var.mo89280c());
            C65094a aVar = new C65094a(this);
            copyOnWriteArrayList.add(aVar);
            aVar.invoke(m0Var.mo89280c());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PagePresenter<T>");
    }
}
