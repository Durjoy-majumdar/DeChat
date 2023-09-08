package p981ie;

import android.os.IBinder;
import android.os.WorkSource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p981ie.C87710u;

/* renamed from: ie.o */
public final class C117168o {

    /* renamed from: a */
    public static List<C117171c> f351017a = new ArrayList();

    /* renamed from: b */
    public static boolean f351018b;

    /* renamed from: c */
    public static C87710u f351019c = new C87710u("power", "android.os.IPowerManager", new C117169a());

    /* renamed from: ie.o$a */
    public class C117169a implements C87710u.C87712b {
        /* renamed from: a */
        public Object mo122125a(Object obj, Method method, Object[] objArr) {
            return null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: ie.o$d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: ie.o$b} */
        /* JADX WARNING: type inference failed for: r7v0 */
        /* JADX WARNING: type inference failed for: r7v2 */
        /* JADX WARNING: type inference failed for: r7v4 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo122126b(java.lang.reflect.Method r16, java.lang.Object[] r17) {
            /*
                r15 = this;
                r0 = r17
                java.lang.String r1 = "Matrix.battery.PowerHooker"
                java.lang.String r2 = "onServiceMethodInvoke: method name %s"
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r5 = r16.getName()
                r6 = 0
                r4[r6] = r5
                p723vf.C118672d.m167355e(r1, r2, r4)
                java.lang.Class<ie.o> r1 = p981ie.C117168o.class
                java.lang.String r2 = r16.getName()
                java.lang.String r4 = "acquireWakeLock"
                boolean r2 = r2.equals(r4)
                r4 = 2
                r5 = 3
                r7 = 0
                if (r2 == 0) goto L_0x01d4
                java.lang.String r2 = "Matrix.battery.PowerHooker"
                if (r0 != 0) goto L_0x0031
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.String r3 = "createAcquireWakeLockArgs args null"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0199
            L_0x0031:
                java.lang.Object[] r8 = new java.lang.Object[r5]
                int r9 = android.os.Build.VERSION.SDK_INT
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r8[r6] = r10
                java.lang.String r10 = android.os.Build.VERSION.CODENAME
                r8[r3] = r10
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r8[r4] = r9
                java.lang.String r9 = "createAcquireWakeLockArgs apiLevel:%d, codeName:%s, versionRelease:%s"
                p723vf.C118672d.m167353c(r2, r9, r8)
                int r8 = r0.length
                java.lang.Object[] r9 = new java.lang.Object[r3]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
                r9[r6] = r10
                java.lang.String r10 = "createAcquireWakeLockArgsAccordingToArgsLength: length:%s"
                p723vf.C118672d.m167353c(r2, r10, r9)
                java.lang.String r9 = "createAcquireWakeLockArgs6 args idx 2 not String, %s"
                r10 = 4
                if (r8 == r10) goto L_0x0109
                int r8 = r0.length
                r11 = 5
                r12 = 6
                if (r8 == r12) goto L_0x0075
                int r8 = r0.length
                if (r8 == r11) goto L_0x0075
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                java.lang.String r0 = "createAcquireWakeLockArgs6 args length invalid : %d"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0199
            L_0x0075:
                ie.o$b r8 = new ie.o$b
                r8.<init>(r7)
                r12 = r0[r6]
                boolean r13 = r12 instanceof android.os.IBinder
                if (r13 != 0) goto L_0x008b
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r12
                java.lang.String r3 = "createAcquireWakeLockArgs6 args idx 0 not IBinder, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0199
            L_0x008b:
                android.os.IBinder r12 = (android.os.IBinder) r12
                r8.f351020a = r12
                r12 = r0[r3]
                boolean r13 = r12 instanceof java.lang.Integer
                if (r13 != 0) goto L_0x00a0
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r12
                java.lang.String r3 = "createAcquireWakeLockArgs6 args idx 1 not Integer, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0199
            L_0x00a0:
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r12 = r12.intValue()
                r8.f351021b = r12
                r4 = r0[r4]
                if (r4 == 0) goto L_0x00b9
                boolean r12 = r4 instanceof java.lang.String
                if (r12 != 0) goto L_0x00b9
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                p723vf.C118672d.m167356f(r2, r9, r0)
                goto L_0x0199
            L_0x00b9:
                java.lang.String r4 = (java.lang.String) r4
                r8.f351022c = r4
                r4 = r0[r5]
                if (r4 == 0) goto L_0x00d0
                boolean r5 = r4 instanceof java.lang.String
                if (r5 != 0) goto L_0x00d0
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                java.lang.String r3 = "createAcquireWakeLockArgs6 args idx 3 not String, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0199
            L_0x00d0:
                java.lang.String r4 = (java.lang.String) r4
                r8.f351023d = r4
                r4 = r0[r10]
                if (r4 == 0) goto L_0x00e7
                boolean r5 = r4 instanceof android.os.WorkSource
                if (r5 != 0) goto L_0x00e7
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                java.lang.String r3 = "createAcquireWakeLockArgs6 args idx 4 not WorkSource, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0199
            L_0x00e7:
                android.os.WorkSource r4 = (android.os.WorkSource) r4
                r8.f351024e = r4
                int r4 = r0.length
                if (r4 != r11) goto L_0x00f0
                goto L_0x018e
            L_0x00f0:
                r0 = r0[r11]
                if (r0 == 0) goto L_0x0103
                boolean r4 = r0 instanceof java.lang.String
                if (r4 != 0) goto L_0x0103
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createAcquireWakeLockArgs6 args idx 5 not String, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0199
            L_0x0103:
                java.lang.String r0 = (java.lang.String) r0
                r8.f351025f = r0
                goto L_0x018e
            L_0x0109:
                int r8 = r0.length
                if (r8 == r10) goto L_0x011c
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                java.lang.String r0 = "createAcquireWakeLockArgs4 args length invalid : %d"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0199
            L_0x011c:
                ie.o$b r8 = new ie.o$b
                r8.<init>(r7)
                r4 = r0[r4]
                if (r4 == 0) goto L_0x0131
                boolean r10 = r4 instanceof java.lang.String
                if (r10 != 0) goto L_0x0131
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                p723vf.C118672d.m167356f(r2, r9, r0)
                goto L_0x0199
            L_0x0131:
                java.lang.String r4 = (java.lang.String) r4
                r8.f351022c = r4
                r4 = r0[r5]
                if (r4 == 0) goto L_0x0147
                boolean r5 = r4 instanceof android.os.WorkSource
                if (r5 != 0) goto L_0x0147
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                java.lang.String r3 = "createAcquireWakeLockArgs6 args idx 3 not WorkSource, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0199
            L_0x0147:
                android.os.WorkSource r4 = (android.os.WorkSource) r4
                r8.f351024e = r4
                r4 = r0[r6]
                boolean r5 = r4 instanceof java.lang.Integer
                if (r5 == 0) goto L_0x016e
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r8.f351021b = r4
                r0 = r0[r3]
                boolean r4 = r0 instanceof android.os.IBinder
                if (r4 != 0) goto L_0x0169
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createAcquireWakeLockArgs6 args idx 1 not IBinder, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0199
            L_0x0169:
                android.os.IBinder r0 = (android.os.IBinder) r0
                r8.f351020a = r0
                goto L_0x018e
            L_0x016e:
                boolean r5 = r4 instanceof android.os.IBinder
                if (r5 == 0) goto L_0x0190
                android.os.IBinder r4 = (android.os.IBinder) r4
                r8.f351020a = r4
                r0 = r0[r3]
                boolean r4 = r0 instanceof java.lang.Integer
                if (r4 != 0) goto L_0x0186
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createAcquireWakeLockArgs4 args idx 1 not Integer, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0199
            L_0x0186:
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r8.f351021b = r0
            L_0x018e:
                r7 = r8
                goto L_0x0199
            L_0x0190:
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                java.lang.String r3 = "createAcquireWakeLockArgs4 args idx 0 not IBinder an Integer, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
            L_0x0199:
                if (r7 != 0) goto L_0x01a6
                java.lang.String r0 = "Matrix.battery.PowerHooker"
                java.lang.String r1 = "dispatchAcquireWakeLock AcquireWakeLockArgs null"
                java.lang.Object[] r2 = new java.lang.Object[r6]
                p723vf.C118672d.m167356f(r0, r1, r2)
                goto L_0x0287
            L_0x01a6:
                monitor-enter(r1)
            L_0x01a7:
                java.util.List<ie.o$c> r0 = p981ie.C117168o.f351017a     // Catch:{ all -> 0x01d1 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x01d1 }
                int r0 = r0.size()     // Catch:{ all -> 0x01d1 }
                if (r6 >= r0) goto L_0x01ce
                java.util.List<ie.o$c> r0 = p981ie.C117168o.f351017a     // Catch:{ all -> 0x01d1 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x01d1 }
                java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x01d1 }
                r8 = r0
                ie.o$c r8 = (p981ie.C117168o.C117171c) r8     // Catch:{ all -> 0x01d1 }
                android.os.IBinder r9 = r7.f351020a     // Catch:{ all -> 0x01d1 }
                int r10 = r7.f351021b     // Catch:{ all -> 0x01d1 }
                java.lang.String r11 = r7.f351022c     // Catch:{ all -> 0x01d1 }
                java.lang.String r12 = r7.f351023d     // Catch:{ all -> 0x01d1 }
                android.os.WorkSource r13 = r7.f351024e     // Catch:{ all -> 0x01d1 }
                java.lang.String r14 = r7.f351025f     // Catch:{ all -> 0x01d1 }
                r8.mo173702b(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01d1 }
                int r6 = r6 + 1
                goto L_0x01a7
            L_0x01ce:
                monitor-exit(r1)     // Catch:{ all -> 0x01d1 }
                goto L_0x0287
            L_0x01d1:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x01d1 }
                throw r0
            L_0x01d4:
                java.lang.String r2 = r16.getName()
                java.lang.String r8 = "releaseWakeLock"
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0287
                java.lang.String r2 = "Matrix.battery.PowerHooker"
                if (r0 != 0) goto L_0x01ec
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.String r3 = "createReleaseWakeLockArgs args null"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0257
            L_0x01ec:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                int r8 = android.os.Build.VERSION.SDK_INT
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                r5[r6] = r9
                java.lang.String r9 = android.os.Build.VERSION.CODENAME
                r5[r3] = r9
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r5[r4] = r8
                java.lang.String r8 = "createReleaseWakeLockArgs apiLevel:%d, codeName:%s, versionRelease:%s"
                p723vf.C118672d.m167353c(r2, r8, r5)
                int r5 = r0.length
                java.lang.Object[] r8 = new java.lang.Object[r3]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r8[r6] = r5
                java.lang.String r5 = "createReleaseWakeLockArgsAccordingToArgsLength: length:%s"
                p723vf.C118672d.m167353c(r2, r5, r8)
                int r5 = r0.length
                if (r5 == r4) goto L_0x0225
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                java.lang.String r0 = "createReleaseWakeLockArgs2 args length invalid : %d"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0257
            L_0x0225:
                ie.o$d r4 = new ie.o$d
                r4.<init>(r7)
                r5 = r0[r6]
                boolean r8 = r5 instanceof android.os.IBinder
                if (r8 != 0) goto L_0x023a
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r5
                java.lang.String r3 = "createReleaseWakeLockArgs2 args idx 0 not IBinder, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0257
            L_0x023a:
                android.os.IBinder r5 = (android.os.IBinder) r5
                r4.f351026a = r5
                r0 = r0[r3]
                boolean r5 = r0 instanceof java.lang.Integer
                if (r5 != 0) goto L_0x024e
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createReleaseWakeLockArgs2 args idx 1 not Integer, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0257
            L_0x024e:
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r4.f351027b = r0
                r7 = r4
            L_0x0257:
                if (r7 != 0) goto L_0x0263
                java.lang.String r0 = "Matrix.battery.PowerHooker"
                java.lang.String r1 = "dispatchReleaseWakeLock AcquireWakeLockArgs null"
                java.lang.Object[] r2 = new java.lang.Object[r6]
                p723vf.C118672d.m167356f(r0, r1, r2)
                goto L_0x0287
            L_0x0263:
                monitor-enter(r1)
            L_0x0264:
                java.util.List<ie.o$c> r0 = p981ie.C117168o.f351017a     // Catch:{ all -> 0x0284 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0284 }
                int r0 = r0.size()     // Catch:{ all -> 0x0284 }
                if (r6 >= r0) goto L_0x0282
                java.util.List<ie.o$c> r0 = p981ie.C117168o.f351017a     // Catch:{ all -> 0x0284 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0284 }
                java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0284 }
                ie.o$c r0 = (p981ie.C117168o.C117171c) r0     // Catch:{ all -> 0x0284 }
                android.os.IBinder r2 = r7.f351026a     // Catch:{ all -> 0x0284 }
                int r3 = r7.f351027b     // Catch:{ all -> 0x0284 }
                r0.mo173701a(r2, r3)     // Catch:{ all -> 0x0284 }
                int r6 = r6 + 1
                goto L_0x0264
            L_0x0282:
                monitor-exit(r1)     // Catch:{ all -> 0x0284 }
                goto L_0x0287
            L_0x0284:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0284 }
                throw r0
            L_0x0287:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p981ie.C117168o.C117169a.mo122126b(java.lang.reflect.Method, java.lang.Object[]):void");
        }
    }

    /* renamed from: ie.o$b */
    public static final class C117170b {

        /* renamed from: a */
        public IBinder f351020a;

        /* renamed from: b */
        public int f351021b;

        /* renamed from: c */
        public String f351022c;

        /* renamed from: d */
        public String f351023d;

        /* renamed from: e */
        public WorkSource f351024e;

        /* renamed from: f */
        public String f351025f;

        public C117170b(C117169a aVar) {
        }
    }

    /* renamed from: ie.o$c */
    public interface C117171c {
        /* renamed from: a */
        void mo173701a(IBinder iBinder, int i);

        /* renamed from: b */
        void mo173702b(IBinder iBinder, int i, String str, String str2, WorkSource workSource, String str3);
    }

    /* renamed from: ie.o$d */
    public static final class C117172d {

        /* renamed from: a */
        public IBinder f351026a;

        /* renamed from: b */
        public int f351027b;

        public C117172d(C117169a aVar) {
        }
    }
}
