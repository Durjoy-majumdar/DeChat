package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import vz3.C22830f;
import wy3.C26469k;
import wy3.C26480l;
import wy3.C26483n;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.n */
public abstract class C26758n extends C23594m implements C26480l {

    /* renamed from: f */
    public final C26469k f74410f;

    /* renamed from: g */
    public final C26521y0 f74411g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26758n(C26469k kVar, C26571h hVar, C22830f fVar, C26521y0 y0Var) {
        super(hVar, fVar);
        if (kVar == null) {
            m34996D(0);
            throw null;
        } else if (hVar == null) {
            m34996D(1);
            throw null;
        } else if (fVar == null) {
            m34996D(2);
            throw null;
        } else if (y0Var != null) {
            this.f74410f = kVar;
            this.f74411g = y0Var;
        } else {
            m34996D(3);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m34996D(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6) ? 2 : 3)];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: U */
    public C26483n mo36109a() {
        return this;
    }

    /* renamed from: b */
    public C26469k mo51892b() {
        C26469k kVar = this.f74410f;
        if (kVar != null) {
            return kVar;
        }
        m34996D(5);
        throw null;
    }

    public C26521y0 getSource() {
        C26521y0 y0Var = this.f74411g;
        if (y0Var != null) {
            return y0Var;
        }
        m34996D(6);
        throw null;
    }
}
