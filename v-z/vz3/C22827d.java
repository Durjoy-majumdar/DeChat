package vz3;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: vz3.d */
public final class C22827d {

    /* renamed from: e */
    public static final C22830f f65630e = C22830f.m26796h("<root>");

    /* renamed from: f */
    public static final Pattern f65631f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final C32226l<String, C22830f> f65632g = new C22828a();

    /* renamed from: a */
    public final String f65633a;

    /* renamed from: b */
    public transient C22826c f65634b;

    /* renamed from: c */
    public transient C22827d f65635c;

    /* renamed from: d */
    public transient C22830f f65636d;

    /* renamed from: vz3.d$a */
    public static class C22828a implements C32226l<String, C22830f> {
        public Object invoke(Object obj) {
            return C22830f.m26793e((String) obj);
        }
    }

    public C22827d(String str, C22826c cVar) {
        if (str == null) {
            m26782a(0);
            throw null;
        } else if (cVar != null) {
            this.f65633a = str;
            this.f65634b = cVar;
        } else {
            m26782a(1);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m26782a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: b */
    public String mo35984b() {
        String str = this.f65633a;
        if (str != null) {
            return str;
        }
        m26782a(4);
        throw null;
    }

    /* renamed from: c */
    public C22827d mo35985c(C22830f fVar) {
        String str;
        if (fVar != null) {
            if (mo35987e()) {
                str = fVar.mo35995b();
            } else {
                str = this.f65633a + "." + fVar.mo35995b();
            }
            return new C22827d(str, this, fVar);
        }
        m26782a(9);
        throw null;
    }

    /* renamed from: d */
    public final void mo35986d() {
        int lastIndexOf = this.f65633a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f65636d = C22830f.m26793e(this.f65633a.substring(lastIndexOf + 1));
            this.f65635c = new C22827d(this.f65633a.substring(0, lastIndexOf));
            return;
        }
        this.f65636d = C22830f.m26793e(this.f65633a);
        this.f65635c = C22826c.f65627c.mo35982i();
    }

    /* renamed from: e */
    public boolean mo35987e() {
        return this.f65633a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22827d) && this.f65633a.equals(((C22827d) obj).f65633a);
    }

    /* renamed from: f */
    public boolean mo35989f() {
        return this.f65634b != null || mo35984b().indexOf(60) < 0;
    }

    /* renamed from: g */
    public List<C22830f> mo35990g() {
        List<C22830f> list;
        if (mo35987e()) {
            list = Collections.emptyList();
        } else {
            String[] split = f65631f.split(this.f65633a);
            C32226l<String, C22830f> lVar = f65632g;
            C87412m.m108594g(split, "<this>");
            C87412m.m108594g(lVar, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String invoke : split) {
                arrayList.add(((C22828a) lVar).invoke(invoke));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        m26782a(14);
        throw null;
    }

    /* renamed from: h */
    public C22830f mo35991h() {
        C22830f fVar = this.f65636d;
        if (fVar != null) {
            if (fVar != null) {
                return fVar;
            }
            m26782a(10);
            throw null;
        } else if (!mo35987e()) {
            mo35986d();
            C22830f fVar2 = this.f65636d;
            if (fVar2 != null) {
                return fVar2;
            }
            m26782a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public int hashCode() {
        return this.f65633a.hashCode();
    }

    /* renamed from: i */
    public C22826c mo35993i() {
        C22826c cVar = this.f65634b;
        if (cVar == null) {
            C22826c cVar2 = new C22826c(this);
            this.f65634b = cVar2;
            return cVar2;
        } else if (cVar != null) {
            return cVar;
        } else {
            m26782a(5);
            throw null;
        }
    }

    public String toString() {
        String b = mo35987e() ? f65630e.mo35995b() : this.f65633a;
        if (b != null) {
            return b;
        }
        m26782a(17);
        throw null;
    }

    public C22827d(String str) {
        if (str != null) {
            this.f65633a = str;
        } else {
            m26782a(2);
            throw null;
        }
    }

    public C22827d(String str, C22827d dVar, C22830f fVar) {
        if (str != null) {
            this.f65633a = str;
            this.f65635c = dVar;
            this.f65636d = fVar;
            return;
        }
        m26782a(3);
        throw null;
    }
}
