package xf1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gr1.C59670o2;
import gr1.C59673q2;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: xf1.d */
public final class C66252d extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C59673q2 f190311d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66252d(C59673q2 q2Var) {
        super(1);
        this.f190311d = q2Var;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, "view");
        String videoMediaId = o2Var.getVideoMediaId();
        C59673q2 q2Var = this.f190311d;
        String str = null;
        if (C87412m.m108589b(videoMediaId, q2Var != null ? q2Var.f170493c : null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("playVideo, advance pause view, mediaId=");
            C59673q2 q2Var2 = this.f190311d;
            if (q2Var2 != null) {
                str = q2Var2.f170493c;
            }
            sb.append(str);
            Log.m105924i("FinderVideoPassive", sb.toString());
            o2Var.pause();
        }
        return Boolean.FALSE;
    }
}
