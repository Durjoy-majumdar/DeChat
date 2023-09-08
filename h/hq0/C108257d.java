package hq0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import my3.C34690i;
import my3.C61594j;
import my3.C61595o;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C36904l0;
import sx3.C36907w;

/* renamed from: hq0.d */
public final class C108257d {
    /* renamed from: a */
    public static final AppBrandOpenMaterialCollection m146588a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("materialModel");
            C87412m.m108593f(jSONObject2, "jsonObj.getJSONObject(OP…MODEL_KEY_MATERIAL_MODEL)");
            MaterialModel b = m146589b(jSONObject2);
            C87412m.m108591d(b);
            JSONArray jSONArray = jSONObject.getJSONArray("appBrandOpenMaterialModels");
            C61594j i = C61595o.m72301i(0, jSONArray.length());
            ArrayList arrayList = new ArrayList(C36907w.m41090l(i, 10));
            Iterator it = i.iterator();
            while (((C34690i) it).hasNext()) {
                Object obj = jSONArray.get(((C36904l0) it).mo59695a());
                C87412m.m108592e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                arrayList.add(m146591d((JSONObject) obj));
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("appBrandOpenMaterialDetailModels");
            C61594j i2 = C61595o.m72301i(0, jSONArray2.length());
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(i2, 10));
            Iterator it4 = i2.iterator();
            while (((C34690i) it4).hasNext()) {
                Object obj2 = jSONArray2.get(((C36904l0) it4).mo59695a());
                C87412m.m108592e(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                arrayList2.add(m146590c((JSONObject) obj2));
            }
            return new AppBrandOpenMaterialCollection(b, arrayList, arrayList2);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeOpenMaterialCollection, fail since " + e);
            return null;
        }
    }

    /* renamed from: b */
    public static final MaterialModel m146589b(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("mimeType");
            String optString2 = jSONObject.optString("materialExtension");
            String string = jSONObject.getString("materialPath");
            Map<String, String> map = MaterialModel.f267603g;
            Log.m105919d("MicroMsg.AppBrand.MaterialModel", "from, mimeType: %s, materialExtension: %s, materialPath: %s", optString, optString2, string);
            return new MaterialModel(optString, optString2, string);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeMaterialModel, fail since " + e);
            return null;
        }
    }

    /* renamed from: c */
    public static final AppBrandOpenMaterialDetailModel m146590c(JSONObject jSONObject) {
        try {
            AppBrandOpenMaterialModel d = m146591d(jSONObject);
            if (d == null) {
                return null;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("categories");
            C61594j i = C61595o.m72301i(0, jSONArray.length());
            ArrayList arrayList = new ArrayList(C36907w.m41090l(i, 10));
            Iterator it = i.iterator();
            while (it.hasNext()) {
                Object obj = jSONArray.get(((C36904l0) it).mo59695a());
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) obj);
            }
            double d2 = jSONObject.getDouble(FirebaseAnalytics.C113379b.SCORE);
            AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = new AppBrandOpenMaterialDetailModel(d.f311222d, d.f311223e, d.f311224f, d.f311225g, d.f311226h, arrayList, (float) d2, jSONObject.getString("functionDesc"));
            appBrandOpenMaterialDetailModel.f311218d.f311227i = d.f311227i;
            return appBrandOpenMaterialDetailModel;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeOpenMaterialDetailModel, fail since " + e);
            return null;
        }
    }

    /* renamed from: d */
    public static final AppBrandOpenMaterialModel m146591d(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("appId");
            int i = jSONObject.getInt("versionType");
            String string2 = jSONObject.getString("enterPath");
            String optString = jSONObject.optString("iconUrl");
            C87412m.m108593f(optString, LocaleUtil.ITALIAN);
            boolean z = true;
            if (optString.length() == 0) {
                optString = null;
            }
            String string3 = jSONObject.getString("functionName");
            String optString2 = jSONObject.optString("appName");
            C87412m.m108593f(optString2, LocaleUtil.ITALIAN);
            if (optString2.length() != 0) {
                z = false;
            }
            if (z) {
                optString2 = null;
            }
            AppBrandOpenMaterialModel appBrandOpenMaterialModel = new AppBrandOpenMaterialModel(string, i, string2, optString, string3);
            appBrandOpenMaterialModel.f311227i = optString2;
            return appBrandOpenMaterialModel;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeOpenMaterialModel, fail since " + e);
            return null;
        }
    }

    /* renamed from: e */
    public static final JSONObject m146592e(MaterialModel materialModel) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mimeType", materialModel.f267604d);
            jSONObject.put("materialExtension", materialModel.f267605e);
            jSONObject.put("materialPath", materialModel.f267606f);
            return jSONObject;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "serialize#MaterialModel, fail since " + e);
            return null;
        }
    }

    /* renamed from: f */
    public static final JSONObject m146593f(AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel) {
        try {
            AppBrandOpenMaterialModel appBrandOpenMaterialModel = appBrandOpenMaterialDetailModel.f311218d;
            C87412m.m108593f(appBrandOpenMaterialModel, "openMaterialDetailModel.model");
            JSONObject g = m146594g(appBrandOpenMaterialModel);
            if (g == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            List<String> list = appBrandOpenMaterialDetailModel.f311219e;
            C87412m.m108593f(list, "openMaterialDetailModel.categories");
            for (String put : list) {
                jSONArray.put(put);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            g.put("categories", jSONArray);
            g.put(FirebaseAnalytics.C113379b.SCORE, Float.valueOf(appBrandOpenMaterialDetailModel.f311220f));
            g.put("functionDesc", appBrandOpenMaterialDetailModel.f311221g);
            return g;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "serializeOpenMaterialDetailModel, fail since " + e);
            return null;
        }
    }

    /* renamed from: g */
    public static final JSONObject m146594g(AppBrandOpenMaterialModel appBrandOpenMaterialModel) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", appBrandOpenMaterialModel.f311222d);
            jSONObject.put("versionType", appBrandOpenMaterialModel.f311223e);
            jSONObject.put("enterPath", appBrandOpenMaterialModel.f311224f);
            jSONObject.put("iconUrl", appBrandOpenMaterialModel.f311225g);
            jSONObject.put("functionName", appBrandOpenMaterialModel.f311226h);
            jSONObject.put("appName", appBrandOpenMaterialModel.f311227i);
            return jSONObject;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "serializeOpenMaterialModel, fail since " + e);
            return null;
        }
    }
}
