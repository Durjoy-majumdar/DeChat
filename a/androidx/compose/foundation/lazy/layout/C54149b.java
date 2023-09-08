package androidx.compose.foundation.lazy.layout;

/* renamed from: androidx.compose.foundation.lazy.layout.b */
public final class C54149b<T> {

    /* renamed from: a */
    public final int f152074a;

    /* renamed from: b */
    public final int f152075b;

    /* renamed from: c */
    public final T f152076c;

    public C54149b(int i, int i2, T t) {
        this.f152074a = i;
        this.f152075b = i2;
        this.f152076c = t;
        boolean z = true;
        if (i >= 0) {
            if (!(i2 <= 0 ? false : z)) {
                throw new IllegalArgumentException(("size should be positive but was " + i2).toString());
            }
            return;
        }
        throw new IllegalArgumentException(("startIndex should be non-negative but was " + i).toString());
    }
}
