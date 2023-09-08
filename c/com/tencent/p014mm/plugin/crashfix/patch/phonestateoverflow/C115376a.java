package com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow;

import android.telephony.PhoneStateListener;
import com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow;

/* renamed from: com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.a */
public class C115376a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f345784d;

    /* renamed from: e */
    public final /* synthetic */ PhoneStateListener f345785e;

    /* renamed from: f */
    public final /* synthetic */ String f345786f;

    /* renamed from: g */
    public final /* synthetic */ PhoneStateOverflow.C1153721 f345787g;

    public C115376a(PhoneStateOverflow.C1153721 r1, int i, PhoneStateListener phoneStateListener, String str) {
        this.f345787g = r1;
        this.f345784d = i;
        this.f345785e = phoneStateListener;
        this.f345786f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = new com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow.C115375c(r0, (com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow.C1153721) null);
        r2.f345782a = r1;
        r2.f345783b = new java.lang.ref.WeakReference<>(r3);
        ((java.util.ArrayList) r0.f345774a).add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00f4, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0125, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2 = ((java.util.ArrayList) r0.f345774a).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0132, code lost:
        if (r2.hasNext() == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0134, code lost:
        r3 = ((com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow.C115375c) r2.next()).f345782a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x013e, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            java.lang.String r0 = "MicroMsg.PhoneStateOverflow"
            java.lang.String r1 = "remove:  event id = %d, listener %d"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r4 = r15.f345784d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            android.telephony.PhoneStateListener r4 = r15.f345785e
            int r4 = r4.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            android.telephony.PhoneStateListener r1 = r15.f345785e
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r4)
            r3.mo10233c(r1)
            java.lang.Object[] r8 = r3.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/crashfix/patch/phonestateoverflow/PhoneStateOverflow$1$1"
            java.lang.String r10 = "run"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r13 = "listen"
            java.lang.String r14 = "(Landroid/telephony/PhoneStateListener;I)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r3.mo10231a(r5)
            android.telephony.PhoneStateListener r1 = (android.telephony.PhoneStateListener) r1
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.listen(r1, r3)
            java.lang.String r8 = "com/tencent/mm/plugin/crashfix/patch/phonestateoverflow/PhoneStateOverflow$1$1"
            java.lang.String r9 = "run"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r12 = "listen"
            java.lang.String r13 = "(Landroid/telephony/PhoneStateListener;I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$1 r0 = r15.f345787g
            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow r0 = com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow.this
            int r1 = r15.f345784d
            android.telephony.PhoneStateListener r3 = r15.f345785e
            java.lang.String r4 = r15.f345786f
            monitor-enter(r0)
            java.lang.String r7 = "MicroMsg.PhoneStateOverflow"
            java.lang.String r8 = "add outter:  event id = %d, listener %d, stack = %s"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x01c7 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01c7 }
            r9[r5] = r10     // Catch:{ all -> 0x01c7 }
            int r10 = r3.hashCode()     // Catch:{ all -> 0x01c7 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01c7 }
            r9[r6] = r10     // Catch:{ all -> 0x01c7 }
            r9[r2] = r4     // Catch:{ all -> 0x01c7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ all -> 0x01c7 }
            java.util.List<com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$c> r4 = r0.f345774a     // Catch:{ all -> 0x01c7 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x01c7 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x01c7 }
        L_0x00a8:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x01c7 }
            r8 = 0
            if (r7 == 0) goto L_0x00de
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x01c7 }
            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$c r7 = (com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow.C115375c) r7     // Catch:{ all -> 0x01c7 }
            java.lang.ref.WeakReference<android.telephony.PhoneStateListener> r9 = r7.f345783b     // Catch:{ all -> 0x01c7 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x01c7 }
            android.telephony.PhoneStateListener r9 = (android.telephony.PhoneStateListener) r9     // Catch:{ all -> 0x01c7 }
            if (r9 != 0) goto L_0x00c0
            goto L_0x00a8
        L_0x00c0:
            if (r9 != r3) goto L_0x00a8
            java.lang.String r3 = "MicroMsg.PhoneStateOverflow"
            java.lang.String r4 = "change outter event id %d to %d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c7 }
            int r9 = r7.f345782a     // Catch:{ all -> 0x01c7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01c7 }
            r2[r5] = r9     // Catch:{ all -> 0x01c7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01c7 }
            r2[r6] = r9     // Catch:{ all -> 0x01c7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)     // Catch:{ all -> 0x01c7 }
            r7.f345782a = r1     // Catch:{ all -> 0x01c7 }
            monitor-exit(r0)
            r0 = 0
            goto L_0x00f5
        L_0x00de:
            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$c r2 = new com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$c     // Catch:{ all -> 0x01c7 }
            r2.<init>(r0, r8)     // Catch:{ all -> 0x01c7 }
            r2.f345782a = r1     // Catch:{ all -> 0x01c7 }
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x01c7 }
            r1.<init>(r3)     // Catch:{ all -> 0x01c7 }
            r2.f345783b = r1     // Catch:{ all -> 0x01c7 }
            java.util.List<com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$c> r1 = r0.f345774a     // Catch:{ all -> 0x01c7 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x01c7 }
            r1.add(r2)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r0)
            r0 = 1
        L_0x00f5:
            if (r0 == 0) goto L_0x01c6
            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$1 r0 = r15.f345787g
            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow r0 = com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow.this
            int r1 = r15.f345784d
            monitor-enter(r0)
            java.lang.String r2 = "MicroMsg.PhoneStateOverflow"
            java.lang.String r3 = "add inner:  event id = %d"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01c3 }
            r4[r5] = r7     // Catch:{ all -> 0x01c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)     // Catch:{ all -> 0x01c3 }
            java.util.List<com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$a> r2 = r0.f345775b     // Catch:{ all -> 0x01c3 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x01c3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01c3 }
        L_0x0115:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x01c3 }
            if (r3 == 0) goto L_0x0143
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x01c3 }
            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$a r3 = (com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow.C115373a) r3     // Catch:{ all -> 0x01c3 }
            int r3 = r3.f345778a     // Catch:{ all -> 0x01c3 }
            if (r3 != r1) goto L_0x0115
            monitor-enter(r0)     // Catch:{ all -> 0x01c3 }
            java.util.List<com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$c> r2 = r0.f345774a     // Catch:{ all -> 0x0140 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0140 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0140 }
        L_0x012e:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0140 }
            if (r3 == 0) goto L_0x013d
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$c r3 = (com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow.C115375c) r3     // Catch:{ all -> 0x0140 }
            int r3 = r3.f345782a     // Catch:{ all -> 0x0140 }
            goto L_0x012e
        L_0x013d:
            monitor-exit(r0)     // Catch:{ all -> 0x01c3 }
            r2 = 1
            goto L_0x0144
        L_0x0140:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c3 }
            throw r1     // Catch:{ all -> 0x01c3 }
        L_0x0143:
            r2 = 0
        L_0x0144:
            if (r2 != 0) goto L_0x01c1
            java.lang.String r2 = "MicroMsg.PhoneStateOverflow"
            java.lang.String r3 = "create inner:  event id = %d"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01c3 }
            r4[r5] = r7     // Catch:{ all -> 0x01c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)     // Catch:{ all -> 0x01c3 }
            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$a r2 = new com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$a     // Catch:{ all -> 0x01c3 }
            r2.<init>(r0, r8)     // Catch:{ all -> 0x01c3 }
            r2.f345778a = r1     // Catch:{ all -> 0x01c3 }
            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$b r3 = new com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$b     // Catch:{ all -> 0x01c3 }
            r3.<init>(r2)     // Catch:{ all -> 0x01c3 }
            r2.f345779b = r3     // Catch:{ all -> 0x01c3 }
            java.util.List<com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$a> r3 = r0.f345775b     // Catch:{ all -> 0x01c3 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x01c3 }
            r3.add(r2)     // Catch:{ all -> 0x01c3 }
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x01c3 }
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ all -> 0x01c3 }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ all -> 0x01c3 }
            android.telephony.PhoneStateListener r2 = r2.f345779b     // Catch:{ all -> 0x01c3 }
            k20.a r4 = new k20.a     // Catch:{ all -> 0x01c3 }
            r4.<init>()     // Catch:{ all -> 0x01c3 }
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01c3 }
            r4.mo10233c(r1)     // Catch:{ all -> 0x01c3 }
            r4.mo10233c(r2)     // Catch:{ all -> 0x01c3 }
            java.lang.Object[] r8 = r4.mo10232b()     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = "com/tencent/mm/plugin/crashfix/patch/phonestateoverflow/PhoneStateOverflow"
            java.lang.String r10 = "initInnerListener"
            java.lang.String r11 = "(I)V"
            java.lang.String r12 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r13 = "listen"
            java.lang.String r14 = "(Landroid/telephony/PhoneStateListener;I)V"
            r7 = r3
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01c3 }
            java.lang.Object r1 = r4.mo10231a(r5)     // Catch:{ all -> 0x01c3 }
            android.telephony.PhoneStateListener r1 = (android.telephony.PhoneStateListener) r1     // Catch:{ all -> 0x01c3 }
            java.lang.Object r2 = r4.mo10231a(r6)     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x01c3 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x01c3 }
            r3.listen(r1, r2)     // Catch:{ all -> 0x01c3 }
            java.lang.String r8 = "com/tencent/mm/plugin/crashfix/patch/phonestateoverflow/PhoneStateOverflow"
            java.lang.String r9 = "initInnerListener"
            java.lang.String r10 = "(I)V"
            java.lang.String r11 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r12 = "listen"
            java.lang.String r13 = "(Landroid/telephony/PhoneStateListener;I)V"
            r7 = r3
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01c3 }
        L_0x01c1:
            monitor-exit(r0)
            goto L_0x01c6
        L_0x01c3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x01c6:
            return
        L_0x01c7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.C115376a.run():void");
    }
}
