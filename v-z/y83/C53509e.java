package y83;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: y83.e */
public class C53509e implements C53508d {

    /* renamed from: y83.e$a */
    public class C53510a extends C43620m2.C5947b {

        /* renamed from: a */
        public final /* synthetic */ C53505a f150458a;

        public C53510a(C53509e eVar, C53505a aVar) {
            this.f150458a = aVar;
        }

        /* renamed from: a */
        public void mo6945a(String str, JSONObject jSONObject) {
            Bundle bundle = new Bundle();
            bundle.putString("err_msg", str);
            bundle.putString("data", jSONObject != null ? jSONObject.toString() : "");
            this.f150458a.onCallback(bundle);
        }

        /* renamed from: b */
        public void mo6946b(String str, JSONObject jSONObject) {
            Bundle bundle = new Bundle();
            bundle.putString("event", str);
            bundle.putString("data", jSONObject != null ? jSONObject.toString() : "");
            this.f150458a.mo41060a(bundle);
        }
    }

    /* renamed from: a */
    public void mo41063a(Context context, Bundle bundle, C53505a aVar) {
        String string = bundle.getString("jsapi_name");
        String string2 = bundle.getString("data");
        if (string == null) {
            Log.m105920e("MicroMsg.JsApiMMActivityTask", "jsapi is null");
            aVar.onCallback(new Bundle());
            return;
        }
        try {
            ((C43620m2) Class.forName(string).newInstance()).mo5384d(context, string2, new C53510a(this, aVar));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiMMActivityTask", e, "", new Object[0]);
            aVar.onCallback(new Bundle());
        }
    }
}
