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
import te3.C51163rv3;
import te3.C51749vw0;
import te3.C51885ww0;

/* renamed from: qg1.i */
public final class C12224i extends C60625c<C51885ww0> {

    /* renamed from: s */
    public final String f35293s = "Finder.CgiFinderLiveClearAliasRole";

    /* renamed from: t */
    public C12225a f35294t;

    /* renamed from: u */
    public C51749vw0 f35295u;

    /* renamed from: qg1.i$a */
    public interface C12225a {
        /* renamed from: a */
        void mo11956a(int i, int i2, String str);

        /* renamed from: b */
        void mo11957b(C51885ww0 ww02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12224i(C12225a aVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        Integer num = null;
        this.f35294t = aVar;
        C51749vw0 vw02 = new C51749vw0();
        this.f35295u = vw02;
        vw02.f143741d = C46523h2.f125330a.mo71859a(4020);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f35295u;
        C51885ww0 ww02 = new C51885ww0();
        ww02.setBaseResponse(new C49966ja());
        ww02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ww02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveclearaliasrole";
        bVar.f127069d = 4020;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("init live_identity:");
        C49842ig0 ig02 = this.f35295u.f143741d;
        sb.append(ig02 != null ? Integer.valueOf(ig02.f135318j) : num);
        Log.m105924i("Finder.CgiFinderLiveClearAliasRole", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51885ww0 ww02 = (C51885ww0) eu32;
        C87412m.m108594g(ww02, "resp");
        String str2 = this.f35293s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            C12225a aVar = this.f35294t;
            if (aVar != null) {
                aVar.mo11957b(ww02);
                return;
            }
            return;
        }
        C12225a aVar2 = this.f35294t;
        if (aVar2 != null) {
            aVar2.mo11956a(i, i2, str);
        }
    }
}
