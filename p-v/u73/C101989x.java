package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.net.URLDecoder;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONArray;
import p213oh.C11412b;
import te3.x25;
import te3.y25;

/* renamed from: u73.x */
public class C101989x extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f300306d;

    /* renamed from: e */
    public C47350c f300307e;

    /* renamed from: f */
    public x25 f300308f;

    /* renamed from: g */
    public y25 f300309g;

    /* renamed from: h */
    public C101968a0 f300310h;

    public C101989x(C101968a0 a0Var) {
        this.f300310h = a0Var;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1161;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/searchsuggestion";
        bVar.f127066a = new x25();
        bVar.f127067b = new y25();
        C47350c a = bVar.mo72403a();
        this.f300307e = a;
        x25 x25 = (x25) a.f127055a.f127080a;
        this.f300308f = x25;
        C101968a0 a0Var2 = this.f300310h;
        x25.f299826e = a0Var2.f300187b;
        x25.f299828g = (long) a0Var2.f300189d;
        x25.f299829h = C43471q.m46977a(6);
        x25 x252 = this.f300308f;
        x252.f299825d = this.f300310h.f300186a;
        x252.f299830i = C101987v0.m134273g();
        x25 x253 = this.f300308f;
        C101968a0 a0Var3 = this.f300310h;
        x253.f299832n = a0Var3.f300191f;
        x253.f299817A = a0Var3.f300207v;
        x253.f299823G = C101987v0.m134272f();
        try {
            JSONArray jSONArray = new JSONArray(this.f300310h.f300197l);
            this.f300308f.f299838t = new LinkedList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f300308f.f299838t.add(URLDecoder.decode(jSONArray.getString(i), "UTF-8"));
            }
        } catch (Exception e) {
            int i2 = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.WebSearch.NetSceneMMWebSuggest", e, "decode json error", new Object[0]);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f300306d = nVar;
        return dispatch(gVar, this.f300307e, this);
    }

    public int getType() {
        return 1161;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str};
        int i4 = C11412b.f33577a;
        Log.m105925i("MicroMsg.WebSearch.NetSceneMMWebSuggest", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f300309g = (y25) this.f300307e.f127056b.f127083a;
        C11385n nVar = this.f300306d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
