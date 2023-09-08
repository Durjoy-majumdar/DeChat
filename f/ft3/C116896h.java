package ft3;

/* renamed from: ft3.h */
public abstract class C116896h<T> {

    /* renamed from: a */
    public volatile T f350316a;

    /* renamed from: a */
    public abstract T mo165606a();

    /* renamed from: b */
    public final T mo180860b() {
        T t = this.f350316a;
        if (t == null) {
            synchronized (this) {
                t = this.f350316a;
                if (t == null) {
                    t = mo165606a();
                    this.f350316a = t;
                }
            }
        }
        return t;
    }
}
