package p418rx.internal.util.unsafe;

import java.util.Iterator;
import sun.misc.Unsafe;

/* renamed from: rx.internal.util.unsafe.ConcurrentCircularArrayQueue */
public abstract class ConcurrentCircularArrayQueue<E> extends ConcurrentCircularArrayQueueL0Pad<E> {
    public static final int BUFFER_PAD = 32;
    private static final long REF_ARRAY_BASE;
    private static final int REF_ELEMENT_SHIFT;
    public static final int SPARSE_SHIFT;
    public final E[] buffer;
    public final long mask;

    static {
        Class<Object[]> cls = Object[].class;
        int intValue = Integer.getInteger("sparse.shift", 0).intValue();
        SPARSE_SHIFT = intValue;
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        int arrayIndexScale = unsafe.arrayIndexScale(cls);
        if (4 == arrayIndexScale) {
            REF_ELEMENT_SHIFT = intValue + 2;
        } else if (8 == arrayIndexScale) {
            REF_ELEMENT_SHIFT = intValue + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        REF_ARRAY_BASE = (long) (unsafe.arrayBaseOffset(cls) + (32 << (REF_ELEMENT_SHIFT - intValue)));
    }

    public ConcurrentCircularArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.mask = (long) (roundToPowerOfTwo - 1);
        this.buffer = new Object[((roundToPowerOfTwo << SPARSE_SHIFT) + 64)];
    }

    public final long calcElementOffset(long j) {
        return calcElementOffset(j, this.mask);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final E lpElement(long j) {
        return lpElement(this.buffer, j);
    }

    public final E lvElement(long j) {
        return lvElement(this.buffer, j);
    }

    public final void soElement(long j, E e) {
        soElement(this.buffer, j, e);
    }

    public final void spElement(long j, E e) {
        spElement(this.buffer, j, e);
    }

    public final long calcElementOffset(long j, long j2) {
        return REF_ARRAY_BASE + ((j & j2) << REF_ELEMENT_SHIFT);
    }

    public final E lpElement(E[] eArr, long j) {
        return UnsafeAccess.UNSAFE.getObject(eArr, j);
    }

    public final E lvElement(E[] eArr, long j) {
        return UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j);
    }

    public final void soElement(E[] eArr, long j, E e) {
        UnsafeAccess.UNSAFE.putOrderedObject(eArr, j, e);
    }

    public final void spElement(E[] eArr, long j, E e) {
        UnsafeAccess.UNSAFE.putObject(eArr, j, e);
    }
}
