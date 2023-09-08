package re1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import pe1.C35464c;
import sx3.C64197v;

/* renamed from: re1.a */
public final class C36316a extends C35464c<Boolean> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36316a(boolean z, String str, String str2) {
        super(Boolean.valueOf(z), str);
        C87412m.m108594g(str, "_title");
        C87412m.m108594g(str2, "_keyName");
        mo60268b(str2, new ArrayList(C64197v.m75537f(Boolean.FALSE, Boolean.TRUE)), new ArrayList(C64197v.m75537f("false", "true")));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36316a(boolean z, String str, String str2, int i, C8480h hVar) {
        this(z, str, (i & 4) != 0 ? "" : str2);
    }
}
