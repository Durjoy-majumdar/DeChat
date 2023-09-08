package n04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m04.C24980n;
import wy3.C26439b1;
import wy3.C26446d1;
import wy3.C26447e;
import zz3.C26794h;

/* renamed from: n04.p */
public class C25165p extends C25105b {

    /* renamed from: c */
    public final C26447e f71616c;

    /* renamed from: d */
    public final List<C26446d1> f71617d;

    /* renamed from: e */
    public final Collection<C25143j0> f71618e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25165p(C26447e eVar, List<? extends C26446d1> list, Collection<C25143j0> collection, C24980n nVar) {
        super(nVar);
        if (eVar == null) {
            m31992j(0);
            throw null;
        } else if (list == null) {
            m31992j(1);
            throw null;
        } else if (collection == null) {
            m31992j(2);
            throw null;
        } else if (nVar != null) {
            this.f71616c = eVar;
            this.f71617d = Collections.unmodifiableList(new ArrayList(list));
            this.f71618e = Collections.unmodifiableCollection(collection);
        } else {
            m31992j(3);
            throw null;
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m31992j(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: c */
    public Collection<C25143j0> mo51811c() {
        Collection<C25143j0> collection = this.f71618e;
        if (collection != null) {
            return collection;
        }
        m31992j(6);
        throw null;
    }

    /* renamed from: f */
    public C26439b1 mo51812f() {
        return C26439b1.C26440a.f73729a;
    }

    public List<C26446d1> getParameters() {
        List<C26446d1> list = this.f71617d;
        if (list != null) {
            return list;
        }
        m31992j(4);
        throw null;
    }

    /* renamed from: k */
    public C26447e mo51813k() {
        C26447e eVar = this.f71616c;
        if (eVar != null) {
            return eVar;
        }
        m31992j(5);
        throw null;
    }

    /* renamed from: p */
    public boolean mo37095p() {
        return true;
    }

    public String toString() {
        return C26794h.m35219g(this.f71616c).mo35984b();
    }
}
