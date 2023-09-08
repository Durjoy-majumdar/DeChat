package com.google.protobuf;

import com.google.protobuf.C23832g0.C23835c;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C23932r0;
import com.google.protobuf.C24087z2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.g0 */
public final class C23832g0<T extends C23835c<T>> {

    /* renamed from: d */
    public static final C23832g0 f68258d;

    /* renamed from: a */
    public final C23849k2<T, Object> f68259a;

    /* renamed from: b */
    public boolean f68260b;

    /* renamed from: c */
    public boolean f68261c;

    /* renamed from: com.google.protobuf.g0$b */
    public static final class C23834b<T extends C23835c<T>> {

        /* renamed from: a */
        public C23849k2<T, Object> f68262a = new C23847j2(16);

        /* renamed from: b */
        public boolean f68263b;

        /* renamed from: c */
        public boolean f68264c = true;

        /* renamed from: d */
        public boolean f68265d;

        public C23834b(C23833a aVar) {
            int i = C23849k2.f68342j;
        }

        /* renamed from: f */
        public static <T extends C23835c<T>> Object m28857f(T t, Object obj) {
            if (obj == null || t.mo37664Q() != C24087z2.C24094c.MESSAGE) {
                return obj;
            }
            if (!t.mo37662E0()) {
                return obj instanceof C23845j1.C23846a ? ((C23845j1.C23846a) obj).build() : obj;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    Object obj2 = list.get(i);
                    Object build = obj2 instanceof C23845j1.C23846a ? ((C23845j1.C23846a) obj2).build() : obj2;
                    if (build != obj2) {
                        if (list == obj) {
                            list = new ArrayList(list);
                        }
                        list.set(i, build);
                    }
                }
                return list;
            }
            String valueOf = String.valueOf(obj.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 66);
            sb.append("Repeated field should contains a List but actually contains type: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: g */
        public static <T extends C23835c<T>> void m28858g(C23849k2<T, Object> k2Var) {
            for (int i = 0; i < k2Var.mo37720e(); i++) {
                Map.Entry<T, Object> c = k2Var.mo37717c(i);
                c.setValue(m28857f((C23835c) c.getKey(), c.getValue()));
            }
            for (Map.Entry next : k2Var.mo37723f()) {
                next.setValue(m28857f((C23835c) next.getKey(), next.getValue()));
            }
        }

        /* renamed from: j */
        public static void m28859j(C24087z2.C24089b bVar, Object obj) {
            if (C23832g0.m28837s(bVar, obj)) {
                return;
            }
            if (bVar.f69233d != C24087z2.C24094c.MESSAGE || !(obj instanceof C23845j1.C23846a)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }

        /* renamed from: a */
        public final void mo37655a() {
            if (!this.f68264c) {
                this.f68262a = C23832g0.m28830d(this.f68262a, true);
                this.f68264c = true;
            }
        }

        /* renamed from: b */
        public Object mo37656b(T t) {
            return m28857f(t, mo37657c(t));
        }

        /* renamed from: c */
        public Object mo37657c(T t) {
            Object obj = this.f68262a.get(t);
            return obj instanceof C23932r0 ? ((C23932r0) obj).mo38016c() : obj;
        }

        /* renamed from: d */
        public Object mo37658d(T t, int i) {
            if (t.mo37662E0()) {
                Object c = mo37657c(t);
                if (c != null) {
                    return ((List) c).get(i);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: e */
        public final void mo37659e(Map.Entry<T, Object> entry) {
            C23835c cVar = (C23835c) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof C23932r0) {
                value = ((C23932r0) value).mo38016c();
            }
            if (cVar.mo37662E0()) {
                Object b = mo37656b(cVar);
                if (b == null) {
                    b = new ArrayList();
                }
                for (Object f : (List) value) {
                    ((List) b).add(C23832g0.m28832f(f));
                }
                this.f68262a.put(cVar, b);
            } else if (cVar.mo37664Q() == C24087z2.C24094c.MESSAGE) {
                Object b2 = mo37656b(cVar);
                if (b2 == null) {
                    this.f68262a.put(cVar, C23832g0.m28832f(value));
                } else if (b2 instanceof C23845j1.C23846a) {
                    cVar.mo37665S1((C23845j1.C23846a) b2, (C23845j1) value);
                } else {
                    this.f68262a.put(cVar, cVar.mo37665S1(((C23845j1) b2).toBuilder(), (C23845j1) value).build());
                }
            } else {
                this.f68262a.put(cVar, C23832g0.m28832f(value));
            }
        }

        /* renamed from: h */
        public void mo37660h(T t, Object obj) {
            mo37655a();
            boolean z = false;
            if (!t.mo37662E0()) {
                m28859j(t.mo37663O(), obj);
            } else if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    m28859j(t.mo37663O(), next);
                    this.f68265d = this.f68265d || (next instanceof C23845j1.C23846a);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (obj instanceof C23932r0) {
                this.f68263b = true;
            }
            if (this.f68265d || (obj instanceof C23845j1.C23846a)) {
                z = true;
            }
            this.f68265d = z;
            this.f68262a.put(t, obj);
        }

        /* renamed from: i */
        public void mo37661i(T t, int i, Object obj) {
            mo37655a();
            if (t.mo37662E0()) {
                this.f68265d = this.f68265d || (obj instanceof C23845j1.C23846a);
                Object b = mo37656b(t);
                if (b != null) {
                    m28859j(t.mo37663O(), obj);
                    ((List) b).set(i, obj);
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    /* renamed from: com.google.protobuf.g0$c */
    public interface C23835c<T extends C23835c<T>> extends Comparable<T> {
        /* renamed from: E0 */
        boolean mo37662E0();

        /* renamed from: O */
        C24087z2.C24089b mo37663O();

        /* renamed from: Q */
        C24087z2.C24094c mo37664Q();

        /* renamed from: S1 */
        C23845j1.C23846a mo37665S1(C23845j1.C23846a aVar, C23845j1 j1Var);

        /* renamed from: T0 */
        boolean mo37666T0();

        int getNumber();
    }

    static {
        int i = C23849k2.f68342j;
        C23832g0 g0Var = new C23832g0(new C23847j2(0));
        g0Var.mo37651u();
        f68258d = g0Var;
    }

    public C23832g0() {
        int i = C23849k2.f68342j;
        this.f68259a = new C23847j2(16);
    }

    /* renamed from: A */
    public static void m28829A(C23835c<?> cVar, Object obj, C23897n nVar) {
        C24087z2.C24089b O = cVar.mo37663O();
        int number = cVar.getNumber();
        if (cVar.mo37662E0()) {
            List<Object> list = (List) obj;
            if (cVar.mo37666T0()) {
                nVar.mo37916W(number, 2);
                int i = 0;
                for (Object h : list) {
                    i += m28834h(O, h);
                }
                nVar.mo37918Y(i);
                for (Object z : list) {
                    m28839z(nVar, O, z);
                }
                return;
            }
            for (Object y : list) {
                m28838y(nVar, O, number, y);
            }
        } else if (obj instanceof C23932r0) {
            m28838y(nVar, O, number, ((C23932r0) obj).mo38016c());
        } else {
            m28838y(nVar, O, number, obj);
        }
    }

    /* renamed from: d */
    public static <T extends C23835c<T>> C23849k2<T, Object> m28830d(C23849k2<T, Object> k2Var, boolean z) {
        int i = C23849k2.f68342j;
        C23847j2 j2Var = new C23847j2(16);
        for (int i2 = 0; i2 < k2Var.mo37720e(); i2++) {
            m28831e(j2Var, k2Var.mo37717c(i2), z);
        }
        for (Map.Entry<T, Object> e : k2Var.mo37723f()) {
            m28831e(j2Var, e, z);
        }
        return j2Var;
    }

    /* renamed from: e */
    public static <T extends C23835c<T>> void m28831e(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z) {
        C23835c cVar = (C23835c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C23932r0) {
            map.put(cVar, ((C23932r0) value).mo38016c());
        } else if (!z || !(value instanceof List)) {
            map.put(cVar, value);
        } else {
            map.put(cVar, new ArrayList((List) value));
        }
    }

    /* renamed from: f */
    public static Object m28832f(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: g */
    public static int m28833g(C24087z2.C24089b bVar, int i, Object obj) {
        int v = C23897n.m29277v(i);
        if (bVar == C24087z2.C24089b.GROUP) {
            v *= 2;
        }
        return v + m28834h(bVar, obj);
    }

    /* renamed from: h */
    public static int m28834h(C24087z2.C24089b bVar, Object obj) {
        switch (bVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = C23897n.f68486b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = C23897n.f68486b;
                return 4;
            case 2:
                return C23897n.m29281z(((Long) obj).longValue());
            case 3:
                return C23897n.m29281z(((Long) obj).longValue());
            case 4:
                return C23897n.m29267l(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = C23897n.f68486b;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = C23897n.f68486b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = C23897n.f68486b;
                return 1;
            case 8:
                return obj instanceof C16994k ? C23897n.m29259d((C16994k) obj) : C23897n.m29276u((String) obj);
            case 9:
                Logger logger6 = C23897n.f68486b;
                return ((C23845j1) obj).getSerializedSize();
            case 10:
                if (obj instanceof C23932r0) {
                    return C23897n.m29269n((C23932r0) obj);
                }
                Logger logger7 = C23897n.f68486b;
                int serializedSize = ((C23845j1) obj).getSerializedSize();
                return C23897n.m29279x(serializedSize) + serializedSize;
            case 11:
                if (obj instanceof C16994k) {
                    return C23897n.m29259d((C16994k) obj);
                }
                Logger logger8 = C23897n.f68486b;
                int length = ((byte[]) obj).length;
                return C23897n.m29279x(length) + length;
            case 12:
                return C23897n.m29279x(((Integer) obj).intValue());
            case 13:
                return obj instanceof C23908o0.C23911c ? C23897n.m29267l(((C23908o0.C23911c) obj).getNumber()) : C23897n.m29267l(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger9 = C23897n.f68486b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger10 = C23897n.f68486b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return C23897n.m29279x((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return C23897n.m29281z((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: i */
    public static int m28835i(C23835c<?> cVar, Object obj) {
        C24087z2.C24089b O = cVar.mo37663O();
        int number = cVar.getNumber();
        if (!cVar.mo37662E0()) {
            return m28833g(O, number, obj);
        }
        int i = 0;
        if (cVar.mo37666T0()) {
            for (Object h : (List) obj) {
                i += m28834h(O, h);
            }
            return C23897n.m29277v(number) + i + C23897n.m29279x(i);
        }
        for (Object g : (List) obj) {
            i += m28833g(O, number, g);
        }
        return i;
    }

    /* renamed from: r */
    public static <T extends C23835c<T>> boolean m28836r(Map.Entry<T, Object> entry) {
        C23835c cVar = (C23835c) entry.getKey();
        if (cVar.mo37664Q() == C24087z2.C24094c.MESSAGE) {
            if (cVar.mo37662E0()) {
                for (C23845j1 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C23845j1) {
                    if (!((C23845j1) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C23932r0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    public static boolean m28837s(C24087z2.C24089b bVar, Object obj) {
        Charset charset = C23908o0.f68505a;
        obj.getClass();
        switch (bVar.f69233d.ordinal()) {
            case 0:
                return obj instanceof Integer;
            case 1:
                return obj instanceof Long;
            case 2:
                return obj instanceof Float;
            case 3:
                return obj instanceof Double;
            case 4:
                return obj instanceof Boolean;
            case 5:
                return obj instanceof String;
            case 6:
                return (obj instanceof C16994k) || (obj instanceof byte[]);
            case 7:
                return (obj instanceof Integer) || (obj instanceof C23908o0.C23911c);
            case 8:
                return (obj instanceof C23845j1) || (obj instanceof C23932r0);
            default:
                return false;
        }
    }

    /* renamed from: y */
    public static void m28838y(C23897n nVar, C24087z2.C24089b bVar, int i, Object obj) {
        if (bVar == C24087z2.C24089b.GROUP) {
            nVar.mo37916W(i, 3);
            ((C23845j1) obj).writeTo(nVar);
            nVar.mo37916W(i, 4);
            return;
        }
        nVar.mo37916W(i, bVar.f69234e);
        m28839z(nVar, bVar, obj);
    }

    /* renamed from: z */
    public static void m28839z(C23897n nVar, C24087z2.C24089b bVar, Object obj) {
        switch (bVar.ordinal()) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                nVar.getClass();
                nVar.mo37905L(Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                nVar.getClass();
                nVar.mo37903J(Float.floatToRawIntBits(floatValue));
                return;
            case 2:
                nVar.mo37920a0(((Long) obj).longValue());
                return;
            case 3:
                nVar.mo37920a0(((Long) obj).longValue());
                return;
            case 4:
                nVar.mo37908O(((Integer) obj).intValue());
                return;
            case 5:
                nVar.mo37905L(((Long) obj).longValue());
                return;
            case 6:
                nVar.mo37903J(((Integer) obj).intValue());
                return;
            case 7:
                nVar.mo37896C(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 8:
                if (obj instanceof C16994k) {
                    nVar.mo37900G((C16994k) obj);
                    return;
                } else {
                    nVar.mo37915V((String) obj);
                    return;
                }
            case 9:
                nVar.getClass();
                ((C23845j1) obj).writeTo(nVar);
                return;
            case 10:
                nVar.mo37911R((C23845j1) obj);
                return;
            case 11:
                if (obj instanceof C16994k) {
                    nVar.mo37900G((C16994k) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                nVar.getClass();
                nVar.mo37898E(bArr, 0, bArr.length);
                return;
            case 12:
                nVar.mo37918Y(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof C23908o0.C23911c) {
                    nVar.mo37908O(((C23908o0.C23911c) obj).getNumber());
                    return;
                } else {
                    nVar.mo37908O(((Integer) obj).intValue());
                    return;
                }
            case 14:
                nVar.mo37903J(((Integer) obj).intValue());
                return;
            case 15:
                nVar.mo37905L(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                nVar.mo37918Y((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                nVar.mo37920a0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    /* renamed from: B */
    public final void mo37635B(Map.Entry<T, Object> entry, C23897n nVar) {
        C23835c cVar = (C23835c) entry.getKey();
        if (cVar.mo37664Q() != C24087z2.C24094c.MESSAGE || cVar.mo37662E0() || cVar.mo37666T0()) {
            m28829A(cVar, entry.getValue(), nVar);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof C23932r0) {
            value = ((C23932r0) value).mo38016c();
        }
        nVar.mo37912S(((C23835c) entry.getKey()).getNumber(), (C23845j1) value);
    }

    /* renamed from: a */
    public void mo37636a(T t, Object obj) {
        List list;
        if (!t.mo37662E0()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        } else if (m28837s(t.mo37663O(), obj)) {
            Object k = mo37643k(t);
            if (k == null) {
                list = new ArrayList();
                this.f68259a.put(t, list);
            } else {
                list = (List) k;
            }
            list.add(obj);
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* renamed from: b */
    public void mo37637b(T t) {
        this.f68259a.remove(t);
        if (this.f68259a.isEmpty()) {
            this.f68261c = false;
        }
    }

    /* renamed from: c */
    public C23832g0<T> clone() {
        C23832g0<T> g0Var = new C23832g0<>();
        for (int i = 0; i < this.f68259a.mo37720e(); i++) {
            Map.Entry<T, Object> c = this.f68259a.mo37717c(i);
            g0Var.mo37654x((C23835c) c.getKey(), c.getValue());
        }
        for (Map.Entry next : this.f68259a.mo37723f()) {
            g0Var.mo37654x((C23835c) next.getKey(), next.getValue());
        }
        g0Var.f68261c = this.f68261c;
        return g0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23832g0)) {
            return false;
        }
        return this.f68259a.equals(((C23832g0) obj).f68259a);
    }

    public int hashCode() {
        return this.f68259a.hashCode();
    }

    /* renamed from: j */
    public Map<T, Object> mo37642j() {
        if (this.f68261c) {
            C23849k2<T, Object> d = m28830d(this.f68259a, false);
            if (this.f68259a.f68346g) {
                d.mo37712i();
            }
            return d;
        }
        C23849k2<T, Object> k2Var = this.f68259a;
        return k2Var.f68346g ? k2Var : Collections.unmodifiableMap(k2Var);
    }

    /* renamed from: k */
    public Object mo37643k(T t) {
        Object obj = this.f68259a.get(t);
        return obj instanceof C23932r0 ? ((C23932r0) obj).mo38016c() : obj;
    }

    /* renamed from: l */
    public int mo37644l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f68259a.mo37720e(); i2++) {
            i += mo37645m(this.f68259a.mo37717c(i2));
        }
        for (Map.Entry<T, Object> m : this.f68259a.mo37723f()) {
            i += mo37645m(m);
        }
        return i;
    }

    /* renamed from: m */
    public final int mo37645m(Map.Entry<T, Object> entry) {
        C23835c cVar = (C23835c) entry.getKey();
        Object value = entry.getValue();
        if (cVar.mo37664Q() != C24087z2.C24094c.MESSAGE || cVar.mo37662E0() || cVar.mo37666T0()) {
            return m28835i(cVar, value);
        }
        if (value instanceof C23932r0) {
            return (C23897n.m29277v(1) * 2) + C23897n.m29278w(2, ((C23835c) entry.getKey()).getNumber()) + C23897n.m29277v(3) + C23897n.m29269n((C23932r0) value);
        }
        return (C23897n.m29277v(1) * 2) + C23897n.m29278w(2, ((C23835c) entry.getKey()).getNumber()) + C23897n.m29270o(3, (C23845j1) value);
    }

    /* renamed from: n */
    public int mo37646n() {
        int i = 0;
        for (int i2 = 0; i2 < this.f68259a.mo37720e(); i2++) {
            Map.Entry<T, Object> c = this.f68259a.mo37717c(i2);
            i += m28835i((C23835c) c.getKey(), c.getValue());
        }
        for (Map.Entry next : this.f68259a.mo37723f()) {
            i += m28835i((C23835c) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: o */
    public boolean mo37647o(T t) {
        if (!t.mo37662E0()) {
            return this.f68259a.get(t) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    /* renamed from: p */
    public boolean mo37648p() {
        return this.f68259a.isEmpty();
    }

    /* renamed from: q */
    public boolean mo37649q() {
        for (int i = 0; i < this.f68259a.mo37720e(); i++) {
            if (!m28836r(this.f68259a.mo37717c(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> r : this.f68259a.mo37723f()) {
            if (!m28836r(r)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public Iterator<Map.Entry<T, Object>> mo37650t() {
        return this.f68261c ? new C23932r0.C23935c(this.f68259a.entrySet().iterator()) : this.f68259a.entrySet().iterator();
    }

    /* renamed from: u */
    public void mo37651u() {
        if (!this.f68260b) {
            this.f68259a.mo37712i();
            this.f68260b = true;
        }
    }

    /* renamed from: v */
    public void mo37652v(C23832g0<T> g0Var) {
        for (int i = 0; i < g0Var.f68259a.mo37720e(); i++) {
            mo37653w(g0Var.f68259a.mo37717c(i));
        }
        for (Map.Entry<T, Object> w : g0Var.f68259a.mo37723f()) {
            mo37653w(w);
        }
    }

    /* renamed from: w */
    public final void mo37653w(Map.Entry<T, Object> entry) {
        C23835c cVar = (C23835c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C23932r0) {
            value = ((C23932r0) value).mo38016c();
        }
        if (cVar.mo37662E0()) {
            Object k = mo37643k(cVar);
            if (k == null) {
                k = new ArrayList();
            }
            for (Object f : (List) value) {
                ((List) k).add(m28832f(f));
            }
            this.f68259a.put(cVar, k);
        } else if (cVar.mo37664Q() == C24087z2.C24094c.MESSAGE) {
            Object k2 = mo37643k(cVar);
            if (k2 == null) {
                this.f68259a.put(cVar, m28832f(value));
                return;
            }
            this.f68259a.put(cVar, cVar.mo37665S1(((C23845j1) k2).toBuilder(), (C23845j1) value).build());
        } else {
            this.f68259a.put(cVar, m28832f(value));
        }
    }

    /* renamed from: x */
    public void mo37654x(T t, Object obj) {
        if (t.mo37662E0()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!m28837s(t.mo37663O(), it.next())) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else if (!m28837s(t.mo37663O(), obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C23932r0) {
            this.f68261c = true;
        }
        this.f68259a.put(t, obj);
    }

    public C23832g0(C23849k2<T, Object> k2Var) {
        this.f68259a = k2Var;
        mo37651u();
    }
}
