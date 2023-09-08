package p339fh;

import java.util.ArrayList;
import p335eh.C107275e;

/* renamed from: fh.h */
public class C116867h {

    /* renamed from: g */
    public static C116867h f350283g;

    /* renamed from: a */
    public ArrayList<C107275e> f350284a = new ArrayList<>();

    /* renamed from: b */
    public Object f350285b = new Object();

    /* renamed from: c */
    public long f350286c = 10000000;

    /* renamed from: d */
    public int f350287d = 0;

    /* renamed from: e */
    public int f350288e = 0;

    /* renamed from: f */
    public int f350289f = 0;

    /* renamed from: a */
    public static C116867h m164840a() {
        if (f350283g == null) {
            synchronized (C116868i.class) {
                if (f350283g == null) {
                    f350283g = new C116867h();
                }
            }
        }
        return f350283g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r9.f350289f <= 0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r9.f350289f = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r0 = new p335eh.C107275e();
        r0.f320944g = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p335eh.C107275e mo180850b() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f350285b
            monitor-enter(r0)
            java.util.ArrayList<eh.e> r1 = r9.f350284a     // Catch:{ all -> 0x006b }
            int r1 = r1.size()     // Catch:{ all -> 0x006b }
            r2 = 1
            if (r1 <= 0) goto L_0x001b
            java.util.ArrayList<eh.e> r1 = r9.f350284a     // Catch:{ all -> 0x006b }
            int r3 = r1.size()     // Catch:{ all -> 0x006b }
            int r3 = r3 - r2
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x006b }
            eh.e r1 = (p335eh.C107275e) r1     // Catch:{ all -> 0x006b }
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            return r1
        L_0x001b:
            int r1 = r9.f350287d     // Catch:{ all -> 0x006b }
            long r3 = (long) r1     // Catch:{ all -> 0x006b }
            long r5 = r9.f350286c     // Catch:{ all -> 0x006b }
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x0042
            int r3 = r9.f350289f     // Catch:{ all -> 0x006b }
            int r3 = r3 + r2
            r9.f350289f = r3     // Catch:{ all -> 0x006b }
            int r3 = r3 % 100
            if (r3 != 0) goto L_0x003f
            java.lang.String r3 = "MicroMsg.Mix.AudioPcmDataTrackFixedSizePool"
            java.lang.String r4 = "size >= FIX_SIZE, size:%d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x006b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x006b }
            r2[r7] = r1     // Catch:{ all -> 0x006b }
            int r1 = p213oh.C11412b.f33577a     // Catch:{ all -> 0x006b }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r2)     // Catch:{ all -> 0x006b }
        L_0x003f:
            r1 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            return r1
        L_0x0042:
            int r1 = r9.f350288e     // Catch:{ all -> 0x006b }
            int r1 = r1 + r2
            r9.f350288e = r1     // Catch:{ all -> 0x006b }
            int r3 = r1 * 3536
            r9.f350287d = r3     // Catch:{ all -> 0x006b }
            java.lang.String r3 = "MicroMsg.Mix.AudioPcmDataTrackFixedSizePool"
            java.lang.String r4 = "pool tract count:%d"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x006b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x006b }
            r5[r7] = r1     // Catch:{ all -> 0x006b }
            int r1 = p213oh.C11412b.f33577a     // Catch:{ all -> 0x006b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ all -> 0x006b }
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            int r0 = r9.f350289f
            if (r0 <= 0) goto L_0x0063
            r9.f350289f = r7
        L_0x0063:
            eh.e r0 = new eh.e
            r0.<init>()
            r0.f320944g = r2
            return r0
        L_0x006b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p339fh.C116867h.mo180850b():eh.e");
    }

    /* renamed from: c */
    public void mo180851c(C107275e eVar) {
        if (eVar != null && eVar.f320943f != null && eVar.f320944g) {
            eVar.mo157747a();
            synchronized (this.f350285b) {
                this.f350284a.add(0, eVar);
            }
        }
    }
}
