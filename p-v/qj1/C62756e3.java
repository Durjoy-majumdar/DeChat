package qj1;

import c50.C54655b;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import fy3.C32227p;
import gh1.C59447j;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.e3 */
public final class C62756e3 extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62696d3 f178150d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62756e3(C62696d3 d3Var) {
        super(2);
        this.f178150d = d3Var;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        C59447j.f169870a.mo84555g(this.f178150d.mo14484z0().getData().f151979f);
        C54655b b = FinderLiveService.f159376d.mo77626b();
        if (b != null) {
            b.mo85695n0();
        }
        ((C54991o) this.f178150d.mo87696x0(C54991o.class)).f154284Y2 = 0;
        return C13598b0.f38549a;
    }
}
