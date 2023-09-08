package f14;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: f14.x */
public final class C58906x<T> {
    private volatile AtomicReferenceArray<T> array;

    public C58906x(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: a */
    public final int mo84099a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final T mo84100b(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo84101c(int i, T t) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, t);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, t);
        this.array = atomicReferenceArray2;
    }
}
