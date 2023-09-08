package pz3;

import b04.C23648f;
import com.google.android.gms.dynamite.ProviderConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import fz3.C24503f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oz3.C25395q;
import pz3.C25505a;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26521y0;

/* renamed from: pz3.b */
public class C25507b implements C25395q.C25398c {

    /* renamed from: j */
    public static final boolean f72205j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    public static final Map<C26408b, C25505a.C25506a> f72206k;

    /* renamed from: a */
    public int[] f72207a = null;

    /* renamed from: b */
    public String f72208b = null;

    /* renamed from: c */
    public int f72209c = 0;

    /* renamed from: d */
    public String f72210d = null;

    /* renamed from: e */
    public String[] f72211e = null;

    /* renamed from: f */
    public String[] f72212f = null;

    /* renamed from: g */
    public String[] f72213g = null;

    /* renamed from: h */
    public C25505a.C25506a f72214h = null;

    /* renamed from: i */
    public String[] f72215i = null;

    /* renamed from: pz3.b$b */
    public static abstract class C25509b implements C25395q.C25397b {

        /* renamed from: a */
        public final List<String> f72216a = new ArrayList();

        /* renamed from: f */
        public static /* synthetic */ void m32931f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo52567a() {
            mo52770g((String[]) ((ArrayList) this.f72216a).toArray(new String[0]));
        }

        /* renamed from: b */
        public void mo52568b(Object obj) {
            if (obj instanceof String) {
                ((ArrayList) this.f72216a).add((String) obj);
            }
        }

        /* renamed from: c */
        public void mo52569c(C23648f fVar) {
            if (fVar == null) {
                m32931f(2);
                throw null;
            }
        }

        /* renamed from: d */
        public void mo52570d(C26408b bVar, C22830f fVar) {
            if (bVar == null) {
                m32931f(0);
                throw null;
            } else if (fVar == null) {
                m32931f(1);
                throw null;
            }
        }

        /* renamed from: e */
        public C25395q.C25396a mo52571e(C26408b bVar) {
            if (bVar != null) {
                return null;
            }
            m32931f(3);
            throw null;
        }

        /* renamed from: g */
        public abstract void mo52770g(String[] strArr);
    }

    /* renamed from: pz3.b$c */
    public class C25510c implements C25395q.C25396a {
        public C25510c(C25508a aVar) {
        }

        /* renamed from: g */
        public static /* synthetic */ void m32938g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo52566a() {
        }

        /* renamed from: b */
        public void mo52560b(C22830f fVar, C26408b bVar, C22830f fVar2) {
            if (bVar == null) {
                m32938g(1);
                throw null;
            } else if (fVar2 == null) {
                m32938g(2);
                throw null;
            }
        }

        /* renamed from: c */
        public void mo52561c(C22830f fVar, C23648f fVar2) {
            if (fVar2 == null) {
                m32938g(0);
                throw null;
            }
        }

        /* renamed from: d */
        public void mo52562d(C22830f fVar, Object obj) {
            if (fVar != null) {
                String b = fVar.mo35995b();
                if ("k".equals(b)) {
                    if (obj instanceof Integer) {
                        C25507b bVar = C25507b.this;
                        int intValue = ((Integer) obj).intValue();
                        C25505a.C25506a aVar = (C25505a.C25506a) ((LinkedHashMap) C25505a.C25506a.f72196e).get(Integer.valueOf(intValue));
                        if (aVar == null) {
                            aVar = C25505a.C25506a.UNKNOWN;
                        }
                        bVar.f72214h = aVar;
                    }
                } else if ("mv".equals(b)) {
                    if (obj instanceof int[]) {
                        C25507b.this.f72207a = (int[]) obj;
                    }
                } else if ("xs".equals(b)) {
                    if (obj instanceof String) {
                        C25507b.this.f72208b = (String) obj;
                    }
                } else if ("xi".equals(b)) {
                    if (obj instanceof Integer) {
                        C25507b.this.f72209c = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(b) && (obj instanceof String)) {
                    C25507b.this.f72210d = (String) obj;
                }
            }
        }

        /* renamed from: e */
        public C25395q.C25396a mo52563e(C22830f fVar, C26408b bVar) {
            if (bVar != null) {
                return null;
            }
            m32938g(3);
            throw null;
        }

        /* renamed from: f */
        public C25395q.C25397b mo52564f(C22830f fVar) {
            String b = fVar != null ? fVar.mo35995b() : null;
            if ("d1".equals(b)) {
                return new C25513c(this);
            }
            if ("d2".equals(b)) {
                return new C25514d(this);
            }
            return null;
        }
    }

    /* renamed from: pz3.b$d */
    public class C25511d implements C25395q.C25396a {
        public C25511d(C25508a aVar) {
        }

        /* renamed from: g */
        public static /* synthetic */ void m32945g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo52566a() {
        }

        /* renamed from: b */
        public void mo52560b(C22830f fVar, C26408b bVar, C22830f fVar2) {
            if (bVar == null) {
                m32945g(1);
                throw null;
            } else if (fVar2 == null) {
                m32945g(2);
                throw null;
            }
        }

        /* renamed from: c */
        public void mo52561c(C22830f fVar, C23648f fVar2) {
            if (fVar2 == null) {
                m32945g(0);
                throw null;
            }
        }

        /* renamed from: d */
        public void mo52562d(C22830f fVar, Object obj) {
        }

        /* renamed from: e */
        public C25395q.C25396a mo52563e(C22830f fVar, C26408b bVar) {
            if (bVar != null) {
                return null;
            }
            m32945g(3);
            throw null;
        }

        /* renamed from: f */
        public C25395q.C25397b mo52564f(C22830f fVar) {
            if ("b".equals(fVar != null ? fVar.mo35995b() : null)) {
                return new C25515e(this);
            }
            return null;
        }
    }

    /* renamed from: pz3.b$e */
    public class C25512e implements C25395q.C25396a {
        public C25512e(C25508a aVar) {
        }

        /* renamed from: g */
        public static /* synthetic */ void m32952g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo52566a() {
        }

        /* renamed from: b */
        public void mo52560b(C22830f fVar, C26408b bVar, C22830f fVar2) {
            if (bVar == null) {
                m32952g(1);
                throw null;
            } else if (fVar2 == null) {
                m32952g(2);
                throw null;
            }
        }

        /* renamed from: c */
        public void mo52561c(C22830f fVar, C23648f fVar2) {
            if (fVar2 == null) {
                m32952g(0);
                throw null;
            }
        }

        /* renamed from: d */
        public void mo52562d(C22830f fVar, Object obj) {
            if (fVar != null) {
                String b = fVar.mo35995b();
                if (ProviderConstants.API_COLNAME_FEATURE_VERSION.equals(b)) {
                    if (obj instanceof int[]) {
                        C25507b.this.f72207a = (int[]) obj;
                    }
                } else if ("multifileClassName".equals(b)) {
                    C25507b.this.f72208b = obj instanceof String ? (String) obj : null;
                }
            }
        }

        /* renamed from: e */
        public C25395q.C25396a mo52563e(C22830f fVar, C26408b bVar) {
            if (bVar != null) {
                return null;
            }
            m32952g(3);
            throw null;
        }

        /* renamed from: f */
        public C25395q.C25397b mo52564f(C22830f fVar) {
            String b = fVar != null ? fVar.mo35995b() : null;
            if ("data".equals(b) || "filePartClassNames".equals(b)) {
                return new C25516f(this);
            }
            if ("strings".equals(b)) {
                return new C25517g(this);
            }
            return null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f72206k = hashMap;
        hashMap.put(C26408b.m33992l(new C22826c("kotlin.jvm.internal.KotlinClass")), C25505a.C25506a.CLASS);
        hashMap.put(C26408b.m33992l(new C22826c("kotlin.jvm.internal.KotlinFileFacade")), C25505a.C25506a.FILE_FACADE);
        hashMap.put(C26408b.m33992l(new C22826c("kotlin.jvm.internal.KotlinMultifileClass")), C25505a.C25506a.MULTIFILE_CLASS);
        hashMap.put(C26408b.m33992l(new C22826c("kotlin.jvm.internal.KotlinMultifileClassPart")), C25505a.C25506a.MULTIFILE_CLASS_PART);
        hashMap.put(C26408b.m33992l(new C22826c("kotlin.jvm.internal.KotlinSyntheticClass")), C25505a.C25506a.SYNTHETIC_CLASS);
    }

    /* renamed from: d */
    public static /* synthetic */ void m32928d(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: a */
    public void mo35570a() {
    }

    /* renamed from: c */
    public C25395q.C25396a mo35571c(C26408b bVar, C26521y0 y0Var) {
        C25505a.C25506a aVar;
        if (bVar == null) {
            m32928d(0);
            throw null;
        } else if (y0Var != null) {
            C22826c b = bVar.mo53387b();
            if (b.equals(C24503f0.f70030a)) {
                return new C25510c((C25508a) null);
            }
            if (b.equals(C24503f0.f70044o)) {
                return new C25511d((C25508a) null);
            }
            if (f72205j || this.f72214h != null || (aVar = (C25505a.C25506a) ((HashMap) f72206k).get(bVar)) == null) {
                return null;
            }
            this.f72214h = aVar;
            return new C25512e((C25508a) null);
        } else {
            m32928d(1);
            throw null;
        }
    }
}
