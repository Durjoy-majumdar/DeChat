package sx1;

import java.util.concurrent.CopyOnWriteArrayList;
import sx1.C48495c;

/* renamed from: sx1.d */
public class C48496d<E extends C48495c> extends CopyOnWriteArrayList<E> {

    /* renamed from: d */
    public Object f129701d = new Object();

    /* renamed from: f */
    public int mo73125f(Object obj) {
        int i = 0;
        for (int i2 = 0; i2 < size(); i2++) {
            if (((C48495c) get(i2)).mo64013b().equals(obj)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    public int mo73126h(E e) {
        int i;
        synchronized (this.f129701d) {
            boolean z = false;
            i = 0;
            while (true) {
                if (i >= size()) {
                    i = 0;
                    break;
                } else if (e.mo64012a((C48495c) get(i)) < 0) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                i = size();
            }
            add(i, e);
        }
        return i;
    }
}
