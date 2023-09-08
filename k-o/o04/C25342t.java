package o04;

import fy3.C32227p;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C87412m;
import n04.C25143j0;
import ny3.C109824f;
import o04.C25330k;

/* renamed from: o04.t */
public final /* synthetic */ class C25342t extends C24563k implements C32227p<C25143j0, C25143j0, Boolean> {
    public C25342t(Object obj) {
        super(2, obj);
    }

    public final String getName() {
        return "isStrictSupertype";
    }

    public final C109824f getOwner() {
        return C24560g0.m30725a(C25336r.class);
    }

    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public Object invoke(Object obj, Object obj2) {
        C25143j0 j0Var = (C25143j0) obj;
        C25143j0 j0Var2 = (C25143j0) obj2;
        C87412m.m108594g(j0Var, "p0");
        C87412m.m108594g(j0Var2, "p1");
        ((C25336r) this.receiver).getClass();
        C25330k.f71840b.getClass();
        C25332l lVar = C25330k.C25331a.f71842b;
        return Boolean.valueOf(lVar.mo52423d(j0Var, j0Var2) && !lVar.mo52423d(j0Var2, j0Var));
    }
}
