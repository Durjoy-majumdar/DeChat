package j53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C50901q12;
import te3.C77989r12;
import te3.C78004vf2;

/* renamed from: j53.f */
public class C76387f extends C75123k0 {

    /* renamed from: d */
    public C77989r12 f223670d;

    /* renamed from: e */
    public C76388a f223671e;

    /* renamed from: f */
    public final C47350c f223672f;

    /* renamed from: g */
    public C11385n f223673g;

    /* renamed from: j53.f$a */
    public static class C76388a {

        /* renamed from: a */
        public int f223674a;

        /* renamed from: b */
        public String f223675b;

        /* renamed from: c */
        public boolean f223676c;

        /* renamed from: d */
        public String f223677d;

        /* renamed from: e */
        public String f223678e;

        /* renamed from: f */
        public String f223679f;

        /* renamed from: g */
        public String f223680g;

        /* renamed from: h */
        public String f223681h;

        /* renamed from: i */
        public String f223682i;

        /* renamed from: j */
        public ArrayList<C76389b> f223683j = new ArrayList<>();

        /* renamed from: k */
        public boolean f223684k;

        /* renamed from: a */
        public static C76388a m91812a(String str) {
            C76388a aVar = new C76388a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                aVar.f223674a = jSONObject.optInt("retcode");
                aVar.f223684k = jSONObject.optBoolean("disabled");
                aVar.f223675b = jSONObject.optString("entrance_name");
                aVar.f223676c = jSONObject.optBoolean("reddot");
                aVar.f223677d = jSONObject.optString("refund_lingqian_title");
                aVar.f223678e = jSONObject.optString("refund_lingqian_desc");
                aVar.f223679f = jSONObject.optString("refund_origin_title");
                aVar.f223680g = jSONObject.optString("refund_origin_desc");
                aVar.f223681h = jSONObject.optString("top_tip");
                aVar.f223682i = jSONObject.optString("refund_time_title");
                JSONArray optJSONArray = jSONObject.optJSONArray("refund_time");
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    ArrayList<C76389b> arrayList = aVar.f223683j;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    C76389b bVar = new C76389b();
                    bVar.f223685a = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    bVar.f223686b = jSONObject2.optString("desc");
                    bVar.f223687c = jSONObject2.optString("iconurl");
                    bVar.f223688d = jSONObject2.optString("iconmd5");
                    arrayList.add(bVar);
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.NetSceneGetHbRefundConfig", "doGetHbRefundConfig() Exception:%s", e.getMessage());
            }
            return aVar;
        }

        /* renamed from: b */
        public String mo106619b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("retcode", this.f223674a);
                jSONObject.put("disabled", this.f223684k);
                jSONObject.put("entrance_name", this.f223675b);
                jSONObject.put("reddot", this.f223676c);
                jSONObject.put("refund_lingqian_title", this.f223677d);
                jSONObject.put("refund_lingqian_desc", this.f223678e);
                jSONObject.put("refund_origin_title", this.f223679f);
                jSONObject.put("refund_origin_desc", this.f223680g);
                jSONObject.put("top_tip", this.f223681h);
                jSONObject.put("refund_time_title", this.f223682i);
                JSONArray jSONArray = new JSONArray();
                Iterator<C76389b> it = this.f223683j.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().mo106621a());
                }
                jSONObject.put("refund_time", jSONArray);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.NetSceneGetHbRefundConfig", "HbRefundConfig getJSONObjectString() Exception: %s", e.getMessage());
                return "";
            }
        }

        public String toString() {
            return "HbRefundConfig{retcode=" + this.f223674a + ", entrance_name='" + this.f223675b + '\'' + ", reddot=" + this.f223676c + ", refund_lingqian_title='" + this.f223677d + '\'' + ", refund_lingqian_desc='" + this.f223678e + '\'' + ", refund_origin_title='" + this.f223679f + '\'' + ", refund_origin_desc='" + this.f223680g + '\'' + ", top_tip='" + this.f223681h + '\'' + ", refund_time_title='" + this.f223682i + '\'' + ", refund_time=" + this.f223683j + ", disabled=" + this.f223684k + '}';
        }
    }

    /* renamed from: j53.f$b */
    public static class C76389b {

        /* renamed from: a */
        public String f223685a;

        /* renamed from: b */
        public String f223686b;

        /* renamed from: c */
        public String f223687c;

        /* renamed from: d */
        public String f223688d;

        public C76389b() {
        }

        /* renamed from: a */
        public JSONObject mo106621a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f223685a);
                jSONObject.put("desc", this.f223686b);
                jSONObject.put("iconurl", this.f223687c);
                jSONObject.put("iconmd5", this.f223688d);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.NetSceneGetHbRefundConfig", "HbRefundTimeParcelable getJSONObjectString() Exception: %s", e.getMessage());
            }
            return jSONObject;
        }

        public String toString() {
            return "HbRefundTimeParcelable{title='" + this.f223685a + '\'' + ", desc='" + this.f223686b + '\'' + ", iconurl='" + this.f223687c + '\'' + ", iconmd5='" + this.f223688d + '\'' + '}';
        }

        public C76389b(String str, String str2, String str3, String str4) {
            this.f223685a = str;
            this.f223686b = str2;
            this.f223687c = str3;
            this.f223688d = str4;
        }
    }

    public C76387f() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50901q12();
        bVar.f127067b = new C77989r12();
        bVar.f127068c = "/cgi-bin/mmpay-bin/ftfhb/gethbrefundconfig";
        bVar.f127069d = 1477;
        this.f223672f = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f223673g = nVar;
        return dispatch(gVar, this.f223672f, this);
    }

    public int getType() {
        return 1477;
    }

    /* renamed from: j1 */
    public C76388a mo106618j1() {
        if (this.f223671e == null) {
            C76388a aVar = new C76388a();
            this.f223671e = aVar;
            C77989r12 r122 = this.f223670d;
            aVar.f223674a = r122.f228142d;
            aVar.f223675b = r122.f228144f;
            aVar.f223676c = r122.f228145g;
            aVar.f223677d = r122.f228146h;
            aVar.f223678e = r122.f228147i;
            aVar.f223679f = r122.f228148j;
            aVar.f223680g = r122.f228149n;
            aVar.f223681h = r122.f228150o;
            aVar.f223682i = r122.f228151p;
            aVar.f223684k = r122.f228153r;
            aVar.f223683j = new ArrayList<>();
            Iterator<C78004vf2> it = this.f223670d.f228152q.iterator();
            while (it.hasNext()) {
                C78004vf2 next = it.next();
                this.f223671e.f223683j.add(new C76389b(next.f228313d, next.f228314e, next.f228315f, next.f228316g));
            }
        }
        return this.f223671e;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105929w("MicroMsg.NetSceneGetHbRefundConfig", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f223670d = (C77989r12) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f223673g.onSceneEnd(i2, i3, str, this);
    }
}
