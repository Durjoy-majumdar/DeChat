package cz3;

import fy3.C32226l;
import gy3.C87413o;

/* renamed from: cz3.p */
public final class C7155p extends C87413o implements C32226l<Class<?>, Boolean> {

    /* renamed from: d */
    public static final C7155p f25133d = new C7155p();

    public C7155p() {
        super(1);
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
    }
}
