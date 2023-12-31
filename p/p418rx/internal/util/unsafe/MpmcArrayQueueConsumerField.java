package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.MpmcArrayQueueConsumerField */
abstract class MpmcArrayQueueConsumerField<E> extends MpmcArrayQueueL2Pad<E> {
    private static final long C_INDEX_OFFSET = UnsafeAccess.addressOf(MpmcArrayQueueConsumerField.class, "consumerIndex");
    private volatile long consumerIndex;

    public MpmcArrayQueueConsumerField(int i) {
        super(i);
    }

    public final boolean casConsumerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j, j2);
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}
