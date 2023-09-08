package ln3;

import b60.C54426a;
import gy3.C87412m;
import java.util.Map;
import rx3.C13604l;
import sx3.C90363p0;

/* renamed from: ln3.f */
public final class C61317f extends C76709a<C61317f> {

    /* renamed from: u */
    public final C54426a f174435u;

    public C61317f(C54426a aVar) {
        C87412m.m108594g(aVar, "data");
        this.f174435u = aVar;
        this.f224436e = 2;
    }

    /* renamed from: a */
    public Map<String, Object> mo86283a() {
        return C90363p0.m113143b(new C13604l("group_live_id", Long.valueOf(this.f174435u.mo55880H())));
    }

    /* renamed from: c */
    public int mo75c() {
        return C76709a.f224430p;
    }

    /* renamed from: d */
    public int mo86281d() {
        return 5;
    }

    /* renamed from: g */
    public int mo86282g(Object obj) {
        C61317f fVar = (C61317f) obj;
        C87412m.m108594g(fVar, "other");
        return (int) (this.f174435u.getTimestamp() - fVar.f174435u.getTimestamp());
    }

    public long getItemId() {
        return this.f174435u.mo55880H();
    }
}
