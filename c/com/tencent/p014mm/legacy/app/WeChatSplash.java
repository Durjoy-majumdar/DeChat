package com.tencent.p014mm.legacy.app;

import j40.C87829b;

/* renamed from: com.tencent.mm.legacy.app.WeChatSplash */
public class WeChatSplash {

    /* renamed from: a */
    public static C87829b f237800a;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public static void m98819a() {
        /*
            java.lang.String r0 = "WeChatSplash.applicationOnCreate"
            bp3.C79760s.m96908a(r0)
            java.lang.String r0 = "MicroMsg.SplashInit"
            java.lang.String r1 = "applicationOnCreate"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.splash.C85781g.m105955c(r0, r1, r3)
            java.lang.String r0 = "WxSplash.Splash"
            boolean r1 = com.tencent.p014mm.splash.C85781g.f249833k
            r3 = 1
            if (r1 == 0) goto L_0x006d
            java.lang.reflect.Field r1 = com.tencent.p014mm.splash.C85786k.f249858f     // Catch:{ Exception -> 0x0067 }
            android.os.Handler r4 = com.tencent.p014mm.splash.C85786k.f249854b     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x0067 }
            android.os.Handler$Callback r1 = (android.os.Handler.Callback) r1     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "double check, callback %s %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0067 }
            com.tencent.mm.splash.i r6 = com.tencent.p014mm.splash.C85786k.f249857e     // Catch:{ Exception -> 0x0067 }
            if (r1 != r6) goto L_0x002b
            r6 = 1
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x0067 }
            r5[r2] = r6     // Catch:{ Exception -> 0x0067 }
            r5[r3] = r1     // Catch:{ Exception -> 0x0067 }
            com.tencent.p014mm.splash.C85781g.m105955c(r0, r4, r5)     // Catch:{ Exception -> 0x0067 }
            com.tencent.mm.splash.i r4 = com.tencent.p014mm.splash.C85786k.f249857e     // Catch:{ Exception -> 0x0067 }
            if (r1 != r4) goto L_0x003c
            goto L_0x006d
        L_0x003c:
            java.lang.String r4 = "double check found problem!"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0067 }
            com.tencent.p014mm.splash.C85781g.m105955c(r0, r4, r2)     // Catch:{ Exception -> 0x0067 }
            java.lang.reflect.Field r0 = com.tencent.p014mm.splash.C85786k.f249858f     // Catch:{ Exception -> 0x0067 }
            com.tencent.mm.splash.i r2 = com.tencent.p014mm.splash.C85786k.f249857e     // Catch:{ Exception -> 0x0067 }
            r2.f249850f = r1     // Catch:{ Exception -> 0x0067 }
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x0067 }
            android.os.Handler r1 = com.tencent.p014mm.splash.C85786k.f249854b     // Catch:{ Exception -> 0x0067 }
            com.tencent.mm.splash.i r2 = com.tencent.p014mm.splash.C85786k.f249857e     // Catch:{ Exception -> 0x0067 }
            r0.set(r1, r2)     // Catch:{ Exception -> 0x0067 }
            com.tencent.mm.splash.n r4 = com.tencent.p014mm.splash.C85781g.f249840r     // Catch:{ Exception -> 0x0067 }
            r5 = 675(0x2a3, double:3.335E-321)
            r7 = 31
            r9 = 1
            r4.mo119635a(r5, r7, r9)     // Catch:{ Exception -> 0x0067 }
            android.os.Handler r0 = com.tencent.p014mm.splash.C85786k.f249854b     // Catch:{ Exception -> 0x0067 }
            r1 = 987654321(0x3ade68b1, float:0.0016968456)
            r0.sendEmptyMessage(r1)     // Catch:{ Exception -> 0x0067 }
            goto L_0x006d
        L_0x0067:
            r0 = move-exception
            java.lang.String r1 = "double check exception."
            com.tencent.p014mm.splash.C85781g.m105956d(r0, r1)
        L_0x006d:
            com.tencent.p014mm.splash.C85788m.f249864c = r3
            boolean r0 = com.tencent.p014mm.splash.C85788m.f249862a
            if (r0 == 0) goto L_0x007c
            com.tencent.mm.splash.m$a r0 = com.tencent.p014mm.splash.C85788m.f249863b
            com.tencent.mm.legacy.app.WeChatSplashStartup r0 = (com.tencent.p014mm.legacy.app.WeChatSplashStartup) r0
            r1 = 0
            r0.mo112728a(r1)
            goto L_0x00b7
        L_0x007c:
            java.lang.Class<com.tencent.mm.splash.g> r0 = com.tencent.p014mm.splash.C85781g.class
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x00be }
            boolean r1 = com.tencent.p014mm.splash.C85781g.f249835m     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0087
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)
            goto L_0x00b7
        L_0x0087:
            com.tencent.p014mm.splash.C85781g.f249835m = r3     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            com.tencent.mm.splash.o r1 = com.tencent.p014mm.splash.C85781g.f249834l     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x0092
            com.tencent.p014mm.splash.C85781g.m105953a()     // Catch:{ all -> 0x00be }
            goto L_0x00b6
        L_0x0092:
            com.tencent.mm.splash.h r2 = new com.tencent.mm.splash.h     // Catch:{ all -> 0x00be }
            r2.<init>()     // Catch:{ all -> 0x00be }
            com.tencent.mm.splash.l r1 = (com.tencent.p014mm.splash.C85787l) r1     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "MicroMsg.SplashInit"
            java.lang.String r4 = "do one more thing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ all -> 0x00be }
            com.tencent.p014mm.splash.C85788m.f249865d = r2     // Catch:{ all -> 0x00be }
            com.tencent.mm.splash.m$a r1 = r1.f249861a     // Catch:{ all -> 0x00be }
            com.tencent.p014mm.splash.C85788m.m105964a(r1)     // Catch:{ all -> 0x00be }
            boolean r1 = com.tencent.p014mm.splash.C85788m.f249864c     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00b6
            com.tencent.mm.splash.o$a r1 = com.tencent.p014mm.splash.C85788m.f249865d     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00b6
            com.tencent.mm.splash.m$a r2 = com.tencent.p014mm.splash.C85788m.f249863b     // Catch:{ all -> 0x00be }
            com.tencent.mm.legacy.app.WeChatSplashStartup r2 = (com.tencent.p014mm.legacy.app.WeChatSplashStartup) r2     // Catch:{ all -> 0x00be }
            r2.mo112728a(r1)     // Catch:{ all -> 0x00be }
        L_0x00b6:
            monitor-exit(r0)
        L_0x00b7:
            bp3.C79760s.m96909b()
            return
        L_0x00bb:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.legacy.app.WeChatSplash.m98819a():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018f A[Catch:{ Exception -> 0x0213 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b6 A[Catch:{ Exception -> 0x0213 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0271 A[Catch:{ IOException -> 0x02d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0279 A[Catch:{ IOException -> 0x02d0 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m98820b(j40.C87829b r21, com.tencent.p014mm.splash.C85788m.C85789a r22) {
        /*
            r0 = r21
            r1 = r22
            f237800a = r0
            com.tencent.mm.legacy.app.m r2 = new com.tencent.mm.legacy.app.m
            r2.<init>()
            com.tencent.p014mm.splash.C85781g.f249836n = r2
            com.tencent.mm.legacy.app.n r2 = new com.tencent.mm.legacy.app.n
            r2.<init>()
            com.tencent.p014mm.splash.C85781g.f249829g = r2
            if (r1 != 0) goto L_0x001f
            java.lang.String r0 = "WxSplash.WeChatSplash"
            java.lang.String r1 = "splash callback class is null, return."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x001f:
            com.tencent.tinker.entry.ApplicationLike r2 = r0.f254267f
            long r2 = r2.getApplicationStartMillisTime()
            com.tencent.tinker.entry.ApplicationLike r4 = r0.f254267f
            long r4 = r4.getApplicationStartElapsedTime()
            p787ai.C79546a.f233252x = r2
            p787ai.C79546a.f233253y = r4
            p787ai.C79546a.f233254z = r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getLaunchName()
            com.tencent.p014mm.splash.C85781g.f249826d = r2
            java.lang.Class<com.tencent.mm.app.WeChatSplashActivity> r2 = com.tencent.p014mm.app.WeChatSplashActivity.class
            com.tencent.p014mm.splash.C85781g.f249837o = r2
            java.lang.Class<com.tencent.mm.app.WeChatSplashFallbackActivity> r2 = com.tencent.p014mm.app.WeChatSplashFallbackActivity.class
            com.tencent.p014mm.splash.C85781g.f249839q = r2
            android.app.Application r2 = r0.f124990c
            boolean r2 = tc1.C90389a.m113188b(r2)
            if (r2 != 0) goto L_0x004e
            java.lang.String r2 = "com.google.firebase.provider.FirebaseInitProvider"
            java.util.HashSet<java.lang.String> r3 = com.tencent.p014mm.splash.C85781g.f249841s
            r3.add(r2)
        L_0x004e:
            android.app.Application r2 = r0.f124990c
            java.lang.String r0 = r0.f124988a
            com.tencent.p014mm.splash.C85788m.f249866e = r2
            com.tencent.p014mm.splash.C85788m.f249867f = r0
            com.tencent.mm.splash.l r3 = new com.tencent.mm.splash.l
            r3.<init>(r1)
            com.tencent.p014mm.splash.C85781g.f249834l = r3
            com.tencent.mm.splash.n r3 = com.tencent.p014mm.splash.C85781g.f249840r
            r3.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            r3.f249870c = r4
            java.lang.String r3 = r2.getPackageName()
            boolean r3 = r3.equals(r0)
            r12 = 0
            r13 = 1
            if (r3 != 0) goto L_0x0081
            java.lang.String r3 = "MicroMsg.SplashInit"
            java.lang.String r4 = "not main process(%s), no hack, do fallback."
            java.lang.Object[] r5 = new java.lang.Object[r13]
            r5[r12] = r0
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r4, r5)
            goto L_0x02e0
        L_0x0081:
            java.lang.Class<com.tencent.mm.splash.g> r3 = com.tencent.p014mm.splash.C85781g.class
            monitor-enter(r3)
            boolean r0 = com.tencent.p014mm.splash.C85781g.f249833k     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "WxSplash.Splash"
            java.lang.String r4 = "Splash has hacked before."
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x030b }
            com.tencent.p014mm.splash.C85781g.m105955c(r0, r4, r5)     // Catch:{ all -> 0x030b }
            monitor-exit(r3)
            goto L_0x0209
        L_0x0094:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x030b }
            com.tencent.p014mm.splash.C85781g.f249825c = r2     // Catch:{ all -> 0x030b }
            com.tencent.mm.splash.n r14 = com.tencent.p014mm.splash.C85781g.f249840r     // Catch:{ all -> 0x030b }
            r15 = 675(0x2a3, double:3.335E-321)
            r17 = 4
            r19 = 1
            r14.mo119635a(r15, r17, r19)     // Catch:{ all -> 0x030b }
            com.tencent.p014mm.splash.C85781g.m105961i()     // Catch:{ Exception -> 0x0213 }
            java.lang.Object r0 = com.tencent.p014mm.splash.C85781g.m105958f(r2)     // Catch:{ Exception -> 0x0213 }
            java.lang.Class r6 = r0.getClass()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r7 = "mInstrumentation"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ Exception -> 0x0213 }
            r6.setAccessible(r13)     // Catch:{ Exception -> 0x0213 }
            java.lang.Object r7 = r6.get(r0)     // Catch:{ Exception -> 0x0213 }
            android.app.Instrumentation r7 = (android.app.Instrumentation) r7     // Catch:{ Exception -> 0x0213 }
            boolean r8 = com.tencent.p014mm.splash.C85781g.m105954b(r7)     // Catch:{ Exception -> 0x0213 }
            if (r8 == 0) goto L_0x00c8
            monitor-exit(r3)
            goto L_0x021b
        L_0x00c8:
            com.tencent.p014mm.splash.C85781g.m105962j(r7)     // Catch:{ Exception -> 0x0213 }
            boolean r8 = r7 instanceof com.tencent.p014mm.splash.C85785j     // Catch:{ Exception -> 0x0213 }
            if (r8 != 0) goto L_0x00d8
            com.tencent.mm.splash.j r8 = new com.tencent.mm.splash.j     // Catch:{ Exception -> 0x0213 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0213 }
            r6.set(r0, r8)     // Catch:{ Exception -> 0x0213 }
            goto L_0x00e1
        L_0x00d8:
            java.lang.String r6 = "WxSplash.Splash"
            java.lang.String r7 = "instrumentation is splash hacked, why? failed before?"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0213 }
            com.tencent.p014mm.splash.C85781g.m105955c(r6, r7, r8)     // Catch:{ Exception -> 0x0213 }
        L_0x00e1:
            com.tencent.p014mm.splash.C85786k.f249853a = r0     // Catch:{ Exception -> 0x0213 }
            java.lang.Class r6 = r0.getClass()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r7 = "mH"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ Exception -> 0x0213 }
            r6.setAccessible(r13)     // Catch:{ Exception -> 0x0213 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x0213 }
            android.os.Handler r6 = (android.os.Handler) r6     // Catch:{ Exception -> 0x0213 }
            if (r6 == 0) goto L_0x020b
            com.tencent.p014mm.splash.C85786k.f249854b = r6     // Catch:{ Exception -> 0x0213 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            java.lang.String r8 = "mCallback"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ Exception -> 0x0213 }
            r7.setAccessible(r13)     // Catch:{ Exception -> 0x0213 }
            java.lang.Object r8 = r7.get(r6)     // Catch:{ Exception -> 0x0213 }
            android.os.Handler$Callback r8 = (android.os.Handler.Callback) r8     // Catch:{ Exception -> 0x0213 }
            com.tencent.p014mm.splash.C85786k.f249858f = r7     // Catch:{ Exception -> 0x0213 }
            if (r8 == 0) goto L_0x0125
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0213 }
            r9[r12] = r8     // Catch:{ Exception -> 0x0213 }
            java.lang.String r10 = "WxSplash.Splash"
            java.lang.String r11 = "Handler.Callback original is not null, maybe hacked by others. orig: %s"
            com.tencent.p014mm.splash.C85781g.m105955c(r10, r11, r9)     // Catch:{ Exception -> 0x0213 }
            com.tencent.mm.splash.n r14 = com.tencent.p014mm.splash.C85781g.f249840r     // Catch:{ Exception -> 0x0213 }
            r15 = 675(0x2a3, double:3.335E-321)
            r17 = 8
            r19 = 1
            r14.mo119635a(r15, r17, r19)     // Catch:{ Exception -> 0x0213 }
        L_0x0125:
            if (r8 == 0) goto L_0x0136
            boolean r9 = r8 instanceof com.tencent.p014mm.splash.C85784i     // Catch:{ Exception -> 0x0213 }
            if (r9 != 0) goto L_0x012c
            goto L_0x0136
        L_0x012c:
            java.lang.String r6 = "WxSplash.Splash"
            java.lang.String r7 = "callback is splash hacked, why? failed before?"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0213 }
            com.tencent.p014mm.splash.C85781g.m105955c(r6, r7, r8)     // Catch:{ Exception -> 0x0213 }
            goto L_0x0143
        L_0x0136:
            com.tencent.mm.splash.i r9 = new com.tencent.mm.splash.i     // Catch:{ Exception -> 0x0213 }
            r9.<init>(r2, r0, r8)     // Catch:{ Exception -> 0x0213 }
            r7.setAccessible(r13)     // Catch:{ Exception -> 0x0213 }
            r7.set(r6, r9)     // Catch:{ Exception -> 0x0213 }
            com.tencent.p014mm.splash.C85786k.f249857e = r9     // Catch:{ Exception -> 0x0213 }
        L_0x0143:
            com.tencent.p014mm.splash.C85781g.m105957e()     // Catch:{ Exception -> 0x0213 }
            java.util.HashSet<java.lang.String> r6 = com.tencent.p014mm.splash.C85781g.f249841s     // Catch:{ Exception -> 0x0213 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x0213 }
            if (r6 > 0) goto L_0x0152
            boolean r6 = com.tencent.p014mm.splash.C44650f.f121058a     // Catch:{ Exception -> 0x0213 }
            if (r6 != 0) goto L_0x01e0
        L_0x0152:
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0213 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r12] = r7     // Catch:{ Exception -> 0x0213 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r6[r13] = r7     // Catch:{ Exception -> 0x0213 }
            java.lang.Class r7 = r0.getClass()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r8 = "installContentProviders"
            java.lang.reflect.Method r6 = r7.getDeclaredMethod(r8, r6)     // Catch:{ Exception -> 0x0213 }
            r6.setAccessible(r13)     // Catch:{ Exception -> 0x0213 }
            java.lang.Class r6 = r0.getClass()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r7 = "mBoundApplication"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ Exception -> 0x0213 }
            r6.setAccessible(r13)     // Catch:{ Exception -> 0x0213 }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ Exception -> 0x0213 }
            com.tencent.p014mm.splash.C85786k.f249855c = r0     // Catch:{ Exception -> 0x0213 }
            java.lang.Class r6 = r0.getClass()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r7 = "restrictedBackupMode"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ Exception -> 0x0213 }
            r6.setAccessible(r13)     // Catch:{ Exception -> 0x0213 }
            boolean r7 = com.tencent.p014mm.splash.C44650f.f121058a     // Catch:{ Exception -> 0x0213 }
            if (r7 != 0) goto L_0x0194
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0213 }
            r6.set(r0, r7)     // Catch:{ Exception -> 0x0213 }
        L_0x0194:
            java.lang.Class r6 = r0.getClass()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r7 = "providers"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ Exception -> 0x0213 }
            r6.setAccessible(r13)     // Catch:{ Exception -> 0x0213 }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ Exception -> 0x0213 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0213 }
            com.tencent.p014mm.splash.C85786k.f249856d = r0     // Catch:{ Exception -> 0x0213 }
            java.util.HashSet<java.lang.String> r0 = com.tencent.p014mm.splash.C85781g.f249841s     // Catch:{ Exception -> 0x0213 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0213 }
        L_0x01b0:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x0213 }
            if (r6 == 0) goto L_0x01e0
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0213 }
            r7 = 0
            java.util.List<android.content.pm.ProviderInfo> r8 = com.tencent.p014mm.splash.C85786k.f249856d     // Catch:{ Exception -> 0x0213 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x0213 }
        L_0x01c3:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x0213 }
            if (r9 == 0) goto L_0x01da
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x0213 }
            android.content.pm.ProviderInfo r9 = (android.content.pm.ProviderInfo) r9     // Catch:{ Exception -> 0x0213 }
            java.lang.String r10 = r9.name     // Catch:{ Exception -> 0x0213 }
            if (r10 == 0) goto L_0x01c3
            boolean r10 = r10.equals(r6)     // Catch:{ Exception -> 0x0213 }
            if (r10 == 0) goto L_0x01c3
            r7 = r9
        L_0x01da:
            java.util.List<android.content.pm.ProviderInfo> r6 = com.tencent.p014mm.splash.C85786k.f249856d     // Catch:{ Exception -> 0x0213 }
            r6.remove(r7)     // Catch:{ Exception -> 0x0213 }
            goto L_0x01b0
        L_0x01e0:
            com.tencent.mm.splash.n r0 = com.tencent.p014mm.splash.C85781g.f249840r     // Catch:{ Exception -> 0x0213 }
            r0.getClass()     // Catch:{ Exception -> 0x0213 }
            com.tencent.p014mm.splash.C85781g.f249833k = r13     // Catch:{ all -> 0x030b }
            com.tencent.p014mm.splash.C85781g.f249831i = r13     // Catch:{ all -> 0x030b }
            java.lang.String r0 = "WxSplash.Splash"
            java.lang.String r6 = "splash hack success."
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch:{ all -> 0x030b }
            com.tencent.p014mm.splash.C85781g.m105955c(r0, r6, r7)     // Catch:{ all -> 0x030b }
            java.lang.String r0 = "WxSplash.Splash"
            java.lang.String r6 = "we need splash. time spent %s"
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ all -> 0x030b }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x030b }
            long r8 = r8 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x030b }
            r7[r12] = r4     // Catch:{ all -> 0x030b }
            com.tencent.p014mm.splash.C85781g.m105955c(r0, r6, r7)     // Catch:{ all -> 0x030b }
            monitor-exit(r3)
        L_0x0209:
            r0 = 1
            goto L_0x021c
        L_0x020b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0213 }
            java.lang.String r4 = "mH is null!"
            r0.<init>(r4)     // Catch:{ Exception -> 0x0213 }
            throw r0     // Catch:{ Exception -> 0x0213 }
        L_0x0213:
            r0 = move-exception
            java.lang.String r4 = "splash hack error!"
            com.tencent.p014mm.splash.C85781g.m105956d(r0, r4)     // Catch:{ all -> 0x030b }
            monitor-exit(r3)
        L_0x021b:
            r0 = 0
        L_0x021c:
            if (r0 != 0) goto L_0x02e1
            com.tencent.mm.splash.n r3 = com.tencent.p014mm.splash.C85781g.f249840r
            r4 = 675(0x2a3, double:3.335E-321)
            r6 = 5
            r8 = 1
            r3.mo119635a(r4, r6, r8)
            android.content.ComponentName r0 = com.tencent.p014mm.sdk.platformtools.Util.getTopActivity(r2)     // Catch:{ IOException -> 0x02d0 }
            java.lang.String r3 = "WxSplash.Splash"
            if (r0 == 0) goto L_0x0257
            java.lang.String r4 = r0.getPackageName()     // Catch:{ IOException -> 0x02d0 }
            java.lang.String r5 = r2.getPackageName()     // Catch:{ IOException -> 0x02d0 }
            boolean r4 = r4.equals(r5)     // Catch:{ IOException -> 0x02d0 }
            if (r4 == 0) goto L_0x0257
            java.lang.String r4 = com.tencent.p014mm.splash.C85781g.f249826d     // Catch:{ IOException -> 0x02d0 }
            if (r4 == 0) goto L_0x0257
            java.lang.String r4 = r0.getClassName()     // Catch:{ IOException -> 0x02d0 }
            java.lang.String r5 = com.tencent.p014mm.splash.C85781g.f249826d     // Catch:{ IOException -> 0x02d0 }
            boolean r4 = r4.equals(r5)     // Catch:{ IOException -> 0x02d0 }
            if (r4 == 0) goto L_0x0257
            java.lang.String r0 = "it is LauncherUI"
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x02d0 }
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r0, r4)     // Catch:{ IOException -> 0x02d0 }
            goto L_0x026c
        L_0x0257:
            if (r0 == 0) goto L_0x026e
            java.lang.String r0 = r0.getPackageName()     // Catch:{ IOException -> 0x02d0 }
            java.lang.String r4 = "com.excelliance"
            boolean r0 = r0.startsWith(r4)     // Catch:{ IOException -> 0x02d0 }
            if (r0 == 0) goto L_0x026e
            java.lang.String r0 = "it is dual open"
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x02d0 }
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r0, r4)     // Catch:{ IOException -> 0x02d0 }
        L_0x026c:
            r0 = 1
            goto L_0x026f
        L_0x026e:
            r0 = 0
        L_0x026f:
            if (r0 != 0) goto L_0x0279
            java.lang.String r0 = "do nothing and return."
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x02d0 }
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r0, r4)     // Catch:{ IOException -> 0x02d0 }
            goto L_0x02d7
        L_0x0279:
            com.tencent.mm.splash.n r5 = com.tencent.p014mm.splash.C85781g.f249840r     // Catch:{ IOException -> 0x02d0 }
            r6 = 675(0x2a3, double:3.335E-321)
            r8 = 36
            r10 = 1
            r5.mo119635a(r6, r8, r10)     // Catch:{ IOException -> 0x02d0 }
            boolean r0 = com.tencent.p014mm.splash.C6706a.m7007a()     // Catch:{ IOException -> 0x02d0 }
            if (r0 == 0) goto L_0x02d7
            android.content.Intent r0 = new android.content.Intent     // Catch:{ IOException -> 0x02d0 }
            java.lang.Class<? extends android.app.Activity> r3 = com.tencent.p014mm.splash.C85781g.f249839q     // Catch:{ IOException -> 0x02d0 }
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x02d0 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r3)     // Catch:{ IOException -> 0x02d0 }
            k20.a r3 = new k20.a     // Catch:{ IOException -> 0x02d0 }
            r3.<init>()     // Catch:{ IOException -> 0x02d0 }
            r3.mo10233c(r0)     // Catch:{ IOException -> 0x02d0 }
            java.lang.Object[] r5 = r3.mo10232b()     // Catch:{ IOException -> 0x02d0 }
            java.lang.String r6 = "com/tencent/mm/splash/Splash"
            java.lang.String r7 = "startFigLeafActivityIfNeed"
            java.lang.String r8 = "(Landroid/content/Context;)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x02d0 }
            java.lang.Object r0 = r3.mo10231a(r12)     // Catch:{ IOException -> 0x02d0 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ IOException -> 0x02d0 }
            r2.startActivity(r0)     // Catch:{ IOException -> 0x02d0 }
            java.lang.String r5 = "com/tencent/mm/splash/Splash"
            java.lang.String r6 = "startFigLeafActivityIfNeed"
            java.lang.String r7 = "(Landroid/content/Context;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r4 = r2
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x02d0 }
            goto L_0x02d7
        L_0x02d0:
            r0 = move-exception
            java.lang.String r3 = "request fig leaf failed."
            com.tencent.p014mm.splash.C85781g.m105956d(r0, r3)
        L_0x02d7:
            java.lang.String r0 = "MicroMsg.SplashInit"
            java.lang.String r3 = "hack failed, do fallback logic."
            java.lang.Object[] r4 = new java.lang.Object[r12]
            com.tencent.p014mm.splash.C85781g.m105955c(r0, r3, r4)
        L_0x02e0:
            r12 = 1
        L_0x02e1:
            com.tencent.p014mm.splash.C85788m.f249862a = r12
            com.tencent.mm.splash.e r0 = com.tencent.p014mm.splash.C85781g.f249829g
            if (r0 == 0) goto L_0x02ea
            p787ai.C79546a.m96581e(r13)
        L_0x02ea:
            if (r12 == 0) goto L_0x0307
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r2 = r2.getAbsolutePath()
            r0.append(r2)
            java.lang.String r2 = "/splash_cache"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.splash.C6706a.f24116a = r0
        L_0x0307:
            com.tencent.p014mm.splash.C85788m.m105964a(r22)
            return
        L_0x030b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.legacy.app.WeChatSplash.m98820b(j40.b, com.tencent.mm.splash.m$a):void");
    }

    public static C87829b profile() {
        return f237800a;
    }
}
