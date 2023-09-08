package je1;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51249si1;
import te3.C51401ti1;

/* renamed from: je1.j1 */
public final class C9323j1 extends C60625c<C51401ti1> {

    /* renamed from: s */
    public final String f29133s = "Finder.CgiFinderRecommendNickname";

    public C9323j1(int i) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C51249si1 si12 = new C51249si1();
        si12.f141538d = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = si12;
        C51401ti1 ti12 = new C51401ti1();
        ti12.setBaseResponse(new C49966ja());
        ti12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ti12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderrecommendnickname";
        bVar.f127069d = 4076;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderRecommendNickname", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51401ti1) eu32, "resp");
        String str2 = this.f29133s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
