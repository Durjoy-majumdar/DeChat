package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49605gs3;
import te3.C49749hs3;

/* renamed from: hz0.u */
public class C46158u extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124431d;

    /* renamed from: e */
    public C11385n f124432e;

    public C46158u(float f, float f2, String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49605gs3();
        bVar.f127067b = new C49749hs3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/card/reportlocation";
        bVar.f127069d = 1253;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124431d = a;
        C49605gs3 gs32 = (C49605gs3) a.f127055a.f127080a;
        gs32.f134247e = (double) f;
        gs32.f134246d = (double) f2;
        gs32.f134250h = str;
        gs32.f134249g = str2;
        gs32.f134248f = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124432e = nVar;
        return dispatch(gVar, this.f124431d, this);
    }

    public int getType() {
        return 1253;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneCardReportLocation", "onGYNetEnd, errType = " + i2 + " errCode = " + i3);
        this.f124432e.onSceneEnd(i2, i3, str, this);
    }
}
