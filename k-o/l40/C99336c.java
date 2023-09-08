package l40;

import java.util.concurrent.ConcurrentHashMap;
import m40.C99786a;

/* renamed from: l40.c */
public class C99336c {

    /* renamed from: b */
    public static C99336c f291266b = new C99336c();

    /* renamed from: a */
    public ConcurrentHashMap<Integer, C99335b> f291267a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo138731a() {
        for (C99335b bVar : this.f291267a.values()) {
            bVar.f291265a.clear();
        }
        this.f291267a.clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: l40.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l40.C99339f mo138732b(m40.C99786a r3, java.lang.CharSequence r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0039
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, l40.b> r1 = r2.f291267a
            int r3 = r3.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r1.get(r3)
            l40.b r3 = (l40.C99335b) r3
            if (r3 == 0) goto L_0x0039
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.LinkedList<l40.f>> r1 = r3.f291265a     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0036 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0036 }
            java.util.LinkedList r4 = (java.util.LinkedList) r4     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x0034
            int r1 = r4.size()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x002b
            goto L_0x0034
        L_0x002b:
            java.lang.Object r4 = r4.removeFirst()     // Catch:{ all -> 0x0036 }
            r0 = r4
            l40.f r0 = (l40.C99339f) r0     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)
            goto L_0x0035
        L_0x0034:
            monitor-exit(r3)
        L_0x0035:
            return r0
        L_0x0036:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.C99336c.mo138732b(m40.a, java.lang.CharSequence):l40.f");
    }

    /* renamed from: c */
    public void mo138733c(C99786a aVar, C99339f fVar) {
        if (aVar != null) {
            C99335b bVar = this.f291267a.get(Integer.valueOf(aVar.hashCode()));
            if (bVar != null) {
                bVar.mo138730a(fVar);
                this.f291267a.put(Integer.valueOf(aVar.hashCode()), bVar);
                return;
            }
            C99335b bVar2 = new C99335b();
            bVar2.mo138730a(fVar);
            this.f291267a.put(Integer.valueOf(aVar.hashCode()), bVar2);
        }
    }
}
