package k20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: k20.a */
public final class C9556a {

    /* renamed from: a */
    public List<Object> f29777a = new ArrayList();

    /* renamed from: a */
    public Object mo10231a(int i) {
        return ((ArrayList) this.f29777a).get(i);
    }

    /* renamed from: b */
    public Object[] mo10232b() {
        Collections.reverse(this.f29777a);
        return ((ArrayList) this.f29777a).toArray();
    }

    /* renamed from: c */
    public C9556a mo10233c(Object obj) {
        ((ArrayList) this.f29777a).add(obj);
        return this;
    }
}
