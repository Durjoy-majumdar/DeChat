package com.tencent.wechat.aff.affroam;

import java.util.HashMap;
import java.util.Map;

public class BridgeMap {
    private Map<Object, Long> interfaceMap = new HashMap();

    public long delete(Object obj) {
        long longValue;
        synchronized (BridgeMap.class) {
            longValue = this.interfaceMap.remove(obj).longValue();
        }
        return longValue;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object transfer(long r8, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.Class<com.tencent.wechat.aff.affroam.BridgeMap> r0 = com.tencent.wechat.aff.affroam.BridgeMap.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ ClassNotFoundException -> 0x007b }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x007b }
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0073
            java.util.Map<java.lang.Object, java.lang.Long> r2 = r7.interfaceMap     // Catch:{ ClassNotFoundException -> 0x007b }
            java.util.Set r2 = r2.entrySet()     // Catch:{ ClassNotFoundException -> 0x007b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ ClassNotFoundException -> 0x007b }
        L_0x0018:
            boolean r3 = r2.hasNext()     // Catch:{ ClassNotFoundException -> 0x007b }
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r2.next()     // Catch:{ ClassNotFoundException -> 0x007b }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ ClassNotFoundException -> 0x007b }
            java.lang.Object r4 = r3.getKey()     // Catch:{ ClassNotFoundException -> 0x007b }
            java.lang.Object r3 = r3.getValue()     // Catch:{ ClassNotFoundException -> 0x007b }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ ClassNotFoundException -> 0x007b }
            long r5 = r3.longValue()     // Catch:{ ClassNotFoundException -> 0x007b }
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0018
            r1.set(r4)     // Catch:{ ClassNotFoundException -> 0x007b }
            goto L_0x0018
        L_0x003a:
            java.lang.Object r2 = r1.get()     // Catch:{ ClassNotFoundException -> 0x007b }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r8 = r1.get()     // Catch:{ ClassNotFoundException -> 0x007b }
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r8
        L_0x0046:
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            r4 = 0
            r2[r4] = r3     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            java.lang.reflect.Constructor r10 = r10.getConstructor(r2)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            r1[r4] = r2     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            java.lang.Object r10 = r10.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            java.util.Map<java.lang.Object, java.lang.Long> r1 = r7.interfaceMap     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            r1.put(r10, r8)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r10
        L_0x006d:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x007b }
            r8.<init>()     // Catch:{ ClassNotFoundException -> 0x007b }
            throw r8     // Catch:{ ClassNotFoundException -> 0x007b }
        L_0x0073:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x007b }
            r8.<init>()     // Catch:{ ClassNotFoundException -> 0x007b }
            throw r8     // Catch:{ ClassNotFoundException -> 0x007b }
        L_0x0079:
            r8 = move-exception
            goto L_0x0081
        L_0x007b:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x0079 }
            r8.<init>()     // Catch:{ all -> 0x0079 }
            throw r8     // Catch:{ all -> 0x0079 }
        L_0x0081:
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.affroam.BridgeMap.transfer(long, java.lang.String):java.lang.Object");
    }
}
