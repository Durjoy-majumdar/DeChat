package n53;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import m53.C10765k;
import te3.C49424fh3;
import te3.C49562gh3;

/* renamed from: n53.m */
public final class C11130m extends C11131n<C49562gh3> {
    public C11130m(C49424fh3 fh32) {
        C87412m.m108594g(fh32, "request");
        fh32.f133508o = C10765k.f32240b;
        mo11234k(fh32, new C49562gh3(), 6242, "/cgi-bin/micromsg-bin/preparewecoinrecharge");
        Log.m105924i("MicroMsg.CommonWeCoinCgi", "CgiPrepareWecoinRechargeRequest: requestID: " + fh32.f133500d + ", productID:  " + fh32.f133501e);
    }
}
