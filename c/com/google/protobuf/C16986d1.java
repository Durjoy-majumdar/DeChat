package com.google.protobuf;

import com.google.protobuf.C16976a1;
import com.google.protobuf.C24084z0;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.d1 */
public class C16986d1 implements C23815c1 {
    /* renamed from: a */
    public Object mo18725a(Object obj, Object obj2) {
        C16976a1 a1Var = (C16976a1) obj;
        C16976a1 a1Var2 = (C16976a1) obj2;
        if (!a1Var.f45972a) {
            new C16976a1(a1Var.f45976e, C16976a1.C16983d.MAP, C16985b1.m16766c(a1Var.mo18655e()));
        }
        ((C16976a1.C16979c) a1Var.mo18658g()).putAll(C16985b1.m16766c(a1Var2.mo18655e()));
        return a1Var;
    }

    /* renamed from: b */
    public C24084z0.C24085a<?, ?> mo18726b(Object obj) {
        return ((C24074y0) obj).f69207f;
    }

    /* renamed from: c */
    public Object mo18727c(Object obj) {
        ((C16976a1) obj).f45972a = false;
        return obj;
    }

    /* renamed from: d */
    public Map<?, ?> mo18728d(Object obj) {
        return ((C16976a1) obj).mo18658g();
    }

    /* renamed from: e */
    public Object mo18729e(Object obj) {
        return new C16976a1((C24074y0) obj, C16976a1.C16983d.MAP, new LinkedHashMap());
    }

    /* renamed from: f */
    public Map<?, ?> mo18730f(Object obj) {
        return ((C16976a1) obj).mo18655e();
    }

    /* renamed from: g */
    public int mo18731g(int i, Object obj, Object obj2) {
        int i2 = 0;
        if (obj != null) {
            Map e = ((C16976a1) obj).mo18655e();
            C24074y0 y0Var = (C24074y0) obj2;
            if (!e.isEmpty()) {
                for (Map.Entry entry : e.entrySet()) {
                    int v = C23897n.m29277v(i);
                    int a = C24084z0.m30082a(y0Var.f69207f, entry.getKey(), entry.getValue());
                    i2 += v + C23897n.m29279x(a) + a;
                }
            }
        }
        return i2;
    }

    /* renamed from: h */
    public boolean mo18732h(Object obj) {
        return !((C16976a1) obj).f45972a;
    }
}
