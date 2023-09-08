package p603m0;

import gy3.C87412m;
import java.util.NoSuchElementException;

/* renamed from: m0.k */
public final class C109452k<E> extends C109441a<E> {

    /* renamed from: f */
    public int f327611f;

    /* renamed from: g */
    public Object[] f327612g;

    /* renamed from: h */
    public boolean f327613h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109452k(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        C87412m.m108594g(objArr, "root");
        this.f327611f = i3;
        Object[] objArr2 = new Object[i3];
        this.f327612g = objArr2;
        boolean z = i == i2;
        this.f327613h = z;
        objArr2[0] = objArr;
        mo160687c(i - (z ? 1 : 0), 1);
    }

    /* renamed from: a */
    public final E mo160686a() {
        int i = this.f327585d & 31;
        Object obj = this.f327612g[this.f327611f - 1];
        if (obj != null) {
            return ((Object[]) obj)[i];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    /* renamed from: c */
    public final void mo160687c(int i, int i2) {
        int i3 = (this.f327611f - i2) * 5;
        while (i2 < this.f327611f) {
            Object[] objArr = this.f327612g;
            Object[] objArr2 = objArr[i2 - 1];
            if (objArr2 != null) {
                objArr[i2] = objArr2[(i >> i3) & 31];
                i3 -= 5;
                i2++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
    }

    public E next() {
        int i;
        if (hasNext()) {
            E a = mo160686a();
            int i2 = this.f327585d + 1;
            this.f327585d = i2;
            if (i2 == this.f327586e) {
                this.f327613h = true;
                return a;
            }
            int i3 = 0;
            while (true) {
                i = this.f327585d;
                if (((i >> i3) & 31) != 0) {
                    break;
                }
                i3 += 5;
            }
            if (i3 > 0) {
                mo160687c(i, ((this.f327611f - 1) - (i3 / 5)) + 1);
            }
            return a;
        }
        throw new NoSuchElementException();
    }

    public E previous() {
        int i;
        if (hasPrevious()) {
            this.f327585d--;
            int i2 = 0;
            if (this.f327613h) {
                this.f327613h = false;
                return mo160686a();
            }
            while (true) {
                i = this.f327585d;
                if (((i >> i2) & 31) != 31) {
                    break;
                }
                i2 += 5;
            }
            if (i2 > 0) {
                mo160687c(i, ((this.f327611f - 1) - (i2 / 5)) + 1);
            }
            return mo160686a();
        }
        throw new NoSuchElementException();
    }
}
