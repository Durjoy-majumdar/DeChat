package com.tencent.matrix.backtrace;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.tencent.matrix.backtrace.C114417j;
import com.tencent.matrix.backtrace.C114419k;
import com.tencent.matrix.backtrace.WarmUpService;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import p1069zd.C119094b;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.backtrace.e */
public class C114405e {

    /* renamed from: h */
    public static volatile C114410f f342949h;

    /* renamed from: a */
    public boolean f342950a = false;

    /* renamed from: b */
    public String f342951b;

    /* renamed from: c */
    public C114409d f342952c;

    /* renamed from: d */
    public C114408c f342953d;

    /* renamed from: e */
    public C114413h f342954e;

    /* renamed from: f */
    public C114419k.C114420a f342955f;

    /* renamed from: g */
    public final boolean[] f342956g = {false};

    /* renamed from: com.tencent.matrix.backtrace.e$a */
    public static final class C114406a implements C119094b {
        public C114406a(C114398a aVar) {
        }

        /* renamed from: a */
        public boolean mo173577a(String str, int i) {
            return WeChatBacktraceNative.warmUp(str, i, false);
        }
    }

    /* renamed from: com.tencent.matrix.backtrace.e$b */
    public static final class C114407b implements C119094b {

        /* renamed from: a */
        public WarmUpService.C114396c f342957a = new WarmUpService.C114396c();

        /* renamed from: b */
        public final String f342958b;

        /* renamed from: c */
        public Context f342959c;

        /* renamed from: d */
        public Bundle f342960d;

        public C114407b(String str) {
            this.f342958b = str;
        }

        /* renamed from: a */
        public boolean mo173577a(String str, int i) {
            Bundle bundle;
            if (!this.f342957a.f342935f[0] && !mo173578b(this.f342959c, this.f342960d)) {
                return false;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("saving-path", this.f342958b);
            bundle2.putString("path-of-elf", str);
            bundle2.putInt("elf-start-offset", i);
            WarmUpService.C114396c cVar = this.f342957a;
            cVar.getClass();
            Bundle bundle3 = null;
            try {
                Messenger messenger = cVar.f342931b;
                if (messenger != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putBundle("invoke-args", bundle2);
                    bundle4.putBinder("invoke-resp", cVar.f342930a.getBinder());
                    messenger.send(Message.obtain((Handler) null, 100, bundle4));
                    synchronized (cVar.f342932c) {
                        Bundle[] bundleArr = cVar.f342932c;
                        bundleArr[0] = null;
                        bundleArr.wait(300000);
                        bundle = cVar.f342932c[0];
                    }
                    bundle3 = bundle;
                }
            } catch (RemoteException | InterruptedException e) {
                C118672d.m167354d("Matrix.WarmUpInvoker", e, "", new Object[0]);
            }
            int i2 = bundle3 != null ? bundle3.getInt("warm-up-result") : -100;
            boolean z = i2 == 0;
            if (z) {
                WeChatBacktraceNative.notifyWarmedUp(str, i);
            }
            C118672d.m167353c("Matrix.WarmUpDelegate", "Warm-up %s:%s - retCode %s", str, Integer.valueOf(i), Integer.valueOf(i2));
            return z;
        }

        /* renamed from: b */
        public boolean mo173578b(Context context, Bundle bundle) {
            this.f342959c = context;
            this.f342960d = bundle;
            WarmUpService.C114396c cVar = this.f342957a;
            cVar.getClass();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new RuntimeException("Should not call this from main thread!");
            } else if (cVar.f342935f[0]) {
                return true;
            } else {
                C118672d.m167353c("Matrix.WarmUpInvoker", "Start connecting to remote. (%s)", Integer.valueOf(cVar.hashCode()));
                synchronized (cVar.f342933d) {
                    HandlerThread handlerThread = cVar.f342933d[0];
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                        cVar.f342933d[0] = null;
                    }
                    HandlerThread[] handlerThreadArr = cVar.f342933d;
                    handlerThreadArr[0] = new HandlerThread("warm-up-remote-invoker-" + cVar.hashCode());
                    cVar.f342933d[0].start();
                    cVar.f342930a = new Messenger(new C114416i(cVar, cVar.f342933d[0].getLooper()));
                }
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, WarmUpService.class));
                intent.putExtra("enable-logger", bundle.getBoolean("enable-logger", false));
                intent.putExtra("path-of-xlog-so", bundle.getString("path-of-xlog-so", (String) null));
                context.bindService(intent, cVar.f342934e, 1);
                try {
                    synchronized (cVar.f342935f) {
                        boolean[] zArr = cVar.f342935f;
                        if (!zArr[0]) {
                            zArr.wait(60000);
                        }
                    }
                } catch (InterruptedException e) {
                    C118672d.m167354d("Matrix.WarmUpInvoker", e, "", new Object[0]);
                }
                if (!cVar.f342935f[0]) {
                    cVar.mo173567a(context);
                }
                return cVar.f342935f[0];
            }
        }
    }

    /* renamed from: com.tencent.matrix.backtrace.e$c */
    public static final class C114408c implements Runnable, Handler.Callback {

        /* renamed from: d */
        public String f342961d;

        /* renamed from: e */
        public Thread f342962e;

        /* renamed from: f */
        public HashMap<String, Runnable> f342963f = new HashMap<>();

        /* renamed from: g */
        public Queue<String> f342964g = new LinkedList();

        /* renamed from: h */
        public Handler f342965h = new Handler(Looper.getMainLooper(), this);

        /* renamed from: i */
        public long[] f342966i = {0};

        public C114408c(String str) {
            this.f342961d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r3 = r2.f342962e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
            if (r3 == null) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            if (r3.isAlive() != false) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
            r3 = new java.lang.Thread(r2, r2.f342961d);
            r2.f342962e = r3;
            r3.start();
            r2.f342965h.removeMessages(1);
            r2.f342965h.sendEmptyMessageDelayed(1, 300000);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            monitor-enter(r2);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo173579a(java.lang.Runnable r3, java.lang.String r4) {
            /*
                r2 = this;
                java.util.Queue<java.lang.String> r0 = r2.f342964g
                monitor-enter(r0)
                java.util.Queue<java.lang.String> r1 = r2.f342964g     // Catch:{ all -> 0x0046 }
                java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x0046 }
                boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x0046 }
                if (r1 == 0) goto L_0x000f
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                return
            L_0x000f:
                java.util.Queue<java.lang.String> r1 = r2.f342964g     // Catch:{ all -> 0x0046 }
                java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x0046 }
                r1.add(r4)     // Catch:{ all -> 0x0046 }
                java.util.HashMap<java.lang.String, java.lang.Runnable> r1 = r2.f342963f     // Catch:{ all -> 0x0046 }
                r1.put(r4, r3)     // Catch:{ all -> 0x0046 }
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                monitor-enter(r2)
                java.lang.Thread r3 = r2.f342962e     // Catch:{ all -> 0x0043 }
                if (r3 == 0) goto L_0x0027
                boolean r3 = r3.isAlive()     // Catch:{ all -> 0x0043 }
                if (r3 != 0) goto L_0x0041
            L_0x0027:
                java.lang.Thread r3 = new java.lang.Thread     // Catch:{ all -> 0x0043 }
                java.lang.String r4 = r2.f342961d     // Catch:{ all -> 0x0043 }
                r3.<init>(r2, r4)     // Catch:{ all -> 0x0043 }
                r2.f342962e = r3     // Catch:{ all -> 0x0043 }
                r3.start()     // Catch:{ all -> 0x0043 }
                android.os.Handler r3 = r2.f342965h     // Catch:{ all -> 0x0043 }
                r4 = 1
                r3.removeMessages(r4)     // Catch:{ all -> 0x0043 }
                android.os.Handler r3 = r2.f342965h     // Catch:{ all -> 0x0043 }
                r0 = 300000(0x493e0, double:1.482197E-318)
                r3.sendEmptyMessageDelayed(r4, r0)     // Catch:{ all -> 0x0043 }
            L_0x0041:
                monitor-exit(r2)     // Catch:{ all -> 0x0043 }
                return
            L_0x0043:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0043 }
                throw r3
            L_0x0046:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.backtrace.C114405e.C114408c.mo173579a(java.lang.Runnable, java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
            r7 = com.tencent.matrix.backtrace.C114405e.f342949h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
            if (r7 == null) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
            ((com.tencent.p014mm.plugin.performance.diagnostic.C115656c) r7).mo175880a(com.tencent.matrix.backtrace.C114410f.C114411a.f342970f, new java.lang.Object[0]);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r7) {
            /*
                r6 = this;
                int r7 = r7.what
                r0 = 0
                r1 = 1
                if (r7 != r1) goto L_0x0027
                long[] r7 = r6.f342966i
                monitor-enter(r7)
                long[] r1 = r6.f342966i     // Catch:{ all -> 0x0024 }
                r2 = r1[r0]     // Catch:{ all -> 0x0024 }
                r4 = 0
                int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r1 != 0) goto L_0x0015
                monitor-exit(r7)     // Catch:{ all -> 0x0024 }
                return r0
            L_0x0015:
                monitor-exit(r7)     // Catch:{ all -> 0x0024 }
                com.tencent.matrix.backtrace.f r7 = com.tencent.matrix.backtrace.C114405e.f342949h
                if (r7 == 0) goto L_0x0027
                com.tencent.matrix.backtrace.f$a r1 = com.tencent.matrix.backtrace.C114410f.C114411a.WarmUpThreadBlocked
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.tencent.mm.plugin.performance.diagnostic.c r7 = (com.tencent.p014mm.plugin.performance.diagnostic.C115656c) r7
                r7.mo175880a(r1, r2)
                goto L_0x0027
            L_0x0024:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0024 }
                throw r0
            L_0x0027:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.backtrace.C114405e.C114408c.handleMessage(android.os.Message):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
            if (r6 != null) goto L_0x00a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
            r0 = r11.f342966i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            r11.f342966i[0] = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
            r11.f342965h.removeMessages(1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a2, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                long[] r0 = r11.f342966i
                monitor-enter(r0)
                long[] r1 = r11.f342966i     // Catch:{ all -> 0x00be }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00be }
                r4 = 0
                r1[r4] = r2     // Catch:{ all -> 0x00be }
                monitor-exit(r0)     // Catch:{ all -> 0x00be }
                r0 = 0
                r1 = r0
            L_0x000f:
                r2 = 0
                r5 = 1
                if (r0 == 0) goto L_0x0069
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ac }
                java.lang.String r8 = "Matrix.WarmUpDelegate"
                java.lang.String r9 = "Before '%s' task execution.."
                java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ac }
                r10[r4] = r1     // Catch:{ all -> 0x00ac }
                p723vf.C118672d.m167353c(r8, r9, r10)     // Catch:{ all -> 0x00ac }
                r0.run()     // Catch:{ all -> 0x00ac }
                java.lang.String r0 = "Matrix.WarmUpDelegate"
                java.lang.String r8 = "After '%s' task execution.."
                java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ac }
                r9[r4] = r1     // Catch:{ all -> 0x00ac }
                p723vf.C118672d.m167353c(r0, r8, r9)     // Catch:{ all -> 0x00ac }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ac }
                long r8 = r8 - r6
                com.tencent.matrix.backtrace.f r0 = com.tencent.matrix.backtrace.C114405e.f342949h     // Catch:{ all -> 0x00ac }
                if (r0 == 0) goto L_0x0069
                java.lang.String r6 = "warm-up"
                boolean r6 = r6.equalsIgnoreCase(r1)     // Catch:{ all -> 0x00ac }
                if (r6 == 0) goto L_0x0052
                com.tencent.matrix.backtrace.f$a r1 = com.tencent.matrix.backtrace.C114410f.C114411a.WarmUpDuration     // Catch:{ all -> 0x00ac }
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ac }
                java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00ac }
                r6[r4] = r7     // Catch:{ all -> 0x00ac }
                com.tencent.mm.plugin.performance.diagnostic.c r0 = (com.tencent.p014mm.plugin.performance.diagnostic.C115656c) r0     // Catch:{ all -> 0x00ac }
                r0.mo175880a(r1, r6)     // Catch:{ all -> 0x00ac }
                goto L_0x0069
            L_0x0052:
                java.lang.String r6 = "consuming-up"
                boolean r1 = r6.equalsIgnoreCase(r1)     // Catch:{ all -> 0x00ac }
                if (r1 == 0) goto L_0x0069
                com.tencent.matrix.backtrace.f$a r1 = com.tencent.matrix.backtrace.C114410f.C114411a.ConsumeRequestDuration     // Catch:{ all -> 0x00ac }
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ac }
                java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00ac }
                r6[r4] = r7     // Catch:{ all -> 0x00ac }
                com.tencent.mm.plugin.performance.diagnostic.c r0 = (com.tencent.p014mm.plugin.performance.diagnostic.C115656c) r0     // Catch:{ all -> 0x00ac }
                r0.mo175880a(r1, r6)     // Catch:{ all -> 0x00ac }
            L_0x0069:
                java.util.Queue<java.lang.String> r0 = r11.f342964g     // Catch:{ all -> 0x00ac }
                monitor-enter(r0)     // Catch:{ all -> 0x00ac }
                java.util.Queue<java.lang.String> r1 = r11.f342964g     // Catch:{ all -> 0x00a9 }
                java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x00a9 }
                java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00a9 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00a9 }
                if (r1 != 0) goto L_0x008a
                monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
                long[] r1 = r11.f342966i
                monitor-enter(r1)
                long[] r0 = r11.f342966i     // Catch:{ all -> 0x0087 }
                r0[r4] = r2     // Catch:{ all -> 0x0087 }
                monitor-exit(r1)     // Catch:{ all -> 0x0087 }
                android.os.Handler r0 = r11.f342965h
                r0.removeMessages(r5)
                return
            L_0x0087:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0087 }
                throw r0
            L_0x008a:
                java.util.HashMap<java.lang.String, java.lang.Runnable> r6 = r11.f342963f     // Catch:{ all -> 0x00a9 }
                java.lang.Object r6 = r6.remove(r1)     // Catch:{ all -> 0x00a9 }
                java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch:{ all -> 0x00a9 }
                monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
                if (r6 != 0) goto L_0x00a6
                long[] r0 = r11.f342966i
                monitor-enter(r0)
                long[] r1 = r11.f342966i     // Catch:{ all -> 0x00a3 }
                r1[r4] = r2     // Catch:{ all -> 0x00a3 }
                monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
                android.os.Handler r0 = r11.f342965h
                r0.removeMessages(r5)
                return
            L_0x00a3:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
                throw r1
            L_0x00a6:
                r0 = r6
                goto L_0x000f
            L_0x00a9:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
                throw r1     // Catch:{ all -> 0x00ac }
            L_0x00ac:
                r0 = move-exception
                long[] r1 = r11.f342966i
                monitor-enter(r1)
                long[] r6 = r11.f342966i     // Catch:{ all -> 0x00bb }
                r6[r4] = r2     // Catch:{ all -> 0x00bb }
                monitor-exit(r1)     // Catch:{ all -> 0x00bb }
                android.os.Handler r1 = r11.f342965h
                r1.removeMessages(r5)
                throw r0
            L_0x00bb:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00bb }
                throw r0
            L_0x00be:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00be }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.backtrace.C114405e.C114408c.run():void");
        }
    }

    /* renamed from: com.tencent.matrix.backtrace.e$d */
    public static final class C114409d extends BroadcastReceiver {

        /* renamed from: a */
        public C114419k.C114421b f342967a;

        public C114409d(C114419k.C114421b bVar) {
            this.f342967a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            C118672d.m167353c("Matrix.WarmUpDelegate", "Warm-up received.", new Object[0]);
            String action = intent.getAction();
            if (action != null && action.equals("action.backtrace.warmed-up")) {
                WeChatBacktraceNative.setWarmedUp(true);
                C114419k.C114421b bVar = this.f342967a;
                if (bVar == C114419k.C114421b.FpUntilQuickenWarmedUp || bVar == C114419k.C114421b.DwarfUntilQuickenWarmedUp) {
                    WeChatBacktraceNative.setBacktraceMode(1);
                }
                try {
                    context.unregisterReceiver(this);
                } catch (Throwable th) {
                    C118672d.m167354d("Matrix.WarmUpDelegate", th, "Unregister receiver twice.", new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public static C119094b m160936a(C114405e eVar) {
        if (!eVar.f342950a) {
            return new C114406a((C114398a) null);
        }
        C114407b bVar = new C114407b(eVar.f342951b);
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable-logger", eVar.f342955f.f343015l);
        bundle.putString("path-of-xlog-so", eVar.f342955f.f343016m);
        if (bVar.mo173578b(eVar.f342955f.f343004a, bundle)) {
            return bVar;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m160937b(C114405e eVar, String str, int i) {
        boolean z = !(C114417j.C114418a.m160959a(eVar.f342955f.f343004a, C114417j.m160956k(str, i)) < 3);
        if (z) {
            C118672d.m167356f("Matrix.WarmUpDelegate", "Elf file %s:%s has blocked and will not do warm-up.", str, Integer.valueOf(i));
        }
        return z;
    }

    /* renamed from: c */
    public static void m160938c(C114405e eVar, C119094b bVar) {
        if (eVar.f342950a) {
            ((C114407b) bVar).f342957a.mo173567a(eVar.f342955f.f343004a);
        }
    }
}
