package d24;

import com.tencent.xweb.file.XVFSFile;
import e24.C20509c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: d24.r */
public final class C20419r {

    /* renamed from: a */
    public final String[] f57262a;

    /* renamed from: d24.r$a */
    public static final class C20420a {

        /* renamed from: a */
        public final List<String> f57263a = new ArrayList(20);

        /* renamed from: a */
        public C20420a mo31934a(String str) {
            int indexOf = str.indexOf(XVFSFile.PATH_SEPARATOR, 1);
            if (indexOf != -1) {
                mo31935b(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(XVFSFile.PATH_SEPARATOR)) {
                mo31935b("", str.substring(1));
                return this;
            } else {
                mo31935b("", str);
                return this;
            }
        }

        /* renamed from: b */
        public C20420a mo31935b(String str, String str2) {
            ((ArrayList) this.f57263a).add(str);
            ((ArrayList) this.f57263a).add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public String mo31936c(String str) {
            for (int size = ((ArrayList) this.f57263a).size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) ((ArrayList) this.f57263a).get(size))) {
                    return (String) ((ArrayList) this.f57263a).get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: d */
        public C20420a mo31937d(String str) {
            int i = 0;
            while (i < ((ArrayList) this.f57263a).size()) {
                if (str.equalsIgnoreCase((String) ((ArrayList) this.f57263a).get(i))) {
                    ((ArrayList) this.f57263a).remove(i);
                    ((ArrayList) this.f57263a).remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: e */
        public C20420a mo31938e(String str, String str2) {
            C20419r.m21971a(str);
            C20419r.m21972b(str2, str);
            mo31937d(str);
            mo31935b(str, str2);
            return this;
        }
    }

    public C20419r(C20420a aVar) {
        List<String> list = aVar.f57263a;
        this.f57262a = (String[]) ((ArrayList) list).toArray(new String[((ArrayList) list).size()]);
    }

    /* renamed from: a */
    public static void m21971a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C20509c.m22204j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* renamed from: b */
    public static void m21972b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C20509c.m22204j("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    /* renamed from: c */
    public String mo31926c(String str) {
        String[] strArr = this.f57262a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    /* renamed from: d */
    public String mo31927d(int i) {
        return this.f57262a[i * 2];
    }

    /* renamed from: e */
    public C20420a mo31928e() {
        C20420a aVar = new C20420a();
        Collections.addAll(aVar.f57263a, this.f57262a);
        return aVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C20419r) && Arrays.equals(((C20419r) obj).f57262a, this.f57262a);
    }

    /* renamed from: f */
    public String mo31930f(int i) {
        return this.f57262a[(i * 2) + 1];
    }

    /* renamed from: g */
    public List<String> mo31931g(String str) {
        int length = this.f57262a.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(mo31927d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo31930f(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f57262a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f57262a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(mo31927d(i));
            sb.append(": ");
            sb.append(mo31930f(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
