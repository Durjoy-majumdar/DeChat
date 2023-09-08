package u31;

import a41.C112756b;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k41.C117389a;
import m41.C117535e;
import p31.C117924b;
import q31.C118148a;
import u24.C90599h;
import v31.C118641a;
import v31.C118642b;
import v31.C118643c;
import w31.C118723a;
import w31.C118724b;
import x31.C118825b;

/* renamed from: u31.a */
public class C118568a {

    /* renamed from: a */
    public static final C118724b f354847a = new C118724b();

    /* renamed from: b */
    public static final C118723a f354848b = new C118723a();

    /* renamed from: a */
    public static void m167234a(C112756b bVar) {
        if (bVar != null) {
            C118724b bVar2 = f354847a;
            bVar2.getClass();
            String str = bVar.f337636d + "_" + bVar.f337633a;
            if (!C90599h.m113511d(str) && ((ConcurrentHashMap) bVar2.f355246a).containsKey(str)) {
                C118642b bVar3 = (C118642b) ((ConcurrentHashMap) bVar2.f355246a).remove(str);
                if (bVar3 != null) {
                    ((CopyOnWriteArrayList) bVar3.f355013h).clear();
                    ((CopyOnWriteArrayList) bVar3.f355014i).clear();
                    bVar3.f355010e = null;
                    bVar3.f355011f = null;
                }
                Log.m105924i("Amoeba.PageDataEntityStorage", "[clear] page : " + bVar + ", mPageDataMap size : " + ((ConcurrentHashMap) bVar2.f355246a).size());
            }
        }
    }

    /* renamed from: b */
    public static Boolean m167235b(Object obj, String str) {
        if (obj == null || C90599h.m113511d(str)) {
            return Boolean.FALSE;
        }
        C118642b f = m167239f(obj, false);
        Object obj2 = (f == null || C90599h.m113511d(str)) ? null : ((ConcurrentHashMap) f.f355015j).get(str);
        return (obj2 == null || !(obj2 instanceof Boolean)) ? Boolean.FALSE : (Boolean) obj2;
    }

    /* renamed from: c */
    public static int m167236c(Object obj, String str) {
        Object a;
        if (obj == null || C90599h.m113511d(str) || (a = C118825b.m167529a(m167240g(obj, false), str)) == null || !(a instanceof Integer)) {
            return 0;
        }
        return ((Integer) a).intValue();
    }

    /* renamed from: d */
    public static C118641a m167237d(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        C118723a aVar = f354848b;
        C118641a aVar2 = (C118641a) ((WeakHashMap) aVar.f355245a).get(obj);
        if (aVar2 != null || !z) {
            return aVar2;
        }
        C118641a aVar3 = new C118641a();
        aVar.getClass();
        ((WeakHashMap) aVar.f355245a).put(obj, aVar3);
        return aVar3;
    }

    /* renamed from: e */
    public static Map<String, Object> m167238e(Object obj, String str) {
        Object obj2;
        HashMap hashMap = null;
        if (obj != null && !C90599h.m113511d(str)) {
            C118641a d = m167237d(obj, false);
            if (d == null) {
                return null;
            }
            List<C118148a> list = d.f355002c;
            if (list != null && ((CopyOnWriteArrayList) list).size() > 0) {
                hashMap = new HashMap();
                Iterator it = ((CopyOnWriteArrayList) d.f355002c).iterator();
                while (it.hasNext()) {
                    Map<String, Object> b = ((C118148a) it.next()).mo37b(str);
                    if (b != null && b.size() > 0) {
                        for (String next : b.keySet()) {
                            if (!C90599h.m113511d(next) && (obj2 = b.get(next)) != null) {
                                hashMap.put(next, obj2);
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    public static C118642b m167239f(Object obj, boolean z) {
        C118642b bVar = null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof C112756b)) {
            obj = new C112756b(obj);
        }
        C118724b bVar2 = f354847a;
        bVar2.getClass();
        if (obj instanceof C112756b) {
            C112756b bVar3 = (C112756b) obj;
            String str = bVar3.f337636d + "_" + bVar3.f337633a;
            if (!C90599h.m113511d(str)) {
                bVar = (C118642b) ((ConcurrentHashMap) bVar2.f355246a).get(str);
            }
        }
        if (bVar == null && z) {
            bVar = new C118642b();
            bVar2.getClass();
            if (obj instanceof C112756b) {
                C112756b bVar4 = (C112756b) obj;
                String str2 = bVar4.f337636d + "_" + bVar4.f337633a;
                if (!C90599h.m113511d(str2)) {
                    ((ConcurrentHashMap) bVar2.f355246a).put(str2, bVar);
                    Log.m105924i("Amoeba.PageDataEntityStorage", "[save] page : " + bVar4 + ", mPageDataMap size : " + ((ConcurrentHashMap) bVar2.f355246a).size());
                    int size = ((ConcurrentHashMap) bVar2.f355246a).size();
                    if (C117389a.m165527a() && size > C117389a.f351433b) {
                        C117389a.f351433b = size;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("1");
                        arrayList.add(String.valueOf(size));
                        C115669n.INSTANCE.mo160137l(24504, arrayList);
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: g */
    public static C118643c m167240g(Object obj, boolean z) {
        C118643c cVar = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof View) {
            try {
                Object tag = ((View) obj).getTag(C0966R.C0970id.l8d);
                if (tag instanceof C118643c) {
                    cVar = (C118643c) tag;
                }
            } catch (Throwable unused) {
            }
        }
        if (cVar == null && z) {
            cVar = new C118643c();
            if (obj instanceof View) {
                try {
                    ((View) obj).setTag(C0966R.C0970id.l8d, cVar);
                } catch (Throwable unused2) {
                }
            }
        }
        return cVar;
    }

    /* renamed from: h */
    public static long m167241h(Object obj) {
        Object a;
        if (obj == null || C90599h.m113511d("view_exp_min_time") || (a = C118825b.m167529a(m167240g(obj, false), "view_exp_min_time")) == null || !(a instanceof Long)) {
            return 0;
        }
        return ((Long) a).longValue();
    }

    /* renamed from: i */
    public static int m167242i(Object obj) {
        int i = 0;
        C118643c g = m167240g(obj, false);
        if (g != null) {
            for (Integer intValue : ((ConcurrentHashMap) g.f355030h).keySet()) {
                i |= intValue.intValue();
            }
        }
        return i;
    }

    /* renamed from: j */
    public static boolean m167243j(Object obj) {
        if (obj == null) {
            return false;
        }
        C118643c g = m167240g(obj, false);
        return !C90599h.m113511d(g == null ? null : g.f355023a);
    }

    /* renamed from: k */
    public static void m167244k(Object obj, int i, int i2, boolean z) {
        List<Integer> b;
        C118642b f = m167239f(obj, true);
        if (f != null && (b = C117535e.m165791b(i)) != null) {
            ArrayList arrayList = (ArrayList) b;
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    List list = (List) ((ConcurrentHashMap) f.f355016k).get(Integer.valueOf(intValue));
                    if (list == null) {
                        list = new ArrayList();
                        ((ConcurrentHashMap) f.f355016k).put(Integer.valueOf(intValue), list);
                    }
                    boolean z2 = false;
                    Iterator it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        C117924b bVar = (C117924b) it4.next();
                        if (bVar.f352463a == i2 && bVar.f352464b == z) {
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        C117924b bVar2 = new C117924b();
                        bVar2.f352463a = i2;
                        bVar2.f352464b = z;
                        list.add(bVar2);
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public static void m167245l(Object obj, String str) {
        if (obj != null && !C90599h.m113511d(str)) {
            if (C90599h.m113509b(str, "view_clk")) {
                C118825b.m167530b(m167240g(obj, true), "view_clk_count", Integer.valueOf(m167236c(obj, "view_clk_count") + 1));
            } else if (C90599h.m113509b(str, "view_exp")) {
                C118825b.m167530b(m167240g(obj, true), "view_exp_count", Integer.valueOf(m167236c(obj, "view_exp_count") + 1));
            } else if (C90599h.m113509b(str, "view_unexp")) {
                C118825b.m167530b(m167240g(obj, true), "view_unexp_count", Integer.valueOf(m167236c(obj, "view_unexp_count") + 1));
            }
        }
    }
}
