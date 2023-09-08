package p203mi;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50735ou3;
import te3.C50878pu3;

/* renamed from: mi.u */
public class C47051u extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126452d;

    /* renamed from: e */
    public C47350c f126453e;

    public C47051u(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50735ou3();
        bVar.f127067b = new C50878pu3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/revokechatroomqrcode";
        bVar.f127069d = 700;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126453e = a;
        C50735ou3 ou32 = (C50735ou3) a.f127055a.f127080a;
        ou32.f139370d = str;
        ou32.f139371e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126452d = nVar;
        return dispatch(gVar, this.f126453e, this);
    }

    public int getType() {
        return 700;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.RevokeChatRoomQRCodeRequest", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        C47350c cVar = this.f126453e;
        C50735ou3 ou32 = (C50735ou3) cVar.f127055a.f127080a;
        C50878pu3 pu32 = (C50878pu3) cVar.f127056b.f127083a;
        this.f126452d.onSceneEnd(i2, i3, str, this);
    }
}
