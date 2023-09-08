package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import m53.C10762h;
import rx3.C13598b0;
import te3.C50943qc2;

/* renamed from: cj1.w0 */
public final class C0630w0 implements C10762h<C50943qc2> {

    /* renamed from: a */
    public final /* synthetic */ long f1487a;

    /* renamed from: b */
    public final /* synthetic */ C32227p<Long, Long, C13598b0> f1488b;

    public C0630w0(long j, C32227p<? super Long, ? super Long, C13598b0> pVar) {
        this.f1487a = j;
        this.f1488b = pVar;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
        Log.m105924i("FinderLiveAssistant2", "[WeCoin] getWeCoinBalance onFailed,errorType:" + i + ",errorCode:" + i2 + ",msg:" + str + ", requestId:" + this.f1487a);
        C32227p<Long, Long, C13598b0> pVar = this.f1488b;
        if (pVar != null) {
            pVar.invoke(-1L, Long.valueOf(this.f1487a));
        }
    }

    public void onSuccess(Object obj) {
        C50943qc2 qc22 = (C50943qc2) obj;
        C87412m.m108594g(qc22, "data");
        Log.m105924i("FinderLiveAssistant2", "[WeCoin] getWeCoinBalance onSuccess,data:" + qc22.f140241d + ", requestId:" + this.f1487a);
        C32227p<Long, Long, C13598b0> pVar = this.f1488b;
        if (pVar != null) {
            pVar.invoke(Long.valueOf(qc22.f140241d), Long.valueOf(this.f1487a));
        }
    }
}
