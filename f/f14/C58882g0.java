package f14;

import f14.C58884h0;
import gy3.C87412m;
import java.lang.Comparable;
import java.util.Arrays;

/* renamed from: f14.g0 */
public class C58882g0<T extends C58884h0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    public T[] f168523a;

    /* renamed from: a */
    public final void mo84061a(T t) {
        t.mo74586a(this);
        T[] tArr = this.f168523a;
        if (tArr == null) {
            tArr = new C58884h0[4];
            this.f168523a = tArr;
        } else if (this._size >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            tArr = (C58884h0[]) copyOf;
            this.f168523a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = t;
        t.setIndex(i);
        mo84065e(i);
    }

    /* renamed from: b */
    public final boolean mo84062b() {
        return this._size == 0;
    }

    /* renamed from: c */
    public final T mo84063c(int i) {
        T[] tArr = this.f168523a;
        C87412m.m108591d(tArr);
        this._size--;
        if (i < this._size) {
            mo84066f(i, this._size);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C87412m.m108591d(t);
                T t2 = tArr[i2];
                C87412m.m108591d(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    mo84066f(i, i2);
                    mo84065e(i2);
                }
            }
            while (true) {
                int i3 = (i * 2) + 1;
                if (i3 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f168523a;
                C87412m.m108591d(tArr2);
                int i4 = i3 + 1;
                if (i4 < this._size) {
                    T t3 = tArr2[i4];
                    C87412m.m108591d(t3);
                    T t4 = tArr2[i3];
                    C87412m.m108591d(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i3 = i4;
                    }
                }
                T t5 = tArr2[i];
                C87412m.m108591d(t5);
                T t6 = tArr2[i3];
                C87412m.m108591d(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                mo84066f(i, i3);
                i = i3;
            }
        }
        T t7 = tArr[this._size];
        C87412m.m108591d(t7);
        t7.mo74586a((C58882g0<?>) null);
        t7.setIndex(-1);
        tArr[this._size] = null;
        return t7;
    }

    /* renamed from: d */
    public final T mo84064d() {
        T c;
        synchronized (this) {
            c = this._size > 0 ? mo84063c(0) : null;
        }
        return c;
    }

    /* renamed from: e */
    public final void mo84065e(int i) {
        while (i > 0) {
            T[] tArr = this.f168523a;
            C87412m.m108591d(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C87412m.m108591d(t);
            T t2 = tArr[i];
            C87412m.m108591d(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                mo84066f(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo84066f(int i, int i2) {
        T[] tArr = this.f168523a;
        C87412m.m108591d(tArr);
        T t = tArr[i2];
        C87412m.m108591d(t);
        T t2 = tArr[i];
        C87412m.m108591d(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
