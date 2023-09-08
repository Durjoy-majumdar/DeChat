package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n04.C25180t1;
import vz3.C22830f;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26446d1;
import wy3.C26469k;
import wy3.C26490q0;
import wy3.C26504r0;
import wy3.C26505s;
import wy3.C26509u0;
import wy3.C26516w;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.f0 */
public abstract class C26741f0 extends C26758n implements C26490q0 {

    /* renamed from: h */
    public boolean f74340h;

    /* renamed from: i */
    public final boolean f74341i;

    /* renamed from: j */
    public final C26442c0 f74342j;

    /* renamed from: n */
    public final C26504r0 f74343n;

    /* renamed from: o */
    public final boolean f74344o;

    /* renamed from: p */
    public final C26436b.C26437a f74345p;

    /* renamed from: q */
    public C26505s f74346q;

    /* renamed from: r */
    public C26516w f74347r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26741f0(C26442c0 c0Var, C26505s sVar, C26504r0 r0Var, C26571h hVar, C22830f fVar, boolean z, boolean z2, boolean z3, C26436b.C26437a aVar, C26521y0 y0Var) {
        super(r0Var.mo51892b(), hVar, fVar, y0Var);
        if (c0Var == null) {
            m34816D(0);
            throw null;
        } else if (sVar == null) {
            m34816D(1);
            throw null;
        } else if (r0Var == null) {
            m34816D(2);
            throw null;
        } else if (hVar == null) {
            m34816D(3);
            throw null;
        } else if (fVar == null) {
            m34816D(4);
            throw null;
        } else if (y0Var != null) {
            this.f74347r = null;
            this.f74342j = c0Var;
            this.f74346q = sVar;
            this.f74343n = r0Var;
            this.f74340h = z;
            this.f74341i = z2;
            this.f74344o = z3;
            this.f74345p = aVar;
        } else {
            m34816D(5);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m34816D(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: C */
    public boolean mo53472C() {
        return false;
    }

    /* renamed from: D0 */
    public C26516w mo53473D0() {
        return this.f74347r;
    }

    /* renamed from: H */
    public C26509u0 mo52626H() {
        return mo53467u0().mo52626H();
    }

    /* renamed from: H0 */
    public boolean mo53474H0() {
        return false;
    }

    /* renamed from: I */
    public C26509u0 mo52627I() {
        return mo53467u0().mo52627I();
    }

    /* renamed from: I0 */
    public abstract C26490q0 m34833a();

    /* renamed from: J0 */
    public Collection<C26490q0> mo53722J0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (C26504r0 r0Var : mo53467u0().mo52633e()) {
            Object g = z ? r0Var.mo52635g() : r0Var.mo52640i();
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    /* renamed from: M */
    public boolean mo51317M() {
        return false;
    }

    /* renamed from: P */
    public boolean mo51792P() {
        return false;
    }

    /* renamed from: T */
    public List<C26509u0> mo52629T() {
        List<C26509u0> T = mo53467u0().mo52629T();
        if (T != null) {
            return T;
        }
        m34816D(13);
        throw null;
    }

    /* renamed from: V */
    public <V> V mo51326V(C26434a.C22933a<V> aVar) {
        return null;
    }

    /* renamed from: Z */
    public boolean mo51885Z() {
        return false;
    }

    /* renamed from: f */
    public C26436b.C26437a mo52634f() {
        C26436b.C26437a aVar = this.f74345p;
        if (aVar != null) {
            return aVar;
        }
        m34816D(6);
        throw null;
    }

    public List<C26446d1> getTypeParameters() {
        List<C26446d1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34816D(8);
        throw null;
    }

    public C26505s getVisibility() {
        C26505s sVar = this.f74346q;
        if (sVar != null) {
            return sVar;
        }
        m34816D(10);
        throw null;
    }

    public boolean isExternal() {
        return this.f74341i;
    }

    public boolean isInfix() {
        return false;
    }

    public boolean isInline() {
        return this.f74344o;
    }

    public boolean isOperator() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: j */
    public C26442c0 mo51802j() {
        C26442c0 c0Var = this.f74342j;
        if (c0Var != null) {
            return c0Var;
        }
        m34816D(9);
        throw null;
    }

    /* renamed from: n0 */
    public void mo52596n0(Collection<? extends C26436b> collection) {
        if (collection == null) {
            m34816D(15);
            throw null;
        }
    }

    /* renamed from: r0 */
    public boolean mo53466r0() {
        return this.f74340h;
    }

    /* renamed from: u0 */
    public C26504r0 mo53467u0() {
        C26504r0 r0Var = this.f74343n;
        if (r0Var != null) {
            return r0Var;
        }
        m34816D(12);
        throw null;
    }

    /* renamed from: v0 */
    public boolean mo51808v0() {
        return false;
    }

    /* renamed from: y */
    public C26436b mo52598y(C26469k kVar, C26442c0 c0Var, C26505s sVar, C26436b.C26437a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* renamed from: c */
    public C26516w m34835c(C25180t1 t1Var) {
        if (t1Var == null) {
            m34816D(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }
}
