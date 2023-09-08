package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import p213oh.C11412b;
import te3.r25;
import te3.s25;

/* renamed from: u73.g0 */
public class C52463g0 extends C101967a implements C1311n {

    /* renamed from: i */
    public C11385n f146591i;

    /* renamed from: j */
    public C47350c f146592j;

    /* renamed from: n */
    public C101968a0 f146593n;

    /* renamed from: o */
    public r25 f146594o;

    /* renamed from: p */
    public s25 f146595p = new s25();

    public C52463g0(C101968a0 a0Var) {
        this.f146593n = a0Var;
        this.f300177g = a0Var.f300210y;
        r25 r25 = new r25();
        this.f146594o = r25;
        r25.f140682e = 1;
        r25.f140681d = a0Var.f300181C;
        Object[] objArr = {Integer.valueOf(a0Var.f300191f), a0Var.f300180B};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.WebSearch.NetSceneWebSearchAiScanImageRetrieval", "create NetSceneWebSearchAiScanImageRetrieval scene:%s requestKey:%s", objArr);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1532;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image_retrieval";
        bVar.f127066a = this.f146594o;
        bVar.f127067b = this.f146595p;
        this.f146592j = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146591i = nVar;
        return dispatch(gVar, this.f146592j, this);
    }

    public int getType() {
        return 1532;
    }

    /* renamed from: j1 */
    public String mo73412j1() {
        return this.f146595p.f141284d;
    }

    /* renamed from: k1 */
    public int mo73413k1() {
        return 0;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str};
        int i4 = C11412b.f33577a;
        Log.m105925i("MicroMsg.WebSearch.NetSceneWebSearchAiScanImageRetrieval", "netId: %s errType:%s errCode:%s errMsg:%s", objArr);
        if (i2 == 0 || i3 == 0) {
            this.f146595p = (s25) this.f146592j.f127056b.f127083a;
        }
        this.f146591i.onSceneEnd(i2, i3, str, this);
    }
}
