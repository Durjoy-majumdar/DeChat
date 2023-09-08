package p981ie;

import java.lang.ref.WeakReference;

/* renamed from: ie.v */
public abstract class C117186v<T> {

    /* renamed from: a */
    public ThreadLocal<WeakReference<T>> f351068a;

    /* renamed from: a */
    public abstract T mo173739a();

    /* renamed from: b */
    public T mo181110b() {
        WeakReference weakReference;
        T t;
        ThreadLocal<WeakReference<T>> threadLocal = this.f351068a;
        if (threadLocal != null && (weakReference = threadLocal.get()) != null && (t = weakReference.get()) != null) {
            return t;
        }
        T a = mo173739a();
        WeakReference weakReference2 = new WeakReference(a);
        ThreadLocal<WeakReference<T>> threadLocal2 = new ThreadLocal<>();
        this.f351068a = threadLocal2;
        threadLocal2.set(weakReference2);
        return a;
    }
}
