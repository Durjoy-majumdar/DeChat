package p363n2;

/* renamed from: n2.g */
public class C21592g<T> implements C21591f<T> {

    /* renamed from: a */
    public final Object[] f61149a;

    /* renamed from: b */
    public int f61150b;

    public C21592g(int i) {
        if (i > 0) {
            this.f61149a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
