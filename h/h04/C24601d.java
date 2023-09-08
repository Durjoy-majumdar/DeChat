package h04;

import n04.C25143j0;
import wy3.C26434a;

/* renamed from: h04.d */
public class C24601d extends C24598a {

    /* renamed from: c */
    public final C26434a f70199c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24601d(C26434a aVar, C25143j0 j0Var, C24603f fVar) {
        super(j0Var, fVar);
        if (aVar == null) {
            m30779b(0);
            throw null;
        } else if (j0Var != null) {
            this.f70199c = aVar;
        } else {
            m30779b(1);
            throw null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m30779b(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 2 ? 3 : 2)];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public String toString() {
        return getType() + ": Ext {" + this.f70199c + "}";
    }
}
