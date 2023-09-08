package z60;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: z60.a */
public class C102976a<E> extends LinkedBlockingDeque<E> {
    public boolean offer(E e) {
        return offerFirst(e);
    }

    public E remove() {
        return removeFirst();
    }
}
