package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49956j72;
import te3.C50091k72;

/* renamed from: xm2.m */
public class C53383m extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f150208d;

    /* renamed from: e */
    public C11385n f150209e;

    /* renamed from: f */
    public C50091k72 f150210f;

    public C53383m() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49956j72();
        bVar.f127067b = new C50091k72();
        bVar.f127069d = 2745;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getreceiptassisstatus";
        this.f150208d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150209e = nVar;
        return dispatch(gVar, this.f150208d, this);
    }

    public int getType() {
        return 2745;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105929w("MicroMsg.NetSceneGetReceipAssistStatus", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f150210f = (C50091k72) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f150209e.onSceneEnd(i2, i3, str, this);
    }
}
