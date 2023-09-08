package il1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: il1.c3 */
public final class C8940c3 extends C87413o implements C32227p<Long, Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f28247d;

    /* renamed from: e */
    public final /* synthetic */ C9184z2 f28248e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8940c3(long j, C9184z2 z2Var) {
        super(2);
        this.f28247d = j;
        this.f28248e = z2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        if (longValue2 != this.f28247d) {
            Log.m105924i("FinderLiveFansJoinWidget", "updateWecoinBalance: requestId not match, requestId:" + longValue2 + ", wecoinBalanceRequestId:" + this.f28247d);
        } else {
            C9184z2 z2Var = this.f28248e;
            z2Var.f28910x = longValue;
            z2Var.f28902p.setText(String.valueOf(longValue));
        }
        return C13598b0.f38549a;
    }
}
