package p953d8;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.io.File;
import java.util.TreeSet;
import p333e8.C20528a;
import p953d8.C86199a;

/* renamed from: d8.i */
public final class C86212i {

    /* renamed from: a */
    public final int f250760a;

    /* renamed from: b */
    public final String f250761b;

    /* renamed from: c */
    public final TreeSet<C86217m> f250762c = new TreeSet<>();

    /* renamed from: d */
    public long f250763d;

    public C86212i(int i, String str, long j) {
        this.f250760a = i;
        this.f250761b = str;
        this.f250763d = j;
    }

    /* renamed from: a */
    public long mo120635a(long j, long j2) {
        C86217m b = mo120636b(j);
        boolean z = true;
        if (!b.f250756g) {
            long j3 = b.f250755f;
            if (j3 != -1) {
                z = false;
            }
            if (z) {
                j3 = MAlarmHandler.NEXT_FIRE_INTERVAL;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long j5 = b.f250754e + b.f250755f;
        if (j5 < j4) {
            for (C86217m next : this.f250762c.tailSet(b, false)) {
                long j6 = next.f250754e;
                if (j6 <= j5) {
                    j5 = Math.max(j5, j6 + next.f250755f);
                    if (j5 >= j4) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Math.min(j5 - j, j2);
    }

    /* renamed from: b */
    public C86217m mo120636b(long j) {
        C86217m mVar = new C86217m(this.f250761b, j, -1, -9223372036854775807L, (File) null);
        C86217m floor = this.f250762c.floor(mVar);
        if (floor != null && floor.f250754e + floor.f250755f > j) {
            return floor;
        }
        C86217m ceiling = this.f250762c.ceiling(mVar);
        if (ceiling == null) {
            return new C86217m(this.f250761b, j, -1, -9223372036854775807L, (File) null);
        }
        return new C86217m(this.f250761b, j, ceiling.f250754e - j, -9223372036854775807L, (File) null);
    }

    /* renamed from: c */
    public C86217m mo120637c(C86217m mVar) {
        C20528a.m22240d(this.f250762c.remove(mVar));
        int i = this.f250760a;
        C20528a.m22240d(mVar.f250756g);
        long currentTimeMillis = System.currentTimeMillis();
        File c = C86217m.m106814c(mVar.f250757h.getParentFile(), i, mVar.f250754e, currentTimeMillis);
        C86217m mVar2 = new C86217m(mVar.f250753d, mVar.f250754e, mVar.f250755f, currentTimeMillis, c);
        if (mVar.f250757h.renameTo(c)) {
            this.f250762c.add(mVar2);
            return mVar2;
        }
        throw new C86199a.C86200a("Renaming of " + mVar.f250757h + " to " + c + " failed.");
    }
}
