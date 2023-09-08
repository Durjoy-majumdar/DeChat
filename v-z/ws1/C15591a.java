package ws1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.List;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51303sv0;
import te3.C51452tv0;

/* renamed from: ws1.a */
public final class C15591a extends C60625c<C51452tv0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15591a(long j, long j2, String str, List<Integer> list, String str2, byte[] bArr) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "objectNonceId");
        C87412m.m108594g(list, "choiceId");
        C87412m.m108594g(str2, "votingId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51303sv0 sv02 = new C51303sv0();
        sv02.f141770d = C46523h2.f125330a.mo71859a(7984);
        sv02.f141771e = j;
        sv02.f141772f = j2;
        sv02.f141773g = str;
        if (bArr != null) {
            sv02.f141776j = C89349b.m111674a(bArr);
        }
        sv02.f141774h.addAll(list);
        sv02.f141775i = str2;
        bVar.f127066a = sv02;
        C51452tv0 tv02 = new C51452tv0();
        tv02.BaseResponse = new C49966ja();
        tv02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = tv02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveattendvoting";
        bVar.f127069d = 7984;
        mo123453j(bVar.mo72403a());
        Log.m105924i("CgiFinderLiveAttendVoting", "[CgiFinderLiveAttendVoting] feedId=" + j2 + " liveId=" + j + ' ');
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51452tv0) eu32, "resp");
        Log.m105924i("CgiFinderLiveAttendVoting", "[CgiFinderLiveAttendVoting] CgiEnd errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
