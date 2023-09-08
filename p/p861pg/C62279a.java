package p861pg;

import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;
import java.util.List;
import p434ig.C98672d;
import zb2.C66777a;

/* renamed from: pg.a */
public class C62279a extends C66777a<C62279a> {

    /* renamed from: d */
    public final String f177042d;

    /* renamed from: e */
    public int f177043e;

    /* renamed from: f */
    public final C98672d f177044f;

    /* renamed from: g */
    public final C72963f4 f177045g;

    /* renamed from: h */
    public final int f177046h;

    /* renamed from: i */
    public final List<C98672d> f177047i;

    public C62279a(String str, int i, C98672d dVar, C72963f4 f4Var, int i2, List<? extends C98672d> list) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(dVar, "albumDataItem");
        this.f177042d = str;
        this.f177043e = i;
        this.f177044f = dVar;
        this.f177045g = f4Var;
        this.f177046h = i2;
        this.f177047i = list;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return String.valueOf(this.f177044f.hashCode());
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f177044f.mo55274P();
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C87412m.m108594g((C62279a) obj, "other");
        int i = this.f177043e;
        return C87412m.m108596i(i, i);
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C62279a aVar = (C62279a) obj;
        C87412m.m108594g(aVar, "other");
        if (C87412m.m108589b(this.f177042d, aVar.f177042d)) {
            C98672d dVar = this.f177044f;
            if (dVar.mo141100e().mo53860f(dVar, aVar.f177044f)) {
                return true;
            }
        }
        return false;
    }
}
