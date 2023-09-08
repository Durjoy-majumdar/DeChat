package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.SpscArrayQueueConsumerField */
abstract class SpscArrayQueueConsumerField<E> extends SpscArrayQueueL2Pad<E> {
    public static final long C_INDEX_OFFSET = UnsafeAccess.addressOf(SpscArrayQueueConsumerField.class, "consumerIndex");
    public long consumerIndex;

    public SpscArrayQueueConsumerField(int i) {
        super(i);
    }
}
