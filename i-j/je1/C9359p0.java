package je1;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.List;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50993qp0;
import te3.C51137rp0;
import te3.C51163rv3;

/* renamed from: je1.p0 */
public final class C9359p0 extends C60625c<C51137rp0> {

    /* renamed from: s */
    public final String f29230s = "Finder.CgiFinderGetSvrExptConfig";

    /* renamed from: t */
    public C50993qp0 f29231t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9359p0(List<Integer> list) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(list, "exptIds");
        C50993qp0 qp02 = new C50993qp0();
        this.f29231t = qp02;
        qp02.f140443d = C46523h2.f125330a.mo71860b(5864, this.f172731j);
        this.f29231t.f140444e.addAll(list);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f29231t;
        C51137rp0 rp02 = new C51137rp0();
        rp02.setBaseResponse(new C49966ja());
        rp02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = rp02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetsvrexptconfig";
        bVar.f127069d = 5864;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderGetSvrExptConfig", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51137rp0) eu32, "resp");
        String str2 = this.f29230s;
        Log.m105924i(str2, "[onCgiEnd] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
