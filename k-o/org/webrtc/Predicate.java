package org.webrtc;

public interface Predicate<T> {

    /* renamed from: org.webrtc.Predicate$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        /* renamed from: a */
        public static Predicate m25031a(Predicate predicate, Predicate predicate2) {
            return new Predicate<T>(predicate2) {
                public final /* synthetic */ Predicate val$other;

                {
                    this.val$other = r2;
                }

                public /* synthetic */ Predicate and(Predicate predicate) {
                    return CC.m25031a(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return CC.m25032b(this);
                }

                /* renamed from: or */
                public /* synthetic */ Predicate mo34528or(Predicate predicate) {
                    return CC.m25033c(this, predicate);
                }

                public boolean test(T t) {
                    return Predicate.this.test(t) && this.val$other.test(t);
                }
            };
        }

        /* renamed from: b */
        public static Predicate m25032b(Predicate predicate) {
            return new Predicate<T>() {
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return CC.m25031a(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return CC.m25032b(this);
                }

                /* renamed from: or */
                public /* synthetic */ Predicate mo34528or(Predicate predicate) {
                    return CC.m25033c(this, predicate);
                }

                public boolean test(T t) {
                    return !Predicate.this.test(t);
                }
            };
        }

        /* renamed from: c */
        public static Predicate m25033c(Predicate predicate, Predicate predicate2) {
            return new Predicate<T>(predicate2) {
                public final /* synthetic */ Predicate val$other;

                {
                    this.val$other = r2;
                }

                public /* synthetic */ Predicate and(Predicate predicate) {
                    return CC.m25031a(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return CC.m25032b(this);
                }

                /* renamed from: or */
                public /* synthetic */ Predicate mo34528or(Predicate predicate) {
                    return CC.m25033c(this, predicate);
                }

                public boolean test(T t) {
                    return Predicate.this.test(t) || this.val$other.test(t);
                }
            };
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    /* renamed from: or */
    Predicate<T> mo34528or(Predicate<? super T> predicate);

    boolean test(T t);
}
