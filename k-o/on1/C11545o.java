package on1;

import cm1.C0740i2;
import gy3.C87412m;
import i31.C117139g;
import wx3.C15601d;

/* renamed from: on1.o */
public interface C11545o<T extends C0740i2> extends C117139g<C11546a, C11575y<T>> {

    /* renamed from: on1.o$a */
    public static final class C11546a {

        /* renamed from: a */
        public final String f33881a;

        public C11546a(String str) {
            C87412m.m108594g(str, "id");
            this.f33881a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11546a) && C87412m.m108589b(this.f33881a, ((C11546a) obj).f33881a);
        }

        public int hashCode() {
            return this.f33881a.hashCode();
        }

        public String toString() {
            return "Key(id=" + this.f33881a + ')';
        }
    }

    /* renamed from: c */
    Object mo11470c(C15601d<? super C11575y<T>> dVar);

    C11546a getKey();
}
