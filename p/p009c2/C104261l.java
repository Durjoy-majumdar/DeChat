package p009c2;

import gy3.C8480h;

/* renamed from: c2.l */
public final class C104261l {

    /* renamed from: f */
    public static final C104261l f308593f = new C104261l(false, 0, true, 1, 1, (C8480h) null);

    /* renamed from: a */
    public final boolean f308594a;

    /* renamed from: b */
    public final int f308595b;

    /* renamed from: c */
    public final boolean f308596c;

    /* renamed from: d */
    public final int f308597d;

    /* renamed from: e */
    public final int f308598e;

    public C104261l(boolean z, int i, boolean z2, int i2, int i3, C8480h hVar) {
        this.f308594a = z;
        this.f308595b = i;
        this.f308596c = z2;
        this.f308597d = i2;
        this.f308598e = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104261l)) {
            return false;
        }
        C104261l lVar = (C104261l) obj;
        if (this.f308594a != lVar.f308594a) {
            return false;
        }
        if (!(this.f308595b == lVar.f308595b) || this.f308596c != lVar.f308596c) {
            return false;
        }
        if (!(this.f308597d == lVar.f308597d)) {
            return false;
        }
        return this.f308598e == lVar.f308598e;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = (((this.f308594a ? 1231 : 1237) * 31) + this.f308595b) * 31;
        if (!this.f308596c) {
            i = 1237;
        }
        return ((((i2 + i) * 31) + this.f308597d) * 31) + this.f308598e;
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f308594a + ", capitalization=" + C104267q.m139164a(this.f308595b) + ", autoCorrect=" + this.f308596c + ", keyboardType=" + C104268r.m139165a(this.f308597d) + ", imeAction=" + C104260k.m139149a(this.f308598e) + ')';
    }
}
