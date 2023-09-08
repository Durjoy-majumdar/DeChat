package p398x9;

import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import p398x9.C23035c;

/* renamed from: x9.a */
public abstract class C23034a extends C23035c {
    public C23034a(Map<Object, Collection<Object>> map) {
        super(map);
    }

    /* renamed from: a */
    public Map<Object, Collection<Object>> mo36350a() {
        Map<K, Collection<V>> map = this.f66266f;
        if (map == null) {
            map = this.f66232g instanceof SortedMap ? new C23035c.C23042e((SortedMap) this.f66232g) : new C23035c.C23036a(this.f66232g);
            this.f66266f = map;
        }
        return map;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
