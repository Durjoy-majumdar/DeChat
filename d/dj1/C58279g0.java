package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.LinkedList;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51897wz0;
import te3.C64308d82;
import te3.C64790vz0;
import zc1.C66785b;

/* renamed from: dj1.g0 */
public final class C58279g0 extends C60625c<C51897wz0> {

    /* renamed from: s */
    public final String f166879s = "Finder.CgiFinderLiveGetExtraInfo";

    /* renamed from: t */
    public C64790vz0 f166880t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58279g0(String str, byte[] bArr, long j, long j2, LinkedList<C64308d82> linkedList) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "anchorUsername");
        C87412m.m108594g(linkedList, "reqList");
        String str2 = null;
        C64790vz0 vz02 = new C64790vz0();
        this.f166880t = vz02;
        vz02.f186018d = C46523h2.f125330a.mo71859a(8259);
        this.f166880t.f186019e = str;
        String O5 = C66785b.f191882e.mo90662O5();
        str2 = O5.length() > 0 ? O5 : str2;
        if (str2 != null) {
            this.f166880t.f186020f = str2;
        }
        this.f166880t.f186021g = C89349b.m111674a(bArr);
        C64790vz0 vz03 = this.f166880t;
        vz03.f186022h = j2;
        vz03.f186023i = j;
        vz03.f186024j = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = vz03;
        C51897wz0 wz02 = new C51897wz0();
        wz02.setBaseResponse(new C49966ja());
        wz02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = wz02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetextrainfo";
        bVar.f127069d = 8259;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51897wz0) eu32, "resp");
        String str2 = this.f166879s;
        Log.m105924i(str2, "[onCgiBack] scene:" + this.f166880t.f186023i + ",errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
