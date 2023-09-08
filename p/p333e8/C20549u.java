package p333e8;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.tav.coremedia.TimeUtil;

/* renamed from: e8.u */
public final class C20549u {

    /* renamed from: a */
    public long f57832a;

    /* renamed from: b */
    public long f57833b;

    /* renamed from: c */
    public volatile long f57834c = -9223372036854775807L;

    public C20549u(long j) {
        synchronized (this) {
            C20528a.m22240d(this.f57834c == -9223372036854775807L);
            this.f57832a = j;
        }
    }

    /* renamed from: a */
    public long mo32130a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f57834c != -9223372036854775807L) {
            this.f57834c = j;
        } else {
            long j2 = this.f57832a;
            if (j2 != MAlarmHandler.NEXT_FIRE_INTERVAL) {
                this.f57833b = j2 - j;
            }
            synchronized (this) {
                this.f57834c = j;
                notifyAll();
            }
        }
        return j + this.f57833b;
    }

    /* renamed from: b */
    public long mo32131b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f57834c != -9223372036854775807L) {
            long j2 = (this.f57834c * 90000) / TimeUtil.SECOND_TO_US;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return mo32130a((j * TimeUtil.SECOND_TO_US) / 90000);
    }

    /* renamed from: c */
    public long mo32132c() {
        if (this.f57832a == MAlarmHandler.NEXT_FIRE_INTERVAL) {
            return 0;
        }
        if (this.f57834c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f57833b;
    }
}
