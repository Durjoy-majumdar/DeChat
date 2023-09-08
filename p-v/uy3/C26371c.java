package uy3;

import gy3.C8480h;
import gy3.C87412m;
import ty3.C26343l;
import vz3.C22826c;
import vz3.C22830f;
import z04.C112551y;

/* renamed from: uy3.c */
public enum C26371c {
    Function(C26343l.f73376j, "Function", false, false),
    SuspendFunction(C26343l.f73370d, "SuspendFunction", true, false),
    KFunction(r11, "KFunction", false, true),
    KSuspendFunction(r11, "KSuspendFunction", true, true);
    

    /* renamed from: f */
    public static final C26372a f73565f = null;

    /* renamed from: d */
    public final C22826c f73571d;

    /* renamed from: e */
    public final String f73572e;

    /* renamed from: uy3.c$a */
    public static final class C26372a {

        /* renamed from: uy3.c$a$a */
        public static final class C26373a {

            /* renamed from: a */
            public final C26371c f73573a;

            /* renamed from: b */
            public final int f73574b;

            public C26373a(C26371c cVar, int i) {
                C87412m.m108594g(cVar, "kind");
                this.f73573a = cVar;
                this.f73574b = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26373a)) {
                    return false;
                }
                C26373a aVar = (C26373a) obj;
                return this.f73573a == aVar.f73573a && this.f73574b == aVar.f73574b;
            }

            public int hashCode() {
                return (this.f73573a.hashCode() * 31) + this.f73574b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f73573a + ", arity=" + this.f73574b + ')';
            }
        }

        public C26372a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C26373a mo53357a(String str, C22826c cVar) {
            C26371c cVar2;
            Integer num;
            C87412m.m108594g(str, "className");
            C87412m.m108594g(cVar, "packageFqName");
            C26371c[] values = C26371c.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar2 = null;
                    break;
                }
                cVar2 = values[i];
                if (C87412m.m108589b(cVar2.f73571d, cVar) && C112551y.m153819s(str, cVar2.f73572e, false)) {
                    break;
                }
                i++;
            }
            if (cVar2 == null) {
                return null;
            }
            String substring = str.substring(cVar2.f73572e.length());
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            if (!(substring.length() == 0)) {
                int length2 = substring.length();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= length2) {
                        num = Integer.valueOf(i3);
                        break;
                    }
                    int charAt = substring.charAt(i2) - '0';
                    if (!(charAt >= 0 && charAt < 10)) {
                        break;
                    }
                    i3 = (i3 * 10) + charAt;
                    i2++;
                }
            }
            num = null;
            if (num != null) {
                return new C26373a(cVar2, num.intValue());
            }
            return null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f73565f = new C26372a((C8480h) null);
    }

    /* access modifiers changed from: public */
    C26371c(C22826c cVar, String str, boolean z, boolean z2) {
        this.f73571d = cVar;
        this.f73572e = str;
    }

    /* renamed from: a */
    public final C22830f mo53356a(int i) {
        return C22830f.m26794f(this.f73572e + i);
    }
}
