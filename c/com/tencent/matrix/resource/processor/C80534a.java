package com.tencent.matrix.resource.processor;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.resource.C80530h;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.File;
import p723vf.C118672d;
import p723vf.C90779e;
import p982if.C87719c;
import p982if.C87726g;
import p982if.C87728i;
import p987jf.C87954a;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: com.tencent.matrix.resource.processor.a */
public final class C80534a extends C87719c {

    /* renamed from: e */
    public final C13601g f235553e;

    /* renamed from: com.tencent.matrix.resource.processor.a$a */
    public static final class C80535a extends C87413o implements C32224a<C87728i> {

        /* renamed from: d */
        public final /* synthetic */ C87954a f235554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80535a(C87954a aVar) {
            super(0);
            this.f235554d = aVar;
        }

        public Object invoke() {
            try {
                Context context = this.f235554d.f261442f;
                C87412m.m108593f(context, "watcher.context");
                File file = new File(context.getCacheDir(), "matrix_res_process_retry");
                if (!file.isDirectory()) {
                    C87726g.m109147a(file);
                    file.mkdirs();
                }
                return new C87728i(file);
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.LeakProcessor.NativeForkAnalyze", th, "Failed to initialize retry repository", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: com.tencent.matrix.resource.processor.a$b */
    public static final class C80536b extends C87413o implements C32224a<NativeForkAnalyzeProcessor$screenStateReceiver$2$1> {

        /* renamed from: d */
        public final /* synthetic */ C80534a f235555d;

        /* renamed from: e */
        public final /* synthetic */ C87954a f235556e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80536b(C80534a aVar, C87954a aVar2) {
            super(0);
            this.f235555d = aVar;
            this.f235556e = aVar2;
        }

        public Object invoke() {
            return new NativeForkAnalyzeProcessor$screenStateReceiver$2$1(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80534a(C87954a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "watcher");
        this.f235553e = C36568h.m40985a(new C80535a(aVar));
        C13601g a = C36568h.m40985a(new C80536b(this, aVar));
        if (C90779e.m113847b(aVar.f261442f)) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                NativeForkAnalyzeProcessor$screenStateReceiver$2$1 nativeForkAnalyzeProcessor$screenStateReceiver$2$1 = (NativeForkAnalyzeProcessor$screenStateReceiver$2$1) a.getValue();
                C118672d.m167353c("Matrix.LeakProcessor.NativeForkAnalyze", "Screen state receiver " + nativeForkAnalyzeProcessor$screenStateReceiver$2$1 + " registered.", new Object[0]);
                C80530h hVar = aVar.f254526g;
                C87412m.m108593f(hVar, "watcher.resourcePlugin");
                hVar.f261037e.registerReceiver(nativeForkAnalyzeProcessor$screenStateReceiver$2$1, intentFilter);
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.LeakProcessor.NativeForkAnalyze", th, "", new Object[0]);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0162, code lost:
        if (r12 == true) goto L_0x01a5;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo112104b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo r21) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            cf.a$b r10 = p937cf.C80018a.C80020b.FORK_ANALYSE
            java.lang.String r0 = "destroyedActivityInfo"
            gy3.C87412m.m108594g(r9, r0)
            cf.a$b r3 = p937cf.C80018a.C80020b.NO_DUMP
            java.lang.String r4 = r9.mActivityName
            java.lang.String r5 = r9.mKey
            java.lang.String r6 = "no dump"
            java.lang.String r7 = "0"
            r2 = 0
            r1 = r20
            r1.mo122138c(r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = "Matrix.Safe"
            java.lang.String r2 = ""
            r11 = 1
            r3 = 0
            r12 = 0
            df.e r0 = p955df.C86266e.f250872e     // Catch:{ all -> 0x002d }
            java.lang.String r4 = "NFAP"
            java.io.File r0 = r0.mo120674b(r4, r11)     // Catch:{ all -> 0x002d }
            r19 = r0
            goto L_0x0035
        L_0x002d:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r12]
            p723vf.C118672d.m167354d(r1, r0, r2, r4)
            r19 = r3
        L_0x0035:
            if (r19 == 0) goto L_0x01a9
            java.lang.String r4 = r9.mActivityName
            java.lang.String r5 = r9.mKey
            jf.a r0 = r8.f253997a
            r0.mo122416c()
            java.lang.String r0 = "Matrix.LeakProcessor.NativeForkAnalyze"
            java.lang.String r1 = "fork dump and analyse"
            java.lang.Object[] r2 = new java.lang.Object[r12]
            p723vf.C118672d.m167353c(r0, r1, r2)
            java.lang.String r14 = r19.getAbsolutePath()
            java.lang.String r0 = "hprof.absolutePath"
            gy3.C87412m.m108593f(r14, r0)
            java.lang.String r0 = "key"
            gy3.C87412m.m108593f(r5, r0)
            r16 = 600(0x258, double:2.964E-321)
            java.io.File r0 = com.tencent.matrix.resource.MemoryUtil.f235537a
            com.tencent.matrix.resource.MemoryUtil r13 = com.tencent.matrix.resource.MemoryUtil.f235540d
            com.tencent.matrix.resource.d r0 = new com.tencent.matrix.resource.d
            r0.<init>(r13)
            r15 = r5
            r18 = r0
            ze.a r1 = r13.mo112087c(r14, r15, r16, r18)
            java.lang.String r0 = "Matrix.LeakProcessor.NativeForkAnalyze"
            java.lang.String r2 = "fork dump and analyse done"
            java.lang.Object[] r6 = new java.lang.Object[r12]
            p723vf.C118672d.m167353c(r0, r2, r6)
            java.lang.Throwable r0 = r1.f262649f
            if (r0 == 0) goto L_0x0172
            java.lang.String r0 = "Matrix.LeakProcessor.NativeForkAnalyze"
            java.lang.String r2 = "Process failed, move into retry repository."
            java.lang.Object[] r6 = new java.lang.Object[r12]
            p723vf.C118672d.m167353c(r0, r2, r6)
            java.lang.Throwable r0 = r1.f262649f
            java.lang.String r6 = r0.toString()
            rx3.g r0 = r8.f235553e
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            if.i r0 = (p982if.C87728i) r0
            if (r0 == 0) goto L_0x0164
            java.lang.String r2 = "activity"
            gy3.C87412m.m108593f(r4, r2)
            java.lang.String r2 = "failure"
            gy3.C87412m.m108594g(r6, r2)
            boolean r2 = r19.isFile()     // Catch:{ all -> 0x0158 }
            if (r2 != 0) goto L_0x00a3
            goto L_0x0162
        L_0x00a3:
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0158 }
            java.lang.String r7 = "UUID.randomUUID().toString()"
            gy3.C87412m.m108593f(r2, r7)     // Catch:{ all -> 0x0158 }
            java.lang.String r7 = "Matrix.LeakProcessor.NativeForkAnalyze"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0158 }
            r9.<init>()     // Catch:{ all -> 0x0158 }
            java.lang.String r13 = "Save HPROF analyze retry record "
            r9.append(r13)     // Catch:{ all -> 0x0158 }
            r9.append(r4)     // Catch:{ all -> 0x0158 }
            r13 = 40
            r9.append(r13)     // Catch:{ all -> 0x0158 }
            r9.append(r2)     // Catch:{ all -> 0x0158 }
            java.lang.String r13 = ")."
            r9.append(r13)     // Catch:{ all -> 0x0158 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0158 }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x0158 }
            p723vf.C118672d.m167353c(r7, r9, r13)     // Catch:{ all -> 0x0158 }
            java.lang.Object r7 = r0.f254013a     // Catch:{ all -> 0x0158 }
            monitor-enter(r7)     // Catch:{ all -> 0x0158 }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x00ed }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00ed }
            java.io.File r13 = r0.f254014b     // Catch:{ all -> 0x00ed }
            java.lang.String r15 = "hprof"
            r9.<init>(r13, r15)     // Catch:{ all -> 0x00ed }
            boolean r13 = r9.exists()     // Catch:{ all -> 0x00ed }
            if (r13 != 0) goto L_0x00ef
            r9.mkdirs()     // Catch:{ all -> 0x00ed }
            goto L_0x00ef
        L_0x00ed:
            r0 = move-exception
            goto L_0x0156
        L_0x00ef:
            r14.<init>(r9, r2)     // Catch:{ all -> 0x00ed }
            r15 = 1
            r16 = 0
            r17 = 4
            r18 = 0
            r13 = r19
            cy3.C86153j.m106663b(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00ed }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00ed }
            java.io.File r13 = new java.io.File     // Catch:{ all -> 0x00ed }
            java.io.File r0 = r0.f254014b     // Catch:{ all -> 0x00ed }
            java.lang.String r14 = "key"
            r13.<init>(r0, r14)     // Catch:{ all -> 0x00ed }
            boolean r0 = r13.exists()     // Catch:{ all -> 0x00ed }
            if (r0 != 0) goto L_0x0112
            r13.mkdirs()     // Catch:{ all -> 0x00ed }
        L_0x0112:
            r9.<init>(r13, r2)     // Catch:{ all -> 0x00ed }
            r9.createNewFile()     // Catch:{ all -> 0x00ed }
            java.nio.charset.Charset r0 = z04.C119027c.f356488a     // Catch:{ all -> 0x00ed }
            r2 = 8192(0x2000, float:1.14794E-41)
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ed }
            r13.<init>(r9)     // Catch:{ all -> 0x00ed }
            java.io.OutputStreamWriter r9 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ed }
            r9.<init>(r13, r0)     // Catch:{ all -> 0x00ed }
            boolean r0 = r9 instanceof java.io.BufferedWriter     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x012d
            java.io.BufferedWriter r9 = (java.io.BufferedWriter) r9     // Catch:{ all -> 0x00ed }
            goto L_0x0133
        L_0x012d:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ed }
            r0.<init>(r9, r2)     // Catch:{ all -> 0x00ed }
            r9 = r0
        L_0x0133:
            r9.write(r4)     // Catch:{ all -> 0x014d }
            r9.newLine()     // Catch:{ all -> 0x014d }
            r9.write(r5)     // Catch:{ all -> 0x014d }
            r9.newLine()     // Catch:{ all -> 0x014d }
            r9.write(r6)     // Catch:{ all -> 0x014d }
            r9.flush()     // Catch:{ all -> 0x014d }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x014d }
            cy3.C58003b.m67160a(r9, r3)     // Catch:{ all -> 0x00ed }
            monitor-exit(r7)     // Catch:{ all -> 0x0158 }
            r12 = 1
            goto L_0x0162
        L_0x014d:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r9, r2)     // Catch:{ all -> 0x00ed }
            throw r3     // Catch:{ all -> 0x00ed }
        L_0x0156:
            monitor-exit(r7)     // Catch:{ all -> 0x0158 }
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r0 = move-exception
            java.lang.String r2 = "Matrix.LeakProcessor.NativeForkAnalyze"
            java.lang.String r3 = "Failed to save HPROF record into retry repository"
            java.lang.Object[] r7 = new java.lang.Object[r12]
            p723vf.C118672d.m167354d(r2, r0, r3, r7)
        L_0x0162:
            if (r12 == r11) goto L_0x01a5
        L_0x0164:
            r2 = 5
            long r0 = r1.f262650g
            java.lang.String r7 = java.lang.String.valueOf(r0)
            r1 = r20
            r3 = r10
            r1.mo122138c(r2, r3, r4, r5, r6, r7)
            goto L_0x01a5
        L_0x0172:
            boolean r0 = r1.f262647d
            if (r0 == 0) goto L_0x01a5
            jf.a r0 = r8.f253997a
            r0.mo125242b(r4, r12)
            java.lang.String r0 = r1.toString()
            r2 = 0
            long r6 = r1.f262650g
            java.lang.String r7 = java.lang.String.valueOf(r6)
            r1 = r20
            r3 = r10
            r6 = r0
            r1.mo122138c(r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = "Matrix.LeakProcessor.NativeForkAnalyze"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "leak found: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r12]
            p723vf.C118672d.m167353c(r1, r0, r2)
        L_0x01a5:
            p982if.C87726g.m109147a(r19)
            return r11
        L_0x01a9:
            r2 = 0
            java.lang.String r4 = r9.mActivityName
            java.lang.String r5 = "[unknown]"
            java.lang.String r6 = "Failed to create hprof file."
            java.lang.String r7 = "0"
            r1 = r20
            r3 = r10
            r1.mo122138c(r2, r3, r4, r5, r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.resource.processor.C80534a.mo112104b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo):boolean");
    }
}
