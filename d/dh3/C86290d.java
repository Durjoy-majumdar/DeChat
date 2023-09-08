package dh3;

import android.os.SystemClock;

/* renamed from: dh3.d */
public final class C86290d implements C116617e {

    /* renamed from: a */
    public final long f250907a;

    /* renamed from: b */
    public long f250908b;

    public C86290d(long j) {
        this.f250907a = j;
    }

    /* renamed from: a */
    public boolean mo8501a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        Long valueOf = Long.valueOf(this.f250908b);
        boolean z = false;
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            if (uptimeMillis - valueOf.longValue() > this.f250907a) {
                z = true;
            }
            if (z) {
                this.f250908b = uptimeMillis;
            }
            return z;
        }
        this.f250908b = uptimeMillis;
        return true;
    }
}
