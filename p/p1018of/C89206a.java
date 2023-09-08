package p1018of;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.util.HashSet;

/* renamed from: of.a */
public class C89206a {

    /* renamed from: a */
    public static long f257044a;

    /* renamed from: b */
    public static long f257045b;

    /* renamed from: c */
    public static AppMethodBeat.C80541e f257046c = new AppMethodBeat.C80541e();

    /* renamed from: d */
    public static AppMethodBeat.C80541e f257047d = new AppMethodBeat.C80541e();

    /* renamed from: e */
    public static int f257048e = Integer.MIN_VALUE;

    /* renamed from: f */
    public static final HashSet<C89208b> f257049f = new HashSet<>();

    /* renamed from: g */
    public static boolean f257050g = false;

    /* renamed from: of.a$a */
    public static final class C89207a implements Handler.Callback {

        /* renamed from: f */
        public static boolean f257051f = false;

        /* renamed from: g */
        public static int f257052g = Integer.MAX_VALUE;

        /* renamed from: d */
        public final Handler.Callback f257053d;

        /* renamed from: e */
        public Method f257054e = null;

        public C89207a(Handler.Callback callback) {
            this.f257053d = callback;
        }

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
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0145  */
        public boolean handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                lf.a r0 = p1002lf.C88490a.f255594b
                boolean r0 = r0.f255595a
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x00c2
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 25
                if (r0 > r3) goto L_0x00c2
                int r0 = r10.what
                r3 = 115(0x73, float:1.61E-43)
                if (r0 == r3) goto L_0x0024
                r3 = 116(0x74, float:1.63E-43)
                if (r0 == r3) goto L_0x0024
                r3 = 103(0x67, float:1.44E-43)
                if (r0 == r3) goto L_0x0024
                r3 = 104(0x68, float:1.46E-43)
                if (r0 == r3) goto L_0x0024
                r3 = 137(0x89, float:1.92E-43)
                if (r0 != r3) goto L_0x00c2
            L_0x0024:
                java.lang.String r0 = "Matrix.ActivityThreadHacker"
                java.lang.String r3 = "Fix SP ANR is enabled"
                java.lang.Object[] r4 = new java.lang.Object[r2]
                p723vf.C118672d.m167353c(r0, r3, r4)
                java.lang.String r0 = "Matrix.ActivityThreadHacker"
                java.lang.String r3 = "android.app.QueuedWork"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x008b, NoSuchFieldException -> 0x006f, Exception -> 0x0053 }
                java.lang.String r4 = "sPendingWorkFinishers"
                java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x008b, NoSuchFieldException -> 0x006f, Exception -> 0x0053 }
                if (r3 == 0) goto L_0x00c2
                r3.setAccessible(r1)     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x008b, NoSuchFieldException -> 0x006f, Exception -> 0x0053 }
                r4 = 0
                java.lang.Object r3 = r3.get(r4)     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x008b, NoSuchFieldException -> 0x006f, Exception -> 0x0053 }
                java.util.concurrent.ConcurrentLinkedQueue r3 = (java.util.concurrent.ConcurrentLinkedQueue) r3     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x008b, NoSuchFieldException -> 0x006f, Exception -> 0x0053 }
                r3.clear()     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x008b, NoSuchFieldException -> 0x006f, Exception -> 0x0053 }
                java.lang.String r3 = "Fix SP ANR sPendingWorkFinishers.clear successful"
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x008b, NoSuchFieldException -> 0x006f, Exception -> 0x0053 }
                p723vf.C118672d.m167353c(r0, r3, r4)     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x008b, NoSuchFieldException -> 0x006f, Exception -> 0x0053 }
                goto L_0x00c2
            L_0x0053:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Fix SP ANR Exception = "
                r4.append(r5)
                java.lang.String r3 = r3.getMessage()
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                p723vf.C118672d.m167352b(r0, r3, r4)
                goto L_0x00c2
            L_0x006f:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Fix SP ANR NoSuchFieldException = "
                r4.append(r5)
                java.lang.String r3 = r3.getMessage()
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                p723vf.C118672d.m167352b(r0, r3, r4)
                goto L_0x00c2
            L_0x008b:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Fix SP ANR IllegalAccessException ="
                r4.append(r5)
                java.lang.String r3 = r3.getMessage()
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                p723vf.C118672d.m167352b(r0, r3, r4)
                goto L_0x00c2
            L_0x00a7:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Fix SP ANR ClassNotFoundException = "
                r4.append(r5)
                java.lang.String r3 = r3.getMessage()
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                p723vf.C118672d.m167352b(r0, r3, r4)
            L_0x00c2:
                boolean r0 = com.tencent.matrix.trace.core.AppMethodBeat.isRealTrace()
                if (r0 != 0) goto L_0x00d5
                android.os.Handler$Callback r0 = r9.f257053d
                if (r0 == 0) goto L_0x00d3
                boolean r10 = r0.handleMessage(r10)
                if (r10 == 0) goto L_0x00d3
                goto L_0x00d4
            L_0x00d3:
                r1 = 0
            L_0x00d4:
                return r1
            L_0x00d5:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 100
                r4 = 27
                if (r0 <= r4) goto L_0x0137
                int r0 = r10.what
                r4 = 159(0x9f, float:2.23E-43)
                if (r0 != r4) goto L_0x012f
                java.lang.Object r0 = r10.obj
                if (r0 == 0) goto L_0x012f
                java.lang.reflect.Method r0 = r9.f257054e     // Catch:{ Exception -> 0x0123 }
                if (r0 != 0) goto L_0x00fe
                java.lang.String r0 = "android.app.servertransaction.ClientTransaction"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0123 }
                java.lang.String r4 = "getCallbacks"
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0123 }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0123 }
                r9.f257054e = r0     // Catch:{ Exception -> 0x0123 }
                r0.setAccessible(r1)     // Catch:{ Exception -> 0x0123 }
            L_0x00fe:
                java.lang.reflect.Method r0 = r9.f257054e     // Catch:{ Exception -> 0x0123 }
                java.lang.Object r4 = r10.obj     // Catch:{ Exception -> 0x0123 }
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0123 }
                java.lang.Object r0 = r0.invoke(r4, r5)     // Catch:{ Exception -> 0x0123 }
                java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0123 }
                boolean r4 = r0.isEmpty()     // Catch:{ Exception -> 0x0123 }
                if (r4 != 0) goto L_0x012f
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0123 }
                java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x0123 }
                java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0123 }
                java.lang.String r4 = ".LaunchActivityItem"
                boolean r0 = r0.endsWith(r4)     // Catch:{ Exception -> 0x0123 }
                goto L_0x0140
            L_0x0123:
                r0 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r1]
                r4[r2] = r0
                java.lang.String r0 = "Matrix.ActivityThreadHacker"
                java.lang.String r5 = "[isLaunchActivity] %s"
                p723vf.C118672d.m167352b(r0, r5, r4)
            L_0x012f:
                int r0 = r10.what
                if (r0 != r3) goto L_0x0135
            L_0x0133:
                r0 = 1
                goto L_0x0140
            L_0x0135:
                r0 = 0
                goto L_0x0140
            L_0x0137:
                int r0 = r10.what
                if (r0 == r3) goto L_0x0133
                r3 = 126(0x7e, float:1.77E-43)
                if (r0 != r3) goto L_0x0135
                goto L_0x0133
            L_0x0140:
                int r3 = f257052g
                r4 = 2
                if (r3 <= 0) goto L_0x0175
                java.lang.String r3 = "Matrix.ActivityThreadHacker"
                java.lang.String r5 = "[handleMessage] msg.what:%s begin:%s isLaunchActivity:%s SDK_INT=%s"
                r6 = 4
                java.lang.Object[] r6 = new java.lang.Object[r6]
                int r7 = r10.what
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6[r2] = r7
                long r7 = android.os.SystemClock.uptimeMillis()
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r6[r1] = r7
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                r6[r4] = r7
                r7 = 3
                int r8 = android.os.Build.VERSION.SDK_INT
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r6[r7] = r8
                p723vf.C118672d.m167353c(r3, r5, r6)
                int r3 = f257052g
                int r3 = r3 - r1
                f257052g = r3
            L_0x0175:
                boolean r3 = f257051f
                if (r3 != 0) goto L_0x01c4
                if (r0 != 0) goto L_0x0185
                int r3 = r10.what
                r5 = 114(0x72, float:1.6E-43)
                if (r3 == r5) goto L_0x0185
                r5 = 113(0x71, float:1.58E-43)
                if (r3 != r5) goto L_0x01c4
            L_0x0185:
                long r5 = android.os.SystemClock.uptimeMillis()
                p1018of.C89206a.f257045b = r5
                int r3 = r10.what
                p1018of.C89206a.f257048e = r3
                f257051f = r1
                p1018of.C89206a.f257050g = r0
                java.lang.String r5 = "Matrix.ActivityThreadHacker"
                java.lang.String r6 = "application create end, sApplicationCreateScene:%d, isLaunchActivity:%s"
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4[r2] = r3
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r4[r1] = r0
                p723vf.C118672d.m167353c(r5, r6, r4)
                java.util.HashSet<of.a$b> r0 = p1018of.C89206a.f257049f
                monitor-enter(r0)
                java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x01c1 }
            L_0x01af:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01c1 }
                if (r4 == 0) goto L_0x01bf
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01c1 }
                of.a$b r4 = (p1018of.C89206a.C89208b) r4     // Catch:{ all -> 0x01c1 }
                r4.mo123543c()     // Catch:{ all -> 0x01c1 }
                goto L_0x01af
            L_0x01bf:
                monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
                goto L_0x01c4
            L_0x01c1:
                r10 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
                throw r10
            L_0x01c4:
                android.os.Handler$Callback r0 = r9.f257053d
                if (r0 == 0) goto L_0x01cf
                boolean r10 = r0.handleMessage(r10)
                if (r10 == 0) goto L_0x01cf
                goto L_0x01d0
            L_0x01cf:
                r1 = 0
            L_0x01d0:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p1018of.C89206a.C89207a.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: of.a$b */
    public interface C89208b {
        /* renamed from: c */
        void mo123543c();
    }
}
