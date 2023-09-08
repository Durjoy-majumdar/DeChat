package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.SpscUnboundedArrayQueueConsumerColdField */
abstract class SpscUnboundedArrayQueueConsumerColdField<E> extends SpscUnboundedArrayQueueL2Pad<E> {
    public E[] consumerBuffer;
    public long consumerMask;
}
