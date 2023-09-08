package qy3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Type;
import n04.C25143j0;
import sx3.C110823p;
import wy3.C22935h;
import wy3.C26447e;

/* renamed from: qy3.m */
public final class C25966m extends C87413o implements C32224a<Type> {

    /* renamed from: d */
    public final /* synthetic */ C25143j0 f72344d;

    /* renamed from: e */
    public final /* synthetic */ C25943l<Object>.a f72345e;

    /* renamed from: f */
    public final /* synthetic */ C25943l<Object> f72346f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25966m(C25143j0 j0Var, C25943l<Object>.a aVar, C25943l<Object> lVar) {
        super(0);
        this.f72344d = j0Var;
        this.f72345e = aVar;
        this.f72346f = lVar;
    }

    public Object invoke() {
        C22935h o = this.f72344d.mo37081K0().mo37094o();
        if (o instanceof C26447e) {
            Class<?> h = C25987u0.m33177h((C26447e) o);
            if (h == null) {
                throw new C118215l0("Unsupported superclass of " + this.f72345e + ": " + o);
            } else if (C87412m.m108589b(this.f72346f.f72307e.getSuperclass(), h)) {
                Type genericSuperclass = this.f72346f.f72307e.getGenericSuperclass();
                C87412m.m108593f(genericSuperclass, "{\n                      …ass\n                    }");
                return genericSuperclass;
            } else {
                Class[] interfaces = this.f72346f.f72307e.getInterfaces();
                C87412m.m108593f(interfaces, "jClass.interfaces");
                int J = C110823p.m150984J(interfaces, h);
                if (J >= 0) {
                    Type type = this.f72346f.f72307e.getGenericInterfaces()[J];
                    C87412m.m108593f(type, "{\n                      …ex]\n                    }");
                    return type;
                }
                throw new C118215l0("No superclass of " + this.f72345e + " in Java reflection for " + o);
            }
        } else {
            throw new C118215l0("Supertype not a class: " + o);
        }
    }
}
