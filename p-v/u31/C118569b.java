package u31;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import v31.C118642b;
import v31.C118643c;

/* renamed from: u31.b */
public class C118569b {

    /* renamed from: a */
    public static Map<Object, C118642b> f354849a = new WeakHashMap();

    /* renamed from: b */
    public static Map<Object, C118643c> f354850b = new WeakHashMap();

    /* renamed from: c */
    public static Map<Object, WeakReference<Object>> f354851c = new WeakHashMap();

    /* renamed from: a */
    public static C118642b m167246a(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        C118642b bVar = (C118642b) ((WeakHashMap) f354849a).get(obj);
        if (bVar != null || !z) {
            return bVar;
        }
        C118642b bVar2 = new C118642b();
        ((WeakHashMap) f354849a).put(obj, bVar2);
        return bVar2;
    }

    /* renamed from: b */
    public static C118643c m167247b(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        C118643c cVar = (C118643c) ((WeakHashMap) f354850b).get(obj);
        if (cVar != null || !z) {
            return cVar;
        }
        C118643c cVar2 = new C118643c();
        ((WeakHashMap) f354850b).put(obj, cVar2);
        return cVar2;
    }
}
