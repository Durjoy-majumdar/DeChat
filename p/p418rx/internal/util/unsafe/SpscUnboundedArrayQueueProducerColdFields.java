package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.SpscUnboundedArrayQueueProducerColdFields */
abstract class SpscUnboundedArrayQueueProducerColdFields<E> extends SpscUnboundedArrayQueueProducerFields<E> {
    public E[] producerBuffer;
    public long producerLookAhead;
    public int producerLookAheadStep;
    public long producerMask;
}
