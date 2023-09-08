package je1;

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
import te3.C51718vo0;
import te3.C51860wo0;

/* renamed from: je1.l0 */
public final class C33557l0 extends C60625c<C51860wo0> {

    /* renamed from: s */
    public final String f90848s = "Finder.CgiFinderGetMiaoJianVideoMeta";

    /* renamed from: t */
    public C51718vo0 f90849t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33557l0(String str) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "md5");
        C51718vo0 vo02 = new C51718vo0();
        vo02.f143601d = C46523h2.f125330a.mo71859a(4198);
        this.f90849t = vo02;
        vo02.f143602e = str;
        Log.m105924i("Finder.CgiFinderGetMiaoJianVideoMeta", "CgiFinderGetMiaoJianVideoMeta md5:" + str);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f90849t;
        C51860wo0 wo02 = new C51860wo0();
        wo02.setBaseResponse(new C49966ja());
        wo02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = wo02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetmiaojianvideometa";
        bVar.f127069d = 4198;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51860wo0) eu32, "resp");
        String str2 = this.f90848s;
        Log.m105924i(str2, "onCgiEnd errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
    }
}
