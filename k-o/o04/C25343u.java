package o04;

import fy3.C32227p;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C87412m;
import n04.C25143j0;
import ny3.C109824f;

/* renamed from: o04.u */
public final /* synthetic */ class C25343u extends C24563k implements C32227p<C25143j0, C25143j0, Boolean> {
    public C25343u(Object obj) {
        super(2, obj);
    }

    public final String getName() {
        return "equalTypes";
    }

    public final C109824f getOwner() {
        return C24560g0.m30725a(C25332l.class);
    }

    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public Object invoke(Object obj, Object obj2) {
        C25143j0 j0Var = (C25143j0) obj;
        C25143j0 j0Var2 = (C25143j0) obj2;
        C87412m.m108594g(j0Var, "p0");
        C87412m.m108594g(j0Var2, "p1");
        return Boolean.valueOf(((C25332l) this.receiver).mo52404a(j0Var, j0Var2));
    }
}
