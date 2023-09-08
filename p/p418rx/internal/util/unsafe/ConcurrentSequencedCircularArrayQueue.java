package p418rx.internal.util.unsafe;

import sun.misc.Unsafe;

/* renamed from: rx.internal.util.unsafe.ConcurrentSequencedCircularArrayQueue */
public abstract class ConcurrentSequencedCircularArrayQueue<E> extends ConcurrentCircularArrayQueue<E> {
    private static final long ARRAY_BASE;
    private static final int ELEMENT_SHIFT;
    public final long[] sequenceBuffer;

    static {
        Class<long[]> cls = long[].class;
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        if (8 == unsafe.arrayIndexScale(cls)) {
            int i = ConcurrentCircularArrayQueue.SPARSE_SHIFT;
            int i2 = i + 3;
            ELEMENT_SHIFT = i2;
            ARRAY_BASE = (long) (unsafe.arrayBaseOffset(cls) + (32 << (i2 - i)));
            return;
        }
        throw new IllegalStateException("Unexpected long[] element size");
    }

    public ConcurrentSequencedCircularArrayQueue(int i) {
        super(i);
        int i2 = (int) (this.mask + 1);
        this.sequenceBuffer = new long[((i2 << ConcurrentCircularArrayQueue.SPARSE_SHIFT) + 64)];
        for (long j = 0; j < ((long) i2); j++) {
            soSequence(this.sequenceBuffer, calcSequenceOffset(j), j);
        }
    }

    public final long calcSequenceOffset(long j) {
        return ARRAY_BASE + ((j & this.mask) << ELEMENT_SHIFT);
    }

    public final long lvSequence(long[] jArr, long j) {
        return UnsafeAccess.UNSAFE.getLongVolatile(jArr, j);
    }

    public final void soSequence(long[] jArr, long j, long j2) {
        UnsafeAccess.UNSAFE.putOrderedLong(jArr, j, j2);
    }
}
