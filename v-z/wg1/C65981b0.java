package wg1;

import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import qk1.C63213g;
import rx3.C13598b0;

/* renamed from: wg1.b0 */
public final class C65981b0 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65954a0 f189707d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65981b0(C65954a0 a0Var) {
        super(1);
        this.f189707d = a0Var;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        Log.m105920e("FinderLiveAnchorMusicPresenter", "showMusic loadMoreData incrementNum:" + intValue + '!');
        if (intValue <= 0) {
            C66096w wVar = this.f189707d.f189624h;
            if (wVar != null) {
                wVar.mo90099h(false);
            }
        } else {
            C65954a0 a0Var = this.f189707d;
            C66096w wVar2 = a0Var.f189624h;
            if (wVar2 != null) {
                wVar2.mo90098f(((C54991o) a0Var.f189621e.mo71262a(C54991o.class)).f154232N2.f153469f);
            }
            C63213g gVar = this.f189707d.f189625i;
            if (gVar != null) {
                C63213g.m74556F4(gVar, false, 1, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
