package ws1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50462mx0;
import te3.C50605nx0;
import te3.C51079ra1;
import te3.C51163rv3;

/* renamed from: ws1.b */
public final class C15592b extends C60625c<C50605nx0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15592b(long j, long j2, String str, C51079ra1 ra12, int i) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "objectNonceId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50462mx0 mx02 = new C50462mx0();
        mx02.f138260d = C46523h2.f125330a.mo71859a(9620);
        mx02.f138261e = j;
        mx02.f138262f = j2;
        mx02.f138263g = str;
        mx02.f138264h = ra12;
        mx02.f138265i = i;
        bVar.f127066a = mx02;
        C50605nx0 nx02 = new C50605nx0();
        nx02.BaseResponse = new C49966ja();
        nx02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = nx02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivecreatevoting";
        bVar.f127069d = 9620;
        mo123453j(bVar.mo72403a());
        Log.m105924i("CgiFinderLiveCreateVoting", "[CgiFinderLiveCreateVoting] feedId=" + j2 + " liveId=" + j + ' ');
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50605nx0) eu32, "resp");
        Log.m105924i("CgiFinderLiveCreateVoting", "[CgiFinderLiveCreateVoting] CgiEnd errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
