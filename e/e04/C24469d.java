package e04;

import com.tencent.xweb.file.XVFSFile;
import vz3.C22826c;
import vz3.C26408b;

/* renamed from: e04.d */
public class C24469d {

    /* renamed from: a */
    public final String f69986a;

    public C24469d(String str) {
        if (str != null) {
            this.f69986a = str;
        } else {
            m30611a(5);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m30611a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C24469d m30612b(C26408b bVar) {
        if (bVar != null) {
            C22826c h = bVar.mo53392h();
            String replace = bVar.mo53394i().mo35973b().replace('.', '$');
            if (h.mo35975d()) {
                return new C24469d(replace);
            }
            return new C24469d(h.mo35973b().replace('.', XVFSFile.SEPARATOR_CHAR) + "/" + replace);
        }
        m30611a(1);
        throw null;
    }

    /* renamed from: c */
    public static C24469d m30613c(C22826c cVar) {
        if (cVar != null) {
            return new C24469d(cVar.mo35973b().replace('.', XVFSFile.SEPARATOR_CHAR));
        }
        m30611a(2);
        throw null;
    }

    /* renamed from: d */
    public static C24469d m30614d(String str) {
        if (str != null) {
            return new C24469d(str);
        }
        m30611a(0);
        throw null;
    }

    /* renamed from: e */
    public String mo51171e() {
        String str = this.f69986a;
        if (str != null) {
            return str;
        }
        m30611a(8);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24469d.class != obj.getClass()) {
            return false;
        }
        return this.f69986a.equals(((C24469d) obj).f69986a);
    }

    public int hashCode() {
        return this.f69986a.hashCode();
    }

    public String toString() {
        return this.f69986a;
    }
}
