package k20;

import java.util.ArrayList;
import java.util.List;

/* renamed from: k20.b */
public final class C9557b {

    /* renamed from: a */
    public List<Object> f29778a = new ArrayList();

    /* renamed from: a */
    public Object[] mo10234a() {
        Object[] array = ((ArrayList) this.f29778a).toArray();
        ((ArrayList) this.f29778a).clear();
        return array;
    }

    /* renamed from: b */
    public void mo10235b(int i) {
        mo10236c(Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo10236c(Object obj) {
        ((ArrayList) this.f29778a).add(obj);
    }
}
