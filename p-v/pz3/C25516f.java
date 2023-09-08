package pz3;

import pz3.C25507b;

/* renamed from: pz3.f */
public class C25516f extends C25507b.C25509b {

    /* renamed from: b */
    public final /* synthetic */ C25507b.C25512e f72223b;

    public C25516f(C25507b.C25512e eVar) {
        this.f72223b = eVar;
    }

    /* renamed from: g */
    public void mo52770g(String[] strArr) {
        if (strArr != null) {
            C25507b.this.f72211e = strArr;
        } else {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
        }
    }
}
