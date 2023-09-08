package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import jk0.C87985i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;
import pl0.C118116u;

/* renamed from: ol0.v */
public class C117840v extends C117793b {
    public static final int CTRL_INDEX = 857;
    public static final String NAME = "initMapMarkerCluster";

    /* renamed from: ol0.v$a */
    public class C117841a implements C118080q.C118103r {

        /* renamed from: a */
        public JSONObject f352344a = new JSONObject();

        /* renamed from: b */
        public final /* synthetic */ JSONObject f352345b;

        /* renamed from: c */
        public final /* synthetic */ C82381f f352346c;

        public C117841a(C117840v vVar, JSONObject jSONObject, C82381f fVar) {
            this.f352345b = jSONObject;
            this.f352346c = fVar;
        }

        /* renamed from: a */
        public void mo182578a(JSONObject jSONObject) {
            C117842b bVar = new C117842b();
            HashMap hashMap = new HashMap();
            hashMap.put("cluster", jSONObject);
            hashMap.put("mapId", Integer.valueOf(C118116u.m166638c(this.f352345b)));
            bVar.mo115165o(hashMap);
            Log.m105925i("MicroMsg.JsApiInitMapMarkerCluster", "click clusterInfo:%s", jSONObject);
            C82520h pG = ((C87985i) this.f352346c.mo109668l(C87985i.class)).mo116941pG(this.f352346c, this.f352345b);
            if (pG != null) {
                pG.mo109669n(bVar, (int[]) null);
            } else {
                this.f352346c.mo109676w(bVar);
            }
        }

        /* renamed from: b */
        public void mo182579b(JSONArray jSONArray) {
            C117843c cVar = new C117843c();
            HashMap hashMap = new HashMap();
            hashMap.put("clusters", jSONArray);
            hashMap.put("mapId", Integer.valueOf(C118116u.m166638c(this.f352345b)));
            try {
                this.f352344a.remove("clusters");
                this.f352344a.put("clusters", jSONArray);
                this.f352344a.remove("mapId");
                this.f352344a.put("mapId", C118116u.m166638c(this.f352345b));
            } catch (JSONException unused) {
            }
            cVar.mo115165o(hashMap);
            Log.m105925i("MicroMsg.JsApiInitMapMarkerCluster", "create clusterInfo:%s", jSONArray);
            C82520h pG = ((C87985i) this.f352346c.mo109668l(C87985i.class)).mo116941pG(this.f352346c, this.f352345b);
            if (pG != null) {
                pG.mo109669n(cVar, (int[]) null);
            } else {
                this.f352346c.mo109676w(cVar);
            }
        }
    }

    /* renamed from: ol0.v$b */
    public static class C117842b extends C82919r2 {
        private static final int CTRL_INDEX = 859;
        private static final String NAME = "onMapMarkerClusterClick";
    }

    /* renamed from: ol0.v$c */
    public static class C117843c extends C82919r2 {
        private static final int CTRL_INDEX = 858;
        private static final String NAME = "onMapMarkerClusterCreate";
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiInitMapMarkerCluster", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiInitMapMarkerCluster", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiInitMapMarkerCluster", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("enableDefaultStyle", true);
        boolean optBoolean2 = jSONObject.optBoolean("zoomOnClick", true);
        int optInt = jSONObject.optInt("minimumClusterSize", 2);
        int optInt2 = jSONObject.optInt("gridSize", 60);
        Log.m105925i("MicroMsg.JsApiInitMapMarkerCluster", "enableDefaultStyle:%b, zoomOnClick:%b, minimumClusterSize:%d, gridSize:%d", Boolean.valueOf(optBoolean), Boolean.valueOf(optBoolean2), Integer.valueOf(optInt), Integer.valueOf(optInt2));
        y.mo182827X(optBoolean, optBoolean2, optInt, optInt2, new C117841a(this, jSONObject, fVar));
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
