package hz3;

import b04.C23649g;
import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32224a;
import fz3.C24503f0;
import gy3.C87412m;
import java.util.List;
import m04.C24976j;
import n04.C25143j0;
import n04.C25187v1;
import nz3.C25263e;
import nz3.C25310x;
import o04.C25335o;
import rx3.C13604l;
import sx3.C64186f0;
import ty3.C26336h;
import ty3.C26348p;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26463h1;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26505s;
import wy3.C26507t0;
import wy3.C26521y0;
import xy3.C26571h;
import zy3.C26746g0;
import zy3.C26749h0;
import zy3.C26751i0;
import zz3.C26792g;

/* renamed from: hz3.f */
public class C24614f extends C26746g0 implements C24607a {

    /* renamed from: H */
    public final boolean f70218H;

    /* renamed from: I */
    public final C13604l<C26434a.C22933a<?>, ?> f70219I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24614f(C26469k kVar, C26571h hVar, C26442c0 c0Var, C26505s sVar, boolean z, C22830f fVar, C26521y0 y0Var, C26504r0 r0Var, C26436b.C26437a aVar, boolean z2, C13604l<C26434a.C22933a<?>, ?> lVar) {
        super(kVar, r0Var, hVar, c0Var, sVar, z, fVar, aVar, y0Var, false, false, false, false, false, false);
        if (kVar == null) {
            m30801D(0);
            throw null;
        } else if (hVar == null) {
            m30801D(1);
            throw null;
        } else if (c0Var == null) {
            m30801D(2);
            throw null;
        } else if (sVar == null) {
            m30801D(3);
            throw null;
        } else if (fVar == null) {
            m30801D(4);
            throw null;
        } else if (y0Var == null) {
            m30801D(5);
            throw null;
        } else if (aVar != null) {
            this.f70218H = z2;
            this.f70219I = lVar;
        } else {
            m30801D(6);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m30801D(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 21 ? 3 : 2)];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 21 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: P0 */
    public static C24614f m30802P0(C26469k kVar, C26571h hVar, C26442c0 c0Var, C26505s sVar, boolean z, C22830f fVar, C26521y0 y0Var, boolean z2) {
        if (kVar == null) {
            m30801D(7);
            throw null;
        } else if (hVar == null) {
            m30801D(8);
            throw null;
        } else if (c0Var == null) {
            m30801D(9);
            throw null;
        } else if (sVar == null) {
            m30801D(10);
            throw null;
        } else if (fVar == null) {
            m30801D(11);
            throw null;
        } else if (y0Var != null) {
            return new C24614f(kVar, hVar, c0Var, sVar, z, fVar, y0Var, (C26504r0) null, C26436b.C26437a.DECLARATION, z2, (C13604l<C26434a.C22933a<?>, ?>) null);
        } else {
            m30801D(12);
            throw null;
        }
    }

    /* renamed from: K0 */
    public C26746g0 mo51324K0(C26469k kVar, C26442c0 c0Var, C26505s sVar, C26504r0 r0Var, C26436b.C26437a aVar, C22830f fVar, C26521y0 y0Var) {
        if (kVar == null) {
            m30801D(13);
            throw null;
        } else if (c0Var == null) {
            m30801D(14);
            throw null;
        } else if (sVar == null) {
            m30801D(15);
            throw null;
        } else if (aVar == null) {
            m30801D(16);
            throw null;
        } else if (fVar == null) {
            m30801D(17);
            throw null;
        } else if (y0Var != null) {
            return new C24614f(kVar, getAnnotations(), c0Var, sVar, this.f74445i, fVar, y0Var, r0Var, aVar, this.f70218H, this.f70219I);
        } else {
            m30801D(18);
            throw null;
        }
    }

    /* renamed from: M */
    public boolean mo51317M() {
        return false;
    }

    /* renamed from: N0 */
    public void mo51325N0(C25143j0 j0Var) {
        if (j0Var == null) {
            m30801D(22);
            throw null;
        }
    }

    /* renamed from: V */
    public <V> V mo51326V(C26434a.C22933a<V> aVar) {
        C13604l<C26434a.C22933a<?>, ?> lVar = this.f70219I;
        if (lVar == null || !((C26434a.C22933a) lVar.f38555d).equals(aVar)) {
            return null;
        }
        return this.f70219I.f38556e;
    }

    /* renamed from: i0 */
    public boolean mo51327i0() {
        C25143j0 type = getType();
        if (!this.f70218H) {
            return false;
        }
        C87412m.m108594g(type, "type");
        if (!(((C26336h.m33831H(type) || C26348p.m33867a(type)) && !C25187v1.m32087g(type)) || C26336h.m33833J(type))) {
            return false;
        }
        C25263e eVar = C25310x.f71810a;
        C25335o oVar = C25335o.f71846a;
        C22826c cVar = C24503f0.f70045p;
        C87412m.m108593f(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return !oVar.mo52481u0(type, cVar) || C26336h.m33833J(type);
    }

    /* renamed from: y0 */
    public C24607a mo51315y0(C25143j0 j0Var, List<C25143j0> list, C25143j0 j0Var2, C13604l<C26434a.C22933a<?>, ?> lVar) {
        C26749h0 h0Var;
        C26751i0 i0Var;
        C25143j0 j0Var3 = j0Var;
        C25143j0 j0Var4 = j0Var2;
        if (list == null) {
            m30801D(19);
            throw null;
        } else if (j0Var4 != null) {
            C26504r0 a = m34885a() == this ? null : m34885a();
            C24614f fVar = r5;
            C24614f fVar2 = new C24614f(mo51892b(), getAnnotations(), mo51802j(), getVisibility(), this.f74445i, getName(), getSource(), a, mo52634f(), this.f70218H, lVar);
            C26749h0 h0Var2 = this.f74364D;
            if (h0Var2 != null) {
                h0Var = r5;
                C26749h0 h0Var3 = new C26749h0(fVar, h0Var2.getAnnotations(), h0Var2.mo51802j(), h0Var2.getVisibility(), h0Var2.f74340h, h0Var2.f74341i, h0Var2.f74344o, mo52634f(), a == null ? null : a.mo52635g(), h0Var2.getSource());
                h0Var.f74347r = h0Var2.f74347r;
                h0Var.mo53729L0(j0Var4);
            } else {
                h0Var = null;
            }
            C26507t0 t0Var = this.f74365E;
            if (t0Var != null) {
                C26751i0 i0Var2 = r5;
                C26751i0 i0Var3 = new C26751i0(fVar, t0Var.getAnnotations(), t0Var.mo51802j(), t0Var.getVisibility(), t0Var.mo53466r0(), t0Var.isExternal(), t0Var.isInline(), mo52634f(), a == null ? null : a.mo52640i(), t0Var.getSource());
                i0Var2.f74347r = i0Var2.f74347r;
                C26463h1 h1Var = t0Var.mo52639h().get(0);
                if (h1Var != null) {
                    i0Var2.f74395s = h1Var;
                    i0Var = i0Var2;
                } else {
                    C26751i0.m34941D(6);
                    throw null;
                }
            } else {
                i0Var = null;
            }
            C24614f fVar3 = fVar;
            fVar3.mo53725M0(h0Var, i0Var, this.f74366F, this.f74367G);
            C32224a<C24976j<C23649g<?>>> aVar = this.f74447n;
            if (aVar != null) {
                fVar3.mo53748I0(this.f74446j, aVar);
            }
            fVar3.mo52596n0(mo52633e());
            C25143j0 j0Var5 = j0Var;
            fVar3.mo53726O0(j0Var2, getTypeParameters(), this.f74361A, j0Var5 == null ? null : C26792g.m35208g(this, j0Var5, C26571h.C26572a.f73937a), C64186f0.f181907d);
            return fVar3;
        } else {
            m30801D(20);
            throw null;
        }
    }
}
