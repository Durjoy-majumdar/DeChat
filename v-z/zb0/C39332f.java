package zb0;

import a70.C112760b;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import org.json.JSONObject;
import p1054vg.C90801g;
import p523fp.C32147e;

/* renamed from: zb0.f */
public class C39332f {

    /* renamed from: c */
    public static final String f105729c;

    /* renamed from: d */
    public static final String f105730d;

    /* renamed from: e */
    public static final String f105731e;

    /* renamed from: f */
    public static C39332f f105732f;

    /* renamed from: a */
    public String f105733a = "emoji_font_meta.json";

    /* renamed from: b */
    public boolean f105734b = false;

    static {
        String str = C112760b.m154231g() + "fonts/";
        f105729c = str + "temp/";
        f105730d = str + "WXkatonglemiao.ttf";
        f105731e = str + "WXxiari.ttf";
    }

    /* renamed from: b */
    public static C39332f m42087b() {
        synchronized (C39332f.class) {
            if (f105732f == null) {
                C39332f fVar = new C39332f();
                f105732f = fVar;
                fVar.mo62023c();
            }
        }
        return f105732f;
    }

    /* renamed from: a */
    public boolean mo62022a() {
        if (!C86013q1.m106450k(f105730d) || !C86013q1.m106450k(f105731e)) {
            this.f105734b = false;
        } else {
            Log.m105924i("MicroMsg.FontResLogic", "font file exist");
            this.f105734b = true;
        }
        return this.f105734b;
    }

    /* renamed from: c */
    public final void mo62023c() {
        Log.m105924i("MicroMsg.FontResLogic", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        if (mo62022a()) {
            C115669n.INSTANCE.mo175912v(933, 4);
            return;
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175912v(933, 5);
        String AD = ((C32147e) C86312j.m106911c(C32147e.class)).mo58507AD(57, 1);
        if (C86013q1.m106450k(AD)) {
            nVar.mo175912v(933, 6);
            Log.m105925i("MicroMsg.FontResLogic", "cache file exist %s", AD);
            mo62024d(AD, 57, 1, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0 A[Catch:{ all -> 0x00fe }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo62024d(java.lang.String r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "MicroMsg.FontResLogic"
            java.lang.String r1 = "unzipRes: %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x013a }
            r4 = 0
            r3[r4] = r9     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ all -> 0x013a }
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = f105729c     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ all -> 0x013a }
            int r9 = com.tencent.p014mm.vfs.C86013q1.m106436R(r9, r0)     // Catch:{ all -> 0x013a }
            java.lang.String r1 = "MicroMsg.FontResLogic"
            java.lang.String r3 = "unzip file ret: %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x013a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x013a }
            r5[r4] = r6     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r5)     // Catch:{ all -> 0x013a }
            if (r9 != 0) goto L_0x0138
            r5 = 933(0x3a5, double:4.61E-321)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0100 }
            r9.<init>()     // Catch:{ Exception -> 0x0100 }
            r9.append(r0)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r1 = r8.f105733a     // Catch:{ Exception -> 0x0100 }
            r9.append(r1)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0100 }
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)     // Catch:{ Exception -> 0x0100 }
            if (r9 == 0) goto L_0x00d2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0100 }
            r9.<init>()     // Catch:{ Exception -> 0x0100 }
            r9.append(r0)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r1 = r8.f105733a     // Catch:{ Exception -> 0x0100 }
            r9.append(r1)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0100 }
            java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106432N(r9)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r1 = "MicroMsg.FontResLogic"
            java.lang.String r3 = "meta json: %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0100 }
            r7[r4] = r9     // Catch:{ Exception -> 0x0100 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r7)     // Catch:{ Exception -> 0x0100 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0100 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r9 = "WXkatonglemiao.ttf"
            org.json.JSONObject r9 = r1.optJSONObject(r9)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r3 = "WXxiari.ttf"
            org.json.JSONObject r1 = r1.optJSONObject(r3)     // Catch:{ Exception -> 0x0100 }
            if (r9 == 0) goto L_0x00d2
            if (r1 == 0) goto L_0x00d2
            java.lang.String r3 = f105730d     // Catch:{ Exception -> 0x0100 }
            boolean r9 = r8.mo62025e(r9, r3)     // Catch:{ Exception -> 0x0100 }
            if (r9 != 0) goto L_0x009c
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0100 }
            r10 = 13
            r9.mo175912v(r5, r10)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r9 = "MicroMsg.FontResLogic"
            java.lang.String r10 = "unzip failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ all -> 0x013a }
            r8.f105734b = r4     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.vfs.C86013q1.m106446g(r0, r2)     // Catch:{ all -> 0x013a }
            monitor-exit(r8)
            return
        L_0x009c:
            java.lang.String r9 = f105731e     // Catch:{ Exception -> 0x0100 }
            boolean r9 = r8.mo62025e(r1, r9)     // Catch:{ Exception -> 0x0100 }
            if (r9 != 0) goto L_0x00ba
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0100 }
            r10 = 14
            r9.mo175912v(r5, r10)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r9 = "MicroMsg.FontResLogic"
            java.lang.String r10 = "unzip failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ all -> 0x013a }
            r8.f105734b = r4     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.vfs.C86013q1.m106446g(r0, r2)     // Catch:{ all -> 0x013a }
            monitor-exit(r8)
            return
        L_0x00ba:
            java.lang.String r9 = "MicroMsg.FontResLogic"
            java.lang.String r1 = "unzip res success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ Exception -> 0x0100 }
            boolean r9 = r8.mo62022a()     // Catch:{ Exception -> 0x0100 }
            if (r9 == 0) goto L_0x00d2
            java.lang.String r9 = "MicroMsg.FontResLogic"
            java.lang.String r1 = "unzipRes success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ Exception -> 0x0100 }
            r9 = 1
            goto L_0x00d3
        L_0x00d2:
            r9 = 0
        L_0x00d3:
            if (r9 != 0) goto L_0x00e0
            java.lang.String r9 = "MicroMsg.FontResLogic"
            java.lang.String r10 = "unzip failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ all -> 0x013a }
            r8.f105734b = r4     // Catch:{ all -> 0x013a }
            goto L_0x00fa
        L_0x00e0:
            java.lang.String r9 = "MicroMsg.FontResLogic"
            java.lang.String r1 = "unzip success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ all -> 0x013a }
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x013a }
            r3 = 16
            r9.mo175912v(r5, r3)     // Catch:{ all -> 0x013a }
            java.lang.Class<fp.e> r9 = p523fp.C32147e.class
            di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ all -> 0x013a }
            fp.e r9 = (p523fp.C32147e) r9     // Catch:{ all -> 0x013a }
            r9.Y40(r10, r11, r12)     // Catch:{ all -> 0x013a }
        L_0x00fa:
            com.tencent.p014mm.vfs.C86013q1.m106446g(r0, r2)     // Catch:{ all -> 0x013a }
            goto L_0x0138
        L_0x00fe:
            r9 = move-exception
            goto L_0x0128
        L_0x0100:
            r9 = move-exception
            java.lang.String r10 = "MicroMsg.FontResLogic"
            java.lang.String r11 = "unzipRes error: %s"
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ all -> 0x00fe }
            java.lang.String r0 = r9.getMessage()     // Catch:{ all -> 0x00fe }
            r12[r4] = r0     // Catch:{ all -> 0x00fe }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r9, r11, r12)     // Catch:{ all -> 0x00fe }
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00fe }
            r10 = 15
            r9.mo175912v(r5, r10)     // Catch:{ all -> 0x00fe }
            java.lang.String r9 = "MicroMsg.FontResLogic"
            java.lang.String r10 = "unzip failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ all -> 0x013a }
            r8.f105734b = r4     // Catch:{ all -> 0x013a }
            java.lang.String r9 = f105729c     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.vfs.C86013q1.m106446g(r9, r2)     // Catch:{ all -> 0x013a }
            goto L_0x0138
        L_0x0128:
            java.lang.String r10 = "MicroMsg.FontResLogic"
            java.lang.String r11 = "unzip failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ all -> 0x013a }
            r8.f105734b = r4     // Catch:{ all -> 0x013a }
            java.lang.String r10 = f105729c     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.vfs.C86013q1.m106446g(r10, r2)     // Catch:{ all -> 0x013a }
            throw r9     // Catch:{ all -> 0x013a }
        L_0x0138:
            monitor-exit(r8)
            return
        L_0x013a:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zb0.C39332f.mo62024d(java.lang.String, int, int, int):void");
    }

    /* renamed from: e */
    public final boolean mo62025e(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString("name");
        String optString2 = jSONObject.optString("md5");
        String str2 = f105729c + optString;
        String b = C90801g.m113874b(str2);
        if (Util.isNullOrNil(b) || !b.equalsIgnoreCase(optString2)) {
            Log.m105921e("MicroMsg.FontResLogic", "download %s not match! %s %s", optString, b, optString2);
            return false;
        }
        if (!str.equalsIgnoreCase(str2)) {
            C86013q1.m106463x(str2, str);
        }
        return true;
    }
}
