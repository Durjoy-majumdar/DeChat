package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48838bc2;
import te3.C48984cc2;

/* renamed from: p12.f */
public class C11799f extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f34515d = null;

    /* renamed from: e */
    public C48984cc2 f34516e = null;

    /* renamed from: f */
    public boolean f34517f = true;

    /* renamed from: g */
    public C11385n f34518g;

    public C11799f(String str, String str2) {
        if (Util.isNullOrNil(str2)) {
            this.f34517f = true;
            str2 = "";
        } else {
            this.f34517f = false;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48838bc2();
        bVar.f127067b = new C48984cc2();
        bVar.f127069d = v2helper.EMethodGetNetworkQuality;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getwcoproductlist";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f34515d = a;
        C48838bc2 bc22 = (C48838bc2) a.f127055a.f127080a;
        bc22.f131044d = str;
        bc22.f131045e = str2;
        Log.m105924i("MicroMsg.NetSceneIPCallGetProductList", "NetSceneIPCallGetProductList");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f34518g = nVar;
        return dispatch(gVar, this.f34515d, this);
    }

    public int getType() {
        return v2helper.EMethodGetNetworkQuality;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallGetProductList", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f34516e = (C48984cc2) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f34518g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
