package r34;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: r34.c */
public final class C118221c<E> extends C118220a<E> {

    /* renamed from: j */
    public static final Integer f353366j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: f */
    public final AtomicLong f353367f = new AtomicLong();

    /* renamed from: g */
    public long f353368g;

    /* renamed from: h */
    public final AtomicLong f353369h = new AtomicLong();

    /* renamed from: i */
    public final int f353370i;

    public C118221c(int i) {
        super(i);
        this.f353370i = Math.min(i / 4, f353366j.intValue());
    }

    public boolean isEmpty() {
        return this.f353367f.get() == this.f353369h.get();
    }

    public boolean offer(E e) {
        if (e != null) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f353364d;
            int i = this.f353365e;
            long j = this.f353367f.get();
            int i2 = ((int) j) & i;
            if (j >= this.f353368g) {
                long j2 = ((long) this.f353370i) + j;
                if (atomicReferenceArray.get(i & ((int) j2)) == null) {
                    this.f353368g = j2;
                } else if (atomicReferenceArray.get(i2) != null) {
                    return false;
                }
            }
            atomicReferenceArray.lazySet(i2, e);
            this.f353367f.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E peek() {
        return this.f353364d.get(this.f353365e & ((int) this.f353369h.get()));
    }

    public E poll() {
        long j = this.f353369h.get();
        int i = ((int) j) & this.f353365e;
        AtomicReferenceArray<E> atomicReferenceArray = this.f353364d;
        E e = atomicReferenceArray.get(i);
        if (e == null) {
            return null;
        }
        atomicReferenceArray.lazySet(i, (Object) null);
        this.f353369h.lazySet(j + 1);
        return e;
    }

    public int size() {
        long j = this.f353369h.get();
        while (true) {
            long j2 = this.f353367f.get();
            long j3 = this.f353369h.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }
}
