package fy1;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5984s1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53099d;
import te3.C50187kw2;

/* renamed from: fy1.m */
public class C45863m extends C45845a {

    /* renamed from: fy1.m$a */
    public class C45864a extends C53099d {
        public C45864a(C45863m mVar) {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "friend");
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "menu:share:appmessage";
        }
    }

    public C45863m(int i) {
        super(i);
    }

    /* renamed from: b */
    public void mo71307b(Context context, C43658n nVar, C50187kw2 kw22) {
        C5984s1.f22236f = 0;
        nVar.f148259i.mo73815b(new C45864a(this));
    }
}
