package p246u1;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C36565b;

/* renamed from: u1.x */
public final class C111094x extends C87413o implements C32227p<C111063a<C36565b<? extends Boolean>>, C111063a<C36565b<? extends Boolean>>, C111063a<C36565b<? extends Boolean>>> {

    /* renamed from: d */
    public static final C111094x f332673d = new C111094x();

    public C111094x() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        String str;
        T t;
        C111063a aVar = (C111063a) obj;
        C111063a aVar2 = (C111063a) obj2;
        C87412m.m108594g(aVar2, "childValue");
        if (aVar == null || (str = aVar.f332590a) == null) {
            str = aVar2.f332590a;
        }
        if (aVar == null || (t = aVar.f332591b) == null) {
            t = aVar2.f332591b;
        }
        return new C111063a(str, t);
    }
}
