package p339fh;

import java.util.HashMap;
import java.util.LinkedList;
import p335eh.C116768d;

/* renamed from: fh.j */
public class C116869j {

    /* renamed from: d */
    public static C116869j f350293d;

    /* renamed from: a */
    public volatile LinkedList<String> f350294a = new LinkedList<>();

    /* renamed from: b */
    public volatile HashMap<String, C116768d> f350295b = new HashMap<>();

    /* renamed from: c */
    public volatile Object f350296c = new Object();

    /* renamed from: a */
    public static C116869j m164845a() {
        if (f350293d == null) {
            synchronized (C116869j.class) {
                if (f350293d == null) {
                    f350293d = new C116869j();
                }
            }
        }
        return f350293d;
    }

    /* renamed from: b */
    public C116768d mo180853b(String str) {
        C116768d dVar;
        synchronized (this.f350296c) {
            if (!this.f350294a.contains(str)) {
                this.f350294a.add(str);
            }
            dVar = this.f350295b.get(str);
            if (dVar == null) {
                dVar = new C116768d(str);
                this.f350295b.put(str, dVar);
            }
        }
        return dVar;
    }

    /* renamed from: c */
    public int mo180854c(String str) {
        synchronized (this.f350296c) {
            if (!this.f350294a.contains(str)) {
                return 0;
            }
            C116768d dVar = this.f350295b.get(str);
            if (dVar == null) {
                return 0;
            }
            int k = dVar.mo180745k();
            return k;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo180855d(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f350296c
            monitor-enter(r0)
            java.util.LinkedList<java.lang.String> r1 = r3.f350294a     // Catch:{ all -> 0x0027 }
            boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x0027 }
            r2 = 0
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x000e:
            java.util.HashMap<java.lang.String, eh.d> r1 = r3.f350295b     // Catch:{ all -> 0x0027 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0027 }
            eh.d r4 = (p335eh.C116768d) r4     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0025
            int r1 = r4.mo180745k()     // Catch:{ all -> 0x0027 }
            if (r1 <= 0) goto L_0x0025
            boolean r4 = r4.f350073b     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0025
            r4 = 1
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r4
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x0027:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p339fh.C116869j.mo180855d(java.lang.String):boolean");
    }
}
