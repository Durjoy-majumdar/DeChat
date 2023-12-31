package p418rx.internal.util.unsafe;

import java.util.Iterator;
import sun.misc.Unsafe;

/* renamed from: rx.internal.util.unsafe.SpscUnboundedArrayQueue */
public class SpscUnboundedArrayQueue<E> extends SpscUnboundedArrayQueueConsumerField<E> implements QueueProgressIndicators {
    private static final long C_INDEX_OFFSET;
    private static final Object HAS_NEXT = new Object();
    public static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final long P_INDEX_OFFSET;
    private static final long REF_ARRAY_BASE;
    private static final int REF_ELEMENT_SHIFT;

    static {
        Class<Object[]> cls = Object[].class;
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        int arrayIndexScale = unsafe.arrayIndexScale(cls);
        if (4 == arrayIndexScale) {
            REF_ELEMENT_SHIFT = 2;
        } else if (8 == arrayIndexScale) {
            REF_ELEMENT_SHIFT = 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        REF_ARRAY_BASE = (long) unsafe.arrayBaseOffset(cls);
        try {
            P_INDEX_OFFSET = unsafe.objectFieldOffset(SpscUnboundedArrayQueueProducerFields.class.getDeclaredField("producerIndex"));
            try {
                C_INDEX_OFFSET = unsafe.objectFieldOffset(SpscUnboundedArrayQueueConsumerField.class.getDeclaredField("consumerIndex"));
            } catch (NoSuchFieldException e) {
                InternalError internalError = new InternalError();
                internalError.initCause(e);
                throw internalError;
            }
        } catch (NoSuchFieldException e2) {
            InternalError internalError2 = new InternalError();
            internalError2.initCause(e2);
            throw internalError2;
        }
    }

    public SpscUnboundedArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        long j = (long) (roundToPowerOfTwo - 1);
        E[] eArr = new Object[(roundToPowerOfTwo + 1)];
        this.producerBuffer = eArr;
        this.producerMask = j;
        adjustLookAheadStep(roundToPowerOfTwo);
        this.consumerBuffer = eArr;
        this.consumerMask = j;
        this.producerLookAhead = j - 1;
        soProducerIndex(0);
    }

    private void adjustLookAheadStep(int i) {
        this.producerLookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static long calcDirectOffset(long j) {
        return REF_ARRAY_BASE + (j << REF_ELEMENT_SHIFT);
    }

    private static long calcWrappedOffset(long j, long j2) {
        return calcDirectOffset(j & j2);
    }

    private long lvConsumerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
    }

    private static <E> Object lvElement(E[] eArr, long j) {
        return UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j);
    }

    private E[] lvNext(E[] eArr) {
        return (Object[]) lvElement(eArr, calcDirectOffset((long) (eArr.length - 1)));
    }

    private long lvProducerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, P_INDEX_OFFSET);
    }

    private E newBufferPeek(E[] eArr, long j, long j2) {
        this.consumerBuffer = eArr;
        return lvElement(eArr, calcWrappedOffset(j, j2));
    }

    private E newBufferPoll(E[] eArr, long j, long j2) {
        this.consumerBuffer = eArr;
        long calcWrappedOffset = calcWrappedOffset(j, j2);
        E lvElement = lvElement(eArr, calcWrappedOffset);
        if (lvElement == null) {
            return null;
        }
        soElement(eArr, calcWrappedOffset, (Object) null);
        soConsumerIndex(j + 1);
        return lvElement;
    }

    private void resize(E[] eArr, long j, long j2, E e, long j3) {
        E[] eArr2 = new Object[eArr.length];
        this.producerBuffer = eArr2;
        this.producerLookAhead = (j3 + j) - 1;
        soElement(eArr2, j2, e);
        soNext(eArr, eArr2);
        soElement(eArr, j2, HAS_NEXT);
        soProducerIndex(j + 1);
    }

    private void soConsumerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j);
    }

    private static void soElement(Object[] objArr, long j, Object obj) {
        UnsafeAccess.UNSAFE.putOrderedObject(objArr, j, obj);
    }

    private void soNext(E[] eArr, E[] eArr2) {
        soElement(eArr, calcDirectOffset((long) (eArr.length - 1)), eArr2);
    }

    private void soProducerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }

    private boolean writeToQueue(E[] eArr, E e, long j, long j2) {
        soElement(eArr, j2, e);
        soProducerIndex(j + 1);
        return true;
    }

    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final boolean offer(E e) {
        if (e != null) {
            E[] eArr = this.producerBuffer;
            long j = this.producerIndex;
            long j2 = this.producerMask;
            long calcWrappedOffset = calcWrappedOffset(j, j2);
            if (j < this.producerLookAhead) {
                return writeToQueue(eArr, e, j, calcWrappedOffset);
            }
            long j3 = ((long) this.producerLookAheadStep) + j;
            if (lvElement(eArr, calcWrappedOffset(j3, j2)) == null) {
                this.producerLookAhead = j3 - 1;
                return writeToQueue(eArr, e, j, calcWrappedOffset);
            } else if (lvElement(eArr, calcWrappedOffset(1 + j, j2)) != null) {
                return writeToQueue(eArr, e, j, calcWrappedOffset);
            } else {
                resize(eArr, j, calcWrappedOffset, e, j2);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public final E peek() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        E lvElement = lvElement(eArr, calcWrappedOffset(j, j2));
        if (lvElement != HAS_NEXT) {
            return lvElement;
        }
        return newBufferPeek(lvNext(eArr), j, j2);
    }

    public final E poll() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        long calcWrappedOffset = calcWrappedOffset(j, j2);
        E lvElement = lvElement(eArr, calcWrappedOffset);
        boolean z = lvElement == HAS_NEXT;
        if (lvElement != null && !z) {
            soElement(eArr, calcWrappedOffset, (Object) null);
            soConsumerIndex(j + 1);
            return lvElement;
        } else if (!z) {
            return null;
        } else {
            return newBufferPoll(lvNext(eArr), j, j2);
        }
    }

    public final int size() {
        long lvConsumerIndex = lvConsumerIndex();
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            long lvConsumerIndex2 = lvConsumerIndex();
            if (lvConsumerIndex == lvConsumerIndex2) {
                return (int) (lvProducerIndex - lvConsumerIndex2);
            }
            lvConsumerIndex = lvConsumerIndex2;
        }
    }
}
