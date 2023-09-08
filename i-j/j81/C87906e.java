package j81;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import h81.C32735h;
import oa1.C117731d;

/* renamed from: j81.e */
public class C87906e {

    /* renamed from: a */
    public static Boolean f254439a;

    /* renamed from: b */
    public static Boolean f254440b;

    /* renamed from: a */
    public static void m109407a(String str, String str2) {
        if (m109415i()) {
            Log.m105924i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m109408b(String str, String str2, Object... objArr) {
        if (m109415i()) {
            Log.m105925i(str, str2, objArr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r7 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r7 != null) goto L_0x0049;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[Catch:{ MalformedURLException -> 0x006c, IOException -> 0x004f, all -> 0x004d, all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m109409c(java.lang.String r7) {
        /*
            java.lang.String r0 = "[EdgeComputingUtils] downloadAsString throw Exception : "
            java.lang.String r1 = "EdgeComputingUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006c, IOException -> 0x004f, all -> 0x004d }
            r4.<init>(r7)     // Catch:{ MalformedURLException -> 0x006c, IOException -> 0x004f, all -> 0x004d }
            java.net.URLConnection r7 = r4.openConnection()     // Catch:{ MalformedURLException -> 0x006c, IOException -> 0x004f, all -> 0x004d }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ MalformedURLException -> 0x006c, IOException -> 0x004f, all -> 0x004d }
            if (r7 == 0) goto L_0x0047
            r7.connect()     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
            int r3 = r7.getResponseCode()     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x0047
            java.io.InputStream r3 = r7.getInputStream()     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
            if (r3 == 0) goto L_0x0047
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
            r5.<init>(r3)     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
            r4.<init>(r5)     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
        L_0x0032:
            java.lang.String r5 = r4.readLine()     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
            if (r5 == 0) goto L_0x003c
            r2.append(r5)     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
            goto L_0x0032
        L_0x003c:
            r4.close()     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
            r3.close()     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r3 = move-exception
            goto L_0x0053
        L_0x0045:
            r3 = move-exception
            goto L_0x0070
        L_0x0047:
            if (r7 == 0) goto L_0x0089
        L_0x0049:
            r7.disconnect()
            goto L_0x0089
        L_0x004d:
            r0 = move-exception
            goto L_0x0090
        L_0x004f:
            r7 = move-exception
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0053:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r4.<init>()     // Catch:{ all -> 0x008e }
            r4.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x008e }
            r4.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x008e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ all -> 0x008e }
            if (r7 == 0) goto L_0x0089
            goto L_0x0049
        L_0x006c:
            r7 = move-exception
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0070:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r4.<init>()     // Catch:{ all -> 0x008e }
            r4.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x008e }
            r4.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x008e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ all -> 0x008e }
            if (r7 == 0) goto L_0x0089
            goto L_0x0049
        L_0x0089:
            java.lang.String r7 = r2.toString()
            return r7
        L_0x008e:
            r0 = move-exception
            r3 = r7
        L_0x0090:
            if (r3 == 0) goto L_0x0095
            r3.disconnect()
        L_0x0095:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j81.C87906e.m109409c(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public static MultiProcessMMKV m109410d() {
        return MultiProcessMMKV.getMMKV("mmkv_name_edge_computing_breaker_" + C117731d.m166007c().mo182446h());
    }

    /* renamed from: e */
    public static MultiProcessMMKV m109411e() {
        return MultiProcessMMKV.getMMKV("mmkv_name_edge_computing_config_" + C117731d.m166007c().mo182446h());
    }

    /* renamed from: f */
    public static MultiProcessMMKV m109412f() {
        return MultiProcessMMKV.getMMKV("mmkv_name_edge_computing_default_" + C117731d.m166007c().mo182446h());
    }

    /* renamed from: g */
    public static MultiProcessMMKV m109413g() {
        return MultiProcessMMKV.getMMKV("mmkv_name_edge_computing_realtime_report_" + C117731d.m166007c().mo182446h());
    }

    /* renamed from: h */
    public static MultiProcessMMKV m109414h() {
        return MultiProcessMMKV.getMMKV("mmkv_name_edge_computing_run_record_" + C117731d.m166007c().mo182446h());
    }

    /* renamed from: i */
    public static boolean m109415i() {
        boolean z = false;
        if (f254440b == null) {
            f254440b = Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_edge_computing_debug_mode, false));
            Log.m105924i("EdgeComputingUtils", "[EdgeComputingUtils] isDebugMode : " + f254440b);
        }
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) {
            z = true;
        }
        if (z) {
            f254440b = Boolean.TRUE;
        }
        return f254440b.booleanValue();
    }

    /* renamed from: j */
    public static boolean m109416j() {
        if (f254439a == null) {
            f254439a = Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_edge_computing_cloud_switch, true));
            Log.m105924i("EdgeComputingUtils", "[EdgeComputingUtils] isOpenEdgeComputing cloudSwitch : " + f254439a);
        }
        return f254439a.booleanValue();
    }
}
