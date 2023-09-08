package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.SpmcArrayQueueConsumerField */
abstract class SpmcArrayQueueConsumerField<E> extends SpmcArrayQueueL2Pad<E> {
    public static final long C_INDEX_OFFSET = UnsafeAccess.addressOf(SpmcArrayQueueConsumerField.class, "consumerIndex");
    private volatile long consumerIndex;

    public SpmcArrayQueueConsumerField(int i) {
        super(i);
    }

    public final boolean casHead(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j, j2);
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}
