package r60;

import android.view.View;
import java.lang.ref.WeakReference;
import x60.C102564a;

/* renamed from: r60.i */
public class C101350i<T> {

    /* renamed from: a */
    public WeakReference<T> f296896a;

    /* renamed from: b */
    public C102564a f296897b = new C102564a("");

    /* renamed from: c */
    public final int f296898c;

    public C101350i(T t) {
        this.f296896a = new WeakReference<>(t);
        if (t != null) {
            this.f296898c = t.hashCode();
        } else {
            this.f296898c = hashCode();
        }
    }

    /* renamed from: a */
    public View mo140837a() {
        T t;
        WeakReference<T> weakReference = this.f296896a;
        if (weakReference == null || (t = weakReference.get()) == null || !(t instanceof View)) {
            return null;
        }
        return (View) t;
    }

    public C101350i(T t, C102564a aVar) {
        this.f296896a = new WeakReference<>(t);
        if (t != null) {
            this.f296898c = t.hashCode();
        } else {
            this.f296898c = hashCode();
        }
        this.f296897b = aVar;
    }
}
