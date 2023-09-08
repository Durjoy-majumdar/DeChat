package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87413o;
import qs1.C63325a;
import rx3.C13598b0;
import te3.C64780vo2;

/* renamed from: qj1.j6 */
public final class C62829j6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C64780vo2 f178318d;

    /* renamed from: e */
    public final /* synthetic */ boolean f178319e;

    /* renamed from: f */
    public final /* synthetic */ C63325a f178320f;

    /* renamed from: g */
    public final /* synthetic */ C62804h6 f178321g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62829j6(C64780vo2 vo22, boolean z, C63325a aVar, C62804h6 h6Var) {
        super(0);
        this.f178318d = vo22;
        this.f178319e = z;
        this.f178320f = aVar;
        this.f178321g = h6Var;
    }

    public Object invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("updateBgDecoration loadDecorationRes:");
        C64780vo2 vo22 = this.f178318d;
        sb.append(vo22 != null ? vo22.f185964e : null);
        sb.append(" result:");
        sb.append(this.f178319e);
        Log.m105924i("Finder.FinderLiveDecorationPlugin", sb.toString());
        if (this.f178319e) {
            this.f178320f.f179686g = this.f178318d;
            this.f178321g.mo87792a1();
            C62804h6 h6Var = this.f178321g;
            h6Var.f166287d.postDelayed(h6Var.f178275r, C32444a.f86124a2.mo60266n().longValue() * 1000);
        }
        return C13598b0.f38549a;
    }
}
