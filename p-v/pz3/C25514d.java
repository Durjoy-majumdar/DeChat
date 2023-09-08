package pz3;

import pz3.C25507b;

/* renamed from: pz3.d */
public class C25514d extends C25507b.C25509b {

    /* renamed from: b */
    public final /* synthetic */ C25507b.C25510c f72221b;

    public C25514d(C25507b.C25510c cVar) {
        this.f72221b = cVar;
    }

    /* renamed from: g */
    public void mo52770g(String[] strArr) {
        if (strArr != null) {
            C25507b.this.f72212f = strArr;
        } else {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"}));
        }
    }
}
