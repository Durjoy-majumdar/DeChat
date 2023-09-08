package ry3;

import gy3.C87412m;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: ry3.e */
public interface C26121e<M extends Member> {

    /* renamed from: ry3.e$a */
    public static final class C26122a {
        /* renamed from: a */
        public static <M extends Member> void m33553a(C26121e<? extends M> eVar, Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            if (C26147g.m33562a(eVar) != objArr.length) {
                throw new IllegalArgumentException("Callable expects " + C26147g.m33562a(eVar) + " arguments, but " + objArr.length + " were provided.");
            }
        }
    }

    /* renamed from: a */
    List<Type> mo53054a();

    /* renamed from: b */
    M mo53055b();

    Object call(Object[] objArr);

    Type getReturnType();
}
