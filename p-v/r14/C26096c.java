package r14;

import gy3.C8480h;
import gy3.C87412m;
import s14.C26160b;
import s14.C26161c;

/* renamed from: r14.c */
public final class C26096c {

    /* renamed from: a */
    public final boolean f72937a;

    /* renamed from: b */
    public final boolean f72938b;

    /* renamed from: c */
    public final boolean f72939c;

    /* renamed from: d */
    public final boolean f72940d;

    /* renamed from: e */
    public final boolean f72941e;

    /* renamed from: f */
    public final String f72942f;

    /* renamed from: g */
    public final boolean f72943g;

    /* renamed from: h */
    public final boolean f72944h;

    /* renamed from: i */
    public final String f72945i;

    /* renamed from: j */
    public final boolean f72946j;

    /* renamed from: k */
    public final C26160b f72947k;

    public C26096c() {
        this(false, false, false, false, false, (String) null, false, false, (String) null, false, (C26160b) null, 2047, (C8480h) null);
    }

    public C26096c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, boolean z7, String str2, boolean z8, C26160b bVar, int i, C8480h hVar) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        str = (i & 32) != 0 ? "    " : str;
        z6 = (i & 64) != 0 ? false : z6;
        z7 = (i & 128) != 0 ? false : z7;
        str2 = (i & 256) != 0 ? "type" : str2;
        z8 = (i & 512) != 0 ? false : z8;
        bVar = (i & 1024) != 0 ? C26161c.f73098a : bVar;
        C87412m.m108594g(str, "prettyPrintIndent");
        C87412m.m108594g(str2, "classDiscriminator");
        C87412m.m108594g(bVar, "serializersModule");
        this.f72937a = z;
        this.f72938b = z2;
        this.f72939c = z3;
        this.f72940d = z4;
        this.f72941e = z5;
        this.f72942f = str;
        this.f72943g = z6;
        this.f72944h = z7;
        this.f72945i = str2;
        this.f72946j = z8;
        this.f72947k = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26096c)) {
            return false;
        }
        C26096c cVar = (C26096c) obj;
        return this.f72937a == cVar.f72937a && this.f72938b == cVar.f72938b && this.f72939c == cVar.f72939c && this.f72940d == cVar.f72940d && this.f72941e == cVar.f72941e && C87412m.m108589b(this.f72942f, cVar.f72942f) && this.f72943g == cVar.f72943g && this.f72944h == cVar.f72944h && C87412m.m108589b(this.f72945i, cVar.f72945i) && this.f72946j == cVar.f72946j && C87412m.m108589b(this.f72947k, cVar.f72947k);
    }

    public int hashCode() {
        boolean z = this.f72937a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f72938b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f72939c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f72940d;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f72941e;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        String str = this.f72942f;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z7 = this.f72943g;
        if (z7) {
            z7 = true;
        }
        int i7 = (hashCode + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.f72944h;
        if (z8) {
            z8 = true;
        }
        int i8 = (i7 + (z8 ? 1 : 0)) * 31;
        String str2 = this.f72945i;
        int hashCode2 = (i8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z9 = this.f72946j;
        if (!z9) {
            z2 = z9;
        }
        int i9 = (hashCode2 + (z2 ? 1 : 0)) * 31;
        C26160b bVar = this.f72947k;
        if (bVar != null) {
            i6 = bVar.hashCode();
        }
        return i9 + i6;
    }

    public String toString() {
        return "JsonConf(encodeDefaults=" + this.f72937a + ", ignoreUnknownKeys=" + this.f72938b + ", isLenient=" + this.f72939c + ", allowStructuredMapKeys=" + this.f72940d + ", prettyPrint=" + this.f72941e + ", prettyPrintIndent=" + this.f72942f + ", coerceInputValues=" + this.f72943g + ", useArrayPolymorphism=" + this.f72944h + ", classDiscriminator=" + this.f72945i + ", allowSpecialFloatingPointValues=" + this.f72946j + ", serializersModule=" + this.f72947k + ")";
    }
}
