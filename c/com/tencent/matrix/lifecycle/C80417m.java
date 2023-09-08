package com.tencent.matrix.lifecycle;

import fy3.C32228q;
import gy3.C87413o;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.lifecycle.m */
public final class C80417m extends C87413o implements C32228q<String, String, Integer, Boolean> {

    /* renamed from: d */
    public static final C80417m f235361d = new C80417m();

    public C80417m() {
        super(3);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String a = C80415l.f235359c.mo111904a();
        C118672d.m167353c(a, "Dying Listener: process " + ((Integer) obj3) + '-' + ((String) obj2) + " is dying on scene " + ((String) obj), new Object[0]);
        return Boolean.FALSE;
    }
}
