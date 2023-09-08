package com.google.protobuf;

import com.google.protobuf.C24020s2;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.protobuf.v2 */
public class C24059v2 extends C23937r2<C24020s2, C24020s2.C24021a> {
    /* renamed from: a */
    public void mo38027a(Object obj, int i, int i2) {
        C24020s2.C24021a aVar = (C24020s2.C24021a) obj;
        C24020s2.C24022b.C24023a b = C24020s2.C24022b.m29818b();
        C24020s2.C24022b bVar = b.f69067a;
        if (bVar.f69063b == null) {
            bVar.f69063b = new ArrayList();
        }
        b.f69067a.f69063b.add(Integer.valueOf(i2));
        aVar.mo38301d(i, b.mo38310c());
    }

    /* renamed from: b */
    public void mo38028b(Object obj, int i, long j) {
        C24020s2.C24021a aVar = (C24020s2.C24021a) obj;
        C24020s2.C24022b.C24023a b = C24020s2.C24022b.m29818b();
        C24020s2.C24022b bVar = b.f69067a;
        if (bVar.f69064c == null) {
            bVar.f69064c = new ArrayList();
        }
        b.f69067a.f69064c.add(Long.valueOf(j));
        aVar.mo38301d(i, b.mo38310c());
    }

    /* renamed from: c */
    public void mo38029c(Object obj, int i, Object obj2) {
        C24020s2.C24021a aVar = (C24020s2.C24021a) obj;
        C24020s2 s2Var = (C24020s2) obj2;
        C24020s2.C24022b.C24023a b = C24020s2.C24022b.m29818b();
        C24020s2.C24022b bVar = b.f69067a;
        if (bVar.f69066e == null) {
            bVar.f69066e = new ArrayList();
        }
        b.f69067a.f69066e.add(s2Var);
        aVar.mo38301d(i, b.mo38310c());
    }

    /* renamed from: d */
    public void mo38030d(Object obj, int i, C16994k kVar) {
        C24020s2.C24022b.C24023a b = C24020s2.C24022b.m29818b();
        b.mo38308a(kVar);
        ((C24020s2.C24021a) obj).mo38301d(i, b.mo38310c());
    }

    /* renamed from: e */
    public void mo38031e(Object obj, int i, long j) {
        C24020s2.C24022b.C24023a b = C24020s2.C24022b.m29818b();
        b.mo38309b(j);
        ((C24020s2.C24021a) obj).mo38301d(i, b.mo38310c());
    }

    /* renamed from: f */
    public Object mo38032f(Object obj) {
        C24020s2 s2Var = ((C23872m0) obj).unknownFields;
        s2Var.getClass();
        C24020s2.C24021a b = C24020s2.m29807b();
        b.mo38303f(s2Var);
        return b;
    }

    /* renamed from: g */
    public Object mo38033g(Object obj) {
        return ((C23872m0) obj).unknownFields;
    }

    /* renamed from: h */
    public int mo38034h(Object obj) {
        return ((C24020s2) obj).getSerializedSize();
    }

    /* renamed from: i */
    public int mo38035i(Object obj) {
        return ((C24020s2) obj).mo38291a();
    }

    /* renamed from: j */
    public void mo38036j(Object obj) {
    }

    /* renamed from: k */
    public Object mo38037k(Object obj, Object obj2) {
        C24020s2 s2Var = (C24020s2) obj;
        s2Var.getClass();
        C24020s2.C24021a b = C24020s2.m29807b();
        b.mo38303f(s2Var);
        b.mo38303f((C24020s2) obj2);
        return b.build();
    }

    /* renamed from: m */
    public Object mo38039m() {
        return C24020s2.m29807b();
    }

    /* renamed from: n */
    public void mo38040n(Object obj, Object obj2) {
        ((C23872m0) obj).unknownFields = ((C24020s2.C24021a) obj2).build();
    }

    /* renamed from: o */
    public void mo38041o(Object obj, Object obj2) {
        ((C23872m0) obj).unknownFields = (C24020s2) obj2;
    }

    /* renamed from: p */
    public boolean mo38042p(C23819d2 d2Var) {
        return d2Var.mo37557h();
    }

    /* renamed from: q */
    public Object mo38043q(Object obj) {
        return ((C24020s2.C24021a) obj).build();
    }

    /* renamed from: r */
    public void mo38044r(Object obj, C23809a3 a3Var) {
        C24020s2 s2Var = (C24020s2) obj;
        s2Var.getClass();
        a3Var.getClass();
        for (Map.Entry next : s2Var.f69056d.entrySet()) {
            C24020s2.C24022b bVar = (C24020s2.C24022b) next.getValue();
            int intValue = ((Integer) next.getKey()).intValue();
            int i = C24020s2.C24022b.f69061f;
            bVar.getClass();
            for (C16994k q : bVar.f69065d) {
                ((C23907o) a3Var).mo37969q(intValue, q);
            }
        }
    }

    /* renamed from: s */
    public void mo38045s(Object obj, C23809a3 a3Var) {
        ((C24020s2) obj).mo38293d(a3Var);
    }
}
