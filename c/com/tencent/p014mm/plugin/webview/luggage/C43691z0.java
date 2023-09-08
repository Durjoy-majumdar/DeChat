package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.webview.luggage.z0 */
public class C43691z0 {

    /* renamed from: a */
    public static HashMap<String, Integer> f118067a = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.webview.luggage.z0$a */
    public static class C30592a implements C80883e<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            C43691z0.m47521a(((IPCString) obj).f10315d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m47521a(java.lang.String r5) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = f118067a
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x0075
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = f118067a
            java.lang.Object r5 = r0.remove(r5)
            r0 = -1
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsInt(r5, r0)
            int r0 = com.tencent.p014mm.plugin.webview.luggage.C43668p0.f118037a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            if (r5 == 0) goto L_0x0030
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, wa.t> r0 = p828wa.C53136v.f148255a
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto L_0x0024
            goto L_0x0032
        L_0x0024:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, wa.t> r0 = p828wa.C53136v.f148255a
            java.lang.Object r5 = r0.remove(r5)
            wa.t r5 = (p828wa.C53133t) r5
            r5.mo73822j()
            goto L_0x0033
        L_0x0030:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, wa.t> r5 = p828wa.C53136v.f148255a
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r5 == 0) goto L_0x0075
            int r0 = r5.hashCode()
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, d93.c> r1 = d93.C45302f.f122730a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.remove(r0)
            d93.c r0 = (d93.C45298c) r0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            java.lang.Thread r2 = r2.getThread()
            long r2 = r2.getId()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x006d
            r5.mo73818f()     // Catch:{ Exception -> 0x0061 }
            goto L_0x0075
        L_0x0061:
            r5 = move-exception
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "MicroMsg.LuggageWebCoreStash"
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r2, r0)
            goto L_0x0075
        L_0x006d:
            com.tencent.mm.plugin.webview.luggage.o0 r0 = new com.tencent.mm.plugin.webview.luggage.o0
            r0.<init>(r5)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.C43691z0.m47521a(java.lang.String):void");
    }

    /* renamed from: b */
    public static int m47522b(String str) {
        Log.m105925i("MicroMsg.LuggageWebViewFloatBallManager", "onMultiTaskItemClick, size = %d", Integer.valueOf(f118067a.size()));
        return Util.nullAs(f118067a.remove(str), -1);
    }
}
