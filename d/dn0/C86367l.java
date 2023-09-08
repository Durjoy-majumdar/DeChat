package dn0;

/* renamed from: dn0.l */
public class C86367l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86363h f251095d;

    /* renamed from: e */
    public final /* synthetic */ long f251096e;

    /* renamed from: f */
    public final /* synthetic */ String f251097f;

    /* renamed from: g */
    public final /* synthetic */ C86368m f251098g;

    public C86367l(C86368m mVar, C86363h hVar, long j, C86364i iVar, String str) {
        this.f251098g = mVar;
        this.f251095d = hVar;
        this.f251096e = j;
        this.f251097f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
        r3 = 4;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ca, code lost:
        r3 = r0;
        r4 = 4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c9 A[ExcHandler: all (r0v17 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r25 = this;
            r1 = r25
            dn0.m r0 = r1.f251098g
            dn0.h r2 = r1.f251095d
            java.lang.String r2 = r2.f251087b
            long r3 = r1.f251096e
            java.lang.String r5 = r1.f251097f
            r0.getClass()
            cn0.j r6 = new cn0.j
            r7 = 0
            java.lang.String r0 = "com.tencent.mm.video"
            r6.<init>(r0, r7, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "VideoManager/sendUrlRequest/"
            r0.append(r8)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r0 = 512(0x200, float:7.175E-43)
            byte[] r8 = new byte[r0]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "sendUrlRequest start url="
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r10 = 4
            fn0.C87002g.m108023q(r10, r5, r9, r7)
            r9 = 0
            java.lang.String r11 = "sendUrlRequest closeException"
            r12 = -1
            cn0.g r15 = new cn0.g     // Catch:{ Exception -> 0x00ce, all -> 0x00c9 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00ce, all -> 0x00c9 }
            r16 = 0
            r18 = 0
            r20 = -1
            r22 = 0
            r23 = 0
            r24 = 0
            r14 = r15
            r0 = r15
            r15 = r2
            r14.<init>(r15, r16, r18, r20, r22, r23, r24)     // Catch:{ Exception -> 0x00ce, all -> 0x00c9 }
            r6.mo109837b(r0)     // Catch:{ Exception -> 0x00ce, all -> 0x00c9 }
            long r14 = r6.f234559t     // Catch:{ Exception -> 0x00ce, all -> 0x00c9 }
            r16 = r9
            r0 = 512(0x200, float:7.175E-43)
        L_0x006a:
            r2 = 0
            int r0 = r6.mo109838c(r8, r2, r0)     // Catch:{ Exception -> 0x00c3, all -> 0x00c9 }
            r18 = r8
            long r7 = (long) r0
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            long r16 = r16 + r7
            r0 = 4
            int r7 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0086
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x0086
            int r7 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x0086
            goto L_0x008d
        L_0x0086:
            r0 = 512(0x200, float:7.175E-43)
            r8 = r18
            r7 = 0
            goto L_0x006a
        L_0x008c:
            r0 = 4
        L_0x008d:
            r7 = r16
            r3 = 4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r0.<init>()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r4 = "sendUrlRequest finish, totalReadBytes="
            r0.append(r4)     // Catch:{ Exception -> 0x00c0 }
            r0.append(r7)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c0 }
            r2 = 0
            fn0.C87002g.m108023q(r3, r5, r0, r2)     // Catch:{ Exception -> 0x00c0 }
            r6.close()     // Catch:{ Exception -> 0x00aa }
            goto L_0x0105
        L_0x00aa:
            r0 = move-exception
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2 = 0
            fn0.C87002g.m108023q(r3, r5, r0, r2)
            goto L_0x0105
        L_0x00c0:
            r0 = move-exception
            r9 = r7
            goto L_0x00c7
        L_0x00c3:
            r0 = move-exception
            r3 = 4
            r9 = r16
        L_0x00c7:
            r12 = r14
            goto L_0x00d0
        L_0x00c9:
            r0 = move-exception
            r3 = 4
            r3 = r0
            r4 = 4
            goto L_0x0127
        L_0x00ce:
            r0 = move-exception
            r3 = 4
        L_0x00d0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0124 }
            r4.<init>()     // Catch:{ all -> 0x0124 }
            java.lang.String r7 = "sendUrlRequest fail with message"
            r4.append(r7)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0124 }
            r4.append(r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0124 }
            r2 = 0
            fn0.C87002g.m108023q(r3, r5, r0, r2)     // Catch:{ all -> 0x0124 }
            r6.close()     // Catch:{ Exception -> 0x00ee }
            goto L_0x0103
        L_0x00ee:
            r0 = move-exception
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2 = 0
            fn0.C87002g.m108023q(r3, r5, r0, r2)
        L_0x0103:
            r7 = r9
            r14 = r12
        L_0x0105:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "sendUrlRequest totalLength="
            r0.append(r4)
            r0.append(r14)
            java.lang.String r4 = ", totalReadBytes="
            r0.append(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r2 = 0
            fn0.C87002g.m108023q(r3, r5, r0, r2)
            return
        L_0x0124:
            r0 = move-exception
            r4 = r3
            r3 = r0
        L_0x0127:
            r6.close()     // Catch:{ Exception -> 0x012b }
            goto L_0x0140
        L_0x012b:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r2 = 0
            fn0.C87002g.m108023q(r4, r5, r0, r2)
        L_0x0140:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dn0.C86367l.run():void");
    }
}
