package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.SpscArrayQueue */
public final class SpscArrayQueue<E> extends SpscArrayQueueL3Pad<E> {
    public SpscArrayQueue(int i) {
        super(i);
    }

    private long lvConsumerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, SpscArrayQueueConsumerField.C_INDEX_OFFSET);
    }

    private long lvProducerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, SpscArrayQueueProducerFields.P_INDEX_OFFSET);
    }

    private void soConsumerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, SpscArrayQueueConsumerField.C_INDEX_OFFSET, j);
    }

    private void soProducerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, SpscArrayQueueProducerFields.P_INDEX_OFFSET, j);
    }

    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    public boolean offer(E e) {
        if (e != null) {
            E[] eArr = this.buffer;
            long j = this.producerIndex;
            long calcElementOffset = calcElementOffset(j);
            if (lvElement(eArr, calcElementOffset) != null) {
                return false;
            }
            soElement(eArr, calcElementOffset, e);
            soProducerIndex(j + 1);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public E peek() {
        return lvElement(calcElementOffset(this.consumerIndex));
    }

    public E poll() {
        long j = this.consumerIndex;
        long calcElementOffset = calcElementOffset(j);
        E[] eArr = this.buffer;
        E lvElement = lvElement(eArr, calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soElement(eArr, calcElementOffset, null);
        soConsumerIndex(j + 1);
        return lvElement;
    }

    public int size() {
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
