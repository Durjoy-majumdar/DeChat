package com.tencent.p014mm.plugin.appbrand.task;

import android.os.SystemClock;
import b34.C79664a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.p014mm.plugin.appbrand.debugger.C81738h0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.LooperCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import junit.framework.Assert;
import kr0.C88267e;
import kr0.C88273g1;
import lp3.C88629c;
import lp3.C88633e;
import nj0.C34855o;
import nr3.C89059e;
import nr3.C89060f;
import p170ic.C87690d;
import p284zb.C91635f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.task.q */
public class C84331q {

    /* renamed from: a */
    public static final q$$f f246221a = new q$$f();

    /* renamed from: b */
    public static final ConcurrentHashMap<C84343y, HashSet<q$$g>> f246222b;

    /* renamed from: c */
    public static final ConcurrentHashMap<C84343y, Queue<C83928t1>> f246223c;

    /* renamed from: d */
    public static final ConcurrentHashMap<C84343y, Queue<C81925i2>> f246224d;

    /* renamed from: e */
    public static final ConcurrentHashMap<C84343y, AppBrandPreloadProfiler> f246225e = new ConcurrentHashMap<>();

    static {
        ConcurrentHashMap<C84343y, HashSet<q$$g>> concurrentHashMap = new ConcurrentHashMap<>();
        f246222b = concurrentHashMap;
        ConcurrentHashMap<C84343y, Queue<C83928t1>> concurrentHashMap2 = new ConcurrentHashMap<>();
        f246223c = concurrentHashMap2;
        ConcurrentHashMap<C84343y, Queue<C81925i2>> concurrentHashMap3 = new ConcurrentHashMap<>();
        f246224d = concurrentHashMap3;
        C81682d.m100227g();
        C84343y yVar = C84343y.WAGAME;
        concurrentHashMap2.put(yVar, new ConcurrentLinkedQueue());
        C84343y yVar2 = C84343y.WASERVICE;
        concurrentHashMap2.put(yVar2, new ConcurrentLinkedQueue());
        concurrentHashMap3.put(yVar, new ConcurrentLinkedQueue());
        concurrentHashMap3.put(yVar2, new ConcurrentLinkedQueue());
        concurrentHashMap.put(yVar, new HashSet());
        concurrentHashMap.put(yVar2, new HashSet());
    }

    /* renamed from: a */
    public static void m103946a(C88273g1 g1Var) {
        boolean z;
        boolean z2 = true;
        if (!C81738h0.m100297c()) {
            Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "[PreloadWAGameABTest] hardcode disable preload for remote debug");
            z = false;
        } else {
            if (C1971b.m1957c()) {
                Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "[PreloadWAGameABTest] forcePreload");
            }
            z = true;
        }
        if (!z) {
            Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadNextRuntimeForWAGame disable preload");
            m103948c(2, C84343y.WAGAME);
            C115669n.INSTANCE.mo175911u(915, 32);
            return;
        }
        if (!C34855o.m40516a()) {
            LinkedHashMap<String, AppBrandRuntimeWC> linkedHashMap = C81682d.f239733c;
            synchronized (linkedHashMap) {
                Iterator<AppBrandRuntimeWC> it = linkedHashMap.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    AppBrandRuntimeWC next = it.next();
                    if (next != null && next.mo121254q1()) {
                        break;
                    }
                }
            }
            if (z2) {
                Log.m105920e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadNextRuntimeForWAGame skip by hasRunningGames[TRUE]");
                C115669n.INSTANCE.mo175911u(915, 31);
                m103948c(2, C84343y.WAGAME);
                return;
            }
        }
        try {
            m103954i(C84343y.WAGAME, g1Var);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", e, "preloadNextRuntimeOnUiThreadForWAGame exception.", new Object[0]);
        }
        m103948c(2, C84343y.WAGAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0043, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m103947b(com.tencent.p014mm.plugin.appbrand.task.C84343y r6) {
        /*
            java.lang.Class<com.tencent.mm.plugin.appbrand.task.q> r0 = com.tencent.p014mm.plugin.appbrand.task.C84331q.class
            monitor-enter(r0)
            boolean r1 = m103957l(r6)     // Catch:{ all -> 0x005f }
            r2 = 1
            if (r1 != 0) goto L_0x000c
            monitor-exit(r0)
            return r2
        L_0x000c:
            kr0.e r1 = m103953h(r6)     // Catch:{ all -> 0x005f }
            com.tencent.mm.plugin.appbrand.task.y r3 = com.tencent.p014mm.plugin.appbrand.task.C84343y.NIL     // Catch:{ all -> 0x005f }
            junit.framework.Assert.assertNotSame(r6, r3)     // Catch:{ all -> 0x005f }
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.task.y, java.util.Queue<com.tencent.mm.plugin.appbrand.page.t1>> r3 = f246223c     // Catch:{ all -> 0x005f }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x005f }
            java.util.Queue r3 = (java.util.Queue) r3     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x002c
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x005f }
            if (r4 != 0) goto L_0x002c
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x005f }
            com.tencent.mm.plugin.appbrand.page.t1 r3 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r3     // Catch:{ all -> 0x005f }
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            com.tencent.mm.plugin.appbrand.task.y r4 = com.tencent.p014mm.plugin.appbrand.task.C84343y.WAGAME     // Catch:{ all -> 0x005f }
            r5 = 0
            if (r6 != r4) goto L_0x0038
            if (r1 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            monitor-exit(r0)
            return r2
        L_0x0038:
            com.tencent.mm.plugin.appbrand.task.y r4 = com.tencent.p014mm.plugin.appbrand.task.C84343y.WASERVICE     // Catch:{ all -> 0x005f }
            if (r6 != r4) goto L_0x0044
            if (r1 == 0) goto L_0x0042
            if (r3 != 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            monitor-exit(r0)
            return r2
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r2.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "not supported type: "
            r2.append(r3)     // Catch:{ all -> 0x005f }
            java.lang.String r6 = r6.name()     // Catch:{ all -> 0x005f }
            r2.append(r6)     // Catch:{ all -> 0x005f }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x005f }
            r1.<init>(r6)     // Catch:{ all -> 0x005f }
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.task.C84331q.m103947b(com.tencent.mm.plugin.appbrand.task.y):boolean");
    }

    /* renamed from: c */
    public static void m103948c(int i, C84343y yVar) {
        LinkedList<q$$g> linkedList;
        int i2 = 1;
        Log.m105925i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preInit finished level:%d type [%s]", Integer.valueOf(i), yVar.name());
        AppBrandPreloadProfiler appBrandPreloadProfiler = f246225e.get(yVar);
        if (appBrandPreloadProfiler != null) {
            appBrandPreloadProfiler.getClass();
            appBrandPreloadProfiler.f246129j = SystemClock.elapsedRealtime();
            new q$$a(appBrandPreloadProfiler, yVar).run();
        }
        C115669n nVar = C115669n.INSTANCE;
        if (yVar == C84343y.WAGAME) {
            i2 = 6;
        }
        nVar.mo175911u(915, i2);
        synchronized (C84331q.class) {
            if (i == 2) {
                f246221a.mo117029c(yVar, q$$h.PRELOADED_FULL);
            } else {
                f246221a.mo117029c(yVar, q$$h.PRELOADED_DOWNGRADE);
            }
            ConcurrentHashMap<C84343y, HashSet<q$$g>> concurrentHashMap = f246222b;
            linkedList = new LinkedList<>(concurrentHashMap.get(yVar));
            concurrentHashMap.get(yVar).clear();
        }
        for (q$$g q__g : linkedList) {
            if (q__g != null) {
                q__g.onReady();
            }
        }
        LooperCompat.addMainLooperIdleHandler(new q$$e(yVar));
    }

    /* renamed from: d */
    public static String m103949d(long j, String str, long j2, String str2) {
        int i = (j > MAlarmHandler.NEXT_FIRE_INTERVAL ? 1 : (j == MAlarmHandler.NEXT_FIRE_INTERVAL ? 0 : -1));
        if (i != 0 && j2 != MAlarmHandler.NEXT_FIRE_INTERVAL) {
            return String.valueOf(j2 - j);
        }
        Object[] objArr = new Object[4];
        objArr[0] = str;
        String str3 = "?";
        objArr[1] = i == 0 ? str3 : "ok";
        objArr[2] = str2;
        if (j2 != MAlarmHandler.NEXT_FIRE_INTERVAL) {
            str3 = "ok";
        }
        objArr[3] = str3;
        return Util.safeFormatString("Unknown(%s=%s,%s=%s)", objArr);
    }

    /* renamed from: e */
    public static synchronized C84343y[] m103950e() {
        C84343y[] yVarArr;
        synchronized (C84331q.class) {
            ConcurrentHashMap<C84343y, Queue<C81925i2>> concurrentHashMap = f246224d;
            C84343y yVar = C84343y.WASERVICE;
            boolean z = true;
            boolean z2 = concurrentHashMap.contains(yVar) && !concurrentHashMap.get(yVar).isEmpty();
            C84343y yVar2 = C84343y.WAGAME;
            boolean z3 = concurrentHashMap.contains(yVar2) && !concurrentHashMap.get(yVar2).isEmpty();
            ArrayList arrayList = new ArrayList();
            if (z2) {
                arrayList.add(yVar);
            }
            if (z3) {
                arrayList.add(yVar2);
            }
            if (arrayList.size() > 2) {
                z = false;
            }
            Assert.assertTrue(z);
            yVarArr = (C84343y[]) arrayList.toArray(new C84343y[0]);
        }
        return yVarArr;
    }

    /* renamed from: f */
    public static C83928t1 m103951f(C84343y yVar) {
        C83928t1 t1Var;
        Assert.assertNotSame(yVar, C84343y.NIL);
        Queue queue = f246223c.get(yVar);
        if (queue == null || queue.isEmpty()) {
            t1Var = null;
        } else {
            t1Var = (C83928t1) queue.poll();
            Assert.assertTrue(queue.isEmpty());
        }
        Log.m105919d("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "getPageView: [%s]", t1Var);
        return t1Var;
    }

    /* renamed from: g */
    public static C88267e m103952g(C84343y yVar) {
        Assert.assertNotSame(yVar, C84343y.NIL);
        C115669n nVar = C115669n.INSTANCE;
        C84343y yVar2 = C84343y.WAGAME;
        nVar.mo175911u(915, yVar == yVar2 ? 12 : 10);
        C88267e eVar = null;
        Queue queue = f246224d.get(yVar);
        if (queue != null && !queue.isEmpty()) {
            eVar = (C88267e) queue.poll();
            Assert.assertTrue(queue.isEmpty());
        }
        if (eVar != null) {
            nVar.mo175911u(915, yVar == yVar2 ? 7 : 2);
        }
        Log.m105919d("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "getServices: ret = [%s]", eVar);
        return eVar;
    }

    /* renamed from: h */
    public static C88267e m103953h(C84343y yVar) {
        Assert.assertNotSame(yVar, C84343y.NIL);
        Queue queue = f246224d.get(yVar);
        if (queue == null || queue.isEmpty()) {
            return null;
        }
        return (C88267e) queue.peek();
    }

    /* renamed from: i */
    public static void m103954i(C84343y yVar, C88273g1 g1Var) {
        Queue queue = f246224d.get(yVar);
        Objects.requireNonNull(queue);
        Queue queue2 = queue;
        if (!queue2.isEmpty()) {
            Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preload services skipped cause already cached");
            C115669n.INSTANCE.mo175911u(915, 34);
            return;
        }
        Class<? extends C81925i2> cls = yVar.f246275d;
        C91635f fVar = (C91635f) new C79664a(cls, cls).mo109790c().f233575b;
        fVar.mo114269d0(WxaCommLibRuntimeReader.m99498b());
        fVar.mo125518K0(C84217q.PreloadOnProcessCreated);
        if (fVar instanceof C88267e) {
            ((C88267e) fVar).f255129N = g1Var;
        }
        queue2.add(fVar);
        Log.m105925i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadService done in request[%s]", yVar);
    }

    /* renamed from: j */
    public static void m103955j(C84343y yVar, q$$g q__g, boolean z, AppBrandPreloadProfiler appBrandPreloadProfiler, C88273g1 g1Var, int i) {
        q$$h a;
        q$$h q__h = q$$h.PRELOADED_DOWNGRADE;
        q$$h q__h2 = q$$h.PRELOADING;
        Log.m105925i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "AppBrandPreloader.preload serviceType = [%s] level = [%d], scene = [%s], force[%b]", yVar.name(), Integer.valueOf(i), g1Var, Boolean.valueOf(z));
        if (yVar != C84343y.NIL) {
            synchronized (C84331q.class) {
                if (C88273g1.WXA_JSAPI_PRELOAD == g1Var && m103947b(yVar)) {
                    Log.m105925i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "AppBrandPreloader.preload, switch to forcePreload for type[%s], due to consumedOrNotPreloaded", yVar);
                    z = true;
                }
                q$$f q__f = f246221a;
                if (q__f.mo117028b(yVar) && z) {
                    m103958m(yVar);
                }
                a = q__f.mo117027a(yVar);
                if (a == q$$h.NOT_PRELOAD || a == q__h2 || (a == q__h && i >= 2)) {
                    if (q__g != null) {
                        f246222b.get(yVar).add(q__g);
                    }
                    q__f.mo117029c(yVar, q__h2);
                }
            }
            if (a == q__h2) {
                Log.m105925i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preload: type [%s] is preloading, just return", yVar.name());
            } else if (a != q$$h.PRELOADED_FULL && (a != q__h || i >= 2)) {
                m103956k(yVar, appBrandPreloadProfiler, g1Var, i);
            } else if (q__g != null) {
                Log.m105925i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preload: [%s] [%d] preload finished", yVar.name(), Integer.valueOf(i));
                q__g.onReady();
            }
        } else {
            throw new IllegalArgumentException("can not preload with a specific service type");
        }
    }

    /* renamed from: k */
    public static void m103956k(C84343y yVar, AppBrandPreloadProfiler appBrandPreloadProfiler, C88273g1 g1Var, int i) {
        if (appBrandPreloadProfiler == null) {
            appBrandPreloadProfiler = new AppBrandPreloadProfiler();
        }
        appBrandPreloadProfiler.f246124e = i;
        f246225e.put(yVar, appBrandPreloadProfiler);
        C115669n.INSTANCE.mo175911u(915, yVar == C84343y.WAGAME ? 5 : 0);
        Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "TRACE_ORDER:AppBrandProcessPreloader.java");
        if (i == 0) {
            m103948c(i, yVar);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new q$$b(yVar, g1Var, i), "MicroMsg.AppBrandProcessPreloader[applaunch][preload]_ComponentsPreloadWorker");
        C87690d.m109091b("preload AppBrandUI classes", new q$$c(appBrandPreloadProfiler));
    }

    /* renamed from: l */
    public static synchronized boolean m103957l(C84343y yVar) {
        boolean b;
        synchronized (C84331q.class) {
            b = f246221a.mo117028b(yVar);
        }
        return b;
    }

    /* renamed from: m */
    public static synchronized void m103958m(C84343y yVar) {
        synchronized (C84331q.class) {
            Log.m105925i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "reset() %s", android.util.Log.getStackTraceString(new Throwable()));
            f246221a.mo117029c(yVar, q$$h.NOT_PRELOAD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b9, code lost:
        if (r10 == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        m103956k(r9, (com.tencent.p014mm.plugin.appbrand.task.AppBrandPreloadProfiler) null, kr0.C88273g1.TEST_ONLY, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c1, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c2, code lost:
        return false;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m103959n(com.tencent.p014mm.plugin.appbrand.task.C84343y r9, com.tencent.p014mm.plugin.appbrand.task.q$$g r10, java.lang.String r11) {
        /*
            java.lang.Class<com.tencent.mm.plugin.appbrand.task.q> r0 = com.tencent.p014mm.plugin.appbrand.task.C84331q.class
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.AppBrandProcessPreloader[applaunch][preload]"
            java.lang.String r2 = "Checking shouldWaitPreloading.. mCurrentPreloadState is [%s], sCacheServices.size[%d], sCachePageView.size[%d], message[%s]"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00c3 }
            com.tencent.mm.plugin.appbrand.task.q$$f r4 = f246221a     // Catch:{ all -> 0x00c3 }
            com.tencent.mm.plugin.appbrand.task.q$$h r5 = r4.mo117027a(r9)     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = r5.name()     // Catch:{ all -> 0x00c3 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x00c3 }
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.task.y, java.util.Queue<com.tencent.mm.plugin.appbrand.i2>> r5 = f246224d     // Catch:{ all -> 0x00c3 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ all -> 0x00c3 }
            java.util.Queue r5 = (java.util.Queue) r5     // Catch:{ all -> 0x00c3 }
            int r5 = r5.size()     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00c3 }
            r7 = 1
            r3[r7] = r5     // Catch:{ all -> 0x00c3 }
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.task.y, java.util.Queue<com.tencent.mm.plugin.appbrand.page.t1>> r5 = f246223c     // Catch:{ all -> 0x00c3 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ all -> 0x00c3 }
            java.util.Queue r5 = (java.util.Queue) r5     // Catch:{ all -> 0x00c3 }
            int r5 = r5.size()     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00c3 }
            r8 = 2
            r3[r8] = r5     // Catch:{ all -> 0x00c3 }
            r5 = 3
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ all -> 0x00c3 }
            r3[r5] = r11     // Catch:{ all -> 0x00c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x00c3 }
            com.tencent.mm.plugin.appbrand.task.q$$h r11 = r4.mo117027a(r9)     // Catch:{ all -> 0x00c3 }
            com.tencent.mm.plugin.appbrand.task.q$$h r1 = com.tencent.p014mm.plugin.appbrand.task.q$$h.PRELOADING     // Catch:{ all -> 0x00c3 }
            if (r11 != r1) goto L_0x006d
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.task.y, java.util.HashSet<com.tencent.mm.plugin.appbrand.task.q$$g>> r11 = f246222b     // Catch:{ all -> 0x00c3 }
            java.lang.Object r11 = r11.get(r9)     // Catch:{ all -> 0x00c3 }
            java.util.HashSet r11 = (java.util.HashSet) r11     // Catch:{ all -> 0x00c3 }
            r11.add(r10)     // Catch:{ all -> 0x00c3 }
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.task.y, com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler> r10 = f246225e     // Catch:{ all -> 0x00c3 }
            java.lang.Object r9 = r10.get(r9)     // Catch:{ all -> 0x00c3 }
            com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler r9 = (com.tencent.p014mm.plugin.appbrand.task.AppBrandPreloadProfiler) r9     // Catch:{ all -> 0x00c3 }
            r9.getClass()     // Catch:{ all -> 0x00c3 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00c3 }
            r9.f246130n = r10     // Catch:{ all -> 0x00c3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            return r7
        L_0x006d:
            boolean r11 = com.tencent.p014mm.plugin.appbrand.task.C1971b.m1957c()     // Catch:{ all -> 0x00c3 }
            if (r11 == 0) goto L_0x00b7
            com.tencent.mm.plugin.appbrand.task.q$$h r11 = r4.mo117027a(r9)     // Catch:{ all -> 0x00c3 }
            com.tencent.mm.plugin.appbrand.task.q$$h r2 = com.tencent.p014mm.plugin.appbrand.task.q$$h.NOT_PRELOAD     // Catch:{ all -> 0x00c3 }
            if (r11 != r2) goto L_0x0092
            java.lang.String r11 = "MicroMsg.AppBrandProcessPreloader[applaunch][preload]"
            java.lang.String r2 = "[ForcePreload] wait preload (not preload currently)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)     // Catch:{ all -> 0x00c3 }
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.task.y, java.util.HashSet<com.tencent.mm.plugin.appbrand.task.q$$g>> r11 = f246222b     // Catch:{ all -> 0x00c3 }
            java.lang.Object r11 = r11.get(r9)     // Catch:{ all -> 0x00c3 }
            java.util.HashSet r11 = (java.util.HashSet) r11     // Catch:{ all -> 0x00c3 }
            r11.add(r10)     // Catch:{ all -> 0x00c3 }
            r4.mo117029c(r9, r1)     // Catch:{ all -> 0x00c3 }
        L_0x0090:
            r10 = 1
            goto L_0x00b8
        L_0x0092:
            boolean r11 = r4.mo117028b(r9)     // Catch:{ all -> 0x00c3 }
            if (r11 == 0) goto L_0x00b7
            kr0.e r11 = m103953h(r9)     // Catch:{ all -> 0x00c3 }
            if (r11 != 0) goto L_0x00b7
            java.lang.String r11 = "MicroMsg.AppBrandProcessPreloader[applaunch][preload]"
            java.lang.String r2 = "[ForcePreload] wait preload (preloaded)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)     // Catch:{ all -> 0x00c3 }
            m103958m(r9)     // Catch:{ all -> 0x00c3 }
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.task.y, java.util.HashSet<com.tencent.mm.plugin.appbrand.task.q$$g>> r11 = f246222b     // Catch:{ all -> 0x00c3 }
            java.lang.Object r11 = r11.get(r9)     // Catch:{ all -> 0x00c3 }
            java.util.HashSet r11 = (java.util.HashSet) r11     // Catch:{ all -> 0x00c3 }
            r11.add(r10)     // Catch:{ all -> 0x00c3 }
            r4.mo117029c(r9, r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x0090
        L_0x00b7:
            r10 = 0
        L_0x00b8:
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            if (r10 == 0) goto L_0x00c2
            r10 = 0
            kr0.g1 r11 = kr0.C88273g1.TEST_ONLY
            m103956k(r9, r10, r11, r8)
            return r7
        L_0x00c2:
            return r6
        L_0x00c3:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.task.C84331q.m103959n(com.tencent.mm.plugin.appbrand.task.y, com.tencent.mm.plugin.appbrand.task.q$$g, java.lang.String):boolean");
    }

    /* renamed from: o */
    public static C88629c<Void> m103960o(C84343y yVar) {
        synchronized (C84331q.class) {
            if (f246221a.mo117027a(yVar) == q$$h.PRELOADING) {
                C89059e<Void> a = C89060f.m111322a();
                C88633e.C88639g gVar = (C88633e.C88639g) a.f255921r;
                gVar.mo72092b();
                f246222b.get(yVar).add(new q$$d(gVar));
                return a;
            }
            C89059e<Void> a2 = C89060f.m111322a();
            return a2;
        }
    }
}
