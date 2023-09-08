package zy3;

import h04.C24602e;
import h04.C24603f;
import wy3.C26447e;
import wy3.C26469k;
import xy3.C26571h;

/* renamed from: zy3.t */
public class C26781t extends C26732d {

    /* renamed from: f */
    public final C26447e f74501f;

    /* renamed from: g */
    public final C24602e f74502g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26781t(C26447e eVar) {
        super(C26571h.C26572a.f73937a);
        if (eVar != null) {
            int i = C26571h.f73936P0;
            this.f74501f = eVar;
            this.f74502g = new C24602e(eVar, (C24602e) null);
            return;
        }
        m35153D(0);
        throw null;
    }

    /* renamed from: D */
    public static /* synthetic */ void m35153D(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public C26469k mo51892b() {
        C26447e eVar = this.f74501f;
        if (eVar != null) {
            return eVar;
        }
        m35153D(2);
        throw null;
    }

    public C24603f getValue() {
        C24602e eVar = this.f74502g;
        if (eVar != null) {
            return eVar;
        }
        m35153D(1);
        throw null;
    }

    public String toString() {
        return "class " + this.f74501f.getName() + "::this";
    }
}
