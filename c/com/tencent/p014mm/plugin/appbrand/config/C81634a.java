package com.tencent.p014mm.plugin.appbrand.config;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p225rc.C89923l;
import p225rc.C89925n;

/* renamed from: com.tencent.mm.plugin.appbrand.config.a */
public class C81634a implements C1727m {

    /* renamed from: A */
    public JSONObject f239593A;

    /* renamed from: B */
    public JSONObject f239594B;

    /* renamed from: C */
    public JSONObject f239595C;

    /* renamed from: D */
    public JSONObject f239596D;

    /* renamed from: E */
    public JSONObject f239597E;

    /* renamed from: F */
    public JSONObject f239598F;

    /* renamed from: G */
    public String f239599G;

    /* renamed from: H */
    public String f239600H;

    /* renamed from: d */
    public String f239601d;

    /* renamed from: e */
    public C81637c f239602e;

    /* renamed from: f */
    public C81637c f239603f;

    /* renamed from: g */
    public final Object f239604g = new byte[0];

    /* renamed from: h */
    public Map<String, C81639e> f239605h;

    /* renamed from: i */
    public Map<String, C81639e> f239606i;

    /* renamed from: j */
    public Map<String, C81640f> f239607j;

    /* renamed from: n */
    public C81643i f239608n;

    /* renamed from: o */
    public C81643i f239609o;

    /* renamed from: p */
    public C81638d f239610p;

    /* renamed from: q */
    public C81636b f239611q;

    /* renamed from: r */
    public Boolean f239612r = null;

    /* renamed from: s */
    public Boolean f239613s = Boolean.FALSE;

    /* renamed from: t */
    public Set<String> f239614t;

    /* renamed from: u */
    public JSONArray f239615u;

    /* renamed from: v */
    public ArrayList<String> f239616v;

    /* renamed from: w */
    public boolean f239617w = false;

    /* renamed from: x */
    public boolean f239618x = false;

    /* renamed from: y */
    public C81641g f239619y;

    /* renamed from: z */
    public Set<String> f239620z;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.a$b */
    public static class C81636b {

        /* renamed from: a */
        public String f239621a = "portrait";

        /* renamed from: b */
        public boolean f239622b = true;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.a$c */
    public static class C81637c extends C81645k {
        public C81637c(JSONObject jSONObject, boolean z) {
            super(jSONObject, (C81645k) null, z);
            (jSONObject == null ? C81645k.f239650s : jSONObject).optJSONObject("window");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.a$d */
    public static class C81638d {

        /* renamed from: a */
        public int f239623a;

        /* renamed from: b */
        public int f239624b;

        /* renamed from: c */
        public int f239625c;

        /* renamed from: d */
        public int f239626d;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.a$e */
    public static class C81639e extends C81645k {

        /* renamed from: t */
        public String f239627t;

        public C81639e(JSONObject jSONObject, C81645k kVar) {
            super(jSONObject, kVar, false);
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("window") : null;
            this.f239627t = optJSONObject != null ? optJSONObject.optString("handleWebviewPreload") : "";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.a$f */
    public static final class C81640f {

        /* renamed from: a */
        public final String f239628a;

        /* renamed from: b */
        public final String f239629b;

        public C81640f(String str, JSONObject jSONObject) {
            this.f239628a = str;
            this.f239629b = jSONObject.getString("desc");
        }

        public String toString() {
            return "Permission{name='" + this.f239628a + '\'' + ", desc='" + this.f239629b + '\'' + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.a$g */
    public static class C81641g {

        /* renamed from: a */
        public final String f239630a;

        /* renamed from: b */
        public final String[] f239631b;

        public C81641g(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f239630a = jSONObject.optString("default", "webview");
                JSONArray optJSONArray = jSONObject.optJSONArray("allUsed");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    this.f239631b = new String[0];
                } else {
                    this.f239631b = new String[optJSONArray.length()];
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.f239631b[i] = optJSONArray.optString(i, this.f239630a);
                    }
                }
                Log.m105925i("MicroMsg.AppBrandAppConfig", "renderBackend is %s, default is %s", jSONObject, this.f239630a);
                return;
            }
            Log.m105924i("MicroMsg.AppBrandAppConfig", "renderBackend is null");
            this.f239630a = "webview";
            this.f239631b = new String[0];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.a$h */
    public static class C81642h {

        /* renamed from: a */
        public String f239632a;

        /* renamed from: b */
        public String f239633b;

        /* renamed from: c */
        public double f239634c = -1.0d;

        /* renamed from: d */
        public String f239635d;

        /* renamed from: e */
        public String f239636e;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.a$j */
    public static class C81644j {

        /* renamed from: a */
        public final String f239645a;

        /* renamed from: b */
        public final String f239646b;

        /* renamed from: c */
        public final String f239647c;

        /* renamed from: d */
        public final String f239648d;

        public C81644j(JSONObject jSONObject) {
            this.f239645a = jSONObject.optString("pagePath");
            this.f239646b = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
            this.f239647c = jSONObject.optString("iconData");
            this.f239648d = jSONObject.optString("selectedIconData");
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x023f  */
    /* renamed from: h */
    public static com.tencent.p014mm.plugin.appbrand.config.C81634a m100133h(java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            com.tencent.mm.plugin.appbrand.config.a r0 = new com.tencent.mm.plugin.appbrand.config.a
            r0.<init>()
            r0.f239601d = r10
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x000d }
            r1.<init>(r11)     // Catch:{ Exception -> 0x000d }
            goto L_0x001c
        L_0x000d:
            r11 = move-exception
            java.lang.String r1 = "MicroMsg.AppBrandAppConfig"
            java.lang.String r11 = r11.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r11)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x001c:
            int r11 = r1.length()
            if (r11 == 0) goto L_0x0026
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r0.f239613s = r11
        L_0x0026:
            java.lang.String r11 = "entryPagePath"
            java.lang.String r11 = r1.optString(r11)
            r0.f239599G = r11
            java.lang.String r11 = "referrerPolicy"
            java.lang.String r11 = r1.optString(r11)
            r0.f239600H = r11
            java.lang.String r11 = "global"
            org.json.JSONObject r11 = r1.optJSONObject(r11)
            com.tencent.mm.plugin.appbrand.config.a$c r2 = new com.tencent.mm.plugin.appbrand.config.a$c
            r2.<init>(r11, r14)
            r0.f239602e = r2
            java.lang.String r11 = "page"
            org.json.JSONObject r11 = r1.optJSONObject(r11)
            com.tencent.mm.plugin.appbrand.config.a$c r2 = r0.f239602e
            java.util.Map r11 = m100134i(r11, r2)
            java.lang.String r2 = "permission"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r2 != 0) goto L_0x0060
            goto L_0x008b
        L_0x0060:
            java.util.Iterator r4 = r2.keys()
        L_0x0064:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x008b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            org.json.JSONObject r6 = r2.optJSONObject(r5)
            if (r6 != 0) goto L_0x0077
            goto L_0x0064
        L_0x0077:
            com.tencent.mm.plugin.appbrand.config.a$f r7 = new com.tencent.mm.plugin.appbrand.config.a$f     // Catch:{ JSONException -> 0x0080 }
            r7.<init>(r5, r6)     // Catch:{ JSONException -> 0x0080 }
            r3.put(r5, r7)     // Catch:{ JSONException -> 0x0080 }
            goto L_0x0064
        L_0x0080:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "MicroMsg.AppBrandAppConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
            goto L_0x0064
        L_0x008b:
            r0.f239607j = r3
            java.lang.String r2 = "tabBar"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            r3 = 0
            if (r2 != 0) goto L_0x009c
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L_0x009c:
            com.tencent.mm.plugin.appbrand.config.a$i r4 = new com.tencent.mm.plugin.appbrand.config.a$i
            r4.<init>(r2, r3)
            r0.f239608n = r4
            java.lang.String r2 = "networkTimeout"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            com.tencent.mm.plugin.appbrand.config.a$d r4 = new com.tencent.mm.plugin.appbrand.config.a$d
            r4.<init>()
            if (r2 != 0) goto L_0x00b5
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L_0x00b5:
            java.lang.String r5 = "request"
            int r5 = r2.optInt(r5)
            r4.f239623a = r5
            java.lang.String r5 = "connectSocket"
            int r5 = r2.optInt(r5)
            r4.f239624b = r5
            java.lang.String r5 = "downloadFile"
            int r5 = r2.optInt(r5)
            r4.f239626d = r5
            java.lang.String r5 = "uploadFile"
            int r2 = r2.optInt(r5)
            r4.f239625c = r2
            r0.f239610p = r4
            com.tencent.mm.plugin.appbrand.config.a$b r2 = new com.tencent.mm.plugin.appbrand.config.a$b
            r2.<init>()
            java.lang.String r4 = "deviceOrientation"
            java.lang.String r5 = "portrait"
            java.lang.String r4 = r1.optString(r4, r5)
            r2.f239621a = r4
            java.lang.String r4 = "showStatusBar"
            r5 = 0
            boolean r4 = r1.optBoolean(r4, r5)
            r2.f239622b = r4
            r0.f239611q = r2
            java.lang.String r2 = "useCommandBuffer"
            boolean r2 = r1.has(r2)
            if (r2 == 0) goto L_0x010b
            java.lang.String r2 = "useCommandBuffer"
            boolean r2 = r1.optBoolean(r2, r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.f239612r = r2
        L_0x010b:
            java.lang.String r2 = "requiredBackgroundModes"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            if (r2 != 0) goto L_0x011a
            goto L_0x0131
        L_0x011a:
            r6 = 0
        L_0x011b:
            int r7 = r2.length()
            if (r6 >= r7) goto L_0x0131
            java.lang.String r7 = r2.optString(r6)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x012e
            r4.add(r7)
        L_0x012e:
            int r6 = r6 + 1
            goto L_0x011b
        L_0x0131:
            r0.f239614t = r4
            java.lang.String r2 = "preloadResources"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            r0.f239615u = r2
            java.lang.String r2 = "preloadSubpackages"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r2 != 0) goto L_0x014b
            goto L_0x01a0
        L_0x014b:
            r6 = 0
        L_0x014c:
            int r7 = r2.length()
            if (r6 >= r7) goto L_0x01a0
            org.json.JSONObject r7 = r2.optJSONObject(r6)
            if (r7 != 0) goto L_0x0159
            goto L_0x019d
        L_0x0159:
            java.lang.String r8 = "root"
            java.lang.String r7 = r7.optString(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x019d
            java.lang.String r8 = "/"
            boolean r9 = r7.startsWith(r8)
            if (r9 != 0) goto L_0x017d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
        L_0x017d:
            java.lang.String r9 = ".js"
            boolean r9 = r7.endsWith(r9)
            if (r9 != 0) goto L_0x019a
            boolean r9 = r7.endsWith(r8)
            if (r9 != 0) goto L_0x019a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
        L_0x019a:
            r4.add(r7)
        L_0x019d:
            int r6 = r6 + 1
            goto L_0x014c
        L_0x01a0:
            r0.f239616v = r4
            java.lang.String r2 = "manualHideSplashScreen"
            boolean r2 = r1.optBoolean(r2, r5)
            r0.f239617w = r2
            java.lang.String r2 = "resizable"
            boolean r2 = r1.optBoolean(r2, r5)
            r0.f239618x = r2
            com.tencent.mm.plugin.appbrand.config.a$g r2 = new com.tencent.mm.plugin.appbrand.config.a$g
            java.lang.String r4 = "renderer"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            r2.<init>(r4)
            r0.f239619y = r2
            java.lang.String r2 = "requiredPrivateInfos"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            if (r2 != 0) goto L_0x01d0
            goto L_0x01e7
        L_0x01d0:
            r6 = 0
        L_0x01d1:
            int r7 = r2.length()
            if (r6 >= r7) goto L_0x01e7
            java.lang.String r7 = r2.optString(r6)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x01e4
            r4.add(r7)
        L_0x01e4:
            int r6 = r6 + 1
            goto L_0x01d1
        L_0x01e7:
            r0.f239620z = r4
            r2 = 1
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x0206 }
            if (r4 != 0) goto L_0x0200
            java.lang.String r4 = "{}"
            boolean r4 = r4.equals(r12)     // Catch:{ Exception -> 0x0206 }
            if (r4 == 0) goto L_0x01fa
            goto L_0x0200
        L_0x01fa:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0206 }
            r4.<init>(r12)     // Catch:{ Exception -> 0x0206 }
            goto L_0x021b
        L_0x0200:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0206 }
            r4.<init>()     // Catch:{ Exception -> 0x0206 }
            goto L_0x021b
        L_0x0206:
            r12 = move-exception
            java.lang.String r4 = "MicroMsg.AppBrandAppConfig"
            java.lang.String r6 = "parse darkMode appId:%s, e:%s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r5] = r10
            r7[r2] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r6, r7)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L_0x021b:
            java.lang.String r12 = "MicroMsg.AppBrandAppConfig"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "darkModeJson is Empty = "
            r6.append(r7)
            int r7 = r4.length()
            if (r7 != 0) goto L_0x022e
            goto L_0x022f
        L_0x022e:
            r2 = 0
        L_0x022f:
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            int r12 = r4.length()
            if (r12 == 0) goto L_0x026e
            java.lang.String r12 = "global"
            org.json.JSONObject r12 = r4.optJSONObject(r12)
            com.tencent.mm.plugin.appbrand.config.a$c r2 = new com.tencent.mm.plugin.appbrand.config.a$c
            r2.<init>(r12, r14)
            r0.f239603f = r2
            java.lang.String r12 = "tabBar"
            org.json.JSONObject r12 = r4.optJSONObject(r12)
            if (r12 != 0) goto L_0x025a
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
        L_0x025a:
            com.tencent.mm.plugin.appbrand.config.a$i r14 = new com.tencent.mm.plugin.appbrand.config.a$i
            r14.<init>(r12, r3)
            r0.f239609o = r14
            java.lang.String r12 = "page"
            org.json.JSONObject r12 = r4.optJSONObject(r12)
            com.tencent.mm.plugin.appbrand.config.a$c r14 = r0.f239603f
            java.util.Map r3 = m100134i(r12, r14)
        L_0x026e:
            java.lang.Object r12 = r0.f239604g
            monitor-enter(r12)
            r0.f239605h = r11     // Catch:{ all -> 0x02d6 }
            r0.f239606i = r3     // Catch:{ all -> 0x02d6 }
            monitor-exit(r12)     // Catch:{ all -> 0x02d6 }
            java.lang.String r11 = "theme"
            java.lang.String r12 = "MicroMsg.AppBrandAppConfig"
            r0.f239593A = r1
            java.lang.String r14 = "page"
            java.lang.String r2 = "preloadRule"
            org.json.JSONObject r3 = r1.optJSONObject(r14)
            r0.f239595C = r3
            org.json.JSONObject r1 = r1.optJSONObject(r2)
            r0.f239597E = r1
            org.json.JSONObject r1 = r0.f239593A
            if (r1 == 0) goto L_0x0296
            wi0.C90974b.m114134a(r10, r1, r13)
        L_0x0296:
            r0.f239594B = r4
            org.json.JSONObject r14 = r4.optJSONObject(r14)
            r0.f239596D = r14
            org.json.JSONObject r14 = r4.optJSONObject(r2)
            r0.f239598F = r14
            org.json.JSONObject r14 = r4.optJSONObject(r2)
            r0.f239598F = r14
            int r14 = r4.length()
            if (r14 <= 0) goto L_0x02ce
            boolean r14 = r0.mo113986e()     // Catch:{ JSONException -> 0x02c6 }
            if (r14 == 0) goto L_0x02b9
            java.lang.String r14 = "dark"
            goto L_0x02bb
        L_0x02b9:
            java.lang.String r14 = "light"
        L_0x02bb:
            org.json.JSONObject r1 = r0.f239594B     // Catch:{ JSONException -> 0x02c6 }
            r1.put(r11, r14)     // Catch:{ JSONException -> 0x02c6 }
            org.json.JSONObject r1 = r0.f239593A     // Catch:{ JSONException -> 0x02c6 }
            r1.put(r11, r14)     // Catch:{ JSONException -> 0x02c6 }
            goto L_0x02ce
        L_0x02c6:
            r11 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r5]
            java.lang.String r1 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r11, r1, r14)
        L_0x02ce:
            org.json.JSONObject r11 = r0.f239594B
            if (r11 == 0) goto L_0x02d5
            wi0.C90974b.m114134a(r10, r11, r13)
        L_0x02d5:
            return r0
        L_0x02d6:
            r10 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x02d6 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.C81634a.m100133h(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):com.tencent.mm.plugin.appbrand.config.a");
    }

    /* renamed from: i */
    public static Map<String, C81639e> m100134i(JSONObject jSONObject, C81637c cVar) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, new C81639e(jSONObject.optJSONObject(next), cVar));
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f239603f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.config.C81634a.C81637c mo113982a() {
        /*
            r1 = this;
            boolean r0 = r1.mo113986e()
            if (r0 == 0) goto L_0x000b
            com.tencent.mm.plugin.appbrand.config.a$c r0 = r1.f239603f
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            com.tencent.mm.plugin.appbrand.config.a$c r0 = r1.f239602e
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.C81634a.mo113982a():com.tencent.mm.plugin.appbrand.config.a$c");
    }

    /* renamed from: b */
    public String mo113983b() {
        return !Util.isNullOrNil(this.f239599G) ? this.f239599G : "index.html";
    }

    /* renamed from: c */
    public C81639e mo113984c(String str) {
        Map<String, C81639e> map;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f239604g) {
                if (!((HashMap) this.f239605h).containsKey(str)) {
                    str = C81412d0.m99875i(str);
                }
                if (((HashMap) this.f239605h).containsKey(str)) {
                    if (!mo113986e() || (map = this.f239606i) == null || !map.containsKey(str)) {
                        C81639e eVar = (C81639e) ((HashMap) this.f239605h).get(str);
                        return eVar;
                    }
                    C81639e eVar2 = this.f239606i.get(str);
                    return eVar2;
                }
            }
        }
        return new C81639e((JSONObject) null, this.f239602e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f239609o;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.config.C81634a.C81643i mo113985d() {
        /*
            r1 = this;
            boolean r0 = r1.mo113986e()
            if (r0 == 0) goto L_0x000b
            com.tencent.mm.plugin.appbrand.config.a$i r0 = r1.f239609o
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            com.tencent.mm.plugin.appbrand.config.a$i r0 = r1.f239608n
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.C81634a.mo113985d():com.tencent.mm.plugin.appbrand.config.a$i");
    }

    /* renamed from: e */
    public final boolean mo113986e() {
        return C89923l.f258408a.mo117499e(this.f239601d);
    }

    /* renamed from: f */
    public final boolean mo113987f() {
        JSONObject jSONObject = this.f239594B;
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* renamed from: g */
    public final boolean mo113988g() {
        return mo113987f() && mo113986e();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.a$i */
    public static class C81643i {

        /* renamed from: h */
        public static final C81643i f239637h = new C81643i();

        /* renamed from: a */
        public final String f239638a;

        /* renamed from: b */
        public final String f239639b;

        /* renamed from: c */
        public final String f239640c;

        /* renamed from: d */
        public final String f239641d;

        /* renamed from: e */
        public final String f239642e;

        /* renamed from: f */
        public final boolean f239643f;

        /* renamed from: g */
        public final ArrayList<C81644j> f239644g;

        public C81643i() {
            this.f239644g = new ArrayList<>();
            this.f239638a = "";
            this.f239639b = "";
            this.f239640c = "";
            this.f239641d = "";
            this.f239642e = "";
            this.f239643f = false;
        }

        /* renamed from: a */
        public boolean mo113990a(String str) {
            Iterator<C81644j> it = this.f239644g.iterator();
            while (it.hasNext()) {
                if (it.next().f239645a.equals(C89925n.m112488a(str))) {
                    return true;
                }
            }
            return false;
        }

        public C81643i(JSONObject jSONObject, C81643i iVar) {
            ArrayList<C81644j> arrayList = new ArrayList<>();
            this.f239644g = arrayList;
            iVar = iVar == null ? f239637h : iVar;
            this.f239638a = jSONObject.optString("position", iVar.f239638a);
            this.f239639b = jSONObject.optString("color", iVar.f239639b);
            this.f239640c = jSONObject.optString("selectedColor", iVar.f239640c);
            this.f239641d = jSONObject.optString("backgroundColor", iVar.f239641d);
            this.f239642e = jSONObject.optString("borderStyle", iVar.f239642e);
            this.f239643f = jSONObject.optBoolean("custom", iVar.f239643f);
            arrayList.addAll(iVar.f239644g);
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("list");
                for (int i = 0; i < jSONArray.length(); i++) {
                    C81644j jVar = new C81644j(jSONArray.getJSONObject(i));
                    Iterator<C81644j> it = this.f239644g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (TextUtils.equals(it.next().f239645a, jVar.f239645a)) {
                                it.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    this.f239644g.add(jVar);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrandAppConfig", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.a$k */
    public static abstract class C81645k {

        /* renamed from: r */
        public static final C81645k f239649r = new C81646a();

        /* renamed from: s */
        public static final JSONObject f239650s = new JSONObject();

        /* renamed from: a */
        public final String f239651a;

        /* renamed from: b */
        public final String f239652b;

        /* renamed from: c */
        public final String f239653c;

        /* renamed from: d */
        public final String f239654d;

        /* renamed from: e */
        public final String f239655e;

        /* renamed from: f */
        public final boolean f239656f;

        /* renamed from: g */
        public final String f239657g;

        /* renamed from: h */
        public final String f239658h;

        /* renamed from: i */
        public final boolean f239659i;

        /* renamed from: j */
        public final boolean f239660j;

        /* renamed from: k */
        public final boolean f239661k;

        /* renamed from: l */
        public final String f239662l;

        /* renamed from: m */
        public final String f239663m;

        /* renamed from: n */
        public String f239664n;

        /* renamed from: o */
        public final C81642h f239665o;

        /* renamed from: p */
        public final String f239666p;

        /* renamed from: q */
        public boolean f239667q;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.a$k$a */
        public class C81646a extends C81645k {
            public C81646a() {
                super((C81635a) null);
            }
        }

        public C81645k(C81635a aVar) {
            this.f239664n = "";
            this.f239651a = null;
            this.f239652b = null;
            this.f239653c = "default";
            this.f239654d = "#000000";
            this.f239655e = null;
            this.f239656f = false;
            this.f239657g = null;
            this.f239658h = null;
            this.f239659i = false;
            this.f239660j = false;
            this.f239661k = false;
            this.f239662l = null;
            this.f239663m = null;
            this.f239665o = new C81642h();
            this.f239666p = null;
            this.f239667q = false;
        }

        public C81645k(JSONObject jSONObject, C81645k kVar, boolean z) {
            String str;
            this.f239664n = "";
            this.f239667q = false;
            kVar = kVar == null ? f239649r : kVar;
            jSONObject = jSONObject == null ? f239650s : jSONObject;
            JSONObject optJSONObject = jSONObject.optJSONObject("window");
            optJSONObject = optJSONObject == null ? f239650s : optJSONObject;
            this.f239651a = optJSONObject.optString("navigationBarTitleText", kVar.f239651a);
            this.f239652b = optJSONObject.optString("navigationBarTextStyle", kVar.f239652b);
            if (z) {
                str = "custom";
            } else {
                str = optJSONObject.optString("navigationStyle", kVar.f239653c);
            }
            this.f239653c = str;
            this.f239654d = optJSONObject.optString("navigationBarBackgroundColor", kVar.f239654d);
            this.f239657g = optJSONObject.optString("backgroundColor", kVar.f239657g);
            this.f239658h = optJSONObject.optString("backgroundColorContent", kVar.f239658h);
            this.f239660j = optJSONObject.optBoolean("enablePullDownRefresh", kVar.f239660j);
            this.f239662l = optJSONObject.optString("backgroundTextStyle", kVar.f239662l);
            this.f239659i = optJSONObject.optBoolean("enableFullScreen", kVar.f239659i);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("navigationBarRightButton");
            optJSONObject2 = optJSONObject2 == null ? f239650s : optJSONObject2;
            this.f239661k = optJSONObject.optBoolean("disableSwipeBack", kVar.f239661k);
            this.f239656f = optJSONObject2.optBoolean("hide", kVar.f239656f);
            this.f239655e = optJSONObject2.optString("customButtonIconData", kVar.f239655e);
            this.f239663m = optJSONObject.optString("pageOrientation", kVar.f239663m);
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("singlePage");
            optJSONObject3 = optJSONObject3 == null ? jSONObject.optJSONObject("singlePage") : optJSONObject3;
            C81642h hVar = new C81642h();
            if (optJSONObject3 != null) {
                hVar.f239632a = optJSONObject3.optString("navigationBarFit", (String) null);
                hVar.f239633b = optJSONObject3.optString("navigationBarBackgroundColor", "");
                hVar.f239634c = optJSONObject3.optDouble("navigationBarBackgroundAlpha", -1.0d);
                hVar.f239635d = optJSONObject3.optString("navigationBarTextStyle", "");
                hVar.f239636e = optJSONObject3.optString("navigationBarTitleText", "");
            }
            this.f239665o = hVar;
            optJSONObject.optBoolean("resizable", false);
            this.f239666p = optJSONObject.optString("visualEffectInBackground", kVar.f239666p);
            this.f239664n = optJSONObject.optString("renderer", "");
            this.f239667q = optJSONObject.optBoolean("homeButton", kVar.f239667q);
        }
    }
}
