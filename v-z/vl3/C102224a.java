package vl3;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;

/* renamed from: vl3.a */
public final class C102224a {

    /* renamed from: a */
    public final CharSequence f301006a;

    /* renamed from: b */
    public final int f301007b;

    /* renamed from: c */
    public final int f301008c;

    /* renamed from: d */
    public final int f301009d;

    /* renamed from: e */
    public final int f301010e;

    /* renamed from: f */
    public final boolean f301011f;

    /* renamed from: g */
    public final boolean f301012g;

    public C102224a(CharSequence charSequence, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C87412m.m108594g(charSequence, FirebaseAnalytics.C113379b.SOURCE);
        this.f301006a = charSequence;
        this.f301007b = i;
        this.f301008c = i2;
        this.f301009d = i3;
        this.f301010e = i4;
        this.f301011f = z;
        this.f301012g = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C102224a)) {
            return false;
        }
        C102224a aVar = (C102224a) obj;
        return C87412m.m108589b(this.f301006a, aVar.f301006a) && this.f301007b == aVar.f301007b && this.f301008c == aVar.f301008c && this.f301009d == aVar.f301009d && this.f301010e == aVar.f301010e && this.f301011f == aVar.f301011f && this.f301012g == aVar.f301012g;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f301006a.hashCode() * 31) + this.f301007b) * 31) + this.f301008c) * 31) + this.f301009d) * 31) + this.f301010e) * 31;
        boolean z = this.f301011f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f301012g;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "EmojiProcessRequest(source=" + this.f301006a + ", start=" + this.f301007b + ", end=" + this.f301008c + ", processEmojiType=" + this.f301009d + ", maxSysNum=" + this.f301010e + ", needGetResultSpan=" + this.f301011f + ", needClearExistEmojiSpan=" + this.f301012g + ')';
    }
}
