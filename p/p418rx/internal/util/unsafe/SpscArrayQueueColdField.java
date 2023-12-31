package p418rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.SpscArrayQueueColdField */
abstract class SpscArrayQueueColdField<E> extends ConcurrentCircularArrayQueue<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final int lookAheadStep;

    public SpscArrayQueueColdField(int i) {
        super(i);
        this.lookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }
}
