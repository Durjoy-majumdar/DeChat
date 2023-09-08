package cz3;

import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C87412m;
import java.lang.reflect.Constructor;
import ny3.C109824f;

/* renamed from: cz3.m */
public final /* synthetic */ class C24431m extends C24563k implements C32226l<Constructor<?>, C24438w> {

    /* renamed from: d */
    public static final C24431m f69882d = new C24431m();

    public C24431m() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final C109824f getOwner() {
        return C24560g0.m30725a(C24438w.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    public Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        C87412m.m108594g(constructor, "p0");
        return new C24438w(constructor);
    }
}
