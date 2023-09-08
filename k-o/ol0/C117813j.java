package ol0;

import android.graphics.Color;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import js0.C88020k;
import org.json.JSONArray;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.j */
public class C117813j extends C117793b {
    public static final int CTRL_INDEX = 492;
    public static final String NAME = "addMapPolygons";

    /* renamed from: ol0.j$a */
    public class C117814a extends C118080q.C118093j {
        public C117814a(C117813j jVar, double d, double d2) {
            super(d, d2);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C118080q qVar;
        int i2;
        String str;
        C118080q qVar2;
        String str2;
        C117813j jVar = this;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i3 = i;
        super.mo1505u(fVar, jSONObject, i);
        String str3 = "MicroMsg.JsApiAddMapPolygons";
        if (jSONObject2 == null) {
            Log.m105920e(str3, "data is null");
            fVar2.mo109647a(i3, jVar.mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i(str3, "data:%s", jSONObject2);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e(str3, "mapView is null, return");
            fVar2.mo109647a(i3, jVar.mo115109j("fail:mapview is null"));
            return;
        }
        try {
            if (jSONObject2.has("polygons")) {
                try {
                    y.mo182873s();
                    JSONArray jSONArray = new JSONArray(jSONObject2.optString("polygons"));
                    int i4 = 0;
                    while (i4 < jSONArray.length()) {
                        JSONObject jSONObject3 = (JSONObject) jSONArray.get(i4);
                        ArrayList arrayList = new ArrayList();
                        JSONArray jSONArray2 = new JSONArray(jSONObject3.optString("points"));
                        int i5 = 0;
                        while (i5 < jSONArray2.length()) {
                            JSONObject jSONObject4 = jSONArray2.getJSONObject(i5);
                            int i6 = i5;
                            JSONArray jSONArray3 = jSONArray2;
                            JSONArray jSONArray4 = jSONArray3;
                            C117814a aVar = r1;
                            JSONObject jSONObject5 = jSONObject3;
                            ArrayList arrayList2 = arrayList;
                            JSONArray jSONArray5 = jSONArray;
                            str2 = str3;
                            qVar = y;
                            try {
                                C117814a aVar2 = new C117814a(this, Util.getDouble(jSONObject4.optString("latitude"), 0.0d), Util.getDouble(jSONObject4.optString("longitude"), 0.0d));
                                arrayList2.add(aVar);
                                i5 = i6 + 1;
                                C82381f fVar3 = fVar;
                                arrayList = arrayList2;
                                jSONObject3 = jSONObject5;
                                y = qVar;
                                jSONArray = jSONArray5;
                                str3 = str2;
                                jSONArray2 = jSONArray4;
                                int i7 = i;
                            } catch (Exception e) {
                                e = e;
                                i2 = 1;
                                jVar = this;
                                str = str2;
                                Object[] objArr = new Object[i2];
                                objArr[0] = e;
                                Log.m105921e(str, "parse lines error, exception : %s", objArr);
                                mo182575w(fVar, i, jVar.mo115109j("fail:internal error"), false, qVar.mo182849h());
                            }
                        }
                        JSONObject jSONObject6 = jSONObject3;
                        ArrayList arrayList3 = arrayList;
                        JSONArray jSONArray6 = jSONArray;
                        str2 = str3;
                        qVar = y;
                        String optString = jSONObject6.optString("fillColor", "");
                        int parseColor = Color.parseColor("#000000");
                        try {
                            parseColor = C88020k.m109562m(optString);
                        } catch (Exception unused) {
                        }
                        String optString2 = jSONObject6.optString("strokeColor", "");
                        int parseColor2 = Color.parseColor("#000000");
                        try {
                            parseColor2 = C88020k.m109562m(optString2);
                        } catch (Exception unused2) {
                        }
                        int k = C88020k.m109560k(jSONObject6, "strokeWidth", 0);
                        int optInt = jSONObject6.optInt("zIndex", 0);
                        int[] iArr = null;
                        if (jSONObject6.has("dashArray")) {
                            JSONArray jSONArray7 = new JSONArray(jSONObject6.optString("dashArray"));
                            int[] iArr2 = new int[jSONArray7.length()];
                            for (int i8 = 0; i8 < jSONArray7.length(); i8++) {
                                iArr2[i8] = jSONArray7.getInt(i8);
                            }
                            iArr = iArr2;
                        }
                        C118080q.C118082a0 a0Var = new C118080q.C118082a0();
                        ArrayList arrayList4 = new ArrayList();
                        a0Var.f352978a = arrayList4;
                        arrayList4.addAll(arrayList3);
                        a0Var.f352979b = parseColor;
                        a0Var.f352980c = k;
                        a0Var.f352981d = parseColor2;
                        a0Var.f352982e = optInt;
                        a0Var.f352983f = jSONObject6.optString(FirebaseAnalytics.C113379b.LEVEL);
                        a0Var.f352984g = iArr;
                        qVar.mo182855k(a0Var);
                        i4++;
                        C82381f fVar4 = fVar;
                        int i9 = i;
                        y = qVar;
                        jSONArray = jSONArray6;
                        str3 = str2;
                    }
                    qVar2 = y;
                } catch (Exception e2) {
                    e = e2;
                    str2 = str3;
                    qVar = y;
                    i2 = 1;
                    jVar = this;
                    str = str2;
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = e;
                    Log.m105921e(str, "parse lines error, exception : %s", objArr2);
                    mo182575w(fVar, i, jVar.mo115109j("fail:internal error"), false, qVar.mo182849h());
                }
            } else {
                String str4 = str3;
                qVar2 = y;
                str = str4;
                try {
                    Log.m105920e(str, "data has not lines info");
                } catch (Exception e3) {
                    e = e3;
                    jVar = this;
                    i2 = 1;
                    Object[] objArr22 = new Object[i2];
                    objArr22[0] = e;
                    Log.m105921e(str, "parse lines error, exception : %s", objArr22);
                    mo182575w(fVar, i, jVar.mo115109j("fail:internal error"), false, qVar.mo182849h());
                }
            }
            mo182575w(fVar, i, mo115109j("ok"), true, qVar2.mo182849h());
        } catch (Exception e4) {
            e = e4;
            str = str3;
            qVar2 = y;
            i2 = 1;
            Object[] objArr222 = new Object[i2];
            objArr222[0] = e;
            Log.m105921e(str, "parse lines error, exception : %s", objArr222);
            mo182575w(fVar, i, jVar.mo115109j("fail:internal error"), false, qVar.mo182849h());
        }
    }
}
