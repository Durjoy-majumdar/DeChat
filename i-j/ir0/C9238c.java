package ir0;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ir0.c */
public final class C9238c {

    /* renamed from: a */
    public static final Map<Integer, C9236a> f28976a = new HashMap();

    /* renamed from: a */
    public static void m8884a(int i) {
        Map<Integer, C9236a> map = f28976a;
        if (((HashMap) map).containsKey(Integer.valueOf(i))) {
            C9236a aVar = (C9236a) ((HashMap) map).get(Integer.valueOf(i));
            if (aVar != null) {
                aVar.clear();
            }
        }
    }
}
