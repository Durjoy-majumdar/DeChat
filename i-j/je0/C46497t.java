package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fm0.C86949j0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51301su3;
import te3.C51450tu3;

/* renamed from: je0.t */
public class C46497t extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125269d;

    /* renamed from: e */
    public final C47350c f125270e;

    /* renamed from: f */
    public final String f125271f;

    public C46497t(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51301su3();
        bVar.f127067b = new C51450tu3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/revokeopenimchatroomqrcode";
        bVar.f127069d = C86949j0.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f125270e = a;
        this.f125271f = str;
        C51301su3 su32 = (C51301su3) a.f127055a.f127080a;
        su32.f141764d = str;
        su32.f141765e = str2;
        Log.m105925i("MicroMsg.Openim.NetSceneRevokeOpenIMChatRoomQRCode", "get roomname:%s, qrcode:%s", str, str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125269d = nVar;
        return dispatch(gVar, this.f125270e, this);
    }

    public int getType() {
        return C86949j0.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Openim.NetSceneRevokeOpenIMChatRoomQRCode", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.f125271f);
        C11385n nVar = this.f125269d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
