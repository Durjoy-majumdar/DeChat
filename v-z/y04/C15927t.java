package y04;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import sx3.C77813z;

/* renamed from: y04.t */
public final class C15927t implements C15925h<Object> {

    /* renamed from: a */
    public final /* synthetic */ C15925h<Object> f42794a;

    /* renamed from: b */
    public final /* synthetic */ Comparator<Object> f42795b;

    public C15927t(C15925h<Object> hVar, Comparator<Object> comparator) {
        this.f42794a = hVar;
        this.f42795b = comparator;
    }

    public Iterator<Object> iterator() {
        List<Object> t = C112354s.m153297t(this.f42794a);
        C77813z.m93909o(t, this.f42795b);
        return t.iterator();
    }
}
