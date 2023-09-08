package ju0;

import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a;
import gy3.C87412m;

/* renamed from: ju0.n */
public final class C33693n {

    /* renamed from: a */
    public final C17643a.C17646d f91145a;

    /* renamed from: b */
    public final String f91146b;

    public C33693n(C17643a.C17646d dVar, String str) {
        C87412m.m108594g(dVar, "type");
        C87412m.m108594g(str, "path");
        this.f91145a = dVar;
        this.f91146b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33693n)) {
            return false;
        }
        C33693n nVar = (C33693n) obj;
        return this.f91145a == nVar.f91145a && C87412m.m108589b(this.f91146b, nVar.f91146b);
    }

    public int hashCode() {
        return (this.f91145a.hashCode() * 31) + this.f91146b.hashCode();
    }

    public String toString() {
        return "StickerApplyParams(type=" + this.f91145a + ", path=" + this.f91146b + ')';
    }
}
