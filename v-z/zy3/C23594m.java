package zy3;

import vz3.C22830f;
import wy3.C26469k;
import xy3.C26565b;
import xy3.C26571h;
import yz3.C23393c;

/* renamed from: zy3.m */
public abstract class C23594m extends C26565b implements C26469k {

    /* renamed from: e */
    public final C22830f f67732e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23594m(C26571h hVar, C22830f fVar) {
        super(hVar);
        if (hVar == null) {
            m28175D(0);
            throw null;
        } else if (fVar != null) {
            this.f67732e = fVar;
        } else {
            m28175D(1);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m28175D(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: N */
    public static String m28176N(C26469k kVar) {
        if (kVar != null) {
            try {
                String str = C23393c.f67153b.mo36858o(kVar) + "[" + kVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(kVar)) + "]";
                if (str != null) {
                    return str;
                }
                m28175D(5);
                throw null;
            } catch (Throwable unused) {
                String str2 = kVar.getClass().getSimpleName() + " " + kVar.getName();
                if (str2 != null) {
                    return str2;
                }
                m28175D(6);
                throw null;
            }
        } else {
            m28175D(4);
            throw null;
        }
    }

    /* renamed from: a */
    public C26469k mo36109a() {
        return this;
    }

    public C22830f getName() {
        C22830f fVar = this.f67732e;
        if (fVar != null) {
            return fVar;
        }
        m28175D(2);
        throw null;
    }

    public String toString() {
        return m28176N(this);
    }
}
