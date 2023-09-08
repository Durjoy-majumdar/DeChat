package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import m04.C24980n;
import vz3.C22830f;
import wy3.C26469k;
import wy3.C26521y0;

/* renamed from: zy3.j */
public abstract class C26752j extends C26725b {

    /* renamed from: h */
    public final C26469k f74397h;

    /* renamed from: i */
    public final C26521y0 f74398i;

    /* renamed from: j */
    public final boolean f74399j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26752j(C24980n nVar, C26469k kVar, C22830f fVar, C26521y0 y0Var, boolean z) {
        super(nVar, fVar);
        if (nVar == null) {
            m34953U(0);
            throw null;
        } else if (kVar == null) {
            m34953U(1);
            throw null;
        } else if (fVar == null) {
            m34953U(2);
            throw null;
        } else if (y0Var != null) {
            this.f74397h = kVar;
            this.f74398i = y0Var;
            this.f74399j = z;
        } else {
            m34953U(3);
            throw null;
        }
    }

    /* renamed from: U */
    public static /* synthetic */ void m34953U(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public C26469k mo51892b() {
        C26469k kVar = this.f74397h;
        if (kVar != null) {
            return kVar;
        }
        m34953U(4);
        throw null;
    }

    public C26521y0 getSource() {
        C26521y0 y0Var = this.f74398i;
        if (y0Var != null) {
            return y0Var;
        }
        m34953U(5);
        throw null;
    }

    public boolean isExternal() {
        return this.f74399j;
    }
}
