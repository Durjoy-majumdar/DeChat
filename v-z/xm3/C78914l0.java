package xm3;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import gy3.C87412m;
import jq3.C60897k;
import jq3.C9493c;
import om3.C77020b;
import sx3.C26236u;
import tm3.C78063m;
import tm3.C78065p;
import tm3.C78069w;
import tm3.C78071z;

/* renamed from: xm3.l0 */
public final class C78914l0 implements C60897k<C77020b> {

    /* renamed from: a */
    public final /* synthetic */ C78889f0 f231781a;

    public C78914l0(C78889f0 f0Var) {
        this.f231781a = f0Var;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C60897k.C9501a.m9192a(this, view, (C77020b) cVar, i);
        return false;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C77020b) cVar, i);
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        BaseMvvmActivity d3;
        UIStateCenter stateCenter;
        C77020b bVar = (C77020b) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(bVar, "data");
        if (!bVar.f225016r && (d3 = this.f231781a.mo14598d3()) != null && (stateCenter = d3.getStateCenter()) != null) {
            C78889f0 f0Var = this.f231781a;
            if (bVar.f225006e == 11) {
                stateCenter.dispatch(new C78063m(bVar, f0Var.f231749g));
            } else if (((C78069w) stateCenter.getState()).mo108033b()) {
                stateCenter.dispatch(new C78071z(bVar, i));
            } else {
                stateCenter.dispatch(new C78065p(C26236u.m33719b(bVar.f225007f), -1));
            }
        }
    }
}
