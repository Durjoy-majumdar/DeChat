package mz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kz0.C46827q;
import te3.C51055r32;
import te3.C64696s32;

/* renamed from: mz0.d */
public final class C47146d extends C46827q<C64696s32> {
    public C47146d(long j, long j2) {
        C51055r32 r322 = new C51055r32();
        C64696s32 s322 = new C64696s32();
        r322.f140684d = j;
        r322.f140685e = j2;
        mo72033k(r322, s322, 4406, "/cgi-bin/mmpay-bin/mktgetmembercardhistory");
        Log.m105924i("MicroMsg.CgiGetMemberCardHistoryRequest", "pageNum: " + j + ", pageSize: " + j2);
    }
}
