package m73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import fk0.C86908a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C50395mf2;
import te3.C50535nf2;

/* renamed from: m73.a */
public class C46949a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126231d;

    /* renamed from: e */
    public C47350c f126232e;

    /* renamed from: f */
    public String f126233f;

    /* renamed from: g */
    public String f126234g;

    public C46949a(String str, String str2) {
        this.f126233f = str;
        this.f126234g = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = C86908a.CTRL_INDEX;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/device/register";
        bVar.f127066a = new C50395mf2();
        bVar.f127067b = new C50535nf2();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126232e = a;
        C50395mf2 mf22 = (C50395mf2) a.f127055a.f127080a;
        mf22.f138004e = new C89349b(str.getBytes());
        mf22.f138003d = new C89349b(str2.getBytes());
        mf22.f138005f = new C89349b(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY.getBytes());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126231d = nVar;
        return dispatch(gVar, this.f126232e, this);
    }

    public int getType() {
        return C86908a.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.Wear.NetSceneBizDeviceAuth", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f126231d.onSceneEnd(i2, i3, str, this);
    }
}
