package h04;

import n04.C25143j0;

/* renamed from: h04.i */
public class C24606i extends C24598a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24606i(C25143j0 j0Var) {
        super(j0Var, (C24603f) null);
        if (j0Var == null) {
            m30783b(0);
            throw null;
        } else if (j0Var != null) {
        } else {
            m30783b(1);
            throw null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m30783b(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }
}
