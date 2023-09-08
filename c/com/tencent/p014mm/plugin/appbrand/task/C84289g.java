package com.tencent.p014mm.plugin.appbrand.task;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.task.g */
public final class C84289g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32227p<Integer, Integer, C13598b0> f246164d;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.g$a */
    public static final class C84290a extends C87413o implements C32226l<C84310k, String> {

        /* renamed from: d */
        public static final C84290a f246165d = new C84290a();

        public C84290a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C84310k kVar = (C84310k) obj;
            C87412m.m108594g(kVar, "p");
            return kVar.mo111363h();
        }
    }

    public C84289g(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f246164d = pVar;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r0 != 0) goto L_0x0019
            fy3.p<java.lang.Integer, java.lang.Integer, rx3.b0> r0 = r11.f246164d
            r0.invoke(r3, r3)
            return
        L_0x0019:
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 != 0) goto L_0x0025
            fy3.p<java.lang.Integer, java.lang.Integer, rx3.b0> r0 = r11.f246164d
            r0.invoke(r3, r3)
            return
        L_0x0025:
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r4 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r4 = r4.mo116962a()
            java.util.List r4 = r4.mo111395j()
            y04.h r4 = sx3.C110818d0.m150897A(r4)
            com.tencent.mm.plugin.appbrand.task.g$a r5 = com.tencent.p014mm.plugin.appbrand.task.C84289g.C84290a.f246165d
            y04.h r4 = y04.C112354s.m153290m(r4, r5)
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            y04.C112354s.m153295r(r4, r5)
            java.util.Set r4 = sx3.C110826x0.m151016d(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x004e:
            boolean r6 = r4.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x0086
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.Iterator r8 = r0.iterator()
        L_0x005f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0075
            java.lang.Object r9 = r8.next()
            r10 = r9
            android.app.ActivityManager$RunningAppProcessInfo r10 = (android.app.ActivityManager.RunningAppProcessInfo) r10
            java.lang.String r10 = r10.processName
            boolean r10 = gy3.C87412m.m108589b(r10, r6)
            if (r10 == 0) goto L_0x005f
            goto L_0x0076
        L_0x0075:
            r9 = r7
        L_0x0076:
            android.app.ActivityManager$RunningAppProcessInfo r9 = (android.app.ActivityManager.RunningAppProcessInfo) r9
            if (r9 == 0) goto L_0x0080
            int r6 = r9.pid
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
        L_0x0080:
            if (r7 == 0) goto L_0x004e
            r5.add(r7)
            goto L_0x004e
        L_0x0086:
            java.util.List<fy3.p<java.lang.Integer, java.lang.Integer, rx3.b0>> r0 = com.tencent.p014mm.plugin.appbrand.task.C84281e.f246150a
            int[] r0 = sx3.C110818d0.m150952x0(r5)
            int r4 = r0.length
            r5 = 1
            if (r4 != 0) goto L_0x0092
            r4 = 1
            goto L_0x0093
        L_0x0092:
            r4 = 0
        L_0x0093:
            if (r4 == 0) goto L_0x009b
            rx3.l r0 = new rx3.l
            r0.<init>(r3, r3)
            goto L_0x0101
        L_0x009b:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object r1 = r4.getSystemService(r1)
            boolean r4 = r1 instanceof android.app.ActivityManager
            if (r4 == 0) goto L_0x00aa
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            goto L_0x00ab
        L_0x00aa:
            r1 = r7
        L_0x00ab:
            if (r1 == 0) goto L_0x00b1
            android.os.Debug$MemoryInfo[] r7 = r1.getProcessMemoryInfo(r0)
        L_0x00b1:
            if (r7 == 0) goto L_0x00fc
            int r0 = r7.length
            if (r0 != 0) goto L_0x00b8
            r0 = 1
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x00fc
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r3 = 0
        L_0x00c4:
            if (r3 >= r1) goto L_0x00da
            r4 = r7[r3]
            if (r4 == 0) goto L_0x00cf
            int r4 = r4.getTotalPss()
            goto L_0x00d0
        L_0x00cf:
            r4 = 0
        L_0x00d0:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x00c4
        L_0x00da:
            rx3.l r1 = new rx3.l
            int r3 = sx3.C110818d0.m150945q0(r0)
            int r3 = r3 / 1024
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Comparable r0 = sx3.C110818d0.m150927Y(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x00f2
            int r2 = r0.intValue()
        L_0x00f2:
            int r2 = r2 / 1024
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.<init>(r3, r0)
            goto L_0x0102
        L_0x00fc:
            rx3.l r0 = new rx3.l
            r0.<init>(r3, r3)
        L_0x0101:
            r1 = r0
        L_0x0102:
            fy3.p<java.lang.Integer, java.lang.Integer, rx3.b0> r0 = r11.f246164d
            A r2 = r1.f38555d
            B r1 = r1.f38556e
            r0.invoke(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.task.C84289g.run():void");
    }
}
