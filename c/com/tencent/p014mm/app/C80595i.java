package com.tencent.p014mm.app;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Process;
import com.tencent.p014mm.autogen.events.CoreNetworkReadyEvent;
import com.tencent.p014mm.booter.C28862c;
import com.tencent.p014mm.booter.C80811b;
import com.tencent.p014mm.booter.CoreService;
import com.tencent.p014mm.network.C26882h;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C86480a;
import f40.C86709a0;
import f40.C86718e;
import f40.C86739i0;
import j20.C117292a;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import ob0.C27640g0;
import p787ai.C79546a;
import p787ai.C79547b;

/* renamed from: com.tencent.mm.app.i */
public class C80595i implements ServiceConnection {

    /* renamed from: h */
    public static boolean f235772h;

    /* renamed from: i */
    public static Object f235773i = new Object();

    /* renamed from: j */
    public static final String f235774j = (MMApplicationContext.getApplicationId() + ":push");

    /* renamed from: n */
    public static int f235775n = 0;

    /* renamed from: o */
    public static int f235776o = CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;

    /* renamed from: d */
    public ReentrantLock f235777d = new ReentrantLock();

    /* renamed from: e */
    public boolean f235778e = false;

    /* renamed from: f */
    public IBinder f235779f = null;

    /* renamed from: g */
    public C80599d f235780g = new C80599d();

    /* renamed from: com.tencent.mm.app.i$a */
    public class C80596a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ComponentName f235781d;

        /* renamed from: e */
        public final /* synthetic */ IBinder f235782e;

        public C80596a(ComponentName componentName, IBinder iBinder) {
            this.f235781d = componentName;
            this.f235782e = iBinder;
        }

        public void run() {
            C80595i.m98213a(C80595i.this, this.f235781d, this.f235782e);
        }
    }

    /* renamed from: com.tencent.mm.app.i$b */
    public class C80597b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ComponentName f235784d;

        /* renamed from: e */
        public final /* synthetic */ IBinder f235785e;

        public C80597b(ComponentName componentName, IBinder iBinder) {
            this.f235784d = componentName;
            this.f235785e = iBinder;
        }

        public void run() {
            C80595i.m98213a(C80595i.this, this.f235784d, this.f235785e);
        }
    }

    /* renamed from: com.tencent.mm.app.i$c */
    public class C80598c implements Runnable {
        public C80598c(ComponentName componentName) {
        }

        public void run() {
            C80595i iVar = C80595i.this;
            iVar.getClass();
            if (!C86709a0.m107523b().mo121115m() || C86718e.m107551r()) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123472r();
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123471q();
                return;
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123459e();
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123472r();
            iVar.mo112309b(MMApplicationContext.getContext());
        }
    }

    /* renamed from: com.tencent.mm.app.i$d */
    public class C80599d implements Runnable {

        /* renamed from: d */
        public int f235788d = 0;

        public C80599d() {
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00e4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                java.lang.String r0 = "CoreServiceConnection mZombieWaker Exception:%s"
                java.lang.String r1 = "MicroMsg.CoreServiceConnection"
                com.tencent.mm.app.i r2 = com.tencent.p014mm.app.C80595i.this     // Catch:{ all -> 0x012e }
                java.util.concurrent.locks.ReentrantLock r2 = r2.f235777d     // Catch:{ all -> 0x012e }
                r2.lock()     // Catch:{ all -> 0x012e }
                com.tencent.mm.app.i r2 = com.tencent.p014mm.app.C80595i.this     // Catch:{ all -> 0x012e }
                android.os.IBinder r2 = r2.f235779f     // Catch:{ all -> 0x012e }
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x001b
                boolean r2 = r2.isBinderAlive()     // Catch:{ all -> 0x012e }
                if (r2 == 0) goto L_0x001b
                r2 = 1
                goto L_0x001c
            L_0x001b:
                r2 = 0
            L_0x001c:
                java.lang.String r5 = "mZombieWaker run serviceBinder: %s, binderAlive: %b"
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x012e }
                com.tencent.mm.app.i r7 = com.tencent.p014mm.app.C80595i.this     // Catch:{ all -> 0x012e }
                android.os.IBinder r7 = r7.f235779f     // Catch:{ all -> 0x012e }
                r6[r3] = r7     // Catch:{ all -> 0x012e }
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x012e }
                r6[r4] = r7     // Catch:{ all -> 0x012e }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r6)     // Catch:{ all -> 0x012e }
                if (r2 == 0) goto L_0x003f
                java.lang.String r0 = "mZombieWaker run binderAlive return directly."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ all -> 0x012e }
                com.tencent.mm.app.i r0 = com.tencent.p014mm.app.C80595i.this
                java.util.concurrent.locks.ReentrantLock r0 = r0.f235777d
                r0.unlock()
                return
            L_0x003f:
                com.tencent.mm.app.i r2 = com.tencent.p014mm.app.C80595i.this
                java.util.concurrent.locks.ReentrantLock r2 = r2.f235777d
                r2.unlock()
                java.lang.Object[] r2 = new java.lang.Object[r4]
                int r5 = r8.f235788d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r2[r3] = r5
                java.lang.String r5 = "CoreService started but not responding, possibly zombie. Use step %d to restart CoreService."
                java.lang.String r2 = java.lang.String.format(r5, r2)
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                int r2 = r8.f235788d
                if (r2 != r4) goto L_0x0083
                java.lang.String r2 = com.tencent.p014mm.app.C80595i.f235774j
                int r2 = com.tencent.p014mm.app.C80595i.m98214c(r2)
                r5 = -1
                if (r2 == r5) goto L_0x007e
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                r5[r3] = r6
                java.lang.String r6 = "Push Process %d killed."
                java.lang.String r5 = java.lang.String.format(r6, r5)
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
                com.tencent.p014mm.sdk.platformtools.Log.appenderFlush()
                com.tencent.p014mm.app.C80595i.m98216e(r2)
                goto L_0x0083
            L_0x007e:
                java.lang.String r2 = "Push Process not found."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            L_0x0083:
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.Intent r5 = new android.content.Intent
                java.lang.Class<com.tencent.mm.booter.CoreService> r6 = com.tencent.p014mm.booter.CoreService.class
                r5.<init>(r2, r6)
                java.lang.String r6 = "unbinding CoreService..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)     // Catch:{ Exception -> 0x00e4, all -> 0x00be }
                com.tencent.mm.app.i r6 = com.tencent.p014mm.app.C80595i.this     // Catch:{ Exception -> 0x00e4, all -> 0x00be }
                r2.unbindService(r6)     // Catch:{ Exception -> 0x00e4, all -> 0x00be }
                boolean r6 = com.tencent.p014mm.booter.C28862c.m38402c()     // Catch:{ Exception -> 0x00b1 }
                if (r6 == 0) goto L_0x00a5
                com.tencent.mm.app.i r6 = com.tencent.p014mm.app.C80595i.this     // Catch:{ Exception -> 0x00b1 }
                r2.bindService(r5, r6, r4)     // Catch:{ Exception -> 0x00b1 }
                goto L_0x0108
            L_0x00a5:
                r2.stopService(r5)     // Catch:{ Exception -> 0x00b1 }
                com.tencent.mm.app.i r6 = com.tencent.p014mm.app.C80595i.this     // Catch:{ Exception -> 0x00b1 }
                r2.bindService(r5, r6, r4)     // Catch:{ Exception -> 0x00b1 }
                r2.startService(r5)     // Catch:{ Exception -> 0x00b1 }
                goto L_0x0108
            L_0x00b1:
                r2 = move-exception
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r2 = r2.getMessage()
                r5[r3] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r5)
                goto L_0x0108
            L_0x00be:
                r6 = move-exception
                boolean r7 = com.tencent.p014mm.booter.C28862c.m38402c()     // Catch:{ Exception -> 0x00d7 }
                if (r7 == 0) goto L_0x00cb
                com.tencent.mm.app.i r7 = com.tencent.p014mm.app.C80595i.this     // Catch:{ Exception -> 0x00d7 }
                r2.bindService(r5, r7, r4)     // Catch:{ Exception -> 0x00d7 }
                goto L_0x00e3
            L_0x00cb:
                r2.stopService(r5)     // Catch:{ Exception -> 0x00d7 }
                com.tencent.mm.app.i r7 = com.tencent.p014mm.app.C80595i.this     // Catch:{ Exception -> 0x00d7 }
                r2.bindService(r5, r7, r4)     // Catch:{ Exception -> 0x00d7 }
                r2.startService(r5)     // Catch:{ Exception -> 0x00d7 }
                goto L_0x00e3
            L_0x00d7:
                r2 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r2 = r2.getMessage()
                r4[r3] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)
            L_0x00e3:
                throw r6
            L_0x00e4:
                boolean r6 = com.tencent.p014mm.booter.C28862c.m38402c()     // Catch:{ Exception -> 0x00fc }
                if (r6 == 0) goto L_0x00f0
                com.tencent.mm.app.i r6 = com.tencent.p014mm.app.C80595i.this     // Catch:{ Exception -> 0x00fc }
                r2.bindService(r5, r6, r4)     // Catch:{ Exception -> 0x00fc }
                goto L_0x0108
            L_0x00f0:
                r2.stopService(r5)     // Catch:{ Exception -> 0x00fc }
                com.tencent.mm.app.i r6 = com.tencent.p014mm.app.C80595i.this     // Catch:{ Exception -> 0x00fc }
                r2.bindService(r5, r6, r4)     // Catch:{ Exception -> 0x00fc }
                r2.startService(r5)     // Catch:{ Exception -> 0x00fc }
                goto L_0x0108
            L_0x00fc:
                r2 = move-exception
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r2 = r2.getMessage()
                r5[r3] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r5)
            L_0x0108:
                int r0 = r8.f235788d
                if (r0 != r4) goto L_0x010f
                r8.f235788d = r3
                goto L_0x0112
            L_0x010f:
                int r0 = r0 + r4
                r8.f235788d = r0
            L_0x0112:
                int r0 = com.tencent.p014mm.app.C80595i.m98215d(r4)
                long r5 = (long) r0
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r8, r5)
                java.lang.Object[] r0 = new java.lang.Object[r4]
                int r2 = r8.f235788d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r3] = r2
                java.lang.String r2 = "ZombieWaker posted again with step %d"
                java.lang.String r0 = java.lang.String.format(r2, r0)
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                return
            L_0x012e:
                r0 = move-exception
                com.tencent.mm.app.i r1 = com.tencent.p014mm.app.C80595i.this
                java.util.concurrent.locks.ReentrantLock r1 = r1.f235777d
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80595i.C80599d.run():void");
        }
    }

    /* renamed from: a */
    public static void m98213a(C80595i iVar, ComponentName componentName, IBinder iBinder) {
        iVar.getClass();
        C79546a.m96582f("onServiceConnected");
        if (iBinder == null) {
            Assert.assertTrue("WorkerProfile onServiceConnected binder == null", false);
            CrashReportFactory.reportRawMessage("WorkerProfile onServiceConnected binder == null", "it will result in accInfo being null");
        }
        C27640g0 g0Var = new C27640g0(C26882h.C26883a.m35718a(iBinder));
        g0Var.mo55466a(new C80601j(iVar));
        C114663g0.m161241a(g0Var);
        C86709a0.m107528h();
        C86709a0.m107529k().mo121130e(g0Var);
        C86480a.m107211g();
        if (C86709a0.m107522a()) {
            C86709a0.m107528h();
            if (C86709a0.m107529k().mo121127b() != null) {
                C86709a0.m107528h();
                if (C86709a0.m107529k().mo121127b().mo123464j() != null) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().mo121127b().mo123464j().mo55479j0(true);
                }
            }
        }
        new CoreNetworkReadyEvent().publish();
        C79546a.m96582f("onServiceConnected done");
    }

    /* renamed from: c */
    public static int m98214c(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.CoreServiceConnection", "getPicByProcessName() processName == null");
            return -1;
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                Log.m105924i("MicroMsg.CoreServiceConnection", "getPicByProcessName() processes == null");
                return -1;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next.pid;
                }
            }
            return -1;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.CoreServiceConnection", "getPidByProcessName() %s %s %s", str, e.getClass().getSimpleName(), e.getMessage());
            return -1;
        }
    }

    /* renamed from: d */
    public static int m98215d(boolean z) {
        int i = f235776o;
        if (z) {
            int i2 = f235775n + 1;
            f235775n = i2;
            if (i2 == 5 && i < 600000) {
                int i3 = i + 20000;
                f235776o = i3;
                f235775n = 0;
                Log.m105925i("MicroMsg.CoreServiceConnection", "ZOMBIE_CHECK_TIME:%s", Integer.valueOf(i3));
            }
        }
        return i;
    }

    /* renamed from: e */
    public static void m98216e(int i) {
        try {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/app/CoreServiceConnection", "killProcess", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/app/CoreServiceConnection", "killProcess", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.CoreServiceConnection", "killProcess %s, %s %s", Integer.valueOf(i), e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* renamed from: f */
    public static void m98217f() {
        int c = m98214c(f235774j);
        Log.m105921e("MicroMsg.CoreServiceConnection", "killPushProcess() pid = %s, stack[%s]", Integer.valueOf(c), Util.getStack());
        m98216e(c);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo112309b(Context context) {
        int[] iArr = C79546a.f233229a;
        C86739i0.m107600b("bindCore");
        try {
            this.f235777d.lock();
            IBinder iBinder = this.f235779f;
            boolean z = iBinder != null && iBinder.isBinderAlive();
            Log.m105925i("MicroMsg.CoreServiceConnection", "enter bindCore, isBinding: %b, binderAlive: %b", Boolean.valueOf(this.f235778e), Boolean.valueOf(z));
            boolean z2 = this.f235778e;
            if (z2 || z) {
                Log.m105929w("MicroMsg.CoreServiceConnection", "bindCore reenter, isBinding: %b, binderAlive: %b, return directly.", Boolean.valueOf(z2), Boolean.valueOf(z));
                this.f235777d.unlock();
                return;
            }
            this.f235777d.unlock();
            if (C28862c.m38402c()) {
                Intent intent = new Intent(context, CoreService.class);
                Log.m105924i("MicroMsg.CoreServiceConnection", "prepare dispatcher / bind core service");
                try {
                    if (!context.bindService(intent, this, 1)) {
                        Log.m105920e("MicroMsg.CoreServiceConnection", "bindService failed, may be caused by some crashes");
                        return;
                    }
                    try {
                        this.f235777d.lock();
                        this.f235778e = true;
                        this.f235777d.unlock();
                        synchronized (f235773i) {
                            if (!f235772h) {
                                f235772h = true;
                                Log.m105924i("MicroMsg.CoreServiceConnection", "ZombieWaker posted.");
                                MMHandlerThread.postToMainThreadDelayed(this.f235780g, (long) m98215d(false));
                            }
                        }
                    } catch (Throwable th) {
                        this.f235777d.unlock();
                        throw th;
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.CoreServiceConnection", "CoreServiceConnection bindService Exception:%s", e.getMessage());
                }
            } else if (!C80811b.m98664a(context, "noop", false)) {
                Log.m105924i("MicroMsg.CoreServiceConnection", "ensureServiceInstance return false");
            } else {
                try {
                    this.f235777d.lock();
                    this.f235778e = true;
                    this.f235777d.unlock();
                    synchronized (f235773i) {
                        if (!f235772h) {
                            f235772h = true;
                            Log.m105924i("MicroMsg.CoreServiceConnection", "ZombieWaker posted.");
                            MMHandlerThread.postToMainThreadDelayed(this.f235780g, (long) m98215d(false));
                        }
                    }
                    Intent intent2 = new Intent(context, CoreService.class);
                    Log.m105924i("MicroMsg.CoreServiceConnection", "prepare dispatcher / bind core service");
                    try {
                        if (!context.bindService(intent2, this, 1)) {
                            Log.m105920e("MicroMsg.CoreServiceConnection", "bindService failed, may be caused by some crashes");
                            this.f235777d.lock();
                            this.f235778e = false;
                            this.f235777d.unlock();
                            C28862c.m38404e();
                        }
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.CoreServiceConnection", "bindCore() bindService Exception:%S", e2.getMessage());
                    } catch (Throwable th4) {
                        this.f235777d.unlock();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    this.f235777d.unlock();
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            this.f235777d.unlock();
            throw th6;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.m105928w("MicroMsg.CoreServiceConnection", "onServiceConnected ");
        m98214c(f235774j);
        if (C28862c.m38402c()) {
            if (iBinder == null) {
                Log.m105928w("MicroMsg.CoreServiceConnection", "onServiceConnected binder == null");
            } else if (C86709a0.m107531m().mo58407a().mo71804b()) {
                synchronized (f235773i) {
                    Log.m105924i("MicroMsg.CoreServiceConnection", "remove zombie killer.");
                    MMHandlerThread.removeRunnable(this.f235780g);
                    this.f235780g.f235788d = 0;
                    f235772h = false;
                }
                try {
                    this.f235777d.lock();
                    this.f235778e = false;
                    IBinder iBinder2 = this.f235779f;
                    if (iBinder2 == null || !Util.isEqual(iBinder2.hashCode(), iBinder.hashCode())) {
                        this.f235779f = iBinder;
                        this.f235777d.unlock();
                        C79547b.f233255g.mo109607a(new C80596a(componentName, iBinder));
                        return;
                    }
                    Log.m105928w("MicroMsg.CoreServiceConnection", "onServiceConnected binder == serviceBinder");
                } finally {
                    this.f235777d.unlock();
                }
            }
        } else if (C86709a0.m107531m().mo58407a().mo71804b()) {
            synchronized (f235773i) {
                Log.m105924i("MicroMsg.CoreServiceConnection", "remove zombie killer.");
                MMHandlerThread.removeRunnable(this.f235780g);
                this.f235780g.f235788d = 0;
                f235772h = false;
            }
            try {
                this.f235777d.lock();
                this.f235778e = false;
                this.f235779f = iBinder;
                this.f235777d.unlock();
                C79547b.f233255g.mo109607a(new C80597b(componentName, iBinder));
            } catch (Throwable th) {
                this.f235777d.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void onServiceDisconnected(ComponentName componentName) {
        Log.m105928w("MicroMsg.CoreServiceConnection", "onServiceDisconnected ");
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            try {
                this.f235777d.lock();
                this.f235778e = false;
                this.f235779f = null;
                this.f235777d.unlock();
                C79547b.f233255g.mo109607a(new C80598c(componentName));
            } catch (Throwable th) {
                this.f235777d.unlock();
                throw th;
            }
        }
    }
}
