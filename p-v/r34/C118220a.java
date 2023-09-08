package r34;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p418rx.internal.util.unsafe.Pow2;

/* renamed from: r34.a */
public abstract class C118220a<E> extends AbstractQueue<E> {

    /* renamed from: d */
    public final AtomicReferenceArray<E> f353364d;

    /* renamed from: e */
    public final int f353365e;

    public C118220a(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f353365e = roundToPowerOfTwo - 1;
        this.f353364d = new AtomicReferenceArray<>(roundToPowerOfTwo);
    }

    public void clear() {
        while (true) {
            if (((C118221c) this).poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}
