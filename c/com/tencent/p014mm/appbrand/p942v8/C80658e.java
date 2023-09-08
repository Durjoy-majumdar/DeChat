package com.tencent.p014mm.appbrand.p942v8;

import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.ILoadLibraryDelegate;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.appbrand.v8.e */
public final class C80658e {

    /* renamed from: a */
    public static boolean f236022a = false;

    /* renamed from: com.tencent.mm.appbrand.v8.e$a */
    public class C80659a implements ILoadLibraryDelegate {
        public void loadLibrary(String str) {
            try {
                Util.nowMilliSecond();
                C80658e.m98344a();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JSRuntimeCreator", e, "", new Object[0]);
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
                    throw e;
                }
            }
            Log.m105924i("MicroMsg.JSRuntimeCreator", "load so done");
        }
    }

    static {
        C80135V8.setLoadLibraryDelegate(new C80659a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        p774zg.C39348q0.m42097c(6, p774zg.C91737o0.f262771a, -1, (java.lang.String) null, -1, -1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.JSRuntimeCreator", r1, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.JSRuntimeCreator", "loadJSRuntimeSo done");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        f236022a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m98344a() {
        /*
            java.lang.Class<com.tencent.mm.appbrand.v8.e> r0 = com.tencent.p014mm.appbrand.p942v8.C80658e.class
            monitor-enter(r0)
            boolean r1 = f236022a     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = "MicroMsg.JSRuntimeCreator"
            java.lang.String r2 = "loadJSRuntimeSo already"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            long r3 = p774zg.C91737o0.f262771a     // Catch:{ Exception -> 0x001d }
            r2 = 6
            r5 = -1
            r6 = 0
            r7 = -1
            r8 = -1
            r9 = -1
            p774zg.C39348q0.m42097c(r2, r3, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x001d }
            goto L_0x0030
        L_0x001d:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.JSRuntimeCreator"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r4)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 != 0) goto L_0x0040
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r2 != 0) goto L_0x0040
        L_0x0030:
            java.lang.String r1 = "MicroMsg.JSRuntimeCreator"
            java.lang.String r2 = "loadJSRuntimeSo done"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            monitor-enter(r0)
            r1 = 1
            f236022a = r1     // Catch:{ all -> 0x003d }
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return
        L_0x003d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r1
        L_0x0040:
            throw r1
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.appbrand.p942v8.C80658e.m98344a():void");
    }

    /* renamed from: b */
    public static String m98345b() {
        return C80135V8.isLoaded() ? C80135V8.getV8Version() : "";
    }
}
