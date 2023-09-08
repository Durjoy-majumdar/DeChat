package p152f0;

import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p009c2.C104269s;
import p009c2.C28482z;
import p175j0.C108504h;
import p175j0.C60655g0;
import p257w.C111626b;
import p257w.C111628c;
import p436a1.C103257q;
import p436a1.C103272w;
import p436a1.C103273w0;
import p721v0.C65503j;
import p735w1.C38006x;
import p868x0.C111983i;
import wx3.C15601d;

/* renamed from: f0.l1 */
public final class C107362l1 extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C103257q f321208d;

    /* renamed from: e */
    public final /* synthetic */ C107394p2 f321209e;

    /* renamed from: f */
    public final /* synthetic */ C28482z f321210f;

    /* renamed from: g */
    public final /* synthetic */ C104269s f321211g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107362l1(C103257q qVar, C107394p2 p2Var, C28482z zVar, C104269s sVar) {
        super(3);
        this.f321208d = qVar;
        this.f321209e = p2Var;
        this.f321210f = zVar;
        this.f321211g = sVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        C65503j jVar = (C65503j) obj;
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g(jVar, "$this$composed");
        hVar.mo51557H(1634330012);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = C111628c.m152140a(1.0f, 0.0f, 2, (Object) null);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C111626b bVar = (C111626b) q;
        C103257q qVar = this.f321208d;
        boolean z = true;
        if (qVar instanceof C103273w0) {
            if (((C103273w0) qVar).f304518b == C103272w.f304515g) {
                z = false;
            }
        }
        if (!this.f321209e.mo157812b() || !C38006x.m41694b(this.f321210f.f78286b) || !z) {
            int i2 = C65503j.f188489K0;
            obj4 = C65503j.C65504a.f188490d;
        } else {
            C103257q qVar2 = this.f321208d;
            C28482z zVar = this.f321210f;
            C60655g0.m70934e(qVar2, zVar.f78285a, new C38006x(zVar.f78286b), new C31748j1(bVar, (C15601d<? super C31748j1>) null), hVar, 0);
            obj4 = C111983i.m152702c(jVar, new C107355k1(bVar, this.f321211g, this.f321210f, this.f321209e, this.f321208d));
        }
        hVar.mo51565P();
        return obj4;
    }
}
