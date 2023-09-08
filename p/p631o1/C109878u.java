package p631o1;

import fy3.C32227p;
import gy3.C87412m;
import java.util.List;
import java.util.Map;
import p560i2.C108319b;
import p560i2.C33183o;
import p631o1.C109874t;
import p658q1.j$$h;

/* renamed from: o1.u */
public final class C109878u extends j$$h {

    /* renamed from: b */
    public final /* synthetic */ C109874t f328818b;

    /* renamed from: c */
    public final /* synthetic */ C32227p<C109894x0, C108319b, C109899z> f328819c;

    /* renamed from: o1.u$a */
    public static final class C109879a implements C109899z {

        /* renamed from: a */
        public final /* synthetic */ C109899z f328820a;

        /* renamed from: b */
        public final /* synthetic */ C109874t f328821b;

        /* renamed from: c */
        public final /* synthetic */ int f328822c;

        public C109879a(C109899z zVar, C109874t tVar, int i) {
            this.f328820a = zVar;
            this.f328821b = tVar;
            this.f328822c = i;
        }

        /* renamed from: b */
        public void mo145549b() {
            this.f328821b.f328800d = this.f328822c;
            this.f328820a.mo145549b();
            C109874t tVar = this.f328821b;
            tVar.mo161188a(tVar.f328800d);
        }

        /* renamed from: d */
        public Map<C61911a, Integer> mo145550d() {
            return this.f328820a.mo145550d();
        }

        public int getHeight() {
            return this.f328820a.getHeight();
        }

        public int getWidth() {
            return this.f328820a.getWidth();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109878u(C109874t tVar, C32227p<? super C109894x0, ? super C108319b, ? extends C109899z> pVar, String str) {
        super(str);
        this.f328818b = tVar;
        this.f328819c = pVar;
    }

    /* renamed from: d */
    public C109899z mo142887d(C109827a0 a0Var, List<? extends C109893x> list, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(list, "measurables");
        C109874t.C109876b bVar = this.f328818b.f328803g;
        C33183o layoutDirection = a0Var.getLayoutDirection();
        bVar.getClass();
        C87412m.m108594g(layoutDirection, "<set-?>");
        bVar.f328814d = layoutDirection;
        this.f328818b.f328803g.f328815e = a0Var.getDensity();
        this.f328818b.f328803g.f328816f = a0Var.getFontScale();
        C109874t tVar = this.f328818b;
        tVar.f328800d = 0;
        C109874t tVar2 = this.f328818b;
        return new C109879a(this.f328819c.invoke(tVar.f328803g, new C108319b(j)), tVar2, tVar2.f328800d);
    }
}
