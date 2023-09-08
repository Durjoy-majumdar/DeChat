package t20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: t20.a */
public class C90365a {

    /* renamed from: a */
    public static final Set<Object> f259368a = new HashSet();

    /* renamed from: b */
    public static final Map<String, Set<C90366b>> f259369b = new HashMap();

    /* JADX WARNING: CFG modification limit reached, blocks count: 131 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m113156a(java.lang.String r8) {
        /*
            if (r8 == 0) goto L_0x005c
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0009
            goto L_0x005c
        L_0x0009:
            java.util.Map<java.lang.String, java.util.Set<t20.b>> r0 = f259369b
            monitor-enter(r0)
            r1 = r0
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.remove(r8)     // Catch:{ all -> 0x005a }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.String r0 = "IPC.ObjectRecycler"
            java.lang.String r2 = "recycleAll(%s)"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r8
            v20.C90741c.m113809b(r0, r2, r4)
            monitor-enter(r1)
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x0055 }
        L_0x002c:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0055 }
            t20.b r0 = (t20.C90366b) r0     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = "IPC.ObjectRecycler"
            java.lang.String r4 = "recycle(%s)"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0055 }
            int r7 = r0.hashCode()     // Catch:{ all -> 0x0055 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0055 }
            r6[r5] = r7     // Catch:{ all -> 0x0055 }
            v20.C90741c.m113809b(r2, r4, r6)     // Catch:{ all -> 0x0055 }
            r0.recycle()     // Catch:{ all -> 0x0055 }
            goto L_0x002c
        L_0x0050:
            r1.clear()     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            return
        L_0x0055:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r8
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r8
        L_0x005a:
            r8 = move-exception
            goto L_0x0058
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t20.C90365a.m113156a(java.lang.String):void");
    }
}
