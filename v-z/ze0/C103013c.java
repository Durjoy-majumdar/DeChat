package ze0;

import gy3.C87412m;

/* renamed from: ze0.c */
public abstract class C103013c {

    /* renamed from: a */
    public final String f303963a;

    /* renamed from: b */
    public final String f303964b;

    /* renamed from: c */
    public final boolean f303965c;

    public C103013c(String str, String str2, boolean z) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "path");
        this.f303963a = str;
        this.f303964b = str2;
        this.f303965c = z;
    }

    public String toString() {
        return "url:" + this.f303963a + ", path:" + this.f303964b + ", delOnLoadFail:" + this.f303965c;
    }
}
