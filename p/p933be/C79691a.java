package p933be;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import p761yd.C91441c;
import p981ie.C87705i;

/* renamed from: be.a */
public final class C79691a {
    /* renamed from: a */
    public static <T extends C114490k0> T m96804a(Class<T> cls) {
        C113173i iVar;
        if (!C91441c.m114729c() || (iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class)) == null) {
            return null;
        }
        return iVar.f338613h.mo165880e(cls);
    }

    /* renamed from: b */
    public static <T extends C114490k0> void m96805b(Class<T> cls, C87705i<T> iVar) {
        C113173i iVar2;
        T e;
        if (C91441c.m114729c() && (iVar2 = (C113173i) C91441c.m114730d().mo125377a(C113173i.class)) != null && (e = iVar2.f338613h.mo165880e(cls)) != null) {
            iVar.accept(e);
        }
    }
}
