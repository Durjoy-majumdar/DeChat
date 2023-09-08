package yz3;

import gy3.C8480h;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: yz3.r */
public enum C23419r {
    ;

    /* renamed from: yz3.r$a */
    public static final class C23420a extends C23419r {
        public C23420a(String str, int i) {
            super(str, i, (C8480h) null);
        }

        /* renamed from: a */
        public String mo36886a(String str) {
            C87412m.m108594g(str, "string");
            return C112551y.m153814n(C112551y.m153814n(str, "<", "&lt;", false), ">", "&gt;", false);
        }
    }

    /* renamed from: yz3.r$b */
    public static final class C23421b extends C23419r {
        public C23421b(String str, int i) {
            super(str, i, (C8480h) null);
        }

        /* renamed from: a */
        public String mo36886a(String str) {
            C87412m.m108594g(str, "string");
            return str;
        }
    }

    /* access modifiers changed from: public */
    C23419r(C8480h hVar) {
    }

    /* renamed from: a */
    public abstract String mo36886a(String str);
}
