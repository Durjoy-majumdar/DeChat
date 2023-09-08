package com.tencent.matrix.lifecycle;

/* renamed from: com.tencent.matrix.lifecycle.z */
public final class C80504z {

    /* renamed from: a */
    public static volatile boolean f235502a;

    /* renamed from: b */
    public static final C80505a f235503b = new C80505a();

    /* renamed from: com.tencent.matrix.lifecycle.z$a */
    public static final class C80505a {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m98067a(android.app.Application r9, com.tencent.matrix.lifecycle.C80414k r10) {
        /*
            com.tencent.matrix.lifecycle.z$a r0 = f235503b
            r0.getClass()
            java.lang.String r0 = ""
            java.lang.String r1 = "Matrix.ProcessLifecycleOwnerInit"
            java.lang.String r2 = "app"
            gy3.C87412m.m108594g(r9, r2)
            java.lang.String r2 = "config"
            gy3.C87412m.m108594g(r10, r2)
            boolean r3 = f235502a
            if (r3 == 0) goto L_0x0019
            goto L_0x018f
        L_0x0019:
            r3 = 1
            f235502a = r3
            r4 = 0
            r5 = 0
            java.lang.String r6 = "android.app.ActivityThread"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = "currentActivityThread"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x0051 }
            java.lang.reflect.Method r7 = r6.getMethod(r7, r8)     // Catch:{ all -> 0x0051 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0051 }
            java.lang.Object r7 = r7.invoke(r4, r8)     // Catch:{ all -> 0x0051 }
            java.lang.String r8 = "mActivities"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r8)     // Catch:{ all -> 0x0051 }
            java.lang.String r8 = "fieldMActivities"
            gy3.C87412m.m108593f(r6, r8)     // Catch:{ all -> 0x0051 }
            r6.setAccessible(r3)     // Catch:{ all -> 0x0051 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0051 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x0051 }
            if (r6 == 0) goto L_0x0057
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0051 }
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0057
            r6 = 1
            goto L_0x0058
        L_0x0051:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            p723vf.C118672d.m167354d(r1, r6, r0, r7)
        L_0x0057:
            r6 = 0
        L_0x0058:
            if (r6 == 0) goto L_0x0063
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r10 = "Matrix Warning: Matrix might be inited after launching first Activity, which would disable some features like ProcessLifecycleOwner, pls consider calling MultiProcessLifecycleInitializer#init manually or initializing matrix at Application#onCreate"
            p723vf.C118672d.m167352b(r1, r10, r9)
            goto L_0x018f
        L_0x0063:
            com.tencent.matrix.lifecycle.j r1 = com.tencent.matrix.lifecycle.C80392a0.f235321a
            com.tencent.matrix.lifecycle.j r1 = r10.f235355d
            gy3.C87412m.m108594g(r1, r2)
            com.tencent.matrix.lifecycle.C80392a0.f235321a = r1
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner r1 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235399x
            r1.getClass()
            java.lang.String r1 = "Matrix.ProcessLifecycle"
            java.lang.String r2 = "activity"
            java.lang.Object r2 = r9.getSystemService(r2)
            if (r2 == 0) goto L_0x0190
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235378c = r2
            java.lang.String r2 = p723vf.C90779e.m113846a(r9)
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235376a = r2
            java.lang.String r2 = p723vf.C90779e.f260690b
            if (r2 == 0) goto L_0x008a
            goto L_0x0090
        L_0x008a:
            java.lang.String r2 = r9.getPackageName()
            p723vf.C90779e.f260690b = r2
        L_0x0090:
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235377b = r2
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ all -> 0x00a2 }
            java.lang.String r6 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235377b     // Catch:{ all -> 0x00a2 }
            gy3.C87412m.m108591d(r6)     // Catch:{ all -> 0x00a2 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r6, r3)     // Catch:{ all -> 0x00a2 }
            android.content.pm.ActivityInfo[] r4 = r2.activities     // Catch:{ all -> 0x00a2 }
            goto L_0x00a8
        L_0x00a2:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            p723vf.C118672d.m167354d(r1, r2, r0, r3)
        L_0x00a8:
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235379d = r4
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner r0 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235390o
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$a r2 = new com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$a
            r2.<init>()
            r0.observeForever(r2)
            com.tencent.matrix.lifecycle.owners.i r0 = new com.tencent.matrix.lifecycle.owners.i
            r0.<init>()
            r9.registerActivityLifecycleCallbacks(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "init for ["
            r0.append(r2)
            java.lang.String r2 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235376a
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            p723vf.C118672d.m167353c(r1, r0, r2)
            com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner r0 = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE
            boolean r1 = r10.f235353b
            r0.init(r9, r1)
            com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner r1 = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE
            boolean r2 = r10.f235354c
            r1.init$matrix_android_lib_release(r2)
            com.tencent.matrix.lifecycle.l r2 = com.tencent.matrix.lifecycle.C80415l.f235359c
            boolean r10 = r10.f235356e
            com.tencent.matrix.lifecycle.C80415l.f235357a = r9
            if (r10 != 0) goto L_0x00fc
            java.lang.String r9 = r2.mo111904a()
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.String r0 = "logger disabled"
            p723vf.C118672d.m167353c(r9, r0, r10)
            goto L_0x018f
        L_0x00fc:
            com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner r9 = com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE
            com.tencent.matrix.lifecycle.q r10 = new com.tencent.matrix.lifecycle.q
            r10.<init>()
            r9.observeForever(r10)
            com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner r9 = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE
            com.tencent.matrix.lifecycle.r r10 = new com.tencent.matrix.lifecycle.r
            r10.<init>()
            r9.observeForever(r10)
            com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner r9 = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE
            com.tencent.matrix.lifecycle.s r10 = new com.tencent.matrix.lifecycle.s
            r10.<init>()
            r9.observeForever(r10)
            com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner r9 = com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.INSTANCE
            com.tencent.matrix.lifecycle.t r10 = new com.tencent.matrix.lifecycle.t
            r10.<init>()
            r9.observeForever(r10)
            com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner r9 = com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE
            com.tencent.matrix.lifecycle.u r10 = new com.tencent.matrix.lifecycle.u
            r10.<init>()
            r9.observeForever(r10)
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner r9 = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE
            com.tencent.matrix.lifecycle.v r10 = new com.tencent.matrix.lifecycle.v
            r10.<init>()
            r9.observeForever(r10)
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner r9 = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE
            com.tencent.matrix.lifecycle.w r10 = new com.tencent.matrix.lifecycle.w
            r10.<init>()
            r9.observeForever(r10)
            com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner r9 = com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner.INSTANCE
            com.tencent.matrix.lifecycle.x r10 = new com.tencent.matrix.lifecycle.x
            r10.<init>()
            r9.observeForever(r10)
            com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner r9 = com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE
            com.tencent.matrix.lifecycle.y r10 = new com.tencent.matrix.lifecycle.y
            r10.<init>()
            r9.observeForever(r10)
            com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor r9 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235421k
            com.tencent.matrix.lifecycle.m r10 = com.tencent.matrix.lifecycle.C80417m.f235361d
            r9.getClass()
            java.lang.String r2 = "listener"
            gy3.C87412m.m108594g(r10, r2)
            com.tencent.matrix.lifecycle.supervisor.c r3 = r9.f235422a
            com.tencent.matrix.lifecycle.supervisor.h$e r3 = (com.tencent.matrix.lifecycle.supervisor.C80481h.C80488e) r3
            r3.getClass()
            java.util.ArrayList<fy3.q<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean>> r3 = com.tencent.matrix.lifecycle.supervisor.C80481h.f235477c
            r3.add(r10)
            com.tencent.matrix.lifecycle.n r10 = com.tencent.matrix.lifecycle.C80418n.f235362d
            gy3.C87412m.m108594g(r10, r2)
            com.tencent.matrix.lifecycle.supervisor.c r9 = r9.f235422a
            com.tencent.matrix.lifecycle.supervisor.h$e r9 = (com.tencent.matrix.lifecycle.supervisor.C80481h.C80488e) r9
            r9.getClass()
            java.util.ArrayList<fy3.r<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, rx3.b0>> r9 = com.tencent.matrix.lifecycle.supervisor.C80481h.f235478d
            r9.add(r10)
            com.tencent.matrix.lifecycle.o r9 = new com.tencent.matrix.lifecycle.o
            r9.<init>()
            r0.observeForever(r9)
            com.tencent.matrix.lifecycle.p r9 = new com.tencent.matrix.lifecycle.p
            r9.<init>()
            r1.observeForever(r9)
        L_0x018f:
            return
        L_0x0190:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type android.app.ActivityManager"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.C80504z.m98067a(android.app.Application, com.tencent.matrix.lifecycle.k):void");
    }
}
