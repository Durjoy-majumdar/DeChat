package r31;

import a41.C112756b;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k31.C117373a;
import m41.C117534a;
import q31.C118148a;
import s31.C118264c;
import u24.C90599h;
import u31.C118568a;
import v31.C118642b;
import v31.C118643c;
import x31.C118824a;

/* renamed from: r31.b */
public class C118219b {
    /* renamed from: a */
    public static C118218a m166774a(String str, Object obj) {
        C112756b c;
        Map map;
        C118642b bVar = null;
        if (C90599h.m113511d(str) || obj == null || (c = C117534a.m165780c(obj)) == null) {
            return null;
        }
        C118218a aVar = new C118218a();
        C118642b f = C118568a.m167239f(c, false);
        aVar.f353362a = String.valueOf(f == null ? 0 : f.f355006a);
        C118642b f2 = C118568a.m167239f(c, false);
        String str2 = "";
        if (f2 != null) {
            String str3 = f2.f355007b;
            if (str3 == null) {
                str3 = str2;
            }
            aVar.mo183011a("page_name", str3);
            aVar.mo183011a("biz_group_id", Integer.valueOf(f2.f355008c));
            aVar.mo183011a("page_stp", Integer.valueOf(f2.f355019n));
            if (!c.f337638f) {
                aVar.mo183011a("source_view_id", f2.f355022q);
            } else {
                C118264c cVar = C117373a.xx0().f351384j;
                if (cVar != null) {
                    C118642b f3 = C118568a.m167239f(cVar.f353458b, false);
                    aVar.mo183011a("source_view_id", f3 == null ? str2 : f3.f355022q);
                }
            }
            Map<String, Object> map2 = f2.f355009d;
            if (map2 != null && ((ConcurrentHashMap) map2).size() > 0) {
                aVar.mo183012b(f2.f355009d);
            }
            Map<String, Map<String, Object>> map3 = f2.f355012g;
            if (!(map3 == null || (map = (Map) ((ConcurrentHashMap) map3).get(str)) == null || map.size() <= 0)) {
                aVar.mo183012b(map);
            }
        }
        Map<String, Object> a = C118824a.m167528a(str, C118568a.m167239f(c, false));
        if (a != null && ((HashMap) a).size() > 0) {
            aVar.mo183012b(a);
        }
        C118642b f4 = C118568a.m167239f(c, false);
        C118642b bVar2 = f4 == null ? null : f4.f355010e;
        if (bVar2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("page_id", Integer.valueOf(bVar2.f355006a));
            hashMap.put("biz_group_id", Integer.valueOf(bVar2.f355008c));
            String str4 = bVar2.f355007b;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("page_name", str4);
            hashMap.put("page_stp", Integer.valueOf(bVar2.f355019n));
            hashMap.put("in_time", Long.valueOf(bVar2.f355020o));
            Map<String, Object> map4 = bVar2.f355009d;
            if (map4 != null && ((ConcurrentHashMap) map4).size() > 0) {
                hashMap.putAll(bVar2.f355009d);
            }
            Map<String, Object> a2 = C118824a.m167528a(str, bVar2);
            if (a2 != null && ((HashMap) a2).size() > 0) {
                hashMap.putAll(a2);
            }
            aVar.mo183011a("ref_page", hashMap);
        }
        C118642b f5 = C118568a.m167239f(c, false);
        if (f5 != null) {
            bVar = f5.f355011f;
        }
        if (bVar != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("page_id", Integer.valueOf(bVar.f355006a));
            hashMap2.put("biz_group_id", Integer.valueOf(bVar.f355008c));
            String str5 = bVar.f355007b;
            if (str5 != null) {
                str2 = str5;
            }
            hashMap2.put("page_name", str2);
            hashMap2.put("page_stp", Integer.valueOf(bVar.f355019n));
            hashMap2.put("in_time", Long.valueOf(bVar.f355021p));
            Map<String, Object> map5 = bVar.f355009d;
            if (map5 != null && ((ConcurrentHashMap) map5).size() > 0) {
                hashMap2.putAll(bVar.f355009d);
            }
            Map<String, Object> a3 = C118824a.m167528a(str, bVar);
            if (a3 != null && ((HashMap) a3).size() > 0) {
                hashMap2.putAll(a3);
            }
            aVar.mo183011a("source_page", hashMap2);
        }
        return aVar;
    }

    /* renamed from: b */
    public static List<C118218a> m166775b(String str, Object obj) {
        ArrayList<C118643c> arrayList;
        Map<String, Object> map;
        HashMap hashMap;
        List<C118148a> list;
        Map<String, Object> b;
        Object obj2;
        Map<String, Map<String, Object>> map2;
        if (!C90599h.m113511d(str) && obj != null && C117534a.m165789l(obj)) {
            if (obj instanceof View) {
                arrayList = new ArrayList<>();
                View view = (View) obj;
                for (int i = 0; i < 100; i++) {
                    C118643c g = C118568a.m167240g(view, false);
                    if (C118568a.m167243j(view)) {
                        arrayList.add(g);
                    }
                    Object a = C117534a.m165778a(view, g);
                    if (a == null || !(a instanceof View)) {
                        break;
                    }
                    view = (View) a;
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (C118643c cVar : arrayList) {
                    String str2 = cVar == null ? null : cVar.f355023a;
                    if (!C90599h.m113511d(str2)) {
                        C118218a aVar = new C118218a();
                        aVar.f353362a = str2;
                        if (cVar == null || (map = cVar.f355025c) == null) {
                            map = null;
                        }
                        if (map != null && ((ConcurrentHashMap) map).size() > 0) {
                            aVar.mo183012b(map);
                        }
                        Map map3 = (cVar == null || (map2 = cVar.f355026d) == null) ? null : (Map) ((ConcurrentHashMap) map2).get(str);
                        if (map3 != null && map3.size() > 0) {
                            aVar.mo183012b(map3);
                        }
                        if (cVar == null || (list = cVar.f355028f) == null || ((CopyOnWriteArrayList) list).size() <= 0) {
                            hashMap = null;
                        } else {
                            hashMap = new HashMap();
                            Iterator it = ((CopyOnWriteArrayList) cVar.f355028f).iterator();
                            while (it.hasNext()) {
                                C118148a aVar2 = (C118148a) it.next();
                                if (!(aVar2 == null || (b = aVar2.mo37b(str)) == null || b.size() <= 0)) {
                                    for (String next : b.keySet()) {
                                        if (!C90599h.m113511d(next) && (obj2 = b.get(next)) != null) {
                                            hashMap.put(next, obj2);
                                        }
                                    }
                                }
                            }
                        }
                        if (hashMap != null && hashMap.size() > 0) {
                            aVar.mo183012b(hashMap);
                        }
                        arrayList2.add(aVar);
                    }
                }
                return arrayList2;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r2 != false) goto L_0x0050;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a41.C112756b m166776c(java.lang.Object r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            a41.b r5 = m41.C117534a.m165780c(r5)
            k31.a r1 = k31.C117373a.xx0()
            s31.c r1 = r1.f351384j
            if (r1 == 0) goto L_0x004f
            if (r5 == 0) goto L_0x004f
            java.util.Map<a41.b, a41.b> r2 = r1.f353460d
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r2.next()
            a41.b r3 = (a41.C112756b) r3
            boolean r4 = r5.mo164512a(r3)
            if (r4 == 0) goto L_0x001e
            java.util.Map<a41.b, a41.b> r1 = r1.f353460d
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r3)
            a41.b r1 = (a41.C112756b) r1
            goto L_0x003c
        L_0x003b:
            r1 = r0
        L_0x003c:
            if (r1 == 0) goto L_0x004f
            r2 = 0
            v31.b r3 = u31.C118568a.m167239f(r1, r2)
            if (r3 != 0) goto L_0x0047
            r3 = 0
            goto L_0x0049
        L_0x0047:
            int r3 = r3.f355006a
        L_0x0049:
            if (r3 <= 0) goto L_0x004c
            r2 = 1
        L_0x004c:
            if (r2 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = r0
        L_0x0050:
            if (r5 == 0) goto L_0x0064
            t31.a r2 = t31.C118361a.m166983a()
            boolean r2 = r2.mo183164b(r5)
            if (r2 != 0) goto L_0x0064
            boolean r0 = r5.f337637e
            if (r0 == 0) goto L_0x0063
            if (r1 == 0) goto L_0x0063
            return r1
        L_0x0063:
            return r5
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r31.C118219b.m166776c(java.lang.Object):a41.b");
    }

    /* renamed from: d */
    public static C112756b m166777d(Object obj) {
        if (obj == null) {
            return null;
        }
        C112756b c = m166776c(obj);
        if (c != null) {
            return c;
        }
        C118264c cVar = C117373a.xx0().f351384j;
        if (cVar != null) {
            return cVar.f353458b;
        }
        return null;
    }
}
