package p329d3;

/* renamed from: d3.f */
public class C106986f<T> extends C106985e<T> {

    /* renamed from: c */
    public final Object f320234c = new Object();

    public C106986f(int i) {
        super(i);
    }

    /* renamed from: a */
    public T mo157419a() {
        T a;
        synchronized (this.f320234c) {
            a = super.mo157419a();
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo157420b(T t) {
        boolean b;
        synchronized (this.f320234c) {
            b = super.mo157420b(t);
        }
        return b;
    }
}
