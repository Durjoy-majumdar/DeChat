package cl0;

import android.content.res.Resources;
import android.text.StaticLayout;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.util.HashMap;
import js0.C88020k;
import org.json.JSONObject;
import sn0.C90251c;

/* renamed from: cl0.i */
public class C80058i extends C82016a0<C82381f> {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "measureTextString";

    /* renamed from: cl0.i$a */
    public class C80059a extends HashMap<String, Object> {
        public C80059a(C80058i iVar, HashMap hashMap) {
            put("size", hashMap);
        }
    }

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("size");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("label");
        if (optJSONObject == null || optJSONObject2 == null) {
            return mo115109j("fail:invalid data");
        }
        int i = Integer.MAX_VALUE;
        int k = C88020k.m109560k(optJSONObject, "width", Integer.MAX_VALUE);
        if (k < 0) {
            k = Integer.MAX_VALUE;
        }
        int k2 = C88020k.m109560k(optJSONObject, "height", Integer.MAX_VALUE);
        if (k2 >= 0) {
            i = k2;
        }
        C80045a aVar = new C80045a(fVar.getContext() == null ? Resources.getSystem() : fVar.getContext().getResources(), k);
        C90251c.m112986b(aVar, optJSONObject2);
        StaticLayout staticLayout = aVar.f234486f.mo138734a().f291301k;
        float f = 0.0f;
        for (int i2 = 0; i2 < staticLayout.getLineCount(); i2++) {
            f = Math.max(f, staticLayout.getLineWidth(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("width", Float.valueOf(f / C88020k.m109556g()));
        hashMap.put("height", Float.valueOf(((float) Math.min(staticLayout.getHeight(), i)) / C88020k.m109556g()));
        return mo115112m("ok", new C80059a(this, hashMap));
    }
}
