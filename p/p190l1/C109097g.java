package p190l1;

import gy3.C87412m;
import java.util.List;
import java.util.Map;

/* renamed from: l1.g */
public final class C109097g {

    /* renamed from: a */
    public final Map<C109110r, C109111s> f326682a;

    /* renamed from: b */
    public final C109114u f326683b;

    /* renamed from: c */
    public boolean f326684c;

    public C109097g(Map<C109110r, C109111s> map, C109114u uVar) {
        C87412m.m108594g(map, "changes");
        C87412m.m108594g(uVar, "pointerInputEvent");
        this.f326682a = map;
        this.f326683b = uVar;
    }

    /* renamed from: a */
    public final boolean mo160341a(long j) {
        C109115v vVar;
        List<C109115v> list = this.f326683b.f326732a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                vVar = null;
                break;
            }
            vVar = list.get(i);
            if (C109110r.m148153a(vVar.f326734a, j)) {
                break;
            }
            i++;
        }
        C109115v vVar2 = vVar;
        if (vVar2 != null) {
            return vVar2.f326740g;
        }
        return false;
    }
}
