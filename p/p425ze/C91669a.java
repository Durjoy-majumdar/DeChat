package p425ze;

/* renamed from: ze.a */
public final class C91669a extends C91670b {

    /* renamed from: d */
    public final boolean f262647d;

    /* renamed from: e */
    public final C39344h f262648e;

    /* renamed from: f */
    public final Throwable f262649f;

    /* renamed from: g */
    public final long f262650g;

    public C91669a(boolean z, boolean z2, String str, C39344h hVar, Throwable th, long j) {
        this.f262647d = z;
        this.f262648e = hVar;
        this.f262649f = th;
        this.f262650g = j;
    }

    /* renamed from: a */
    public static C91669a m115208a(Throwable th, long j) {
        return new C91669a(false, false, (String) null, (C39344h) null, th, j);
    }

    /* renamed from: b */
    public static C91669a m115209b(long j) {
        return new C91669a(false, false, (String) null, (C39344h) null, (Throwable) null, j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Leak Reference:");
        C39344h hVar = this.f262648e;
        if (hVar != null) {
            for (C91672j a : hVar.f105755d) {
                sb.append(a.mo125549a(true));
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
