package kc0;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: kc0.a */
public class C99120a<E> extends LinkedBlockingDeque<E> {
    public boolean offer(E e) {
        return offerFirst(e);
    }

    public E remove() {
        return removeFirst();
    }
}
