package cc2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49449fn2;
import te3.C77921en2;

/* renamed from: cc2.f */
public class C67354f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f193209d;

    /* renamed from: e */
    public final C47350c f193210e;

    /* renamed from: f */
    public String f193211f;

    /* renamed from: g */
    public String f193212g;

    public C67354f(int i, float f, float f2, int i2, int i3, String str, String str2) {
        if (!(i == 1 || i == 2)) {
            Log.m105920e("MicroMsg.NetSceneLbsRoom", "OpCode Error :" + i);
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77921en2();
        bVar.f127067b = new C49449fn2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/joinlbsroom";
        bVar.f127069d = 376;
        bVar.f127070e = WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED;
        bVar.f127071f = 1000000183;
        C47350c a = bVar.mo72403a();
        this.f193210e = a;
        C77921en2 en22 = (C77921en2) a.f127055a.f127080a;
        en22.f227250d = i;
        en22.f227251e = f;
        en22.f227252f = f2;
        en22.f227253g = i2;
        en22.f227254h = str;
        en22.f227255i = str2;
        en22.f227256j = i3;
        Log.m105918d("MicroMsg.NetSceneLbsRoom", "Req: opcode:" + i + " lon:" + f + " lat:" + f2 + " pre:" + i2 + " gpsSource:" + i3 + " mac" + str + " cell:" + str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f193209d = nVar;
        return dispatch(gVar, this.f193210e, this);
    }

    public int getType() {
        return 376;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneLbsRoom", "onGYNetEnd  errType:" + i2 + " errCode:" + i3 + " opCode:" + ((C77921en2) this.f193210e.f127055a.f127080a).f227250d);
        C47350c cVar = (C47350c) uVar;
        C49449fn2 fn22 = (C49449fn2) cVar.f127056b.f127083a;
        if (i2 != 0) {
            this.f193209d.onSceneEnd(i2, i3, str, this);
            return;
        }
        C47465a aVar = this.f193210e.f127055a.f127080a;
        if (((C77921en2) aVar).f227250d == 1) {
            this.f193211f = fn22.f133598d;
            this.f193212g = fn22.f133599e;
            this.f193209d.onSceneEnd(i2, i3, str, this);
        } else if (((C77921en2) aVar).f227250d == 2) {
            C67352d.m79717b(((C77921en2) cVar.f127055a.f127080a).f227257n);
            this.f193209d.onSceneEnd(i2, i3, str, this);
        }
    }

    public C67354f(int i, String str, int i2, int i3) {
        if (i != 2) {
            Log.m105920e("MicroMsg.NetSceneLbsRoom", "OpCode Error :" + i);
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77921en2();
        bVar.f127067b = new C49449fn2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/joinlbsroom";
        bVar.f127069d = 376;
        bVar.f127070e = WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED;
        bVar.f127071f = 1000000183;
        C47350c a = bVar.mo72403a();
        this.f193210e = a;
        C77921en2 en22 = (C77921en2) a.f127055a.f127080a;
        en22.f227251e = 0.0f;
        en22.f227252f = 0.0f;
        en22.f227253g = 0;
        en22.f227256j = 0;
        en22.f227254h = "";
        en22.f227255i = "";
        en22.f227250d = i;
        en22.f227257n = str;
        en22.f227259p = i2;
        en22.f227258o = i3;
    }
}
