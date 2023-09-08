package gy3;

import fy3.C24480c;
import fy3.C24481d;
import fy3.C24482e;
import fy3.C24483f;
import fy3.C24484g;
import fy3.C24485h;
import fy3.C24486i;
import fy3.C24487j;
import fy3.C24488k;
import fy3.C24489m;
import fy3.C24490n;
import fy3.C24491o;
import fy3.C24492v;
import fy3.C24493w;
import fy3.C32224a;
import fy3.C32225b;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import fy3.C32230s;
import fy3.C32231t;
import fy3.C32232u;
import hy3.C108274e;
import hy3.C108276f;
import hy3.C33145a;
import hy3.C60231b;
import hy3.C60233d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rx3.C36565b;

/* renamed from: gy3.k0 */
public class C24564k0 {
    /* renamed from: a */
    public static Collection m30737a(Object obj) {
        if (!(obj instanceof C33145a) || (obj instanceof C60231b)) {
            try {
                return (Collection) obj;
            } catch (ClassCastException e) {
                C87412m.m108599l(e, C24564k0.class.getName());
                throw e;
            }
        } else {
            m30746j(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    /* renamed from: b */
    public static List m30738b(Object obj) {
        if (!(obj instanceof C33145a) || (obj instanceof C60233d)) {
            try {
                return (List) obj;
            } catch (ClassCastException e) {
                C87412m.m108599l(e, C24564k0.class.getName());
                throw e;
            }
        } else {
            m30746j(obj, "kotlin.collections.MutableList");
            throw null;
        }
    }

    /* renamed from: c */
    public static Map m30739c(Object obj) {
        if (!(obj instanceof C33145a) || (obj instanceof C108274e)) {
            try {
                return (Map) obj;
            } catch (ClassCastException e) {
                C87412m.m108599l(e, C24564k0.class.getName());
                throw e;
            }
        } else {
            m30746j(obj, "kotlin.collections.MutableMap");
            throw null;
        }
    }

    /* renamed from: d */
    public static Set m30740d(Object obj) {
        if (!(obj instanceof C33145a) || (obj instanceof C108276f)) {
            try {
                return (Set) obj;
            } catch (ClassCastException e) {
                C87412m.m108599l(e, C24564k0.class.getName());
                throw e;
            }
        } else {
            m30746j(obj, "kotlin.collections.MutableSet");
            throw null;
        }
    }

    /* renamed from: e */
    public static Object m30741e(Object obj, int i) {
        if (obj == null || m30742f(obj, i)) {
            return obj;
        }
        m30746j(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* renamed from: f */
    public static boolean m30742f(Object obj, int i) {
        if (obj instanceof C36565b) {
            if ((obj instanceof C24562j ? ((C24562j) obj).getArity() : obj instanceof C32224a ? 0 : obj instanceof C32226l ? 1 : obj instanceof C32227p ? 2 : obj instanceof C32228q ? 3 : obj instanceof C32229r ? 4 : obj instanceof C32230s ? 5 : obj instanceof C32231t ? 6 : obj instanceof C32232u ? 7 : obj instanceof C24492v ? 8 : obj instanceof C24493w ? 9 : obj instanceof C32225b ? 10 : obj instanceof C24480c ? 11 : obj instanceof C24481d ? 12 : obj instanceof C24482e ? 13 : obj instanceof C24483f ? 14 : obj instanceof C24484g ? 15 : obj instanceof C24485h ? 16 : obj instanceof C24486i ? 17 : obj instanceof C24487j ? 18 : obj instanceof C24488k ? 19 : obj instanceof C24489m ? 20 : obj instanceof C24490n ? 21 : obj instanceof C24491o ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m30743g(Object obj) {
        return (obj instanceof List) && (!(obj instanceof C33145a) || (obj instanceof C60233d));
    }

    /* renamed from: h */
    public static boolean m30744h(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof C33145a) || (obj instanceof C108274e));
    }

    /* renamed from: i */
    public static boolean m30745i(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof C33145a) || (obj instanceof C108276f));
    }

    /* renamed from: j */
    public static void m30746j(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + str);
        C87412m.m108599l(classCastException, C24564k0.class.getName());
        throw classCastException;
    }
}
