package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82085i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import fl0.C86918c;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p225rc.C48016e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p */
public abstract class C82870p extends C82374e {

    /* renamed from: e */
    public boolean f242314e = false;

    /* renamed from: f */
    public int f242315f = Integer.MIN_VALUE;

    /* renamed from: g */
    public String mo115107g() {
        return "errMsg";
    }

    /* renamed from: h */
    public boolean mo114532h() {
        return this instanceof C82085i;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|16|17|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r2 = (java.lang.reflect.Field) b34.C79664a.m96759a(r3.getDeclaredField("CTRL_INDEX"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        throw new b34.C79665b(r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[Catch:{ NoSuchFieldException -> 0x0017, Exception -> 0x003c }, LOOP:0: B:8:0x0019->B:19:0x0044, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0045 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo115108i() {
        /*
            r5 = this;
            int r0 = r5.f242315f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x0063
            java.lang.Class r0 = r5.getClass()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = "CTRL_INDEX"
            java.lang.reflect.Field r2 = r0.getField(r1)     // Catch:{ NoSuchFieldException -> 0x0017 }
            java.lang.reflect.AccessibleObject r2 = b34.C79664a.m96759a(r2)     // Catch:{ NoSuchFieldException -> 0x0017 }
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch:{ NoSuchFieldException -> 0x0017 }
            goto L_0x0024
        L_0x0017:
            r2 = move-exception
            r3 = r0
        L_0x0019:
            java.lang.reflect.Field r4 = r3.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x003e }
            java.lang.reflect.AccessibleObject r4 = b34.C79664a.m96759a(r4)     // Catch:{ NoSuchFieldException -> 0x003e }
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch:{ NoSuchFieldException -> 0x003e }
            r2 = r4
        L_0x0024:
            java.lang.Class r1 = r2.getType()     // Catch:{ Exception -> 0x003c }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x003c }
            b34.a r2 = new b34.a     // Catch:{ Exception -> 0x003c }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x003c }
            java.lang.Object r0 = r2.f233575b     // Catch:{ Exception -> 0x0051 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0051 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0051 }
            r5.f242315f = r0     // Catch:{ Exception -> 0x0051 }
            goto L_0x0063
        L_0x003c:
            r0 = move-exception
            goto L_0x004b
        L_0x003e:
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x003c }
            if (r3 == 0) goto L_0x0045
            goto L_0x0019
        L_0x0045:
            b34.b r0 = new b34.b     // Catch:{ Exception -> 0x003c }
            r0.<init>(r2)     // Catch:{ Exception -> 0x003c }
            throw r0     // Catch:{ Exception -> 0x003c }
        L_0x004b:
            b34.b r1 = new b34.b     // Catch:{ Exception -> 0x0051 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0051 }
            throw r1     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1[r2] = r0
            java.lang.String r0 = "MicroMsg.AppBrandJsApi"
            java.lang.String r2 = "getCtrlIndex exp = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
        L_0x0063:
            int r0 = r5.f242315f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C82870p.mo115108i():int");
    }

    @Deprecated
    /* renamed from: j */
    public final String mo115109j(String str) {
        if (!this.f242314e || 1157 > mo115108i()) {
            return mo115113n(str, (JSONObject) null);
        }
        throw new IllegalArgumentException("makeReturnJson(String) is deprecated");
    }

    /* renamed from: k */
    public final String mo115110k(String str, C86918c cVar, Map<String, ? extends Object> map) {
        HashMap hashMap;
        int i = cVar.f252304a;
        if (str == null) {
            str = cVar.f252305b;
        }
        if (str == null) {
            str = "";
        }
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", Integer.valueOf(i), str);
        }
        if (!(map instanceof HashMap)) {
            if (map != null) {
                hashMap = new HashMap(map);
            }
            map = hashMap;
        }
        map.put("errno", Integer.valueOf(i));
        return mo115114o(str, map);
    }

    /* renamed from: l */
    public final String mo115111l(String str, C86918c cVar, JSONObject jSONObject) {
        int i = cVar.f252304a;
        if (str == null) {
            str = cVar.f252305b;
        }
        if (str == null) {
            str = "";
        }
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", Integer.valueOf(i), str);
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("errno", i);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        return mo115115p(str, jSONObject);
    }

    @Deprecated
    /* renamed from: m */
    public String mo115112m(String str, Map<String, ? extends Object> map) {
        if (!this.f242314e || 1157 > mo115108i()) {
            return mo115114o(str, map);
        }
        throw new IllegalArgumentException("makeReturnJson(String, Map<String, ? extends Object>) is deprecated");
    }

    @Deprecated
    /* renamed from: n */
    public String mo115113n(String str, JSONObject jSONObject) {
        if (!this.f242314e || 1157 > mo115108i()) {
            return mo115115p(str, jSONObject);
        }
        throw new IllegalArgumentException("makeReturnJson(String, JSONObject) is deprecated");
    }

    /* renamed from: o */
    public final String mo115114o(String str, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2;
        if ("cancel".equals(str)) {
            str = "fail cancel";
        }
        if (!str.startsWith("fail") && !str.startsWith("ok")) {
            String format = String.format(Locale.ENGLISH, "api[%s] assert, argument [reason] must start with special prefix", new Object[]{mo114779e()});
            if (!this.f242314e) {
                Log.m105920e("MicroMsg.AppBrandJsApi", format);
            } else {
                throw new IllegalArgumentException(format);
            }
        }
        if (map instanceof HashMap) {
            map2 = map;
        } else if (map != null) {
            map2 = new HashMap<>(map);
        }
        if (map != null && map.containsKey(mo115107g())) {
            String str2 = "api " + mo114779e() + ": Cant put errMsg in res!!!";
            if (!this.f242314e) {
                Log.m105920e("MicroMsg.AppBrandJsApi", str2);
            } else {
                throw new IllegalArgumentException(str2);
            }
        }
        map2.put(mo115107g(), mo114779e() + XVFSFile.PATH_SEPARATOR + str);
        C48016e.m53378d(map2);
        return new JSONObject(map2).toString();
    }

    /* renamed from: p */
    public String mo115115p(String str, JSONObject jSONObject) {
        if ("cancel".equals(str)) {
            str = "fail cancel";
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.has(mo115107g())) {
            String str2 = "api " + mo114779e() + ": Cant put errMsg in res!!!";
            if (!this.f242314e) {
                Log.m105920e("MicroMsg.AppBrandJsApi", str2);
            } else {
                throw new IllegalArgumentException(str2);
            }
        }
        if (!str.startsWith("fail") && !str.startsWith("ok")) {
            String format = String.format(Locale.ENGLISH, "api[%s] assert, argument [reason] must start with special prefix", new Object[]{mo114779e()});
            if (!this.f242314e) {
                Log.m105920e("MicroMsg.AppBrandJsApi", format);
            } else {
                throw new IllegalArgumentException(format);
            }
        }
        try {
            jSONObject.put(mo115107g(), mo114779e() + XVFSFile.PATH_SEPARATOR + str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errMsg, e=%s", e);
        }
        return jSONObject.toString();
    }

    /* renamed from: q */
    public final String mo115116q(C82381f fVar, C86918c cVar, Map<String, ? extends Object> map) {
        if (C84782s1.m104463d(fVar.getJsRuntime(), map, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) != C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT) {
            return mo115110k((String) null, cVar, map);
        }
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 2, "fail:convert native buffer parameter fail. native buffer exceed size limit.");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errno", 2);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        return mo115115p("fail:convert native buffer parameter fail. native buffer exceed size limit.", jSONObject);
    }

    @Deprecated
    /* renamed from: r */
    public final String mo115117r(C82381f fVar, String str, Map<String, ? extends Object> map) {
        if (!this.f242314e || 1157 > mo115108i()) {
            return C84782s1.m104463d(fVar.getJsRuntime(), map, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) == C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT ? mo115109j("fail:convert native buffer parameter fail. native buffer exceed size limit.") : mo115112m(str, map);
        }
        throw new IllegalArgumentException("makeReturnJsonWithNativeBuffer is deprecated");
    }

    /* renamed from: s */
    public ByteBuffer mo115118s(String str, C83170k kVar, int i) {
        return kVar.mo115416k1(i, false);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p$a */
    public static class C82871a {

        /* renamed from: a */
        public final Map<String, Object> f242316a = new HashMap();

        /* renamed from: b */
        public final String f242317b;

        /* renamed from: c */
        public C86918c f242318c;

        public C82871a(String str, Object... objArr) {
            if (objArr == null || objArr.length <= 0) {
                this.f242317b = str;
            } else {
                this.f242317b = String.format(str, objArr);
            }
        }

        public C82871a(C86918c cVar, Object... objArr) {
            this.f242318c = cVar;
            this.f242317b = cVar.f252305b;
        }
    }
}
