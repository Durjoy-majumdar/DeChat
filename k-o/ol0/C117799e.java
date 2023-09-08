package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88020k;
import org.json.JSONArray;
import org.json.JSONObject;
import pl0.C118080q;
import pl0.C118116u;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: ol0.e */
public class C117799e extends C117793b {
    public static final int CTRL_INDEX = 140;
    public static final String NAME = "addMapControls";

    /* renamed from: ol0.e$a */
    public class C117800a implements C118080q.C118100o {

        /* renamed from: a */
        public final /* synthetic */ int f352328a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f352329b;

        public C117800a(C117799e eVar, int i, C82381f fVar) {
            this.f352328a = i;
            this.f352329b = fVar;
        }
    }

    /* renamed from: ol0.e$b */
    public static class C117801b extends C82919r2 {
        private static final int CTRL_INDEX = 143;
        private static final String NAME = "onMapControlClick";

        public C117801b(C117800a aVar) {
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        Class cls = C91755a.class;
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiAddMapControls", "data is null");
            fVar2.mo109647a(i2, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105919d("MicroMsg.JsApiAddMapControls", "data:%s", jSONObject.toString());
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiAddMapControls", "mapView is null, return");
            fVar2.mo109647a(i2, mo115109j("fail:mapview is null"));
            return;
        }
        try {
            if (jSONObject2.has("controls")) {
                y.mo182872r0();
                JSONArray jSONArray = new JSONArray(jSONObject2.optString("controls"));
                int i3 = 0;
                while (i3 < jSONArray.length()) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray.get(i3);
                    C118080q.C118085c cVar = new C118080q.C118085c();
                    cVar.f352997e = ((C91759b) fVar2.mo109668l(C91759b.class)).mo115838nO(fVar2, jSONObject3.optString("iconPath"));
                    cVar.f352998f = jSONObject3.optBoolean("clickable");
                    cVar.f352999g = jSONObject3.optString("data");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("position");
                    int k = C88020k.m109560k(jSONObject4, "left", 0);
                    int k2 = C88020k.m109560k(jSONObject4, "top", 0);
                    cVar.f352993a = k;
                    cVar.f352994b = k2;
                    if (jSONObject4.has("width")) {
                        cVar.f352995c = C88020k.m109560k(jSONObject4, "width", 0);
                    }
                    if (jSONObject4.has("height")) {
                        cVar.f352996d = C88020k.m109560k(jSONObject4, "height", 0);
                    }
                    if (jSONObject3.optBoolean("clickable")) {
                        y.mo182881t(cVar, new C117800a(this, C118116u.m166638c(jSONObject), fVar2), (C91755a) fVar2.mo109668l(cls));
                    } else {
                        y.mo182881t(cVar, (C118080q.C118100o) null, (C91755a) fVar2.mo109668l(cls));
                    }
                    i3++;
                    JSONObject jSONObject5 = jSONObject;
                    int i4 = i;
                }
            }
            mo182575w(fVar, i, mo115109j("ok"), true, y.mo182849h());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiAddMapControls", "parse controls error, exception : %s", e);
            mo182575w(fVar, i, mo115109j("fail:internal error"), false, y.mo182849h());
        }
    }
}
