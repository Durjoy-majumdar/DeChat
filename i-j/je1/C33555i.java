package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C33078t2;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49695hf0;
import te3.C49712hj1;
import te3.C49838if0;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: je1.i */
public final class C33555i extends C60625c<C49838if0> {

    /* renamed from: s */
    public final String f90845s = "Finder.CgiFinderAdLiveNotice";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33555i(String str, String str2, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "noticeId");
        C49695hf0 hf02 = new C49695hf0();
        hf02.f134593e = str;
        hf02.f134592d = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = hf02;
        C49838if0 if02 = new C49838if0();
        if02.setBaseResponse(new C49966ja());
        if02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = if02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderadlivenotice";
        bVar.f127069d = 4164;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderAdLiveNotice", "init userName:" + str + ", noticeId:" + str2);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49838if0 if02 = (C49838if0) eu32;
        C87412m.m108594g(if02, "resp");
        String str2 = this.f90845s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
        if (i == 0 && i2 == 0 && if02.f135260e > 0) {
            ((C33078t2) C86312j.m106911c(C33078t2.class)).mo58245vv(if02.f135260e);
            String str3 = this.f90845s;
            Log.m105924i(str3, "requestInterval " + if02.f135260e);
        }
    }
}
