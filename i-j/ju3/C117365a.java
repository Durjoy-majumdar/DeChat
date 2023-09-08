package ju3;

import iu3.C117277g;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ju3.a */
public abstract class C117365a implements C117366b {

    /* renamed from: a */
    public static final HashMap<String, C117277g.C117278a> f351357a = new HashMap<>();

    /* renamed from: b */
    public void mo181961b(C117277g gVar) {
    }

    /* renamed from: c */
    public void mo181962c(C117277g gVar) {
        int i;
        AtomicInteger atomicInteger = gVar.f351131b.f351134c;
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, i - 1));
        if (gVar.f351131b.f351134c.intValue() <= 0) {
            HashMap<String, C117277g.C117278a> hashMap = f351357a;
            synchronized (hashMap) {
                hashMap.remove(gVar.f351131b.f351133b);
            }
        }
    }
}
