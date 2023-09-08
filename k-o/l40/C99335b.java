package l40;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l40.b */
public class C99335b {

    /* renamed from: a */
    public ConcurrentHashMap<String, LinkedList<C99339f>> f291265a = new ConcurrentHashMap<>();

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo138730a(l40.C99339f r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            java.lang.CharSequence r0 = r3.f291294d     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0008
            goto L_0x002e
        L_0x0008:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.LinkedList<l40.f>> r1 = r2.f291265a     // Catch:{ all -> 0x002b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x002b }
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x001b
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x002b }
            r0.<init>()     // Catch:{ all -> 0x002b }
        L_0x001b:
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.LinkedList<l40.f>> r1 = r2.f291265a     // Catch:{ all -> 0x002b }
            java.lang.CharSequence r3 = r3.f291294d     // Catch:{ all -> 0x002b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x002b }
            r1.put(r3, r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.C99335b.mo138730a(l40.f):void");
    }
}
