package p291aa;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: aa.c */
public abstract class C23619c<V> extends C23629h implements Iterator<V> {

    /* renamed from: g */
    public C23632k f67803g;

    public C23619c(C23632k kVar) {
        super(kVar);
        this.f67803g = kVar;
    }

    /* renamed from: a */
    public abstract V mo37135a(int i);

    public V next() {
        int nextIndex = nextIndex();
        this.f67815f = nextIndex;
        if (nextIndex >= 0) {
            return mo37135a(nextIndex);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        int i;
        Object obj;
        int i2 = this.f67814e;
        C23632k kVar = this.f67803g;
        if (i2 == kVar.f67798d) {
            Object[] objArr = kVar.f67821i;
            int i3 = this.f67815f;
            while (true) {
                i = i3 - 1;
                if (i3 <= 0 || ((obj = objArr[i]) != null && obj != C23632k.f67819n)) {
                    return i;
                }
                i3 = i;
            }
            return i;
        }
        throw new ConcurrentModificationException();
    }
}
