package w04;

/* renamed from: w04.g */
public class C26418g {

    /* renamed from: a */
    public static final Object f73685a = new C26419a();

    /* renamed from: w04.g$a */
    public static class C26419a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: w04.g$b */
    public static final class C26420b {

        /* renamed from: a */
        public final Throwable f73686a;

        public C26420b(Throwable th, C26419a aVar) {
            if (th != null) {
                this.f73686a = th;
            } else {
                m34017a(0);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m34017a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public String toString() {
            return this.f73686a.toString();
        }
    }

    /* renamed from: a */
    public static <V> V m34016a(Object obj) {
        if (!(obj instanceof C26420b)) {
            return obj;
        }
        Throwable th = ((C26420b) obj).f73686a;
        if (th != null) {
            throw th;
        }
        C26420b.m34017a(1);
        throw null;
    }
}
