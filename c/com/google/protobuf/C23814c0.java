package com.google.protobuf;

import com.google.protobuf.C23872m0;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24071y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.c0 */
public final class C23814c0 extends C23812b0<C24025t.C24035g> {

    /* renamed from: a */
    public static final long f68215a = C24065x2.m29990q(C23872m0.C23878e.class.getDeclaredField("d"));

    /* renamed from: b */
    public static final /* synthetic */ int f68216b = 0;

    static {
        try {
        } catch (Throwable unused) {
            throw new IllegalStateException("Unable to lookup extension field offset");
        }
    }

    /* renamed from: a */
    public int mo37482a(Map.Entry<?, ?> entry) {
        return ((C24025t.C24035g) entry.getKey()).f69104e.f68739f;
    }

    /* renamed from: b */
    public Object mo37483b(C23806a0 a0Var, C23845j1 j1Var, int i) {
        return ((C24071y) a0Var).f69201f.get(new C24071y.C24072a(((C23836g1) j1Var).getDescriptorForType(), i));
    }

    /* renamed from: c */
    public C23832g0<C24025t.C24035g> mo37484c(Object obj) {
        return (C23832g0) C24065x2.m29988o(obj, f68215a);
    }

    /* renamed from: d */
    public C23832g0<C24025t.C24035g> mo37485d(Object obj) {
        C23832g0<C24025t.C24035g> c = mo37484c(obj);
        if (!c.f68260b) {
            return c;
        }
        C23832g0<C24025t.C24035g> c2 = c.clone();
        C24065x2.m29999z(obj, f68215a, c2);
        return c2;
    }

    /* renamed from: e */
    public boolean mo37486e(C23845j1 j1Var) {
        return j1Var instanceof C23872m0.C23878e;
    }

    /* renamed from: f */
    public void mo37487f(Object obj) {
        mo37484c(obj).mo37651u();
    }

    /* renamed from: g */
    public <UT, UB> UB mo37488g(C23819d2 d2Var, Object obj, C23806a0 a0Var, C23832g0<C24025t.C24035g> g0Var, UB ub, C23937r2<UT, UB> r2Var) {
        ((C24071y.C24073b) obj).getClass();
        throw null;
    }

    /* renamed from: h */
    public void mo37489h(C23819d2 d2Var, Object obj, C23806a0 a0Var, C23832g0<C24025t.C24035g> g0Var) {
        C23806a0 a0Var2 = C23806a0.f68207b;
        ((C24071y.C24073b) obj).getClass();
        g0Var.mo37654x(null, new C23932r0((C23845j1) null, a0Var, d2Var.mo37577z()));
        throw null;
    }

    /* renamed from: i */
    public void mo37490i(C16994k kVar, Object obj, C23806a0 a0Var, C23832g0<C24025t.C24035g> g0Var) {
        ((C24071y.C24073b) obj).getClass();
        throw null;
    }

    /* renamed from: j */
    public void mo37491j(C23809a3 a3Var, Map.Entry<?, ?> entry) {
        C24025t.C24035g gVar = (C24025t.C24035g) entry.getKey();
        if (gVar.mo37662E0()) {
            int i = 0;
            switch (gVar.mo37663O().ordinal()) {
                case 0:
                    C23842h2.m28888H(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 1:
                    C23842h2.m28892L(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 2:
                    C23842h2.m28895O(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 3:
                    C23842h2.m28903W(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 4:
                    C23842h2.m28894N(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 5:
                    C23842h2.m28891K(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 6:
                    C23842h2.m28890J(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 7:
                    C23842h2.m28886F(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 8:
                    C23842h2.m28901U(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var);
                    return;
                case 9:
                    int i2 = gVar.f69104e.f68739f;
                    List list = (List) entry.getValue();
                    Class<?> cls = C23842h2.f68331a;
                    if (list != null && !list.isEmpty()) {
                        C23907o oVar = (C23907o) a3Var;
                        oVar.getClass();
                        while (i < list.size()) {
                            Object obj = list.get(i);
                            C23897n nVar = oVar.f68504a;
                            nVar.mo37916W(i2, 3);
                            ((C23845j1) obj).writeTo(nVar);
                            nVar.mo37916W(i2, 4);
                            i++;
                        }
                        return;
                    }
                    return;
                case 10:
                    int i3 = gVar.f69104e.f68739f;
                    List list2 = (List) entry.getValue();
                    Class<?> cls2 = C23842h2.f68331a;
                    if (list2 != null && !list2.isEmpty()) {
                        C23907o oVar2 = (C23907o) a3Var;
                        oVar2.getClass();
                        while (i < list2.size()) {
                            oVar2.f68504a.mo37909P(i3, (C23845j1) list2.get(i));
                            i++;
                        }
                        return;
                    }
                    return;
                case 11:
                    C23842h2.m28887G(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var);
                    return;
                case 12:
                    C23842h2.m28902V(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 13:
                    ArrayList arrayList = new ArrayList();
                    for (C24025t.C24034f fVar : (List) entry.getValue()) {
                        arrayList.add(Integer.valueOf(fVar.f69098e.f68710f));
                    }
                    C23842h2.m28894N(gVar.f69104e.f68739f, arrayList, a3Var, gVar.mo37666T0());
                    return;
                case 14:
                    C23842h2.m28897Q(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 15:
                    C23842h2.m28898R(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 16:
                    C23842h2.m28899S(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                case 17:
                    C23842h2.m28900T(gVar.f69104e.f68739f, (List) entry.getValue(), a3Var, gVar.mo37666T0());
                    return;
                default:
                    return;
            }
        } else {
            switch (gVar.mo37663O().ordinal()) {
                case 0:
                    ((C23907o) a3Var).mo37956d(gVar.f69104e.f68739f, ((Double) entry.getValue()).doubleValue());
                    return;
                case 1:
                    ((C23907o) a3Var).mo37963k(gVar.f69104e.f68739f, ((Float) entry.getValue()).floatValue());
                    return;
                case 2:
                    ((C23907o) a3Var).mo37966n(gVar.f69104e.f68739f, ((Long) entry.getValue()).longValue());
                    return;
                case 3:
                    ((C23907o) a3Var).mo37976x(gVar.f69104e.f68739f, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    ((C23907o) a3Var).mo37965m(gVar.f69104e.f68739f, ((Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    ((C23907o) a3Var).mo37961i(gVar.f69104e.f68739f, ((Long) entry.getValue()).longValue());
                    return;
                case 6:
                    ((C23907o) a3Var).mo37959g(gVar.f69104e.f68739f, ((Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    ((C23907o) a3Var).mo37953a(gVar.f69104e.f68739f, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    ((C23907o) a3Var).f68504a.mo37914U(gVar.f69104e.f68739f, (String) entry.getValue());
                    return;
                case 9:
                    int i4 = gVar.f69104e.f68739f;
                    Object value = entry.getValue();
                    C23897n nVar2 = ((C23907o) a3Var).f68504a;
                    nVar2.mo37916W(i4, 3);
                    ((C23845j1) value).writeTo(nVar2);
                    nVar2.mo37916W(i4, 4);
                    return;
                case 10:
                    ((C23907o) a3Var).f68504a.mo37909P(gVar.f69104e.f68739f, (C23845j1) entry.getValue());
                    return;
                case 11:
                    ((C23907o) a3Var).mo37954b(gVar.f69104e.f68739f, (C16994k) entry.getValue());
                    return;
                case 12:
                    ((C23907o) a3Var).mo37975w(gVar.f69104e.f68739f, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    ((C23907o) a3Var).mo37965m(gVar.f69104e.f68739f, ((C24025t.C24034f) entry.getValue()).f69098e.f68710f);
                    return;
                case 14:
                    ((C23907o) a3Var).mo37970r(gVar.f69104e.f68739f, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    ((C23907o) a3Var).mo37971s(gVar.f69104e.f68739f, ((Long) entry.getValue()).longValue());
                    return;
                case 16:
                    ((C23907o) a3Var).mo37972t(gVar.f69104e.f68739f, ((Integer) entry.getValue()).intValue());
                    return;
                case 17:
                    ((C23907o) a3Var).mo37973u(gVar.f69104e.f68739f, ((Long) entry.getValue()).longValue());
                    return;
                default:
                    return;
            }
        }
    }
}
