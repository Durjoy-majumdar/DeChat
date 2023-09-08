package p834a3;

/* renamed from: a3.b */
public final class C112741b {

    /* renamed from: a */
    public boolean f337597a;

    /* renamed from: b */
    public C112742a f337598b;

    /* renamed from: c */
    public boolean f337599c;

    /* renamed from: a3.b$a */
    public interface C112742a {
        void onCancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.onCancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.f337599c = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0022, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.f337599c = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0028, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r0 == null) goto L_0x0022;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo164500a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f337597a     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return
        L_0x0007:
            r0 = 1
            r2.f337597a = r0     // Catch:{ all -> 0x002d }
            r2.f337599c = r0     // Catch:{ all -> 0x002d }
            a3.b$a r0 = r2.f337598b     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            r0.onCancel()     // Catch:{ all -> 0x0016 }
            goto L_0x0022
        L_0x0016:
            r0 = move-exception
            monitor-enter(r2)
            r2.f337599c = r1     // Catch:{ all -> 0x001f }
            r2.notifyAll()     // Catch:{ all -> 0x001f }
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            throw r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            throw r0
        L_0x0022:
            monitor-enter(r2)
            r2.f337599c = r1     // Catch:{ all -> 0x002a }
            r2.notifyAll()     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p834a3.C112741b.mo164500a():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:24:0x0001, LOOP_START, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo164501b(p834a3.C112741b.C112742a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            boolean r0 = r1.f337599c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0009
            r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0009:
            a3.b$a r0 = r1.f337598b     // Catch:{ all -> 0x001f }
            if (r0 != r2) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return
        L_0x000f:
            r1.f337598b = r2     // Catch:{ all -> 0x001f }
            boolean r0 = r1.f337597a     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001d
            if (r2 != 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            r2.onCancel()
            return
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p834a3.C112741b.mo164501b(a3.b$a):void");
    }
}
