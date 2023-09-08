package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import js0.C88024r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.x */
public class C117864x extends C117793b {
    public static final int CTRL_INDEX = 200;
    public static final String NAME = "moveMapMarkerAlong";

    /* renamed from: ol0.x$a */
    public class C117865a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f352373d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f352374e;

        /* renamed from: f */
        public final /* synthetic */ int f352375f;

        public C117865a(C82381f fVar, JSONObject jSONObject, int i) {
            this.f352373d = fVar;
            this.f352374e = jSONObject;
            this.f352375f = i;
        }

        public void run() {
            C118080q qVar;
            C118080q qVar2;
            JSONArray jSONArray;
            double d;
            C117864x xVar = C117864x.this;
            C82381f fVar = this.f352373d;
            JSONObject jSONObject = this.f352374e;
            int i = this.f352375f;
            xVar.getClass();
            if (jSONObject == null) {
                Log.m105920e("MicroMsg.JsApiMoveMapMarkerAlong", "data is invalid, err");
                xVar.mo182594z(fVar, i, "fail:invalid data", false);
                return;
            }
            Log.m105925i("MicroMsg.JsApiMoveMapMarkerAlong", "data:%s", jSONObject.toString());
            C118080q y = xVar.mo182577y(fVar, jSONObject);
            if (y == null) {
                Log.m105920e("MicroMsg.JsApiMoveMapMarkerAlong", "mapView is null, return");
                xVar.mo182594z(fVar, i, String.format("fail:internal error %s", new Object[]{"mapview is null"}), false);
                return;
            }
            String optString = jSONObject.optString("markerId");
            try {
                long optLong = jSONObject.optLong("duration", 0);
                if (optLong == 0) {
                    Log.m105920e("MicroMsg.JsApiMoveMapMarkerAlong", "duration is zero, err return");
                    xVar.mo182594z(fVar, i, "fail:invalid data", false);
                }
                boolean optBoolean = jSONObject.optBoolean("autoRotate", false);
                JSONArray jSONArray2 = jSONObject.getJSONArray("path");
                ArrayList arrayList = new ArrayList();
                Log.m105919d("MicroMsg.JsApiMoveMapMarkerAlong", "path size :%d", Integer.valueOf(jSONArray2.length()));
                int i2 = 0;
                while (i2 < jSONArray2.length()) {
                    JSONObject optJSONObject = jSONArray2.optJSONObject(i2);
                    if (optJSONObject == null) {
                        jSONArray = jSONArray2;
                        qVar2 = y;
                    } else {
                        String optString2 = optJSONObject.optString("latitude");
                        qVar2 = y;
                        double d2 = 0.0d;
                        if (!Util.isNullOrNil(optString2)) {
                            try {
                                d = Util.getDouble(optString2, 0.0d);
                            } catch (JSONException e) {
                                e = e;
                                qVar = qVar2;
                                Log.m105921e("MicroMsg.JsApiMoveMapMarkerAlong", "parse data error, exception : %s", e);
                                xVar.mo182594z(fVar, i, String.format("fail:internal error %s", new Object[]{"parse json fail"}), qVar.mo182849h());
                            } catch (Exception e2) {
                                e = e2;
                                qVar = qVar2;
                                Log.m105921e("MicroMsg.JsApiMoveMapMarkerAlong", "parse data error, exception2 : %s", e);
                                xVar.mo182594z(fVar, i, String.format("fail:internal error %s", new Object[]{"parse json fail"}), qVar.mo182849h());
                            }
                        } else {
                            d = 0.0d;
                        }
                        String optString3 = optJSONObject.optString("longitude");
                        if (!Util.isNullOrNil(optString3)) {
                            d2 = Util.getDouble(optString3, 0.0d);
                        }
                        jSONArray = jSONArray2;
                        arrayList.add(new C118080q.C118093j(d, d2));
                    }
                    i2++;
                    jSONArray2 = jSONArray;
                    y = qVar2;
                }
                qVar = y;
                try {
                    qVar.mo182811L(optString, arrayList, optLong, optBoolean, new C117866y(xVar, fVar, i, qVar));
                } catch (JSONException e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                    Log.m105921e("MicroMsg.JsApiMoveMapMarkerAlong", "parse data error, exception2 : %s", e);
                    xVar.mo182594z(fVar, i, String.format("fail:internal error %s", new Object[]{"parse json fail"}), qVar.mo182849h());
                }
            } catch (JSONException e5) {
                e = e5;
                qVar = y;
                Log.m105921e("MicroMsg.JsApiMoveMapMarkerAlong", "parse data error, exception : %s", e);
                xVar.mo182594z(fVar, i, String.format("fail:internal error %s", new Object[]{"parse json fail"}), qVar.mo182849h());
            } catch (Exception e6) {
                e = e6;
                qVar = y;
                Log.m105921e("MicroMsg.JsApiMoveMapMarkerAlong", "parse data error, exception2 : %s", e);
                xVar.mo182594z(fVar, i, String.format("fail:internal error %s", new Object[]{"parse json fail"}), qVar.mo182849h());
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        C88024r.m109571a().postToWorker(new C117865a(fVar, jSONObject, i));
    }

    /* renamed from: z */
    public final void mo182594z(C82381f fVar, int i, String str, boolean z) {
        mo182575w(fVar, i, mo115109j(str), str.equals("ok"), z);
    }
}
