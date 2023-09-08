package p356lh;

/* renamed from: lh.g */
public class C21433g<T> {

    /* renamed from: a */
    public T f60671a;

    public C21433g(T t) {
        this.f60671a = t;
    }

    /* renamed from: a */
    public synchronized boolean mo33599a(T... tArr) {
        for (T equals : tArr) {
            if (this.f60671a.equals(equals)) {
                return true;
            }
        }
        return false;
    }
}
