package pw3;

import java.util.HashMap;
import java.util.Map;

/* renamed from: pw3.a */
public class C89441a {

    /* renamed from: a */
    public Map<Object, Long> f257486a = new HashMap();

    /* renamed from: a */
    public long mo123760a(Object obj) {
        long longValue;
        synchronized (C89441a.class) {
            longValue = ((Long) ((HashMap) this.f257486a).remove(obj)).longValue();
        }
        return longValue;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0071 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007f */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo123761b(long r8, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.Class<pw3.a> r0 = pw3.C89441a.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ ClassNotFoundException -> 0x007f }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x007f }
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0077
            java.util.Map<java.lang.Object, java.lang.Long> r2 = r7.f257486a     // Catch:{ ClassNotFoundException -> 0x007f }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ ClassNotFoundException -> 0x007f }
            java.util.Set r2 = r2.entrySet()     // Catch:{ ClassNotFoundException -> 0x007f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ ClassNotFoundException -> 0x007f }
        L_0x001a:
            boolean r3 = r2.hasNext()     // Catch:{ ClassNotFoundException -> 0x007f }
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r2.next()     // Catch:{ ClassNotFoundException -> 0x007f }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ ClassNotFoundException -> 0x007f }
            java.lang.Object r4 = r3.getKey()     // Catch:{ ClassNotFoundException -> 0x007f }
            java.lang.Object r3 = r3.getValue()     // Catch:{ ClassNotFoundException -> 0x007f }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ ClassNotFoundException -> 0x007f }
            long r5 = r3.longValue()     // Catch:{ ClassNotFoundException -> 0x007f }
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x001a
            r1.set(r4)     // Catch:{ ClassNotFoundException -> 0x007f }
            goto L_0x001a
        L_0x003c:
            java.lang.Object r2 = r1.get()     // Catch:{ ClassNotFoundException -> 0x007f }
            if (r2 == 0) goto L_0x0048
            java.lang.Object r8 = r1.get()     // Catch:{ ClassNotFoundException -> 0x007f }
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return r8
        L_0x0048:
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            r4 = 0
            r2[r4] = r3     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            java.lang.reflect.Constructor r10 = r10.getConstructor(r2)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            r1[r4] = r2     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            java.lang.Object r10 = r10.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            java.util.Map<java.lang.Object, java.lang.Long> r1 = r7.f257486a     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            r1.put(r10, r8)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0071 }
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return r10
        L_0x0071:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x007f }
            r8.<init>()     // Catch:{ ClassNotFoundException -> 0x007f }
            throw r8     // Catch:{ ClassNotFoundException -> 0x007f }
        L_0x0077:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x007f }
            r8.<init>()     // Catch:{ ClassNotFoundException -> 0x007f }
            throw r8     // Catch:{ ClassNotFoundException -> 0x007f }
        L_0x007d:
            r8 = move-exception
            goto L_0x0085
        L_0x007f:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x007d }
            r8.<init>()     // Catch:{ all -> 0x007d }
            throw r8     // Catch:{ all -> 0x007d }
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pw3.C89441a.mo123761b(long, java.lang.String):java.lang.Object");
    }
}
