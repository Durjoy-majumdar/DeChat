package c13;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: c13.v */
public class C16845v implements C16843l {

    /* renamed from: j */
    public static final int f45500j = Process.myUid();

    /* renamed from: a */
    public C79913b f45501a;

    /* renamed from: b */
    public boolean f45502b = false;

    /* renamed from: c */
    public boolean f45503c;

    /* renamed from: d */
    public long f45504d;

    /* renamed from: e */
    public long f45505e;

    /* renamed from: f */
    public long f45506f;

    /* renamed from: g */
    public long f45507g;

    /* renamed from: h */
    public long f45508h;

    /* renamed from: i */
    public long f45509i;

    public C16845v() {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 23) {
            this.f45502b = true;
            this.f45501a = new C39889g();
        } else if (i >= 28) {
            this.f45502b = true;
            this.f45501a = new C79916o();
        }
        try {
            int i2 = f45500j;
            this.f45504d = TrafficStats.getUidRxBytes(i2);
            this.f45505e = TrafficStats.getUidTxBytes(i2);
            long mobileRxBytes = TrafficStats.getMobileRxBytes();
            long mobileTxBytes = TrafficStats.getMobileTxBytes();
            this.f45506f = TrafficStats.getTotalRxBytes() - mobileRxBytes;
            this.f45507g = TrafficStats.getTotalTxBytes() - mobileTxBytes;
            if (this.f45504d == -1 || this.f45505e == -1) {
                z = false;
            }
            this.f45503c = z;
        } catch (NullPointerException e) {
            Log.m105924i("TrafficStatsWrapper", e.toString());
            this.f45503c = false;
        }
    }

    /* renamed from: k */
    public boolean mo17893k() {
        long j;
        if (this.f45502b) {
            return this.f45501a.mo17893k();
        }
        if (!this.f45503c) {
            return false;
        }
        int i = f45500j;
        long uidRxBytes = TrafficStats.getUidRxBytes(i);
        long uidTxBytes = TrafficStats.getUidTxBytes(i);
        long mobileRxBytes = TrafficStats.getMobileRxBytes();
        long mobileTxBytes = TrafficStats.getMobileTxBytes();
        long totalRxBytes = TrafficStats.getTotalRxBytes() - mobileRxBytes;
        long totalTxBytes = TrafficStats.getTotalTxBytes() - mobileTxBytes;
        long j2 = this.f45504d;
        if (uidRxBytes >= j2) {
            long j3 = this.f45505e;
            if (uidTxBytes >= j3) {
                long j4 = uidRxBytes;
                long j5 = this.f45506f;
                if (totalRxBytes >= j5) {
                    long j6 = j5;
                    long j7 = this.f45507g;
                    if (totalTxBytes >= j7) {
                        this.f45508h = (j4 - j2) - (totalRxBytes - j6);
                        this.f45509i = (uidTxBytes - j3) - (totalTxBytes - j7);
                        this.f45504d = j4;
                        this.f45505e = uidTxBytes;
                        this.f45506f = totalRxBytes;
                        this.f45507g = totalTxBytes;
                        return true;
                    }
                }
                j = j4;
                this.f45504d = j;
                this.f45505e = uidTxBytes;
                this.f45506f = totalRxBytes;
                this.f45507g = totalTxBytes;
                return false;
            }
        }
        j = uidRxBytes;
        this.f45504d = j;
        this.f45505e = uidTxBytes;
        this.f45506f = totalRxBytes;
        this.f45507g = totalTxBytes;
        return false;
    }

    /* renamed from: l */
    public long mo17894l(long j) {
        return this.f45502b ? this.f45501a.mo17894l(j) : Math.max(j, this.f45508h);
    }

    /* renamed from: m */
    public long mo17895m(long j) {
        if (this.f45502b) {
            return this.f45501a.mo17895m(j);
        }
        return -1;
    }

    /* renamed from: n */
    public long mo17896n(long j) {
        if (this.f45502b) {
            return this.f45501a.mo17896n(j);
        }
        return -1;
    }

    /* renamed from: o */
    public long mo17897o(long j) {
        return this.f45502b ? this.f45501a.mo17897o(j) : Math.max(j, this.f45509i);
    }
}
