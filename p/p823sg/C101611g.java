package p823sg;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: sg.g */
public interface C101611g<K, O> {

    /* renamed from: sg.g$a */
    public interface C48378a<K, O> {
    }

    /* renamed from: sg.g$b */
    public interface C101612b<K, O> {
        void preRemoveCallback(K k, O o, O o2);
    }

    /* renamed from: sg.g$c */
    public interface C101613c<K, O> {
        /* renamed from: a */
        int mo139576a(K k, O o);
    }

    /* renamed from: a */
    void mo122812a(C48378a<K, O> aVar);

    /* renamed from: b */
    O mo139556b(K k);

    /* renamed from: c */
    void mo139557c(K k, O o);

    boolean check(K k);

    boolean checkAndUpTime(K k);

    void clear();

    int createCount();

    int evictionCount();

    O get(K k);

    int hitCount();

    Set<K> keySet();

    int maxSize();

    int missCount();

    O put(K k, O o);

    int putCount();

    O remove(K k);

    int size();

    int sizeOf(K k, O o);

    Map<K, O> snapshot();

    void trimToSize(int i);

    Collection<O> values();
}
