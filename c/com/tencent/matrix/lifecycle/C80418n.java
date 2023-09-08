package com.tencent.matrix.lifecycle;

import fy3.C32229r;
import gy3.C87413o;
import p723vf.C118672d;
import rx3.C13598b0;

/* renamed from: com.tencent.matrix.lifecycle.n */
public final class C80418n extends C87413o implements C32229r<String, String, Integer, Boolean, C13598b0> {

    /* renamed from: d */
    public static final C80418n f235362d = new C80418n();

    public C80418n() {
        super(4);
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        String a = C80415l.f235359c.mo111904a();
        C118672d.m167353c(a, "Death Listener: process " + ((Integer) obj3) + '-' + ((String) obj2) + " died on scene " + ((String) obj) + ", is LRU Kill? " + ((Boolean) obj4), new Object[0]);
        return C13598b0.f38549a;
    }
}
