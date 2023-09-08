package n53;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import m53.C10765k;
import te3.C48715ah3;
import te3.C48858bh3;

/* renamed from: n53.l */
public final class C11129l extends C11131n<C48858bh3> {
    public C11129l(String str, int i, long j) {
        C87412m.m108594g(str, "requestID");
        C48715ah3 ah32 = new C48715ah3();
        ah32.f130532d = str;
        ah32.f130534f = i;
        ah32.f130533e = j;
        ah32.f130535g = C10765k.f32240b;
        mo11234k(ah32, new C48858bh3(), 5838, "/cgi-bin/micromsg-bin/prepareincomeencash");
        Log.m105924i("MicroMsg.CommonWeCoinCgi", "CgiPrepareIncomeEncashRequest: requestID: " + str + ", amount: " + j + " businessID:" + i);
    }
}
