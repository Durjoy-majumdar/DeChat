package vz3;

/* renamed from: vz3.c */
public final class C22826c {

    /* renamed from: c */
    public static final C22826c f65627c = new C22826c("");

    /* renamed from: a */
    public final C22827d f65628a;

    /* renamed from: b */
    public transient C22826c f65629b;

    public C22826c(String str) {
        if (str != null) {
            this.f65628a = new C22827d(str, this);
        } else {
            m26772a(1);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m26772a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
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
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: j */
    public static C22826c m26773j(C22830f fVar) {
        if (fVar == null) {
            m26772a(13);
            throw null;
        } else if (fVar != null) {
            return new C22826c(new C22827d(fVar.mo35995b(), f65627c.mo35982i(), fVar));
        } else {
            C22827d.m26782a(16);
            throw null;
        }
    }

    /* renamed from: b */
    public String mo35973b() {
        String b = this.f65628a.mo35984b();
        if (b != null) {
            return b;
        }
        m26772a(4);
        throw null;
    }

    /* renamed from: c */
    public C22826c mo35974c(C22830f fVar) {
        if (fVar != null) {
            return new C22826c(this.f65628a.mo35985c(fVar), this);
        }
        m26772a(8);
        throw null;
    }

    /* renamed from: d */
    public boolean mo35975d() {
        return this.f65628a.mo35987e();
    }

    /* renamed from: e */
    public C22826c mo35976e() {
        C22826c cVar = this.f65629b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            m26772a(6);
            throw null;
        } else if (!mo35975d()) {
            C22827d dVar = this.f65628a;
            C22827d dVar2 = dVar.f65635c;
            if (dVar2 == null) {
                if (!dVar.mo35987e()) {
                    dVar.mo35986d();
                    dVar2 = dVar.f65635c;
                    if (dVar2 == null) {
                        C22827d.m26782a(8);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("root");
                }
            }
            C22826c cVar2 = new C22826c(dVar2);
            this.f65629b = cVar2;
            return cVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22826c) && this.f65628a.equals(((C22826c) obj).f65628a);
    }

    /* renamed from: f */
    public C22830f mo35978f() {
        C22830f h = this.f65628a.mo35991h();
        if (h != null) {
            return h;
        }
        m26772a(9);
        throw null;
    }

    /* renamed from: g */
    public C22830f mo35979g() {
        C22830f fVar;
        C22827d dVar = this.f65628a;
        if (dVar.mo35987e()) {
            fVar = C22827d.f65630e;
            if (fVar == null) {
                C22827d.m26782a(12);
                throw null;
            }
        } else {
            fVar = dVar.mo35991h();
            if (fVar == null) {
                C22827d.m26782a(13);
                throw null;
            }
        }
        return fVar;
    }

    /* renamed from: h */
    public boolean mo35980h(C22830f fVar) {
        if (fVar != null) {
            C22827d dVar = this.f65628a;
            if (fVar == null) {
                dVar.getClass();
                C22827d.m26782a(15);
                throw null;
            } else if (dVar.mo35987e()) {
                return false;
            } else {
                int indexOf = dVar.f65633a.indexOf(46);
                String str = dVar.f65633a;
                String b = fVar.mo35995b();
                if (indexOf == -1) {
                    indexOf = dVar.f65633a.length();
                }
                return str.regionMatches(0, b, 0, indexOf);
            }
        } else {
            m26772a(12);
            throw null;
        }
    }

    public int hashCode() {
        return this.f65628a.hashCode();
    }

    /* renamed from: i */
    public C22827d mo35982i() {
        C22827d dVar = this.f65628a;
        if (dVar != null) {
            return dVar;
        }
        m26772a(5);
        throw null;
    }

    public String toString() {
        return this.f65628a.toString();
    }

    public C22826c(C22827d dVar) {
        if (dVar != null) {
            this.f65628a = dVar;
        } else {
            m26772a(2);
            throw null;
        }
    }

    public C22826c(C22827d dVar, C22826c cVar) {
        if (dVar != null) {
            this.f65628a = dVar;
            this.f65629b = cVar;
            return;
        }
        m26772a(3);
        throw null;
    }
}
