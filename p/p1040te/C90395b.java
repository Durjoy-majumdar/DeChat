package p1040te;

import java.util.HashMap;
import java.util.Map;
import p1046ue.C90650d;

/* renamed from: te.b */
public class C90395b {

    /* renamed from: d */
    public static final C90395b f259404d = new C90395b();

    /* renamed from: a */
    public final Map<Long, Map<Integer, C90650d>> f259405a = new HashMap();

    /* renamed from: b */
    public final Map<Long, Map<Integer, C90650d>> f259406b = new HashMap();

    /* renamed from: c */
    public final Map<Long, C90650d> f259407c = new HashMap();

    /* renamed from: a */
    public final C90650d mo124608a(Map<Long, Map<Integer, C90650d>> map, long j, int i) {
        C90650d dVar;
        synchronized (map) {
            Map map2 = map.get(Long.valueOf(j));
            if (map2 == null) {
                map2 = new HashMap();
                map.put(Long.valueOf(j), map2);
            }
            dVar = (C90650d) map2.get(Integer.valueOf(i));
        }
        return dVar;
    }

    /* renamed from: b */
    public final void mo124609b(Map<Long, Map<Integer, C90650d>> map, int i, long j, C90650d dVar, C90650d.C90651a aVar) {
        synchronized (map) {
            Map map2 = map.get(Long.valueOf(j));
            if (map2 == null) {
                map2 = new HashMap();
                map.put(Long.valueOf(j), map2);
            }
            map2.put(Integer.valueOf(i), dVar);
        }
    }
}
