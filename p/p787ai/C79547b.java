package p787ai;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import lp3.C88629c;
import lp3.C88643g;
import mp3.C88818c;
import mp3.C88819d;
import mp3.C88820e;

/* renamed from: ai.b */
public class C79547b {

    /* renamed from: g */
    public static C79547b f233255g = new C79547b();

    /* renamed from: a */
    public final Queue<C79548a> f233256a = new LinkedList();

    /* renamed from: b */
    public boolean f233257b = false;

    /* renamed from: c */
    public volatile boolean f233258c = false;

    /* renamed from: d */
    public boolean f233259d = true;

    /* renamed from: e */
    public volatile C88629c f233260e = C88643g.m110546d();

    /* renamed from: f */
    public AtomicBoolean f233261f = new AtomicBoolean(false);

    /* renamed from: ai.b$b */
    public enum C39606b {
        Now
    }

    /* renamed from: ai.b$a */
    public static class C79548a implements C88820e {

        /* renamed from: a */
        public Runnable f233262a;

        /* renamed from: b */
        public C88819d f233263b;

        public C79548a(Runnable runnable, C88819d dVar) {
            this.f233262a = runnable;
            this.f233263b = dVar;
        }

        /* renamed from: a */
        public String mo55914a() {
            C88819d dVar = this.f233263b;
            return dVar instanceof C88818c ? C88819d.current() instanceof C88818c ? C88819d.f256219UI.f256232c : C88819d.current().getType() : dVar.getType();
        }

        public Object call(Object obj) {
            Log.m105925i("MicroMsg.FirstScreenArrangement", "FirstScreenArrangement tryConsumingWaitingQueue runnable %s, %s", this.f233262a, this.f233263b.getType());
            try {
                Runnable runnable = this.f233262a;
                if (runnable != null) {
                    runnable.run();
                } else {
                    Log.m105920e("MicroMsg.FirstScreenArrangement", "ERROR: FirstScreenArrangement gonna retry!");
                }
                return null;
            } finally {
                this.f233262a = null;
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo109607a(java.lang.Runnable r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            mp3.d r0 = mp3.C88819d.current()     // Catch:{ all -> 0x0076 }
            boolean r1 = r0 instanceof mp3.C88818c     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x0010
            java.lang.String r1 = r0.getType()     // Catch:{ all -> 0x0076 }
            mp3.C88824h.m110908b(r1, r0)     // Catch:{ all -> 0x0076 }
        L_0x0010:
            monitor-enter(r7)     // Catch:{ all -> 0x0076 }
            boolean r1 = r7.f233257b     // Catch:{ all -> 0x0073 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            boolean r1 = r7.f233259d     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0021
        L_0x001b:
            boolean r1 = r7.f233258c     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x005a
            java.lang.String r1 = "MicroMsg.FirstScreenArrangement"
            java.lang.String r4 = "arrange first screen runnable: %s, %s, %s, %s"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0076 }
            boolean r6 = r7.f233257b     // Catch:{ all -> 0x0076 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0076 }
            r5[r3] = r6     // Catch:{ all -> 0x0076 }
            boolean r3 = r7.f233259d     // Catch:{ all -> 0x0076 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0076 }
            r5[r2] = r3     // Catch:{ all -> 0x0076 }
            r2 = 2
            boolean r3 = r7.f233258c     // Catch:{ all -> 0x0076 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0076 }
            r5[r2] = r3     // Catch:{ all -> 0x0076 }
            r2 = 3
            java.util.Queue<ai.b$a> r3 = r7.f233256a     // Catch:{ all -> 0x0076 }
            r5[r2] = r3     // Catch:{ all -> 0x0076 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r5)     // Catch:{ all -> 0x0076 }
            java.util.Queue<ai.b$a> r1 = r7.f233256a     // Catch:{ all -> 0x0076 }
            ai.b$a r2 = new ai.b$a     // Catch:{ all -> 0x0076 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0076 }
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x0076 }
            r1.add(r2)     // Catch:{ all -> 0x0076 }
            goto L_0x0071
        L_0x005a:
            java.lang.String r1 = "MicroMsg.FirstScreenArrangement"
            java.lang.String r4 = "FirstScreenArrangement arrange runnable postToMainThread %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0076 }
            r2[r3] = r8     // Catch:{ all -> 0x0076 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r2)     // Catch:{ all -> 0x0076 }
            lp3.c r1 = r7.f233260e     // Catch:{ all -> 0x0076 }
            ai.b$a r2 = new ai.b$a     // Catch:{ all -> 0x0076 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0076 }
            lp3.e r1 = (lp3.C88633e) r1     // Catch:{ all -> 0x0076 }
            r1.mo123061d(r2)     // Catch:{ all -> 0x0076 }
        L_0x0071:
            monitor-exit(r7)
            return
        L_0x0073:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r8     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p787ai.C79547b.mo109607a(java.lang.Runnable):void");
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final synchronized void mo109608b() {
        /*
            r7 = this;
            monitor-enter(r7)
            monitor-enter(r7)     // Catch:{ all -> 0x0053 }
            boolean r0 = r7.f233257b     // Catch:{ all -> 0x0055 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000c
            boolean r0 = r7.f233259d     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0012
        L_0x000c:
            boolean r0 = r7.f233258c     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x0018
            monitor-exit(r7)
            return
        L_0x0018:
            mp3.d r0 = mp3.C88819d.current()     // Catch:{ all -> 0x0053 }
            boolean r3 = r0 instanceof mp3.C88818c     // Catch:{ all -> 0x0053 }
            if (r3 != 0) goto L_0x0027
            java.lang.String r3 = r0.getType()     // Catch:{ all -> 0x0053 }
            mp3.C88824h.m110908b(r3, r0)     // Catch:{ all -> 0x0053 }
        L_0x0027:
            java.util.Queue<ai.b$a> r0 = r7.f233256a     // Catch:{ all -> 0x0053 }
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0053 }
            ai.b$a r0 = (p787ai.C79547b.C79548a) r0     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r3 = "MicroMsg.FirstScreenArrangement"
            java.lang.String r4 = "FirstScreenArrangement tryConsumingWaitingQueue runnable %s, %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0053 }
            java.lang.Runnable r6 = r0.f233262a     // Catch:{ all -> 0x0053 }
            r5[r2] = r6     // Catch:{ all -> 0x0053 }
            mp3.d r6 = r0.f233263b     // Catch:{ all -> 0x0053 }
            java.lang.String r6 = r6.getType()     // Catch:{ all -> 0x0053 }
            r5[r1] = r6     // Catch:{ all -> 0x0053 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ all -> 0x0053 }
            lp3.c r3 = r7.f233260e     // Catch:{ all -> 0x0053 }
            lp3.e r3 = (lp3.C88633e) r3     // Catch:{ all -> 0x0053 }
            r3.mo123061d(r0)     // Catch:{ all -> 0x0053 }
            goto L_0x0027
        L_0x0051:
            monitor-exit(r7)
            return
        L_0x0053:
            r0 = move-exception
            goto L_0x0058
        L_0x0055:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0058:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p787ai.C79547b.mo109608b():void");
    }
}
