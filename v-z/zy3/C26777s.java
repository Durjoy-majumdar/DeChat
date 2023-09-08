package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32224a;
import h04.C24601d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n04.C25143j0;
import n04.C25167p1;
import n04.C25180t1;
import n04.C25192x;
import n04.C25202z1;
import sx3.C110818d0;
import vz3.C22830f;
import w04.C26413e;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26446d1;
import wy3.C26463h1;
import wy3.C26466i1;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26491r;
import wy3.C26505s;
import wy3.C26509u0;
import wy3.C26516w;
import wy3.C26521y0;
import xy3.C26571h;
import xy3.C26576j;
import zz3.C26792g;

/* renamed from: zy3.s */
public abstract class C26777s extends C26758n implements C26516w {

    /* renamed from: A */
    public boolean f74448A;

    /* renamed from: B */
    public boolean f74449B;

    /* renamed from: C */
    public boolean f74450C;

    /* renamed from: D */
    public boolean f74451D;

    /* renamed from: E */
    public Collection<? extends C26516w> f74452E;

    /* renamed from: F */
    public volatile C32224a<Collection<C26516w>> f74453F;

    /* renamed from: G */
    public final C26516w f74454G;

    /* renamed from: H */
    public final C26436b.C26437a f74455H;

    /* renamed from: I */
    public C26516w f74456I;

    /* renamed from: J */
    public Map<C26434a.C22933a<?>, Object> f74457J;

    /* renamed from: h */
    public List<C26446d1> f74458h;

    /* renamed from: i */
    public List<C26463h1> f74459i;

    /* renamed from: j */
    public C25143j0 f74460j;

    /* renamed from: n */
    public List<C26509u0> f74461n;

    /* renamed from: o */
    public C26509u0 f74462o;

    /* renamed from: p */
    public C26509u0 f74463p;

    /* renamed from: q */
    public C26442c0 f74464q;

    /* renamed from: r */
    public C26505s f74465r;

    /* renamed from: s */
    public boolean f74466s;

    /* renamed from: t */
    public boolean f74467t;

    /* renamed from: u */
    public boolean f74468u;

    /* renamed from: v */
    public boolean f74469v;

    /* renamed from: w */
    public boolean f74470w;

    /* renamed from: x */
    public boolean f74471x;

    /* renamed from: y */
    public boolean f74472y;

    /* renamed from: z */
    public boolean f74473z;

    /* renamed from: zy3.s$a */
    public class C26778a implements C32224a<Collection<C26516w>> {

        /* renamed from: d */
        public final /* synthetic */ C25180t1 f74474d;

        public C26778a(C25180t1 t1Var) {
            this.f74474d = t1Var;
        }

        public Object invoke() {
            C26413e eVar = new C26413e();
            for (C26516w c : C26777s.this.mo52633e()) {
                eVar.add(c.mo51921c(this.f74474d));
            }
            return eVar;
        }
    }

    /* renamed from: zy3.s$b */
    public static class C26779b implements C32224a<List<C26466i1>> {

        /* renamed from: d */
        public final /* synthetic */ List f74476d;

        public C26779b(List list) {
            this.f74476d = list;
        }

        public Object invoke() {
            return this.f74476d;
        }
    }

    /* renamed from: zy3.s$c */
    public class C26780c implements C26516w.C26517a<C26516w> {

        /* renamed from: a */
        public C25167p1 f74477a;

        /* renamed from: b */
        public C26469k f74478b;

        /* renamed from: c */
        public C26442c0 f74479c;

        /* renamed from: d */
        public C26505s f74480d;

        /* renamed from: e */
        public C26516w f74481e;

        /* renamed from: f */
        public C26436b.C26437a f74482f;

        /* renamed from: g */
        public List<C26463h1> f74483g;

        /* renamed from: h */
        public List<C26509u0> f74484h;

        /* renamed from: i */
        public C26509u0 f74485i;

        /* renamed from: j */
        public C26509u0 f74486j;

        /* renamed from: k */
        public C25143j0 f74487k;

        /* renamed from: l */
        public C22830f f74488l;

        /* renamed from: m */
        public boolean f74489m;

        /* renamed from: n */
        public boolean f74490n;

        /* renamed from: o */
        public boolean f74491o;

        /* renamed from: p */
        public boolean f74492p;

        /* renamed from: q */
        public boolean f74493q;

        /* renamed from: r */
        public List<C26446d1> f74494r;

        /* renamed from: s */
        public C26571h f74495s;

        /* renamed from: t */
        public boolean f74496t;

        /* renamed from: u */
        public Map<C26434a.C22933a<?>, Object> f74497u;

        /* renamed from: v */
        public Boolean f74498v;

        /* renamed from: w */
        public boolean f74499w;

        /* renamed from: x */
        public final /* synthetic */ C26777s f74500x;

        public C26780c(C26777s sVar, C25167p1 p1Var, C26469k kVar, C26442c0 c0Var, C26505s sVar2, C26436b.C26437a aVar, List<C26463h1> list, List<C26509u0> list2, C26509u0 u0Var, C25143j0 j0Var, C22830f fVar) {
            if (p1Var == null) {
                m35134s(0);
                throw null;
            } else if (kVar == null) {
                m35134s(1);
                throw null;
            } else if (c0Var == null) {
                m35134s(2);
                throw null;
            } else if (sVar2 == null) {
                m35134s(3);
                throw null;
            } else if (aVar == null) {
                m35134s(4);
                throw null;
            } else if (list == null) {
                m35134s(5);
                throw null;
            } else if (list2 == null) {
                m35134s(6);
                throw null;
            } else if (j0Var != null) {
                this.f74500x = sVar;
                this.f74481e = null;
                this.f74486j = sVar.f74463p;
                this.f74489m = true;
                this.f74490n = false;
                this.f74491o = false;
                this.f74492p = false;
                this.f74493q = sVar.f74473z;
                this.f74494r = null;
                this.f74495s = null;
                this.f74496t = sVar.f74448A;
                this.f74497u = new LinkedHashMap();
                this.f74498v = null;
                this.f74499w = false;
                this.f74477a = p1Var;
                this.f74478b = kVar;
                this.f74479c = c0Var;
                this.f74480d = sVar2;
                this.f74482f = aVar;
                this.f74483g = list;
                this.f74484h = list2;
                this.f74485i = u0Var;
                this.f74487k = j0Var;
                this.f74488l = fVar;
            } else {
                m35134s(7);
                throw null;
            }
        }

        /* renamed from: s */
        public static /* synthetic */ void m35134s(int i) {
            String str;
            int i2;
            Throwable th;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    th = new IllegalStateException(format);
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
            throw th;
        }

        /* renamed from: a */
        public C26516w.C26517a mo52599a(C26571h hVar) {
            if (hVar != null) {
                this.f74495s = hVar;
                return this;
            }
            m35134s(35);
            throw null;
        }

        /* renamed from: b */
        public C26516w.C26517a mo52600b() {
            this.f74493q = true;
            return this;
        }

        public C26516w build() {
            return this.f74500x.mo53361K0(this);
        }

        /* renamed from: c */
        public C26516w.C26517a mo52602c(C22830f fVar) {
            if (fVar != null) {
                this.f74488l = fVar;
                return this;
            }
            m35134s(17);
            throw null;
        }

        /* renamed from: d */
        public C26516w.C26517a mo52603d(C26469k kVar) {
            if (kVar != null) {
                this.f74478b = kVar;
                return this;
            }
            m35134s(8);
            throw null;
        }

        /* renamed from: e */
        public C26516w.C26517a mo52604e(C25143j0 j0Var) {
            if (j0Var != null) {
                this.f74487k = j0Var;
                return this;
            }
            m35134s(23);
            throw null;
        }

        /* renamed from: f */
        public <V> C26516w.C26517a<C26516w> mo52605f(C26434a.C22933a<V> aVar, V v) {
            if (aVar != null) {
                this.f74497u.put(aVar, v);
                return this;
            }
            m35134s(39);
            throw null;
        }

        /* renamed from: g */
        public C26516w.C26517a mo52606g(C26442c0 c0Var) {
            if (c0Var != null) {
                this.f74479c = c0Var;
                return this;
            }
            m35134s(10);
            throw null;
        }

        /* renamed from: h */
        public C26516w.C26517a mo52607h() {
            this.f74491o = true;
            return this;
        }

        /* renamed from: i */
        public C26516w.C26517a mo52608i(boolean z) {
            this.f74489m = z;
            return this;
        }

        /* renamed from: j */
        public C26516w.C26517a mo52609j(C26436b.C26437a aVar) {
            if (aVar != null) {
                this.f74482f = aVar;
                return this;
            }
            m35134s(14);
            throw null;
        }

        /* renamed from: k */
        public C26516w.C26517a mo52610k(List list) {
            if (list != null) {
                this.f74494r = list;
                return this;
            }
            m35134s(21);
            throw null;
        }

        /* renamed from: l */
        public C26516w.C26517a mo52611l(C26436b bVar) {
            this.f74481e = (C26516w) bVar;
            return this;
        }

        /* renamed from: m */
        public C26516w.C26517a mo52612m(List list) {
            if (list != null) {
                this.f74483g = list;
                return this;
            }
            m35134s(19);
            throw null;
        }

        /* renamed from: n */
        public C26516w.C26517a mo52613n(C26505s sVar) {
            if (sVar != null) {
                this.f74480d = sVar;
                return this;
            }
            m35134s(12);
            throw null;
        }

        /* renamed from: o */
        public C26516w.C26517a mo52614o(C26509u0 u0Var) {
            this.f74486j = u0Var;
            return this;
        }

        /* renamed from: p */
        public C26516w.C26517a mo52615p() {
            this.f74496t = true;
            return this;
        }

        /* renamed from: q */
        public C26516w.C26517a mo52616q(C25167p1 p1Var) {
            if (p1Var != null) {
                this.f74477a = p1Var;
                return this;
            }
            m35134s(37);
            throw null;
        }

        /* renamed from: r */
        public C26516w.C26517a mo52617r() {
            this.f74490n = true;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26777s(C26469k kVar, C26516w wVar, C26571h hVar, C22830f fVar, C26436b.C26437a aVar, C26521y0 y0Var) {
        super(kVar, hVar, fVar, y0Var);
        if (kVar == null) {
            m35097D(0);
            throw null;
        } else if (hVar == null) {
            m35097D(1);
            throw null;
        } else if (fVar == null) {
            m35097D(2);
            throw null;
        } else if (aVar == null) {
            m35097D(3);
            throw null;
        } else if (y0Var != null) {
            this.f74465r = C26491r.f73786i;
            this.f74466s = false;
            this.f74467t = false;
            this.f74468u = false;
            this.f74469v = false;
            this.f74470w = false;
            this.f74471x = false;
            this.f74472y = false;
            this.f74473z = false;
            this.f74448A = false;
            this.f74449B = false;
            this.f74450C = true;
            this.f74451D = false;
            this.f74452E = null;
            this.f74453F = null;
            this.f74456I = null;
            this.f74457J = null;
            this.f74454G = wVar == null ? this : wVar;
            this.f74455H = aVar;
        } else {
            m35097D(4);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m35097D(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v4, types: [zy3.p0$a] */
    /* JADX WARNING: type inference failed for: r7v5, types: [zy3.p0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<wy3.C26463h1> m35098L0(wy3.C26516w r20, java.util.List<wy3.C26463h1> r21, n04.C25180t1 r22, boolean r23, boolean r24, boolean[] r25) {
        /*
            r0 = r22
            r1 = 0
            if (r21 == 0) goto L_0x00c5
            if (r0 == 0) goto L_0x00bf
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r21.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r21.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00be
            java.lang.Object r4 = r3.next()
            wy3.h1 r4 = (wy3.C26463h1) r4
            n04.j0 r5 = r4.getType()
            n04.z1 r6 = n04.C25202z1.IN_VARIANCE
            n04.j0 r13 = r0.mo52314k(r5, r6)
            n04.j0 r5 = r4.mo53440S()
            if (r5 != 0) goto L_0x0032
            r6 = r1
            goto L_0x0036
        L_0x0032:
            n04.j0 r6 = r0.mo52314k(r5, r6)
        L_0x0036:
            if (r13 != 0) goto L_0x0039
            return r1
        L_0x0039:
            n04.j0 r7 = r4.getType()
            if (r13 != r7) goto L_0x0041
            if (r5 == r6) goto L_0x0047
        L_0x0041:
            if (r25 == 0) goto L_0x0047
            r5 = 0
            r7 = 1
            r25[r5] = r7
        L_0x0047:
            boolean r5 = r4 instanceof zy3.C26765p0.C26766a
            if (r5 == 0) goto L_0x0060
            r5 = r4
            zy3.p0$a r5 = (zy3.C26765p0.C26766a) r5
            rx3.g r5 = r5.f74429r
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            zy3.s$b r7 = new zy3.s$b
            r7.<init>(r5)
            r19 = r7
            goto L_0x0062
        L_0x0060:
            r19 = r1
        L_0x0062:
            if (r23 == 0) goto L_0x0066
            r9 = r1
            goto L_0x0067
        L_0x0066:
            r9 = r4
        L_0x0067:
            int r10 = r4.getIndex()
            xy3.h r11 = r4.getAnnotations()
            vz3.f r12 = r4.getName()
            boolean r14 = r4.mo53442m0()
            boolean r15 = r4.mo53439C0()
            boolean r16 = r4.mo53438B0()
            if (r24 == 0) goto L_0x0086
            wy3.y0 r4 = r4.getSource()
            goto L_0x0088
        L_0x0086:
            wy3.y0 r4 = wy3.C26521y0.f73808a
        L_0x0088:
            java.lang.String r5 = "containingDeclaration"
            r8 = r20
            gy3.C87412m.m108594g(r8, r5)
            java.lang.String r5 = "annotations"
            gy3.C87412m.m108594g(r11, r5)
            java.lang.String r5 = "name"
            gy3.C87412m.m108594g(r12, r5)
            java.lang.String r5 = "source"
            gy3.C87412m.m108594g(r4, r5)
            if (r19 != 0) goto L_0x00ad
            zy3.p0 r5 = new zy3.p0
            r7 = r5
            r8 = r20
            r17 = r6
            r18 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00b9
        L_0x00ad:
            zy3.p0$a r5 = new zy3.p0$a
            r7 = r5
            r8 = r20
            r17 = r6
            r18 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00b9:
            r2.add(r5)
            goto L_0x0014
        L_0x00be:
            return r2
        L_0x00bf:
            r0 = 31
            m35097D(r0)
            throw r1
        L_0x00c5:
            r0 = 30
            m35097D(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zy3.C26777s.m35098L0(wy3.w, java.util.List, n04.t1, boolean, boolean, boolean[]):java.util.List");
    }

    /* renamed from: C */
    public boolean mo53472C() {
        return this.f74448A;
    }

    /* renamed from: D0 */
    public C26516w mo53473D0() {
        return this.f74456I;
    }

    /* renamed from: H */
    public C26509u0 mo52626H() {
        return this.f74463p;
    }

    /* renamed from: H0 */
    public boolean mo53474H0() {
        return this.f74473z;
    }

    /* renamed from: I */
    public C26509u0 mo52627I() {
        return this.f74462o;
    }

    /* renamed from: I0 */
    public C26516w mo52598y(C26469k kVar, C26442c0 c0Var, C26505s sVar, C26436b.C26437a aVar, boolean z) {
        C26516w build = mo52597p().mo52603d(kVar).mo52606g(c0Var).mo52613n(sVar).mo52609j(aVar).mo52608i(z).build();
        if (build != null) {
            return build;
        }
        m35097D(26);
        throw null;
    }

    /* renamed from: J0 */
    public abstract C26777s mo51316J0(C26469k kVar, C26516w wVar, C26436b.C26437a aVar, C22830f fVar, C26571h hVar, C26521y0 y0Var);

    /* renamed from: K0 */
    public C26516w mo53361K0(C26780c cVar) {
        C26521y0 y0Var;
        C26753j0 j0Var;
        C26509u0 u0Var;
        C25143j0 k;
        C26780c cVar2 = cVar;
        C25202z1 z1Var = C25202z1.IN_VARIANCE;
        if (cVar2 != null) {
            boolean[] zArr = new boolean[1];
            C26571h a = cVar2.f74495s != null ? C26576j.m34374a(getAnnotations(), cVar2.f74495s) : getAnnotations();
            C26469k kVar = cVar2.f74478b;
            C26516w wVar = cVar2.f74481e;
            C26436b.C26437a aVar = cVar2.f74482f;
            C22830f fVar = cVar2.f74488l;
            if (cVar2.f74491o) {
                y0Var = (wVar != null ? wVar : m35121a()).getSource();
            } else {
                y0Var = C26521y0.f73808a;
            }
            C26521y0 y0Var2 = y0Var;
            if (y0Var2 != null) {
                C26777s J0 = mo51316J0(kVar, wVar, aVar, fVar, a, y0Var2);
                List<C26446d1> list = cVar2.f74494r;
                if (list == null) {
                    list = getTypeParameters();
                }
                zArr[0] = zArr[0] | (!list.isEmpty());
                ArrayList arrayList = new ArrayList(list.size());
                C25180t1 c = C25192x.m32116c(list, cVar2.f74477a, J0, arrayList, zArr);
                if (c == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                if (!cVar2.f74484h.isEmpty()) {
                    for (C26509u0 next : cVar2.f74484h) {
                        C25143j0 k2 = c.mo52314k(next.getType(), z1Var);
                        if (k2 == null) {
                            return null;
                        }
                        arrayList2.add(C26792g.m35203b(J0, k2, next.getAnnotations()));
                        zArr[0] = (k2 != next.getType()) | zArr[0];
                    }
                }
                C26509u0 u0Var2 = cVar2.f74485i;
                if (u0Var2 != null) {
                    C25143j0 k3 = c.mo52314k(u0Var2.getType(), z1Var);
                    if (k3 == null) {
                        return null;
                    }
                    C26753j0 j0Var2 = new C26753j0(J0, new C24601d(J0, k3, cVar2.f74485i.getValue()), cVar2.f74485i.getAnnotations());
                    zArr[0] = (k3 != cVar2.f74485i.getType()) | zArr[0];
                    j0Var = j0Var2;
                } else {
                    j0Var = null;
                }
                C26509u0 u0Var3 = cVar2.f74486j;
                if (u0Var3 != null) {
                    C26509u0 c2 = u0Var3.mo51921c(c);
                    if (c2 == null) {
                        return null;
                    }
                    zArr[0] = zArr[0] | (c2 != cVar2.f74486j);
                    u0Var = c2;
                } else {
                    u0Var = null;
                }
                ArrayList arrayList3 = arrayList2;
                List<C26463h1> L0 = m35098L0(J0, cVar2.f74483g, c, cVar2.f74492p, cVar2.f74491o, zArr);
                if (L0 == null || (k = c.mo52314k(cVar2.f74487k, C25202z1.OUT_VARIANCE)) == null) {
                    return null;
                }
                boolean z = zArr[0] | (k != cVar2.f74487k);
                zArr[0] = z;
                if (!z && cVar2.f74499w) {
                    return this;
                }
                C25180t1 t1Var = c;
                J0.mo53735M0(j0Var, u0Var, arrayList3, arrayList, L0, k, cVar2.f74479c, cVar2.f74480d);
                J0.f74466s = this.f74466s;
                J0.f74467t = this.f74467t;
                J0.f74468u = this.f74468u;
                J0.f74469v = this.f74469v;
                J0.f74470w = this.f74470w;
                J0.f74449B = this.f74449B;
                J0.f74471x = this.f74471x;
                J0.f74472y = this.f74472y;
                J0.mo51318P0(this.f74450C);
                J0.f74473z = cVar2.f74493q;
                J0.f74448A = cVar2.f74496t;
                Boolean bool = cVar2.f74498v;
                J0.mo51319Q0(bool != null ? bool.booleanValue() : this.f74451D);
                if (!cVar2.f74497u.isEmpty() || this.f74457J != null) {
                    Map<C26434a.C22933a<?>, Object> map = cVar2.f74497u;
                    Map<C26434a.C22933a<?>, Object> map2 = this.f74457J;
                    if (map2 != null) {
                        for (Map.Entry next2 : map2.entrySet()) {
                            if (!map.containsKey(next2.getKey())) {
                                map.put(next2.getKey(), next2.getValue());
                            }
                        }
                    }
                    if (map.size() == 1) {
                        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                        J0.f74457J = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                    } else {
                        J0.f74457J = map;
                    }
                }
                if (cVar2.f74490n || this.f74456I != null) {
                    C26516w wVar2 = this.f74456I;
                    if (wVar2 == null) {
                        wVar2 = this;
                    }
                    J0.f74456I = wVar2.mo51921c(t1Var);
                }
                if (cVar2.f74489m && !m35121a().mo52633e().isEmpty()) {
                    if (cVar2.f74477a.mo52261e()) {
                        C32224a<Collection<C26516w>> aVar2 = this.f74453F;
                        if (aVar2 != null) {
                            J0.f74453F = aVar2;
                        } else {
                            J0.mo52596n0(mo52633e());
                        }
                    } else {
                        J0.f74453F = new C26778a(t1Var);
                    }
                }
                return J0;
            }
            m35097D(27);
            throw null;
        }
        m35097D(25);
        throw null;
    }

    /* renamed from: M */
    public boolean mo51317M() {
        return this.f74451D;
    }

    /* renamed from: M0 */
    public C26777s mo53735M0(C26509u0 u0Var, C26509u0 u0Var2, List<C26509u0> list, List<? extends C26446d1> list2, List<C26463h1> list3, C25143j0 j0Var, C26442c0 c0Var, C26505s sVar) {
        if (list == null) {
            m35097D(5);
            throw null;
        } else if (list2 == null) {
            m35097D(6);
            throw null;
        } else if (list3 == null) {
            m35097D(7);
            throw null;
        } else if (sVar != null) {
            this.f74458h = C110818d0.m150953y0(list2);
            this.f74459i = C110818d0.m150953y0(list3);
            this.f74460j = j0Var;
            this.f74464q = c0Var;
            this.f74465r = sVar;
            this.f74462o = u0Var;
            this.f74463p = u0Var2;
            this.f74461n = list;
            int i = 0;
            int i2 = 0;
            while (i2 < list2.size()) {
                C26446d1 d1Var = (C26446d1) list2.get(i2);
                if (d1Var.getIndex() == i2) {
                    i2++;
                } else {
                    throw new IllegalStateException(d1Var + " index is " + d1Var.getIndex() + " but position is " + i2);
                }
            }
            while (i < list3.size()) {
                C26463h1 h1Var = list3.get(i);
                if (h1Var.getIndex() == i + 0) {
                    i++;
                } else {
                    throw new IllegalStateException(h1Var + "index is " + h1Var.getIndex() + " but position is " + i);
                }
            }
            return this;
        } else {
            m35097D(8);
            throw null;
        }
    }

    /* renamed from: N0 */
    public C26780c mo53749N0(C25180t1 t1Var) {
        if (t1Var != null) {
            return new C26780c(this, t1Var.mo52311g(), mo51892b(), mo51802j(), getVisibility(), mo52634f(), mo52639h(), mo52629T(), this.f74462o, getReturnType(), (C22830f) null);
        }
        m35097D(24);
        throw null;
    }

    /* renamed from: O0 */
    public <V> void mo53750O0(C26434a.C22933a<V> aVar, Object obj) {
        if (this.f74457J == null) {
            this.f74457J = new LinkedHashMap();
        }
        this.f74457J.put(aVar, obj);
    }

    /* renamed from: P */
    public boolean mo51792P() {
        return this.f74471x;
    }

    /* renamed from: P0 */
    public void mo51318P0(boolean z) {
        this.f74450C = z;
    }

    /* renamed from: Q0 */
    public void mo51319Q0(boolean z) {
        this.f74451D = z;
    }

    /* renamed from: R0 */
    public void mo53751R0(C25143j0 j0Var) {
        if (j0Var != null) {
            this.f74460j = j0Var;
        } else {
            m35097D(11);
            throw null;
        }
    }

    /* renamed from: T */
    public List<C26509u0> mo52629T() {
        List<C26509u0> list = this.f74461n;
        if (list != null) {
            return list;
        }
        m35097D(13);
        throw null;
    }

    /* renamed from: V */
    public <V> V mo51326V(C26434a.C22933a<V> aVar) {
        Map map = this.f74457J;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    /* renamed from: Z */
    public boolean mo51885Z() {
        return this.f74470w;
    }

    /* renamed from: e */
    public Collection<? extends C26516w> mo52633e() {
        C32224a<Collection<C26516w>> aVar = this.f74453F;
        if (aVar != null) {
            this.f74452E = aVar.invoke();
            this.f74453F = null;
        }
        Collection<? extends C26516w> collection = this.f74452E;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        m35097D(14);
        throw null;
    }

    /* renamed from: f */
    public C26436b.C26437a mo52634f() {
        C26436b.C26437a aVar = this.f74455H;
        if (aVar != null) {
            return aVar;
        }
        m35097D(21);
        throw null;
    }

    public C25143j0 getReturnType() {
        return this.f74460j;
    }

    public List<C26446d1> getTypeParameters() {
        List<C26446d1> list = this.f74458h;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public C26505s getVisibility() {
        C26505s sVar = this.f74465r;
        if (sVar != null) {
            return sVar;
        }
        m35097D(16);
        throw null;
    }

    /* renamed from: h */
    public List<C26463h1> mo52639h() {
        List<C26463h1> list = this.f74459i;
        if (list != null) {
            return list;
        }
        m35097D(19);
        throw null;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        return mVar.mo52797a(this, d);
    }

    public boolean isExternal() {
        return this.f74468u;
    }

    public boolean isInfix() {
        if (this.f74467t) {
            return true;
        }
        for (C26516w isInfix : m35121a().mo52633e()) {
            if (isInfix.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f74469v;
    }

    public boolean isOperator() {
        if (this.f74466s) {
            return true;
        }
        for (C26516w isOperator : m35121a().mo52633e()) {
            if (isOperator.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f74449B;
    }

    /* renamed from: j */
    public C26442c0 mo51802j() {
        C26442c0 c0Var = this.f74464q;
        if (c0Var != null) {
            return c0Var;
        }
        m35097D(15);
        throw null;
    }

    /* renamed from: n0 */
    public void mo52596n0(Collection<? extends C26436b> collection) {
        if (collection != null) {
            this.f74452E = collection;
            Iterator<? extends C26436b> it = collection.iterator();
            while (it.hasNext()) {
                if (((C26516w) it.next()).mo53472C()) {
                    this.f74448A = true;
                    return;
                }
            }
            return;
        }
        m35097D(17);
        throw null;
    }

    /* renamed from: p */
    public C26516w.C26517a<? extends C26516w> mo52597p() {
        return mo53749N0(C25180t1.f71631b);
    }

    /* renamed from: v0 */
    public boolean mo51808v0() {
        return this.f74472y;
    }

    /* renamed from: c */
    public C26516w m35124c(C25180t1 t1Var) {
        if (t1Var == null) {
            m35097D(22);
            throw null;
        } else if (t1Var.mo52312h()) {
            return this;
        } else {
            C26780c N0 = mo53749N0(t1Var);
            N0.f74481e = m35121a();
            N0.f74491o = true;
            N0.f74499w = true;
            return N0.build();
        }
    }

    /* renamed from: a */
    public C26516w m35122a() {
        C26516w wVar = this.f74454G;
        C26516w a = wVar == this ? this : wVar.mo36109a();
        if (a != null) {
            return a;
        }
        m35097D(20);
        throw null;
    }
}
