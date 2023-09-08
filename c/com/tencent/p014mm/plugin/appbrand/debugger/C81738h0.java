package com.tencent.p014mm.plugin.appbrand.debugger;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.util.Random;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import te3.ew4;
import te3.lw4;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.h0 */
public class C81738h0 {

    /* renamed from: a */
    public static int f239874a;

    /* renamed from: b */
    public static String f239875b;

    /* renamed from: c */
    public static Boolean f239876c;

    /* renamed from: a */
    public static lw4 m100295a(int i, C47465a aVar) {
        C89349b bVar;
        lw4 lw4 = new lw4();
        lw4.f184163d = i;
        if (Util.isNullOrNil(f239875b)) {
            Random random = new Random(System.currentTimeMillis());
            f239875b = random.nextInt() + "-" + f239874a;
        }
        lw4.f184164e = f239875b + "-" + System.currentTimeMillis();
        try {
            bVar = C89349b.m111674a(aVar.toByteArray());
        } catch (IOException e) {
            Log.m105928w("MicroMsg.RemoteDebugUtil", e.getMessage());
            bVar = C89349b.m111674a(new byte[0]);
        }
        lw4.f184165f = bVar;
        return lw4;
    }

    /* renamed from: b */
    public static boolean m100296b(C81743t tVar, lw4 lw4, ew4 ew4, C68600m0 m0Var, C81695a0 a0Var) {
        if (lw4 == null) {
            Log.m105928w("MicroMsg.RemoteDebugUtil", "handleError dataFormat is null");
            return false;
        }
        int i = lw4.f184163d;
        if (ew4 == null) {
            Log.m105929w("MicroMsg.RemoteDebugUtil", "handleError cmd id: %d resp is null", Integer.valueOf(i));
            return false;
        }
        if (i == 1006) {
            if (-50011 == ew4.f133149d) {
                synchronized (tVar) {
                    tVar.f239892n = true;
                }
            } else {
                boolean c = tVar.mo114111c();
                synchronized (tVar) {
                    tVar.f239892n = false;
                }
                if (c) {
                    a0Var.mo114055k();
                }
            }
        }
        if (ew4.f133149d == 0) {
            return true;
        }
        Log.m105925i("MicroMsg.RemoteDebugUtil", "handleError cmd id: %d, uuid: %s, errorCode: %d, errMsg: %s", Integer.valueOf(i), lw4.f184164e, Integer.valueOf(ew4.f133149d), ew4.f133150e);
        m0Var.getClass();
        MMHandlerThread.postToMainThread(new C68607q0(m0Var, i, ew4));
        return false;
    }

    /* renamed from: c */
    public static boolean m100297c() {
        Boolean bool = f239876c;
        if (bool != null) {
            return bool.booleanValue();
        }
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("app_brand_global_sp", 0);
        if (sharedPreferences == null) {
            Log.m105928w("MicroMsg.RemoteDebugUtil", "isHardCodeOpenGamePreload, sp is null.");
            return true;
        }
        boolean z = sharedPreferences.getBoolean("hard_code_open_game_preload", true);
        f239876c = Boolean.valueOf(z);
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.appbrand.debugger.C81750x m100298d(pe3.C47465a r8, com.tencent.p014mm.plugin.appbrand.debugger.C81743t r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "MicroMsg.RemoteDebugUtil"
            te3.mw4 r1 = new te3.mw4
            r1.<init>()
            r2 = 1
            r3 = 0
            byte[] r8 = r8.toByteArray()     // Catch:{ IOException -> 0x004b }
            int r4 = r8.length     // Catch:{ IOException -> 0x004b }
            r5 = 256(0x100, float:3.59E-43)
            if (r4 <= r5) goto L_0x0044
            if (r9 == 0) goto L_0x0044
            com.tencent.mm.plugin.appbrand.debugger.u r4 = r9.f239885g     // Catch:{ IOException -> 0x004b }
            int r4 = r4.f239908f     // Catch:{ IOException -> 0x004b }
            r4 = r4 & r2
            if (r4 == 0) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            if (r4 == 0) goto L_0x0044
            byte[] r4 = p823sg.C90197s.m112889a(r8)     // Catch:{ IOException -> 0x004b }
            pe3.b r5 = pe3.C89349b.m111674a(r4)     // Catch:{ IOException -> 0x004b }
            r1.f138255g = r5     // Catch:{ IOException -> 0x004b }
            r1.f138256h = r2     // Catch:{ IOException -> 0x004b }
            java.lang.String r5 = "use zlib %d/%d"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x004b }
            int r8 = r8.length     // Catch:{ IOException -> 0x004b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x004b }
            r6[r3] = r8     // Catch:{ IOException -> 0x004b }
            int r8 = r4.length     // Catch:{ IOException -> 0x004b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x004b }
            r6[r2] = r8     // Catch:{ IOException -> 0x004b }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r5, r6)     // Catch:{ IOException -> 0x004b }
            goto L_0x0056
        L_0x0044:
            pe3.b r8 = pe3.C89349b.m111674a(r8)     // Catch:{ IOException -> 0x004b }
            r1.f138255g = r8     // Catch:{ IOException -> 0x004b }
            goto L_0x0056
        L_0x004b:
            r8 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r8
            java.lang.String r8 = "parseDebugMessageToSend %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r4)
        L_0x0056:
            if (r9 != 0) goto L_0x0060
            android.os.Debug.waitForDebugger()
            java.lang.String r8 = "env = null "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
        L_0x0060:
            java.util.concurrent.atomic.AtomicInteger r8 = r9.f239886h
            int r8 = r8.incrementAndGet()
            r1.f138252d = r8
            long r4 = r9.f239888j
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0073
            r1.f138253e = r3
            goto L_0x007d
        L_0x0073:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r9.f239888j
            long r4 = r4 - r6
            int r8 = (int) r4
            r1.f138253e = r8
        L_0x007d:
            long r4 = java.lang.System.currentTimeMillis()
            r9.f239888j = r4
            r1.f138254f = r10
            java.lang.Object[] r8 = new java.lang.Object[r2]
            int r9 = r1.f138252d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            java.lang.String r9 = "parseDebugMessageToSend seq %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r9, r8)
            com.tencent.mm.plugin.appbrand.debugger.x r8 = new com.tencent.mm.plugin.appbrand.debugger.x
            r8.<init>()
            long r9 = java.lang.System.currentTimeMillis()
            r8.f239923a = r9
            pe3.b r9 = r1.f138255g
            byte[] r9 = r9.f257327a
            int r9 = r9.length
            r8.f239925c = r9
            r8.f239924b = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.debugger.C81738h0.m100298d(pe3.a, com.tencent.mm.plugin.appbrand.debugger.t, java.lang.String):com.tencent.mm.plugin.appbrand.debugger.x");
    }

    /* renamed from: e */
    public static C81744u m100299e(String str) {
        Log.m105925i("MicroMsg.RemoteDebugUtil", "parseRemoteDebugInfo extInfo=%s", str);
        C81744u uVar = new C81744u();
        if (!Util.isNullOrNil(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optBoolean("open_remote", false);
                uVar.f239903a = jSONObject.optString("room_id");
                uVar.f239904b = jSONObject.optString("wxpkg_info");
                jSONObject.optString("qrcode_id");
                uVar.f239905c = jSONObject.optInt("remote_network_type", 1);
                uVar.f239907e = jSONObject.optBoolean("disable_url_check", true);
                uVar.f239906d = jSONObject.optInt("remote_proxy_port", 9976);
                uVar.f239908f = jSONObject.optInt("remote_support_compress_algo");
                try {
                    int optInt = new JSONObject(jSONObject.optString("debug_launch_info")).optInt("debug_type", -1);
                    Log.m105925i("MicroMsg.RemoteDebugUtil", "debug_type:%d", Integer.valueOf(optInt));
                    if (optInt != -1) {
                        uVar.f239909g = optInt;
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.RemoteDebugUtil", "parse debug_launch_info %s", e);
                }
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.RemoteDebugUtil", "parseRemoteDebugInfo %s", e2);
            }
        }
        return uVar;
    }

    /* renamed from: f */
    public static void m100300f(boolean z) {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("app_brand_global_sp", 0);
        if (sharedPreferences == null) {
            Log.m105928w("MicroMsg.RemoteDebugUtil", "setHardCodeOpenGamePreload, sp is null.");
        } else {
            sharedPreferences.edit().putBoolean("hard_code_open_game_preload", z).commit();
        }
    }
}
