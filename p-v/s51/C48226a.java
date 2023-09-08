package s51;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C50759oz3;
import te3.C50893pz3;

/* renamed from: s51.a */
public final class C48226a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f129213d;

    /* renamed from: e */
    public C11385n f129214e;

    /* renamed from: f */
    public Long f129215f;

    /* renamed from: g */
    public C89349b f129216g;

    public C48226a(C89349b bVar) {
        C87412m.m108594g(bVar, "discountCouponParams");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C50759oz3();
        bVar2.f127067b = new C50893pz3();
        bVar2.f127068c = "/cgi-bin/mmpay-bin/mktsendaward";
        bVar2.f127069d = 2812;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        C47350c a = bVar2.mo72403a();
        this.f129213d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SendAwardRequest");
        ((C50759oz3) aVar).f139469d = bVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f129214e = nVar;
        return dispatch(gVar, this.f129213d, this);
    }

    public int getType() {
        return 2812;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneAcceptCoupon", "onGYNetEnd errType: %s, errCode: %s, errMsg: %s.", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C47465a aVar = this.f129213d.f127056b.f127083a;
        C50893pz3 pz32 = aVar instanceof C50893pz3 ? (C50893pz3) aVar : null;
        Object[] objArr = new Object[2];
        objArr[0] = pz32 != null ? Long.valueOf(pz32.f140064d) : null;
        objArr[1] = pz32 != null ? pz32.f140065e : null;
        Log.m105919d("MicroMsg.NetSceneAcceptCoupon", "ret[%s] msg[%s].", objArr);
        this.f129215f = pz32 != null ? Long.valueOf(pz32.f140064d) : null;
        this.f129216g = pz32 != null ? pz32.f140065e : null;
        C11385n nVar = this.f129214e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        } else {
            C87412m.m108603p("callback");
            throw null;
        }
    }
}
