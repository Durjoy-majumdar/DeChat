package t71;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51131rn2;
import te3.C51271sn2;

/* renamed from: t71.m */
public class C48551m extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129871d = null;

    /* renamed from: e */
    public C47350c f129872e = null;

    public C48551m(String str, String str2, int i, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51131rn2();
        bVar.f127067b = new C51271sn2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/rank/addlike";
        bVar.f127069d = 1041;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129872e = a;
        C51131rn2 rn22 = (C51131rn2) a.f127055a.f127080a;
        rn22.f141048e = str2;
        rn22.f141047d = str;
        rn22.f141049f = i;
        rn22.f141050g = str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129871d = nVar;
        return dispatch(gVar, this.f129872e, this);
    }

    public int getType() {
        return 1041;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneUpdateLikeStatus", "hy: end. errType: %d, errCode: %d, errMsg: %s, ", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f129871d.onSceneEnd(i2, i3, str, this);
    }
}
