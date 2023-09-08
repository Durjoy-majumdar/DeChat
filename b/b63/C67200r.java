package b63;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/* renamed from: b63.r */
public abstract class C67200r<K> {

    /* renamed from: a */
    public Map<String, Integer> f192930a = new HashMap();

    /* renamed from: b */
    public List<K> f192931b = new LinkedList();

    /* renamed from: c */
    public Vector<C67200r<K>.b> f192932c = new Vector<>();

    /* renamed from: d */
    public List<String> f192933d = new LinkedList();

    /* renamed from: b63.r$a */
    public enum C67201a {
        DISABLED,
        CHECKED,
        UNCHECKED
    }

    /* renamed from: b63.r$b */
    public class C67202b {

        /* renamed from: a */
        public K f192938a;

        /* renamed from: b */
        public C67201a f192939b;

        public C67202b(C67200r rVar) {
        }
    }

    /* renamed from: a */
    public abstract String mo91309a(Vector<C67200r<K>.b> vector, int i);

    /* renamed from: b */
    public void mo91310b(int i, C67201a aVar) {
        this.f192932c.get(i).f192939b = aVar;
    }
}
