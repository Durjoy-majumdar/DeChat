package s03;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import te3.nh4;
import te3.oh4;
import te3.xh4;

/* renamed from: s03.j */
public class C22291j extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f63195d;

    /* renamed from: e */
    public C47350c f63196e;

    /* renamed from: f */
    public long f63197f = System.currentTimeMillis();

    /* renamed from: g */
    public xh4 f63198g;

    public C22291j(JSONObject jSONObject) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2802;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/topstorypluginsetcomment";
        bVar.f127066a = new nh4();
        bVar.f127067b = new oh4();
        C47350c a = bVar.mo72403a();
        this.f63196e = a;
        nh4 nh4 = (nh4) a.f127055a.f127080a;
        nh4.f64318d = jSONObject.optString("docId", "");
        nh4.f64319e = jSONObject.optString("commentId", "");
        nh4.f64320f = jSONObject.optInt("opType", 0);
        nh4.f64321g = jSONObject.optString("requestId", "");
        nh4.f64322h = jSONObject.optString("content", "");
        nh4.f64323i = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        nh4.f64324j = jSONObject.optString("searchId", "");
        nh4.f64325n = jSONObject.optInt("subScene", 0);
        nh4.f64326o = jSONObject.optString(TPReportKeys.Common.COMMON_VID, "");
        nh4.f64327p = jSONObject.optString("byPass", "");
        nh4.f64328q = 0;
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStorySetComment", "TopStoryPluginSetCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", nh4.f64318d, nh4.f64319e, Integer.valueOf(nh4.f64320f), nh4.f64321g, nh4.f64322h, Integer.valueOf(nh4.f64323i), nh4.f64324j, Integer.valueOf(nh4.f64325n), nh4.f64326o, nh4.f64327p);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f63195d = nVar;
        return dispatch(gVar, this.f63196e, this);
    }

    public int getType() {
        return 2802;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStorySetComment", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(System.currentTimeMillis() - this.f63197f));
        this.f63195d.onSceneEnd(i2, i3, str, this);
    }

    public C22291j(xh4 xh4, String str, int i, String str2, int i2, String str3, int i3, String str4, String str5, int i4) {
        this.f63198g = xh4;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2802;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/topstorypluginsetcomment";
        bVar.f127066a = new nh4();
        bVar.f127067b = new oh4();
        C47350c a = bVar.mo72403a();
        this.f63196e = a;
        nh4 nh4 = (nh4) a.f127055a.f127080a;
        nh4.f64318d = str;
        nh4.f64319e = "";
        nh4.f64320f = i;
        nh4.f64321g = str2;
        nh4.f64322h = "";
        nh4.f64323i = i2;
        nh4.f64324j = str3;
        nh4.f64325n = i3;
        nh4.f64326o = str4;
        nh4.f64327p = str5;
        nh4.f64328q = i4;
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStorySetComment", "TopStoryPluginSetCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", str, "", Integer.valueOf(i), nh4.f64321g, nh4.f64322h, Integer.valueOf(nh4.f64323i), nh4.f64324j, Integer.valueOf(nh4.f64325n), nh4.f64326o, nh4.f64327p);
    }
}
