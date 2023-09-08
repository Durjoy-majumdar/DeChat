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
import te3.C49652h32;
import te3.C49793i32;

/* renamed from: z22.b */
public class C53735b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150854d;

    /* renamed from: e */
    public C47350c f150855e;

    public C53735b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49652h32();
        bVar.f127067b = new C49793i32();
        bVar.f127069d = 502;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getloginqrcode";
        C47350c a = bVar.mo72403a();
        this.f150855e = a;
        C49652h32 h322 = (C49652h32) a.f127055a.f127080a;
        byte[] uuidRandom = Util.getUuidRandom();
        h322.f134428d = C48374j0.m53712a(uuidRandom);
        h322.f134429e = 0;
        this.f150855e.setRsaInfo(C101125b1.m132537a());
        C47350c cVar = this.f150855e;
        cVar.f127059e = 1;
        cVar.getReqObj().setPassKey(uuidRandom);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150854d = nVar;
        return dispatch(gVar, this.f150855e, this);
    }

    public int getType() {
        return 502;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetLoginQRCode", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f150854d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
