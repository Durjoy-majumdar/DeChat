package bs3;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bs3.a */
public class C0377a {
    /* renamed from: a */
    public static <E> Map<E, E> m322a(E... eArr) {
        if (eArr.length % 2 == 0) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < eArr.length; i += 2) {
                hashMap.put(eArr[i], eArr[i + 1]);
            }
            return hashMap;
        }
        throw new IllegalArgumentException("length of map is " + eArr.length);
    }
}
