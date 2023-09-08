package p418rx.internal.util.unsafe;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;

/* renamed from: rx.internal.util.unsafe.MpmcArrayQueue */
public class MpmcArrayQueue<E> extends MpmcArrayQueueConsumerField<E> {

    /* renamed from: p30  reason: collision with root package name */
    public long f361748p30;

    /* renamed from: p31  reason: collision with root package name */
    public long f361749p31;

    /* renamed from: p32  reason: collision with root package name */
    public long f361750p32;

    /* renamed from: p33  reason: collision with root package name */
    public long f361751p33;

    /* renamed from: p34  reason: collision with root package name */
    public long f361752p34;
    public long p35;
    public long p36;
    public long p37;

    /* renamed from: p40  reason: collision with root package name */
    public long f361753p40;

    /* renamed from: p41  reason: collision with root package name */
    public long f361754p41;

    /* renamed from: p42  reason: collision with root package name */
    public long f361755p42;

    /* renamed from: p43  reason: collision with root package name */
    public long f361756p43;
    public long p44;
    public long p45;
    public long p46;

    public MpmcArrayQueue(int i) {
        super(Math.max(2, i));
    }

    public boolean isEmpty() {
        return lvConsumerIndex() == lvProducerIndex();
    }

    public boolean offer(E e) {
        E e2 = e;
        if (e2 != null) {
            long j = this.mask + 1;
            long[] jArr = this.sequenceBuffer;
            long j2 = MAlarmHandler.NEXT_FIRE_INTERVAL;
            while (true) {
                long lvProducerIndex = lvProducerIndex();
                long calcSequenceOffset = calcSequenceOffset(lvProducerIndex);
                int i = ((lvSequence(jArr, calcSequenceOffset) - lvProducerIndex) > 0 ? 1 : ((lvSequence(jArr, calcSequenceOffset) - lvProducerIndex) == 0 ? 0 : -1));
                if (i == 0) {
                    long j3 = lvProducerIndex + 1;
                    if (casProducerIndex(lvProducerIndex, j3)) {
                        spElement(calcElementOffset(lvProducerIndex), e2);
                        soSequence(jArr, calcSequenceOffset, j3);
                        return true;
                    }
                } else if (i < 0) {
                    long j4 = lvProducerIndex - j;
                    if (j4 <= j2) {
                        j2 = lvConsumerIndex();
                        if (j4 <= j2) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E peek() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = r6.lvConsumerIndex()
            long r2 = r6.calcElementOffset(r0)
            java.lang.Object r2 = r6.lpElement(r2)
            if (r2 != 0) goto L_0x0016
            long r3 = r6.lvProducerIndex()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0000
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p418rx.internal.util.unsafe.MpmcArrayQueue.peek():java.lang.Object");
    }

    public E poll() {
        long[] jArr = this.sequenceBuffer;
        long j = -1;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            long calcSequenceOffset = calcSequenceOffset(lvConsumerIndex);
            long j2 = lvConsumerIndex + 1;
            int i = ((lvSequence(jArr, calcSequenceOffset) - j2) > 0 ? 1 : ((lvSequence(jArr, calcSequenceOffset) - j2) == 0 ? 0 : -1));
            if (i == 0) {
                if (casConsumerIndex(lvConsumerIndex, j2)) {
                    long calcElementOffset = calcElementOffset(lvConsumerIndex);
                    E lpElement = lpElement(calcElementOffset);
                    spElement(calcElementOffset, null);
                    soSequence(jArr, calcSequenceOffset, lvConsumerIndex + this.mask + 1);
                    return lpElement;
                }
            } else if (i < 0 && lvConsumerIndex >= j) {
                j = lvProducerIndex();
                if (lvConsumerIndex == j) {
                    return null;
                }
            }
        }
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
