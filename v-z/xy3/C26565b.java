package xy3;

/* renamed from: xy3.b */
public class C26565b implements C26564a {

    /* renamed from: d */
    public final C26571h f73915d;

    public C26565b(C26571h hVar) {
        if (hVar != null) {
            this.f73915d = hVar;
        } else {
            m34360D(0);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m34360D(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public C26571h getAnnotations() {
        C26571h hVar = this.f73915d;
        if (hVar != null) {
            return hVar;
        }
        m34360D(1);
        throw null;
    }
}
