package ak3;

import java.util.Comparator;
import ln3.C76709a;

/* renamed from: ak3.d */
public final class C67065d<T> implements Comparator {

    /* renamed from: d */
    public static final C67065d<T> f192637d = new C67065d<>();

    public int compare(Object obj, Object obj2) {
        int i;
        C76709a aVar = (C76709a) obj;
        C76709a aVar2 = (C76709a) obj2;
        int c = aVar.mo75c();
        int c2 = aVar2.mo75c();
        if (c != c2) {
            return -(c - c2);
        }
        try {
            i = aVar.mo86282g(aVar2);
        } catch (Throwable unused) {
            i = 0;
        }
        return -i;
    }
}
