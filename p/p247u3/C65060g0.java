package p247u3;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: u3.g0 */
public abstract class C65060g0 {

    /* renamed from: a */
    public final boolean f187261a;

    /* renamed from: u3.g0$a */
    public static final class C65061a extends C65060g0 {

        /* renamed from: b */
        public final Throwable f187262b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65061a(Throwable th) {
            super(false, (C8480h) null);
            C87412m.m108594g(th, "error");
            this.f187262b = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C65061a) {
                C65061a aVar = (C65061a) obj;
                return this.f187261a == aVar.f187261a && C87412m.m108589b(this.f187262b, aVar.f187262b);
            }
        }

        public int hashCode() {
            return (this.f187261a ? 1231 : 1237) + this.f187262b.hashCode();
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + this.f187261a + ", error=" + this.f187262b + ')';
        }
    }

    /* renamed from: u3.g0$b */
    public static final class C65062b extends C65060g0 {

        /* renamed from: b */
        public static final C65062b f187263b = new C65062b();

        public C65062b() {
            super(false, (C8480h) null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C65062b) && this.f187261a == ((C65062b) obj).f187261a;
        }

        public int hashCode() {
            return this.f187261a ? 1231 : 1237;
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + this.f187261a + ')';
        }
    }

    /* renamed from: u3.g0$c */
    public static final class C65063c extends C65060g0 {

        /* renamed from: b */
        public static final C65063c f187264b = new C65063c(true);

        /* renamed from: c */
        public static final C65063c f187265c = new C65063c(false);

        public C65063c(boolean z) {
            super(z, (C8480h) null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C65063c) && this.f187261a == ((C65063c) obj).f187261a;
        }

        public int hashCode() {
            return this.f187261a ? 1231 : 1237;
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + this.f187261a + ')';
        }
    }

    public C65060g0(boolean z, C8480h hVar) {
        this.f187261a = z;
    }
}
