package q61;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: q61.d */
public final class C101047d {

    /* renamed from: a */
    public long f295837a;

    /* renamed from: b */
    public String f295838b;

    /* renamed from: c */
    public final StringBuilder f295839c;

    /* renamed from: d */
    public final StringBuilder f295840d;

    public C101047d() {
        this(0, (String) null, 0, 0, (StringBuilder) null, (StringBuilder) null, 63, (C8480h) null);
    }

    public C101047d(long j, String str, int i, int i2, StringBuilder sb, StringBuilder sb4, int i3, C8480h hVar) {
        j = (i3 & 1) != 0 ? 0 : j;
        str = (i3 & 2) != 0 ? "" : str;
        sb = (i3 & 16) != 0 ? new StringBuilder() : sb;
        sb4 = (i3 & 32) != 0 ? new StringBuilder() : sb4;
        C87412m.m108594g(str, "setName");
        C87412m.m108594g(sb, "md5String");
        C87412m.m108594g(sb4, "indexString");
        this.f295837a = j;
        this.f295838b = str;
        this.f295839c = sb;
        this.f295840d = sb4;
    }
}
