package com.tencent.p014mm.plugin.sport.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import sv2.C118311f;
import te3.sz4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sport.model.k */
public class C115769k {

    /* renamed from: a */
    public static long f347336a;

    /* renamed from: b */
    public static C11385n f347337b = new C115770a();

    /* renamed from: c */
    public static JSONObject f347338c;

    /* renamed from: d */
    public static C115773c f347339d;

    /* renamed from: com.tencent.mm.plugin.sport.model.k$a */
    public class C115770a implements C11385n {

        /* renamed from: com.tencent.mm.plugin.sport.model.k$a$a */
        public class C115771a implements Runnable {
            public C115771a(C115770a aVar) {
            }

            public void run() {
                C115773c cVar = C115769k.f347339d;
                if (cVar != null) {
                    C118311f.C118312a aVar = (C118311f.C118312a) cVar;
                    if (C86709a0.m107522a()) {
                        C118311f.this.vx0().mo176115b();
                    }
                }
            }
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C115766e) {
                C86709a0.m107524d().mo123470p(1947, C115769k.f347337b);
                if (i == 0 && i2 == 0) {
                    sz4 sz4 = ((C115766e) yVar).f347330f;
                    int i3 = 1;
                    Log.m105925i("MicroMsg.Sport.SportConfigLogic", "onSceneEnd config=%s", sz4.f141854d);
                    String str2 = sz4.f141854d;
                    if (!Util.isNullOrNil(str2)) {
                        try {
                            C115769k.f347338c = new JSONObject(str2);
                        } catch (Exception unused) {
                            C115769k.f347338c = null;
                        }
                    }
                    try {
                        JSONObject c = C115769k.m162824c();
                        if (!C115778q.m162836e()) {
                            i3 = 0;
                        }
                        c.put("checkWeSportInstall", i3);
                    } catch (Exception unused2) {
                    }
                    String jSONObject = C115769k.m162824c().toString();
                    C115775n.f347342a.mo176132e("KEY_LAST_REQUEST_CONFIG_STRING", jSONObject);
                    ((C118311f) C86312j.m106911c(C118311f.class)).vx0().mo176116c(jSONObject);
                    ((C119157j) C119157j.f356862d).mo183875f(new C115771a(this));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sport.model.k$b */
    public class C115772b implements Runnable {
        public void run() {
            C115773c cVar = C115769k.f347339d;
            if (cVar != null) {
                C118311f.C118312a aVar = (C118311f.C118312a) cVar;
                if (C86709a0.m107522a()) {
                    C118311f.this.vx0().mo176115b();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sport.model.k$c */
    public interface C115773c {
    }

    /* renamed from: a */
    public static void m162822a(JSONObject jSONObject) {
        try {
            if (MMApplicationContext.isMainProcess()) {
                int i = 1;
                if (jSONObject.optInt("checkWeSportInstall", 0) != (C115778q.m162836e() ? 1 : 0)) {
                    if (!C115778q.m162836e()) {
                        i = 0;
                    }
                    jSONObject.put("checkWeSportInstall", i);
                    C115775n.f347342a.mo176132e("KEY_LAST_REQUEST_CONFIG_STRING", jSONObject.toString());
                    C117407d.INSTANCE.idkeyStat(323, 5, 1, false);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m162823b(boolean z) {
        JSONObject c = m162824c();
        try {
            c.put("checkWeSportInstall", z ? 1 : 0);
        } catch (JSONException unused) {
        }
        String jSONObject = c.toString();
        C115775n.f347342a.mo176132e("KEY_LAST_REQUEST_CONFIG_STRING", jSONObject);
        ((C118311f) C86312j.m106911c(C118311f.class)).vx0().mo176116c(jSONObject);
        ((C119157j) C119157j.f356862d).mo183875f(new C115772b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (r2 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r2 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0078  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m162824c() {
        /*
            org.json.JSONObject r0 = f347338c
            if (r0 != 0) goto L_0x0094
            com.tencent.mm.plugin.sport.model.n r0 = com.tencent.p014mm.plugin.sport.model.C115775n.f347342a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo176130c()
            java.lang.String r1 = "KEY_LAST_REQUEST_CONFIG_STRING"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.decodeString(r1, r2)
            java.lang.String r1 = "stepMMKV.decodeString(key, defaultString)"
            gy3.C87412m.m108593f(r0, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x002b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x002a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x002a }
            f347338c = r1     // Catch:{ Exception -> 0x002a }
            m162822a(r1)     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = "server config"
            goto L_0x002b
        L_0x002a:
        L_0x002b:
            org.json.JSONObject r0 = f347338c
            r1 = 0
            java.lang.String r3 = "MicroMsg.Sport.SportConfigLogic"
            if (r0 != 0) goto L_0x0074
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.AssetManager r0 = r0.getAssets()
            r2 = 0
            java.lang.String r4 = "sport_config.json"
            java.io.InputStream r2 = r0.open(r4)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0054 }
            byte[] r4 = p823sg.C48377f.m53723b(r2)     // Catch:{ Exception -> 0x0054 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0054 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0054 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0054 }
            if (r2 == 0) goto L_0x0066
            goto L_0x0063
        L_0x0052:
            r0 = move-exception
            goto L_0x006e
        L_0x0054:
            r0 = move-exception
            java.lang.String r4 = "get assets sport config json"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0052 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r5)     // Catch:{ all -> 0x0052 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0052 }
            r4.<init>()     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0066
        L_0x0063:
            r2.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            f347338c = r4
            m162822a(r4)
            java.lang.String r2 = "asset"
            goto L_0x0074
        L_0x006e:
            if (r2 == 0) goto L_0x0073
            r2.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            throw r0
        L_0x0074:
            org.json.JSONObject r0 = f347338c
            if (r0 != 0) goto L_0x0081
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            f347338c = r0
            java.lang.String r2 = "new"
        L_0x0081:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r2
            r1 = 1
            org.json.JSONObject r2 = f347338c
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
            java.lang.String r1 = "get sport config from %s: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
        L_0x0094:
            org.json.JSONObject r0 = f347338c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sport.model.C115769k.m162824c():org.json.JSONObject");
    }

    /* renamed from: d */
    public static boolean m162825d() {
        if (f347336a == 0) {
            f347336a = C115775n.f347342a.mo176128a("KEY_LAST_REQUEST_CONFIG_TIME_LONG", 0);
        }
        long c = C31543z5.m39453c();
        long j = f347336a;
        if (c - j > 86400000) {
            f347336a = C31543z5.m39453c();
            C115775n.f347342a.mo176131d("KEY_LAST_REQUEST_CONFIG_TIME_LONG", f347336a);
            Log.m105924i("MicroMsg.Sport.SportConfigLogic", "start to request sport config");
            C86709a0.m107524d().mo123455a(1947, f347337b);
            C86709a0.m107524d().mo123460f(new C115766e());
            return true;
        }
        Log.m105925i("MicroMsg.Sport.SportConfigLogic", "last request time is %s", C115778q.m162837f(j));
        return false;
    }
}
