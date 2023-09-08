package p257w;

import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C87412m;

/* renamed from: w.q1 */
public final class C37925q1 {
    /* renamed from: a */
    public static final <V extends C37919o> V m41620a(C37918n1<V> n1Var, long j, V v, V v2, V v3) {
        C87412m.m108594g(n1Var, "<this>");
        C87412m.m108594g(v, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(v2, "end");
        C87412m.m108594g(v3, "startVelocity");
        return n1Var.mo61418b(j * TimeUtil.SECOND_TO_US, v, v2, v3);
    }
}
