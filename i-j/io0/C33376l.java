package io0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: io0.l */
public class C33376l {

    /* renamed from: c */
    public static final C33377a f90443c = new C33377a((C8480h) null);

    /* renamed from: a */
    public final String f90444a;

    /* renamed from: b */
    public final long f90445b;

    /* renamed from: io0.l$a */
    public static final class C33377a {
        public C33377a(C8480h hVar) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: io0.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: io0.k} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: io0.k} */
        /* JADX WARNING: type inference failed for: r11v4 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final io0.C33376l mo59115a(org.json.JSONObject r11) {
            /*
                r10 = this;
                java.lang.String r0 = "json"
                gy3.C87412m.m108594g(r11, r0)
                java.lang.String r0 = "subMetas"
                boolean r1 = r11.has(r0)
                r2 = 0
                java.lang.String r3 = "MicroMsg.AppBrand.AppBrandResCacheChecker"
                java.lang.String r4 = "lastModified"
                java.lang.String r5 = "name"
                if (r1 == 0) goto L_0x009f
                org.json.JSONArray r0 = r11.getJSONArray(r0)     // Catch:{ Exception -> 0x0089 }
                r1 = 0
                int r6 = r0.length()     // Catch:{ Exception -> 0x0089 }
                my3.j r1 = my3.C61595o.m72301i(r1, r6)     // Catch:{ Exception -> 0x0089 }
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0089 }
                r7 = 10
                int r8 = sx3.C36907w.m41090l(r1, r7)     // Catch:{ Exception -> 0x0089 }
                r6.<init>(r8)     // Catch:{ Exception -> 0x0089 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0089 }
            L_0x0031:
                r8 = r1
                my3.i r8 = (my3.C34690i) r8     // Catch:{ Exception -> 0x0089 }
                boolean r8 = r8.hasNext()     // Catch:{ Exception -> 0x0089 }
                if (r8 == 0) goto L_0x0049
                r8 = r1
                sx3.l0 r8 = (sx3.C36904l0) r8     // Catch:{ Exception -> 0x0089 }
                int r8 = r8.mo59695a()     // Catch:{ Exception -> 0x0089 }
                org.json.JSONObject r8 = r0.getJSONObject(r8)     // Catch:{ Exception -> 0x0089 }
                r6.add(r8)     // Catch:{ Exception -> 0x0089 }
                goto L_0x0031
            L_0x0049:
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x0089 }
                int r0 = sx3.C36907w.m41090l(r6, r7)     // Catch:{ Exception -> 0x0089 }
                r8.<init>(r0)     // Catch:{ Exception -> 0x0089 }
                java.util.Iterator r0 = r6.iterator()     // Catch:{ Exception -> 0x0089 }
            L_0x0056:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0089 }
                if (r1 == 0) goto L_0x0074
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0089 }
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ Exception -> 0x0089 }
                io0.l$a r6 = io0.C33376l.f90443c     // Catch:{ Exception -> 0x0089 }
                java.lang.String r7 = "it"
                gy3.C87412m.m108593f(r1, r7)     // Catch:{ Exception -> 0x0089 }
                io0.l r1 = r6.mo59115a(r1)     // Catch:{ Exception -> 0x0089 }
                gy3.C87412m.m108591d(r1)     // Catch:{ Exception -> 0x0089 }
                r8.add(r1)     // Catch:{ Exception -> 0x0089 }
                goto L_0x0056
            L_0x0074:
                java.lang.String r0 = r11.getString(r5)     // Catch:{ Exception -> 0x0089 }
                long r6 = r11.getLong(r4)     // Catch:{ Exception -> 0x0089 }
                io0.k r11 = new io0.k     // Catch:{ Exception -> 0x0089 }
                gy3.C87412m.m108593f(r0, r5)     // Catch:{ Exception -> 0x0089 }
                r9 = 0
                r4 = r11
                r5 = r0
                r4.<init>(r5, r6, r8, r9)     // Catch:{ Exception -> 0x0089 }
            L_0x0087:
                r2 = r11
                goto L_0x00c5
            L_0x0089:
                r11 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DirMetaData#fromJsonFile, fail since "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r11)
                goto L_0x00c5
            L_0x009f:
                java.lang.String r0 = r11.getString(r5)     // Catch:{ Exception -> 0x00b0 }
                long r6 = r11.getLong(r4)     // Catch:{ Exception -> 0x00b0 }
                io0.l r11 = new io0.l     // Catch:{ Exception -> 0x00b0 }
                gy3.C87412m.m108593f(r0, r5)     // Catch:{ Exception -> 0x00b0 }
                r11.<init>(r0, r6)     // Catch:{ Exception -> 0x00b0 }
                goto L_0x0087
            L_0x00b0:
                r11 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FileMetaData#fromJsonFile, fail since "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r11)
            L_0x00c5:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: io0.C33376l.C33377a.mo59115a(org.json.JSONObject):io0.l");
        }
    }

    public C33376l(String str, long j) {
        C87412m.m108594g(str, "name");
        this.f90444a = str;
        this.f90445b = j;
    }

    /* renamed from: a */
    public JSONObject mo59113a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", this.f90444a);
            jSONObject.put("lastModified", this.f90445b);
            return jSONObject;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandResCacheChecker", "FileMetaData#toJson, fail since " + e);
            return null;
        }
    }
}
