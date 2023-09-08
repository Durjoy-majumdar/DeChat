package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;
import n04.C25143j0;
import vz3.C22830f;
import wy3.C26446d1;
import wy3.C26463h1;
import wy3.C26466i1;
import wy3.C26469k;
import wy3.C26509u0;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.q0 */
public abstract class C26774q0 extends C26758n implements C26466i1 {

    /* renamed from: h */
    public C25143j0 f74443h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26774q0(C26469k kVar, C26571h hVar, C22830f fVar, C25143j0 j0Var, C26521y0 y0Var) {
        super(kVar, hVar, fVar, y0Var);
        if (kVar == null) {
            m35088D(0);
            throw null;
        } else if (hVar == null) {
            m35088D(1);
            throw null;
        } else if (fVar == null) {
            m35088D(2);
            throw null;
        } else if (y0Var != null) {
            this.f74443h = j0Var;
        } else {
            m35088D(3);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m35088D(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: H */
    public C26509u0 mo52626H() {
        return null;
    }

    /* renamed from: I */
    public C26509u0 mo52627I() {
        return null;
    }

    /* renamed from: M */
    public boolean mo51317M() {
        return false;
    }

    public C25143j0 getReturnType() {
        C25143j0 type = getType();
        if (type != null) {
            return type;
        }
        m35088D(10);
        throw null;
    }

    public C25143j0 getType() {
        C25143j0 j0Var = this.f74443h;
        if (j0Var != null) {
            return j0Var;
        }
        m35088D(4);
        throw null;
    }

    public List<C26446d1> getTypeParameters() {
        List<C26446d1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m35088D(8);
        throw null;
    }

    /* renamed from: h */
    public List<C26463h1> mo52639h() {
        List<C26463h1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m35088D(6);
        throw null;
    }
}
