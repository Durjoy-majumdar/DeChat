package l34;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import q34.C118165m;

/* renamed from: l34.j */
public abstract class C117458j<T> implements C88379f<T>, C117459k {

    /* renamed from: d */
    public final C118165m f351524d;

    /* renamed from: e */
    public final C117458j<?> f351525e;

    /* renamed from: f */
    public C117454g f351526f;

    /* renamed from: g */
    public long f351527g;

    public C117458j() {
        this((C117458j<?>) null, false);
    }

    /* renamed from: c */
    public final boolean mo182164c() {
        return this.f351524d.f353197e;
    }

    /* renamed from: d */
    public final void mo182165d() {
        this.f351524d.mo182165d();
    }

    /* renamed from: e */
    public final void mo182166e(C117459k kVar) {
        this.f351524d.mo182955a(kVar);
    }

    /* renamed from: f */
    public void mo182167f() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo182168g(long r8) {
        /*
            r7 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x002f
            monitor-enter(r7)
            l34.g r2 = r7.f351526f     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x0010
            monitor-exit(r7)     // Catch:{ all -> 0x002c }
            r2.mo123768h(r8)
            return
        L_0x0010:
            long r2 = r7.f351527g     // Catch:{ all -> 0x002c }
            r4 = -9223372036854775808
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x001b
            r7.f351527g = r8     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x001b:
            long r2 = r2 + r8
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0028
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7.f351527g = r8     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x0028:
            r7.f351527g = r2     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r7)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x002c }
            throw r8
        L_0x002f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "number requested cannot be negative: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l34.C117458j.mo182168g(long):void");
    }

    /* renamed from: h */
    public void mo182169h(C117454g gVar) {
        long j;
        C117458j<?> jVar;
        boolean z;
        synchronized (this) {
            j = this.f351527g;
            this.f351526f = gVar;
            jVar = this.f351525e;
            z = jVar != null && j == Long.MIN_VALUE;
        }
        if (z) {
            jVar.mo182169h(gVar);
        } else if (j == Long.MIN_VALUE) {
            gVar.mo123768h(MAlarmHandler.NEXT_FIRE_INTERVAL);
        } else {
            gVar.mo123768h(j);
        }
    }

    public C117458j(C117458j<?> jVar, boolean z) {
        this.f351527g = Long.MIN_VALUE;
        this.f351525e = jVar;
        this.f351524d = (!z || jVar == null) ? new C118165m() : jVar.f351524d;
    }
}
