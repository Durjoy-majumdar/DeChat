package mz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kz0.C46827q;
import te3.C50193ky1;
import te3.C64539ly1;

/* renamed from: mz0.b */
public final class C47144b extends C46827q<C64539ly1> {
    public C47144b(long j, long j2, int i) {
        C50193ky1 ky12 = new C50193ky1();
        C64539ly1 ly12 = new C64539ly1();
        ky12.f137098d = j;
        ky12.f137099e = j2;
        ky12.f137100f = i;
        mo72033k(ky12, ly12, 4735, "/cgi-bin/mmpay-bin/mktgetcouponandgifthistory");
        Log.m105924i("MicroMsg.CgiGetMemberCardHistoryRequest", "pageNum: " + j + ", pageSize: " + j2);
    }
}
