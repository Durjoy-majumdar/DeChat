package p1132m5;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import gy3.C87412m;
import p1042u.C111058g;
import p1106e5.C107230c;
import p1132m5.C109518n;
import p864t5.C110908h;

/* renamed from: m5.o */
public final class C109520o implements C109527r {

    /* renamed from: b */
    public final C109530u f327790b;

    /* renamed from: c */
    public final C107230c f327791c;

    /* renamed from: d */
    public final C109522b f327792d;

    /* renamed from: m5.o$a */
    public static final class C109521a implements C109518n.C109519a {

        /* renamed from: a */
        public final Bitmap f327793a;

        /* renamed from: b */
        public final boolean f327794b;

        /* renamed from: c */
        public final int f327795c;

        public C109521a(Bitmap bitmap, boolean z, int i) {
            C87412m.m108594g(bitmap, "bitmap");
            this.f327793a = bitmap;
            this.f327794b = z;
            this.f327795c = i;
        }

        /* renamed from: a */
        public boolean mo160745a() {
            return this.f327794b;
        }

        public Bitmap getBitmap() {
            return this.f327793a;
        }
    }

    /* renamed from: m5.o$b */
    public static final class C109522b extends C111058g<MemoryCache$Key, C109521a> {

        /* renamed from: a */
        public final /* synthetic */ C109520o f327796a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109522b(C109520o oVar, int i) {
            super(i);
            this.f327796a = oVar;
        }

        public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            MemoryCache$Key memoryCache$Key = (MemoryCache$Key) obj;
            C109521a aVar = (C109521a) obj2;
            C109521a aVar2 = (C109521a) obj3;
            C87412m.m108594g(memoryCache$Key, "key");
            C87412m.m108594g(aVar, "oldValue");
            if (!this.f327796a.f327791c.mo157702b(aVar.f327793a)) {
                this.f327796a.f327790b.mo160736c(memoryCache$Key, aVar.f327793a, aVar.f327794b, aVar.f327795c);
            }
        }

        public int sizeOf(Object obj, Object obj2) {
            C109521a aVar = (C109521a) obj2;
            C87412m.m108594g((MemoryCache$Key) obj, "key");
            C87412m.m108594g(aVar, "value");
            return aVar.f327795c;
        }
    }

    public C109520o(C109530u uVar, C107230c cVar, int i, C110908h hVar) {
        C87412m.m108594g(uVar, "weakMemoryCache");
        C87412m.m108594g(cVar, "referenceCounter");
        this.f327790b = uVar;
        this.f327791c = cVar;
        this.f327792d = new C109522b(this, i);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo160731a(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 40
            if (r3 < r0) goto L_0x0013
            monitor-enter(r2)     // Catch:{ all -> 0x0011 }
            m5.o$b r3 = r2.f327792d     // Catch:{ all -> 0x000e }
            r0 = -1
            r3.trimToSize(r0)     // Catch:{ all -> 0x000e }
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            goto L_0x002d
        L_0x000e:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            throw r3     // Catch:{ all -> 0x0011 }
        L_0x0011:
            r3 = move-exception
            goto L_0x002b
        L_0x0013:
            r0 = 10
            r1 = 0
            if (r0 > r3) goto L_0x001d
            r0 = 20
            if (r3 >= r0) goto L_0x001d
            r1 = 1
        L_0x001d:
            if (r1 == 0) goto L_0x002d
            m5.o$b r3 = r2.f327792d     // Catch:{ all -> 0x0011 }
            int r0 = r3.size()     // Catch:{ all -> 0x0011 }
            int r0 = r0 / 2
            r3.trimToSize(r0)     // Catch:{ all -> 0x0011 }
            goto L_0x002d
        L_0x002b:
            monitor-exit(r2)
            throw r3
        L_0x002d:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1132m5.C109520o.mo160731a(int):void");
    }

    /* renamed from: b */
    public synchronized C109518n.C109519a mo160732b(MemoryCache$Key memoryCache$Key) {
        C87412m.m108594g(memoryCache$Key, "key");
        return (C109518n.C109519a) this.f327792d.get(memoryCache$Key);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo160733c(coil.memory.MemoryCache$Key r4, android.graphics.Bitmap r5, boolean r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "key"
            gy3.C87412m.m108594g(r4, r0)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = "bitmap"
            gy3.C87412m.m108594g(r5, r0)     // Catch:{ all -> 0x0039 }
            int r0 = p864t5.C110902a.m151198a(r5)     // Catch:{ all -> 0x0039 }
            m5.o$b r1 = r3.f327792d     // Catch:{ all -> 0x0039 }
            int r1 = r1.maxSize()     // Catch:{ all -> 0x0039 }
            if (r0 <= r1) goto L_0x0028
            m5.o$b r1 = r3.f327792d     // Catch:{ all -> 0x0039 }
            java.lang.Object r1 = r1.remove(r4)     // Catch:{ all -> 0x0039 }
            m5.o$a r1 = (p1132m5.C109520o.C109521a) r1     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x0026
            m5.u r1 = r3.f327790b     // Catch:{ all -> 0x0039 }
            r1.mo160736c(r4, r5, r6, r0)     // Catch:{ all -> 0x0039 }
        L_0x0026:
            monitor-exit(r3)
            return
        L_0x0028:
            e5.c r1 = r3.f327791c     // Catch:{ all -> 0x0039 }
            r1.mo157703c(r5)     // Catch:{ all -> 0x0039 }
            m5.o$b r1 = r3.f327792d     // Catch:{ all -> 0x0039 }
            m5.o$a r2 = new m5.o$a     // Catch:{ all -> 0x0039 }
            r2.<init>(r5, r6, r0)     // Catch:{ all -> 0x0039 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return
        L_0x0039:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p1132m5.C109520o.mo160733c(coil.memory.MemoryCache$Key, android.graphics.Bitmap, boolean):void");
    }
}
