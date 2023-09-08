package rx3;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;

/* renamed from: rx3.t */
public final class C63685t implements Comparable<C63685t> {

    /* renamed from: d */
    public final int f180541d;

    public /* synthetic */ C63685t(int i) {
        this.f180541d = i;
    }

    public int compareTo(Object obj) {
        return C87412m.m108596i(this.f180541d ^ Integer.MIN_VALUE, ((C63685t) obj).f180541d ^ Integer.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C63685t) && this.f180541d == ((C63685t) obj).f180541d;
    }

    public int hashCode() {
        return this.f180541d;
    }

    public String toString() {
        return String.valueOf(((long) this.f180541d) & Util.MAX_32BIT_VALUE);
    }
}
