package zy3;

import h04.C24606i;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import n04.C25143j0;
import n04.C25180t1;
import n04.C25202z1;
import vz3.C26409h;
import wy3.C26434a;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26463h1;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26491r;
import wy3.C26505s;
import wy3.C26509u0;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.d */
public abstract class C26732d extends C23594m implements C26509u0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26732d(C26571h hVar) {
        super(hVar, C26409h.f73650d);
        if (hVar != null) {
        } else {
            m34785D(0);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m34785D(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
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

    /* renamed from: a */
    public C26434a mo36109a() {
        return this;
    }

    /* renamed from: a */
    public C26469k m34790a() {
        return this;
    }

    /* renamed from: e */
    public Collection<? extends C26434a> mo52633e() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m34785D(6);
        throw null;
    }

    public C25143j0 getReturnType() {
        return getType();
    }

    public C26521y0 getSource() {
        return C26521y0.f73808a;
    }

    public C25143j0 getType() {
        C25143j0 type = getValue().getType();
        if (type != null) {
            return type;
        }
        m34785D(4);
        throw null;
    }

    public List<C26446d1> getTypeParameters() {
        List<C26446d1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34785D(3);
        throw null;
    }

    public C26505s getVisibility() {
        C26505s sVar = C26491r.f73783f;
        if (sVar != null) {
            return sVar;
        }
        m34785D(7);
        throw null;
    }

    /* renamed from: h */
    public List<C26463h1> mo52639h() {
        List<C26463h1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34785D(5);
        throw null;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        return mVar.mo53453g(this, d);
    }

    /* renamed from: c */
    public C26509u0 m34792c(C25180t1 t1Var) {
        C25143j0 j0Var;
        if (t1Var == null) {
            m34785D(1);
            throw null;
        } else if (t1Var.mo52312h()) {
            return this;
        } else {
            if (mo51892b() instanceof C26447e) {
                j0Var = t1Var.mo52314k(getType(), C25202z1.OUT_VARIANCE);
            } else {
                j0Var = t1Var.mo52314k(getType(), C25202z1.INVARIANT);
            }
            if (j0Var == null) {
                return null;
            }
            if (j0Var == getType()) {
                return this;
            }
            return new C26753j0(mo51892b(), new C24606i(j0Var), getAnnotations());
        }
    }
}
