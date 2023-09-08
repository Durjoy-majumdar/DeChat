package t71;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49397f92;
import te3.C49534g92;

/* renamed from: t71.k */
public final class C48549k extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129864d;

    /* renamed from: e */
    public C47350c f129865e;

    /* renamed from: f */
    public C49534g92 f129866f;

    public C48549k(C49397f92 f922) {
        C87412m.m108594g(f922, "request");
        Log.m105924i("MicroMsg.Sport.NetSceneGetSportHistory", "create NetSceneGetSportHistory, " + f922.f133362d);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4835;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/rank/getsportrecordhistory";
        bVar.f127066a = f922;
        bVar.f127067b = new C49534g92();
        this.f129865e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129864d = nVar;
        return dispatch(gVar, this.f129865e, this);
    }

    public int getType() {
        return 4835;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C47350c cVar = this.f129865e;
            C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetSportRecordHistoryResponse");
            this.f129866f = (C49534g92) aVar;
        }
        C11385n nVar = this.f129864d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
