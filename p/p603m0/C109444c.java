package p603m0;

import gy3.C87412m;
import java.util.NoSuchElementException;

/* renamed from: m0.c */
public final class C109444c<T> extends C109441a<T> {

    /* renamed from: f */
    public final T[] f327588f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109444c(T[] tArr, int i, int i2) {
        super(i, i2);
        C87412m.m108594g(tArr, "buffer");
        this.f327588f = tArr;
    }

    public T next() {
        if (hasNext()) {
            T[] tArr = this.f327588f;
            int i = this.f327585d;
            this.f327585d = i + 1;
            return tArr[i];
        }
        throw new NoSuchElementException();
    }

    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.f327588f;
            int i = this.f327585d - 1;
            this.f327585d = i;
            return tArr[i];
        }
        throw new NoSuchElementException();
    }
}
