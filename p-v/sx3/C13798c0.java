package sx3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sx3.c0 */
public class C13798c0 extends C64176b0 {
    /* renamed from: z */
    public static final <R> List<R> m13102z(Iterable<?> iterable, Class<R> cls) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(cls, "klass");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (cls.isInstance(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
