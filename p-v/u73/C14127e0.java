package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import ng2.C11163e;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C48884bn2;
import te3.C49051cu2;
import te3.kp4;
import te3.kz4;
import te3.lz4;

/* renamed from: u73.e0 */
public class C14127e0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f39527d;

    /* renamed from: e */
    public C11385n f39528e;

    /* renamed from: f */
    public int f39529f;

    /* renamed from: g */
    public int f39530g;

    /* renamed from: h */
    public int f39531h = -1;

    /* renamed from: i */
    public C14133n0 f39532i;

    public C14127e0(Map<String, Object> map, int i, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new kz4();
        bVar.f127067b = new lz4();
        bVar.f127068c = "/cgi-bin/mmux-bin/wxaapp/weappsearchguide";
        bVar.f127069d = 1866;
        this.f39527d = bVar.mo72403a();
        this.f39530g = i2;
        this.f39529f = i;
        C48884bn2 g = C101987v0.m134273g();
        kz4 kz4 = (kz4) this.f39527d.f127055a.f127080a;
        if (g != null) {
            kz4.f137107d = (double) g.f131220e;
            kz4.f137108e = (double) g.f131219d;
        }
        kz4.f137109f = C43471q.m46979c();
        kz4.f137110g = C43471q.m46977a(3);
        kz4.f137111h = C43471q.m46982f(map, "statSessionId");
        kz4.f137112i = C43471q.m46981e(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        String f = C43471q.m46982f(map, "extReqParams");
        if (!Util.isNullOrNil(f)) {
            try {
                JSONArray jSONArray = new JSONArray(f);
                kz4.f137113j = new LinkedList<>();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i3);
                    kp4 kp4 = new kp4();
                    kp4.f136975d = jSONObject.optString("key", "");
                    kp4.f136976e = jSONObject.optLong("uintValue", 0);
                    kp4.f136977f = jSONObject.optString("textValue", "");
                    kz4.f137113j.push(kp4);
                }
            } catch (Exception unused) {
            }
        }
        Log.m105925i("MicroMsg.WebSearch.NetSceneWeAppSearchGuide", "weappsearchguide req, version = %d, sessionId = %s, scene = %d, extParam = %s", Integer.valueOf(kz4.f137110g), kz4.f137111h, Integer.valueOf(kz4.f137112i), f);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f39528e = nVar;
        return dispatch(gVar, this.f39527d, this);
    }

    public int getType() {
        return this.f39527d.f127058d;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        byte[] bArr2;
        Log.m105925i("MicroMsg.WebSearch.NetSceneWeAppSearchGuide", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C14133n0 n0Var = new C14133n0(this.f39529f, (lz4) this.f39527d.f127056b.f127083a, this.f39530g);
        this.f39532i = n0Var;
        String a = C11163e.m11041a();
        C49051cu2 cu22 = new C49051cu2();
        cu22.f131964d = n0Var.f39539a;
        cu22.f131965e = n0Var.f39540b;
        cu22.f131966f = n0Var.f39541c;
        cu22.f131967g = n0Var.f39542d;
        cu22.f131968h = n0Var.f39543e;
        try {
            bArr2 = cu22.toByteArray();
        } catch (IOException unused) {
            bArr2 = null;
        }
        if (bArr2 != null) {
            C86009m1 m1Var = new C86009m1(a, C14133n0.m13465a(n0Var.f39539a));
            if (!m1Var.mo119974l().mo119967g()) {
                m1Var.mo119974l().mo119987x();
            }
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            }
            C86013q1.m106438T(m1Var.mo119971i(), bArr2, 0, bArr2.length);
            Log.m105925i("MicroMsg.WebSearch.SearchGuideCacheObj", "SearchGuideCacheObj saved, scene:%d", Integer.valueOf(n0Var.f39539a));
        } else {
            Log.m105929w("MicroMsg.WebSearch.SearchGuideCacheObj", "SearchGuideCacheObj toBytes fail, scene:%d!", Integer.valueOf(n0Var.f39539a));
        }
        C11385n nVar = this.f39528e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
