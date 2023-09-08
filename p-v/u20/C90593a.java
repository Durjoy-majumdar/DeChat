package u20;

import java.lang.reflect.Field;

/* renamed from: u20.a */
public class C90593a<FieldType> {

    /* renamed from: a */
    public Class<?> f260297a;

    /* renamed from: b */
    public boolean f260298b;

    /* renamed from: c */
    public Field f260299c;

    public C90593a(Class<?> cls, String str) {
        if (cls == null || str == null || str.length() == 0) {
            throw new IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f260297a = cls;
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
    public synchronized FieldType mo124752a(boolean r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x003a }
            boolean r0 = r5.f260298b     // Catch:{ all -> 0x0051 }
            r1 = 1
            if (r0 == 0) goto L_0x0009
            monitor-exit(r5)     // Catch:{ all -> 0x003a }
            goto L_0x0022
        L_0x0009:
            java.lang.Class<?> r0 = r5.f260297a     // Catch:{ all -> 0x0051 }
        L_0x000b:
            if (r0 == 0) goto L_0x001f
            java.lang.String r2 = "sThreadLocal"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x001a }
            r2.setAccessible(r1)     // Catch:{ Exception -> 0x001a }
            r5.f260299c = r2     // Catch:{ Exception -> 0x001a }
            goto L_0x001f
        L_0x001a:
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ all -> 0x0051 }
            goto L_0x000b
        L_0x001f:
            r5.f260298b = r1     // Catch:{ all -> 0x0051 }
            monitor-exit(r5)     // Catch:{ all -> 0x003a }
        L_0x0022:
            java.lang.reflect.Field r0 = r5.f260299c     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r0 != 0) goto L_0x0042
            if (r6 == 0) goto L_0x003c
            java.lang.String r6 = "SDK.ReflectStaticFieldSmith"
            java.lang.String r0 = "Field %s is no exists."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x003a }
            r3 = 0
            java.lang.String r4 = "sThreadLocal"
            r1[r3] = r4     // Catch:{ all -> 0x003a }
            v20.C90741c.m113810c(r6, r0, r1)     // Catch:{ all -> 0x003a }
            monitor-exit(r5)
            return r2
        L_0x003a:
            r6 = move-exception
            goto L_0x0054
        L_0x003c:
            java.lang.NoSuchFieldException r6 = new java.lang.NoSuchFieldException     // Catch:{ all -> 0x003a }
            r6.<init>()     // Catch:{ all -> 0x003a }
            throw r6     // Catch:{ all -> 0x003a }
        L_0x0042:
            java.lang.Object r6 = r0.get(r2)     // Catch:{ ClassCastException -> 0x0048 }
            monitor-exit(r5)
            return r6
        L_0x0048:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "unable to cast object"
            r6.<init>(r0)     // Catch:{ all -> 0x003a }
            throw r6     // Catch:{ all -> 0x003a }
        L_0x0051:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003a }
            throw r6     // Catch:{ all -> 0x003a }
        L_0x0054:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u20.C90593a.mo124752a(boolean):java.lang.Object");
    }
}
