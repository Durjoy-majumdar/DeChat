package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.MpmcArrayQueueProducerField */
abstract class MpmcArrayQueueProducerField<E> extends MpmcArrayQueueL1Pad<E> {
    private static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(MpmcArrayQueueProducerField.class, "producerIndex");
    private volatile long producerIndex;

    public MpmcArrayQueueProducerField(int i) {
        super(i);
    }

    public final boolean casProducerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j, j2);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }
}
