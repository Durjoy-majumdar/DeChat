package ey0;

import gy3.C87412m;
import te3.C50265li;
import zb2.C66777a;

/* renamed from: ey0.a */
public final class C7948a extends C66777a<C7948a> {

    /* renamed from: d */
    public final C50265li f26634d;

    /* renamed from: e */
    public final boolean f26635e;

    /* renamed from: f */
    public final boolean f26636f;

    public C7948a(C50265li liVar, boolean z, boolean z2) {
        C87412m.m108594g(liVar, "authorizeItem");
        this.f26634d = liVar;
        this.f26635e = z;
        this.f26636f = z2;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        String str = this.f26634d.f137427g;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f26635e ? 1 : 0;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C87412m.m108594g((C7948a) obj, "other");
        return 0;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C7948a aVar = (C7948a) obj;
        C87412m.m108594g(aVar, "other");
        if (this.f26635e) {
            return false;
        }
        C50265li liVar = this.f26634d;
        int i = liVar.f137426f;
        C50265li liVar2 = aVar.f26634d;
        return (i == liVar2.f137426f) && liVar.f137425e.equals(liVar2.f137425e);
    }
}
