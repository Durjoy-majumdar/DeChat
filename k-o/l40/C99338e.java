package l40;

/* renamed from: l40.e */
public class C99338e {

    /* renamed from: a */
    public final C99337d[] f291288a;

    /* renamed from: b */
    public int f291289b;

    /* renamed from: c */
    public final Object f291290c = new Object();

    public C99338e(int i) {
        if (i > 0) {
            this.f291288a = new C99337d[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
