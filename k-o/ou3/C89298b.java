package ou3;

import java.lang.reflect.Method;

/* renamed from: ou3.b */
public class C89298b {

    /* renamed from: a */
    public Class<?> f257251a;

    /* renamed from: b */
    public boolean f257252b;

    /* renamed from: c */
    public Method f257253c;

    /* renamed from: d */
    public Class[] f257254d;

    public C89298b(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null || str == null || str.length() == 0) {
            throw new IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f257251a = cls;
        this.f257254d = clsArr;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized <T> T mo123642a(java.lang.Object r5, boolean r6, java.lang.Object... r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x0040 }
            boolean r0 = r4.f257252b     // Catch:{ all -> 0x001c }
            r1 = 1
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
            goto L_0x0026
        L_0x0009:
            java.lang.Class<?> r0 = r4.f257251a     // Catch:{ all -> 0x001c }
        L_0x000b:
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = "recycleUnchecked"
            java.lang.Class[] r3 = r4.f257254d     // Catch:{ Exception -> 0x001e }
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r3)     // Catch:{ Exception -> 0x001e }
            r2.setAccessible(r1)     // Catch:{ Exception -> 0x001e }
            r4.f257253c = r2     // Catch:{ Exception -> 0x001e }
            goto L_0x0023
        L_0x001c:
            r5 = move-exception
            goto L_0x0050
        L_0x001e:
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ all -> 0x001c }
            goto L_0x000b
        L_0x0023:
            r4.f257252b = r1     // Catch:{ all -> 0x001c }
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
        L_0x0026:
            java.lang.reflect.Method r0 = r4.f257253c     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x004a
            if (r6 == 0) goto L_0x0042
            zt3.d$b r5 = zt3.C119146d.f356851c     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = "ReflectFiled"
            java.lang.String r7 = "Field %s is no exists"
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x0040 }
            r1 = 0
            java.lang.String r2 = "recycleUnchecked"
            r0[r1] = r2     // Catch:{ all -> 0x0040 }
            r5.mo125766w(r6, r7, r0)     // Catch:{ all -> 0x0040 }
            r5 = 0
            monitor-exit(r4)
            return r5
        L_0x0040:
            r5 = move-exception
            goto L_0x0052
        L_0x0042:
            java.lang.NoSuchFieldException r5 = new java.lang.NoSuchFieldException     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = "Method recycleUnchecked is not exists."
            r5.<init>(r6)     // Catch:{ all -> 0x0040 }
            throw r5     // Catch:{ all -> 0x0040 }
        L_0x004a:
            java.lang.Object r5 = r0.invoke(r5, r7)     // Catch:{ all -> 0x0040 }
            monitor-exit(r4)
            return r5
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
            throw r5     // Catch:{ all -> 0x0040 }
        L_0x0052:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ou3.C89298b.mo123642a(java.lang.Object, boolean, java.lang.Object[]):java.lang.Object");
    }
}
