package p720v;

import com.tencent.wcdb.FileUtils;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p257w.C111629c1;
import p257w.C111641g1;
import p257w.C111654m;
import p257w.C111656m1;
import p257w.C37906k1;
import p560i2.C33177j;
import p721v0.C65503j;

/* renamed from: v.x */
public final class C111291x extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C111629c1<C111277n> f333213d;

    /* renamed from: e */
    public final /* synthetic */ C60667k2<C37629k0> f333214e;

    /* renamed from: f */
    public final /* synthetic */ C60667k2<C37629k0> f333215f;

    /* renamed from: g */
    public final /* synthetic */ String f333216g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111291x(C111629c1<C111277n> c1Var, C60667k2<C37629k0> k2Var, C60667k2<C37629k0> k2Var2, String str) {
        super(3);
        this.f333213d = c1Var;
        this.f333214e = k2Var;
        this.f333215f = k2Var2;
        this.f333216g = str;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C65503j jVar = (C65503j) obj;
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g(jVar, "$this$composed");
        hVar.mo51557H(158379472);
        C111629c1<C111277n> c1Var = this.f333213d;
        hVar.mo51557H(1157296644);
        boolean x = hVar.mo51619x(c1Var);
        Object q = hVar.mo51606q();
        if (x || q == C108504h.C60656a.f172772a) {
            q = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        if (this.f333213d.mo163298b() == this.f333213d.mo163300d() && !this.f333213d.mo163301e()) {
            y0Var.setValue(Boolean.FALSE);
        } else if (!(this.f333214e.getValue() == null && this.f333215f.getValue() == null)) {
            y0Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) y0Var.getValue()).booleanValue()) {
            C111629c1<C111277n> c1Var2 = this.f333213d;
            int i = C33177j.f90051c;
            C37906k1<C33177j, C111654m> k1Var = C111656m1.f334262g;
            String str = this.f333216g;
            hVar.mo51557H(-492369756);
            Object q2 = hVar.mo51606q();
            Object obj4 = C108504h.C60656a.f172772a;
            if (q2 == obj4) {
                q2 = str + " slide";
                hVar.mo51553F(q2);
            }
            hVar.mo51565P();
            C111629c1.C111630a<C33177j, C111654m> a = C111641g1.m152172a(c1Var2, k1Var, (String) q2, hVar, FileUtils.S_IRWXU, 0);
            C111629c1<C111277n> c1Var3 = this.f333213d;
            C60667k2<C37629k0> k2Var = this.f333214e;
            C60667k2<C37629k0> k2Var2 = this.f333215f;
            hVar.mo51557H(1157296644);
            boolean x2 = hVar.mo51619x(c1Var3);
            Object q3 = hVar.mo51606q();
            if (x2 || q3 == obj4) {
                q3 = new C111274m0(a, k2Var, k2Var2);
                hVar.mo51553F(q3);
            }
            hVar.mo51565P();
            jVar = jVar.mo74972i0((C111274m0) q3);
        }
        hVar.mo51565P();
        return jVar;
    }
}
