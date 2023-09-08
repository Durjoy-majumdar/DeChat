package f40;

import android.app.Application;
import android.os.SystemClock;
import com.tencent.p014mm.booter.C80824k0;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.DeprecatedThreadFactory;
import eb0.C86482a6;
import f40.C86718e;
import f40.C86723g;
import f40.C86732g0;
import f40.C86739i0;
import g40.C87134f;
import gp3.C87315b;
import j40.C87829b;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import k40.C88080e;
import k40.C9562a;
import nr3.C89055a;
import ob0.C89137b0;
import ob0.b0$$h;
import p823sg.C77710q;
import qh3.C89661b;
import zt3.C119154h;

/* renamed from: f40.a0 */
public final class C86709a0 {

    /* renamed from: m */
    public static final String[] f251722m = {":appbrand0", ":appbrand1", ":appbrand2", ":appbrand3", ":appbrand4"};

    /* renamed from: n */
    public static C86709a0 f251723n;

    /* renamed from: a */
    public C86732g0<C87829b> f251724a;

    /* renamed from: b */
    public MMHandlerThread f251725b;

    /* renamed from: c */
    public C86482a6 f251726c = null;

    /* renamed from: d */
    public C86744o f251727d;

    /* renamed from: e */
    public C86718e f251728e;

    /* renamed from: f */
    public C86723g f251729f;

    /* renamed from: g */
    public C89661b f251730g;

    /* renamed from: h */
    public final C86713d f251731h = new C86713d((C86710a) null);

    /* renamed from: i */
    public final C86723g.C86729h f251732i = new C86723g.C86729h();

    /* renamed from: j */
    public final boolean f251733j;

    /* renamed from: k */
    public ConcurrentHashMap f251734k = new ConcurrentHashMap();

    /* renamed from: l */
    public volatile boolean f251735l = false;

    /* renamed from: f40.a0$a */
    public class C86710a implements Runnable {
        public C86710a(C86709a0 a0Var) {
        }

        public void run() {
            ConnectivityCompat.Companion.initSignalStrengthListener();
        }
    }

    /* renamed from: f40.a0$b */
    public class C86711b implements C86739i0.C86740a {
    }

    /* renamed from: f40.a0$c */
    public class C86712c implements MMHandlerThread.ResetCallback {
        public C86712c() {
        }

        public void callback() {
            C119154h.m168040a(MMApplicationContext.getContext(), new C80824k0());
            C86718e eVar = C86709a0.this.f251728e;
            if (eVar != null) {
                synchronized (eVar.f251752c) {
                    eVar.mo121123x();
                }
            }
        }
    }

    /* renamed from: f40.a0$d */
    public static class C86713d extends C89055a<b0$$h> implements b0$$h {

        /* renamed from: f40.a0$d$a */
        public class C86714a implements C89055a.C89056a<b0$$h> {

            /* renamed from: a */
            public final /* synthetic */ C89137b0 f251737a;

            /* renamed from: b */
            public final /* synthetic */ boolean f251738b;

            public C86714a(C86713d dVar, C89137b0 b0Var, boolean z) {
                this.f251737a = b0Var;
                this.f251738b = z;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((b0$$h) obj).mo72832a(this.f251737a, this.f251738b);
            }
        }

        /* renamed from: f40.a0$d$b */
        public class C86715b implements C89055a.C89056a<b0$$h> {

            /* renamed from: a */
            public final /* synthetic */ C89137b0 f251739a;

            public C86715b(C86713d dVar, C89137b0 b0Var) {
                this.f251739a = b0Var;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((b0$$h) obj).mo72833k(this.f251739a);
            }
        }

        public C86713d(C86710a aVar) {
        }

        /* renamed from: a */
        public void mo72832a(C89137b0 b0Var, boolean z) {
            mo123416n(new C86714a(this, b0Var, z));
        }

        /* renamed from: k */
        public void mo72833k(C89137b0 b0Var) {
            mo123416n(new C86715b(this, b0Var));
        }
    }

    public C86709a0(C87829b bVar) {
        C86732g0<C87829b> g0Var;
        synchronized (C86732g0.class) {
            if (C86732g0.f251788h != null) {
                C86739i0.m107599a("MicroMsg.MMSkeleton", "Kernel not null, has initialized.", new Object[0]);
                g0Var = C86732g0.f251788h;
            } else {
                C86739i0.m107599a("MicroMsg.MMSkeleton", "Initialize skeleton, create whole world.", new Object[0]);
                C86732g0<C87829b> g0Var2 = new C86732g0<>(bVar);
                C86732g0.f251788h = g0Var2;
                g0Var = g0Var2;
            }
        }
        this.f251724a = g0Var;
        boolean b = g0Var.mo121134b().mo58407a().mo71804b();
        this.f251733j = b;
        if (b) {
            this.f251726c = new C86482a6();
            MMHandlerThread mMHandlerThread = new MMHandlerThread(DeprecatedThreadFactory.createHandlerThread("worker"));
            this.f251725b = mMHandlerThread;
            mMHandlerThread.postToWorker(new C86710a(this));
        }
    }

    /* renamed from: a */
    public static boolean m107522a() {
        C86718e eVar;
        if (!MMApplicationContext.isMainProcess() || (eVar = m107528h().f251728e) == null || !eVar.mo121114l()) {
            return false;
        }
        return eVar.f251764o;
    }

    /* renamed from: b */
    public static C86718e m107523b() {
        Assert.assertNotNull("mCoreAccount not initialized!", m107528h().f251728e);
        return m107528h().f251728e;
    }

    /* renamed from: d */
    public static C89137b0 m107524d() {
        m107528h();
        return m107529k().f251779b;
    }

    @Deprecated
    /* renamed from: e */
    public static MMHandlerThread m107525e() {
        Assert.assertTrue(m107528h().f251733j);
        return m107528h().f251725b;
    }

    /* renamed from: f */
    public static C86482a6 m107526f() {
        Assert.assertTrue(m107528h().f251733j);
        return m107528h().f251726c;
    }

    /* renamed from: g */
    public static synchronized void m107527g(C87829b bVar) {
        synchronized (C86709a0.class) {
            C86709a0 a0Var = f251723n;
            if (a0Var != null) {
                C87829b a = a0Var.f251724a.mo121134b().mo58407a();
                Application application = bVar.f124990c;
                a.f254267f = bVar.f254267f;
                a.f124990c = application;
                Log.m105924i("MicroMsg.MMKernel", "Kernel not null, has initialized.");
                return;
            }
            C86739i0.f251799b = new C86711b();
            Log.m105924i("MicroMsg.MMKernel", "Initialize kernel, create whole WeChat world.");
            f251723n = new C86709a0(bVar);
        }
    }

    /* renamed from: h */
    public static C86709a0 m107528h() {
        Assert.assertNotNull("Kernel not initialized by MMApplication!", f251723n);
        return f251723n;
    }

    /* renamed from: k */
    public static C86723g m107529k() {
        Assert.assertNotNull("mCoreNetwork not initialized!", m107528h().f251729f);
        return m107528h().f251729f;
    }

    /* renamed from: l */
    public static C86738i m107530l() {
        Assert.assertNotNull("mCorePlugins not initialized!", m107528h().f251724a.mo121133a());
        return m107528h().f251724a.mo121133a();
    }

    /* renamed from: m */
    public static C31884j<C87829b> m107531m() {
        Assert.assertNotNull("mCoreProcess not initialized!", m107528h().f251724a.mo121134b());
        return m107528h().f251724a.mo121134b();
    }

    /* renamed from: n */
    public static <T extends C9562a, N extends T> void m107532n(Class<T> cls, N n) {
        m107528h();
        C86738i l = m107530l();
        l.f251797a.mo122504a(cls, new C88080e(n));
    }

    /* renamed from: q */
    public static <T extends C9562a> T m107533q(Class<T> cls) {
        m107528h();
        T b = m107530l().f251797a.mo122505b(cls);
        if (b != null) {
            return b;
        }
        Application application = C86732g0.m107592c().mo121134b().mo58407a().f124990c;
        return null;
    }

    /* renamed from: r */
    public static C89661b m107534r() {
        Assert.assertNotNull("mCoreStatus not initialized!", m107528h().f251730g);
        return m107528h().f251730g;
    }

    /* renamed from: s */
    public static C86744o m107535s() {
        Assert.assertNotNull("mCoreStorage not initialized!", m107528h().f251727d);
        return m107528h().f251727d;
    }

    /* renamed from: c */
    public void mo121097c(C87134f fVar) {
        boolean z;
        C86732g0<C87829b> g0Var = this.f251724a;
        synchronized (g0Var.f251791c) {
            if (g0Var.f251792d) {
                z = true;
            } else {
                g0Var.f251795g.add(fVar);
                z = false;
            }
        }
        if (z) {
            fVar.mo1180e();
        }
    }

    /* renamed from: i */
    public void mo121098i(int i) {
        C86718e b = m107523b();
        b.getClass();
        if (!(i != 0) || C86718e.C86720e.m107576a(C86718e.f251745u) != i || !b.mo121114l()) {
            synchronized (b.f251752c) {
                C86718e.C86720e.m107577b(C86718e.f251745u, i);
                b.mo121123x();
                b.f251762m = SystemClock.elapsedRealtime();
                b.mo121117p(true);
            }
            return;
        }
        Log.m105929w("MMKernel.CoreAccount", "loginUin, uin not changed, return :%d", Integer.valueOf(i));
    }

    /* renamed from: j */
    public void mo121099j(String str) {
        Log.m105929w("MicroMsg.MMKernel", "logoutAccount uin:%s info:%s stack:%s", C77710q.m93738a(this.f251728e.mo121110g()), str, Util.getStack());
        C86718e.f251746v = Util.getStack().toString() + str;
        this.f251728e.mo121113k().mo182471a((long) this.f251728e.mo121110g());
        mo121100o();
        this.f251728e.getClass();
        C86718e.C86720e.m107577b(C86718e.f251745u, 0);
        C86718e.f251744t = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f5, code lost:
        zt3.C119146d.f356851c.mo125764e("ThreadModuleBoot", r2.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121100o() {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "MicroMsg.MMKernel"
            java.lang.String r3 = "release uin:%s "
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            f40.e r6 = r11.f251728e
            if (r6 == 0) goto L_0x0019
            int r6 = r6.mo121110g()
            java.lang.String r6 = p823sg.C77710q.m93738a(r6)
            goto L_0x001b
        L_0x0019:
            java.lang.String r6 = "-1"
        L_0x001b:
            r7 = 0
            r5[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r5)
            f40.g r2 = r11.f251729f
            ob0.b0 r2 = r2.f251779b
            if (r2 == 0) goto L_0x002a
            r2.mo123471q()
        L_0x002a:
            zt3.t r2 = zt3.C119157j.f356862d
            zt3.j r2 = (zt3.C119157j) r2
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f356864a     // Catch:{ all -> 0x0129 }
            boolean r3 = r3.compareAndSet(r7, r4)     // Catch:{ all -> 0x0129 }
            r5 = 0
            if (r3 == 0) goto L_0x00d0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, mu3.a> r3 = mu3.C109639a.f328235e     // Catch:{ all -> 0x0129 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0129 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0129 }
        L_0x0042:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x0129 }
            if (r8 == 0) goto L_0x0054
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x0129 }
            mu3.a r8 = (mu3.C109639a) r8     // Catch:{ all -> 0x0129 }
            mu3.d r8 = r8.f328238b     // Catch:{ all -> 0x0129 }
            r8.mo182313f()     // Catch:{ all -> 0x0129 }
            goto L_0x0042
        L_0x0054:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, mu3.a> r3 = mu3.C109639a.f328235e     // Catch:{ all -> 0x0129 }
            r3.clear()     // Catch:{ all -> 0x0129 }
            ku3.e r3 = r2.f356866c     // Catch:{ all -> 0x0129 }
            ku3.b r8 = r3.f351463a     // Catch:{ all -> 0x0129 }
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f351449d     // Catch:{ all -> 0x0129 }
            boolean r9 = r9.compareAndSet(r7, r4)     // Catch:{ all -> 0x0129 }
            if (r9 == 0) goto L_0x0068
            r8.mo182105e()     // Catch:{ all -> 0x0129 }
        L_0x0068:
            ku3.c r8 = r3.f351464b     // Catch:{ all -> 0x0129 }
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f351449d     // Catch:{ all -> 0x0129 }
            boolean r9 = r9.compareAndSet(r7, r4)     // Catch:{ all -> 0x0129 }
            if (r9 == 0) goto L_0x0075
            r8.mo182112d()     // Catch:{ all -> 0x0129 }
        L_0x0075:
            ku3.f r3 = r3.f351465c     // Catch:{ all -> 0x0129 }
            java.util.concurrent.atomic.AtomicBoolean r8 = r3.f351449d     // Catch:{ all -> 0x0129 }
            boolean r8 = r8.compareAndSet(r7, r4)     // Catch:{ all -> 0x0129 }
            if (r8 == 0) goto L_0x0082
            r3.mo182118d()     // Catch:{ all -> 0x0129 }
        L_0x0082:
            zt3.d$b r3 = zt3.C119146d.f356851c     // Catch:{ all -> 0x0129 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0129 }
            java.lang.String r9 = "PoolAdapter"
            java.lang.String r10 = "[shutdown]"
            r3.mo125765i(r9, r10, r8)     // Catch:{ all -> 0x0129 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, gu3.g> r3 = gu3.C32536h.f86395a     // Catch:{ all -> 0x0129 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0129 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0129 }
        L_0x0097:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x0129 }
            if (r8 == 0) goto L_0x00a7
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x0129 }
            gu3.g r8 = (gu3.C87399g) r8     // Catch:{ all -> 0x0129 }
            r8.mo9401g()     // Catch:{ all -> 0x0129 }
            goto L_0x0097
        L_0x00a7:
            java.util.concurrent.ConcurrentHashMap<android.os.Looper, java.lang.ref.WeakReference<android.os.Handler>> r3 = gu3.C116992c.f350567c     // Catch:{ all -> 0x0129 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0129 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0129 }
        L_0x00b1:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x0129 }
            if (r8 == 0) goto L_0x00c9
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x0129 }
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8     // Catch:{ all -> 0x0129 }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0129 }
            android.os.Handler r8 = (android.os.Handler) r8     // Catch:{ all -> 0x0129 }
            if (r8 == 0) goto L_0x00b1
            r8.removeCallbacksAndMessages(r5)     // Catch:{ all -> 0x0129 }
            goto L_0x00b1
        L_0x00c9:
            zt3.d$f r3 = zt3.C119146d.f356849a     // Catch:{ all -> 0x0129 }
            r3.shutdown()     // Catch:{ all -> 0x0129 }
            monitor-exit(r2)
            goto L_0x00d1
        L_0x00d0:
            monitor-exit(r2)
        L_0x00d1:
            du3.c r2 = eu3.C86698f.f251708a
            r2.mo180617g()
            zt3.t r2 = zt3.C119157j.f356862d
            zt3.j r2 = (zt3.C119157j) r2
            zt3.a r2 = r2.f356865b
            boolean r2 = r2.f356827f
            if (r2 == 0) goto L_0x0104
            java.lang.Class<android.os.AsyncTask> r2 = android.os.AsyncTask.class
            java.lang.String r3 = "THREAD_POOL_EXECUTOR"
            java.util.concurrent.Executor r8 = zt3.C119154h.f356860a     // Catch:{ Exception -> 0x00f4 }
            ou3.a r9 = new ou3.a     // Catch:{ Exception -> 0x00f4 }
            r9.<init>(r2, r3)     // Catch:{ Exception -> 0x00f4 }
            monitor-enter(r9)     // Catch:{ Exception -> 0x00f4 }
            r9.mo123641c(r5, r8, r7)     // Catch:{ all -> 0x00f1 }
            monitor-exit(r9)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0102
        L_0x00f1:
            r2 = move-exception
            monitor-exit(r9)     // Catch:{ Exception -> 0x00f4 }
            throw r2     // Catch:{ Exception -> 0x00f4 }
        L_0x00f4:
            r2 = move-exception
            zt3.d$b r3 = zt3.C119146d.f356851c
            java.lang.String r8 = "ThreadModuleBoot"
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r3.mo125764e(r8, r2, r9)
        L_0x0102:
            zt3.C119154h.f356860a = r5
        L_0x0104:
            com.tencent.mm.sdk.platformtools.MMHandlerThread r2 = r11.f251725b
            if (r2 == 0) goto L_0x0110
            f40.a0$c r3 = new f40.a0$c
            r3.<init>()
            r2.syncReset(r3)
        L_0x0110:
            java.lang.String r2 = "MicroMsg.MMKernel"
            java.lang.String r3 = "release uin:%s finish!!! cost:%sms"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r7] = r6
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r5[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
            return
        L_0x0129:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.C86709a0.mo121100o():void");
    }

    /* renamed from: p */
    public void mo121101p(C87134f fVar) {
        C86732g0.C86734b bVar = this.f251724a.f251795g;
        bVar.getClass();
        bVar.remove(new C87315b(fVar, bVar));
    }
}
