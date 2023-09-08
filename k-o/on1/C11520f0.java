package on1;

import cm1.C0740i2;
import gy3.C87412m;

/* renamed from: on1.f0 */
public interface C11520f0<T extends C0740i2> {

    /* renamed from: on1.f0$a */
    public static final class C11521a<T extends C0740i2> implements C11520f0<T> {

        /* renamed from: a */
        public final C11575y<T> f33839a;

        public C11521a(C11575y<T> yVar) {
            C87412m.m108594g(yVar, "data");
            this.f33839a = yVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11521a) && C87412m.m108589b(this.f33839a, ((C11521a) obj).f33839a);
        }

        public int hashCode() {
            return this.f33839a.hashCode();
        }

        public String toString() {
            return "FirstScreenState(data=" + this.f33839a + ')';
        }
    }

    /* renamed from: on1.f0$b */
    public static final class C11522b<T extends C0740i2> implements C11520f0<T> {

        /* renamed from: a */
        public final C11575y<T> f33840a;

        public C11522b(C11575y<T> yVar) {
            C87412m.m108594g(yVar, "data");
            this.f33840a = yVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11522b) && C87412m.m108589b(this.f33840a, ((C11522b) obj).f33840a);
        }

        public int hashCode() {
            return this.f33840a.hashCode();
        }

        public String toString() {
            return "LoadedMoreState(data=" + this.f33840a + ')';
        }
    }

    /* renamed from: on1.f0$c */
    public static final class C11523c<T extends C0740i2> implements C11520f0<T> {

        /* renamed from: a */
        public final C11575y<T> f33841a;

        public C11523c(C11575y<T> yVar) {
            C87412m.m108594g(yVar, "data");
            this.f33841a = yVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11523c) && C87412m.m108589b(this.f33841a, ((C11523c) obj).f33841a);
        }

        public int hashCode() {
            return this.f33841a.hashCode();
        }

        public String toString() {
            return "RefreshedState(data=" + this.f33841a + ')';
        }
    }
}
