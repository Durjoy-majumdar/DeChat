package com.tencent.p014mm.matrix.dice;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.mm.matrix.dice.a */
public class C80982a implements Runnable {

    /* renamed from: f */
    public static final C80982a f237863f = new C80982a();

    /* renamed from: d */
    public final Map<String, C80983a> f237864d = new ConcurrentHashMap();

    /* renamed from: e */
    public IListener<PostSyncTaskEvent> f237865e;

    /* renamed from: com.tencent.mm.matrix.dice.a$a */
    public interface C80983a {
        /* renamed from: S1 */
        double mo55862S1();

        long b00();

        /* renamed from: kD */
        void mo55864kD(double d);

        String key();
    }

    /* renamed from: com.tencent.mm.matrix.dice.a$b */
    public static class C80984b {

        /* renamed from: a */
        public static final MultiProcessMMKV f237866a = MultiProcessMMKV.getMMKV("diagnostic_storage");

        /* renamed from: b */
        public static String f237867b;

        /* renamed from: c */
        public static final C80984b f237868c = new C80984b();
    }

    /* renamed from: a */
    public synchronized void mo112806a(C80983a aVar) {
        if (!((ConcurrentHashMap) this.f237864d).containsKey(aVar.key())) {
            ((ConcurrentHashMap) this.f237864d).put(aVar.key(), aVar);
            mo112807b(aVar);
            if (this.f237865e == null) {
                DiceCup$1 diceCup$1 = new DiceCup$1(this, C40008f.f107254d);
                this.f237865e = diceCup$1;
                diceCup$1.alive();
            }
        } else {
            throw new IllegalArgumentException(aVar.key() + " dice already exists");
        }
    }

    /* renamed from: b */
    public final void mo112807b(C80983a aVar) {
        try {
            Log.m105925i("MicroMsg.DiceCup", "dice [%s]", aVar.key());
            MultiProcessMMKV multiProcessMMKV = C80984b.f237866a;
            C80984b.f237867b = MMApplicationContext.getProcessName() + "_" + aVar.key();
            C80984b.f237868c.getClass();
            MultiProcessMMKV multiProcessMMKV2 = C80984b.f237866a;
            long decodeLong = multiProcessMMKV2.decodeLong(C80984b.f237867b, 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - decodeLong < TimeUnit.MINUTES.toMillis(aVar.b00())) {
                Log.m105925i("MicroMsg.DiceCup", "dice [%s] pass cycle", aVar.key());
                return;
            }
            multiProcessMMKV2.encode(C80984b.f237867b, currentTimeMillis);
            double random = Math.random();
            if (random <= aVar.mo55862S1() && aVar.mo55862S1() >= 0.0d) {
                aVar.mo55864kD(random);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.DiceCup", th, "", new Object[0]);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public synchronized void mo112808c(com.tencent.p014mm.matrix.dice.C80982a.C80983a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r1.mo112806a(r2)     // Catch:{ all -> 0x002a }
            monitor-enter(r1)     // Catch:{ all -> 0x002a }
            java.util.Map<java.lang.String, com.tencent.mm.matrix.dice.a$a> r0 = r1.f237864d     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = r2.key()     // Catch:{ all -> 0x0027 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0027 }
            r0.remove(r2)     // Catch:{ all -> 0x0027 }
            java.util.Map<java.lang.String, com.tencent.mm.matrix.dice.a$a> r2 = r1.f237864d     // Catch:{ all -> 0x0027 }
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ all -> 0x0027 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0024
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PostSyncTaskEvent> r2 = r1.f237865e     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0024
            r2.dead()     // Catch:{ all -> 0x0027 }
            r2 = 0
            r1.f237865e = r2     // Catch:{ all -> 0x0027 }
        L_0x0024:
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r1)
            return
        L_0x0027:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            throw r2     // Catch:{ all -> 0x002a }
        L_0x002a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.matrix.dice.C80982a.mo112808c(com.tencent.mm.matrix.dice.a$a):void");
    }

    public synchronized void run() {
        for (Map.Entry value : ((ConcurrentHashMap) this.f237864d).entrySet()) {
            mo112807b((C80983a) value.getValue());
        }
    }
}
