package com.tencent.matrix.backtrace;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import com.tencent.matrix.xlog.XLogNative;
import j20.C117292a;
import java.util.concurrent.atomic.AtomicInteger;
import k20.C60958c;
import k20.C9556a;
import p723vf.C118672d;
import p723vf.C90778c;

public class WarmUpService extends Service {

    /* renamed from: f */
    public static volatile boolean f342921f;

    /* renamed from: g */
    public static volatile boolean f342922g;

    /* renamed from: h */
    public static HandlerThread f342923h;

    /* renamed from: i */
    public static Handler f342924i;

    /* renamed from: j */
    public static final AtomicInteger f342925j = new AtomicInteger(0);

    /* renamed from: n */
    public static final byte[] f342926n = new byte[0];

    /* renamed from: d */
    public final Messenger f342927d = new Messenger(new C114395a(C90778c.m113844b().getLooper()));

    /* renamed from: e */
    public final C114405e f342928e = new C114405e();

    /* renamed from: com.tencent.matrix.backtrace.WarmUpService$b */
    public static final class C80362b implements Handler.Callback {
        public C80362b(C114395a aVar) {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                C118672d.m167353c("Matrix.WarmUpService", "Suicide.", new Object[0]);
                int myPid = Process.myPid();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(myPid));
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/backtrace/WarmUpService$RecyclerCallback", "handleMessage", "(Landroid/os/Message;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/matrix/backtrace/WarmUpService$RecyclerCallback", "handleMessage", "(Landroid/os/Message;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                Object obj2 = new Object();
                C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/matrix/backtrace/WarmUpService$RecyclerCallback", "handleMessage", "(Landroid/os/Message;)Z", "java/lang/System_EXEC_", "exit", "(I)V");
                System.exit(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(obj2, "com/tencent/matrix/backtrace/WarmUpService$RecyclerCallback", "handleMessage", "(Landroid/os/Message;)Z", "java/lang/System_EXEC_", "exit", "(I)V");
            }
            return false;
        }
    }

    /* renamed from: com.tencent.matrix.backtrace.WarmUpService$a */
    public class C114395a extends Handler {
        public C114395a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[Catch:{ all -> 0x0070 }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[SYNTHETIC, Splitter:B:34:0x0085] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4 A[Catch:{ all -> 0x0070 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00b3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r14) {
            /*
                r13 = this;
                super.handleMessage(r14)
                java.lang.Object r0 = r14.obj
                boolean r1 = r0 instanceof android.os.Bundle
                if (r1 == 0) goto L_0x016f
                android.os.Bundle r0 = (android.os.Bundle) r0
                java.lang.String r1 = "invoke-args"
                android.os.Bundle r1 = r0.getBundle(r1)
                java.lang.String r2 = "invoke-resp"
                android.os.IBinder r0 = r0.getBinder(r2)
                com.tencent.matrix.backtrace.WarmUpService r2 = com.tencent.matrix.backtrace.WarmUpService.this
                int r3 = r14.what
                boolean r4 = com.tencent.matrix.backtrace.WarmUpService.f342921f
                monitor-enter(r2)
                java.lang.String r4 = "Matrix.WarmUpService"
                java.lang.String r5 = "Remove scheduled suicide"
                r6 = 0
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x016c }
                p723vf.C118672d.m167353c(r4, r5, r7)     // Catch:{ all -> 0x016c }
                byte[] r4 = com.tencent.matrix.backtrace.WarmUpService.f342926n     // Catch:{ all -> 0x016c }
                monitor-enter(r4)     // Catch:{ all -> 0x016c }
                android.os.Handler r5 = com.tencent.matrix.backtrace.WarmUpService.f342924i     // Catch:{ all -> 0x0169 }
                r7 = 1
                r5.removeMessages(r7)     // Catch:{ all -> 0x0169 }
                java.util.concurrent.atomic.AtomicInteger r5 = com.tencent.matrix.backtrace.WarmUpService.f342925j     // Catch:{ all -> 0x0169 }
                r5.getAndIncrement()     // Catch:{ all -> 0x0169 }
                monitor-exit(r4)     // Catch:{ all -> 0x0169 }
                android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x0070 }
                r4.<init>()     // Catch:{ all -> 0x0070 }
                java.lang.String r5 = "warm-up-result"
                r8 = -1
                r4.putInt(r5, r8)     // Catch:{ all -> 0x0070 }
                r5 = 0
                if (r1 != 0) goto L_0x0054
                java.lang.String r1 = "Matrix.WarmUpService"
                java.lang.String r3 = "Args is null."
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0070 }
                p723vf.C118672d.m167353c(r1, r3, r7)     // Catch:{ all -> 0x0070 }
                com.tencent.matrix.backtrace.WarmUpService.m160934a(r6)     // Catch:{ all -> 0x016c }
                monitor-exit(r2)
                goto L_0x014b
            L_0x0054:
                java.lang.String r8 = "saving-path"
                java.lang.String r8 = r1.getString(r8, r5)     // Catch:{ all -> 0x0070 }
                java.lang.String r9 = "Matrix.WarmUpService"
                java.lang.String r10 = "Invoke from client with savingPath: %s."
                java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x0070 }
                r11[r6] = r8     // Catch:{ all -> 0x0070 }
                p723vf.C118672d.m167353c(r9, r10, r11)     // Catch:{ all -> 0x0070 }
                if (r8 == 0) goto L_0x0073
                boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x0070 }
                if (r9 == 0) goto L_0x006e
                goto L_0x0073
            L_0x006e:
                r9 = 0
                goto L_0x0074
            L_0x0070:
                r14 = move-exception
                goto L_0x0165
            L_0x0073:
                r9 = 1
            L_0x0074:
                if (r9 == 0) goto L_0x0085
                java.lang.String r1 = "Matrix.WarmUpService"
                java.lang.String r3 = "Saving path is empty."
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0070 }
                p723vf.C118672d.m167353c(r1, r3, r7)     // Catch:{ all -> 0x0070 }
                com.tencent.matrix.backtrace.WarmUpService.m160934a(r6)     // Catch:{ all -> 0x016c }
                monitor-exit(r2)
                goto L_0x014b
            L_0x0085:
                com.tencent.matrix.backtrace.e r9 = r2.f342928e     // Catch:{ all -> 0x0070 }
                r9.f342951b = r8     // Catch:{ all -> 0x0070 }
                com.tencent.matrix.backtrace.WeChatBacktraceNative.setSavingPath(r8)     // Catch:{ all -> 0x0070 }
                r8 = 100
                if (r3 != r8) goto L_0x0138
                java.lang.String r3 = "path-of-elf"
                java.lang.String r3 = r1.getString(r3, r5)     // Catch:{ all -> 0x0070 }
                if (r3 == 0) goto L_0x00a1
                boolean r8 = r3.isEmpty()     // Catch:{ all -> 0x0070 }
                if (r8 == 0) goto L_0x009f
                goto L_0x00a1
            L_0x009f:
                r8 = 0
                goto L_0x00a2
            L_0x00a1:
                r8 = 1
            L_0x00a2:
                if (r8 == 0) goto L_0x00b3
                java.lang.String r1 = "Matrix.WarmUpService"
                java.lang.String r3 = "Warm-up so path is empty."
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0070 }
                p723vf.C118672d.m167353c(r1, r3, r7)     // Catch:{ all -> 0x0070 }
                com.tencent.matrix.backtrace.WarmUpService.m160934a(r6)     // Catch:{ all -> 0x016c }
                monitor-exit(r2)
                goto L_0x014b
            L_0x00b3:
                java.lang.String r8 = "elf-start-offset"
                int r1 = r1.getInt(r8, r6)     // Catch:{ all -> 0x0070 }
                java.lang.String r8 = "Matrix.WarmUpService"
                java.lang.String r9 = "Warm up so path %s offset %s."
                r10 = 2
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0070 }
                r11[r6] = r3     // Catch:{ all -> 0x0070 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0070 }
                r11[r7] = r12     // Catch:{ all -> 0x0070 }
                p723vf.C118672d.m167353c(r8, r9, r11)     // Catch:{ all -> 0x0070 }
                java.lang.String r8 = com.tencent.matrix.backtrace.C114417j.m160956k(r3, r1)     // Catch:{ all -> 0x0070 }
                int r9 = com.tencent.matrix.backtrace.C114417j.C114418a.m160959a(r2, r8)     // Catch:{ all -> 0x0070 }
                r11 = 3
                if (r9 < r11) goto L_0x00d8
                r8 = 0
                goto L_0x00ea
            L_0x00d8:
                java.util.Map<java.lang.String, java.lang.Integer> r11 = com.tencent.matrix.backtrace.C114417j.C114418a.f342996a     // Catch:{ all -> 0x0070 }
                int r9 = r9 + r7
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0070 }
                java.util.HashMap r11 = (java.util.HashMap) r11     // Catch:{ all -> 0x0070 }
                r11.put(r8, r9)     // Catch:{ all -> 0x0070 }
                java.util.Map<java.lang.String, java.lang.Integer> r8 = com.tencent.matrix.backtrace.C114417j.C114418a.f342996a     // Catch:{ all -> 0x0070 }
                com.tencent.matrix.backtrace.C114417j.m160949d(r2, r8)     // Catch:{ all -> 0x0070 }
                r8 = 1
            L_0x00ea:
                if (r8 != 0) goto L_0x00ee
                r1 = -3
                goto L_0x0132
            L_0x00ee:
                boolean r8 = com.tencent.matrix.backtrace.WeChatBacktraceNative.warmUp(r3, r1, r7)     // Catch:{ all -> 0x0070 }
                boolean r9 = com.tencent.matrix.backtrace.WeChatBacktraceNative.testLoadQut(r3, r1)     // Catch:{ all -> 0x0070 }
                if (r9 != 0) goto L_0x010a
                java.lang.String r8 = "Matrix.WarmUpService"
                java.lang.String r9 = "Warm up elf %s:%s success, but test load qut failed!"
                java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0070 }
                r10[r6] = r3     // Catch:{ all -> 0x0070 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0070 }
                r10[r7] = r11     // Catch:{ all -> 0x0070 }
                p723vf.C118672d.m167356f(r8, r9, r10)     // Catch:{ all -> 0x0070 }
                r8 = 0
            L_0x010a:
                java.lang.String r1 = com.tencent.matrix.backtrace.C114417j.m160956k(r3, r1)     // Catch:{ all -> 0x0070 }
                int r3 = com.tencent.matrix.backtrace.C114417j.C114418a.m160959a(r2, r1)     // Catch:{ all -> 0x0070 }
                if (r8 == 0) goto L_0x011c
                java.util.Map<java.lang.String, java.lang.Integer> r3 = com.tencent.matrix.backtrace.C114417j.C114418a.f342996a     // Catch:{ all -> 0x0070 }
                java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x0070 }
                r3.remove(r1)     // Catch:{ all -> 0x0070 }
                goto L_0x0128
            L_0x011c:
                java.util.Map<java.lang.String, java.lang.Integer> r9 = com.tencent.matrix.backtrace.C114417j.C114418a.f342996a     // Catch:{ all -> 0x0070 }
                int r3 = r3 + r7
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0070 }
                java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ all -> 0x0070 }
                r9.put(r1, r3)     // Catch:{ all -> 0x0070 }
            L_0x0128:
                java.util.Map<java.lang.String, java.lang.Integer> r1 = com.tencent.matrix.backtrace.C114417j.C114418a.f342996a     // Catch:{ all -> 0x0070 }
                com.tencent.matrix.backtrace.C114417j.m160949d(r2, r1)     // Catch:{ all -> 0x0070 }
                if (r8 == 0) goto L_0x0131
                r1 = 0
                goto L_0x0132
            L_0x0131:
                r1 = -2
            L_0x0132:
                java.lang.String r3 = "warm-up-result"
                r4.putInt(r3, r1)     // Catch:{ all -> 0x0070 }
                goto L_0x0147
            L_0x0138:
                java.lang.String r1 = "Matrix.WarmUpService"
                java.lang.String r8 = "Unknown cmd: %s"
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0070 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0070 }
                r7[r6] = r3     // Catch:{ all -> 0x0070 }
                p723vf.C118672d.m167356f(r1, r8, r7)     // Catch:{ all -> 0x0070 }
            L_0x0147:
                com.tencent.matrix.backtrace.WarmUpService.m160934a(r6)     // Catch:{ all -> 0x016c }
                monitor-exit(r2)
            L_0x014b:
                android.os.Messenger r1 = new android.os.Messenger
                r1.<init>(r0)
                int r14 = r14.what     // Catch:{ RemoteException -> 0x015a }
                android.os.Message r14 = android.os.Message.obtain(r5, r14, r4)     // Catch:{ RemoteException -> 0x015a }
                r1.send(r14)     // Catch:{ RemoteException -> 0x015a }
                goto L_0x016f
            L_0x015a:
                r14 = move-exception
                java.lang.String r0 = "Matrix.WarmUpService"
                java.lang.String r1 = ""
                java.lang.Object[] r2 = new java.lang.Object[r6]
                p723vf.C118672d.m167354d(r0, r14, r1, r2)
                goto L_0x016f
            L_0x0165:
                com.tencent.matrix.backtrace.WarmUpService.m160934a(r6)     // Catch:{ all -> 0x016c }
                throw r14     // Catch:{ all -> 0x016c }
            L_0x0169:
                r14 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0169 }
                throw r14     // Catch:{ all -> 0x016c }
            L_0x016c:
                r14 = move-exception
                monitor-exit(r2)
                throw r14
            L_0x016f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.backtrace.WarmUpService.C114395a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.tencent.matrix.backtrace.WarmUpService$c */
    public static final class C114396c {

        /* renamed from: a */
        public volatile Messenger f342930a;

        /* renamed from: b */
        public volatile Messenger f342931b;

        /* renamed from: c */
        public final Bundle[] f342932c = {null};

        /* renamed from: d */
        public final HandlerThread[] f342933d = {null};

        /* renamed from: e */
        public ServiceConnection f342934e = new C114397a();

        /* renamed from: f */
        public final boolean[] f342935f = {false};

        /* renamed from: com.tencent.matrix.backtrace.WarmUpService$c$a */
        public class C114397a implements ServiceConnection {
            public C114397a() {
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C114396c.this.f342931b = new Messenger(iBinder);
                synchronized (C114396c.this.f342935f) {
                    boolean[] zArr = C114396c.this.f342935f;
                    zArr[0] = true;
                    zArr.notifyAll();
                }
                C118672d.m167353c("Matrix.WarmUpInvoker", "This remote invoker(%s) connected.", this);
            }

            public void onServiceDisconnected(ComponentName componentName) {
                C114396c.this.f342931b = null;
                synchronized (C114396c.this.f342935f) {
                    boolean[] zArr = C114396c.this.f342935f;
                    zArr[0] = false;
                    zArr.notifyAll();
                }
                C118672d.m167353c("Matrix.WarmUpInvoker", "This remote invoker(%s) disconnected.", this);
                synchronized (C114396c.this.f342932c) {
                    Bundle[] bundleArr = C114396c.this.f342932c;
                    bundleArr[0] = null;
                    bundleArr.notifyAll();
                }
            }
        }

        /* renamed from: a */
        public void mo173567a(Context context) {
            try {
                context.unbindService(this.f342934e);
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.WarmUpInvoker", th, "", new Object[0]);
            }
            C118672d.m167353c("Matrix.WarmUpInvoker", "Start disconnecting to remote. (%s)", Integer.valueOf(hashCode()));
            synchronized (this.f342933d) {
                HandlerThread handlerThread = this.f342933d[0];
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    this.f342933d[0] = null;
                }
            }
            synchronized (this.f342932c) {
                Bundle[] bundleArr = this.f342932c;
                bundleArr[0] = null;
                bundleArr.notifyAll();
            }
        }
    }

    /* renamed from: a */
    public static void m160934a(boolean z) {
        C118672d.m167353c("Matrix.WarmUpService", "Schedule suicide", new Object[0]);
        synchronized (f342926n) {
            if (z) {
                f342924i.sendEmptyMessageDelayed(1, 60000);
            } else if (f342925j.decrementAndGet() == 0) {
                f342924i.sendEmptyMessageDelayed(1, 60000);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        if (!f342922g) {
            synchronized (WarmUpService.class) {
                if (!f342922g) {
                    C118672d.m167353c("Matrix.WarmUpService", "Init called.", new Object[0]);
                    C114419k.m160963d();
                    boolean booleanExtra = intent.getBooleanExtra("enable-logger", false);
                    String stringExtra = intent.getStringExtra("path-of-xlog-so");
                    C118672d.m167353c("Matrix.WarmUpService", "Enable logger: %s", Boolean.valueOf(booleanExtra));
                    C118672d.m167353c("Matrix.WarmUpService", "Path of XLog: %s", stringExtra);
                    XLogNative.m161209a(stringExtra);
                    WeChatBacktraceNative.enableLogger(booleanExtra);
                    f342922g = true;
                }
            }
        }
        return this.f342927d.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        if (!f342921f) {
            synchronized (WarmUpService.class) {
                if (!f342921f) {
                    synchronized (f342926n) {
                        if (f342923h == null) {
                            HandlerThread handlerThread = new HandlerThread("backtrace-recycler");
                            f342923h = handlerThread;
                            handlerThread.start();
                            f342924i = new Handler(f342923h.getLooper(), new C80362b((C114395a) null));
                        }
                    }
                    m160934a(true);
                    f342921f = true;
                }
            }
        }
    }
}
