package u73;

import c00.C39882k;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.j54;
import te3.k54;

/* renamed from: u73.z */
public class C101990z extends C101967a implements C1311n, C39882k {

    /* renamed from: i */
    public C47350c f300311i;

    /* renamed from: j */
    public C11385n f300312j;

    /* renamed from: n */
    public int f300313n = -1;

    /* renamed from: o */
    public k54 f300314o;

    public C101990z(String str, int i, String str2, String str3, int i2, String str4, int i3, String str5, String str6) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new j54();
        bVar.f127067b = new k54();
        bVar.f127068c = "/cgi-bin/mmsearch-bin/searchsimilaremoticon";
        bVar.f127069d = 2999;
        C47350c a = bVar.mo72403a();
        this.f300311i = a;
        j54 j54 = (j54) a.f127055a.f127080a;
        j54.f298489d = str;
        j54.f298490e = i;
        j54.f298492g = str2;
        j54.f298493h = str3;
        j54.f298496n = i2;
        j54.f298497o = str4;
        j54.f298494i = C43471q.m46977a(0);
        j54.f298491f = i3;
        j54.f298495j = C101987v0.m134273g();
        j54.f298500r = str6;
        j54.f298499q = str5;
        j54.f298501s = C101987v0.m134272f();
        Log.m105925i("MicroMsg.WebSearch.NetSceneQuerySimilarEmotion", "Md5 %s Offset %d SearchId %s SessionId %s Tab %s RequestId %s Scene %d", str, Integer.valueOf(i), str2, str3, Integer.valueOf(i2), str4, Integer.valueOf(i3));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f300312j = nVar;
        return dispatch(gVar, this.f300311i, this);
    }

    public int getType() {
        return 2999;
    }

    /* renamed from: j1 */
    public String mo73412j1() {
        return null;
    }

    /* renamed from: k1 */
    public int mo73413k1() {
        return 0;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.WebSearch.NetSceneQuerySimilarEmotion", "netId %d errType %d errCode %d %s errMsg", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f300314o = (k54) this.f300311i.f127056b.f127083a;
        this.f300312j.onSceneEnd(i2, i3, str, this);
    }
}
