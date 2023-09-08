package sx3;

import hy3.C60233d;
import java.util.AbstractList;

/* renamed from: sx3.f */
public abstract class C64185f<E> extends AbstractList<E> implements C60233d {
    /* renamed from: f */
    public abstract int mo53207f();

    /* renamed from: i */
    public abstract E mo53210i(int i);

    public final /* bridge */ E remove(int i) {
        return mo53210i(i);
    }

    public final /* bridge */ int size() {
        return mo53207f();
    }
}
