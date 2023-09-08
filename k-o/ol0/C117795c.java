package ol0;

import android.graphics.Color;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import js0.C88020k;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.c */
public class C117795c extends C117793b {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "addMapArc";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        String str2;
        String str3;
        double optDouble;
        int i2;
        int i3;
        float f;
        C82381f fVar2;
        int i4;
        C117795c cVar = this;
        C82381f fVar3 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i5 = i;
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiAddMapArc", "data is null");
            fVar3.mo109647a(i5, cVar.mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiAddMapArc", "data:%s", jSONObject2);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiAddMapArc", "mapView is null, return");
            fVar3.mo109647a(i5, cVar.mo115109j("fail:mapview is null"));
        } else if (!jSONObject2.has("id") || !jSONObject2.has(IXWebBroadcastListener.STAGE_START) || !jSONObject2.has("end")) {
            Log.m105920e("MicroMsg.JsApiAddMapArc", "id or start or end point is empty");
            fVar3.mo109647a(i5, cVar.mo115109j("fail:invalid data"));
        } else {
            try {
                int i6 = jSONObject2.getInt("id");
                JSONObject jSONObject3 = jSONObject2.getJSONObject(IXWebBroadcastListener.STAGE_START);
                JSONObject jSONObject4 = jSONObject2.getJSONObject("end");
                JSONObject optJSONObject = jSONObject2.optJSONObject(StateEvent.ActionValue.STAGE_PASS);
                JSONObject jSONObject5 = jSONObject3;
                str2 = "fail:invalid data";
                String str4 = "MicroMsg.JsApiAddMapArc";
                try {
                    optDouble = jSONObject2.optDouble("angle", 0.0d);
                } catch (Exception e) {
                    e = e;
                    str = "";
                    str3 = str4;
                    Log.printErrStackTrace(str3, e, str, new Object[0]);
                    Log.m105920e(str3, "handle data has exception");
                    fVar3.mo109647a(i5, cVar.mo115109j(str2));
                }
                try {
                    double optDouble2 = jSONObject2.optDouble("width", 0.0d);
                    try {
                        i2 = C88020k.m109562m(jSONObject2.optString("color", ""));
                    } catch (Exception unused) {
                        i2 = Color.parseColor("#000000");
                    }
                    JSONObject jSONObject6 = jSONObject5;
                    double d = optDouble2;
                    try {
                        str = "";
                    } catch (Exception e2) {
                        e = e2;
                        cVar = this;
                        fVar3 = fVar;
                        i5 = i;
                        str = "";
                        str3 = str4;
                        Log.printErrStackTrace(str3, e, str, new Object[0]);
                        Log.m105920e(str3, "handle data has exception");
                        fVar3.mo109647a(i5, cVar.mo115109j(str2));
                    }
                    try {
                        C118080q.C118093j jVar = new C118080q.C118093j(jSONObject6.optDouble("latitude", 0.0d), jSONObject6.optDouble("longitude", 0.0d));
                        C118080q.C118093j jVar2 = new C118080q.C118093j(jSONObject4.optDouble("latitude", 0.0d), jSONObject4.optDouble("longitude", 0.0d));
                        C118080q.C118093j jVar3 = null;
                        if (optJSONObject != null) {
                            jVar3 = new C118080q.C118093j(optJSONObject.optDouble("latitude", 0.0d), optJSONObject.optDouble("longitude", 0.0d));
                        }
                        float f2 = (float) optDouble;
                        float f3 = (float) d;
                        if (y.mo182829Z(i6, jVar, jVar2, jVar3, f2, f3, i2)) {
                            cVar = this;
                            try {
                                f = f2;
                                i3 = f3;
                                fVar2 = fVar;
                                i4 = i;
                            } catch (Exception e3) {
                                e = e3;
                                fVar3 = fVar;
                                i5 = i;
                                str3 = str4;
                                Log.printErrStackTrace(str3, e, str, new Object[0]);
                                Log.m105920e(str3, "handle data has exception");
                                fVar3.mo109647a(i5, cVar.mo115109j(str2));
                            }
                            try {
                                f = fVar2;
                                i3 = i4;
                                fVar2.mo109647a(i4, cVar.mo115109j("ok"));
                            } catch (Exception e4) {
                                e = e4;
                                i5 = i3;
                                fVar3 = f;
                                str3 = str4;
                                Log.printErrStackTrace(str3, e, str, new Object[0]);
                                Log.m105920e(str3, "handle data has exception");
                                fVar3.mo109647a(i5, cVar.mo115109j(str2));
                            }
                        } else {
                            cVar = this;
                            fVar3 = fVar;
                            i5 = i;
                            str3 = str4;
                            try {
                                Log.m105920e(str3, "add fail");
                                fVar3.mo109647a(i5, cVar.mo115109j("fail:addMapArc is invalid"));
                            } catch (Exception e5) {
                                e = e5;
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        cVar = this;
                        fVar3 = fVar;
                        i5 = i;
                        str3 = str4;
                        Log.printErrStackTrace(str3, e, str, new Object[0]);
                        Log.m105920e(str3, "handle data has exception");
                        fVar3.mo109647a(i5, cVar.mo115109j(str2));
                    }
                } catch (Exception e7) {
                    e = e7;
                    fVar3 = fVar;
                    i5 = i;
                    str = "";
                    str3 = str4;
                    Log.printErrStackTrace(str3, e, str, new Object[0]);
                    Log.m105920e(str3, "handle data has exception");
                    fVar3.mo109647a(i5, cVar.mo115109j(str2));
                }
            } catch (Exception e8) {
                e = e8;
                str = "";
                str2 = "fail:invalid data";
                str3 = "MicroMsg.JsApiAddMapArc";
                Log.printErrStackTrace(str3, e, str, new Object[0]);
                Log.m105920e(str3, "handle data has exception");
                fVar3.mo109647a(i5, cVar.mo115109j(str2));
            }
        }
    }
}
