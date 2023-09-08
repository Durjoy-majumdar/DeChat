package pm1;

import cm1.C0797z;
import gy3.C87412m;

/* renamed from: pm1.a */
public final class C62378a extends C62379b {

    /* renamed from: b */
    public final String f177277b;

    /* renamed from: c */
    public final C0797z f177278c;

    /* renamed from: d */
    public final boolean f177279d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62378a(String str, C0797z zVar, boolean z) {
        super(str);
        C87412m.m108594g(str, "liveUrl");
        C87412m.m108594g(zVar, "feed");
        this.f177277b = str;
        this.f177278c = zVar;
        this.f177279d = z;
    }

    public String toString() {
        return "feed:" + this.f177278c + " liveUrl:" + this.f177277b + " isLeftPos:" + this.f177279d;
    }
}
