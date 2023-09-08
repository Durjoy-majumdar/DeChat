package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import g04.C20770i;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import m04.C24980n;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25165p;
import n04.C25176s0;
import o04.C25323e;
import vz3.C22830f;
import wy3.C26442c0;
import wy3.C26444d;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26453f;
import wy3.C26455f1;
import wy3.C26469k;
import wy3.C26491r;
import wy3.C26505s;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.k */
public class C26754k extends C26752j {

    /* renamed from: n */
    public final C26442c0 f74402n;

    /* renamed from: o */
    public final C26453f f74403o;

    /* renamed from: p */
    public final C25144j1 f74404p;

    /* renamed from: q */
    public C20770i f74405q;

    /* renamed from: r */
    public Set<C26444d> f74406r;

    /* renamed from: s */
    public C26444d f74407s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26754k(C26469k kVar, C22830f fVar, C26442c0 c0Var, C26453f fVar2, Collection<C25143j0> collection, C26521y0 y0Var, boolean z, C24980n nVar) {
        super(nVar, kVar, fVar, y0Var, z);
        if (kVar == null) {
            m34957U(0);
            throw null;
        } else if (fVar == null) {
            m34957U(1);
            throw null;
        } else if (c0Var == null) {
            m34957U(2);
            throw null;
        } else if (fVar2 == null) {
            m34957U(3);
            throw null;
        } else if (collection == null) {
            m34957U(4);
            throw null;
        } else if (y0Var == null) {
            m34957U(5);
            throw null;
        } else if (nVar != null) {
            this.f74402n = c0Var;
            this.f74403o = fVar2;
            this.f74404p = new C25165p(this, Collections.emptyList(), collection, nVar);
        } else {
            m34957U(6);
            throw null;
        }
    }

    /* renamed from: U */
    public static /* synthetic */ void m34957U(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: A0 */
    public C26447e mo51787A0() {
        return null;
    }

    /* renamed from: J0 */
    public final void mo53734J0(C20770i iVar, Set<C26444d> set, C26444d dVar) {
        if (iVar == null) {
            m34957U(7);
            throw null;
        } else if (set != null) {
            this.f74405q = iVar;
            this.f74406r = set;
            this.f74407s = dVar;
        } else {
            m34957U(8);
            throw null;
        }
    }

    /* renamed from: K */
    public C26455f1<C25176s0> mo51789K() {
        return null;
    }

    /* renamed from: N */
    public C20770i mo51790N(C25323e eVar) {
        if (eVar != null) {
            C20770i iVar = this.f74405q;
            if (iVar != null) {
                return iVar;
            }
            m34957U(13);
            throw null;
        }
        m34957U(12);
        throw null;
    }

    /* renamed from: O */
    public boolean mo51791O() {
        return false;
    }

    /* renamed from: P */
    public boolean mo51792P() {
        return false;
    }

    /* renamed from: Q */
    public C20770i mo51793Q() {
        C20770i.C20773b bVar = C20770i.C20773b.f58684b;
        if (bVar != null) {
            return bVar;
        }
        m34957U(14);
        throw null;
    }

    /* renamed from: W */
    public boolean mo51794W() {
        return false;
    }

    /* renamed from: Y */
    public boolean mo51795Y() {
        return false;
    }

    /* renamed from: f */
    public C26453f mo51796f() {
        C26453f fVar = this.f74403o;
        if (fVar != null) {
            return fVar;
        }
        m34957U(15);
        throw null;
    }

    public C26571h getAnnotations() {
        int i = C26571h.f73936P0;
        return C26571h.C26572a.f73937a;
    }

    public C26505s getVisibility() {
        C26505s sVar = C26491r.f73782e;
        if (sVar != null) {
            return sVar;
        }
        m34957U(17);
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: j */
    public C26442c0 mo51802j() {
        C26442c0 c0Var = this.f74402n;
        if (c0Var != null) {
            return c0Var;
        }
        m34957U(16);
        throw null;
    }

    /* renamed from: l */
    public C25144j1 mo36110l() {
        C25144j1 j1Var = this.f74404p;
        if (j1Var != null) {
            return j1Var;
        }
        m34957U(10);
        throw null;
    }

    /* renamed from: p0 */
    public Collection<C26447e> mo51803p0() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34957U(19);
        throw null;
    }

    /* renamed from: q */
    public Collection<C26444d> mo51804q() {
        Set<C26444d> set = this.f74406r;
        if (set != null) {
            return set;
        }
        m34957U(11);
        throw null;
    }

    /* renamed from: t */
    public List<C26446d1> mo51805t() {
        List<C26446d1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34957U(18);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    /* renamed from: v */
    public C26444d mo51807v() {
        return this.f74407s;
    }

    /* renamed from: v0 */
    public boolean mo51808v0() {
        return false;
    }

    /* renamed from: x0 */
    public boolean mo51809x0() {
        return false;
    }

    /* renamed from: z0 */
    public boolean mo51810z0() {
        return false;
    }
}
