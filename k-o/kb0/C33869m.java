package kb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50796p82;
import te3.C50927q82;

/* renamed from: kb0.m */
public class C33869m extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f91518d;

    /* renamed from: e */
    public C11385n f91519e;

    public C33869m(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50796p82();
        bVar.f127067b = new C50927q82();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxausrevent/getservicenotifyoptions";
        bVar.f127069d = 1145;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f91518d = a;
        ((C50796p82) a.f127055a.f127080a).f139635d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGetServiceNotifyOptions", "doScene");
        this.f91519e = nVar;
        return dispatch(gVar, this.f91518d, this);
    }

    public int getType() {
        return 1145;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetServiceNotifyOptions", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f91519e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
