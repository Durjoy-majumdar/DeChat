package dc0;

public final /* synthetic */ class d$$a implements Runnable {
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x008d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.lang.String r1 = "MicroMsg.GetContactService"
            java.lang.String r2 = "Start post recovery."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            k40.a r1 = f40.C86709a0.m107533q(r0)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.v3 r1 = r1.mo96094Ku()
            java.util.List r2 = java.util.Collections.emptyList()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            java.util.List r1 = r1.mo69735F(r2)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0023:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "@chatroom"
            boolean r3 = r2.endsWith(r3)
            if (r3 != 0) goto L_0x0038
            goto L_0x0023
        L_0x0038:
            k40.a r3 = f40.C86709a0.m107533q(r0)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r3 = r3.get(r2)
            if (r3 == 0) goto L_0x005d
            java.lang.String r4 = r3.getNickname()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0023
            java.lang.String r3 = r3.mo73969n2()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x005d
            goto L_0x0023
        L_0x005d:
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            dc0.d$$b r4 = new dc0.d$$b
            r4.<init>(r3)
            java.lang.String r5 = "MicroMsg.GetContactService"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Chatroom nickname missing, go pull: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
            eb0.w2 r5 = eb0.C31519v2.m39436a()
            java.lang.String r6 = ""
            r5.mo55988e(r2, r6, r4)
            monitor-enter(r3)
            r3.wait()     // Catch:{ InterruptedException -> 0x008d }
            goto L_0x008d
        L_0x008b:
            r0 = move-exception
            goto L_0x008f
        L_0x008d:
            monitor-exit(r3)     // Catch:{ all -> 0x008b }
            goto L_0x0023
        L_0x008f:
            monitor-exit(r3)     // Catch:{ all -> 0x008b }
            throw r0
        L_0x0091:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 92
            r2 = 0
            r0.mo119679M(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dc0.d$$a.run():void");
    }
}
