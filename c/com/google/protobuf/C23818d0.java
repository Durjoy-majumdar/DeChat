package com.google.protobuf;

import com.google.protobuf.C23806a0;
import com.google.protobuf.C23829g;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C24087z2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.d0 */
public final class C23818d0 extends C23812b0<C23861l0.C23865d> {
    /* renamed from: a */
    public int mo37482a(Map.Entry<?, ?> entry) {
        return ((C23861l0.C23865d) entry.getKey()).f68390e;
    }

    /* renamed from: b */
    public Object mo37483b(C23806a0 a0Var, C23845j1 j1Var, int i) {
        return a0Var.f68209a.get(new C23806a0.C23807a(j1Var, i));
    }

    /* renamed from: c */
    public C23832g0<C23861l0.C23865d> mo37484c(Object obj) {
        return ((C23861l0.C23864c) obj).f68388d;
    }

    /* renamed from: d */
    public C23832g0<C23861l0.C23865d> mo37485d(Object obj) {
        C23861l0.C23864c cVar = (C23861l0.C23864c) obj;
        C23832g0<C23861l0.C23865d> g0Var = cVar.f68388d;
        if (g0Var.f68260b) {
            cVar.f68388d = g0Var.clone();
        }
        return cVar.f68388d;
    }

    /* renamed from: e */
    public boolean mo37486e(C23845j1 j1Var) {
        return j1Var instanceof C23861l0.C23864c;
    }

    /* renamed from: f */
    public void mo37487f(Object obj) {
        ((C23861l0.C23864c) obj).f68388d.mo37651u();
    }

    /* renamed from: g */
    public <UT, UB> UB mo37488g(C23819d2 d2Var, Object obj, C23806a0 a0Var, C23832g0<C23861l0.C23865d> g0Var, UB ub, C23937r2<UT, UB> r2Var) {
        Object k;
        ArrayList arrayList;
        C23861l0.C23866e eVar = (C23861l0.C23866e) obj;
        C23861l0.C23865d dVar = eVar.f68397d;
        int i = dVar.f68390e;
        if (!dVar.f68392g || !dVar.f68393h) {
            Object obj2 = null;
            C24087z2.C24089b bVar = dVar.f68391f;
            if (bVar != C24087z2.C24089b.ENUM) {
                switch (bVar.ordinal()) {
                    case 0:
                        obj2 = Double.valueOf(d2Var.readDouble());
                        break;
                    case 1:
                        obj2 = Float.valueOf(d2Var.readFloat());
                        break;
                    case 2:
                        obj2 = Long.valueOf(d2Var.mo37559j());
                        break;
                    case 3:
                        obj2 = Long.valueOf(d2Var.mo37533A());
                        break;
                    case 4:
                        obj2 = Integer.valueOf(d2Var.mo37565p());
                        break;
                    case 5:
                        obj2 = Long.valueOf(d2Var.mo37540H());
                        break;
                    case 6:
                        obj2 = Integer.valueOf(d2Var.mo37570s());
                        break;
                    case 7:
                        obj2 = Boolean.valueOf(d2Var.mo37560k());
                        break;
                    case 8:
                        obj2 = d2Var.mo37571t();
                        break;
                    case 9:
                        obj2 = d2Var.mo37563n(eVar.f68396c.getClass(), a0Var);
                        break;
                    case 10:
                        obj2 = d2Var.mo37567r(eVar.f68396c.getClass(), a0Var);
                        break;
                    case 11:
                        obj2 = d2Var.mo37577z();
                        break;
                    case 12:
                        obj2 = Integer.valueOf(d2Var.mo37549a());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        obj2 = Integer.valueOf(d2Var.mo37547O());
                        break;
                    case 15:
                        obj2 = Long.valueOf(d2Var.mo37574w());
                        break;
                    case 16:
                        obj2 = Integer.valueOf(d2Var.mo37575x());
                        break;
                    case 17:
                        obj2 = Long.valueOf(d2Var.mo37546N());
                        break;
                }
            } else {
                int p = d2Var.mo37565p();
                if (eVar.f68397d.f68389d.findValueByNumber(p) == null) {
                    return C23842h2.m28885E(i, p, ub, r2Var);
                }
                obj2 = Integer.valueOf(p);
            }
            C23861l0.C23865d dVar2 = eVar.f68397d;
            if (dVar2.f68392g) {
                g0Var.mo37636a(dVar2, obj2);
            } else {
                int ordinal = dVar2.f68391f.ordinal();
                if ((ordinal == 9 || ordinal == 10) && (k = g0Var.mo37643k(eVar.f68397d)) != null) {
                    obj2 = C23908o0.m29425c(k, obj2);
                }
                g0Var.mo37654x(eVar.f68397d, obj2);
            }
        } else {
            switch (dVar.f68391f.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    d2Var.mo37539G(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    d2Var.mo37537E(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    d2Var.mo37543K(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    d2Var.mo37562m(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    d2Var.mo37555g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    d2Var.mo37566q(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    d2Var.mo37534B(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    d2Var.mo37551c(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    d2Var.mo37545M(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    d2Var.mo37544L(arrayList);
                    ub = C23842h2.m28929z(i, arrayList, eVar.f68397d.f68389d, ub, r2Var);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    d2Var.mo37541I(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    d2Var.mo37554f(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    d2Var.mo37552d(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    d2Var.mo37573v(arrayList);
                    break;
                default:
                    String valueOf = String.valueOf(eVar.f68397d.f68391f);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("Type cannot be packed: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
            }
            g0Var.mo37654x(eVar.f68397d, arrayList);
        }
        return ub;
    }

    /* renamed from: h */
    public void mo37489h(C23819d2 d2Var, Object obj, C23806a0 a0Var, C23832g0<C23861l0.C23865d> g0Var) {
        C23861l0.C23866e eVar = (C23861l0.C23866e) obj;
        g0Var.mo37654x(eVar.f68397d, d2Var.mo37567r(eVar.f68396c.getClass(), a0Var));
    }

    /* renamed from: i */
    public void mo37490i(C16994k kVar, Object obj, C23806a0 a0Var, C23832g0<C23861l0.C23865d> g0Var) {
        C23861l0.C23866e eVar = (C23861l0.C23866e) obj;
        C23845j1 buildPartial = eVar.f68396c.newBuilderForType().buildPartial();
        ByteBuffer wrap = ByteBuffer.wrap(kVar.mo18748s());
        if (wrap.hasArray()) {
            C23829g.C23831b bVar = new C23829g.C23831b(wrap, true);
            C24086z1 z1Var = C24086z1.f69225c;
            z1Var.getClass();
            z1Var.mo38436a(buildPartial.getClass()).mo37617h(buildPartial, bVar, a0Var);
            g0Var.mo37654x(eVar.f68397d, buildPartial);
            if (bVar.mo37535C() != Integer.MAX_VALUE) {
                throw C23922p0.m29476a();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    /* renamed from: j */
    public void mo37491j(C23809a3 a3Var, Map.Entry<?, ?> entry) {
        C23861l0.C23865d dVar = (C23861l0.C23865d) entry.getKey();
        if (dVar.f68392g) {
            switch (dVar.f68391f.ordinal()) {
                case 0:
                    C23842h2.m28888H(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 1:
                    C23842h2.m28892L(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 2:
                    C23842h2.m28895O(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 3:
                    C23842h2.m28903W(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 4:
                    C23842h2.m28894N(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 5:
                    C23842h2.m28891K(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 6:
                    C23842h2.m28890J(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 7:
                    C23842h2.m28886F(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 8:
                    C23842h2.m28901U(dVar.f68390e, (List) entry.getValue(), a3Var);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C23842h2.m28893M(dVar.f68390e, (List) entry.getValue(), a3Var, C24086z1.f69225c.mo38436a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C23842h2.m28896P(dVar.f68390e, (List) entry.getValue(), a3Var, C24086z1.f69225c.mo38436a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    C23842h2.m28887G(dVar.f68390e, (List) entry.getValue(), a3Var);
                    return;
                case 12:
                    C23842h2.m28902V(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 13:
                    C23842h2.m28894N(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 14:
                    C23842h2.m28897Q(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 15:
                    C23842h2.m28898R(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 16:
                    C23842h2.m28899S(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                case 17:
                    C23842h2.m28900T(dVar.f68390e, (List) entry.getValue(), a3Var, dVar.f68393h);
                    return;
                default:
                    return;
            }
        } else {
            switch (dVar.f68391f.ordinal()) {
                case 0:
                    ((C23907o) a3Var).mo37956d(dVar.f68390e, ((Double) entry.getValue()).doubleValue());
                    return;
                case 1:
                    ((C23907o) a3Var).mo37963k(dVar.f68390e, ((Float) entry.getValue()).floatValue());
                    return;
                case 2:
                    ((C23907o) a3Var).mo37966n(dVar.f68390e, ((Long) entry.getValue()).longValue());
                    return;
                case 3:
                    ((C23907o) a3Var).mo37976x(dVar.f68390e, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    ((C23907o) a3Var).mo37965m(dVar.f68390e, ((Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    ((C23907o) a3Var).mo37961i(dVar.f68390e, ((Long) entry.getValue()).longValue());
                    return;
                case 6:
                    ((C23907o) a3Var).mo37959g(dVar.f68390e, ((Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    ((C23907o) a3Var).mo37953a(dVar.f68390e, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    ((C23907o) a3Var).f68504a.mo37914U(dVar.f68390e, (String) entry.getValue());
                    return;
                case 9:
                    ((C23907o) a3Var).mo37964l(dVar.f68390e, entry.getValue(), C24086z1.f69225c.mo38436a(entry.getValue().getClass()));
                    return;
                case 10:
                    ((C23907o) a3Var).mo37968p(dVar.f68390e, entry.getValue(), C24086z1.f69225c.mo38436a(entry.getValue().getClass()));
                    return;
                case 11:
                    ((C23907o) a3Var).mo37954b(dVar.f68390e, (C16994k) entry.getValue());
                    return;
                case 12:
                    ((C23907o) a3Var).mo37975w(dVar.f68390e, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    ((C23907o) a3Var).mo37965m(dVar.f68390e, ((Integer) entry.getValue()).intValue());
                    return;
                case 14:
                    ((C23907o) a3Var).mo37970r(dVar.f68390e, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    ((C23907o) a3Var).mo37971s(dVar.f68390e, ((Long) entry.getValue()).longValue());
                    return;
                case 16:
                    ((C23907o) a3Var).mo37972t(dVar.f68390e, ((Integer) entry.getValue()).intValue());
                    return;
                case 17:
                    ((C23907o) a3Var).mo37973u(dVar.f68390e, ((Long) entry.getValue()).longValue());
                    return;
                default:
                    return;
            }
        }
    }
}
