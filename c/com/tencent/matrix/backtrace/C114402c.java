package com.tencent.matrix.backtrace;

import android.os.CancellationSignal;

/* renamed from: com.tencent.matrix.backtrace.c */
public class C114402c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f342944d;

    /* renamed from: e */
    public final /* synthetic */ C114405e f342945e;

    public C114402c(C114405e eVar, CancellationSignal cancellationSignal) {
        this.f342945e = eVar;
        this.f342944d = cancellationSignal;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b A[Catch:{ all -> 0x00b2 }, LOOP:0: B:6:0x002b->B:33:0x009b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r1 = r16
            com.tencent.matrix.backtrace.h$b r2 = com.tencent.matrix.backtrace.C114413h.C114415b.RequestConsuming
            r0 = 0
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r4 = "Matrix.WarmUpDelegate"
            java.lang.String r5 = "Going to consume requested QUT."
            p723vf.C118672d.m167353c(r4, r5, r3)
            java.lang.String[] r3 = com.tencent.matrix.backtrace.WeChatBacktraceNative.consumeRequestedQut()
            com.tencent.matrix.backtrace.e r5 = r1.f342945e
            zd.b r5 = com.tencent.matrix.backtrace.C114405e.m160936a(r5)
            if (r5 != 0) goto L_0x0029
            com.tencent.matrix.backtrace.e r3 = r1.f342945e
            com.tencent.matrix.backtrace.h r3 = r3.f342954e
            r3.mo173584a(r2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Failed to acquire warm-up invoker."
            p723vf.C118672d.m167356f(r4, r2, r0)
            return
        L_0x0029:
            int r6 = r3.length     // Catch:{ all -> 0x00b2 }
            r7 = 0
        L_0x002b:
            if (r7 >= r6) goto L_0x009e
            r8 = r3[r7]     // Catch:{ all -> 0x00b2 }
            r9 = 58
            int r9 = r8.lastIndexOf(r9)     // Catch:{ all -> 0x00b2 }
            r10 = -1
            if (r9 == r10) goto L_0x004b
            java.lang.String r10 = r8.substring(r0, r9)     // Catch:{ all -> 0x004b }
            int r9 = r9 + 1
            java.lang.String r9 = r8.substring(r9)     // Catch:{ all -> 0x004c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x004c }
            int r9 = r9.intValue()     // Catch:{ all -> 0x004c }
            goto L_0x004d
        L_0x004b:
            r10 = r8
        L_0x004c:
            r9 = 0
        L_0x004d:
            com.tencent.matrix.backtrace.e r11 = r1.f342945e     // Catch:{ all -> 0x00b2 }
            boolean r11 = com.tencent.matrix.backtrace.C114405e.m160937b(r11, r10, r9)     // Catch:{ all -> 0x00b2 }
            r12 = 2
            if (r11 != 0) goto L_0x0078
            boolean r11 = r5.mo173577a(r10, r9)     // Catch:{ all -> 0x00b2 }
            if (r11 != 0) goto L_0x0079
            com.tencent.matrix.backtrace.e r14 = r1.f342945e     // Catch:{ all -> 0x00b2 }
            r14.getClass()     // Catch:{ all -> 0x00b2 }
            com.tencent.matrix.backtrace.f r14 = com.tencent.matrix.backtrace.C114405e.f342949h     // Catch:{ all -> 0x00b2 }
            if (r14 == 0) goto L_0x0079
            com.tencent.matrix.backtrace.f$a r15 = com.tencent.matrix.backtrace.C114410f.C114411a.WarmUpFailed     // Catch:{ all -> 0x00b2 }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x00b2 }
            r13[r0] = r10     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00b2 }
            r10 = 1
            r13[r10] = r9     // Catch:{ all -> 0x00b2 }
            com.tencent.mm.plugin.performance.diagnostic.c r14 = (com.tencent.p014mm.plugin.performance.diagnostic.C115656c) r14     // Catch:{ all -> 0x00b2 }
            r14.mo175880a(r15, r13)     // Catch:{ all -> 0x00b2 }
            goto L_0x0079
        L_0x0078:
            r11 = 0
        L_0x0079:
            java.lang.String r9 = "Consumed requested QUT -> %s, ret = %s."
            java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ all -> 0x00b2 }
            r10[r0] = r8     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x00b2 }
            r11 = 1
            r10[r11] = r8     // Catch:{ all -> 0x00b2 }
            p723vf.C118672d.m167353c(r4, r9, r10)     // Catch:{ all -> 0x00b2 }
            android.os.CancellationSignal r8 = r1.f342944d     // Catch:{ all -> 0x00b2 }
            if (r8 == 0) goto L_0x009b
            boolean r8 = r8.isCanceled()     // Catch:{ all -> 0x00b2 }
            if (r8 == 0) goto L_0x009b
            java.lang.String r3 = "Consume requested QUT canceled."
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ all -> 0x00b2 }
            p723vf.C118672d.m167353c(r4, r3, r6)     // Catch:{ all -> 0x00b2 }
            goto L_0x009e
        L_0x009b:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x009e:
            java.lang.String r3 = "Consume requested QUT done."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00b2 }
            p723vf.C118672d.m167353c(r4, r3, r0)     // Catch:{ all -> 0x00b2 }
            com.tencent.matrix.backtrace.e r0 = r1.f342945e
            com.tencent.matrix.backtrace.C114405e.m160938c(r0, r5)
            com.tencent.matrix.backtrace.e r0 = r1.f342945e
            com.tencent.matrix.backtrace.h r0 = r0.f342954e
            r0.mo173584a(r2)
            return
        L_0x00b2:
            r0 = move-exception
            com.tencent.matrix.backtrace.e r3 = r1.f342945e
            com.tencent.matrix.backtrace.C114405e.m160938c(r3, r5)
            com.tencent.matrix.backtrace.e r3 = r1.f342945e
            com.tencent.matrix.backtrace.h r3 = r3.f342954e
            r3.mo173584a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.backtrace.C114402c.run():void");
    }
}
