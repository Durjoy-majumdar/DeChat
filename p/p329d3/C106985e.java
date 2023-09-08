package p329d3;

/* renamed from: d3.e */
public class C106985e<T> implements C86167d<T> {

    /* renamed from: a */
    public final Object[] f320232a;

    /* renamed from: b */
    public int f320233b;

    public C106985e(int i) {
        if (i > 0) {
            this.f320232a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo157419a() {
        int i = this.f320233b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f320232a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f320233b = i - 1;
        return t;
    }

    /* renamed from: b */
    public boolean mo157420b(T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f320233b;
            if (i2 >= i) {
                z = false;
                break;
            } else if (this.f320232a[i2] == t) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            Object[] objArr = this.f320232a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f320233b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
