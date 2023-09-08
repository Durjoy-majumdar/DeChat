package ol0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jk0.C87978d;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p224ra.C89909e;
import pl0.C118080q;
import pl0.C118114r;
import pl0.C118116u;
import pl0.C118117v;
import pl0.C89367t;

/* renamed from: ol0.w */
public class C117844w extends C87978d {
    public static final int CTRL_INDEX = 2;
    public static final String NAME = "insertMap";

    /* renamed from: ol0.w$a */
    public class C117845a implements C118080q.C118112y {

        /* renamed from: a */
        public final /* synthetic */ int f352347a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f352348b;

        public C117845a(C117844w wVar, int i, C82520h hVar) {
            this.f352347a = i;
            this.f352348b = hVar;
        }

        /* renamed from: a */
        public void mo182585a(C118080q.C118090g gVar) {
            C117859o oVar = new C117859o();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mapId", this.f352347a);
                if (gVar != null) {
                    jSONObject.put("buildingId", gVar.f353011a);
                    jSONObject.put("buildingName", gVar.f353012b);
                    List<C118080q.C118091h> list = gVar.f353013c;
                    if (list != null && list.size() > 0) {
                        JSONArray jSONArray = new JSONArray();
                        for (C118080q.C118091h hVar : gVar.f353013c) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", hVar.f353015a);
                            jSONArray.put(jSONObject2);
                        }
                        jSONObject.put("floorList", jSONArray);
                    }
                    jSONObject.put("floorIndex", gVar.f353014d);
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e);
            }
            oVar.f242407f = jSONObject.toString();
            this.f352348b.mo109669n(oVar, (int[]) null);
            Log.m105927v("MicroMsg.JsApiInsertMap", "OnMapIndoorStateChange:%s", jSONObject.toString());
        }
    }

    /* renamed from: ol0.w$b */
    public class C117846b implements C118080q.C118105t {

        /* renamed from: a */
        public final /* synthetic */ int f352349a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f352350b;

        public C117846b(C117844w wVar, int i, C82520h hVar) {
            this.f352349a = i;
            this.f352350b = hVar;
        }

        /* renamed from: a */
        public void mo182586a(double d, double d2) {
            C117856l lVar = new C117856l();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mapId", this.f352349a);
                jSONObject.put("longitude", d2);
                jSONObject.put("latitude", d);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e);
            }
            lVar.f242407f = jSONObject.toString();
            this.f352350b.mo109669n(lVar, (int[]) null);
            Log.m105927v("MicroMsg.JsApiInsertMap", "MapOnMapAnchorPointClick:%s", jSONObject.toString());
        }
    }

    /* renamed from: ol0.w$c */
    public class C117847c implements C82531i.C82533b {

        /* renamed from: d */
        public final /* synthetic */ C118080q f352351d;

        public C117847c(C117844w wVar, C118080q qVar) {
            this.f352351d = qVar;
        }

        /* renamed from: b */
        public void mo22089b() {
            Log.m105924i("MicroMsg.JsApiInsertMap", "onBackground");
            C118080q qVar = this.f352351d;
            if (qVar != null) {
                qVar.onPause();
            }
        }
    }

    /* renamed from: ol0.w$d */
    public class C117848d implements C82531i.C82535d {

        /* renamed from: d */
        public final /* synthetic */ C118080q f352352d;

        public C117848d(C117844w wVar, C118080q qVar) {
            this.f352352d = qVar;
        }

        /* renamed from: c */
        public void mo22090c() {
            Log.m105924i("MicroMsg.JsApiInsertMap", "onForeground");
            C118080q qVar = this.f352352d;
            if (qVar != null) {
                qVar.onResume();
            }
        }
    }

    /* renamed from: ol0.w$e */
    public class C117849e implements C82531i.C82534c {

        /* renamed from: d */
        public final /* synthetic */ C82520h f352353d;

        /* renamed from: e */
        public final /* synthetic */ String f352354e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f352355f;

        public C117849e(C117844w wVar, C82520h hVar, String str, JSONObject jSONObject) {
            this.f352353d = hVar;
            this.f352354e = str;
            this.f352355f = jSONObject;
        }

        public void onDestroy() {
            Log.m105924i("MicroMsg.JsApiInsertMap", "onDestroy");
            this.f352353d.mo114867r(this);
            C118117v.m166642a(this.f352354e, C118116u.m166637b(this.f352353d, this.f352355f));
        }
    }

    /* renamed from: ol0.w$f */
    public class C117850f implements C118080q.C118098m {

        /* renamed from: a */
        public final /* synthetic */ int f352356a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f352357b;

        public C117850f(C117844w wVar, int i, C82520h hVar) {
            this.f352356a = i;
            this.f352357b = hVar;
        }

        /* renamed from: a */
        public void mo182587a(C118080q.C118107v vVar) {
            C117857m mVar = new C117857m();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mapId", this.f352356a);
                jSONObject.put("data", vVar.f353056a);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e);
            }
            mVar.f242407f = jSONObject.toString();
            this.f352357b.mo109669n(mVar, (int[]) null);
        }
    }

    /* renamed from: ol0.w$g */
    public class C117851g implements C118080q.C118102q {

        /* renamed from: a */
        public final /* synthetic */ int f352358a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f352359b;

        public C117851g(C117844w wVar, int i, C82520h hVar) {
            this.f352358a = i;
            this.f352359b = hVar;
        }

        /* renamed from: a */
        public boolean mo182588a(C118080q.C118107v vVar) {
            C117861q qVar = new C117861q();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mapId", this.f352358a);
                jSONObject.put("data", vVar.f353056a);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e);
            }
            qVar.f242407f = jSONObject.toString();
            this.f352359b.mo109669n(qVar, (int[]) null);
            return true;
        }
    }

    /* renamed from: ol0.w$h */
    public class C117852h implements C118080q.C118099n {

        /* renamed from: a */
        public final /* synthetic */ int f352360a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f352361b;

        public C117852h(C117844w wVar, int i, C82520h hVar) {
            this.f352360a = i;
            this.f352361b = hVar;
        }

        /* renamed from: a */
        public void mo182589a(double d, double d2) {
            C117858n nVar = new C117858n();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mapId", this.f352360a);
                jSONObject.put("longitude", d);
                jSONObject.put("latitude", d2);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e);
            }
            nVar.f242407f = jSONObject.toString();
            this.f352361b.mo109669n(nVar, (int[]) null);
        }
    }

    /* renamed from: ol0.w$i */
    public class C117853i implements C118080q.C118101p {

        /* renamed from: a */
        public final /* synthetic */ int f352362a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f352363b;

        public C117853i(C117844w wVar, int i, C82520h hVar) {
            this.f352362a = i;
            this.f352363b = hVar;
        }

        /* renamed from: a */
        public boolean mo182590a(C118080q.C118107v vVar) {
            C117860p pVar = new C117860p();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mapId", this.f352362a);
                jSONObject.put("data", vVar.f353056a);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e);
            }
            pVar.f242407f = jSONObject.toString();
            this.f352363b.mo109669n(pVar, (int[]) null);
            return true;
        }
    }

    /* renamed from: ol0.w$j */
    public class C117854j implements C118080q.C118113z {

        /* renamed from: a */
        public final /* synthetic */ int f352364a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f352365b;

        public C117854j(C117844w wVar, int i, C82520h hVar) {
            this.f352364a = i;
            this.f352365b = hVar;
        }

        /* renamed from: a */
        public void mo182591a(C118080q.C118106u uVar) {
            C117862r rVar = new C117862r();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mapId", this.f352364a);
                jSONObject.put("latitude", uVar.f353051a);
                jSONObject.put("longitude", uVar.f353052b);
                jSONObject.put("name", uVar.f353053c);
                if (!Util.isNullOrNil(uVar.f353054d)) {
                    jSONObject.put("buildingId", uVar.f353054d);
                    jSONObject.put("floorName", uVar.f353055e);
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e);
            }
            rVar.f242407f = jSONObject.toString();
            this.f352365b.mo109669n(rVar, (int[]) null);
            Log.m105927v("MicroMsg.JsApiInsertMap", "OnMapPoiClick %s", jSONObject.toString());
        }
    }

    /* renamed from: ol0.w$k */
    public class C117855k implements C118080q.C118111x {

        /* renamed from: a */
        public AtomicBoolean f352366a = new AtomicBoolean(false);

        /* renamed from: b */
        public float f352367b;

        /* renamed from: c */
        public JSONObject f352368c = new JSONObject();

        /* renamed from: d */
        public C117863s f352369d = new C117863s();

        /* renamed from: e */
        public final /* synthetic */ int f352370e;

        /* renamed from: f */
        public final /* synthetic */ C82520h f352371f;

        /* renamed from: g */
        public final /* synthetic */ C118080q f352372g;

        public C117855k(C117844w wVar, int i, C82520h hVar, C118080q qVar) {
            this.f352370e = i;
            this.f352371f = hVar;
            this.f352372g = qVar;
        }

        /* renamed from: a */
        public void mo182592a(C118080q.C118081a aVar, boolean z) {
            if (this.f352366a.compareAndSet(true, false)) {
                try {
                    this.f352368c.remove("mapId");
                    this.f352368c.put("mapId", this.f352370e);
                    this.f352368c.remove("type");
                    this.f352368c.put("type", "end");
                    this.f352368c.remove("causedBy");
                    boolean z2 = aVar.f352975a != this.f352367b;
                    if (!z) {
                        this.f352368c.put("causedBy", "update");
                    } else if (z2) {
                        this.f352368c.put("causedBy", "scale");
                    } else {
                        this.f352368c.put("causedBy", "drag");
                    }
                    this.f352368c.remove(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION);
                    this.f352368c.put(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, (double) aVar.f352976b);
                    this.f352368c.remove("skew");
                    this.f352368c.put("skew", (double) aVar.f352977c);
                    this.f352368c.remove("scale");
                    this.f352368c.put("scale", (double) this.f352372g.getZoom());
                    C117791a.m166201b(this.f352372g, this.f352368c);
                    C117791a.m166200a(this.f352372g, this.f352368c);
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e);
                }
                this.f352369d.f242407f = this.f352368c.toString();
                this.f352371f.mo109669n(this.f352369d, (int[]) null);
                Log.m105927v("MicroMsg.JsApiInsertMap", "onCameraChange finish, result:%s", this.f352368c.toString());
            }
        }

        /* renamed from: b */
        public void mo182593b(C118080q.C118081a aVar, boolean z) {
            if (this.f352366a.compareAndSet(false, true)) {
                try {
                    this.f352368c.remove("mapId");
                    this.f352368c.put("mapId", this.f352370e);
                    this.f352368c.remove("type");
                    this.f352368c.put("type", "begin");
                    if (z) {
                        this.f352368c.put("causedBy", "gesture");
                    } else {
                        this.f352368c.put("causedBy", "update");
                    }
                    this.f352368c.remove(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION);
                    this.f352368c.remove("skew");
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e);
                }
                this.f352369d.f242407f = this.f352368c.toString();
                this.f352371f.mo109669n(this.f352369d, (int[]) null);
                this.f352367b = aVar.f352975a;
                Log.m105926v("MicroMsg.JsApiInsertMap", "onCameraChange begin");
            }
        }
    }

    /* renamed from: ol0.w$l */
    public static class C117856l extends C82919r2 {
        private static final int CTRL_INDEX = 832;
        private static final String NAME = "onMapAnchorPointClick";
    }

    /* renamed from: ol0.w$m */
    public static class C117857m extends C82919r2 {
        private static final int CTRL_INDEX = 199;
        private static final String NAME = "onMapCalloutClick";
    }

    /* renamed from: ol0.w$n */
    public static class C117858n extends C82919r2 {
        private static final int CTRL_INDEX = 151;
        private static final String NAME = "onMapClick";
    }

    /* renamed from: ol0.w$o */
    public static class C117859o extends C82919r2 {
        private static final int CTRL_INDEX = 524;
        private static final String NAME = "onMapIndoorChange";
    }

    /* renamed from: ol0.w$p */
    public static class C117860p extends C82919r2 {
        private static final int CTRL_INDEX = 679;
        private static final String NAME = "onMapLabelClick";
    }

    /* renamed from: ol0.w$q */
    public static class C117861q extends C82919r2 {
        private static final int CTRL_INDEX = 142;
        private static final String NAME = "onMapMarkerClick";
    }

    /* renamed from: ol0.w$r */
    public static class C117862r extends C82919r2 {
        private static final int CTRL_INDEX = 511;
        private static final String NAME = "onMapPoiClick";
    }

    /* renamed from: ol0.w$s */
    public static class C117863s extends C82919r2 {
        private static final int CTRL_INDEX = 147;
        private static final String NAME = "onMapRegionChange";
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        try {
            return jSONObject.optInt("mapId");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiInsertMap", "get mapId error, exception : %s", e);
            return -1;
        }
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        C82520h hVar2 = hVar;
        JSONObject jSONObject2 = jSONObject;
        float f = Util.getFloat(jSONObject2.optString("centerLatitude"), 0.0f);
        float f2 = Util.getFloat(jSONObject2.optString("centerLongitude"), 0.0f);
        float f3 = Util.getFloat(jSONObject2.optString("scale"), 16.0f);
        int optInt = jSONObject2.optInt(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, 0);
        int optInt2 = jSONObject2.optInt("skew", 0);
        int i = (int) Util.getFloat(jSONObject2.optString("maxScale"), 20.0f);
        int i2 = (int) Util.getFloat(jSONObject2.optString("minScale"), 3.0f);
        if (Math.abs(f) > 90.0f || Math.abs(f2) > 180.0f) {
            Log.m105918d("MicroMsg.JsApiInsertMap", "centerLatitude or centerLongitude value is error!");
            return null;
        }
        C89367t.m111696a(0);
        String appId = hVar.getAppId();
        Log.m105925i("MicroMsg.JsApiInsertMap", "insertMap appId:%s viewId:%d data:%s", appId, Integer.valueOf(mo22376B(jSONObject2)), jSONObject2);
        C118080q p002 = ((C118114r) C89909e.m112436a(C118114r.class)).p00(hVar2, jSONObject2);
        if (p002 == null) {
            Log.m105920e("MicroMsg.JsApiInsertMap", "mapView is null, return");
            return null;
        } else if (!C118117v.m166645d(appId, C118116u.m166637b(hVar, jSONObject), p002)) {
            Log.m105920e("MicroMsg.JsApiInsertMap", "initMapView is false, return");
            C89367t.m111696a(1);
            return null;
        } else {
            C89367t.m111696a(2);
            p002.mo182826W(jSONObject2.optBoolean("enableZoom", true));
            p002.mo182830a(jSONObject2.optBoolean("enableScroll", true));
            p002.mo182822S(jSONObject2.optBoolean("enableRotate", false));
            p002.mo182834c0(jSONObject2.optBoolean("showCompass", false));
            p002.setBuilding3dEffectEnable(jSONObject2.optBoolean("enable3D", false));
            p002.mo182809K(jSONObject2.optBoolean("enableOverlooking", false));
            p002.enableAutoMaxOverlooking(jSONObject2.optBoolean("enableAutoMaxOverlooking", false));
            p002.mo182858l0(jSONObject2.optBoolean("enableSatellite", false));
            p002.mo182856k0(jSONObject2.optBoolean("enableIndoor", true));
            p002.enableIndoorLevelPick(jSONObject2.optBoolean("enableIndoorLevelPick", false));
            p002.mo182868p0(jSONObject2.optBoolean("showScale", true));
            if (jSONObject2.has("enablePoi")) {
                p002.setPoisEnabled(jSONObject2.optBoolean("enablePoi", true));
            }
            if (jSONObject2.has("enableBuilding")) {
                p002.mo182887x(jSONObject2.optBoolean("enableBuilding", true));
            }
            p002.setMaxZoomLevel(i);
            p002.setMinZoomLevel(i2);
            float f4 = (float) optInt2;
            C118080q qVar = p002;
            p002.mo182795C((double) f, (double) f2, f3, (float) optInt, f4);
            hVar2.mo114864j(new C117847c(this, qVar));
            hVar2.mo114868y(new C117848d(this, qVar));
            hVar2.mo114865m(new C117849e(this, hVar2, appId, jSONObject2));
            View view = qVar.getView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/map/JsApiInsertMap", "inflateView", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentView;Lorg/json/JSONObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/jsapi/map/JsApiInsertMap", "inflateView", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentView;Lorg/json/JSONObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return new CoverViewContainer(hVar.getContext(), qVar.getView());
        }
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C118080q b = C118117v.m166643b(hVar.getAppId(), C118116u.m166637b(hVar, jSONObject));
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiInsertMap", "mapView is null, error, return");
            return;
        }
        b.mo182832b0(new C117850f(this, i, hVar));
        b.mo182837e0(new C117851g(this, i, hVar));
        b.mo182889y(new C117852h(this, i, hVar));
        b.mo182870q0(new C117853i(this, i, hVar));
        b.mo182853j(new C117854j(this, i, hVar));
        b.mo182882t0(jSONObject.optBoolean("showLocation"));
        b.mo182820Q(new C117855k(this, i, hVar, b));
        b.mo182840f(new C117845a(this, i, hVar));
        b.mo182863o(new C117846b(this, i, hVar));
    }
}
