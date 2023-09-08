package c14;

import gy3.C87412m;

/* renamed from: c14.l */
public final class C54630l<T> {

    /* renamed from: b */
    public static final C54632b f153152b = new C54632b();

    /* renamed from: a */
    public final Object f153153a;

    /* renamed from: c14.l$a */
    public static final class C54631a extends C54632b {

        /* renamed from: a */
        public final Throwable f153154a;

        public C54631a(Throwable th) {
            this.f153154a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C54631a) && C87412m.m108589b(this.f153154a, ((C54631a) obj).f153154a);
        }

        public int hashCode() {
            Throwable th = this.f153154a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f153154a + ')';
        }
    }

    /* renamed from: c14.l$b */
    public static class C54632b {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ C54630l(Object obj) {
        this.f153153a = obj;
    }

    /* renamed from: a */
    public static final T m61480a(Object obj) {
        Throwable th;
        if (!(obj instanceof C54632b)) {
            return obj;
        }
        if (!(obj instanceof C54631a) || (th = ((C54631a) obj).f153154a) == null) {
            throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
        }
        throw th;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C54630l) && C87412m.m108589b(this.f153153a, ((C54630l) obj).f153153a);
    }

    public int hashCode() {
        Object obj = this.f153153a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        Object obj = this.f153153a;
        if (obj instanceof C54631a) {
            return ((C54631a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
