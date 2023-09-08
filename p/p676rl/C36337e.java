package p676rl;

import gy3.C87412m;

/* renamed from: rl.e */
public final class C36337e {

    /* renamed from: a */
    public final C36338f f96715a;

    /* renamed from: b */
    public final C36335c f96716b = new C36335c(this);

    public C36337e(C36338f fVar) {
        C87412m.m108594g(fVar, "callback");
        this.f96715a = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        if (r5.f96713b.field_version < r4.f96713b.field_version) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60630a(int r13, p248ug.C37467u r14, p696tl.C37114a r15) {
        /*
            r12 = this;
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "executor"
            gy3.C87412m.m108594g(r15, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r14.field_actionTime
            long r4 = eb0.C31543z5.m39451a()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            long r2 = r2 - r4
            java.lang.String r4 = "FunctionMsg.FunctionMsgTimer"
            java.lang.String r5 = "[add] op:%s delay:%ss id:%s"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r8 = 0
            r6[r8] = r7
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r6[r3] = r2
            java.lang.String r2 = r14.field_functionmsgid
            r7 = 2
            r6[r7] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
            rl.c r2 = r12.f96716b
            rl.d r4 = new rl.d
            r4.<init>(r13, r14, r15)
            r2.getClass()
            java.lang.Object r13 = r2.f96711d
            monitor-enter(r13)
            gy3.f0 r14 = new gy3.f0     // Catch:{ all -> 0x00fc }
            r14.<init>()     // Catch:{ all -> 0x00fc }
            java.util.HashMap<java.lang.String, rl.d> r15 = r2.f96709b     // Catch:{ all -> 0x00fc }
            ug.u r5 = r4.f96713b     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = r5.field_functionmsgid     // Catch:{ all -> 0x00fc }
            boolean r15 = r15.containsKey(r5)     // Catch:{ all -> 0x00fc }
            if (r15 == 0) goto L_0x005f
            java.util.HashMap<java.lang.String, rl.d> r15 = r2.f96709b     // Catch:{ all -> 0x00fc }
            ug.u r5 = r4.f96713b     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = r5.field_functionmsgid     // Catch:{ all -> 0x00fc }
            java.lang.Object r15 = r15.remove(r5)     // Catch:{ all -> 0x00fc }
            r14.f27484d = r15     // Catch:{ all -> 0x00fc }
        L_0x005f:
            T r15 = r14.f27484d     // Catch:{ all -> 0x00fc }
            if (r15 == 0) goto L_0x00a6
            r5 = r15
            rl.d r5 = (p676rl.C36336d) r5     // Catch:{ all -> 0x00fc }
            int r6 = r4.f96712a     // Catch:{ all -> 0x00fc }
            r9 = 101(0x65, float:1.42E-43)
            if (r9 != r6) goto L_0x006d
            goto L_0x008e
        L_0x006d:
            if (r3 != r6) goto L_0x0082
            ug.u r5 = r5.f96713b     // Catch:{ all -> 0x00fc }
            long r5 = r5.field_version     // Catch:{ all -> 0x00fc }
            ug.u r9 = r4.f96713b     // Catch:{ all -> 0x00fc }
            long r9 = r9.field_version     // Catch:{ all -> 0x00fc }
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x008e
            r5 = 0
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0090
            goto L_0x008e
        L_0x0082:
            ug.u r5 = r5.f96713b     // Catch:{ all -> 0x00fc }
            long r5 = r5.field_version     // Catch:{ all -> 0x00fc }
            ug.u r9 = r4.f96713b     // Catch:{ all -> 0x00fc }
            long r9 = r9.field_version     // Catch:{ all -> 0x00fc }
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0090
        L_0x008e:
            r5 = 1
            goto L_0x0091
        L_0x0090:
            r5 = 0
        L_0x0091:
            if (r5 == 0) goto L_0x00a6
            java.lang.String r5 = "FunctionMsg.FunctionMsgQueue"
            java.lang.String r6 = "[add] remove old task[%s]"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x00fc }
            r9[r8] = r15     // Catch:{ all -> 0x00fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r6, r9)     // Catch:{ all -> 0x00fc }
            java.util.LinkedList<rl.d> r15 = r2.f96708a     // Catch:{ all -> 0x00fc }
            T r5 = r14.f27484d     // Catch:{ all -> 0x00fc }
            r15.remove(r5)     // Catch:{ all -> 0x00fc }
            goto L_0x00b7
        L_0x00a6:
            if (r15 == 0) goto L_0x00b7
            java.lang.String r14 = "FunctionMsg.FunctionMsgQueue"
            java.lang.String r2 = "[add] is wrong! new task:%s old task:%s"
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x00fc }
            r5[r8] = r4     // Catch:{ all -> 0x00fc }
            r5[r3] = r15     // Catch:{ all -> 0x00fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r2, r5)     // Catch:{ all -> 0x00fc }
            monitor-exit(r13)
            goto L_0x00e7
        L_0x00b7:
            java.lang.String r15 = "FunctionMsg.FunctionMsgQueue"
            java.lang.String r5 = "[add] add task[%s] old Task[%s]"
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x00fc }
            r6[r8] = r4     // Catch:{ all -> 0x00fc }
            T r14 = r14.f27484d     // Catch:{ all -> 0x00fc }
            r7 = r14
            rl.d r7 = (p676rl.C36336d) r7     // Catch:{ all -> 0x00fc }
            if (r7 == 0) goto L_0x00ca
            rl.d r14 = (p676rl.C36336d) r14     // Catch:{ all -> 0x00fc }
            if (r14 != 0) goto L_0x00cc
        L_0x00ca:
            java.lang.String r14 = "@null"
        L_0x00cc:
            r6[r3] = r14     // Catch:{ all -> 0x00fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r6)     // Catch:{ all -> 0x00fc }
            java.util.LinkedList<rl.d> r14 = r2.f96708a     // Catch:{ all -> 0x00fc }
            r14.add(r4)     // Catch:{ all -> 0x00fc }
            java.util.HashMap<java.lang.String, rl.d> r14 = r2.f96709b     // Catch:{ all -> 0x00fc }
            ug.u r15 = r4.f96713b     // Catch:{ all -> 0x00fc }
            java.lang.String r15 = r15.field_functionmsgid     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = "task.mItem.functionMsgId"
            gy3.C87412m.m108593f(r15, r2)     // Catch:{ all -> 0x00fc }
            r14.put(r15, r4)     // Catch:{ all -> 0x00fc }
            rx3.b0 r14 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00fc }
            monitor-exit(r13)
        L_0x00e7:
            java.lang.String r13 = "FunctionMsg.FunctionMsgTimer"
            java.lang.String r14 = "[add] Cost:%s"
            java.lang.Object[] r15 = new java.lang.Object[r3]
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r15[r8] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r15)
            return
        L_0x00fc:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p676rl.C36337e.mo60630a(int, ug.u, tl.a):void");
    }
}
