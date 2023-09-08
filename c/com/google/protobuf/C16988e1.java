package com.google.protobuf;

import com.google.protobuf.C24084z0;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.e1 */
public class C16988e1 implements C23815c1 {
    /* renamed from: a */
    public Object mo18725a(Object obj, Object obj2) {
        C16985b1 b1Var = (C16985b1) obj;
        C16985b1 b1Var2 = (C16985b1) obj2;
        if (!b1Var2.isEmpty()) {
            if (!b1Var.f45992d) {
                b1Var = b1Var.isEmpty() ? new C16985b1() : new C16985b1(b1Var);
            }
            b1Var.mo18718e();
            if (!b1Var2.isEmpty()) {
                b1Var.putAll(b1Var2);
            }
        }
        return b1Var;
    }

    /* renamed from: b */
    public C24084z0.C24085a<?, ?> mo18726b(Object obj) {
        ((C24084z0) obj).getClass();
        return null;
    }

    /* renamed from: c */
    public Object mo18727c(Object obj) {
        ((C16985b1) obj).f45992d = false;
        return obj;
    }

    /* renamed from: d */
    public Map<?, ?> mo18728d(Object obj) {
        return (C16985b1) obj;
    }

    /* renamed from: e */
    public Object mo18729e(Object obj) {
        C16985b1 b1Var = C16985b1.f45991e;
        return b1Var.isEmpty() ? new C16985b1() : new C16985b1(b1Var);
    }

    /* renamed from: f */
    public Map<?, ?> mo18730f(Object obj) {
        return (C16985b1) obj;
    }

    /* renamed from: g */
    public int mo18731g(int i, Object obj, Object obj2) {
        C16985b1 b1Var = (C16985b1) obj;
        C24084z0 z0Var = (C24084z0) obj2;
        if (b1Var.isEmpty()) {
            return 0;
        }
        Iterator it = b1Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Object key = entry.getKey();
        Object value = entry.getValue();
        z0Var.getClass();
        C23897n.m29277v(i);
        C24084z0.m30082a((C24084z0.C24085a) null, key, value);
        throw null;
    }

    /* renamed from: h */
    public boolean mo18732h(Object obj) {
        return !((C16985b1) obj).f45992d;
    }
}
