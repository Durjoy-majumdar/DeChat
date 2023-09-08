package n04;

import o04.C25323e;

/* renamed from: n04.o1 */
public class C25164o1 extends C25161n1 {

    /* renamed from: a */
    public final C25202z1 f71614a;

    /* renamed from: b */
    public final C25143j0 f71615b;

    public C25164o1(C25202z1 z1Var, C25143j0 j0Var) {
        if (z1Var == null) {
            m31988c(0);
            throw null;
        } else if (j0Var != null) {
            this.f71614a = z1Var;
            this.f71615b = j0Var;
        } else {
            m31988c(1);
            throw null;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m31988c(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (!(i == 4 || i == 5)) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public C25202z1 mo52295a() {
        C25202z1 z1Var = this.f71614a;
        if (z1Var != null) {
            return z1Var;
        }
        m31988c(4);
        throw null;
    }

    /* renamed from: b */
    public boolean mo52296b() {
        return false;
    }

    public C25143j0 getType() {
        C25143j0 j0Var = this.f71615b;
        if (j0Var != null) {
            return j0Var;
        }
        m31988c(5);
        throw null;
    }

    /* renamed from: n */
    public C25158m1 mo52298n(C25323e eVar) {
        if (eVar != null) {
            return new C25164o1(this.f71614a, eVar.mo52414h(this.f71615b));
        }
        m31988c(6);
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C25164o1(C25143j0 j0Var) {
        this(C25202z1.INVARIANT, j0Var);
        if (j0Var != null) {
        } else {
            m31988c(2);
            throw null;
        }
    }
}
