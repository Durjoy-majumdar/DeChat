package je1;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dp1.C45435i2;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60206u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import org.json.JSONObject;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C36907w;
import te3.C49434fk0;
import te3.C49571gk0;
import te3.C49704hh0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C51822we1;
import tf0.C64916p1;
import z04.C112551y;
import z04.C119027c;
import zc1.C66785b;

/* renamed from: je1.h2 */
public final class C46523h2 {

    /* renamed from: a */
    public static final C46523h2 f125330a = new C46523h2();

    /* renamed from: b */
    public static String f125331b = "";

    /* renamed from: c */
    public static String f125332c = "";

    /* renamed from: d */
    public static long f125333d;

    /* renamed from: e */
    public static long f125334e;

    /* renamed from: i */
    public static String m51821i(C46523h2 h2Var, String str, String str2, boolean z, int i, Object obj) {
        String str3;
        if ((i & 4) != 0) {
            z = false;
        }
        h2Var.getClass();
        C87412m.m108594g(str, "udfKv");
        C87412m.m108594g(str2, "kvJsonStr");
        if (!Util.isNullOrNil(str2)) {
            if (C112551y.m153819s(str, "{", false)) {
                str3 = h2Var.mo71866h(new JSONObject(str), str2, z);
            } else {
                try {
                    if (!Util.isNullOrNil(str)) {
                        byte[] decode = Base64.decode(str, 2);
                        C87412m.m108593f(decode, "decode(udfKv, Base64.NO_WRAP)");
                        str3 = h2Var.mo71866h(new JSONObject(new String(decode, C119027c.f356488a)), str2, z);
                    } else if (z) {
                        byte[] bytes = str2.getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        str3 = Base64.encodeToString(bytes, 2);
                    } else {
                        str3 = new JSONObject(str2).toString();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("Finder.BaseRequestFactory", e, "fillClientReportInfo", new Object[0]);
                    str3 = "";
                }
                C87412m.m108593f(str3, "{\n            try {\n    …\"\n            }\n        }");
            }
            return str3;
        } else if (!C112551y.m153819s(str, "{", false)) {
            return str;
        } else {
            byte[] bytes2 = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes2, 2);
            C87412m.m108593f(encodeToString, "{\n                Base64…64.NO_WRAP)\n            }");
            return encodeToString;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005b, code lost:
        if (up1.C37521f.f99227L8.mo60266n().intValue() == 1) goto L_0x005d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C49842ig0 mo71859a(int r6) {
        /*
            r5 = this;
            te3.ig0 r0 = new te3.ig0
            r0.<init>()
            up1.n r1 = up1.C14356n.f39907a
            r1.mo13660a(r0)
            r5.mo71862d(r0)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_USER_VERSION_INT_SYNC
            r3 = 0
            int r1 = r1.mo119689j(r2, r3)
            r0.f135312d = r1
            int r1 = r5.mo71870m()
            r0.f135318j = r1
            long r1 = eb0.C31543z5.m39453c()
            r0.f135317i = r1
            te3.cf0 r1 = new te3.cf0
            r1.<init>()
            r0.f135321p = r1
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99444k8
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 1
            if (r2 != r3) goto L_0x0048
            r5.mo71861c(r0)
        L_0x0048:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 != 0) goto L_0x005d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99227L8
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r3) goto L_0x0064
        L_0x005d:
            long r1 = r0.f135323r
            r3 = 2
            long r1 = r1 | r3
            r0.f135323r = r1
        L_0x0064:
            pe3.b r6 = r5.mo71869l(r6)
            r0.f135322q = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46523h2.mo71859a(int):te3.ig0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c4, code lost:
        if (up1.C37521f.f99227L8.mo60266n().intValue() == 1) goto L_0x00c6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C49842ig0 mo71860b(int r5, te3.C49712hj1 r6) {
        /*
            r4 = this;
            te3.ig0 r0 = new te3.ig0
            r0.<init>()
            up1.n r1 = up1.C14356n.f39907a
            r1.mo13660a(r0)
            r4.mo71862d(r0)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_USER_VERSION_INT_SYNC
            r3 = 0
            int r1 = r1.mo119689j(r2, r3)
            r0.f135312d = r1
            int r1 = r4.mo71870m()
            r0.f135318j = r1
            te3.ow r1 = new te3.ow
            r1.<init>()
            r0.f135316h = r1
            pe3.b r5 = r4.mo71869l(r5)
            r0.f135322q = r5
            if (r6 == 0) goto L_0x008d
            int r5 = r6.f134675i
            r0.f135313e = r5
            te3.ow r5 = r0.f135316h
            if (r5 != 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            java.lang.String r1 = r6.f134671e
            r5.f139396d = r1
        L_0x0040:
            if (r5 != 0) goto L_0x0043
            goto L_0x0047
        L_0x0043:
            java.lang.String r1 = r6.f134672f
            r5.f139397e = r1
        L_0x0047:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r1 = "sessionId"
            java.lang.String r2 = r6.f134670d     // Catch:{ Exception -> 0x0081 }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r1 = r6.f134681r     // Catch:{ Exception -> 0x0081 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x0081 }
            if (r1 != 0) goto L_0x0062
            java.lang.String r1 = "extraInfo"
            java.lang.String r2 = r6.f134681r     // Catch:{ Exception -> 0x0081 }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x0081 }
        L_0x0062:
            java.lang.String r1 = r6.f134682s     // Catch:{ Exception -> 0x0081 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x0081 }
            if (r1 != 0) goto L_0x0071
            java.lang.String r1 = "enterSourceInfo"
            java.lang.String r2 = r6.f134682s     // Catch:{ Exception -> 0x0081 }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x0081 }
        L_0x0071:
            java.lang.String r1 = r6.f134686w     // Catch:{ Exception -> 0x0081 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x0081 }
            if (r1 != 0) goto L_0x0082
            java.lang.String r1 = "jumpId"
            java.lang.String r6 = r6.f134686w     // Catch:{ Exception -> 0x0081 }
            r5.put(r1, r6)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0082
        L_0x0081:
        L_0x0082:
            te3.ow r6 = r0.f135316h
            if (r6 != 0) goto L_0x0087
            goto L_0x008d
        L_0x0087:
            java.lang.String r5 = r5.toString()
            r6.f139398f = r5
        L_0x008d:
            long r5 = eb0.C31543z5.m39453c()
            r0.f135317i = r5
            te3.cf0 r5 = new te3.cf0
            r5.<init>()
            r0.f135321p = r5
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99444k8
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r1 = 1
            if (r6 != r1) goto L_0x00b1
            r4.mo71861c(r0)
        L_0x00b1:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r6 != 0) goto L_0x00c6
            r5.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99227L8
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r1) goto L_0x00cd
        L_0x00c6:
            long r5 = r0.f135323r
            r1 = 2
            long r5 = r5 | r1
            r0.f135323r = r5
        L_0x00cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46523h2.mo71860b(int, te3.hj1):te3.ig0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[Catch:{ all -> 0x0099 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71861c(te3.C49842ig0 r9) {
        /*
            r8 = this;
            te3.cf0 r0 = r9.f135321p
            if (r0 != 0) goto L_0x000b
            te3.cf0 r0 = new te3.cf0
            r0.<init>()
            r9.f135321p = r0
        L_0x000b:
            te3.cf0 r9 = r9.f135321p     // Catch:{ all -> 0x0099 }
            if (r9 == 0) goto L_0x00b0
            je1.h2 r0 = f125330a     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = r0.mo71868k()     // Catch:{ all -> 0x0099 }
            r9.f131688d = r1     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r0.mo71871n()     // Catch:{ all -> 0x0099 }
            r9.f131689e = r0     // Catch:{ all -> 0x0099 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0099 }
            int r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r0)     // Catch:{ all -> 0x0099 }
            r1 = -1
            r2 = 7
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r0 == r1) goto L_0x0061
            if (r0 == 0) goto L_0x005f
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0099 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r0)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x003b
            r0 = 2
            goto L_0x0062
        L_0x003b:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0099 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r0)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0047
            r0 = 3
            goto L_0x0062
        L_0x0047:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0099 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r0)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0053
            r0 = 4
            goto L_0x0062
        L_0x0053:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0099 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is5G(r0)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0061
            r0 = 7
            goto L_0x0062
        L_0x005f:
            r0 = 1
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            r9.f131690f = r0     // Catch:{ all -> 0x0099 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0099 }
            int r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getISPCode(r0)     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0070
        L_0x006e:
            r3 = 0
            goto L_0x0094
        L_0x0070:
            int r1 = r0 / 100
            int r0 = r0 % 100
            r7 = 460(0x1cc, float:6.45E-43)
            if (r1 != r7) goto L_0x006e
            if (r0 == 0) goto L_0x0093
            if (r0 == r6) goto L_0x0091
            if (r0 == r4) goto L_0x0093
            if (r0 == r3) goto L_0x0094
            r1 = 5
            if (r0 == r1) goto L_0x0094
            r1 = 6
            if (r0 == r1) goto L_0x0091
            if (r0 == r2) goto L_0x0093
            r1 = 9
            if (r0 == r1) goto L_0x0091
            r1 = 11
            if (r0 == r1) goto L_0x0094
            goto L_0x006e
        L_0x0091:
            r3 = 2
            goto L_0x0094
        L_0x0093:
            r3 = 1
        L_0x0094:
            r9.f131691g = r3     // Catch:{ all -> 0x0099 }
            r9.f131692h = r6     // Catch:{ all -> 0x0099 }
            goto L_0x00b0
        L_0x0099:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fillAdBaseRequest failed, "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "Finder.BaseRequestFactory"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46523h2.mo71861c(te3.ig0):void");
    }

    /* renamed from: d */
    public final void mo71862d(C49842ig0 ig02) {
        if (ig02 != null) {
            ig02.f135320o |= 1;
            if (((C60206u1) C86312j.m106911c(C60206u1.class)).Cw0()) {
                ig02.f135320o |= 2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        r6 = r6.toString();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo71863e(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = "udfKv"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "commonReportInfo"
            gy3.C87412m.m108594g(r7, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            java.lang.String r2 = "{"
            r3 = 2
            r4 = 0
            if (r0 == 0) goto L_0x0033
            boolean r7 = z04.C112551y.m153819s(r6, r2, r4)
            if (r7 == 0) goto L_0x0032
            java.nio.charset.Charset r7 = z04.C119027c.f356488a
            byte[] r6 = r6.getBytes(r7)
            gy3.C87412m.m108593f(r6, r1)
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r3)
            java.lang.String r7 = "{\n                Base64…64.NO_WRAP)\n            }"
            gy3.C87412m.m108593f(r6, r7)
        L_0x0032:
            return r6
        L_0x0033:
            boolean r0 = z04.C112551y.m153819s(r6, r2, r4)
            if (r0 == 0) goto L_0x0043
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            java.lang.String r6 = r5.mo71864f(r0, r7, r8)
            goto L_0x00a8
        L_0x0043:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x009c }
            if (r0 != 0) goto L_0x0063
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x009c }
            byte[] r6 = android.util.Base64.decode(r6, r3)     // Catch:{ Exception -> 0x009c }
            java.lang.String r1 = "decode(udfKv, Base64.NO_WRAP)"
            gy3.C87412m.m108593f(r6, r1)     // Catch:{ Exception -> 0x009c }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x009c }
            java.nio.charset.Charset r2 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x009c }
            r1.<init>(r6, r2)     // Catch:{ Exception -> 0x009c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x009c }
            java.lang.String r6 = r5.mo71864f(r0, r7, r8)     // Catch:{ Exception -> 0x009c }
            goto L_0x00a8
        L_0x0063:
            java.lang.String r6 = "clientReportInfo"
            if (r8 == 0) goto L_0x008a
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x009c }
            r8.<init>(r7)     // Catch:{ Exception -> 0x009c }
            org.json.JSONObject r6 = r8.optJSONObject(r6)     // Catch:{ Exception -> 0x009c }
            if (r6 == 0) goto L_0x0086
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x009c }
            if (r6 == 0) goto L_0x0086
            java.nio.charset.Charset r7 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x009c }
            byte[] r6 = r6.getBytes(r7)     // Catch:{ Exception -> 0x009c }
            gy3.C87412m.m108593f(r6, r1)     // Catch:{ Exception -> 0x009c }
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r3)     // Catch:{ Exception -> 0x009c }
            goto L_0x0087
        L_0x0086:
            r6 = 0
        L_0x0087:
            if (r6 != 0) goto L_0x00a8
            goto L_0x00a6
        L_0x008a:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x009c }
            r8.<init>(r7)     // Catch:{ Exception -> 0x009c }
            org.json.JSONObject r6 = r8.optJSONObject(r6)     // Catch:{ Exception -> 0x009c }
            if (r6 == 0) goto L_0x00a6
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x009c }
            if (r6 != 0) goto L_0x00a8
            goto L_0x00a6
        L_0x009c:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r8 = "Finder.BaseRequestFactory"
            java.lang.String r0 = "fillClientReportInfo"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r6, r0, r7)
        L_0x00a6:
            java.lang.String r6 = ""
        L_0x00a8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46523h2.mo71863e(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: f */
    public final String mo71864f(JSONObject jSONObject, String str, boolean z) {
        String str2;
        Iterator<String> keys;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("clientReportInfo");
            if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, optJSONObject.get(next));
                }
            }
            if (z) {
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "kvJson.toString()");
                byte[] bytes = jSONObject2.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                str2 = Base64.encodeToString(bytes, 2);
            } else {
                str2 = jSONObject.toString();
            }
            C87412m.m108593f(str2, "{\n            val report…)\n            }\n        }");
            return str2;
        } catch (Exception e) {
            Log.printErrStackTrace("Finder.BaseRequestFactory", e, "fillClientReportJson", new Object[0]);
            return "";
        }
    }

    /* renamed from: g */
    public final void mo71865g(C49842ig0 ig02, List<C13604l<Integer, Long>> list, C49712hj1 hj12) {
        LinkedList<C51822we1> linkedList;
        String str;
        LinkedList<C51822we1> linkedList2;
        LinkedList<C51822we1> linkedList3;
        String str2;
        C87412m.m108594g(list, "list");
        for (C13604l lVar : list) {
            C45435i2 vP = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo9101vP(((Number) lVar.f38556e).longValue(), ((Number) lVar.f38555d).intValue());
            String str3 = "";
            String str4 = null;
            if (vP != null) {
                if (!(hj12 == null || (str2 = hj12.f134687x) == null)) {
                    C51822we1 we12 = vP.f122975a;
                    C46523h2 h2Var = f125330a;
                    String str5 = we12.f143989i;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    we12.f143989i = h2Var.mo71863e(str3, str2, false);
                }
                if (!(ig02 == null || (linkedList3 = ig02.f135319n) == null)) {
                    linkedList3.add(vP.f122975a);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("fillFinderObjectBaseInfo: commentscene=");
                sb.append(((Number) lVar.f38555d).intValue());
                sb.append(" feedId = ");
                sb.append(C61926c.m72691p(vP.f122975a.f143984d));
                sb.append(", exposeCnt = ");
                sb.append(vP.f122975a.f143988h);
                sb.append(", exposeTime = ");
                sb.append(vP.f122975a.f143987g);
                sb.append(", receiveTime = ");
                sb.append(vP.f122975a.f143986f);
                sb.append(", client_udf_kv = ");
                sb.append(vP.f122975a.f143989i);
                sb.append("commonExtraInfo = ");
                if (hj12 != null) {
                    str4 = hj12.f134687x;
                }
                sb.append(str4);
                Log.m105924i("Finder.BaseRequestFactory", sb.toString());
            } else {
                C46523h2 h2Var2 = f125330a;
                Log.m105928w("Finder.BaseRequestFactory", "[fillFinderObjectBaseInfo] feed=" + C61926c.m72691p(((Number) lVar.f38556e).longValue()) + " commentScene=" + ((Number) lVar.f38555d).intValue() + ' ' + Util.getStack());
                if (hj12 != null && (str = hj12.f134687x) != null) {
                    C51822we1 we13 = new C51822we1();
                    we13.f143985e = null;
                    we13.f143984d = ((Number) lVar.f38556e).longValue();
                    we13.f143989i = h2Var2.mo71863e(str3, str, false);
                    if (!(ig02 == null || (linkedList2 = ig02.f135319n) == null)) {
                        linkedList2.add(we13);
                    }
                    Log.m105924i("Finder.BaseRequestFactory", "fillFinderObjectBaseInfo:commonExtraInfo = " + hj12.f134687x);
                } else if (!(ig02 == null || (linkedList = ig02.f135319n) == null)) {
                    C51822we1 we14 = new C51822we1();
                    we14.f143984d = ((Number) lVar.f38556e).longValue();
                    linkedList.add(we14);
                }
            }
        }
    }

    /* renamed from: h */
    public final String mo71866h(JSONObject jSONObject, String str, boolean z) {
        String str2;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
            if (z) {
                String jSONObject3 = jSONObject.toString();
                C87412m.m108593f(jSONObject3, "udfKv.toString()");
                byte[] bytes = jSONObject3.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                str2 = Base64.encodeToString(bytes, 2);
            } else {
                str2 = jSONObject.toString();
            }
            C87412m.m108593f(str2, "{\n            val json =…)\n            }\n        }");
            return str2;
        } catch (Exception e) {
            Log.printErrStackTrace("Finder.BaseRequestFactory", e, "fillClientReportJson", new Object[0]);
            return "";
        }
    }

    /* renamed from: j */
    public final C49704hh0 mo71867j() {
        return ((C64916p1) C86312j.m106911c(C64916p1.class)).Na0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r2 > ((long) up1.C37521f.f99561x8.mo60266n().intValue())) goto L_0x0032;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo71868k() {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = f125333d
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0032
            java.lang.String r2 = f125331b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0032
            long r2 = f125333d
            long r2 = r0 - r2
            long r2 = java.lang.Math.abs(r2)
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            pe1.c<java.lang.Integer> r4 = up1.C37521f.f99561x8
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0047
        L_0x0032:
            f125333d = r0
            java.lang.Class<hy.z> r0 = p166hy.C60229z.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hy.z r0 = (p166hy.C60229z) r0
            java.lang.String r0 = r0.mo85225rD()
            java.lang.String r1 = "getService(IAdDeviceInfo…class.java).allDeviceInfo"
            gy3.C87412m.m108593f(r0, r1)
            f125331b = r0
        L_0x0047:
            java.lang.String r0 = f125331b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46523h2.mo71868k():java.lang.String");
    }

    /* renamed from: l */
    public final C89349b mo71869l(int i) {
        LinkedList<C89349b> linkedList = C66785b.f191882e.mo90673n0().mo62397b().f140460D;
        C87412m.m108593f(linkedList, "FinderAccountAccess.acco….finder_init.expt_buffers");
        for (C89349b bVar : linkedList) {
            if (bVar != null && bVar.f257327a.length > 0) {
                C49571gk0 gk02 = new C49571gk0();
                gk02.parseFrom(bVar.mo123703f());
                if (gk02.f134087e == i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[getExptBuffer] cmdId=");
                    sb.append(i);
                    sb.append(" found ");
                    LinkedList<C49434fk0> linkedList2 = gk02.f134086d;
                    C87412m.m108593f(linkedList2, "exptInfo.container");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                    for (C49434fk0 fk02 : linkedList2) {
                        arrayList.add(fk02.f133556e + " => " + fk02.f133555d);
                    }
                    sb.append(arrayList);
                    Log.m105924i("Finder.BaseRequestFactory", sb.toString());
                    return bVar;
                }
            }
        }
        return null;
    }

    /* renamed from: m */
    public final int mo71870m() {
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LIVE_VISITOR_ASSISTANT_INT_SYNC, 0);
        int j2 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LIVE_VISITOR_HARDCODE_ROLE_INT_SYNC, 0);
        if (j2 != 0) {
            Log.m105924i("Finder.BaseRequestFactory", "cgi, get svrHardCodeRole, " + j2);
            return j2;
        } else if (j != 1) {
            Log.m105924i("Finder.BaseRequestFactory", "cgi, get isAssistant, " + j);
            return ((C64916p1) C86312j.m106911c(C64916p1.class)).mo9100fY();
        } else {
            Log.m105924i("Finder.BaseRequestFactory", "cgi, get isAssistant, 1");
            return j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r2 > ((long) up1.C37521f.f99571y8.mo60266n().intValue())) goto L_0x0032;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo71871n() {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = f125334e
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0032
            java.lang.String r2 = f125332c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0032
            long r2 = f125334e
            long r2 = r0 - r2
            long r2 = java.lang.Math.abs(r2)
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            pe1.c<java.lang.Integer> r4 = up1.C37521f.f99571y8
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0047
        L_0x0032:
            f125334e = r0
            java.lang.Class<hy.z> r0 = p166hy.C60229z.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hy.z r0 = (p166hy.C60229z) r0
            java.lang.String r0 = r0.O10()
            java.lang.String r1 = "getService(IAdDeviceInfo…:class.java).sysUserAgent"
            gy3.C87412m.m108593f(r0, r1)
            f125332c = r0
        L_0x0047:
            java.lang.String r0 = f125332c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46523h2.mo71871n():java.lang.String");
    }
}
