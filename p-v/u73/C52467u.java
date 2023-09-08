package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import p213oh.C11412b;
import te3.C49959j82;
import te3.C50096k82;

/* renamed from: u73.u */
public class C52467u extends C101967a implements C1311n {

    /* renamed from: i */
    public C11385n f146604i;

    /* renamed from: j */
    public C47350c f146605j;

    /* renamed from: n */
    public C50096k82 f146606n;

    public C52467u(C101968a0 a0Var) {
        this.f300177g = a0Var.f300210y;
        C49959j82 j822 = new C49959j82();
        j822.f135918d = a0Var.f300191f;
        j822.f135919e = a0Var.f300180B;
        j822.f135920f = C43471q.m46977a(0);
        Object[] objArr = {Integer.valueOf(a0Var.f300191f), a0Var.f300180B};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.WebSearch.NetSceneGetSearchResult", "create NetSceneGetSearchResult scene:%s requestKey:%s", objArr);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1003;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/getsearchresult";
        bVar.f127066a = j822;
        bVar.f127067b = new C50096k82();
        this.f146605j = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146604i = nVar;
        return dispatch(gVar, this.f146605j, this);
    }

    public int getType() {
        return 1003;
    }

    /* renamed from: j1 */
    public String mo73412j1() {
        C50096k82 k822 = this.f146606n;
        if (k822 != null) {
            return k822.f136613d;
        }
        return null;
    }

    /* renamed from: k1 */
    public int mo73413k1() {
        return 0;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str};
        int i4 = C11412b.f33577a;
        Log.m105925i("MicroMsg.WebSearch.NetSceneGetSearchResult", "netId: %s errType:%s errCode:%s errMsg:%s", objArr);
        if (i2 == 0 && i3 == 0) {
            this.f146606n = (C50096k82) this.f146605j.f127056b.f127083a;
        }
        this.f146604i.onSceneEnd(i2, i3, str, this);
    }
}
