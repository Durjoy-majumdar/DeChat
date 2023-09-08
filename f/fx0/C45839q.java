package fx0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51007qs2;
import te3.C51150rs2;

/* renamed from: fx0.q */
public class C45839q extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123769d;

    /* renamed from: e */
    public C47350c f123770e;

    public C45839q(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51007qs2();
        bVar.f127067b = new C51150rs2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/getallrecvtmpmsgoption";
        bVar.f127069d = 1031;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123770e = a;
        ((C51007qs2) a.f127055a.f127080a).f140528d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123769d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneGetAllRecvTmpMsgOption", "do scene");
        return dispatch(gVar, this.f123770e, this);
    }

    public int getType() {
        return 1031;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneGetAllRecvTmpMsgOption", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f123769d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
