package ny3;

import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;

/* renamed from: ny3.v */
public final /* synthetic */ class C61910v extends C24565l implements C32226l<Class<?>, Class<?>> {

    /* renamed from: d */
    public static final C61910v f176017d = new C61910v();

    public C61910v() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    public Object invoke(Object obj) {
        Class cls = (Class) obj;
        C87412m.m108594g(cls, "p0");
        return cls.getComponentType();
    }
}
