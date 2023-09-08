package qg1;

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
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50229l81;
import te3.C50368m81;
import te3.C51163rv3;

/* renamed from: qg1.y */
public final class C12233y extends C60625c<C50368m81> {

    /* renamed from: s */
    public final String f35304s = "Finder.CgiFinderLiveSetSockPuppetAttr";

    /* renamed from: t */
    public C12234a f35305t;

    /* renamed from: u */
    public C50229l81 f35306u;

    /* renamed from: qg1.y$a */
    public interface C12234a {
        /* renamed from: a */
        void mo11958a(int i, int i2, String str);

        /* renamed from: b */
        void mo11959b(C50368m81 m812);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12233y(String str, String str2, C12234a aVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "nickname");
        C87412m.m108594g(str2, "url");
        Integer num = null;
        this.f35305t = aVar;
        C50229l81 l812 = new C50229l81();
        this.f35306u = l812;
        l812.f137254e = str;
        l812.f137255f = str2;
        l812.f137253d = C46523h2.f125330a.mo71859a(6816);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f35306u;
        C50368m81 m812 = new C50368m81();
        m812.setBaseResponse(new C49966ja());
        m812.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = m812;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivesetsockpuppetattr";
        bVar.f127069d = 6816;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("init nickname:");
        sb.append(this.f35306u.f137254e);
        sb.append(",url:");
        sb.append(this.f35306u.f137255f);
        sb.append(",live_identity:");
        C49842ig0 ig02 = this.f35306u.f137253d;
        sb.append(ig02 != null ? Integer.valueOf(ig02.f135318j) : num);
        Log.m105924i("Finder.CgiFinderLiveSetSockPuppetAttr", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50368m81 m812 = (C50368m81) eu32;
        C87412m.m108594g(m812, "resp");
        String str2 = this.f35304s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            C12234a aVar = this.f35305t;
            if (aVar != null) {
                aVar.mo11959b(m812);
                return;
            }
            return;
        }
        C12234a aVar2 = this.f35305t;
        if (aVar2 != null) {
            aVar2.mo11958a(i, i2, str);
        }
    }
}
