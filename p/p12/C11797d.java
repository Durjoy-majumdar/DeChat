package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51951xb2;
import te3.C52095yb2;

/* renamed from: p12.d */
public class C11797d extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f34509d = null;

    /* renamed from: e */
    public C52095yb2 f34510e = null;

    /* renamed from: f */
    public C11385n f34511f;

    public C11797d() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51951xb2();
        bVar.f127067b = new C52095yb2();
        bVar.f127069d = 288;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getwcogiftcardlist";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f34509d = a;
        C51951xb2 xb22 = (C51951xb2) a.f127055a.f127080a;
        Log.m105924i("MicroMsg.NetSceneIPCallGetGiftCardList", "NetSceneIPCallGetGiftCardList");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f34511f = nVar;
        return dispatch(gVar, this.f34509d, this);
    }

    public int getType() {
        return 288;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallGetGiftCardList", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f34510e = (C52095yb2) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f34511f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
