package zy3;

import h04.C24603f;
import wy3.C26469k;
import xy3.C26571h;

/* renamed from: zy3.j0 */
public class C26753j0 extends C26732d {

    /* renamed from: f */
    public final C26469k f74400f;

    /* renamed from: g */
    public C24603f f74401g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26753j0(C26469k kVar, C24603f fVar, C26571h hVar) {
        super(hVar);
        if (kVar == null) {
            m34955D(0);
            throw null;
        } else if (fVar == null) {
            m34955D(1);
            throw null;
        } else if (hVar != null) {
            this.f74400f = kVar;
            this.f74401g = fVar;
        } else {
            m34955D(2);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m34955D(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 3 || i == 4)) {
            if (i == 5) {
                objArr[2] = "copy";
            } else if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public C26469k mo51892b() {
        C26469k kVar = this.f74400f;
        if (kVar != null) {
            return kVar;
        }
        m34955D(4);
        throw null;
    }

    public C24603f getValue() {
        C24603f fVar = this.f74401g;
        if (fVar != null) {
            return fVar;
        }
        m34955D(3);
        throw null;
    }
}
