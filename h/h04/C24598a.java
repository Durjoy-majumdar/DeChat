package h04;

import n04.C25143j0;

/* renamed from: h04.a */
public abstract class C24598a implements C24603f {

    /* renamed from: a */
    public final C25143j0 f70195a;

    /* renamed from: b */
    public final C24603f f70196b;

    public C24598a(C25143j0 j0Var, C24603f fVar) {
        if (j0Var != null) {
            this.f70195a = j0Var;
            this.f70196b = fVar == null ? this : fVar;
            return;
        }
        m30778b(0);
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ void m30778b(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C25143j0 getType() {
        C25143j0 j0Var = this.f70195a;
        if (j0Var != null) {
            return j0Var;
        }
        m30778b(1);
        throw null;
    }
}
