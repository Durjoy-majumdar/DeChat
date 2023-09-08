package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49685hc0;
import te3.C49826ic0;

/* renamed from: eb1.t */
public class C45646t extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123435d;

    /* renamed from: e */
    public C47350c f123436e;

    /* renamed from: f */
    public String f123437f = "";

    public C45646t(String str, long j, String str2, String str3, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49685hc0();
        bVar.f127067b = new C49826ic0();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/facevideobindbioid";
        bVar.f127069d = 1197;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123436e = a;
        this.f123437f = str;
        C49685hc0 hc02 = (C49685hc0) a.f127055a.f127080a;
        hc02.f134563f = str2;
        hc02.f134561d = j;
        hc02.f134564g = str4;
        hc02.f134562e = str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123435d = nVar;
        return dispatch(gVar, this.f123436e, this);
    }

    public int getType() {
        return 1197;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneFaceThirdBindVideo", "hy:  errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49826ic0 ic02 = (C49826ic0) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f123435d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
