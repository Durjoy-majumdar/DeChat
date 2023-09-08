package sn2;

/* renamed from: sn2.c */
public class C22374c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C22371b f63446d;

    public C22374c(C22371b bVar) {
        this.f63446d = bVar;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [ob0.y] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r2v6, types: [sn2.j] */
    /* JADX WARNING: type inference failed for: r2v7, types: [sn2.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r1.f63433q = true;
        r0 = r1.f63427h;
        r4 = r1.f63425f;
        r8 = r1.f63435s;
        r9 = r1.f63434r;
        r1 = r1.f63436t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r0 != 367) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r2 = new sn2.C64055h(r5, r4, r6, r8, r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r0 != 408) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r2 = new sn2.C64056j(r5, r4, r6, r8, r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        eb0.C97625j3.m125815e().mo123460f(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            sn2.b r0 = r10.f63446d
            boolean r1 = r0.f63433q
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "MicroMsg.MusicFingerPrintRecorder"
            java.lang.String r4 = "tryStartNetscene clientid: %d but netscene is running."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r0 = r0.f63435s
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r2)
            return
        L_0x001b:
            byte[] r0 = r0.f63423d
            monitor-enter(r0)
            sn2.b r1 = r10.f63446d     // Catch:{ all -> 0x0069 }
            int r4 = r1.f63424e     // Catch:{ all -> 0x0069 }
            if (r4 > 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return
        L_0x0026:
            byte[] r5 = new byte[r4]     // Catch:{ all -> 0x0069 }
            byte[] r1 = r1.f63423d     // Catch:{ all -> 0x0069 }
            java.lang.System.arraycopy(r1, r3, r5, r3, r4)     // Catch:{ all -> 0x0069 }
            sn2.b r1 = r10.f63446d     // Catch:{ all -> 0x0069 }
            r1.f63424e = r3     // Catch:{ all -> 0x0069 }
            long r6 = r1.f63426g     // Catch:{ all -> 0x0069 }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            r1.f63433q = r2
            int r0 = r1.f63427h
            int r4 = r1.f63425f
            int r8 = r1.f63435s
            boolean r9 = r1.f63434r
            int r1 = r1.f63436t
            r2 = 367(0x16f, float:5.14E-43)
            if (r0 != r2) goto L_0x0050
            sn2.h r0 = new sn2.h
            r2 = r0
            r3 = r5
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r1
            r2.<init>(r3, r4, r5, r7, r8, r9)
            goto L_0x0061
        L_0x0050:
            r2 = 408(0x198, float:5.72E-43)
            if (r0 != r2) goto L_0x0060
            sn2.j r0 = new sn2.j
            r2 = r0
            r3 = r5
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r1
            r2.<init>(r3, r4, r5, r7, r8, r9)
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            r1.mo123460f(r0)
            return
        L_0x0069:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sn2.C22374c.run():void");
    }

    public String toString() {
        return super.toString() + "|tryStartNetscene";
    }
}
