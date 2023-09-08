package u24;

import java.io.PrintStream;

/* renamed from: u24.i */
public class C90600i {

    /* renamed from: a */
    public static final String f260315a;

    /* renamed from: b */
    public static final String f260316b = m113527d("line.separator");

    /* renamed from: c */
    public static final String f260317c = m113527d("os.name");

    /* renamed from: d */
    public static final String f260318d = m113527d("os.version");

    /* renamed from: e */
    public static final String f260319e;

    static {
        String str;
        m113527d("awt.toolkit");
        m113527d("file.encoding");
        m113527d("file.separator");
        m113527d("java.awt.fonts");
        m113527d("java.awt.graphicsenv");
        m113527d("java.awt.headless");
        m113527d("java.awt.printerjob");
        m113527d("java.class.path");
        m113527d("java.class.version");
        m113527d("java.compiler");
        m113527d("java.endorsed.dirs");
        m113527d("java.ext.dirs");
        m113527d("java.home");
        m113527d("java.io.tmpdir");
        m113527d("java.library.path");
        m113527d("java.runtime.name");
        m113527d("java.runtime.version");
        m113527d("java.specification.name");
        m113527d("java.specification.vendor");
        m113527d("java.specification.version");
        m113527d("java.util.prefs.PreferencesFactory");
        m113527d("java.vendor");
        m113527d("java.vendor.url");
        String d = m113527d("java.version");
        f260315a = d;
        m113527d("java.vm.info");
        m113527d("java.vm.name");
        m113527d("java.vm.specification.name");
        m113527d("java.vm.specification.vendor");
        m113527d("java.vm.specification.version");
        m113527d("java.vm.vendor");
        m113527d("java.vm.version");
        m113527d("os.arch");
        m113527d("path.separator");
        String str2 = "user.country";
        if (m113527d(str2) == null) {
            str2 = "user.region";
        }
        m113527d(str2);
        m113527d("user.dir");
        m113527d("user.home");
        m113527d("user.language");
        m113527d("user.name");
        m113527d("user.timezone");
        if (d != null) {
            int i = 0;
            while (true) {
                String str3 = f260315a;
                if (i >= str3.length()) {
                    break;
                }
                char charAt = str3.charAt(i);
                if (charAt >= '0' && charAt <= '9') {
                    str = str3.substring(i);
                    break;
                }
                i++;
            }
        }
        str = null;
        f260319e = str;
        int[] e = m113528e(f260315a, 3);
        if (e.length != 0) {
            if (e.length == 1) {
                int i2 = e[0];
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(e[0]);
                stringBuffer.append('.');
                for (int i3 = 1; i3 < e.length; i3++) {
                    stringBuffer.append(e[i3]);
                }
                try {
                    Float.parseFloat(stringBuffer.toString());
                } catch (Exception unused) {
                }
            }
        }
        int[] e2 = m113528e(f260315a, 3);
        int length = e2.length;
        if (length >= 1) {
            int i4 = e2[0];
        }
        if (length >= 2) {
            int i5 = e2[1];
        }
        if (length >= 3) {
            int i6 = e2[2];
        }
        m113524a("1.1");
        m113524a("1.2");
        m113524a("1.3");
        m113524a("1.4");
        m113524a("1.5");
        m113524a("1.6");
        m113524a("1.7");
        m113526c("AIX");
        m113526c("HP-UX");
        m113526c("Irix");
        if (!m113526c("Linux")) {
            boolean c = m113526c("LINUX");
        }
        m113526c("Mac");
        m113526c("Mac OS X");
        m113526c("OS/2");
        m113526c("Solaris");
        m113526c("SunOS");
        m113526c("Windows");
        m113525b("Windows", "5.0");
        m113525b("Windows 9", "4.0");
        m113525b("Windows 9", "4.1");
        m113525b("Windows", "4.9");
        m113526c("Windows NT");
        m113525b("Windows", "5.1");
        m113525b("Windows", "6.0");
        m113525b("Windows", "6.1");
    }

    /* renamed from: a */
    public static boolean m113524a(String str) {
        String str2 = f260319e;
        if (str2 == null) {
            return false;
        }
        return str2.startsWith(str);
    }

    /* renamed from: b */
    public static boolean m113525b(String str, String str2) {
        String str3 = f260317c;
        String str4 = f260318d;
        return str3 != null && str4 != null && str3.startsWith(str) && str4.startsWith(str2);
    }

    /* renamed from: c */
    public static boolean m113526c(String str) {
        String str2 = f260317c;
        if (str2 == null) {
            return false;
        }
        return str2.startsWith(str);
    }

    /* renamed from: d */
    public static String m113527d(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Caught a SecurityException reading the system property '");
            stringBuffer.append(str);
            stringBuffer.append("'; the SystemUtils property value will default to null.");
            printStream.println(stringBuffer.toString());
            return null;
        }
    }

    /* renamed from: e */
    public static int[] m113528e(String str, int i) {
        if (str == null) {
            return C90595a.f260302c;
        }
        String[] m = C90599h.m113520m(str, "._- ");
        int min = Math.min(i, m.length);
        int[] iArr = new int[min];
        int i2 = 0;
        for (int i3 = 0; i3 < m.length && i2 < i; i3++) {
            String str2 = m[i3];
            if (str2.length() > 0) {
                try {
                    iArr[i2] = Integer.parseInt(str2);
                    i2++;
                } catch (Exception unused) {
                }
            }
        }
        if (min <= i2) {
            return iArr;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        return iArr2;
    }
}
