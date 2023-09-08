package my3;

import gy3.C87412m;
import java.lang.Comparable;

/* renamed from: my3.g */
public interface C61591g<T extends Comparable<? super T>> {

    /* renamed from: my3.g$a */
    public static final class C61592a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m72288a(C61591g<T> gVar, T t) {
            C87412m.m108594g(t, "value");
            return t.compareTo(gVar.mo59687f0()) >= 0 && t.compareTo(gVar.mo59688g0()) <= 0;
        }
    }

    /* renamed from: f0 */
    T mo59687f0();

    /* renamed from: g0 */
    T mo59688g0();
}
