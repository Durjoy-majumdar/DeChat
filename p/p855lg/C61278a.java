package p855lg;

import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;
import mh0.C99862a;
import p434ig.C98672d;
import p434ig.C98674g;
import zb2.C66777a;

/* renamed from: lg.a */
public final class C61278a extends C66777a<C61278a> {

    /* renamed from: d */
    public final String f174385d;

    /* renamed from: e */
    public int f174386e;

    /* renamed from: f */
    public final C99862a f174387f;

    /* renamed from: g */
    public final C98674g f174388g;

    /* renamed from: h */
    public final C98672d f174389h;

    /* renamed from: i */
    public final C72963f4 f174390i;

    public C61278a(String str, int i, C99862a aVar, C98674g gVar, C98672d dVar, C72963f4 f4Var) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(gVar, "albumInfoItem");
        C87412m.m108594g(dVar, "albumDataItem");
        this.f174385d = str;
        this.f174386e = i;
        this.f174387f = aVar;
        this.f174388g = gVar;
        this.f174389h = dVar;
        this.f174390i = f4Var;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return String.valueOf(this.f174389h.hashCode());
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f174389h.mo55274P();
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C87412m.m108594g((C61278a) obj, "other");
        int i = this.f174386e;
        return C87412m.m108596i(i, i);
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C61278a aVar = (C61278a) obj;
        C87412m.m108594g(aVar, "other");
        if (C87412m.m108589b(this.f174385d, aVar.f174385d)) {
            C98672d dVar = this.f174389h;
            if (dVar.mo141100e().mo53860f(dVar, aVar.f174389h)) {
                return true;
            }
        }
        return false;
    }
}
