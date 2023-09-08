package s03;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import te3.lh4;
import te3.mh4;

/* renamed from: s03.f */
public class C77599f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f226227d;

    /* renamed from: e */
    public C47350c f226228e;

    /* renamed from: f */
    public long f226229f = System.currentTimeMillis();

    public C77599f(JSONObject jSONObject) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2906;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
        bVar.f127066a = new lh4();
        bVar.f127067b = new mh4();
        C47350c a = bVar.mo72403a();
        this.f226228e = a;
        lh4 lh4 = (lh4) a.f127055a.f127080a;
        lh4.f227801d = jSONObject.optString("requestId", "");
        lh4.f227802e = jSONObject.optString("docId", "");
        lh4.f227803f = jSONObject.optString("content", "");
        lh4.f227804g = jSONObject.optString("replyId", "");
        lh4.f227805h = jSONObject.optString("subReplyId", "");
        lh4.f227806i = jSONObject.optString("docUrl", "");
        lh4.f227807j = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        lh4.f227808n = jSONObject.optString("searchId", "");
        lh4.f227809o = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        lh4.f227810p = jSONObject.optInt("subScene", 0);
        lh4.f227812r = jSONObject.optString(TPReportKeys.Common.COMMON_VID, "");
        lh4.f227811q = jSONObject.optString("byPass", "");
        lh4.f227813s = 0;
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", lh4.f227801d, lh4.f227802e, lh4.f227803f, lh4.f227804g, lh4.f227805h, lh4.f227806i, lh4.f227807j, lh4.f227808n, Integer.valueOf(lh4.f227809o), Integer.valueOf(lh4.f227810p));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f226227d = nVar;
        return dispatch(gVar, this.f226228e, this);
    }

    public int getType() {
        return 2906;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(System.currentTimeMillis() - this.f226229f));
        this.f226227d.onSceneEnd(i2, i3, str, this);
    }

    public C77599f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, int i3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2906;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
        bVar.f127066a = new lh4();
        bVar.f127067b = new mh4();
        C47350c a = bVar.mo72403a();
        this.f226228e = a;
        lh4 lh4 = (lh4) a.f127055a.f127080a;
        lh4.f227801d = str;
        lh4.f227802e = str2;
        lh4.f227803f = str3;
        lh4.f227804g = str4;
        lh4.f227805h = str5;
        lh4.f227806i = str6;
        lh4.f227807j = str7;
        lh4.f227808n = str8;
        lh4.f227809o = i;
        lh4.f227810p = i2;
        lh4.f227812r = str9;
        lh4.f227811q = str10;
        lh4.f227813s = i3;
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", str, str2, str3, str4, str5, str6, str7, str8, Integer.valueOf(i), Integer.valueOf(lh4.f227810p));
    }

    public C77599f(C77599f fVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2906;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
        bVar.f127066a = new lh4();
        bVar.f127067b = new mh4();
        C47350c a = bVar.mo72403a();
        this.f226228e = a;
        lh4 lh4 = (lh4) a.f127055a.f127080a;
        lh4 lh42 = (lh4) fVar.f226228e.f127055a.f127080a;
        String str = lh42.f227801d;
        lh4.f227801d = str;
        String str2 = lh42.f227802e;
        lh4.f227802e = str2;
        String str3 = lh42.f227803f;
        lh4.f227803f = str3;
        String str4 = lh42.f227804g;
        lh4.f227804g = str4;
        String str5 = lh42.f227805h;
        lh4.f227805h = str5;
        String str6 = lh42.f227806i;
        lh4.f227806i = str6;
        String str7 = lh42.f227807j;
        lh4.f227807j = str7;
        String str8 = lh42.f227808n;
        lh4.f227808n = str8;
        int i = lh42.f227809o;
        lh4.f227809o = i;
        lh4.f227810p = lh42.f227810p;
        lh4.f227812r = lh42.f227812r;
        lh4.f227811q = lh42.f227811q;
        lh4.f227813s = lh42.f227813s;
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", str, str2, str3, str4, str5, str6, str7, str8, Integer.valueOf(i), Integer.valueOf(lh4.f227810p));
    }
}
