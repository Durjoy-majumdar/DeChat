package cz3;

import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C87412m;
import java.lang.reflect.Field;
import ny3.C109824f;

/* renamed from: cz3.o */
public final /* synthetic */ class C24433o extends C24563k implements C32226l<Field, C24441z> {

    /* renamed from: d */
    public static final C24433o f69884d = new C24433o();

    public C24433o() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final C109824f getOwner() {
        return C24560g0.m30725a(C24441z.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    public Object invoke(Object obj) {
        Field field = (Field) obj;
        C87412m.m108594g(field, "p0");
        return new C24441z(field);
    }
}
