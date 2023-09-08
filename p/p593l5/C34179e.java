package p593l5;

import android.net.Uri;
import gy3.C87412m;

/* renamed from: l5.e */
public final class C34179e implements C109269b<String, Uri> {
    /* renamed from: a */
    public boolean mo59477a(Object obj) {
        C87412m.m108594g((String) obj, "data");
        return true;
    }

    /* renamed from: f */
    public Object mo59478f(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "data");
        Uri parse = Uri.parse(str);
        C87412m.m108593f(parse, "parse(this)");
        return parse;
    }
}
