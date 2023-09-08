package u34;

import n34.C117604b;
import u34.C118574e;

/* renamed from: u34.a */
public final class C118570a implements C117604b<C118574e.C118576b<Object>> {

    /* renamed from: d */
    public final /* synthetic */ C118574e f354852d;

    public C118570a(C118574e eVar) {
        this.f354852d = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        r5 = null;
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        if (r5 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r5.hasNext() == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r7 = r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        if (r7 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        r1.mo182372a(r10.f354867d, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (r6 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        r1.mo182372a(r10.f354867d, r0);
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5 = r10.f354870g;
        r10.f354870g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (r5 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        r10.f354869f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0055, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005c, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x005d, code lost:
        if (r3 == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x005f, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r10.f354869f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0067, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void call(java.lang.Object r10) {
        /*
            r9 = this;
            u34.e$b r10 = (u34.C118574e.C118576b) r10
            u34.e r0 = r9.f354852d
            java.lang.Object r0 = r0.f354856d
            u34.e r1 = r9.f354852d
            o34.d<T> r1 = r1.f354861i
            monitor-enter(r10)
            boolean r2 = r10.f354868e     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0068
            boolean r2 = r10.f354869f     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0014
            goto L_0x0068
        L_0x0014:
            r2 = 0
            r10.f354868e = r2     // Catch:{ all -> 0x006a }
            r3 = 1
            if (r0 == 0) goto L_0x001c
            r4 = 1
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            r10.f354869f = r4     // Catch:{ all -> 0x006a }
            monitor-exit(r10)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0069
            r4 = 0
            r5 = r4
            r6 = 1
        L_0x0025:
            if (r5 == 0) goto L_0x003f
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x003d }
        L_0x002b:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x003d }
            if (r7 == 0) goto L_0x003f
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x003d }
            if (r7 == 0) goto L_0x002b
            l34.j<? super T> r8 = r10.f354867d     // Catch:{ all -> 0x003d }
            r1.mo182372a(r8, r7)     // Catch:{ all -> 0x003d }
            goto L_0x002b
        L_0x003d:
            r0 = move-exception
            goto L_0x005c
        L_0x003f:
            if (r6 == 0) goto L_0x0047
            l34.j<? super T> r5 = r10.f354867d     // Catch:{ all -> 0x003d }
            r1.mo182372a(r5, r0)     // Catch:{ all -> 0x003d }
            r6 = 0
        L_0x0047:
            monitor-enter(r10)     // Catch:{ all -> 0x003d }
            java.util.List<java.lang.Object> r5 = r10.f354870g     // Catch:{ all -> 0x0054 }
            r10.f354870g = r4     // Catch:{ all -> 0x0054 }
            if (r5 != 0) goto L_0x0052
            r10.f354869f = r2     // Catch:{ all -> 0x0054 }
            monitor-exit(r10)     // Catch:{ all -> 0x005a }
            goto L_0x0069
        L_0x0052:
            monitor-exit(r10)     // Catch:{ all -> 0x0054 }
            goto L_0x0025
        L_0x0054:
            r0 = move-exception
            r3 = 0
        L_0x0056:
            monitor-exit(r10)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            goto L_0x005d
        L_0x005a:
            r0 = move-exception
            goto L_0x0056
        L_0x005c:
            r3 = 0
        L_0x005d:
            if (r3 != 0) goto L_0x0067
            monitor-enter(r10)
            r10.f354869f = r2     // Catch:{ all -> 0x0064 }
            monitor-exit(r10)     // Catch:{ all -> 0x0064 }
            goto L_0x0067
        L_0x0064:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0064 }
            throw r0
        L_0x0067:
            throw r0
        L_0x0068:
            monitor-exit(r10)     // Catch:{ all -> 0x006a }
        L_0x0069:
            return
        L_0x006a:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u34.C118570a.call(java.lang.Object):void");
    }
}
