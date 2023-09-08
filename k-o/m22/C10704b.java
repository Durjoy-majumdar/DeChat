package m22;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import fy3.C32228q;
import gy3.C87413o;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import p565ir.C60606n;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lm22/b;", "Lcom/tencent/mm/plugin/lite/api/c;", "<init>", "()V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: m22.b */
public final class C10704b extends C4770c {

    /* renamed from: m22.b$a */
    public static final class C10705a extends C87413o implements C32228q<String, String, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f32146d;

        /* renamed from: e */
        public final /* synthetic */ C10704b f32147e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10705a(String str, C10704b bVar) {
            super(3);
            this.f32146d = str;
            this.f32147e = bVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int intValue = ((Number) obj3).intValue();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("ret", Integer.valueOf(intValue));
                jSONObject.putOpt("url", str);
                jSONObject.putOpt("requestId", this.f32146d);
                this.f32147e.f19815f.mo5692d(jSONObject, false);
            } catch (JSONException e) {
                Log.printErrStackTrace("LiteAppJsApiGetFinderLivePreviewUrl", e, "", new Object[0]);
                this.f32147e.f19815f.mo5689a("fail");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiGetFinderLivePreviewUrl", "invoke getFinderLivePreviewUrl");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        String optString = jSONObject.optString("encryptedId");
        String optString2 = jSONObject.optString("nonceId");
        String optString3 = jSONObject.optString("requestId");
        int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (optInt == 0) {
            optInt = 114;
        }
        try {
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85012JC(optString, optString2, optInt, new C10705a(optString3, this));
        } catch (Exception e) {
            Log.printErrStackTrace("LiteAppJsApiGetFinderLivePreviewUrl", e, "", new Object[0]);
            this.f19815f.mo5689a("fail");
        }
    }
}
