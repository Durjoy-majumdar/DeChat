package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C51292ss1;
import te3.C51416tm1;
import wg1.C53161l1;
import wg1.C53165p1;

/* renamed from: qj1.a7 */
public final class C47842a7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C47844c7 f128420d;

    /* renamed from: e */
    public final /* synthetic */ C51416tm1 f128421e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47842a7(C47844c7 c7Var, C51416tm1 tm12) {
        super(0);
        this.f128420d = c7Var;
        this.f128421e = tm12;
    }

    public Object invoke() {
        C47844c7 c7Var = this.f128420d;
        LinkedList<C51292ss1> linkedList = this.f128421e.f142290d;
        C51292ss1 ss12 = linkedList != null ? (C51292ss1) C110818d0.m150916N(linkedList) : null;
        c7Var.getClass();
        Log.m105924i("FinderLiveGameWelfareTaskBubblePlugin", "#updateGiftInfo");
        C53161l1 l1Var = c7Var.f128423p;
        if (l1Var != null) {
            ((C53165p1) l1Var).mo73858n(ss12, false);
        }
        return C13598b0.f38549a;
    }
}
