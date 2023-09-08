package sf2;

import java.lang.ref.WeakReference;
import p196ln.C10579k;

/* renamed from: sf2.a */
public class C48375a implements C10579k.C10580a {

    /* renamed from: d */
    public WeakReference<C10579k.C10580a> f129501d;

    public C48375a(C10579k.C10580a aVar) {
        this.f129501d = new WeakReference<>(aVar);
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        if (this.f129501d.get() != null) {
            this.f129501d.get().mo1428X(str);
        }
    }
}
