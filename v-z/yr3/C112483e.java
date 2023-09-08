package yr3;

import android.text.Spanned;
import java.lang.reflect.Array;

/* renamed from: yr3.e */
public class C112483e<E> {

    /* renamed from: a */
    public final Class<? extends E> f336843a;

    /* renamed from: b */
    public int f336844b = 0;

    /* renamed from: c */
    public E[] f336845c;

    /* renamed from: d */
    public int[] f336846d;

    /* renamed from: e */
    public int[] f336847e;

    /* renamed from: f */
    public int[] f336848f;

    public C112483e(Class<? extends E> cls) {
        this.f336843a = cls;
    }

    /* renamed from: a */
    public E mo164229a(int i, int i2) {
        for (int i3 = 0; i3 < this.f336844b; i3++) {
            if (this.f336846d[i3] < i2 && this.f336847e[i3] > i) {
                return this.f336845c[i3];
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo164230b(Spanned spanned, int i, int i2) {
        E[] eArr;
        if (r10 > 0 && ((eArr = this.f336845c) == null || eArr.length < r10)) {
            this.f336845c = (Object[]) Array.newInstance(this.f336843a, r10);
            this.f336846d = new int[r10];
            this.f336847e = new int[r10];
            this.f336848f = new int[r10];
        }
        this.f336844b = 0;
        for (E e : spanned.getSpans(i, i2, this.f336843a)) {
            int spanStart = spanned.getSpanStart(e);
            int spanEnd = spanned.getSpanEnd(e);
            if (spanStart != spanEnd) {
                int spanFlags = spanned.getSpanFlags(e);
                E[] eArr2 = this.f336845c;
                int i3 = this.f336844b;
                eArr2[i3] = e;
                this.f336846d[i3] = spanStart;
                this.f336847e[i3] = spanEnd;
                this.f336848f[i3] = spanFlags;
                this.f336844b = i3 + 1;
            }
        }
    }
}
