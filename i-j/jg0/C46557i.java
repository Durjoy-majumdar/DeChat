package jg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83049v5;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import qe3.C101125b1;
import sf0.C48374j0;
import te3.ag4;
import te3.bg4;

/* renamed from: jg0.i */
public class C46557i extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125449d;

    /* renamed from: e */
    public C47350c f125450e;

    public C46557i(int i, int i2, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new ag4();
        bVar.f127067b = new bg4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/thirdappverify";
        bVar.f127069d = C83049v5.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125450e = a;
        C47465a aVar = a.f127055a.f127080a;
        ((ag4) aVar).f130504d = str;
        ((ag4) aVar).f130505e = i2;
        ((ag4) aVar).f130506f = LocaleUtil.getApplicationLanguage();
        byte[] uuidRandom = Util.getUuidRandom();
        ((ag4) this.f125450e.f127055a.f127080a).f130507g = C48374j0.m53712a(uuidRandom);
        this.f125450e.setRsaInfo(C101125b1.m132537a());
        C47350c cVar = this.f125450e;
        cVar.f127059e = 1;
        cVar.getReqObj().setPassKey(uuidRandom);
        this.f125450e.getReqObj().setSceneStatus(i);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125449d = nVar;
        return dispatch(gVar, this.f125450e, this);
    }

    public int getType() {
        return C83049v5.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneVerifyThirdApp", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f125449d.onSceneEnd(i2, i3, str, this);
    }
}
