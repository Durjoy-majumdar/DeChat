package hq0;

import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import org.json.JSONObject;

/* renamed from: hq0.c */
public final class C108256c {

    /* renamed from: a */
    public static final C108256c f324138a = new C108256c();

    /* renamed from: a */
    public final String mo158638a(MaterialModel materialModel, boolean z) {
        String jSONObject;
        MultiProcessMMKV a;
        String str;
        Log.m105924i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getSessionIdInner, materialModel: " + materialModel + ", remove: " + z);
        JSONObject e = C108257d.m146592e(materialModel);
        if (e == null || (jSONObject = e.toString()) == null || (a = C1510o.f10864a.mo1516a()) == null) {
            return null;
        }
        if (z) {
            String str2 = jSONObject + "#sessionId";
            str = a.getString(str2, (String) null);
            a.remove(str2);
        } else {
            str = a.getString(jSONObject + "#sessionId", (String) null);
        }
        if (str == null) {
            return null;
        }
        Log.m105924i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getReporterInner, sessionId: " + str);
        return str;
    }
}
