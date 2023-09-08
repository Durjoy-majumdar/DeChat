package z22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import qe3.C101125b1;
import sf0.C48374j0;
import te3.C48906bu;
import te3.C49048cu;

/* renamed from: z22.a */
public class C53734a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150851d;

    /* renamed from: e */
    public C47350c f150852e;

    /* renamed from: f */
    public byte[] f150853f;

    public C53734a(String str, byte[] bArr) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48906bu();
        bVar.f127067b = new C49048cu();
        bVar.f127069d = 503;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkloginqrcode";
        C47350c a = bVar.mo72403a();
        this.f150852e = a;
        C48906bu buVar = (C48906bu) a.f127055a.f127080a;
        byte[] uuidRandom = Util.getUuidRandom();
        buVar.f131302d = C48374j0.m53712a(uuidRandom);
        buVar.f131304f = (int) (System.currentTimeMillis() / 1000);
        buVar.f131303e = str;
        buVar.f131305g = 0;
        this.f150852e.setRsaInfo(C101125b1.m132537a());
        C47350c cVar = this.f150852e;
        cVar.f127059e = 1;
        cVar.getReqObj().setPassKey(uuidRandom);
        this.f150853f = bArr;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150851d = nVar;
        return dispatch(gVar, this.f150852e, this);
    }

    public int getType() {
        return 503;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCheckLoginQRCode", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f150851d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
