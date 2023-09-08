package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.SpmcArrayQueueProducerIndexCacheField */
abstract class SpmcArrayQueueProducerIndexCacheField<E> extends SpmcArrayQueueMidPad<E> {
    private volatile long producerIndexCache;

    public SpmcArrayQueueProducerIndexCacheField(int i) {
        super(i);
    }

    public final long lvProducerIndexCache() {
        return this.producerIndexCache;
    }

    public final void svProducerIndexCache(long j) {
        this.producerIndexCache = j;
    }
}
