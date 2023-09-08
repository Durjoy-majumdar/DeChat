package rb0;

import android.os.SystemClock;
import gy3.C87412m;
import java.util.HashSet;

/* renamed from: rb0.h0 */
public class C47970h0 {

    /* renamed from: a */
    public int f128673a;

    /* renamed from: b */
    public final Long[] f128674b;

    /* renamed from: c */
    public final HashSet<String>[] f128675c;

    public C47970h0(int i) {
        this.f128673a = i;
        Long[] lArr = new Long[3];
        for (int i2 = 0; i2 < 3; i2++) {
            lArr[i2] = 0L;
        }
        this.f128674b = lArr;
        HashSet<String>[] hashSetArr = new HashSet[3];
        for (int i3 = 0; i3 < 3; i3++) {
            hashSetArr[i3] = new HashSet<>();
        }
        this.f128675c = hashSetArr;
    }

    /* renamed from: a */
    public final void mo72741a(String str) {
        C87412m.m108594g(str, "key");
        long abs = Math.abs(SystemClock.elapsedRealtime() / ((long) this.f128673a));
        int i = (int) (abs % ((long) 3));
        if (this.f128674b[i].longValue() != abs) {
            this.f128675c[i].clear();
            this.f128674b[i] = Long.valueOf(abs);
        }
        this.f128675c[i].add(str);
    }

    /* renamed from: b */
    public final boolean mo72742b(String str) {
        HashSet<String> hashSet;
        C87412m.m108594g(str, "key");
        long abs = Math.abs(SystemClock.elapsedRealtime() / ((long) this.f128673a));
        int i = (int) (abs % ((long) 3));
        if (abs == this.f128674b[i].longValue()) {
            hashSet = this.f128675c[i];
        } else {
            int abs2 = Math.abs(i - 1) % 3;
            hashSet = abs == this.f128674b[abs2].longValue() ? this.f128675c[abs2] : null;
        }
        if (hashSet != null) {
            return hashSet.contains(str);
        }
        return false;
    }
}
