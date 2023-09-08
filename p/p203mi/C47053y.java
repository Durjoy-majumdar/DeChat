package p203mi;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1915z5;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.qi4;
import te3.ri4;

/* renamed from: mi.y */
public class C47053y extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f126456d;

    /* renamed from: e */
    public C11385n f126457e;

    /* renamed from: f */
    public String f126458f;

    public C47053y(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        this.f126458f = str2;
        qi4 qi4 = new qi4();
        qi4.f140339d = str;
        qi4.f140340e = str2;
        bVar.f127066a = qi4;
        bVar.f127067b = new ri4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/transferchatroomowner";
        bVar.f127069d = C1915z5.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f126456d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126457e = nVar;
        return dispatch(gVar, this.f126456d, this);
    }

    public int getType() {
        return C1915z5.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105928w("MicroMsg.NetSceneTransferChatRoomOwner", "errType = " + i2 + " errCode " + i3 + " errMsg " + str);
        this.f126457e.onSceneEnd(i2, i3, str, this);
    }
}
