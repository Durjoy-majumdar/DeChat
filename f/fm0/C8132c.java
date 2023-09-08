package fm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: fm0.c */
public class C8132c extends C82016a0<C83780d1> {
    public static int CTRL_INDEX = 71;
    public static String NAME = "getCurrentRoute";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("route", ((C83780d1) fVar).mo116162Q0());
        return mo115112m("ok", hashMap);
    }
}
