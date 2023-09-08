package g70;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import z04.C66713a;

/* renamed from: g70.f */
public final class C87162f {

    /* renamed from: a */
    public final String f252780a;

    /* renamed from: b */
    public final String f252781b;

    public C87162f(String str) {
        C87412m.m108594g(str, "appId");
        this.f252780a = str;
        long hashCode = ((long) hashCode()) & Util.MAX_32BIT_VALUE;
        C66713a.m78712a(16);
        String l = Long.toString(hashCode, 16);
        C87412m.m108593f(l, "toString(this, checkRadix(radix))");
        this.f252781b = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C87162f) && C87412m.m108589b(this.f252780a, ((C87162f) obj).f252780a);
    }

    public int hashCode() {
        return this.f252780a.hashCode();
    }

    public String toString() {
        return "MagicSclAppContext(appId=" + this.f252780a + ')';
    }
}
