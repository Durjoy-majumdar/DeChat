package com.google.android.gms.common.util;

import java.util.ArrayList;

public abstract class ObjectPoolBase<T> {
    private final ArrayList<T> zzaag;
    private final int zzaah;

    public ObjectPoolBase(int i) {
        this.zzaag = new ArrayList<>(i);
        this.zzaah = i;
    }

    public final T aquire() {
        synchronized (this.zzaag) {
            int size = this.zzaag.size();
            if (size > 0) {
                T remove = this.zzaag.remove(size - 1);
                return remove;
            }
            T newObject = newObject();
            return newObject;
        }
    }

    public boolean cleanUpObject(T t) {
        return true;
    }

    public abstract T newObject();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean release(T r6) {
        /*
            r5 = this;
            java.util.ArrayList<T> r0 = r5.zzaag
            monitor-enter(r0)
            java.util.ArrayList<T> r1 = r5.zzaag     // Catch:{ all -> 0x004d }
            int r1 = r1.size()     // Catch:{ all -> 0x004d }
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r1) goto L_0x0039
            java.util.ArrayList<T> r4 = r5.zzaag     // Catch:{ all -> 0x004d }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x004d }
            if (r4 == r6) goto L_0x0018
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0018:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004d }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x004d }
            int r2 = r6.length()     // Catch:{ all -> 0x004d }
            int r2 = r2 + 25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r3.<init>(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "Object released already: "
            r3.append(r2)     // Catch:{ all -> 0x004d }
            r3.append(r6)     // Catch:{ all -> 0x004d }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x004d }
            r1.<init>(r6)     // Catch:{ all -> 0x004d }
            throw r1     // Catch:{ all -> 0x004d }
        L_0x0039:
            int r3 = r5.zzaah     // Catch:{ all -> 0x004d }
            if (r1 >= r3) goto L_0x004b
            boolean r1 = r5.cleanUpObject(r6)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList<T> r1 = r5.zzaag     // Catch:{ all -> 0x004d }
            r1.add(r6)     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            r6 = 1
            return r6
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return r2
        L_0x004d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.ObjectPoolBase.release(java.lang.Object):boolean");
    }
}
