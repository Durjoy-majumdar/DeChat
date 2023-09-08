package com.tencent.matrix.batterycanary.monitor.feature;

import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.os.WorkSource;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1177ce.C113314g;
import p1190de.C116608a;
import p723vf.C118672d;
import p981ie.C117168o;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.q0 */
public final class C114519q0 extends C116608a {

    /* renamed from: b */
    public long f343262b;

    /* renamed from: c */
    public final Map<IBinder, C114524d> f343263c = new ConcurrentHashMap(2);

    /* renamed from: d */
    public final C80372e f343264d = new C80372e();

    /* renamed from: e */
    public C117168o.C117171c f343265e;

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.q0$e */
    public static final class C80372e {

        /* renamed from: a */
        public final byte[] f235253a = new byte[0];

        /* renamed from: b */
        public int f235254b;

        /* renamed from: c */
        public long f235255c;

        /* renamed from: d */
        public int f235256d;

        /* renamed from: e */
        public int f235257e;
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.q0$a */
    public class C114520a implements C117168o.C117171c {

        /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.q0$a$a */
        public class C114521a implements C114524d.C114525a {

            /* renamed from: a */
            public final /* synthetic */ C114524d f343267a;

            public C114521a(C114524d dVar) {
                this.f343267a = dVar;
            }
        }

        public C114520a() {
        }

        /* renamed from: a */
        public void mo173701a(IBinder iBinder, int i) {
            C114524d dVar;
            C118672d.m167353c("Matrix.battery.WakeLockMonitorFeature", "[onReleaseWakeLock] token=%s flags=%s", Integer.valueOf(iBinder.hashCode()), Integer.valueOf(i));
            Iterator it = ((ConcurrentHashMap) C114519q0.this.f343263c).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == iBinder) {
                    dVar = (C114524d) entry.getValue();
                    it.remove();
                    break;
                }
            }
            if (dVar != null) {
                dVar.mo173703a(C114519q0.this.f349668a.f339059f);
                C80372e eVar = C114519q0.this.f343264d;
                C114524d.C114526b bVar = dVar.f343275b;
                synchronized (eVar.f235253a) {
                    eVar.f235254b++;
                    eVar.f235255c += bVar.mo173706a();
                }
                String str = dVar.f343275b.f343280b;
                C118672d.m167353c("Matrix.battery.WakeLockMonitorFeature", "[onReleaseWakeLock] tag = " + str + ", stack = " + (C114519q0.this.mo173700j(str) ? C114519q0.this.f349668a.f339057d.f339026A.mo122130b() : ""), new Object[0]);
                C114519q0.m161131i(C114519q0.this, str);
                return;
            }
            C118672d.m167356f("Matrix.battery.WakeLockMonitorFeature", "missing tracking, token = " + iBinder, new Object[0]);
        }

        /* renamed from: b */
        public void mo173702b(IBinder iBinder, int i, String str, String str2, WorkSource workSource, String str3) {
            String b = C114519q0.this.mo173700j(str) ? C114519q0.this.f349668a.f339057d.f339026A.mo122130b() : "";
            boolean z = true;
            C118672d.m167353c("Matrix.battery.WakeLockMonitorFeature", "[onAcquireWakeLock] token=%s flags=%s tag=%s historyTag=%s packageName=%s workSource=%s stack=%s", String.valueOf(iBinder), Integer.valueOf(i), str, str3, str2, workSource, b);
            C114524d dVar = (C114524d) ((ConcurrentHashMap) C114519q0.this.f343263c).get(iBinder);
            if (dVar != null) {
                dVar.mo173703a(C114519q0.this.f349668a.f339059f);
            }
            C114524d dVar2 = new C114524d(iBinder, str, i, str2, b);
            dVar2.f343278e = new C114521a(dVar2);
            C114519q0 q0Var = C114519q0.this;
            Handler handler = q0Var.f349668a.f339059f;
            long j = q0Var.f343262b;
            if (dVar2.f343277d == null) {
                C114524d.C114526b bVar = dVar2.f343275b;
                if (bVar.f343284f < bVar.f343283e) {
                    z = false;
                }
                if (!z) {
                    dVar2.f343276c = 0;
                    C114530s0 s0Var = new C114530s0(dVar2, handler, j);
                    dVar2.f343277d = s0Var;
                    handler.postDelayed(s0Var, j);
                    ((ConcurrentHashMap) C114519q0.this.f343263c).put(iBinder, dVar2);
                    C114519q0.m161131i(C114519q0.this, dVar2.f343275b.f343280b);
                }
            }
            C118672d.m167356f("Matrix.battery.WakeLockMonitorFeature", "cant not start tracing of wakelock, target = " + dVar2.f343275b, new Object[0]);
            ((ConcurrentHashMap) C114519q0.this.f343263c).put(iBinder, dVar2);
            C114519q0.m161131i(C114519q0.this, dVar2.f343275b.f343280b);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.q0$b */
    public interface C114522b {
        /* renamed from: b */
        void mo165847b(C114524d.C114526b bVar, long j);

        @Deprecated
        /* renamed from: d */
        void mo165849d(int i, C114524d.C114526b bVar);
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.q0$c */
    public static class C114523c extends C114490k0.C114491a<C114523c> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343269d;

        /* renamed from: e */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343270e;

        /* renamed from: f */
        public C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114495a<C114524d.C114526b>> f343271f;

        /* renamed from: g */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343272g;

        /* renamed from: h */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343273h;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114528r0(this, (C114523c) aVar, this);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.q0$d */
    public static class C114524d {

        /* renamed from: a */
        public final IBinder f343274a;

        /* renamed from: b */
        public final C114526b f343275b;

        /* renamed from: c */
        public int f343276c;

        /* renamed from: d */
        public Runnable f343277d;

        /* renamed from: e */
        public C114525a f343278e;

        /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.q0$d$a */
        public interface C114525a {
        }

        /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.q0$d$b */
        public static class C114526b {

            /* renamed from: a */
            public final int f343279a;

            /* renamed from: b */
            public final String f343280b;

            /* renamed from: c */
            public final String f343281c;

            /* renamed from: d */
            public final String f343282d;

            /* renamed from: e */
            public final long f343283e;

            /* renamed from: f */
            public long f343284f = 0;

            public C114526b(String str, int i, String str2, String str3) {
                this.f343279a = i;
                this.f343280b = str;
                this.f343281c = str2;
                this.f343282d = str3;
                this.f343283e = SystemClock.uptimeMillis();
            }

            /* renamed from: a */
            public long mo173706a() {
                long j = this.f343284f;
                if (!(j >= this.f343283e)) {
                    j = SystemClock.uptimeMillis();
                }
                long j2 = j - this.f343283e;
                if (j2 > 0) {
                    return j2;
                }
                return 0;
            }

            public String toString() {
                return "WakeLockRecord{flags=" + this.f343279a + ", tag='" + this.f343280b + '\'' + ", packageName='" + this.f343281c + '\'' + ", stack='" + this.f343282d + '\'' + ", timeBgn=" + this.f343283e + ", timeEnd=" + this.f343284f + '}';
            }
        }

        public C114524d(IBinder iBinder, String str, int i, String str2, String str3) {
            this.f343274a = iBinder;
            this.f343275b = new C114526b(str, i, str2, str3);
        }

        /* renamed from: a */
        public void mo173703a(Handler handler) {
            Runnable runnable = this.f343277d;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
                this.f343277d = null;
            }
            C114526b bVar = this.f343275b;
            bVar.getClass();
            bVar.f343284f = SystemClock.uptimeMillis();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C114524d)) {
                return false;
            }
            return this.f343274a.equals(obj);
        }

        public int hashCode() {
            return this.f343274a.hashCode();
        }
    }

    /* renamed from: i */
    public static void m161131i(C114519q0 q0Var, String str) {
        if (q0Var.f349668a.f339057d.f339050u.contains(str)) {
            C118672d.m167356f("Matrix.battery.WakeLockMonitorFeature", "dump wakelocks tracing for tag '" + str + "':", new Object[0]);
            for (C114524d dVar : ((ConcurrentHashMap) q0Var.f343263c).values()) {
                if (dVar.f343275b.f343280b.equalsIgnoreCase(str)) {
                    C118672d.m167356f("Matrix.battery.WakeLockMonitorFeature", " - " + dVar.f343275b, new Object[0]);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111817b() {
        /*
            r5 = this;
            super.mo111817b()
            ce.g r0 = r5.f349668a
            ce.f r0 = r0.f339057d
            boolean r0 = r0.f339046q
            if (r0 == 0) goto L_0x0058
            com.tencent.matrix.batterycanary.monitor.feature.q0$a r0 = new com.tencent.matrix.batterycanary.monitor.feature.q0$a
            r0.<init>()
            r5.f343265e = r0
            java.util.List<ie.o$c> r1 = p981ie.C117168o.f351017a
            java.lang.Class<ie.o> r1 = p981ie.C117168o.class
            monitor-enter(r1)
            java.util.List<ie.o$c> r2 = p981ie.C117168o.f351017a     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0055 }
            boolean r2 = r2.contains(r0)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0023
            monitor-exit(r1)
            goto L_0x0058
        L_0x0023:
            java.util.List<ie.o$c> r2 = p981ie.C117168o.f351017a     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0055 }
            r2.add(r0)     // Catch:{ all -> 0x0055 }
            boolean r0 = p981ie.C117168o.f351018b     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0053
        L_0x002f:
            java.util.List<ie.o$c> r0 = p981ie.C117168o.f351017a     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x003a
            goto L_0x0053
        L_0x003a:
            ie.u r0 = p981ie.C117168o.f351019c     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.mo122132a()     // Catch:{ all -> 0x0055 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0055 }
            r4 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r3[r4] = r0     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "Matrix.battery.PowerHooker"
            java.lang.String r4 = "checkHook hookRet:%b"
            p723vf.C118672d.m167353c(r0, r4, r3)     // Catch:{ all -> 0x0055 }
            p981ie.C117168o.f351018b = r2     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r1)
            goto L_0x0058
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.batterycanary.monitor.feature.C114519q0.mo111817b():void");
    }

    /* renamed from: c */
    public void mo173651c(long j) {
        super.mo173651c(j);
        if (!((ConcurrentHashMap) this.f343263c).isEmpty()) {
            for (C114524d dVar : ((ConcurrentHashMap) this.f343263c).values()) {
                C114524d.C114526b bVar = dVar.f343275b;
                if (!(bVar.f343284f >= bVar.f343283e) && mo173700j(bVar.f343280b)) {
                    this.f349668a.mo165847b(dVar.f343275b, j);
                }
            }
        }
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MIN_VALUE;
    }

    /* renamed from: e */
    public void mo173631e(C113314g gVar) {
        super.mo173631e(gVar);
        this.f343262b = gVar.f339057d.f339033d;
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        C117168o.C117171c cVar = this.f343265e;
        List<C117168o.C117171c> list = C117168o.f351017a;
        synchronized (C117168o.class) {
            if (cVar != null) {
                ((ArrayList) C117168o.f351017a).remove(cVar);
                if (C117168o.f351018b) {
                    if (((ArrayList) C117168o.f351017a).isEmpty()) {
                        C118672d.m167353c("Matrix.battery.PowerHooker", "checkUnHook unHookRet:%b", Boolean.valueOf(C117168o.f351019c.mo122133b()));
                        C117168o.f351018b = false;
                    }
                }
            }
        }
        this.f349668a.f339059f.removeCallbacksAndMessages((Object) null);
        ((ConcurrentHashMap) this.f343263c).clear();
        C80372e eVar = this.f343264d;
        eVar.f235254b = 0;
        eVar.f235255c = 0;
        eVar.f235256d = 0;
        eVar.f235257e = 0;
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.WakeLockMonitorFeature";
    }

    /* renamed from: j */
    public final boolean mo173700j(String str) {
        return mo180590h() || !this.f349668a.f339057d.f339049t.contains(str) || this.f349668a.f339057d.f339050u.contains(str);
    }
}
