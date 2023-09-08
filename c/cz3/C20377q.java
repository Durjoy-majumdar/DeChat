package cz3;

import fy3.C32226l;
import gy3.C87413o;
import vz3.C22830f;

/* renamed from: cz3.q */
public final class C20377q extends C87413o implements C32226l<Class<?>, C22830f> {

    /* renamed from: d */
    public static final C20377q f57101d = new C20377q();

    public C20377q() {
        super(1);
    }

    public Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!C22830f.m26795g(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return C22830f.m26794f(simpleName);
        }
        return null;
    }
}
