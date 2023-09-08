package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import m04.C24980n;
import n04.C25202z1;
import vz3.C22830f;
import wy3.C26439b1;
import wy3.C26469k;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.c */
public abstract class C26730c extends C26742g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26730c(C24980n nVar, C26469k kVar, C26571h hVar, C22830f fVar, C25202z1 z1Var, boolean z, int i, C26521y0 y0Var, C26439b1 b1Var) {
        super(nVar, kVar, hVar, fVar, z1Var, z, i, y0Var, b1Var);
        if (nVar == null) {
            m34765D(0);
            throw null;
        } else if (kVar == null) {
            m34765D(1);
            throw null;
        } else if (hVar == null) {
            m34765D(2);
            throw null;
        } else if (fVar == null) {
            m34765D(3);
            throw null;
        } else if (z1Var == null) {
            m34765D(4);
            throw null;
        } else if (y0Var == null) {
            m34765D(5);
            throw null;
        } else if (b1Var != null) {
        } else {
            m34765D(6);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m34765D(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = this.f74349i ? "reified " : str;
        if (mo53423o() != C25202z1.INVARIANT) {
            str = mo53423o() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
