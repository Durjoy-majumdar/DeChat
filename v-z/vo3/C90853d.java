package vo3;

import gy3.C87412m;

/* renamed from: vo3.d */
public final class C90853d {

    /* renamed from: a */
    public static final C90853d f260825a = new C90853d();

    /* renamed from: a */
    public final int mo124950a(Class<?> cls) {
        C87412m.m108594g(cls, "cls");
        C90852c cVar = (C90852c) cls.getAnnotation(C90852c.class);
        if (cVar != null) {
            return cVar.value();
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            return mo124950a(superclass);
        }
        return 1;
    }
}
