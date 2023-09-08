package p603m0;

import gy3.C87412m;
import java.util.NoSuchElementException;

/* renamed from: m0.g */
public final class C109448g<T> extends C109441a<T> {

    /* renamed from: f */
    public final T[] f327602f;

    /* renamed from: g */
    public final C109452k<T> f327603g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109448g(Object[] objArr, T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        C87412m.m108594g(objArr, "root");
        C87412m.m108594g(tArr, "tail");
        this.f327602f = tArr;
        int i4 = (i2 - 1) & -32;
        this.f327603g = new C109452k<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        } else if (this.f327603g.hasNext()) {
            this.f327585d++;
            return this.f327603g.next();
        } else {
            T[] tArr = this.f327602f;
            int i = this.f327585d;
            this.f327585d = i + 1;
            return tArr[i - this.f327603g.f327586e];
        }
    }

    public T previous() {
        if (hasPrevious()) {
            int i = this.f327585d;
            C109452k<T> kVar = this.f327603g;
            int i2 = kVar.f327586e;
            if (i > i2) {
                T[] tArr = this.f327602f;
                int i3 = i - 1;
                this.f327585d = i3;
                return tArr[i3 - i2];
            }
            this.f327585d = i - 1;
            return kVar.previous();
        }
        throw new NoSuchElementException();
    }
}
