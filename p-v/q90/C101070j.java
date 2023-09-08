package q90;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;

/* renamed from: q90.j */
public class C101070j<T, V> extends C101062d<T, V, C101071a<V>, V> {

    /* renamed from: q90.j$a */
    public static class C101071a<T> {

        /* renamed from: a */
        public T f295886a;

        /* renamed from: b */
        public WeakReference<T> f295887b = null;

        /* renamed from: q90.j$a$a */
        public class C101072a implements Runnable {
            public C101072a() {
            }

            public void run() {
                C101071a.this.f295886a = null;
            }
        }

        public C101071a(T t) {
            this.f295886a = t;
            this.f295887b = new WeakReference<>(t);
            MMHandlerThread.postToMainThreadDelayed(new C101072a(), 2000);
        }
    }

    public C101070j(int i) {
        super(i);
    }

    /* renamed from: d */
    public T mo139558d() {
        return null;
    }

    /* renamed from: h */
    public Object mo139563h(Object obj, Object obj2) {
        return new C101071a(obj2);
    }

    /* renamed from: i */
    public V mo139564i(T t, V v) {
        return v;
    }

    /* renamed from: j */
    public Object mo139565j(Object obj) {
        C101071a aVar = (C101071a) obj;
        if (aVar == null) {
            return null;
        }
        T t = aVar.f295886a;
        if (t != null) {
            return t;
        }
        WeakReference<T> weakReference = aVar.f295887b;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return aVar.f295887b.get();
    }

    public Map<T, V> snapshot() {
        return null;
    }

    public Collection<V> values() {
        return null;
    }
}
