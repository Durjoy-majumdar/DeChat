package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ol0.C117792a0;
import p239sv.C13783h;
import te3.C48668a52;
import te3.C48810b52;

/* renamed from: je0.m */
public class C9293m extends C117747y implements C1311n, C13783h {

    /* renamed from: d */
    public C11385n f29058d;

    /* renamed from: e */
    public final C47350c f29059e;

    /* renamed from: f */
    public final String f29060f;

    public C9293m(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48668a52();
        bVar.f127067b = new C48810b52();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getopenimchatroomqrcode";
        bVar.f127069d = C117792a0.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f29059e = a;
        this.f29060f = str;
        ((C48668a52) a.f127055a.f127080a).f130318d = str;
        Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMChatroomQRCode", "get roomname:%s", str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29058d = nVar;
        return dispatch(gVar, this.f29059e, this);
    }

    public int getType() {
        return C117792a0.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMChatroomQRCode", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.f29060f);
        C11385n nVar = this.f29058d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
