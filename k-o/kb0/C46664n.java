package kb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.t75;
import te3.u75;

/* renamed from: kb0.n */
public class C46664n extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f125633d;

    /* renamed from: e */
    public C11385n f125634e;

    public C46664n(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new t75();
        bVar.f127067b = new u75();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxausrevent/wxatmplcomplaint";
        bVar.f127069d = 1198;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125633d = a;
        ((t75) a.f127055a.f127080a).f142027d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGetServiceNotifyOptions", "doScene");
        this.f125634e = nVar;
        return dispatch(gVar, this.f125633d, this);
    }

    public int getType() {
        return 1198;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetServiceNotifyOptions", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f125634e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
