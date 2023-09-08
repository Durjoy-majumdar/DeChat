package cz3;

import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C87412m;
import java.lang.reflect.Method;
import ny3.C109824f;

/* renamed from: cz3.s */
public final /* synthetic */ class C24434s extends C24563k implements C32226l<Method, C24409c0> {

    /* renamed from: d */
    public static final C24434s f69885d = new C24434s();

    public C24434s() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final C109824f getOwner() {
        return C24560g0.m30725a(C24409c0.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    public Object invoke(Object obj) {
        Method method = (Method) obj;
        C87412m.m108594g(method, "p0");
        return new C24409c0(method);
    }
}
