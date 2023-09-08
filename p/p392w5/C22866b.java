package p392w5;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w5.b */
public class C22866b extends Thread {

    /* renamed from: d */
    public final Object f65739d = new Object();

    /* renamed from: e */
    public final Object f65740e = new Object();

    /* renamed from: f */
    public final Context f65741f;

    /* renamed from: g */
    public volatile boolean f65742g = false;

    /* renamed from: h */
    public List<C22865a> f65743h = new ArrayList();

    public C22866b(Context context) {
        this.f65741f = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|1a|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36029a(p392w5.C22865a r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f65739d
            monitor-enter(r0)
            android.content.Context r1 = r4.f65741f     // Catch:{ all -> 0x0044 }
            w5.c r1 = p392w5.C22867c.m26824d(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = r5.f65730a     // Catch:{ all -> 0x0044 }
            int r1 = r1.mo36034e(r2)     // Catch:{ all -> 0x0044 }
            int r2 = r5.f65732c     // Catch:{ all -> 0x0044 }
            int r2 = r2 + r1
            r5.f65737h = r2     // Catch:{ all -> 0x0044 }
            r1 = 0
            r5.f65735f = r1     // Catch:{ all -> 0x0044 }
            java.lang.Object r1 = r4.f65740e     // Catch:{ all -> 0x0044 }
            monitor-enter(r1)     // Catch:{ all -> 0x0044 }
            java.util.List<w5.a> r2 = r4.f65743h     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0041 }
            int r2 = r2.size()     // Catch:{ all -> 0x0041 }
            r3 = 0
            if (r2 <= 0) goto L_0x0032
            java.util.List<w5.a> r2 = r4.f65743h     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0041 }
            w5.a r2 = (p392w5.C22865a) r2     // Catch:{ all -> 0x0041 }
            r2.f65736g = r3     // Catch:{ all -> 0x0041 }
        L_0x0032:
            java.util.List<w5.a> r2 = r4.f65743h     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0041 }
            r2.add(r3, r5)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            java.lang.Object r5 = r4.f65739d     // Catch:{ Exception -> 0x003f }
            r5.notify()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return
        L_0x0041:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            throw r5     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p392w5.C22866b.mo36029a(w5.a):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 181 */
    public void run() {
        /*
            r11 = this;
        L_0x0000:
            boolean r0 = r11.f65742g
            if (r0 != 0) goto L_0x00c6
            java.util.List<w5.a> r0 = r11.f65743h
            if (r0 != 0) goto L_0x0009
            goto L_0x0000
        L_0x0009:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a6
            java.lang.Object r0 = r11.f65740e
            monitor-enter(r0)
            java.util.List<w5.a> r1 = r11.f65743h     // Catch:{ all -> 0x00a3 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x001c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00a3 }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00a3 }
            w5.a r2 = (p392w5.C22865a) r2     // Catch:{ all -> 0x00a3 }
            boolean r2 = r2.f65736g     // Catch:{ all -> 0x00a3 }
            if (r2 == 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
            r0 = 1
            goto L_0x0033
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
            r0 = 0
        L_0x0033:
            if (r0 != 0) goto L_0x0037
            goto L_0x00a6
        L_0x0037:
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.List<w5.a> r2 = r11.f65743h
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0046
            goto L_0x0000
        L_0x0046:
            java.util.List<w5.a> r2 = r11.f65743h
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r4)
            w5.a r2 = (p392w5.C22865a) r2
            boolean r5 = r2.f65736g
            if (r5 != 0) goto L_0x0055
            goto L_0x0000
        L_0x0055:
            long r5 = r2.f65735f
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0072
            long r5 = r5 - r0
            java.lang.Object r0 = r11.f65739d
            monitor-enter(r0)
            java.lang.Object r1 = r11.f65739d     // Catch:{ Exception -> 0x0064 }
            r1.wait(r5)     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            int r0 = r2.f65738i
            int r1 = r2.f65731b
            if (r0 <= r1) goto L_0x0000
            r2.f65736g = r4
            goto L_0x0000
        L_0x006e:
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            throw r1
        L_0x0070:
            r1 = move-exception
            goto L_0x006e
        L_0x0072:
            android.content.Context r0 = r11.f65741f
            w5.c r5 = p392w5.C22867c.m26824d(r0)
            java.lang.String r6 = r2.f65730a
            int r7 = r2.f65731b
            int r8 = r2.f65732c
            int r9 = r2.f65733d
            int r10 = r2.f65734e
            r5.mo36033c(r6, r7, r8, r9, r10)
            int r0 = r2.f65738i
            int r0 = r0 + r3
            r2.f65738i = r0
            int r0 = r2.f65738i
            int r1 = r2.f65731b
            if (r0 < r1) goto L_0x0094
            r2.f65736g = r4
            goto L_0x0000
        L_0x0094:
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r3 = r2.f65737h
            long r3 = (long) r3
            long r0 = r0 + r3
            r2.f65735f = r0
            android.os.SystemClock.elapsedRealtime()
            goto L_0x0000
        L_0x00a3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
            throw r1
        L_0x00a6:
            java.lang.Object r0 = r11.f65739d
            monitor-enter(r0)
            java.lang.Object r1 = r11.f65740e     // Catch:{ Exception -> 0x00c1 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x00c1 }
            java.util.List<w5.a> r2 = r11.f65743h     // Catch:{ all -> 0x00bc }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x00bc }
            r2.clear()     // Catch:{ all -> 0x00bc }
            monitor-exit(r1)     // Catch:{ all -> 0x00bc }
            java.lang.Object r1 = r11.f65739d     // Catch:{ Exception -> 0x00c1 }
            r1.wait()     // Catch:{ Exception -> 0x00c1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00bf }
            goto L_0x0000
        L_0x00bc:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00bc }
            throw r2     // Catch:{ Exception -> 0x00c1 }
        L_0x00bf:
            r1 = move-exception
            goto L_0x00c4
        L_0x00c1:
            monitor-exit(r0)     // Catch:{ all -> 0x00bf }
            goto L_0x0000
        L_0x00c4:
            monitor-exit(r0)     // Catch:{ all -> 0x00bf }
            throw r1
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p392w5.C22866b.run():void");
    }
}
