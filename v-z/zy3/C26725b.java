package zy3;

import d04.C24442a;
import fy3.C32224a;
import g04.C20770i;
import g04.C24537g;
import g04.C27077n;
import java.util.Collections;
import java.util.List;
import m04.C21480i;
import m04.C24980n;
import n04.C25167p1;
import n04.C25176s0;
import n04.C25180t1;
import n04.C25187v1;
import o04.C25323e;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26447e;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26509u0;
import zz3.C26794h;

/* renamed from: zy3.b */
public abstract class C26725b extends C26787w {

    /* renamed from: d */
    public final C22830f f74304d;

    /* renamed from: e */
    public final C21480i<C25176s0> f74305e;

    /* renamed from: f */
    public final C21480i<C20770i> f74306f;

    /* renamed from: g */
    public final C21480i<C26509u0> f74307g;

    /* renamed from: zy3.b$a */
    public class C26726a implements C32224a<C25176s0> {
        public C26726a() {
        }

        public Object invoke() {
            C26725b bVar = C26725b.this;
            return C25187v1.m32095o(bVar, bVar.mo51798g0(), new C26723a(this));
        }
    }

    /* renamed from: zy3.b$b */
    public class C26727b implements C32224a<C20770i> {
        public C26727b() {
        }

        public Object invoke() {
            return new C24537g(C26725b.this.mo51798g0());
        }
    }

    /* renamed from: zy3.b$c */
    public class C26728c implements C32224a<C26509u0> {
        public C26728c() {
        }

        public Object invoke() {
            return new C26781t(C26725b.this);
        }
    }

    public C26725b(C24980n nVar, C22830f fVar) {
        if (nVar == null) {
            m34742U(0);
            throw null;
        } else if (fVar != null) {
            this.f74304d = fVar;
            this.f74305e = nVar.mo52006g(new C26726a());
            this.f74306f = nVar.mo52006g(new C26727b());
            this.f74307g = nVar.mo52006g(new C26728c());
        } else {
            m34742U(1);
            throw null;
        }
    }

    /* renamed from: U */
    public static /* synthetic */ void m34742U(int i) {
        int i2 = i;
        String str = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i2 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i2 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i2 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i2 == 19) {
            objArr[1] = "substitute";
        } else if (i2 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: D */
    public C20770i mo52591D(C25167p1 p1Var, C25323e eVar) {
        if (p1Var == null) {
            m34742U(10);
            throw null;
        } else if (eVar == null) {
            m34742U(11);
            throw null;
        } else if (p1Var.mo52261e()) {
            C20770i N = mo51790N(eVar);
            if (N != null) {
                return N;
            }
            m34742U(12);
            throw null;
        } else {
            return new C27077n(mo51790N(eVar), C25180t1.m32044e(p1Var));
        }
    }

    /* renamed from: I0 */
    public C26447e mo51921c(C25180t1 t1Var) {
        if (t1Var != null) {
            return t1Var.mo52312h() ? this : new C26784v(this, t1Var);
        }
        m34742U(18);
        throw null;
    }

    /* renamed from: a */
    public C26447e mo36109a() {
        return this;
    }

    /* renamed from: a */
    public C22935h m34746a() {
        return this;
    }

    /* renamed from: a */
    public C26469k m34747a() {
        return this;
    }

    /* renamed from: f0 */
    public C20770i mo51797f0() {
        C20770i iVar = (C20770i) this.f74306f.invoke();
        if (iVar != null) {
            return iVar;
        }
        m34742U(4);
        throw null;
    }

    /* renamed from: g0 */
    public C20770i mo51798g0() {
        C20770i N = mo51790N(C24442a.m30542i(C26794h.m35216d(this)));
        if (N != null) {
            return N;
        }
        m34742U(17);
        throw null;
    }

    public C22830f getName() {
        C22830f fVar = this.f74304d;
        if (fVar != null) {
            return fVar;
        }
        m34742U(2);
        throw null;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        return mVar.mo53456j(this, d);
    }

    /* renamed from: o0 */
    public C26509u0 mo53429o0() {
        C26509u0 u0Var = (C26509u0) this.f74307g.invoke();
        if (u0Var != null) {
            return u0Var;
        }
        m34742U(5);
        throw null;
    }

    /* renamed from: s */
    public C25176s0 mo36111s() {
        C25176s0 s0Var = (C25176s0) this.f74305e.invoke();
        if (s0Var != null) {
            return s0Var;
        }
        m34742U(20);
        throw null;
    }

    /* renamed from: t0 */
    public C20770i mo53430t0(C25167p1 p1Var) {
        if (p1Var != null) {
            C20770i D = mo52591D(p1Var, C24442a.m30542i(C26794h.m35216d(this)));
            if (D != null) {
                return D;
            }
            m34742U(16);
            throw null;
        }
        m34742U(15);
        throw null;
    }

    /* renamed from: w0 */
    public List<C26509u0> mo51894w0() {
        List<C26509u0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34742U(6);
        throw null;
    }
}
