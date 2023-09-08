package vz3;

import com.tencent.xweb.file.XVFSFile;

/* renamed from: vz3.b */
public final class C26408b {

    /* renamed from: a */
    public final C22826c f73644a;

    /* renamed from: b */
    public final C22826c f73645b;

    /* renamed from: c */
    public final boolean f73646c;

    public C26408b(C22826c cVar, C22826c cVar2, boolean z) {
        if (cVar == null) {
            m33989a(1);
            throw null;
        } else if (cVar2 != null) {
            this.f73644a = cVar;
            this.f73645b = cVar2;
            this.f73646c = z;
        } else {
            m33989a(2);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m33989a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
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
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i != 9) {
            switch (i) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: e */
    public static C26408b m33990e(String str) {
        if (str != null) {
            return m33991f(str, false);
        }
        m33989a(11);
        throw null;
    }

    /* renamed from: f */
    public static C26408b m33991f(String str, boolean z) {
        String str2;
        if (str != null) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf == -1) {
                str2 = "";
            } else {
                String replace = str.substring(0, lastIndexOf).replace(XVFSFile.SEPARATOR_CHAR, '.');
                str = str.substring(lastIndexOf + 1);
                str2 = replace;
            }
            return new C26408b(new C22826c(str2), new C22826c(str), z);
        }
        m33989a(12);
        throw null;
    }

    /* renamed from: l */
    public static C26408b m33992l(C22826c cVar) {
        if (cVar != null) {
            return new C26408b(cVar.mo35976e(), cVar.mo35978f());
        }
        m33989a(0);
        throw null;
    }

    /* renamed from: b */
    public C22826c mo53387b() {
        if (this.f73644a.mo35975d()) {
            C22826c cVar = this.f73645b;
            if (cVar != null) {
                return cVar;
            }
            m33989a(9);
            throw null;
        }
        return new C22826c(this.f73644a.mo35973b() + "." + this.f73645b.mo35973b());
    }

    /* renamed from: c */
    public String mo53388c() {
        if (this.f73644a.mo35975d()) {
            String b = this.f73645b.mo35973b();
            if (b != null) {
                return b;
            }
            m33989a(13);
            throw null;
        }
        String str = this.f73644a.mo35973b().replace('.', XVFSFile.SEPARATOR_CHAR) + "/" + this.f73645b.mo35973b();
        if (str != null) {
            return str;
        }
        m33989a(14);
        throw null;
    }

    /* renamed from: d */
    public C26408b mo53389d(C22830f fVar) {
        if (fVar != null) {
            return new C26408b(mo53392h(), this.f73645b.mo35974c(fVar), this.f73646c);
        }
        m33989a(8);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C26408b.class != obj.getClass()) {
            return false;
        }
        C26408b bVar = (C26408b) obj;
        return this.f73644a.equals(bVar.f73644a) && this.f73645b.equals(bVar.f73645b) && this.f73646c == bVar.f73646c;
    }

    /* renamed from: g */
    public C26408b mo53391g() {
        C22826c e = this.f73645b.mo35976e();
        if (e.mo35975d()) {
            return null;
        }
        return new C26408b(mo53392h(), e, this.f73646c);
    }

    /* renamed from: h */
    public C22826c mo53392h() {
        C22826c cVar = this.f73644a;
        if (cVar != null) {
            return cVar;
        }
        m33989a(5);
        throw null;
    }

    public int hashCode() {
        return (((this.f73644a.hashCode() * 31) + this.f73645b.hashCode()) * 31) + Boolean.valueOf(this.f73646c).hashCode();
    }

    /* renamed from: i */
    public C22826c mo53394i() {
        C22826c cVar = this.f73645b;
        if (cVar != null) {
            return cVar;
        }
        m33989a(6);
        throw null;
    }

    /* renamed from: j */
    public C22830f mo53395j() {
        C22830f f = this.f73645b.mo35978f();
        if (f != null) {
            return f;
        }
        m33989a(7);
        throw null;
    }

    /* renamed from: k */
    public boolean mo53396k() {
        return !this.f73645b.mo35976e().mo35975d();
    }

    public String toString() {
        if (!this.f73644a.mo35975d()) {
            return mo53388c();
        }
        return "/" + mo53388c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C26408b(C22826c cVar, C22830f fVar) {
        this(cVar, C22826c.m26773j(fVar), false);
        if (cVar == null) {
            m33989a(3);
            throw null;
        } else if (fVar != null) {
        } else {
            m33989a(4);
            throw null;
        }
    }
}
