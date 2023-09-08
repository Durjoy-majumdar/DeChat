package z90;

import a14.C0000n0;
import androidx.compose.p002ui.platform.C103645l0;
import ca0.C54683f0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import fy3.C32227p;
import gy3.C87413o;
import java.util.List;
import la0.C61242a;
import p175j0.C108494d2;
import p175j0.C108504h;
import p175j0.C60686v;
import p560i2.C108322d;
import rx3.C13598b0;
import z90.C66739c;

/* renamed from: z90.f */
public final class C66756f extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66739c f191819d;

    /* renamed from: e */
    public final /* synthetic */ int f191820e;

    /* renamed from: f */
    public final /* synthetic */ C61242a f191821f;

    /* renamed from: g */
    public final /* synthetic */ List<String> f191822g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66756f(C66739c cVar, int i, C61242a aVar, List<String> list) {
        super(2);
        this.f191819d = cVar;
        this.f191820e = i;
        this.f191821f = aVar;
        this.f191822g = list;
    }

    public Object invoke(Object obj, Object obj2) {
        C54683f0 f0Var;
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C66755d dVar = new C66755d(this.f191819d);
            C16126e eVar = new C16126e(this.f191819d.getContext());
            C60686v vVar = C103645l0.f306124e;
            float intValue = ((float) ((Number) ((C108494d2) this.f191819d.f191777A).getValue()).intValue()) / ((C108322d) hVar.mo51598m(vVar)).getDensity();
            float density = ((float) this.f191820e) / ((C108322d) hVar.mo51598m(vVar)).getDensity();
            C66739c cVar = this.f191819d;
            C55366y1 y1Var = cVar.f191788y;
            if (((Boolean) ((C108494d2) cVar.f191785v).getValue()).booleanValue()) {
                C66739c cVar2 = this.f191819d;
                f0Var = cVar2.mo90626f3(this.f191821f, !cVar2.mo90775o3().f157471f, hVar, 512, 0);
            } else {
                f0Var = this.f191819d.mo90769F3().f157440r;
            }
            boolean booleanValue = ((Boolean) ((C108494d2) this.f191819d.f191785v).getValue()).booleanValue();
            C0000n0 lifecycleScope = this.f191819d.getLifecycleScope();
            boolean n3 = this.f191819d.mo90774n3();
            List<String> list = this.f191822g;
            C66739c.C66746g gVar = this.f191819d.f191787x;
            float f = density;
            C112615o.m153996a(dVar, eVar, intValue, f, y1Var, f0Var, booleanValue, lifecycleScope, n3, list, gVar, hVar, 1090813952, 0);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
