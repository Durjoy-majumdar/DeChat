package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p239sv.C48465k;
import te3.C48783az2;
import te3.C48930bz2;
import te3.C51932x63;

/* renamed from: je0.w */
public class C46499w extends C117747y implements C1311n, C48465k {

    /* renamed from: d */
    public final C47350c f125275d;

    /* renamed from: e */
    public C11385n f125276e;

    /* renamed from: f */
    public String f125277f;

    public C46499w(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        this.f125277f = str2;
        C48783az2 az22 = new C48783az2();
        az22.f130850d = str;
        C51932x63 x632 = new C51932x63();
        az22.f130851e = x632;
        x632.f144489d = str2;
        bVar.f127066a = az22;
        bVar.f127067b = new C48930bz2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/modopenimchatroomowner";
        bVar.f127069d = 811;
        this.f125275d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125276e = nVar;
        return dispatch(gVar, this.f125275d, this);
    }

    public int getType() {
        return 811;
    }

    public String getUsername() {
        return this.f125277f;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105929w("MicroMsg.NetSceneTransferOpenImChatRoomOwner", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f125276e.onSceneEnd(i2, i3, str, this);
    }
}
