package zl0;

import gy3.C87412m;

/* renamed from: zl0.o */
public abstract class C91789o<T> {

    /* renamed from: zl0.o$a */
    public static final class C91790a<T> extends C91789o<T> {

        /* renamed from: a */
        public final int f262869a;

        /* renamed from: b */
        public final String f262870b;

        public C91790a(int i, String str) {
            C87412m.m108594g(str, "errMsg");
            this.f262869a = i;
            this.f262870b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C91790a)) {
                return false;
            }
            C91790a aVar = (C91790a) obj;
            return this.f262869a == aVar.f262869a && C87412m.m108589b(this.f262870b, aVar.f262870b);
        }

        public int hashCode() {
            return (this.f262869a * 31) + this.f262870b.hashCode();
        }

        public String toString() {
            return "Failure(errCode=" + this.f262869a + ", errMsg=" + this.f262870b + ')';
        }
    }

    /* renamed from: zl0.o$b */
    public static final class C91791b<T> extends C91789o<T> {

        /* renamed from: a */
        public final T f262871a;

        public C91791b(T t) {
            this.f262871a = t;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C91791b) && C87412m.m108589b(this.f262871a, ((C91791b) obj).f262871a);
        }

        public int hashCode() {
            T t = this.f262871a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(ret=" + this.f262871a + ')';
        }
    }
}
