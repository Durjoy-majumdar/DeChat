package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.SpscArrayQueueProducerFields */
abstract class SpscArrayQueueProducerFields<E> extends SpscArrayQueueL1Pad<E> {
    public static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(SpscArrayQueueProducerFields.class, "producerIndex");
    public long producerIndex;
    public long producerLookAhead;

    public SpscArrayQueueProducerFields(int i) {
        super(i);
    }
}
