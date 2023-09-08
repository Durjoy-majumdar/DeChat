package ol0;

import android.graphics.Color;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import jk0.C87985i;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;
import pl0.C118116u;
import pl0.C118117v;
import zi0.C91759b;

/* renamed from: ol0.b */
public abstract class C117793b extends C82268c {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r5, org.json.JSONObject r6, int r7) {
        /*
            r4 = this;
            java.lang.String r5 = r4.mo114779e()
            java.util.Map<java.lang.String, java.lang.Integer> r6 = pl0.C89367t.f257349a
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x000e
            goto L_0x008e
        L_0x000e:
            r5.getClass()
            int r6 = r5.hashCode()
            r7 = -1949215789(0xffffffff8bd153d3, float:-8.0629996E-32)
            r0 = 0
            r1 = -1
            r2 = 1
            r3 = 2
            if (r6 == r7) goto L_0x003f
            r7 = -384482333(0xffffffffe91543e3, float:-1.1278158E25)
            if (r6 == r7) goto L_0x0034
            r7 = 1282356792(0x4c6f3638, float:6.2707936E7)
            if (r6 == r7) goto L_0x0029
            goto L_0x0048
        L_0x0029:
            java.lang.String r6 = "removeMap"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0032
            goto L_0x0048
        L_0x0032:
            r6 = 2
            goto L_0x004b
        L_0x0034:
            java.lang.String r6 = "insertMap"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x003d
            goto L_0x0048
        L_0x003d:
            r6 = 1
            goto L_0x004b
        L_0x003f:
            java.lang.String r6 = "updateMap"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x004a
        L_0x0048:
            r6 = -1
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r6 == 0) goto L_0x0071
            if (r6 == r2) goto L_0x006f
            if (r6 == r3) goto L_0x006d
            java.util.Map<java.lang.String, java.lang.Integer> r6 = pl0.C89367t.f257349a
            java.util.HashMap r6 = (java.util.HashMap) r6
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x006b
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 * 5
            int r6 = r6 + 20
            int r6 = r6 + r0
            goto L_0x0072
        L_0x006b:
            r6 = -1
            goto L_0x0072
        L_0x006d:
            r6 = 6
            goto L_0x0072
        L_0x006f:
            r6 = 0
            goto L_0x0072
        L_0x0071:
            r6 = 3
        L_0x0072:
            java.lang.String r7 = "Luggage.MapReporter"
            if (r6 != r1) goto L_0x007c
            java.lang.String r5 = "key is -1, may be err"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r5)
            goto L_0x008e
        L_0x007c:
            pl0.C89367t.m111696a(r6)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r0] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r1[r2] = r5
            java.lang.String r5 = "name:%s invoke key:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r7, r5, r1)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ol0.C117793b.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009b  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo182575w(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r8, int r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            r8.mo109647a(r9, r10)
            java.lang.String r8 = r7.mo114779e()
            java.util.Map<java.lang.String, java.lang.Integer> r9 = pl0.C89367t.f257349a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 == 0) goto L_0x0011
            goto L_0x00b9
        L_0x0011:
            r8.getClass()
            int r9 = r8.hashCode()
            r10 = -1949215789(0xffffffff8bd153d3, float:-8.0629996E-32)
            r0 = 0
            r1 = -1
            r2 = 1
            r3 = 2
            if (r9 == r10) goto L_0x0042
            r10 = -384482333(0xffffffffe91543e3, float:-1.1278158E25)
            if (r9 == r10) goto L_0x0037
            r10 = 1282356792(0x4c6f3638, float:6.2707936E7)
            if (r9 == r10) goto L_0x002c
            goto L_0x004b
        L_0x002c:
            java.lang.String r9 = "removeMap"
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x0035
            goto L_0x004b
        L_0x0035:
            r9 = 2
            goto L_0x004e
        L_0x0037:
            java.lang.String r9 = "insertMap"
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            r9 = 1
            goto L_0x004e
        L_0x0042:
            java.lang.String r9 = "updateMap"
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x004d
        L_0x004b:
            r9 = -1
            goto L_0x004e
        L_0x004d:
            r9 = 0
        L_0x004e:
            r10 = 5
            r4 = 3
            r5 = 4
            if (r9 == 0) goto L_0x008d
            if (r9 == r2) goto L_0x0087
            if (r9 == r3) goto L_0x0080
            java.util.Map<java.lang.String, java.lang.Integer> r9 = pl0.C89367t.f257349a
            java.util.HashMap r9 = (java.util.HashMap) r9
            boolean r6 = r9.containsKey(r8)
            if (r6 == 0) goto L_0x007e
            java.lang.Object r9 = r9.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r9 = r9 * 5
            int r9 = r9 + 20
            if (r12 == 0) goto L_0x0077
            if (r11 == 0) goto L_0x0075
            r10 = 3
            goto L_0x007c
        L_0x0075:
            r10 = 4
            goto L_0x007c
        L_0x0077:
            if (r11 == 0) goto L_0x007b
            r10 = 1
            goto L_0x007c
        L_0x007b:
            r10 = 2
        L_0x007c:
            int r9 = r9 + r10
            goto L_0x0091
        L_0x007e:
            r9 = -1
            goto L_0x0091
        L_0x0080:
            if (r11 == 0) goto L_0x0084
            r9 = 7
            goto L_0x0091
        L_0x0084:
            r9 = 8
            goto L_0x0091
        L_0x0087:
            if (r11 == 0) goto L_0x008b
            r9 = 1
            goto L_0x0091
        L_0x008b:
            r9 = 2
            goto L_0x0091
        L_0x008d:
            if (r11 == 0) goto L_0x0090
            r10 = 4
        L_0x0090:
            r9 = r10
        L_0x0091:
            java.lang.String r10 = "Luggage.MapReporter"
            if (r9 != r1) goto L_0x009b
            java.lang.String r8 = "key is -1, may be err"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r8)
            goto L_0x00b9
        L_0x009b:
            pl0.C89367t.m111696a(r9)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r0] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r11)
            r1[r2] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)
            r1[r3] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r1[r4] = r8
            java.lang.String r8 = "name:%s, isOk:%b, isOtherMap:%b, key:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r10, r8, r1)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ol0.C117793b.mo182575w(com.tencent.mm.plugin.appbrand.jsapi.f, int, java.lang.String, boolean, boolean):void");
    }

    /* renamed from: x */
    public C118080q.C118108w mo182576x(C82381f fVar, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        int i;
        int i2;
        int i3;
        JSONObject jSONObject5;
        int i4;
        int i5;
        JSONObject jSONObject6;
        C82381f fVar2 = fVar;
        JSONObject jSONObject7 = jSONObject;
        JSONObject jSONObject8 = jSONObject2;
        Class cls = C91759b.class;
        C118080q.C118108w wVar = new C118080q.C118108w();
        if (jSONObject8.has("joinCluster")) {
            wVar.f353058a = jSONObject8.optBoolean("joinCluster", false);
        }
        if (jSONObject8.has("clusterId")) {
            wVar.f353059b = jSONObject8.optInt("clusterId", -1);
        }
        if (jSONObject8.has("latitude") && jSONObject8.has("longitude")) {
            double d = Util.getDouble(jSONObject8.optString("latitude"), 0.0d);
            double d2 = Util.getDouble(jSONObject8.optString("longitude"), 0.0d);
            wVar.f353060c = d;
            wVar.f353061d = d2;
        }
        String optString = jSONObject8.optString("iconPath");
        float i6 = C88020k.m109558i(jSONObject8, "width", 0.0f);
        float i7 = C88020k.m109558i(jSONObject8, "height", 0.0f);
        if (!Util.isNullOrNil(optString) && fVar2.mo109668l(cls) != null) {
            wVar.f353062e = ((C91759b) fVar2.mo109668l(cls)).mo115838nO(fVar2, optString);
            wVar.f353066i = i6;
            wVar.f353067j = i7;
        }
        wVar.f353063f = (float) jSONObject8.optDouble(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, 0.0d);
        wVar.f353064g = (float) jSONObject8.optDouble("alpha", 1.0d);
        wVar.f353065h = jSONObject8.optString("data");
        wVar.f353073p = jSONObject8.optString("ariaLabel");
        wVar.f353074q = jSONObject8.optString("collision");
        if (jSONObject8.has("anchor")) {
            try {
                jSONObject6 = new JSONObject(jSONObject8.optString("anchor"));
            } catch (JSONException unused) {
                jSONObject6 = null;
            }
            if (jSONObject6 != null) {
                wVar.f353068k = (float) jSONObject6.optDouble("x", 0.5d);
                wVar.f353069l = (float) jSONObject6.optDouble("y", 1.0d);
            } else {
                wVar.f353068k = 0.5f;
                wVar.f353069l = 1.0f;
            }
        }
        wVar.f353070m = jSONObject8.optInt("zIndex", 0);
        String optString2 = jSONObject8.optString("label");
        if (!Util.isNullOrNil(optString2)) {
            try {
                jSONObject5 = new JSONObject(optString2);
            } catch (JSONException unused2) {
                jSONObject5 = null;
            }
            if (jSONObject5 != null) {
                String optString3 = jSONObject5.optString("content");
                try {
                    i4 = C88020k.m109562m(jSONObject5.optString("color", "#000000"));
                } catch (Exception unused3) {
                    i4 = Color.parseColor("#000000");
                }
                int optInt = jSONObject5.optInt("fontSize", 12);
                int k = C88020k.m109560k(jSONObject5, "anchorX", C88020k.m109560k(jSONObject5, "x", 0));
                int k2 = C88020k.m109560k(jSONObject5, "anchorY", C88020k.m109560k(jSONObject5, "y", 0));
                int k3 = C88020k.m109560k(jSONObject5, "borderRadius", 0);
                int k4 = C88020k.m109560k(jSONObject5, "borderWidth", 0);
                int a = C88020k.m109550a(jSONObject5.optString("borderColor"));
                try {
                    i5 = C88020k.m109562m(jSONObject5.optString("bgColor", ""));
                } catch (Exception unused4) {
                    i5 = Color.parseColor("#000000");
                }
                int k5 = C88020k.m109560k(jSONObject5, "padding", 0);
                String optString4 = jSONObject5.optString("textAlign", "");
                int k6 = C88020k.m109560k(jSONObject5, "width", -1);
                int k7 = C88020k.m109560k(jSONObject5, "height", -1);
                C118080q.C118108w.C118110b bVar = new C118080q.C118108w.C118110b(optString3, i4, optInt, k, k2, i5, k3, k4, a, optString4, k5);
                wVar.f353076s = bVar;
                bVar.f353102m = k6;
                bVar.f353101l = k7;
            }
        }
        String optString5 = jSONObject8.optString("callout");
        if (!Util.isNullOrNil(optString5)) {
            try {
                jSONObject4 = new JSONObject(optString5);
            } catch (JSONException unused5) {
                jSONObject4 = null;
            }
            if (jSONObject4 != null) {
                String optString6 = jSONObject4.optString("content");
                try {
                    i = C88020k.m109562m(jSONObject4.optString("color", "#000000"));
                } catch (Exception unused6) {
                    i = Color.parseColor("#000000");
                }
                int optInt2 = jSONObject4.optInt("fontSize", 12);
                int k8 = C88020k.m109560k(jSONObject4, "borderRadius", 0);
                int k9 = C88020k.m109560k(jSONObject4, "borderWidth", 0);
                int a2 = C88020k.m109550a(jSONObject4.optString("borderColor"));
                try {
                    i2 = C88020k.m109562m(jSONObject4.optString("bgColor", "#000000"));
                } catch (Exception unused7) {
                    i2 = Color.parseColor("#000000");
                }
                int k15 = C88020k.m109560k(jSONObject4, "padding", 0);
                try {
                    i3 = C88020k.m109562m(jSONObject4.optString("shadowColor", "#000000"));
                } catch (Exception unused8) {
                    i3 = Color.parseColor("#000000");
                }
                wVar.f353075r = new C118080q.C118108w.C118109a(optString6, i, optInt2, k8, i2, k9, a2, k15, i3, jSONObject4.optInt("shadowOpacity"), C88020k.m109560k(jSONObject4, "shadowOffsetX", 0), C88020k.m109560k(jSONObject4, "shadowOffsetY", 0), jSONObject4.optInt("display", 0), jSONObject4.optString("textAlign", ""), C88020k.m109560k(jSONObject4, "anchorX", 0), C88020k.m109560k(jSONObject4, "anchorY", 0));
            }
        }
        String optString7 = jSONObject8.optString("customCallout");
        if (!Util.isNullOrNil(optString7)) {
            try {
                jSONObject3 = new JSONObject(optString7);
            } catch (JSONException unused9) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                boolean z = false;
                int optInt3 = jSONObject3.optInt("viewId", 0);
                int optInt4 = jSONObject3.optInt("display", 0);
                boolean optBoolean = jSONObject7.optBoolean("independent", false);
                int k16 = C88020k.m109560k(jSONObject3, "anchorX", 0);
                int k17 = C88020k.m109560k(jSONObject3, "anchorY", 0);
                C82381f fVar3 = fVar;
                View p = ((C83873p2) ((C87985i) fVar3.mo109668l(C87985i.class)).mo116941pG(fVar3, jSONObject7).mo109649c(optBoolean)).mo116438p(optInt3);
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(optInt3);
                if (p != null) {
                    z = true;
                }
                objArr[1] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.BaseMapJsApi", "viewId:%d view is %b", objArr);
                if (p != null) {
                    C118080q.C118108w.C118109a aVar = new C118080q.C118108w.C118109a();
                    wVar.f353075r = aVar;
                    aVar.f353089m = p;
                    aVar.f353085i = optInt4;
                    aVar.f353087k = k16;
                    aVar.f353088l = k17;
                }
            }
        }
        String optString8 = jSONObject8.optString("buildingId");
        String optString9 = jSONObject8.optString("floorName");
        wVar.f353071n = optString8;
        wVar.f353072o = optString9;
        return wVar;
    }

    /* renamed from: y */
    public C118080q mo182577y(C82381f fVar, JSONObject jSONObject) {
        Class cls = C87985i.class;
        if (fVar instanceof C82520h) {
            return C118117v.m166643b(fVar.getAppId(), C118116u.m166637b(fVar, jSONObject));
        }
        if (fVar.mo109668l(cls) == null) {
            Log.m105921e("MicroMsg.BaseMapJsApi", "name:%s IComponentConverter is null, return", mo114779e());
            return null;
        }
        C82520h pG = ((C87985i) fVar.mo109668l(cls)).mo116941pG(fVar, jSONObject);
        if (pG != null) {
            return C118117v.m166643b(pG.getAppId(), C118116u.m166637b(pG, jSONObject));
        }
        Log.m105921e("MicroMsg.BaseMapJsApi", "name:%s is not componentView", mo114779e());
        return null;
    }
}
