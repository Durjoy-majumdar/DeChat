package p1014o4;

/* renamed from: o4.p */
public interface C117696p {

    /* renamed from: a */
    public static final C117698b.C117701c f352024a = new C117698b.C117701c();

    /* renamed from: b */
    public static final C117698b.C117700b f352025b = new C117698b.C117700b((C117697a) null);

    /* renamed from: o4.p$b */
    public static abstract class C117698b {

        /* renamed from: o4.p$b$a */
        public static final class C117699a extends C117698b {

            /* renamed from: a */
            public final Throwable f352026a;

            public C117699a(Throwable th) {
                this.f352026a = th;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f352026a.getMessage()});
            }
        }

        /* renamed from: o4.p$b$b */
        public static final class C117700b extends C117698b {
            public C117700b(C117697a aVar) {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: o4.p$b$c */
        public static final class C117701c extends C117698b {
            public String toString() {
                return "SUCCESS";
            }
        }
    }
}
