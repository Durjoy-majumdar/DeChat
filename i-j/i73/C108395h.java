package i73;

import com.tencent.p014mm.autogen.events.WalletLockProtectEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: i73.h */
public class C108395h extends IStaticListener<WalletLockProtectEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r24) {
        /*
            r23 = this;
            r0 = r24
            com.tencent.mm.autogen.events.WalletLockProtectEvent r0 = (com.tencent.p014mm.autogen.events.WalletLockProtectEvent) r0
            com.tencent.mm.plugin.walletlock.model.h r1 = com.tencent.p014mm.plugin.walletlock.model.C106559h.instance
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.mm.autogen.events.WalletLockProtectEvent$a r4 = r0.f310017d
            int r4 = r4.f310019a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            com.tencent.mm.plugin.walletlock.model.j r4 = com.tencent.p014mm.plugin.walletlock.model.C106561j.INSTANCE
            boolean r6 = r4.mo153261c()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7 = 1
            r3[r7] = r6
            java.lang.Object r6 = r4.f318389f
            monitor-enter(r6)
            boolean r8 = r4.f318388e     // Catch:{ all -> 0x01df }
            monitor-exit(r6)     // Catch:{ all -> 0x01df }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r8)
            r8 = 2
            r3[r8] = r6
            java.lang.String r6 = "MicroMsg.WalletLockInitTask"
            java.lang.String r9 = "alvinluo wallet lock protect request: %d, verfiyMaskOnCreate: %b, verfiyMaskOnResume: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r3)
            com.tencent.mm.autogen.events.WalletLockProtectEvent$a r3 = r0.f310017d
            int r9 = r3.f310019a
            r10 = 4
            r11 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r13 = "alvinluo current wallet lock type: %d"
            java.lang.String r14 = "MicroMsg.WalletLockManager"
            r16 = 17
            r17 = -1
            if (r9 == 0) goto L_0x0115
            if (r9 == r7) goto L_0x004a
            goto L_0x01cc
        L_0x004a:
            android.app.Activity r3 = r3.f310020b
            boolean r9 = r3 instanceof com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI
            if (r9 != 0) goto L_0x0109
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI
            if (r3 != 0) goto L_0x0109
            boolean r3 = r4.mo153261c()
            java.lang.String r9 = "REQUEST_PROTECT_ME_ONRESUME indicates need not verify."
            if (r3 == 0) goto L_0x0067
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r9)
            r4.mo153263f(r5)
            r4.mo153264g(r5)
            goto L_0x00ed
        L_0x0067:
            java.lang.Object r3 = r4.f318389f
            monitor-enter(r3)
            boolean r15 = r4.f318388e     // Catch:{ all -> 0x0106 }
            monitor-exit(r3)     // Catch:{ all -> 0x0106 }
            if (r15 == 0) goto L_0x007c
            java.lang.String r1 = "REQUEST_PROTECT_ME_ONRESUME indicates reenter."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r1)
            r4.mo153263f(r5)
            r4.mo153264g(r5)
            goto L_0x00ed
        L_0x007c:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            int r15 = r1.f318383f
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r3[r5] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r13, r3)
            int r3 = r1.f318383f
            if (r3 != r8) goto L_0x0090
            long r19 = e73.C107243a.f320886a
            goto L_0x0094
        L_0x0090:
            if (r3 != r7) goto L_0x00ed
            long r19 = g73.C107761f.f322498a
        L_0x0094:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            com.tencent.mm.autogen.events.WalletLockProtectEvent$a r13 = r0.f310017d
            android.app.Activity r13 = r13.f310020b
            r3.<init>(r13)
            r4.mo153259a(r3)
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r19
            long r3 = r3 / r11
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Long r11 = java.lang.Long.valueOf(r19)
            r10[r5] = r11
            long r11 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r7] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            r10[r8] = r11
            int r8 = com.tencent.p014mm.plugin.walletlock.model.WalletLockInitTask.m5554a()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10[r2] = r8
            java.lang.String r2 = "alvinluo lastVerifyOkTime: %d, elapsedRealTime: %d, pastTime: %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r10)
            int r2 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x00e6
            int r2 = com.tencent.p014mm.plugin.walletlock.model.WalletLockInitTask.m5554a()
            long r10 = (long) r2
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x00e6
            boolean r1 = r1.mo153254b()
            if (r1 == 0) goto L_0x00e2
            goto L_0x00e6
        L_0x00e2:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r9)
            goto L_0x00ed
        L_0x00e6:
            java.lang.String r1 = "REQUEST_PROTECT_ME_ONRESUME indicates needs verify."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r1)
            r1 = 1
            goto L_0x00ee
        L_0x00ed:
            r1 = 0
        L_0x00ee:
            if (r1 == 0) goto L_0x00fa
            com.tencent.mm.autogen.events.WalletLockProtectEvent$b r1 = r0.f310018e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.f310021a = r2
            goto L_0x01cc
        L_0x00fa:
            com.tencent.mm.autogen.events.WalletLockProtectEvent$b r1 = r0.f310018e
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.f310021a = r2
            goto L_0x01cc
        L_0x0106:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0106 }
            throw r0
        L_0x0109:
            com.tencent.mm.autogen.events.WalletLockProtectEvent$b r1 = r0.f310018e
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.f310021a = r2
            goto L_0x01cc
        L_0x0115:
            android.app.Activity r3 = r3.f310020b
            boolean r9 = r3 instanceof com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI
            if (r9 != 0) goto L_0x01c2
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI
            if (r3 != 0) goto L_0x01c2
            boolean r3 = r4.mo153261c()
            java.lang.String r9 = "REQUEST_PROTECT_ME_ONCREATE indicates need not verify."
            if (r3 != 0) goto L_0x0199
            java.lang.Object[] r3 = new java.lang.Object[r7]
            int r15 = r1.f318383f
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r3[r5] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r13, r3)
            int r3 = r1.f318383f
            if (r3 != r8) goto L_0x013b
            long r19 = e73.C107243a.f320886a
            goto L_0x013f
        L_0x013b:
            if (r3 != r7) goto L_0x01ab
            long r19 = g73.C107761f.f322498a
        L_0x013f:
            long r21 = android.os.SystemClock.elapsedRealtime()
            long r21 = r21 - r19
            long r21 = r21 / r11
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r19)
            r3[r5] = r10
            long r10 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r3[r7] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r21)
            r3[r8] = r10
            int r8 = com.tencent.p014mm.plugin.walletlock.model.WalletLockInitTask.m5554a()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3[r2] = r8
            java.lang.String r2 = "alvinluo lastVerifyOkTime: %d, elapsedRealTime: %d, pastTime: %d, PREVENT_INPUT_PWD_SECONDS: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r3)
            int r2 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0192
            int r2 = com.tencent.p014mm.plugin.walletlock.model.WalletLockInitTask.m5554a()
            long r2 = (long) r2
            int r8 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x0192
            boolean r1 = r1.mo153254b()
            if (r1 == 0) goto L_0x0182
            goto L_0x0192
        L_0x0182:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r9)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            com.tencent.mm.autogen.events.WalletLockProtectEvent$a r2 = r0.f310017d
            android.app.Activity r2 = r2.f310020b
            r1.<init>(r2)
            r4.mo153259a(r1)
            goto L_0x01ab
        L_0x0192:
            java.lang.String r1 = "REQUEST_PROTECT_ME_ONCREATE indicates needs verify."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r1)
            r1 = 1
            goto L_0x01ac
        L_0x0199:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r9)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            com.tencent.mm.autogen.events.WalletLockProtectEvent$a r2 = r0.f310017d
            android.app.Activity r2 = r2.f310020b
            r1.<init>(r2)
            r4.mo153259a(r1)
            r4.mo153263f(r5)
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            if (r1 == 0) goto L_0x01b7
            com.tencent.mm.autogen.events.WalletLockProtectEvent$b r1 = r0.f310018e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.f310021a = r2
            goto L_0x01cc
        L_0x01b7:
            com.tencent.mm.autogen.events.WalletLockProtectEvent$b r1 = r0.f310018e
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.f310021a = r2
            goto L_0x01cc
        L_0x01c2:
            r2 = 16
            com.tencent.mm.autogen.events.WalletLockProtectEvent$b r1 = r0.f310018e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.f310021a = r2
        L_0x01cc:
            com.tencent.mm.autogen.events.WalletLockProtectEvent$a r1 = r0.f310017d
            r2 = 0
            r1.f310020b = r2
            java.lang.Object[] r1 = new java.lang.Object[r7]
            com.tencent.mm.autogen.events.WalletLockProtectEvent$b r0 = r0.f310018e
            java.lang.Object r0 = r0.f310021a
            r1[r5] = r0
            java.lang.String r0 = "alvinluo protect result: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r1)
            return r5
        L_0x01df:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01df }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i73.C108395h.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
