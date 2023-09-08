package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48694ac2;
import te3.C52242zb2;

/* renamed from: p12.e */
public class C11798e extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f34512d = null;

    /* renamed from: e */
    public C48694ac2 f34513e = null;

    /* renamed from: f */
    public C11385n f34514f = null;

    public C11798e() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52242zb2();
        bVar.f127067b = new C48694ac2();
        bVar.f127069d = 831;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getwcopackageproductlist";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f34512d = a;
        C52242zb2 zb22 = (C52242zb2) a.f127055a.f127080a;
        Log.m105924i("MicroMsg.NetSceneIPCallGetPackageProductList", "NetSceneIPCallGetPackageProductList");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f34514f = nVar;
        return dispatch(gVar, this.f34512d, this);
    }

    public int getType() {
        return 831;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallGetPackageProductList", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f34513e = (C48694ac2) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f34514f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
