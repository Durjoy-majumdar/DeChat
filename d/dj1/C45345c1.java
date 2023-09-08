package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49922iz3;
import te3.C49966ja;
import te3.C50332lz3;
import te3.C50654oa1;
import te3.C50803pa1;
import te3.C51163rv3;

/* renamed from: dj1.c1 */
public final class C45345c1 extends C58286q<C50803pa1> {

    /* renamed from: t */
    public C50654oa1 f122824t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45345c1(String str, ArrayList<C49922iz3> arrayList, ArrayList<C50332lz3> arrayList2) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(arrayList, "selectChatRoomList");
        C87412m.m108594g(arrayList2, "selectUserList");
        C50654oa1 oa12 = new C50654oa1();
        this.f122824t = oa12;
        oa12.f139056d = C46523h2.f125330a.mo71860b(8586, this.f172731j);
        C50654oa1 oa13 = this.f122824t;
        oa13.f139057e = str;
        oa13.f139058f.addAll(arrayList);
        this.f122824t.f139059g.addAll(arrayList2);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122824t;
        C50803pa1 pa12 = new C50803pa1();
        pa12.setBaseResponse(new C49966ja());
        pa12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = pa12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivevisibilityorchargesettings";
        bVar.f127069d = 8586;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50803pa1) eu32, "resp");
        Log.m105924i("Finder.CgiFinderLiveVisibilityOrChargeSettingsRequest", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
