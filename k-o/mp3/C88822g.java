package mp3;

/* renamed from: mp3.g */
public class C88822g {

    /* renamed from: a */
    public volatile C88819d f256224a;

    /* renamed from: b */
    public volatile C88823a f256225b;

    /* renamed from: mp3.g$a */
    public interface C88823a {
    }

    public C88822g(C88819d dVar, C88823a aVar) {
        synchronized (this) {
            this.f256224a = dVar;
        }
        this.f256225b = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo123215a(hp3.C87581a r5, java.lang.Object r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            mp3.d r0 = r4.f256224a     // Catch:{ all -> 0x005c }
            boolean r1 = r5 instanceof mp3.C88820e     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x001e
            r1 = r5
            mp3.e r1 = (mp3.C88820e) r1     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "Vending.ANY"
            java.lang.String r3 = r1.mo55914a()     // Catch:{ all -> 0x005c }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x005c }
            if (r2 != 0) goto L_0x001e
            java.lang.String r0 = r1.mo55914a()     // Catch:{ all -> 0x005c }
            mp3.d r0 = mp3.C88824h.m110909c(r0)     // Catch:{ all -> 0x005c }
        L_0x001e:
            if (r0 != 0) goto L_0x0030
            mp3.g$a r5 = r4.f256225b     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x002e
            mp3.g$a r5 = r4.f256225b     // Catch:{ all -> 0x005c }
            lp3.e$a r5 = (lp3.C88633e.C88634a) r5     // Catch:{ all -> 0x005c }
            lp3.e r5 = lp3.C88633e.this     // Catch:{ all -> 0x005c }
            r6 = 1
            r5.mo123069i(r6)     // Catch:{ all -> 0x005c }
        L_0x002e:
            monitor-exit(r4)
            goto L_0x005b
        L_0x0030:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r2.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "object is not right: "
            r2.append(r3)     // Catch:{ all -> 0x005c }
            r2.append(r6)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005c }
            r1.<init>(r2)     // Catch:{ all -> 0x005c }
            mp3.f r2 = new mp3.f     // Catch:{ all -> 0x005c }
            r2.<init>(r4, r5, r6, r1)     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0057
            mp3.d r5 = mp3.C88824h.m110907a()     // Catch:{ all -> 0x005c }
            if (r5 != r0) goto L_0x0057
            r2.run()     // Catch:{ all -> 0x005c }
            goto L_0x005a
        L_0x0057:
            r0.arrange(r2)     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r4)
        L_0x005b:
            return
        L_0x005c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mp3.C88822g.mo123215a(hp3.a, java.lang.Object, boolean):void");
    }
}
