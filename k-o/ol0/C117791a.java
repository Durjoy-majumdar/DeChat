package ol0;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.a */
public class C117791a {
    /* renamed from: a */
    public static void m166200a(C118080q qVar, JSONObject jSONObject) {
        C118080q.C118093j mapCenter = qVar.getMapCenter();
        if (mapCenter != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("latitude", mapCenter.f353022a);
                jSONObject2.put("longitude", mapCenter.f353023b);
                jSONObject.remove("centerLocation");
                jSONObject.put("centerLocation", jSONObject2);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AppBrandMapUtils", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static void m166201b(C118080q qVar, JSONObject jSONObject) {
        C118080q.C118084b0 projection = qVar.getProjection();
        if (projection == null) {
            Log.m105920e("MicroMsg.AppBrandMapUtils", "projection is  null");
        }
        C118080q.C118086c0 c0Var = projection.f352992a;
        if (c0Var == null) {
            Log.m105920e("MicroMsg.AppBrandMapUtils", "visibleRegion is  null");
        }
        C118080q.C118094k kVar = c0Var.f353000a;
        if (kVar == null) {
            Log.m105920e("MicroMsg.AppBrandMapUtils", "latLngBounds is  null");
        }
        C118080q.C118093j jVar = kVar.f353024a;
        C118080q.C118093j jVar2 = kVar.f353025b;
        JSONObject jSONObject2 = new JSONObject();
        if (jVar != null) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("latitude", jVar.f353022a);
                jSONObject3.put("longitude", jVar.f353023b);
                jSONObject2.put("southwest", jSONObject3);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AppBrandMapUtils", e, "", new Object[0]);
                return;
            }
        }
        if (jVar2 != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("latitude", jVar2.f353022a);
            jSONObject4.put("longitude", jVar2.f353023b);
            jSONObject2.put("northeast", jSONObject4);
        }
        jSONObject.remove("region");
        jSONObject.put("region", jSONObject2);
    }
}
