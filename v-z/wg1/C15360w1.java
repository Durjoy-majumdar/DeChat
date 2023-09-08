package wg1;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: wg1.w1 */
public final class C15360w1 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66093v1 f41712d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15360w1(C66093v1 v1Var) {
        super(1);
        this.f41712d = v1Var;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C66093v1 v1Var = this.f41712d;
        v1Var.getClass();
        Log.m105924i("Finder.FinderLiveLuckyMoneyBubblePresenter", "handleRecvLuckyMoneyErr errCode:" + intValue);
        if (intValue == 1) {
            Bundle bundle = new Bundle();
            bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 1);
            v1Var.f189994e.statusChange(C58124b.C58125b.FINDER_LIVE_SHOW_BOTTOM_TIP_PANEL, bundle);
        } else if (intValue == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 2);
            v1Var.f189994e.statusChange(C58124b.C58125b.FINDER_LIVE_SHOW_BOTTOM_TIP_PANEL, bundle2);
        }
        return C13598b0.f38549a;
    }
}
