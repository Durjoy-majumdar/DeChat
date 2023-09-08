package zy3;

import b04.C23649g;
import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32224a;
import m04.C24976j;
import n04.C25143j0;
import vz3.C22830f;
import wy3.C26469k;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.r0 */
public abstract class C26776r0 extends C26774q0 {

    /* renamed from: i */
    public final boolean f74445i;

    /* renamed from: j */
    public C24976j<C23649g<?>> f74446j;

    /* renamed from: n */
    public C32224a<C24976j<C23649g<?>>> f74447n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26776r0(C26469k kVar, C26571h hVar, C22830f fVar, C25143j0 j0Var, boolean z, C26521y0 y0Var) {
        super(kVar, hVar, fVar, j0Var, y0Var);
        if (kVar == null) {
            m35093D(0);
            throw null;
        } else if (hVar == null) {
            m35093D(1);
            throw null;
        } else if (fVar == null) {
            m35093D(2);
            throw null;
        } else if (y0Var != null) {
            this.f74445i = z;
        } else {
            m35093D(3);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m35093D(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: I0 */
    public void mo53748I0(C24976j<C23649g<?>> jVar, C32224a<C24976j<C23649g<?>>> aVar) {
        if (aVar != null) {
            this.f74447n = aVar;
            if (jVar == null) {
                jVar = aVar.invoke();
            }
            this.f74446j = jVar;
            return;
        }
        m35093D(5);
        throw null;
    }

    /* renamed from: R */
    public C23649g<?> mo52628R() {
        C24976j<C23649g<?>> jVar = this.f74446j;
        if (jVar != null) {
            return (C23649g) jVar.invoke();
        }
        return null;
    }

    /* renamed from: c0 */
    public boolean mo52631c0() {
        return this.f74445i;
    }
}
