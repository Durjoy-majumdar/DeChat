package di3;

import ei3.C31607a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p261wl.C38174i;

/* renamed from: di3.h */
public abstract class C31195h {

    /* renamed from: a */
    public final Map<Class<? extends C7335d>, C86301e> f83602a = new ConcurrentHashMap(64);

    /* renamed from: b */
    public final Object[] f83603b = {null};

    /* renamed from: c */
    public final Object[] f83604c = {null};

    /* renamed from: a */
    public abstract List<C38174i<C86301e>> mo56271a(C31607a aVar);

    /* renamed from: b */
    public abstract <T extends C7335d> T mo56272b(Class<T> cls);

    /* renamed from: c */
    public final List<C38174i<C86301e>> mo58018c(C31607a aVar) {
        Object[] objArr;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            objArr = this.f83603b;
        } else if (ordinal == 1) {
            objArr = this.f83604c;
        } else {
            throw new IllegalArgumentException("Unknown mode: " + aVar);
        }
        if (objArr[0] == null) {
            synchronized (objArr) {
                Object obj = objArr[0];
                if (obj == null && obj == null) {
                    objArr[0] = Collections.unmodifiableList(mo56271a(aVar));
                }
            }
        }
        return (List) objArr[0];
    }

    /* renamed from: d */
    public final <T extends C7335d> T mo58019d(Class<T> cls) {
        T t = (C7335d) ((ConcurrentHashMap) this.f83602a).get(cls);
        if (t != null) {
            return t;
        }
        T b = mo56272b(cls);
        if (b != null) {
            ((ConcurrentHashMap) this.f83602a).put(cls, (C86301e) b);
        }
        return b;
    }
}
