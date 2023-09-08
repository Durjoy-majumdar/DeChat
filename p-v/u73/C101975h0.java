package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49768hy;
import te3.u25;
import te3.v25;

/* renamed from: u73.h0 */
public class C101975h0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f300261d;

    /* renamed from: e */
    public C47350c f300262e;

    /* renamed from: f */
    public u25 f300263f = new u25();

    /* renamed from: g */
    public v25 f300264g;

    public C101975h0(List<String> list, int i, long j, List<C49768hy> list2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1948;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/websearchconfig";
        bVar.f127066a = new u25();
        bVar.f127067b = new v25();
        C47350c a = bVar.mo72403a();
        this.f300262e = a;
        u25 u25 = (u25) a.f127055a.f127080a;
        this.f300263f = u25;
        u25.f299564e = C43471q.m46977a(0);
        this.f300263f.f299565f = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        this.f300263f.f299568i = C43471q.m46979c();
        this.f300263f.f299569j = C101987v0.m134273g();
        this.f300263f.f299571o = C101987v0.m134272f();
        if (list != null) {
            this.f300263f.f299563d.addAll(list);
        }
        u25 u252 = this.f300263f;
        u252.f299566g = i;
        u252.f299567h = j;
        if (list2 != null) {
            u252.f299570n.addAll(list2);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f300261d = nVar;
        return dispatch(gVar, this.f300262e, this);
    }

    public int getType() {
        return 1948;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.WebSearch.NetSceneWebSearchConfig", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            v25 v25 = (v25) this.f300262e.f127056b.f127083a;
            this.f300264g = v25;
            if (v25 != null) {
                Log.m105927v("MicroMsg.WebSearch.NetSceneWebSearchConfig", "return data\n%s", v25.f143270d);
            }
            this.f300261d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f300261d.onSceneEnd(i2, i3, str, this);
    }
}
