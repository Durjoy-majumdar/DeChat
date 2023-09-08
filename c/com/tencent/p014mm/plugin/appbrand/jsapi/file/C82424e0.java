package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import gy3.C8480h;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.e0 */
public final class C82424e0 extends C82016a0<C81879g> {
    private static final int CTRL_INDEX = 909;
    private static final String NAME = "loadWAFileSync";

    /* renamed from: g */
    public static final C82425a f241513g = new C82425a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.e0$a */
    public static final class C82425a {
        public C82425a(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
            cy3.C58003b.m67160a(r2, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
            throw r5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.plugin.appbrand.jsapi.C82870p.C82871a mo114809a(com.tencent.p014mm.plugin.appbrand.C81879g r4, java.lang.String r5, org.json.JSONObject r6) {
            /*
                r3 = this;
                java.lang.String r0 = "<this>"
                gy3.C87412m.m108594g(r4, r0)
                java.lang.String r0 = "TAG"
                gy3.C87412m.m108594g(r5, r0)
                r0 = 0
                if (r6 == 0) goto L_0x0014
                java.lang.String r1 = "filename"
                java.lang.String r6 = r6.optString(r1)
                goto L_0x0015
            L_0x0014:
                r6 = r0
            L_0x0015:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "invokeSync with filename:"
                r1.append(r2)
                r1.append(r6)
                java.lang.String r2 = ", appId:"
                r1.append(r2)
                java.lang.String r2 = r4.getAppId()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                r1 = 0
                if (r6 == 0) goto L_0x0041
                int r2 = r6.length()
                if (r2 != 0) goto L_0x003f
                goto L_0x0041
            L_0x003f:
                r2 = 0
                goto L_0x0042
            L_0x0041:
                r2 = 1
            L_0x0042:
                if (r2 == 0) goto L_0x004e
                com.tencent.mm.plugin.appbrand.jsapi.p$a r4 = new com.tencent.mm.plugin.appbrand.jsapi.p$a
                java.lang.Object[] r5 = new java.lang.Object[r1]
                java.lang.String r6 = "fail:invalid data"
                r4.<init>((java.lang.String) r6, (java.lang.Object[]) r5)
                return r4
            L_0x004e:
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r2 = r4.mo114272k()
                if (r2 != 0) goto L_0x0076
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "invokeSync get NULL reader, appId:"
                r6.append(r0)
                java.lang.String r4 = r4.getAppId()
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
                com.tencent.mm.plugin.appbrand.jsapi.p$a r4 = new com.tencent.mm.plugin.appbrand.jsapi.p$a
                java.lang.Object[] r5 = new java.lang.Object[r1]
                java.lang.String r6 = "fail:internal error"
                r4.<init>((java.lang.String) r6, (java.lang.Object[]) r5)
                return r4
            L_0x0076:
                java.io.InputStream r2 = r2.openRead(r6)
                if (r2 == 0) goto L_0x00be
                int r4 = r2.available()     // Catch:{ all -> 0x00b7 }
                java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)     // Catch:{ all -> 0x00b7 }
                boolean r5 = r2 instanceof p225rc.C89912a     // Catch:{ all -> 0x00b7 }
                if (r5 == 0) goto L_0x0091
                r5 = r2
                rc.a r5 = (p225rc.C89912a) r5     // Catch:{ all -> 0x00b7 }
                java.nio.ByteBuffer r5 = r5.f258369d     // Catch:{ all -> 0x00b7 }
                r4.put(r5)     // Catch:{ all -> 0x00b7 }
                goto L_0x009c
            L_0x0091:
                byte[] r5 = js0.C88016e.m109545b(r2)     // Catch:{ all -> 0x00b7 }
                java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)     // Catch:{ all -> 0x00b7 }
                r4.put(r5)     // Catch:{ all -> 0x00b7 }
            L_0x009c:
                java.lang.String r5 = "buffer"
                gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x00b7 }
                com.tencent.mm.plugin.appbrand.jsapi.p$a r5 = new com.tencent.mm.plugin.appbrand.jsapi.p$a     // Catch:{ all -> 0x00b7 }
                java.lang.String r6 = "ok"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b7 }
                r5.<init>((java.lang.String) r6, (java.lang.Object[]) r1)     // Catch:{ all -> 0x00b7 }
                java.lang.String r6 = "arrayBuffer"
                java.util.Map<java.lang.String, java.lang.Object> r1 = r5.f242316a     // Catch:{ all -> 0x00b7 }
                java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x00b7 }
                r1.put(r6, r4)     // Catch:{ all -> 0x00b7 }
                cy3.C58003b.m67160a(r2, r0)
                return r5
            L_0x00b7:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x00b9 }
            L_0x00b9:
                r5 = move-exception
                cy3.C58003b.m67160a(r2, r4)
                throw r5
            L_0x00be:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "invokeSync filename("
                r0.append(r2)
                r0.append(r6)
                java.lang.String r6 = ") not found, appId:"
                r0.append(r6)
                java.lang.String r4 = r4.getAppId()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
                com.tencent.mm.plugin.appbrand.jsapi.p$a r4 = new com.tencent.mm.plugin.appbrand.jsapi.p$a
                java.lang.Object[] r5 = new java.lang.Object[r1]
                java.lang.String r6 = "fail:file doesn't exist"
                r4.<init>((java.lang.String) r6, (java.lang.Object[]) r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.file.C82424e0.C82425a.mo114809a(com.tencent.mm.plugin.appbrand.g, java.lang.String, org.json.JSONObject):com.tencent.mm.plugin.appbrand.jsapi.p$a");
        }
    }

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C81879g gVar = (C81879g) fVar;
        C87412m.m108594g(gVar, "env");
        C82870p.C82871a a = f241513g.mo114809a(gVar, "Luggage.JsApiLoadWAFileSync", jSONObject);
        if (C87412m.m108589b(a.f242317b, "ok")) {
            String r = mo115117r(gVar, a.f242317b, a.f242316a);
            C87412m.m108593f(r, "{\n            makeReturn…sg, ret.values)\n        }");
            return r;
        }
        String m = mo115112m(a.f242317b, a.f242316a);
        C87412m.m108593f(m, "{\n            makeReturn…sg, ret.values)\n        }");
        return m;
    }
}
