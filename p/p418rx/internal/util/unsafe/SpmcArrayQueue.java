package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.SpmcArrayQueue */
public final class SpmcArrayQueue<E> extends SpmcArrayQueueL3Pad<E> {
    public SpmcArrayQueue(int i) {
        super(i);
    }

    public boolean isEmpty() {
        return lvConsumerIndex() == lvProducerIndex();
    }

    public boolean offer(E e) {
        if (e != null) {
            E[] eArr = this.buffer;
            long j = this.mask;
            long lvProducerIndex = lvProducerIndex();
            long calcElementOffset = calcElementOffset(lvProducerIndex);
            if (lvElement(eArr, calcElementOffset) == null) {
                spElement(eArr, calcElementOffset, e);
                soTail(lvProducerIndex + 1);
            } else if (lvProducerIndex - lvConsumerIndex() > j) {
                return false;
            } else {
                do {
                } while (lvElement(eArr, calcElementOffset) != null);
            }
            spElement(eArr, calcElementOffset, e);
            soTail(lvProducerIndex + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E peek() {
        E lvElement;
        long lvProducerIndexCache = lvProducerIndexCache();
        do {
            long lvConsumerIndex = lvConsumerIndex();
            if (lvConsumerIndex >= lvProducerIndexCache) {
                long lvProducerIndex = lvProducerIndex();
                if (lvConsumerIndex >= lvProducerIndex) {
                    return null;
                }
                svProducerIndexCache(lvProducerIndex);
            }
            lvElement = lvElement(calcElementOffset(lvConsumerIndex));
        } while (lvElement == null);
        return lvElement;
    }

    public E poll() {
        long lvConsumerIndex;
        long lvProducerIndexCache = lvProducerIndexCache();
        do {
            lvConsumerIndex = lvConsumerIndex();
            if (lvConsumerIndex >= lvProducerIndexCache) {
                long lvProducerIndex = lvProducerIndex();
                if (lvConsumerIndex >= lvProducerIndex) {
                    return null;
                }
                svProducerIndexCache(lvProducerIndex);
            }
        } while (!casHead(lvConsumerIndex, 1 + lvConsumerIndex));
        long calcElementOffset = calcElementOffset(lvConsumerIndex);
        E[] eArr = this.buffer;
        E lpElement = lpElement(eArr, calcElementOffset);
        soElement(eArr, calcElementOffset, null);
        return lpElement;
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
