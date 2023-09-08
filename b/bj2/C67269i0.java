package bj2;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import gy3.C87412m;
import jq3.C60897k;
import jq3.C9493c;

/* renamed from: bj2.i0 */
public final class C67269i0 implements C60897k<C67265e0> {

    /* renamed from: a */
    public final /* synthetic */ C67270j0 f193105a;

    public C67269i0(C67270j0 j0Var) {
        this.f193105a = j0Var;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C67265e0 e0Var = (C67265e0) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(e0Var, "data");
        UIStateCenter e3 = this.f193105a.mo14599e3();
        if (e3 == null) {
            return false;
        }
        e3.dispatch(new C67268h0(e0Var));
        return false;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C67265e0) cVar, i);
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        C67265e0 e0Var = (C67265e0) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(e0Var, "data");
        UIStateCenter e3 = this.f193105a.mo14599e3();
        if (e3 != null) {
            e3.dispatch(new C67266f0(e0Var));
        }
    }
}
