package d60;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.C74942w4;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import y50.C66524m;

/* renamed from: d60.b0 */
public final class C58126b0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58234z f166512d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58126b0(C58234z zVar) {
        super(0);
        this.f166512d = zVar;
    }

    public Object invoke() {
        Bundle bundle = new Bundle();
        int[] iArr = {0, 0};
        this.f166512d.f166763j.getLocationOnScreen(iArr);
        bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_X", (iArr[0] + (this.f166512d.f166763j.getWidth() / 2)) - (C66524m.C66525a.f191366a / 2));
        bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_Y", (iArr[1] + C74942w4.m89784a(this.f166512d.f166287d.getContext(), 18)) - C74942w4.m89784a(this.f166512d.f166287d.getContext(), 16));
        this.f166512d.f166759f.statusChange(C58124b.C58125b.POST_LIKE, bundle);
        return C13598b0.f38549a;
    }
}
