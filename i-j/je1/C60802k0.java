package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C60806o3;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51274so0;
import te3.C64685ro0;
import zc1.C66785b;

/* renamed from: je1.k0 */
public final class C60802k0 extends C60625c<C51274so0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60802k0(int i, int i2, String str, int i3, C8480h hVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        str = (i3 & 4) != 0 ? C66785b.f191882e.mo90662O5() : str;
        C87412m.m108594g(str, "username");
        C64685ro0 ro02 = new C64685ro0();
        ro02.f185212i = i2;
        ro02.f185208e = C89349b.m111674a(C60806o3.C60807a.m71190c(C60806o3.f173187p, i, i2, (String) null, 4, (Object) null));
        ro02.f185210g = i != 1 ? i != 2 ? 0 : 1 : 2;
        ro02.f185209f = str;
        ro02.f185211h = C46523h2.f125330a.mo71859a(978);
        C51274so0 so02 = new C51274so0();
        so02.setBaseResponse(new C49966ja());
        so02.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 978;
        bVar.f127066a = ro02;
        bVar.f127067b = new C51274so0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetmentionlist";
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51274so0) eu32, "resp");
        Log.m105924i("Cgi.FinderGetMentionList", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
