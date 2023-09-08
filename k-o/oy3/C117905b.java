package oy3;

import gy3.C87412m;

/* renamed from: oy3.b */
public final class C117905b extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117905b(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
        C87412m.m108594g(illegalAccessException, "cause");
    }
}
