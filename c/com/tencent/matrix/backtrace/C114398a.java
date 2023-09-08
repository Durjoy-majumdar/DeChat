package com.tencent.matrix.backtrace;

import android.os.CancellationSignal;
import com.tencent.matrix.backtrace.C114410f;
import com.tencent.p014mm.plugin.performance.diagnostic.C115656c;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import java.io.File;
import java.io.FileFilter;
import p1069zd.C119094b;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.backtrace.a */
public class C114398a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f342937d;

    /* renamed from: e */
    public final /* synthetic */ C114405e f342938e;

    /* renamed from: com.tencent.matrix.backtrace.a$a */
    public class C114399a implements FileFilter {

        /* renamed from: a */
        public final /* synthetic */ C119094b f342939a;

        public C114399a(C119094b bVar) {
            this.f342939a = bVar;
        }

        public boolean accept(File file) {
            String absolutePath = file.getAbsolutePath();
            if (file.exists() && !C114405e.m160937b(C114398a.this.f342938e, absolutePath, 0) && (absolutePath.endsWith(".so") || absolutePath.endsWith(ShareConstants.ODEX_SUFFIX) || absolutePath.endsWith(".oat") || absolutePath.endsWith(ShareConstants.DEX_SUFFIX))) {
                C118672d.m167353c("Matrix.WarmUpDelegate", "Warming up so %s", absolutePath);
                if (!this.f342939a.mo173577a(absolutePath, 0)) {
                    C114398a.this.f342938e.getClass();
                    C114410f fVar = C114405e.f342949h;
                    if (fVar != null) {
                        ((C115656c) fVar).mo175880a(C114410f.C114411a.WarmUpFailed, absolutePath, 0);
                    }
                }
            }
            return false;
        }
    }

    public C114398a(C114405e eVar, CancellationSignal cancellationSignal) {
        this.f342938e = eVar;
        this.f342937d = cancellationSignal;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (r5 == null) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            com.tencent.matrix.backtrace.h$b r0 = com.tencent.matrix.backtrace.C114413h.C114415b.WarmUp
            java.lang.String r1 = ""
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "Matrix.WarmUpDelegate"
            java.lang.String r5 = "Going to warm up."
            p723vf.C118672d.m167353c(r4, r5, r3)
            r3 = 1
            r5 = 0
            java.io.File r6 = new java.io.File     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            com.tencent.matrix.backtrace.e r7 = r10.f342938e     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            com.tencent.matrix.backtrace.k$a r7 = r7.f342955f     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            r7.getClass()     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            java.lang.String r7 = com.tencent.matrix.backtrace.C114417j.m160947b(r7)     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            r6.<init>(r7)     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            boolean r6 = r6.isDirectory()     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            if (r6 != 0) goto L_0x0035
            java.lang.String r6 = "Saving path is not a directory."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            p723vf.C118672d.m167356f(r4, r6, r7)     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            com.tencent.matrix.backtrace.e r6 = r10.f342938e     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            com.tencent.matrix.backtrace.h r6 = r6.f342954e     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            r6.mo173584a(r0)     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            return
        L_0x0035:
            com.tencent.matrix.backtrace.e r6 = r10.f342938e     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            zd.b r5 = com.tencent.matrix.backtrace.C114405e.m160936a(r6)     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            if (r5 != 0) goto L_0x004c
            java.lang.String r6 = "Failed to acquire warm-up invoker"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            p723vf.C118672d.m167356f(r4, r6, r7)     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            if (r5 == 0) goto L_0x004b
            com.tencent.matrix.backtrace.e r0 = r10.f342938e
            com.tencent.matrix.backtrace.C114405e.m160938c(r0, r5)
        L_0x004b:
            return
        L_0x004c:
            com.tencent.matrix.backtrace.e r6 = r10.f342938e     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            com.tencent.matrix.backtrace.k$a r6 = r6.f342955f     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            java.util.HashSet<java.lang.String> r6 = r6.f343005b     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
        L_0x0056:
            boolean r7 = r6.hasNext()     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            if (r7 == 0) goto L_0x007c
            java.lang.Object r7 = r6.next()     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            java.io.File r8 = new java.io.File     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            r8.<init>(r7)     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            android.os.CancellationSignal r7 = r10.f342937d     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            com.tencent.matrix.backtrace.a$a r9 = new com.tencent.matrix.backtrace.a$a     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            r9.<init>(r5)     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            com.tencent.matrix.backtrace.C114417j.m160950e(r8, r7, r9)     // Catch:{ OperationCanceledException -> 0x0072, all -> 0x0074 }
            goto L_0x0056
        L_0x0072:
            goto L_0x008c
        L_0x0074:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0083 }
            p723vf.C118672d.m167354d(r4, r6, r1, r7)     // Catch:{ all -> 0x0083 }
            if (r5 == 0) goto L_0x0081
        L_0x007c:
            com.tencent.matrix.backtrace.e r6 = r10.f342938e
            com.tencent.matrix.backtrace.C114405e.m160938c(r6, r5)
        L_0x0081:
            r5 = 0
            goto L_0x0094
        L_0x0083:
            r0 = move-exception
            if (r5 == 0) goto L_0x008b
            com.tencent.matrix.backtrace.e r1 = r10.f342938e
            com.tencent.matrix.backtrace.C114405e.m160938c(r1, r5)
        L_0x008b:
            throw r0
        L_0x008c:
            if (r5 == 0) goto L_0x0093
            com.tencent.matrix.backtrace.e r6 = r10.f342938e
            com.tencent.matrix.backtrace.C114405e.m160938c(r6, r5)
        L_0x0093:
            r5 = 1
        L_0x0094:
            if (r5 != 0) goto L_0x0110
            com.tencent.matrix.backtrace.e r5 = r10.f342938e
            com.tencent.matrix.backtrace.h r5 = r5.f342954e
            r5.mo173584a(r0)
            com.tencent.matrix.backtrace.e r0 = r10.f342938e
            com.tencent.matrix.backtrace.k$a r5 = r0.f342955f
            android.content.Context r5 = r5.f343004a
            java.io.File r6 = com.tencent.matrix.backtrace.C114417j.m160957l(r5)     // Catch:{ IOException -> 0x00b4 }
            r6.createNewFile()     // Catch:{ IOException -> 0x00b4 }
            android.content.pm.ApplicationInfo r7 = r5.getApplicationInfo()     // Catch:{ IOException -> 0x00b4 }
            java.lang.String r7 = r7.nativeLibraryDir     // Catch:{ IOException -> 0x00b4 }
            com.tencent.matrix.backtrace.C114417j.m160958m(r6, r7)     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00ba
        L_0x00b4:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r2]
            p723vf.C118672d.m167354d(r4, r6, r1, r7)
        L_0x00ba:
            com.tencent.matrix.backtrace.WeChatBacktraceNative.setWarmedUp(r3)
            com.tencent.matrix.backtrace.k$a r0 = r0.f342955f
            com.tencent.matrix.backtrace.k$b r0 = r0.f343006c
            com.tencent.matrix.backtrace.k$b r1 = com.tencent.matrix.backtrace.C114419k.C114421b.FpUntilQuickenWarmedUp
            if (r0 == r1) goto L_0x00c9
            com.tencent.matrix.backtrace.k$b r1 = com.tencent.matrix.backtrace.C114419k.C114421b.DwarfUntilQuickenWarmedUp
            if (r0 != r1) goto L_0x00cc
        L_0x00c9:
            com.tencent.matrix.backtrace.WeChatBacktraceNative.setBacktraceMode(r3)
        L_0x00cc:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Broadcast warmed up message to other processes."
            p723vf.C118672d.m167353c(r4, r1, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "action.backtrace.warmed-up"
            r0.<init>(r1)
            int r1 = android.os.Process.myPid()
            java.lang.String r3 = "pid"
            r0.putExtra(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r5.getPackageName()
            r1.append(r3)
            java.lang.String r3 = ".backtrace.warmed_up"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r5.sendBroadcast(r0, r1)
            com.tencent.matrix.backtrace.f r0 = com.tencent.matrix.backtrace.C114405e.f342949h
            if (r0 == 0) goto L_0x0108
            com.tencent.matrix.backtrace.f$a r1 = com.tencent.matrix.backtrace.C114410f.C114411a.WarmedUp
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.mm.plugin.performance.diagnostic.c r0 = (com.tencent.p014mm.plugin.performance.diagnostic.C115656c) r0
            r0.mo175880a(r1, r3)
        L_0x0108:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Warm-up done."
            p723vf.C118672d.m167353c(r4, r1, r0)
            goto L_0x0117
        L_0x0110:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Warm-up cancelled."
            p723vf.C118672d.m167353c(r4, r1, r0)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.backtrace.C114398a.run():void");
    }
}
