package p723vf;

import java.lang.reflect.Method;

/* renamed from: vf.l */
public class C90789l {

    /* renamed from: a */
    public Class<?> f260706a;

    /* renamed from: b */
    public String f260707b;

    /* renamed from: c */
    public boolean f260708c;

    /* renamed from: d */
    public Method f260709d;

    /* renamed from: e */
    public Class[] f260710e;

    public C90789l(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null || str == null || str.length() == 0) {
            throw new IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f260706a = cls;
        this.f260707b = str;
        this.f260710e = clsArr;
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
    public synchronized <T> T mo124911a(java.lang.Object r5, boolean r6, java.lang.Object... r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x005e }
            boolean r0 = r4.f260708c     // Catch:{ all -> 0x0060 }
            r1 = 1
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
            goto L_0x0023
        L_0x0009:
            java.lang.Class<?> r0 = r4.f260706a     // Catch:{ all -> 0x0060 }
        L_0x000b:
            if (r0 == 0) goto L_0x0020
            java.lang.String r2 = r4.f260707b     // Catch:{ Exception -> 0x001b }
            java.lang.Class[] r3 = r4.f260710e     // Catch:{ Exception -> 0x001b }
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r3)     // Catch:{ Exception -> 0x001b }
            r2.setAccessible(r1)     // Catch:{ Exception -> 0x001b }
            r4.f260709d = r2     // Catch:{ Exception -> 0x001b }
            goto L_0x0020
        L_0x001b:
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ all -> 0x0060 }
            goto L_0x000b
        L_0x0020:
            r4.f260708c = r1     // Catch:{ all -> 0x0060 }
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
        L_0x0023:
            java.lang.reflect.Method r0 = r4.f260709d     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0058
            if (r6 == 0) goto L_0x003a
            java.lang.String r5 = "ReflectFiled"
            java.lang.String r6 = "Field %s is no exists"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x005e }
            r0 = 0
            java.lang.String r1 = r4.f260707b     // Catch:{ all -> 0x005e }
            r7[r0] = r1     // Catch:{ all -> 0x005e }
            p723vf.C118672d.m167356f(r5, r6, r7)     // Catch:{ all -> 0x005e }
            r5 = 0
            monitor-exit(r4)
            return r5
        L_0x003a:
            java.lang.NoSuchFieldException r5 = new java.lang.NoSuchFieldException     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r6.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r7 = "Method "
            r6.append(r7)     // Catch:{ all -> 0x005e }
            java.lang.String r7 = r4.f260707b     // Catch:{ all -> 0x005e }
            r6.append(r7)     // Catch:{ all -> 0x005e }
            java.lang.String r7 = " is not exists."
            r6.append(r7)     // Catch:{ all -> 0x005e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x005e }
            r5.<init>(r6)     // Catch:{ all -> 0x005e }
            throw r5     // Catch:{ all -> 0x005e }
        L_0x0058:
            java.lang.Object r5 = r0.invoke(r5, r7)     // Catch:{ all -> 0x005e }
            monitor-exit(r4)
            return r5
        L_0x005e:
            r5 = move-exception
            goto L_0x0063
        L_0x0060:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
            throw r5     // Catch:{ all -> 0x005e }
        L_0x0063:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p723vf.C90789l.mo124911a(java.lang.Object, boolean, java.lang.Object[]):java.lang.Object");
    }
}
