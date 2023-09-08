package f14;

import java.util.ArrayList;

/* renamed from: f14.j */
public final class C31874j<E> {
    /* renamed from: a */
    public static final Object m39570a(Object obj, E e) {
        if (obj == null) {
            return e;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return arrayList;
    }
}
