package sx3;

import gy3.C87412m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: sx3.v0 */
public final class C110824v0<T> extends C64177c<T> implements RandomAccess {

    /* renamed from: e */
    public final Object[] f331547e;

    /* renamed from: f */
    public final int f331548f;

    /* renamed from: g */
    public int f331549g;

    /* renamed from: h */
    public int f331550h;

    /* renamed from: sx3.v0$a */
    public static final class C110825a extends C110816b<T> {

        /* renamed from: f */
        public int f331551f;

        /* renamed from: g */
        public int f331552g;

        /* renamed from: h */
        public final /* synthetic */ C110824v0<T> f331553h;

        public C110825a(C110824v0<T> v0Var) {
            this.f331553h = v0Var;
            this.f331551f = v0Var.mo52189f();
            this.f331552g = v0Var.f331549g;
        }

        /* renamed from: a */
        public void mo51014a() {
            int i = this.f331551f;
            if (i == 0) {
                this.f331538d = C110817b1.Done;
                return;
            }
            C110824v0<T> v0Var = this.f331553h;
            T[] tArr = v0Var.f331547e;
            int i2 = this.f331552g;
            this.f331539e = tArr[i2];
            this.f331538d = C110817b1.Ready;
            this.f331552g = (i2 + 1) % v0Var.f331548f;
            this.f331551f = i - 1;
        }
    }

    public C110824v0(Object[] objArr, int i) {
        C87412m.m108594g(objArr, "buffer");
        this.f331547e = objArr;
        boolean z = true;
        if (i >= 0) {
            if (i > objArr.length ? false : z) {
                this.f331548f = objArr.length;
                this.f331550h = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    /* renamed from: f */
    public int mo52189f() {
        return this.f331550h;
    }

    public T get(int i) {
        int f = mo52189f();
        if (i >= 0 && i < f) {
            return this.f331547e[(this.f331549g + i) % this.f331548f];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + f);
    }

    /* renamed from: i */
    public final void mo162402i(int i) {
        boolean z = true;
        if (i >= 0) {
            if (i > mo52189f()) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + mo52189f()).toString());
            } else if (i > 0) {
                int i2 = this.f331549g;
                int i3 = this.f331548f;
                int i4 = (i2 + i) % i3;
                if (i2 > i4) {
                    C110821n.m150968o(this.f331547e, null, i2, i3);
                    C110821n.m150968o(this.f331547e, null, 0, i4);
                } else {
                    C110821n.m150968o(this.f331547e, null, i2, i4);
                }
                this.f331549g = i4;
                this.f331550h = mo52189f() - i;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
    }

    public Iterator<T> iterator() {
        return new C110825a(this);
    }

    public Object[] toArray() {
        return toArray(new Object[mo52189f()]);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        if (tArr.length < mo52189f()) {
            tArr = Arrays.copyOf(tArr, mo52189f());
            C87412m.m108593f(tArr, "copyOf(this, newSize)");
        }
        int f = mo52189f();
        int i = this.f331549g;
        int i2 = 0;
        int i3 = 0;
        while (i3 < f && i < this.f331548f) {
            tArr[i3] = this.f331547e[i];
            i3++;
            i++;
        }
        while (i3 < f) {
            tArr[i3] = this.f331547e[i2];
            i3++;
            i2++;
        }
        if (tArr.length > mo52189f()) {
            tArr[mo52189f()] = null;
        }
        return tArr;
    }
}
