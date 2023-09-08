package p370p7;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;

/* renamed from: p7.i */
public final class C21932i implements C21958s {

    /* renamed from: d */
    public final C21958s[] f62049d;

    public C21932i(C21958s[] sVarArr) {
        this.f62049d = sVarArr;
    }

    /* renamed from: a */
    public final long mo34983a() {
        long j = Long.MAX_VALUE;
        for (C21958s a : this.f62049d) {
            long a2 = a.mo34983a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == MAlarmHandler.NEXT_FIRE_INTERVAL) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: b */
    public final boolean mo34984b(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long c = mo34985c();
            if (c == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (C21958s sVar : this.f62049d) {
                if (sVar.mo34985c() == c) {
                    z |= sVar.mo34984b(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    /* renamed from: c */
    public final long mo34985c() {
        long j = Long.MAX_VALUE;
        for (C21958s c : this.f62049d) {
            long c2 = c.mo34985c();
            if (c2 != Long.MIN_VALUE) {
                j = Math.min(j, c2);
            }
        }
        if (j == MAlarmHandler.NEXT_FIRE_INTERVAL) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
