package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;

/* renamed from: qj1.c5 */
public final class C12266c5 extends C87413o implements C32227p<Long, Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f35352d;

    /* renamed from: e */
    public final /* synthetic */ C15601d<C13604l<Boolean, Long>> f35353e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12266c5(long j, C15601d<? super C13604l<Boolean, Long>> dVar) {
        super(2);
        this.f35352d = j;
        this.f35353e = dVar;
    }

    public Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        if (longValue2 != this.f35352d || longValue < 0) {
            Log.m105924i("FinderLiveChargePayPluginEx", "updateWecoinBalance: requestId not match, requestId:" + longValue2 + ", wecoinBalanceRequestId:" + this.f35352d + ",wecoinBalance:" + longValue);
            C15601d<C13604l<Boolean, Long>> dVar = this.f35353e;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.FALSE, 0L)));
        } else {
            C15601d<C13604l<Boolean, Long>> dVar2 = this.f35353e;
            Result.Companion companion2 = Result.Companion;
            dVar2.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.TRUE, Long.valueOf(longValue))));
        }
        return C13598b0.f38549a;
    }
}
