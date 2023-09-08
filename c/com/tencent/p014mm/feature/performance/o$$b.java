package com.tencent.p014mm.feature.performance;

import android.content.Intent;
import p981ie.C87705i;

/* renamed from: com.tencent.mm.feature.performance.o$$b */
public final /* synthetic */ class o$$b implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ Intent f343915a;

    public /* synthetic */ o$$b(Intent intent) {
        this.f343915a = intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e A[EDGE_INSN: B:29:0x009e->B:21:0x009e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r7) {
        /*
            r6 = this;
            android.content.Intent r0 = r6.f343915a
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature r7 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature) r7
            java.lang.String r1 = "pid"
            r2 = -1
            int r1 = r0.getIntExtra(r1, r2)
            if (r1 != r2) goto L_0x0011
            int r1 = android.os.Process.myPid()
        L_0x0011:
            java.lang.String r3 = "tid"
            int r2 = r0.getIntExtra(r3, r2)
            java.lang.String r3 = "MicroMsg.MatrixShellService"
            if (r2 <= 0) goto L_0x0040
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "#MATRIX_BATTERY_DUMP_THREAD, pid = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ", tid = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            ie.r$d r4 = p981ie.C117178r.m165260c(r1, r2)
            if (r4 == 0) goto L_0x0040
            java.lang.String r4 = r4.f351050a
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x009e
            java.lang.String r4 = "name"
            java.lang.String r4 = r0.getStringExtra(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x009e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "#MATRIX_BATTERY_DUMP_THREAD, name = "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r7.getClass()
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo r0 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.ProcessInfo.m160991a()
            ce.g r7 = r7.f349668a
            ce.f r7 = r7.f339057d
            boolean r7 = r7.f339045p
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r7 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.m160986b(r0, r7)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r7 = r7.f343063h
            java.util.List<ITEM> r7 = r7.f343212a
            java.util.Iterator r7 = r7.iterator()
        L_0x0080:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r7.next()
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r0 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r0
            java.lang.String r3 = r0.f343067c
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r0.f343067c
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x0080
        L_0x009c:
            int r2 = r0.f343066b
        L_0x009e:
            r7 = 1
            if (r2 >= 0) goto L_0x00af
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "Can NOT get thread tid, abort"
            android.widget.Toast r7 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r7)
            r7.show()
            goto L_0x00ce
        L_0x00af:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x00c3
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "Can NOT get thread name, abort"
            android.widget.Toast r7 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r7)
            r7.show()
            goto L_0x00ce
        L_0x00c3:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            im3.C117199a.m165280a(r1, r7)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.feature.performance.o$$b.accept(java.lang.Object):void");
    }
}
