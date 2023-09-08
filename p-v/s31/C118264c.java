package s31;

import a41.C112756b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import r31.C118219b;
import u24.C90599h;
import u31.C118568a;
import v31.C118642b;

/* renamed from: s31.c */
public class C118264c {

    /* renamed from: a */
    public C112756b f353457a;

    /* renamed from: b */
    public C112756b f353458b;

    /* renamed from: c */
    public Map<C112756b, List<C112756b>> f353459c = new ConcurrentHashMap();

    /* renamed from: d */
    public Map<C112756b, C112756b> f353460d = new ConcurrentHashMap();

    /* renamed from: e */
    public int f353461e = 0;

    /* renamed from: f */
    public String f353462f;

    /* renamed from: g */
    public String f353463g;

    /* renamed from: h */
    public String f353464h;

    /* renamed from: i */
    public String f353465i;

    /* renamed from: j */
    public Map<C112756b, String> f353466j = new ConcurrentHashMap();

    /* renamed from: k */
    public List<String> f353467k = new CopyOnWriteArrayList();

    /* renamed from: l */
    public Map<C112756b, Map<String, Object>> f353468l = new ConcurrentHashMap();

    /* renamed from: m */
    public C112756b f353469m = null;

    /* renamed from: n */
    public Map<C112756b, Map<String, Object>> f353470n = new ConcurrentHashMap();

    /* renamed from: o */
    public Map<C112756b, Map<String, Object>> f353471o = new ConcurrentHashMap();

    /* renamed from: p */
    public Map<C112756b, Map<String, Object>> f353472p = new ConcurrentHashMap();

    /* renamed from: a */
    public void mo183045a(C112756b bVar) {
        if (bVar != null) {
            Iterator it = ((ConcurrentHashMap) this.f353470n).keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C112756b bVar2 = (C112756b) it.next();
                if (bVar.mo164512a(bVar2)) {
                    ((ConcurrentHashMap) this.f353470n).remove(bVar2);
                    break;
                }
            }
            Iterator it4 = ((ConcurrentHashMap) this.f353468l).keySet().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C112756b bVar3 = (C112756b) it4.next();
                if (bVar.mo164512a(bVar3)) {
                    ((ConcurrentHashMap) this.f353468l).remove(bVar3);
                    break;
                }
            }
            Iterator it5 = ((ConcurrentHashMap) this.f353471o).keySet().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                C112756b bVar4 = (C112756b) it5.next();
                if (bVar.mo164512a(bVar4)) {
                    ((ConcurrentHashMap) this.f353471o).remove(bVar4);
                    break;
                }
            }
            Iterator it6 = ((ConcurrentHashMap) this.f353472p).keySet().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                C112756b bVar5 = (C112756b) it6.next();
                if (bVar.mo164512a(bVar5)) {
                    ((ConcurrentHashMap) this.f353472p).remove(bVar5);
                    break;
                }
            }
            Iterator it7 = ((ConcurrentHashMap) this.f353459c).keySet().iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                C112756b bVar6 = (C112756b) it7.next();
                if (bVar.mo164512a(bVar6)) {
                    ((ConcurrentHashMap) this.f353459c).remove(bVar6);
                    break;
                }
            }
            for (C112756b bVar7 : ((ConcurrentHashMap) this.f353460d).keySet()) {
                if (bVar.mo164512a(bVar7)) {
                    ((ConcurrentHashMap) this.f353460d).remove(bVar7);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public Map<String, Object> mo183046b(C112756b bVar) {
        if (bVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = ((ConcurrentHashMap) this.f353471o).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C112756b bVar2 = (C112756b) it.next();
            if (bVar.mo164512a(bVar2)) {
                Map map = (Map) ((ConcurrentHashMap) this.f353471o).get(bVar2);
                if (map != null && map.size() > 0) {
                    hashMap.putAll(map);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public Map<String, Object> mo183047c(C112756b bVar) {
        if (bVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = ((ConcurrentHashMap) this.f353472p).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C112756b bVar2 = (C112756b) it.next();
            if (bVar.mo164512a(bVar2)) {
                Map map = (Map) ((ConcurrentHashMap) this.f353472p).get(bVar2);
                if (map != null && map.size() > 0) {
                    hashMap.putAll(map);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public List<C112756b> mo183048d(C112756b bVar) {
        List list;
        if (bVar == null) {
            return null;
        }
        for (C112756b bVar2 : ((ConcurrentHashMap) this.f353459c).keySet()) {
            if (bVar.mo164512a(bVar2) && (list = (List) ((ConcurrentHashMap) this.f353459c).get(bVar2)) != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo183049e(C112756b bVar, Map<String, Object> map) {
        if (bVar != null && map != null && map.size() > 0) {
            Map map2 = null;
            Iterator it = ((ConcurrentHashMap) this.f353468l).keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C112756b bVar2 = (C112756b) it.next();
                if (bVar.mo164512a(bVar2)) {
                    map2 = (Map) ((ConcurrentHashMap) this.f353468l).get(bVar2);
                    break;
                }
            }
            if (map2 == null) {
                map2 = new HashMap();
                ((ConcurrentHashMap) this.f353468l).put(bVar, map2);
            }
            map2.putAll(map);
        }
    }

    /* renamed from: f */
    public final void mo183050f(C112756b bVar, String str) {
        C118642b f;
        if (bVar != null && !C90599h.m113511d(str)) {
            int i = this.f353461e;
            C118642b f2 = C118568a.m167239f(bVar, true);
            if (f2 != null) {
                f2.f355019n = i;
            }
            C118642b bVar2 = null;
            if (!bVar.f337638f) {
                C112756b c = C118219b.m166776c(this.f353458b);
                if (c != null) {
                    bVar2 = C118568a.m167239f(c, false);
                }
            } else {
                C118642b f3 = C118568a.m167239f(this.f353458b, false);
                if (f3 != null) {
                    bVar2 = f3.f355010e;
                }
            }
            if (bVar2 != null) {
                C118642b f4 = C118568a.m167239f(bVar, true);
                if (f4 != null) {
                    f4.f355010e = bVar2;
                }
                if (C90599h.m113509b(str, "session_in") && (f = C118568a.m167239f(bVar, true)) != null) {
                    f.f355011f = bVar2;
                }
            }
        }
    }
}
