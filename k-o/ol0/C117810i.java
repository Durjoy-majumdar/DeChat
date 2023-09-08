package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import jk0.C87985i;
import ol0.C117840v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;
import pl0.C118116u;
import zi0.C91755a;

/* renamed from: ol0.i */
public class C117810i extends C117793b {
    public static final int CTRL_INDEX = 133;
    public static final String NAME = "addMapMarkers";

    /* renamed from: ol0.i$a */
    public class C117811a implements C118080q.C118103r {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f352330a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f352331b;

        public C117811a(C117810i iVar, JSONObject jSONObject, C82381f fVar) {
            this.f352330a = jSONObject;
            this.f352331b = fVar;
        }

        /* renamed from: a */
        public void mo182578a(JSONObject jSONObject) {
            C117840v.C117842b bVar = new C117840v.C117842b();
            HashMap hashMap = new HashMap();
            hashMap.put("cluster", jSONObject);
            hashMap.put("mapId", Integer.valueOf(C118116u.m166638c(this.f352330a)));
            bVar.mo115165o(hashMap);
            Log.m105925i("MicroMsg.Map.JsApiAddMapMarkers", "click clusterInfo:%s", jSONObject);
            C82520h pG = ((C87985i) this.f352331b.mo109668l(C87985i.class)).mo116941pG(this.f352331b, this.f352330a);
            if (pG != null) {
                pG.mo109669n(bVar, (int[]) null);
            } else {
                this.f352331b.mo109676w(bVar);
            }
        }

        /* renamed from: b */
        public void mo182579b(JSONArray jSONArray) {
            C117840v.C117843c cVar = new C117840v.C117843c();
            HashMap hashMap = new HashMap();
            hashMap.put("clusters", jSONArray);
            hashMap.put("mapId", Integer.valueOf(C118116u.m166638c(this.f352330a)));
            cVar.mo115165o(hashMap);
            Log.m105925i("MicroMsg.Map.JsApiAddMapMarkers", "create clusterInfo:%s", jSONArray);
            C82520h pG = ((C87985i) this.f352331b.mo109668l(C87985i.class)).mo116941pG(this.f352331b, this.f352330a);
            if (pG != null) {
                pG.mo109669n(cVar, (int[]) null);
            } else {
                this.f352331b.mo109676w(cVar);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        int i2;
        C118080q.C118108w wVar;
        C82381f fVar2 = fVar;
        JSONObject jSONObject3 = jSONObject;
        int i3 = i;
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject3 == null) {
            Log.m105920e("MicroMsg.Map.JsApiAddMapMarkers", "data is null");
            fVar2.mo109647a(i3, mo115109j("fail:invalid data"));
            return;
        }
        char c = 1;
        Log.m105925i("MicroMsg.Map.JsApiAddMapMarkers", "data:%s", jSONObject3);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.Map.JsApiAddMapMarkers", "mapView is null, return");
            fVar2.mo109647a(i3, mo115109j("fail:mapview is null"));
            return;
        }
        boolean optBoolean = jSONObject3.optBoolean("clear", true);
        Log.m105925i("MicroMsg.Map.JsApiAddMapMarkers", "clear:%b", Boolean.valueOf(optBoolean));
        if (optBoolean) {
            y.mo182824U();
        }
        if (jSONObject3.has("markers")) {
            try {
                jSONArray = new JSONArray(jSONObject3.optString("markers"));
            } catch (JSONException unused) {
                jSONArray = null;
            }
            if (jSONArray == null) {
                Log.m105920e("MicroMsg.Map.JsApiAddMapMarkers", "markersArray is null, return");
                fVar2.mo109647a(i3, mo115109j("fail:internal error"));
                return;
            }
            int i4 = 0;
            while (i4 < jSONArray.length()) {
                try {
                    jSONObject2 = (JSONObject) jSONArray.get(i4);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.Map.JsApiAddMapMarkers", e, "", new Object[0]);
                    jSONObject2 = null;
                }
                if (jSONObject2 == null) {
                    i2 = i4;
                    jSONArray2 = jSONArray;
                } else {
                    C118080q.C118108w x = mo182576x(fVar2, jSONObject3, jSONObject2);
                    String optString = jSONObject2.optString("id");
                    C118080q.C118108w.C118110b bVar = x.f353076s;
                    if (bVar != null) {
                        Object[] objArr = new Object[4];
                        objArr[0] = optString;
                        objArr[c] = bVar.f353090a;
                        objArr[2] = Boolean.valueOf(x.f353058a);
                        objArr[3] = Integer.valueOf(x.f353059b);
                        Log.m105925i("MicroMsg.Map.JsApiAddMapMarkers", "id:%s, label:%s, joinCluster:%b, clusterId:%d", objArr);
                    }
                    if (!x.f353058a || y.mo182841f0() || y.mo182874s0()) {
                        wVar = x;
                        i2 = i4;
                        jSONArray2 = jSONArray;
                    } else {
                        wVar = x;
                        i2 = i4;
                        jSONArray2 = jSONArray;
                        y.mo182827X(true, true, 2, 60, new C117811a(this, jSONObject3, fVar2));
                    }
                    y.mo182861n(optString, wVar, (C91755a) fVar2.mo109668l(C91755a.class));
                }
                i4 = i2 + 1;
                jSONArray = jSONArray2;
                c = 1;
            }
        }
        mo182575w(fVar, i, mo115109j("ok"), true, y.mo182849h());
    }
}
