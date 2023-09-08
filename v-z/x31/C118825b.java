package x31;

import java.util.concurrent.ConcurrentHashMap;
import u24.C90599h;
import v31.C118643c;

/* renamed from: x31.b */
public class C118825b {
    /* renamed from: a */
    public static Object m167529a(C118643c cVar, String str) {
        if (cVar == null || C90599h.m113511d(str)) {
            return null;
        }
        return ((ConcurrentHashMap) cVar.f355029g).get(str);
    }

    /* renamed from: b */
    public static void m167530b(C118643c cVar, String str, Object obj) {
        if (cVar != null && !C90599h.m113511d(str)) {
            ((ConcurrentHashMap) cVar.f355029g).put(str, obj);
        }
    }
}
