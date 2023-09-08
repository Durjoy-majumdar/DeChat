package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import n04.C25180t1;
import vz3.C22830f;
import vz3.C26409h;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26444d;
import wy3.C26447e;
import wy3.C26463h1;
import wy3.C26467j;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26505s;
import wy3.C26516w;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.i */
public class C26750i extends C26777s implements C26444d {

    /* renamed from: K */
    public final boolean f74394K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26750i(C26447e eVar, C26467j jVar, C26571h hVar, boolean z, C26436b.C26437a aVar, C26521y0 y0Var) {
        super(eVar, jVar, hVar, C26409h.f73651e, aVar, y0Var);
        if (eVar == null) {
            m34916D(0);
            throw null;
        } else if (hVar == null) {
            m34916D(1);
            throw null;
        } else if (aVar == null) {
            m34916D(2);
            throw null;
        } else if (y0Var != null) {
            this.f74394K = z;
        } else {
            m34916D(3);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m34916D(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: I0 */
    public C26516w mo52594I0(C26469k kVar, C26442c0 c0Var, C26505s sVar, C26436b.C26437a aVar, boolean z) {
        C26444d dVar = (C26444d) super.mo52598y(kVar, c0Var, sVar, aVar, z);
        if (dVar != null) {
            return dVar;
        }
        m34916D(27);
        throw null;
    }

    /* renamed from: L */
    public boolean mo53445L() {
        return this.f74394K;
    }

    /* renamed from: S0 */
    public C26750i mo51316J0(C26469k kVar, C26516w wVar, C26436b.C26437a aVar, C22830f fVar, C26571h hVar, C26521y0 y0Var) {
        if (kVar == null) {
            m34916D(23);
            throw null;
        } else if (aVar == null) {
            m34916D(24);
            throw null;
        } else if (hVar == null) {
            m34916D(25);
            throw null;
        } else if (y0Var != null) {
            C26436b.C26437a aVar2 = C26436b.C26437a.DECLARATION;
            if (aVar == aVar2 || aVar == C26436b.C26437a.SYNTHESIZED) {
                return new C26750i((C26447e) kVar, this, hVar, this.f74394K, aVar2, y0Var);
            }
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + kVar + "\n" + "kind: " + aVar);
        } else {
            m34916D(26);
            throw null;
        }
    }

    /* renamed from: T0 */
    public C26447e m34931b() {
        C26447e eVar = (C26447e) super.mo51892b();
        if (eVar != null) {
            return eVar;
        }
        m34916D(17);
        throw null;
    }

    /* renamed from: U0 */
    public C26750i mo53731U0(List<C26463h1> list, C26505s sVar) {
        if (list == null) {
            m34916D(13);
            throw null;
        } else if (sVar != null) {
            mo53732V0(list, sVar, m34931b().mo51805t());
            return this;
        } else {
            m34916D(14);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* renamed from: V0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zy3.C26750i mo53732V0(java.util.List<wy3.C26463h1> r11, wy3.C26505s r12, java.util.List<wy3.C26446d1> r13) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0062
            if (r12 == 0) goto L_0x005c
            if (r13 == 0) goto L_0x0056
            r2 = 0
            wy3.e r1 = r10.m34931b()
            boolean r3 = r1.mo51795Y()
            if (r3 == 0) goto L_0x0022
            wy3.k r1 = r1.mo51892b()
            boolean r3 = r1 instanceof wy3.C26447e
            if (r3 == 0) goto L_0x0022
            wy3.e r1 = (wy3.C26447e) r1
            wy3.u0 r1 = r1.mo53429o0()
            r3 = r1
            goto L_0x0023
        L_0x0022:
            r3 = r0
        L_0x0023:
            wy3.e r1 = r10.m34931b()
            java.util.List r4 = r1.mo51894w0()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x003e
            java.util.List r1 = r1.mo51894w0()
            if (r1 == 0) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            r11 = 15
            m34916D(r11)
            throw r0
        L_0x003e:
            java.util.List r1 = java.util.Collections.emptyList()
            if (r1 == 0) goto L_0x0050
        L_0x0044:
            r4 = r1
            r7 = 0
            wy3.c0 r8 = wy3.C26442c0.FINAL
            r1 = r10
            r5 = r13
            r6 = r11
            r9 = r12
            r1.mo53735M0(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        L_0x0050:
            r11 = 16
            m34916D(r11)
            throw r0
        L_0x0056:
            r11 = 12
            m34916D(r11)
            throw r0
        L_0x005c:
            r11 = 11
            m34916D(r11)
            throw r0
        L_0x0062:
            r11 = 10
            m34916D(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zy3.C26750i.mo53732V0(java.util.List, wy3.s, java.util.List):zy3.i");
    }

    /* renamed from: e */
    public Collection<? extends C26516w> mo52633e() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m34916D(21);
        throw null;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        return mVar.mo35276l(this, d);
    }

    /* renamed from: j0 */
    public C26447e mo53446j0() {
        C26447e T0 = m34931b();
        if (T0 != null) {
            return T0;
        }
        m34916D(18);
        throw null;
    }

    /* renamed from: n0 */
    public void mo52596n0(Collection<? extends C26436b> collection) {
        if (collection == null) {
            m34916D(22);
            throw null;
        }
    }

    /* renamed from: y */
    public C26436b mo52598y(C26469k kVar, C26442c0 c0Var, C26505s sVar, C26436b.C26437a aVar, boolean z) {
        C26444d dVar = (C26444d) super.mo52598y(kVar, c0Var, sVar, aVar, z);
        if (dVar != null) {
            return dVar;
        }
        m34916D(27);
        throw null;
    }

    /* renamed from: c */
    public C26444d m34935c(C25180t1 t1Var) {
        if (t1Var != null) {
            return (C26444d) super.mo51921c(t1Var);
        }
        m34916D(20);
        throw null;
    }

    /* renamed from: a */
    public C26444d m34927a() {
        C26444d dVar = (C26444d) super.m35121a();
        if (dVar != null) {
            return dVar;
        }
        m34916D(19);
        throw null;
    }
}
