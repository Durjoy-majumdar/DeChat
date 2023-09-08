package vz3;

/* renamed from: vz3.f */
public final class C22830f implements Comparable<C22830f> {

    /* renamed from: d */
    public final String f65637d;

    /* renamed from: e */
    public final boolean f65638e;

    public C22830f(String str, boolean z) {
        if (str != null) {
            this.f65637d = str;
            this.f65638e = z;
            return;
        }
        m26792a(0);
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m26792a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3)];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2 || i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: e */
    public static C22830f m26793e(String str) {
        if (str != null) {
            return str.startsWith("<") ? m26796h(str) : m26794f(str);
        }
        m26792a(8);
        throw null;
    }

    /* renamed from: f */
    public static C22830f m26794f(String str) {
        if (str != null) {
            return new C22830f(str, false);
        }
        m26792a(5);
        throw null;
    }

    /* renamed from: g */
    public static boolean m26795g(String str) {
        if (str == null) {
            m26792a(6);
            throw null;
        } else if (str.isEmpty() || str.startsWith("<")) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: h */
    public static C22830f m26796h(String str) {
        if (str == null) {
            m26792a(7);
            throw null;
        } else if (str.startsWith("<")) {
            return new C22830f(str, true);
        } else {
            throw new IllegalArgumentException("special name must start with '<': " + str);
        }
    }

    /* renamed from: b */
    public String mo35995b() {
        String str = this.f65637d;
        if (str != null) {
            return str;
        }
        m26792a(1);
        throw null;
    }

    /* renamed from: c */
    public String mo35996c() {
        if (!this.f65638e) {
            String b = mo35995b();
            if (b != null) {
                return b;
            }
            m26792a(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public int compareTo(Object obj) {
        return this.f65637d.compareTo(((C22830f) obj).f65637d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22830f)) {
            return false;
        }
        C22830f fVar = (C22830f) obj;
        return this.f65638e == fVar.f65638e && this.f65637d.equals(fVar.f65637d);
    }

    public int hashCode() {
        return (this.f65637d.hashCode() * 31) + (this.f65638e ? 1 : 0);
    }

    public String toString() {
        return this.f65637d;
    }
}
