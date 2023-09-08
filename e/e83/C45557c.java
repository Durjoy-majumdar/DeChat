package e83;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.HashMap;

/* renamed from: e83.c */
public class C45557c extends C45554a {

    /* renamed from: f */
    public int f123235f = 1;

    /* renamed from: g */
    public long f123236g;

    /* renamed from: h */
    public final HashMap<Integer, HashMap<String, String>> f123237h = new HashMap<>();

    public C45557c(String str, String str2, String str3, long j) {
        super(str, str2, str3, j);
        Log.m105925i("MicroMsg.WebSearch.WebSearchTemplate", "Init WebSearchTemplate templatePath:%s zipFileName:%s assetDir:%s", this.f123231a, this.f123232b, this.f123233c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        cy3.C58003b.m67160a(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        throw r8;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap<java.lang.String, java.lang.String> mo71071d() {
        /*
            r12 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.WebSearch.WebSearchTemplate"
            int r2 = r12.mo71078p0()
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, java.lang.String>> r3 = r12.f123237h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L_0x0022
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, java.lang.String>> r3 = r12.f123237h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r3.put(r4, r5)
        L_0x0022:
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, java.lang.String>> r3 = r12.f123237h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r3.get(r4)
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00d0
            r4 = 0
            com.tencent.mm.vfs.m1 r5 = r12.mo71063q()     // Catch:{ Exception -> 0x00ca }
            java.util.Properties r6 = new java.util.Properties     // Catch:{ Exception -> 0x00ca }
            r6.<init>()     // Catch:{ Exception -> 0x00ca }
            boolean r7 = r5.mo119978p()     // Catch:{ Exception -> 0x00ca }
            if (r7 == 0) goto L_0x0061
            java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106422D(r5)     // Catch:{ Exception -> 0x0059 }
            r7 = 0
            r6.load(r5)     // Catch:{ all -> 0x0052 }
            rx3.b0 r8 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0052 }
            cy3.C58003b.m67160a(r5, r7)     // Catch:{ Exception -> 0x0059 }
            goto L_0x0061
        L_0x0052:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r8 = move-exception
            cy3.C58003b.m67160a(r5, r7)     // Catch:{ Exception -> 0x0059 }
            throw r8     // Catch:{ Exception -> 0x0059 }
        L_0x0059:
            r5 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ca }
            java.lang.String r8 = "MicroMsg.WebSearch.BaseWebSearchTemplate"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r5, r0, r7)     // Catch:{ Exception -> 0x00ca }
        L_0x0061:
            java.lang.String r5 = "md5map"
            java.lang.String r5 = r6.getProperty(r5)     // Catch:{ Exception -> 0x00ca }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ca }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00ca }
            java.util.Iterator r5 = r6.keys()     // Catch:{ Exception -> 0x00ca }
        L_0x0070:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x00ca }
            if (r7 == 0) goto L_0x00c0
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00ca }
            if (r7 == 0) goto L_0x0070
            java.lang.String r8 = ".js"
            boolean r8 = r7.endsWith(r8)     // Catch:{ Exception -> 0x00ca }
            if (r8 == 0) goto L_0x0070
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ca }
            r8.<init>()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r9 = r12.mo71077o()     // Catch:{ Exception -> 0x00ca }
            r8.append(r9)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r9 = "/"
            r8.append(r9)     // Catch:{ Exception -> 0x00ca }
            r8.append(r7)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00ca }
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ Exception -> 0x00ca }
            if (r9 == 0) goto L_0x0070
            java.lang.String r7 = r6.optString(r7, r0)     // Catch:{ Exception -> 0x00ca }
            r3.put(r8, r7)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r9 = "getJsFileMap %s %s %s"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00ca }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00ca }
            r10[r4] = r11     // Catch:{ Exception -> 0x00ca }
            r11 = 1
            r10[r11] = r8     // Catch:{ Exception -> 0x00ca }
            r8 = 2
            r10[r8] = r7     // Catch:{ Exception -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r10)     // Catch:{ Exception -> 0x00ca }
            goto L_0x0070
        L_0x00c0:
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, java.lang.String>> r5 = r12.f123237h     // Catch:{ Exception -> 0x00ca }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00ca }
            r5.put(r2, r3)     // Catch:{ Exception -> 0x00ca }
            goto L_0x00d0
        L_0x00ca:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r4)
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.C45557c.mo71071d():java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        cy3.C58003b.m67160a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw r3;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71072g() {
        /*
            r5 = this;
            com.tencent.mm.vfs.m1 r0 = r5.mo71063q()
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            boolean r2 = r0.mo119978p()
            if (r2 == 0) goto L_0x002f
            java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106422D(r0)     // Catch:{ Exception -> 0x0024 }
            r2 = 0
            r1.load(r0)     // Catch:{ all -> 0x001d }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x001d }
            cy3.C58003b.m67160a(r0, r2)     // Catch:{ Exception -> 0x0024 }
            goto L_0x002f
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            cy3.C58003b.m67160a(r0, r2)     // Catch:{ Exception -> 0x0024 }
            throw r3     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.WebSearch.BaseWebSearchTemplate"
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)
        L_0x002f:
            r0 = 1
            java.lang.String r2 = "version"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r1 = r1.getProperty(r2, r3)     // Catch:{ Exception -> 0x0042 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0042 }
            r5.f123235f = r1     // Catch:{ Exception -> 0x0042 }
            goto L_0x0044
        L_0x0042:
            r5.f123235f = r0
        L_0x0044:
            long r0 = java.lang.System.currentTimeMillis()
            r5.f123236g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.C45557c.mo71072g():void");
    }

    /* renamed from: i */
    public String mo71073i() {
        return mo71077o() + "/" + "app.html";
    }

    /* renamed from: k */
    public String mo71074k() {
        if (TextUtils.isEmpty(this.f123233c)) {
            return "config.conf";
        }
        return this.f123233c + "/" + "config.conf";
    }

    /* renamed from: m */
    public String mo71075m() {
        return new C86009m1(mo71077o(), this.f123232b).mo119971i();
    }

    /* renamed from: n */
    public String mo71076n() {
        if (TextUtils.isEmpty(this.f123233c)) {
            return "config.conf";
        }
        return this.f123233c + "/" + this.f123232b;
    }

    /* renamed from: o */
    public String mo71077o() {
        C86009m1 m1Var = new C86009m1(mo71062p(), this.f123231a);
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        return m1Var.mo119971i();
    }

    /* renamed from: p0 */
    public int mo71078p0() {
        if (this.f123235f <= 1 || mo71063q().mo119979q() > this.f123236g) {
            mo71072g();
        }
        return this.f123235f;
    }
}
