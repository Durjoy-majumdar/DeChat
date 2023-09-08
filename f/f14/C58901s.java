package f14;

import a14.C53915k2;

/* renamed from: f14.s */
public final class C58901s {

    /* renamed from: a */
    public static final C53915k2 f168555a;

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.hintOnError();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0059 */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = f14.C58876e0.f168513a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000a }
            goto L_0x000c
        L_0x000a:
            r0 = r1
        L_0x000c:
            if (r0 == 0) goto L_0x0011
            java.lang.Boolean.parseBoolean(r0)
        L_0x0011:
            java.util.Iterator r0 = f14.C58900r.m68762a()     // Catch:{ all -> 0x0069 }
            y04.h r0 = y04.C112349m.m153278a(r0)     // Catch:{ all -> 0x0069 }
            java.util.List r0 = y04.C112354s.m153296s(r0)     // Catch:{ all -> 0x0069 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0069 }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0069 }
            if (r3 != 0) goto L_0x0029
            r3 = r1
            goto L_0x0050
        L_0x0029:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0069 }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0069 }
            if (r4 != 0) goto L_0x0034
            goto L_0x0050
        L_0x0034:
            r4 = r3
            f14.q r4 = (f14.C58899q) r4     // Catch:{ all -> 0x0069 }
            int r4 = r4.getLoadPriority()     // Catch:{ all -> 0x0069 }
        L_0x003b:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0069 }
            r6 = r5
            f14.q r6 = (f14.C58899q) r6     // Catch:{ all -> 0x0069 }
            int r6 = r6.getLoadPriority()     // Catch:{ all -> 0x0069 }
            if (r4 >= r6) goto L_0x004a
            r3 = r5
            r4 = r6
        L_0x004a:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0069 }
            if (r5 != 0) goto L_0x003b
        L_0x0050:
            f14.q r3 = (f14.C58899q) r3     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x0061
            a14.k2 r1 = r3.createDispatcher(r0)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r3.hintOnError()     // Catch:{ all -> 0x0069 }
        L_0x005c:
            if (r1 == 0) goto L_0x0061
            f168555a = r1
            return
        L_0x0061:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f14.C58901s.<clinit>():void");
    }
}
