package com.google.protobuf;

/* renamed from: com.google.protobuf.u2 */
public class C24050u2 extends C23937r2<C24046t2, C24046t2> {
    /* renamed from: a */
    public void mo38027a(Object obj, int i, int i2) {
        ((C24046t2) obj).mo38361d((i << 3) | 5, Integer.valueOf(i2));
    }

    /* renamed from: b */
    public void mo38028b(Object obj, int i, long j) {
        ((C24046t2) obj).mo38361d((i << 3) | 1, Long.valueOf(j));
    }

    /* renamed from: c */
    public void mo38029c(Object obj, int i, Object obj2) {
        ((C24046t2) obj).mo38361d((i << 3) | 3, (C24046t2) obj2);
    }

    /* renamed from: d */
    public void mo38030d(Object obj, int i, C16994k kVar) {
        ((C24046t2) obj).mo38361d((i << 3) | 2, kVar);
    }

    /* renamed from: e */
    public void mo38031e(Object obj, int i, long j) {
        ((C24046t2) obj).mo38361d((i << 3) | 0, Long.valueOf(j));
    }

    /* renamed from: f */
    public Object mo38032f(Object obj) {
        C23861l0 l0Var = (C23861l0) obj;
        C24046t2 t2Var = l0Var.unknownFields;
        if (t2Var != C24046t2.f69159f) {
            return t2Var;
        }
        C24046t2 t2Var2 = new C24046t2();
        l0Var.unknownFields = t2Var2;
        return t2Var2;
    }

    /* renamed from: g */
    public Object mo38033g(Object obj) {
        return ((C23861l0) obj).unknownFields;
    }

    /* renamed from: h */
    public int mo38034h(Object obj) {
        return ((C24046t2) obj).mo38359a();
    }

    /* renamed from: i */
    public int mo38035i(Object obj) {
        C24046t2 t2Var = (C24046t2) obj;
        int i = t2Var.f69163d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < t2Var.f69160a; i3++) {
            i2 += (C23897n.m29277v(1) * 2) + C23897n.m29278w(2, t2Var.f69161b[i3] >>> 3) + C23897n.m29258c(3, (C16994k) t2Var.f69162c[i3]);
        }
        t2Var.f69163d = i2;
        return i2;
    }

    /* renamed from: j */
    public void mo38036j(Object obj) {
        ((C23861l0) obj).unknownFields.f69164e = false;
    }

    /* renamed from: k */
    public Object mo38037k(Object obj, Object obj2) {
        C24046t2 t2Var = (C24046t2) obj;
        C24046t2 t2Var2 = (C24046t2) obj2;
        return t2Var2.equals(C24046t2.f69159f) ? t2Var : C24046t2.m29897c(t2Var, t2Var2);
    }

    /* renamed from: m */
    public Object mo38039m() {
        return new C24046t2();
    }

    /* renamed from: n */
    public void mo38040n(Object obj, Object obj2) {
        ((C23861l0) obj).unknownFields = (C24046t2) obj2;
    }

    /* renamed from: o */
    public void mo38041o(Object obj, Object obj2) {
        ((C23861l0) obj).unknownFields = (C24046t2) obj2;
    }

    /* renamed from: p */
    public boolean mo38042p(C23819d2 d2Var) {
        return false;
    }

    /* renamed from: q */
    public Object mo38043q(Object obj) {
        C24046t2 t2Var = (C24046t2) obj;
        t2Var.f69164e = false;
        return t2Var;
    }

    /* renamed from: r */
    public void mo38044r(Object obj, C23809a3 a3Var) {
        C24046t2 t2Var = (C24046t2) obj;
        t2Var.getClass();
        a3Var.getClass();
        for (int i = 0; i < t2Var.f69160a; i++) {
            ((C23907o) a3Var).mo37969q(t2Var.f69161b[i] >>> 3, t2Var.f69162c[i]);
        }
    }

    /* renamed from: s */
    public void mo38045s(Object obj, C23809a3 a3Var) {
        ((C24046t2) obj).mo38362e(a3Var);
    }
}
