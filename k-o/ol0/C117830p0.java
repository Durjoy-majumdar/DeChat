package ol0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import jk0.C87981f;
import org.json.JSONArray;
import org.json.JSONObject;
import pl0.C118080q;
import pl0.C118116u;
import pl0.C118117v;
import pl0.C89367t;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: ol0.p0 */
public class C117830p0 extends C87981f {
    public static final int CTRL_INDEX = 4;
    public static final String NAME = "updateMap";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        try {
            return jSONObject.optInt("mapId");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiUpdateMap", "get mapId error, exception : %s", e);
            return -1;
        }
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C82520h hVar2 = hVar;
        JSONObject jSONObject2 = jSONObject;
        C89367t.m111696a(3);
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiUpdateMap", "data is null");
            return false;
        }
        String appId = hVar.getAppId();
        Log.m105925i("MicroMsg.JsApiUpdateMap", "updateView appId:%s viewId:%d data:%s", appId, Integer.valueOf(i), jSONObject2);
        C118080q b = C118117v.m166643b(appId, C118116u.m166637b(hVar2, jSONObject2));
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiUpdateMap", "mapView is null, return");
            return false;
        }
        if (jSONObject2.has("enableZoom")) {
            b.mo182826W(jSONObject2.optBoolean("enableZoom", true));
        }
        if (jSONObject2.has("enableScroll")) {
            b.mo182830a(jSONObject2.optBoolean("enableScroll", true));
        }
        if (jSONObject2.has("enableRotate")) {
            b.mo182822S(jSONObject2.optBoolean("enableRotate", true));
        }
        if (jSONObject2.has("showCompass")) {
            b.mo182834c0(jSONObject2.optBoolean("showCompass", false));
        }
        if (jSONObject2.has("enable3D")) {
            b.setBuilding3dEffectEnable(jSONObject2.optBoolean("enable3D", false));
        }
        if (jSONObject2.has("enableOverlooking")) {
            b.mo182809K(jSONObject2.optBoolean("enableOverlooking", false));
        }
        if (jSONObject2.has("enableAutoMaxOverlooking")) {
            b.enableAutoMaxOverlooking(jSONObject2.optBoolean("enableAutoMaxOverlooking", false));
        }
        if (jSONObject2.has("enableSatellite")) {
            b.mo182858l0(jSONObject2.optBoolean("enableSatellite", false));
        }
        if (jSONObject2.has("enableTraffic")) {
            b.mo182803H(jSONObject2.optBoolean("enableTraffic", false));
        }
        if (jSONObject2.has("enableIndoor")) {
            b.mo182856k0(jSONObject2.optBoolean("enableIndoor", false));
        }
        if (jSONObject2.has("enableIndoorLevelPick")) {
            b.enableIndoorLevelPick(jSONObject2.optBoolean("enableIndoorLevelPick", false));
        }
        if (jSONObject2.has("showLocation")) {
            b.mo182882t0(jSONObject2.optBoolean("showLocation", false));
        }
        if (jSONObject2.has("showScale")) {
            b.mo182868p0(jSONObject2.optBoolean("showScale", true));
        }
        if (jSONObject2.has("styleId")) {
            b.setMapStyle(jSONObject2.optInt("styleId", 0));
        }
        if (jSONObject2.has("maxScale")) {
            b.setMaxZoomLevel((int) Util.getFloat(jSONObject2.optString("maxScale"), 20.0f));
        }
        if (jSONObject2.has("minScale")) {
            b.setMinZoomLevel((int) Util.getFloat(jSONObject2.optString("minScale"), 3.0f));
        }
        if (jSONObject2.has("enablePoi")) {
            b.setPoisEnabled(jSONObject2.optBoolean("enablePoi", true));
        }
        if (jSONObject2.has("enableBuilding")) {
            b.mo182887x(jSONObject2.optBoolean("enableBuilding", true));
        }
        try {
            if (jSONObject2.has("covers")) {
                b.mo182799F();
                JSONArray jSONArray = new JSONArray(jSONObject2.optString("covers"));
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray.get(i2);
                    double d = Util.getDouble(jSONObject3.optString("latitude"), 0.0d);
                    JSONArray jSONArray2 = jSONArray;
                    double d2 = Util.getDouble(jSONObject3.optString("longitude"), 0.0d);
                    String nO = ((C91759b) hVar2.mo109668l(C91759b.class)).mo115838nO(hVar2, jSONObject3.optString("iconPath"));
                    float optDouble = (float) jSONObject3.optDouble(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, 0.0d);
                    C118080q.C118087d dVar = new C118080q.C118087d();
                    dVar.f353001a = d;
                    dVar.f353002b = d2;
                    dVar.f353003c = nO;
                    dVar.f353004d = optDouble;
                    b.mo182854j0(dVar, (C91755a) hVar2.mo109668l(C91755a.class));
                    i2++;
                    jSONArray = jSONArray2;
                }
            }
            if (jSONObject2.has("scale") || jSONObject2.has(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION) || jSONObject2.has("skew") || jSONObject2.has("centerLatitude") || jSONObject2.has("centerLongitude")) {
                float optDouble2 = (float) jSONObject2.optDouble("scale", -1.0d);
                float optDouble3 = (float) jSONObject2.optDouble("skew", -1.0d);
                C118080q qVar = b;
                qVar.mo182796D(Util.getDouble(jSONObject2.optString("centerLatitude", "-1"), -1.0d), Util.getDouble(jSONObject2.optString("centerLongitude", "-1"), -1.0d), -1.0f, -1.0f, -1.0f, false);
                qVar.mo182796D(-1.0d, -1.0d, optDouble2, (float) jSONObject2.optDouble(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, -1.0d), optDouble3, true);
            }
            C89367t.m111696a(4);
            return true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiUpdateMap", "parse covers error, exception : %s", e);
            return false;
        }
    }
}
