package a23;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C52034xx1;
import te3.C52181yx1;

/* renamed from: a23.b */
public final class C0011b extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f10d;

    /* renamed from: e */
    public C52181yx1 f11e;

    /* renamed from: f */
    public C11385n f12f;

    public C0011b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52034xx1();
        bVar.f127067b = new C52181yx1();
        bVar.f127069d = 2972;
        bVar.f127068c = "/cgi-bin/spr-bin/getclientconffromserver";
        bVar.f127070e = 0;
        C47350c a = bVar.mo72403a();
        this.f10d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetClientConfFromServerReq");
        C52034xx1 xx12 = (C52034xx1) aVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGetClientConfFromServer", "do scene");
        this.f12f = nVar;
        return dispatch(gVar, this.f10d, this);
    }

    public int getType() {
        return 2972;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetClientConfFromServer", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetClientConfFromServerResp");
        this.f11e = (C52181yx1) aVar;
        C11385n nVar = this.f12f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
