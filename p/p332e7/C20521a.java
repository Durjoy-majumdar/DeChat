package p332e7;

import com.tencent.tav.coremedia.TimeUtil;
import p332e7.C20522b;
import p333e8.C20551y;

/* renamed from: e7.a */
public final class C20521a implements C20522b.C20523a {

    /* renamed from: a */
    public final long f57738a;

    /* renamed from: b */
    public final int f57739b;

    /* renamed from: c */
    public final long f57740c;

    public C20521a(long j, int i, long j2) {
        this.f57738a = j;
        this.f57739b = i;
        this.f57740c = j2 == -1 ? -9223372036854775807L : mo32076d(j2);
    }

    /* renamed from: d */
    public long mo32076d(long j) {
        return ((Math.max(0, j - this.f57738a) * TimeUtil.SECOND_TO_US) * 8) / ((long) this.f57739b);
    }

    /* renamed from: f */
    public boolean mo17730f() {
        return this.f57740c != -9223372036854775807L;
    }

    /* renamed from: g */
    public long mo17731g(long j) {
        long j2 = this.f57740c;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        int i = C20551y.f57835a;
        return this.f57738a + ((Math.max(0, Math.min(j, j2)) * ((long) this.f57739b)) / 8000000);
    }

    /* renamed from: h */
    public long mo17732h() {
        return this.f57740c;
    }
}
