package sn2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49952j63;
import te3.C50088k63;

/* renamed from: sn2.e */
public class C48434e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129608d;

    /* renamed from: e */
    public C47350c f129609e;

    public C48434e(int i, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49952j63();
        bVar.f127067b = new C50088k63();
        bVar.f127068c = "/cgi-bin/mmoctv/optvhist";
        bVar.f127069d = 1740;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129609e = a;
        C49952j63 j632 = (C49952j63) a.f127055a.f127080a;
        j632.f135900d = i;
        j632.f135901e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129608d = nVar;
        return dispatch(gVar, this.f129609e, this);
    }

    public int getType() {
        return 1740;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneOpTvHist", "onGYNetEnd [%d,%d]", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f129608d.onSceneEnd(i2, i3, str, this);
    }
}
