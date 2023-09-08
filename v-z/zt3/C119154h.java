package zt3;

import java.util.concurrent.Executor;

/* renamed from: zt3.h */
public final class C119154h {

    /* renamed from: a */
    public static Executor f356860a;

    /* renamed from: zt3.h$a */
    public interface C91937a {
    }

    /* renamed from: zt3.h$b */
    public interface C119155b {
        /* renamed from: a */
        boolean mo122412a();

        /* renamed from: b */
        boolean mo122413b();

        /* renamed from: c */
        boolean mo122414c();

        /* renamed from: d */
        void mo122415d(Thread thread, String str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: iu3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: iu3.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: iu3.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: iu3.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: iu3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: iu3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: iu3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: iu3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: iu3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: iu3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: iu3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: iu3.f} */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d1, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d2, code lost:
        zt3.C119146d.f356851c.mo125764e("ThreadModuleBoot", r8.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m168040a(android.content.Context r8, zt3.C119154h.C91937a r9) {
        /*
            com.tencent.mm.booter.k0 r9 = (com.tencent.p014mm.booter.C80824k0) r9
            r9.getClass()
            com.tencent.mm.booter.h0 r0 = new com.tencent.mm.booter.h0
            r0.<init>(r9)
            zt3.C119146d.f356851c = r0
            com.tencent.mm.booter.i0 r0 = new com.tencent.mm.booter.i0
            r0.<init>(r9)
            zt3.C119146d.f356850b = r0
            com.tencent.mm.booter.j0 r0 = new com.tencent.mm.booter.j0
            r0.<init>(r9)
            zt3.C119146d.f356849a = r0
            zt3.a$b r9 = new zt3.a$b
            r9.<init>()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x002c
            com.tencent.mm.booter.k0$a r0 = com.tencent.p014mm.booter.C80824k0.C80825a.MAIN_PROCESS
            zt3.a r9 = r0.mo112575a(r9)
            goto L_0x003f
        L_0x002c:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r0 == 0) goto L_0x0039
            com.tencent.mm.booter.k0$a r0 = com.tencent.p014mm.booter.C80824k0.C80825a.TOOL_PROCESS
            zt3.a r9 = r0.mo112575a(r9)
            goto L_0x003f
        L_0x0039:
            com.tencent.mm.booter.k0$a r0 = com.tencent.p014mm.booter.C80824k0.C80825a.OTHER
            zt3.a r9 = r0.mo112575a(r9)
        L_0x003f:
            du3.a r0 = new du3.a
            r0.<init>(r8, r9)
            eu3.C86698f.f251708a = r0
            int r8 = r9.f356822a
            r0 = 2
            int r8 = r8 / r0
            r1 = 1
            int r6 = java.lang.Math.max(r1, r8)
            int r8 = r6 / 3
            int r7 = java.lang.Math.max(r1, r8)
            iu3.h$a r8 = r9.f356826e
            int r8 = r8.ordinal()
            if (r8 == 0) goto L_0x008c
            if (r8 == r1) goto L_0x0081
            if (r8 == r0) goto L_0x0079
            r0 = 3
            if (r8 == r0) goto L_0x0073
            r0 = 4
            if (r8 == r0) goto L_0x006d
            iu3.d r8 = new iu3.d
            r8.<init>()
            goto L_0x0091
        L_0x006d:
            iu3.a r8 = new iu3.a
            r8.<init>(r7, r7)
            goto L_0x0091
        L_0x0073:
            iu3.i r8 = new iu3.i
            r8.<init>(r6)
            goto L_0x0091
        L_0x0079:
            iu3.c r8 = new iu3.c
            r0 = 1000(0x3e8, double:4.94E-321)
            r8.<init>(r0, r6, r7)
            goto L_0x0091
        L_0x0081:
            iu3.f r8 = new iu3.f
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 1140457472(0x43fa0000, float:500.0)
            r2 = r8
            r2.<init>(r3, r5, r6, r7)
            goto L_0x0091
        L_0x008c:
            iu3.e r8 = new iu3.e
            r8.<init>(r6, r7)
        L_0x0091:
            iu3.C117279h.f351135a = r8
            java.lang.Class<zt3.j> r8 = zt3.C119157j.class
            monitor-enter(r8)
            zt3.j r0 = new zt3.j     // Catch:{ all -> 0x011b }
            r0.<init>(r9)     // Catch:{ all -> 0x011b }
            zt3.C119157j.f356862d = r0     // Catch:{ all -> 0x011b }
            zt3.C119157j.f356863e = r0     // Catch:{ all -> 0x011b }
            monitor-exit(r8)
            boolean r8 = r9.f356827f
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L_0x00df
            java.lang.String r8 = "THREAD_POOL_EXECUTOR"
            java.lang.Class<android.os.AsyncTask> r2 = android.os.AsyncTask.class
            ou3.a r3 = new ou3.a     // Catch:{ Exception -> 0x00d1 }
            r3.<init>(r2, r8)     // Catch:{ Exception -> 0x00d1 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x00d1 }
            java.lang.Object r2 = r3.mo123639a(r1)     // Catch:{ all -> 0x00ce }
            monitor-exit(r3)     // Catch:{ Exception -> 0x00d1 }
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch:{ Exception -> 0x00d1 }
            f356860a = r2     // Catch:{ Exception -> 0x00d1 }
            java.lang.Class<android.os.AsyncTask> r2 = android.os.AsyncTask.class
            zt3.g r3 = new zt3.g     // Catch:{ Exception -> 0x00d1 }
            r3.<init>()     // Catch:{ Exception -> 0x00d1 }
            ou3.a r4 = new ou3.a     // Catch:{ Exception -> 0x00d1 }
            r4.<init>(r2, r8)     // Catch:{ Exception -> 0x00d1 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x00d1 }
            r4.mo123641c(r0, r3, r1)     // Catch:{ all -> 0x00cb }
            monitor-exit(r4)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00df
        L_0x00cb:
            r8 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x00d1 }
            throw r8     // Catch:{ Exception -> 0x00d1 }
        L_0x00ce:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x00d1 }
            throw r8     // Catch:{ Exception -> 0x00d1 }
        L_0x00d1:
            r8 = move-exception
            zt3.d$b r2 = zt3.C119146d.f356851c
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "ThreadModuleBoot"
            r2.mo125764e(r4, r8, r3)
        L_0x00df:
            boolean r8 = r9.f356828g
            if (r8 == 0) goto L_0x010d
            java.lang.Class<com.tencent.threadpool.coroutines.hook.CoroutineDispatchersHookInitializer> r8 = com.tencent.threadpool.coroutines.hook.CoroutineDispatchersHookInitializer.class
            com.tencent.threadpool.coroutines.hook.CoroutineDispatchersHookInitializer r9 = com.tencent.threadpool.coroutines.hook.CoroutineDispatchersHookInitializer.INSTANCE     // Catch:{ ClassNotFoundException -> 0x0105, NoSuchMethodException -> 0x00fd, Exception -> 0x00f5 }
            java.lang.String r9 = "setup"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0105, NoSuchMethodException -> 0x00fd, Exception -> 0x00f5 }
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r9, r2)     // Catch:{ ClassNotFoundException -> 0x0105, NoSuchMethodException -> 0x00fd, Exception -> 0x00f5 }
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0105, NoSuchMethodException -> 0x00fd, Exception -> 0x00f5 }
            r8.invoke(r0, r9)     // Catch:{ ClassNotFoundException -> 0x0105, NoSuchMethodException -> 0x00fd, Exception -> 0x00f5 }
            goto L_0x010d
        L_0x00f5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "ThreadPool internal error. Cannot call method setup in coroutines dispatchers hook initializer."
            r8.<init>(r9)
            throw r8
        L_0x00fd:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "ThreadPool internal error. Cannot find method setup in coroutines dispatchers hook initializer."
            r8.<init>(r9)
            throw r8
        L_0x0105:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Cannot enable hook coroutines dispatchers without depending threadpool-coroutines."
            r8.<init>(r9)
            throw r8
        L_0x010d:
            java.lang.String r8 = "MicroMsg.ThreadBootDelegate"
            java.lang.String r9 = "onBootDone: setup stub"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            nu3.d r8 = nu3.C11276d.INSTANCE
            nu3.a r9 = nu3.C117640b.f351893a
            nu3.C117640b.f351893a = r8
            return
        L_0x011b:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zt3.C119154h.m168040a(android.content.Context, zt3.h$a):void");
    }
}
