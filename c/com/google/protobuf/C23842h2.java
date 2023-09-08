package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.h2 */
public final class C23842h2 {

    /* renamed from: a */
    public static final Class<?> f68331a;

    /* renamed from: b */
    public static final C23937r2<?, ?> f68332b = m28883C(false);

    /* renamed from: c */
    public static final C23937r2<?, ?> f68333c = m28883C(true);

    /* renamed from: d */
    public static final C23937r2<?, ?> f68334d = new C24050u2();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.m0");
        } catch (Throwable unused) {
            cls = null;
        }
        f68331a = cls;
    }

    /* renamed from: A */
    public static <UT, UB> UB m28881A(int i, List<Integer> list, C23908o0.C23913e eVar, UB ub, C23937r2<UT, UB> r2Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m28885E(i, intValue, ub, r2Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.isInRange(intValue2)) {
                    ub = m28885E(i, intValue2, ub, r2Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    public static Object m28882B(Class<?> cls, String str) {
        try {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if ('a' > charAt || charAt > 'z') {
                    if ('A' > charAt || charAt > 'Z') {
                        if ('0' <= charAt && charAt <= '9') {
                            sb.append(charAt);
                        }
                        z = true;
                    } else if (i != 0 || z) {
                        sb.append(charAt);
                    } else {
                        sb.append((char) (charAt + ' '));
                    }
                } else if (z) {
                    sb.append((char) (charAt - ' '));
                } else {
                    sb.append(charAt);
                }
                z = false;
            }
            String sb4 = sb.toString();
            StringBuilder sb5 = new StringBuilder(name.length() + 19 + String.valueOf(sb4).length());
            sb5.append(name);
            sb5.append("$");
            sb5.append(sb4);
            sb5.append("DefaultEntryHolder");
            Field[] declaredFields = Class.forName(sb5.toString()).getDeclaredFields();
            if (declaredFields.length == 1) {
                return C24065x2.f69191d.mo38408l(declaredFields[0]);
            }
            String name2 = cls.getName();
            StringBuilder sb6 = new StringBuilder(str.length() + 63 + name2.length());
            sb6.append("Unable to look up map field default entry holder class for ");
            sb6.append(str);
            sb6.append(" in ");
            sb6.append(name2);
            throw new IllegalStateException(sb6.toString());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: C */
    public static C23937r2<?, ?> m28883C(boolean z) {
        Class<C24059v2> cls = C24059v2.class;
        if (cls == null) {
            return null;
        }
        try {
            return cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static boolean m28884D(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: E */
    public static <UT, UB> UB m28885E(int i, int i2, UB ub, C23937r2<UT, UB> r2Var) {
        if (ub == null) {
            ub = r2Var.mo38039m();
        }
        r2Var.mo38031e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: F */
    public static void m28886F(int i, List<Boolean> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).booleanValue();
                    Logger logger = C23897n.f68486b;
                    i3++;
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    oVar.f68504a.mo37896C(list.get(i2).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                oVar.f68504a.mo37897D(i, list.get(i2).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: G */
    public static void m28887G(int i, List<C16994k> list, C23809a3 a3Var) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            oVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                oVar.f68504a.mo37899F(i, list.get(i2));
            }
        }
    }

    /* renamed from: H */
    public static void m28888H(int i, List<Double> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).doubleValue();
                    Logger logger = C23897n.f68486b;
                    i3 += 8;
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    C23897n nVar = oVar.f68504a;
                    double doubleValue = list.get(i2).doubleValue();
                    nVar.getClass();
                    nVar.mo37905L(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                oVar.f68504a.mo37901H(i, list.get(i2).doubleValue());
                i2++;
            }
        }
    }

    /* renamed from: I */
    public static void m28889I(int i, List<Integer> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C23897n.m29267l(list.get(i4).intValue());
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    oVar.f68504a.mo37908O(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                oVar.f68504a.mo37907N(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: J */
    public static void m28890J(int i, List<Integer> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((C23907o) a3Var).mo37960h(i, list, z);
        }
    }

    /* renamed from: K */
    public static void m28891K(int i, List<Long> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((C23907o) a3Var).mo37962j(i, list, z);
        }
    }

    /* renamed from: L */
    public static void m28892L(int i, List<Float> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).floatValue();
                    Logger logger = C23897n.f68486b;
                    i3 += 4;
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    C23897n nVar = oVar.f68504a;
                    float floatValue = list.get(i2).floatValue();
                    nVar.getClass();
                    nVar.mo37903J(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                oVar.f68504a.mo37906M(i, list.get(i2).floatValue());
                i2++;
            }
        }
    }

    /* renamed from: M */
    public static void m28893M(int i, List<?> list, C23809a3 a3Var, C23828f2 f2Var) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            oVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                oVar.mo37964l(i, list.get(i2), f2Var);
            }
        }
    }

    /* renamed from: N */
    public static void m28894N(int i, List<Integer> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C23897n.m29267l(list.get(i4).intValue());
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    oVar.f68504a.mo37908O(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                oVar.f68504a.mo37907N(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: O */
    public static void m28895O(int i, List<Long> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((C23907o) a3Var).mo37967o(i, list, z);
        }
    }

    /* renamed from: P */
    public static void m28896P(int i, List<?> list, C23809a3 a3Var, C23828f2 f2Var) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            oVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                oVar.mo37968p(i, list.get(i2), f2Var);
            }
        }
    }

    /* renamed from: Q */
    public static void m28897Q(int i, List<Integer> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    Logger logger = C23897n.f68486b;
                    i3 += 4;
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    oVar.f68504a.mo37903J(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                oVar.f68504a.mo37902I(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: R */
    public static void m28898R(int i, List<Long> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    Logger logger = C23897n.f68486b;
                    i3 += 8;
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    oVar.f68504a.mo37905L(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                oVar.f68504a.mo37904K(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: S */
    public static void m28899S(int i, List<Integer> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = list.get(i4).intValue();
                    i3 += C23897n.m29279x((intValue >> 31) ^ (intValue << 1));
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    C23897n nVar = oVar.f68504a;
                    int intValue2 = list.get(i2).intValue();
                    nVar.mo37918Y((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                C23897n nVar2 = oVar.f68504a;
                int intValue3 = list.get(i2).intValue();
                nVar2.mo37917X(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: T */
    public static void m28900T(int i, List<Long> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = list.get(i4).longValue();
                    i3 += C23897n.m29281z((longValue >> 63) ^ (longValue << 1));
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    C23897n nVar = oVar.f68504a;
                    long longValue2 = list.get(i2).longValue();
                    nVar.mo37920a0((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                C23897n nVar2 = oVar.f68504a;
                long longValue3 = list.get(i2).longValue();
                nVar2.mo37919Z(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: U */
    public static void m28901U(int i, List<String> list, C23809a3 a3Var) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            oVar.getClass();
            int i2 = 0;
            if (list instanceof C24048u0) {
                C24048u0 u0Var = (C24048u0) list;
                while (i2 < list.size()) {
                    Object raw = u0Var.getRaw(i2);
                    if (raw instanceof String) {
                        oVar.f68504a.mo37914U(i, (String) raw);
                    } else {
                        oVar.f68504a.mo37899F(i, (C16994k) raw);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                oVar.f68504a.mo37914U(i, list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: V */
    public static void m28902V(int i, List<Integer> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C23897n.m29279x(list.get(i4).intValue());
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    oVar.f68504a.mo37918Y(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                oVar.f68504a.mo37917X(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: W */
    public static void m28903W(int i, List<Long> list, C23809a3 a3Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C23907o oVar = (C23907o) a3Var;
            int i2 = 0;
            if (z) {
                oVar.f68504a.mo37916W(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C23897n.m29281z(list.get(i4).longValue());
                }
                oVar.f68504a.mo37918Y(i3);
                while (i2 < list.size()) {
                    oVar.f68504a.mo37920a0(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            oVar.getClass();
            while (i2 < list.size()) {
                oVar.f68504a.mo37919Z(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m28904a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? C23897n.m29277v(i) + C23897n.m29279x(size) + size : size * C23897n.m29257b(i, true);
    }

    /* renamed from: b */
    public static int m28905b(List<?> list) {
        return list.size();
    }

    /* renamed from: c */
    public static int m28906c(int i, List<C16994k> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v = size * C23897n.m29277v(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            v += C23897n.m29259d(list.get(i2));
        }
        return v;
    }

    /* renamed from: d */
    public static int m28907d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m28908e(list);
        return z ? C23897n.m29277v(i) + C23897n.m29279x(e) + e : e + (size * C23897n.m29277v(i));
    }

    /* renamed from: e */
    public static int m28908e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C23901n0) {
            C23901n0 n0Var = (C23901n0) list;
            i = 0;
            while (i2 < size) {
                i += C23897n.m29267l(n0Var.mo37936k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C23897n.m29267l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static int m28909f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return size * C23897n.m29262g(i, 0);
        }
        int i2 = size * 4;
        return C23897n.m29277v(i) + C23897n.m29279x(i2) + i2;
    }

    /* renamed from: g */
    public static int m28910g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m28911h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return size * C23897n.m29263h(i, 0);
        }
        int i2 = size * 8;
        return C23897n.m29277v(i) + C23897n.m29279x(i2) + i2;
    }

    /* renamed from: i */
    public static int m28912i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m28913j(int i, List<C23845j1> list, C23828f2 f2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C23897n.m29265j(i, list.get(i3), f2Var);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m28914k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = m28915l(list);
        return z ? C23897n.m29277v(i) + C23897n.m29279x(l) + l : l + (size * C23897n.m29277v(i));
    }

    /* renamed from: l */
    public static int m28915l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C23901n0) {
            C23901n0 n0Var = (C23901n0) list;
            i = 0;
            while (i2 < size) {
                i += C23897n.m29267l(n0Var.mo37936k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C23897n.m29267l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m28916m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = m28917n(list);
        return z ? C23897n.m29277v(i) + C23897n.m29279x(n) + n : n + (list.size() * C23897n.m29277v(i));
    }

    /* renamed from: n */
    public static int m28917n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C24061w0) {
            C24061w0 w0Var = (C24061w0) list;
            i = 0;
            while (i2 < size) {
                i += C23897n.m29281z(w0Var.mo38395k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C23897n.m29281z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m28918o(int i, Object obj, C23828f2 f2Var) {
        if (obj instanceof C24018s0) {
            return C23897n.m29277v(i) + C23897n.m29269n((C24018s0) obj);
        }
        int v = C23897n.m29277v(i);
        int serializedSize = ((C23810b) ((C23845j1) obj)).getSerializedSize(f2Var);
        return v + C23897n.m29279x(serializedSize) + serializedSize;
    }

    /* renamed from: p */
    public static int m28919p(int i, List<?> list, C23828f2 f2Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v = C23897n.m29277v(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C24018s0) {
                i2 = C23897n.m29269n((C24018s0) obj);
            } else {
                int serializedSize = ((C23810b) ((C23845j1) obj)).getSerializedSize(f2Var);
                i2 = serializedSize + C23897n.m29279x(serializedSize);
            }
            v += i2;
        }
        return v;
    }

    /* renamed from: q */
    public static int m28920q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = m28921r(list);
        return z ? C23897n.m29277v(i) + C23897n.m29279x(r) + r : r + (size * C23897n.m29277v(i));
    }

    /* renamed from: r */
    public static int m28921r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C23901n0) {
            C23901n0 n0Var = (C23901n0) list;
            i = 0;
            while (i2 < size) {
                int k = n0Var.mo37936k(i2);
                i += C23897n.m29279x((k >> 31) ^ (k << 1));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C23897n.m29279x((intValue >> 31) ^ (intValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m28922s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m28923t(list);
        return z ? C23897n.m29277v(i) + C23897n.m29279x(t) + t : t + (size * C23897n.m29277v(i));
    }

    /* renamed from: t */
    public static int m28923t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C24061w0) {
            C24061w0 w0Var = (C24061w0) list;
            i = 0;
            while (i2 < size) {
                long k = w0Var.mo38395k(i2);
                i += C23897n.m29281z((k >> 63) ^ (k << 1));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C23897n.m29281z((longValue >> 63) ^ (longValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m28924u(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int v = C23897n.m29277v(i) * size;
        if (list instanceof C24048u0) {
            C24048u0 u0Var = (C24048u0) list;
            while (i2 < size) {
                Object raw = u0Var.getRaw(i2);
                v += raw instanceof C16994k ? C23897n.m29259d((C16994k) raw) : C23897n.m29276u((String) raw);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                v += obj instanceof C16994k ? C23897n.m29259d((C16994k) obj) : C23897n.m29276u((String) obj);
                i2++;
            }
        }
        return v;
    }

    /* renamed from: v */
    public static int m28925v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = m28926w(list);
        return z ? C23897n.m29277v(i) + C23897n.m29279x(w) + w : w + (size * C23897n.m29277v(i));
    }

    /* renamed from: w */
    public static int m28926w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C23901n0) {
            C23901n0 n0Var = (C23901n0) list;
            i = 0;
            while (i2 < size) {
                i += C23897n.m29279x(n0Var.mo37936k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C23897n.m29279x(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m28927x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m28928y(list);
        return z ? C23897n.m29277v(i) + C23897n.m29279x(y) + y : y + (size * C23897n.m29277v(i));
    }

    /* renamed from: y */
    public static int m28928y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C24061w0) {
            C24061w0 w0Var = (C24061w0) list;
            i = 0;
            while (i2 < size) {
                i += C23897n.m29281z(w0Var.mo38395k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C23897n.m29281z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static <UT, UB> UB m28929z(int i, List<Integer> list, C23908o0.C23912d<?> dVar, UB ub, C23937r2<UT, UB> r2Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m28885E(i, intValue, ub, r2Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.findValueByNumber(intValue2) == null) {
                    ub = m28885E(i, intValue2, ub, r2Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
