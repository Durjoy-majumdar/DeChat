package u24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import x24.C91135a;

/* renamed from: u24.h */
public class C90599h {
    /* renamed from: a */
    public static boolean m113508a(String str, String str2) {
        return (str == null || str2 == null || str.indexOf(str2) < 0) ? false : true;
    }

    /* renamed from: b */
    public static boolean m113509b(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: c */
    public static boolean m113510c(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    /* renamed from: d */
    public static boolean m113511d(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: e */
    public static String m113512e(Collection collection, String str) {
        if (collection == null) {
            return null;
        }
        return m113513f(collection.iterator(), str);
    }

    /* renamed from: f */
    public static String m113513f(Iterator it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next == null ? "" : next.toString();
        }
        C91135a aVar = new C91135a(256);
        if (next != null) {
            aVar.mo125201a(next.toString());
        }
        while (it.hasNext()) {
            if (str != null) {
                aVar.mo125201a(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                aVar.mo125201a(next2.toString());
            }
        }
        return aVar.toString();
    }

    /* renamed from: g */
    public static String m113514g(Object[] objArr, char c) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        int i = length + 0;
        if (i <= 0) {
            return "";
        }
        Object obj = objArr[0];
        C91135a aVar = new C91135a(i * ((obj == null ? 16 : obj.toString().length()) + 1));
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0) {
                aVar.mo125202b(aVar.f261354e + 1);
                char[] cArr = aVar.f261353d;
                int i3 = aVar.f261354e;
                aVar.f261354e = i3 + 1;
                cArr[i3] = c;
            }
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                aVar.mo125201a(obj2.toString());
            }
        }
        return aVar.toString();
    }

    /* renamed from: h */
    public static String m113515h(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        if (str == null) {
            str = "";
        }
        int i = length + 0;
        if (i <= 0) {
            return "";
        }
        Object obj = objArr[0];
        C91135a aVar = new C91135a(i * ((obj == null ? 16 : obj.toString().length()) + str.length()));
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0) {
                aVar.mo125201a(str);
            }
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                aVar.mo125201a(obj2.toString());
            }
        }
        return aVar.toString();
    }

    /* renamed from: i */
    public static String m113516i(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length <= 8192) {
            return m113517j(length, c).concat(str);
        }
        String valueOf = String.valueOf(c);
        if (m113511d(valueOf)) {
            valueOf = " ";
        }
        int length2 = valueOf.length();
        int length3 = i - str.length();
        if (length3 <= 0) {
            return str;
        }
        if (length2 == 1 && length3 <= 8192) {
            return m113516i(str, i, valueOf.charAt(0));
        }
        if (length3 == length2) {
            return valueOf.concat(str);
        }
        if (length3 < length2) {
            return valueOf.substring(0, length3).concat(str);
        }
        char[] cArr = new char[length3];
        char[] charArray = valueOf.toCharArray();
        for (int i2 = 0; i2 < length3; i2++) {
            cArr[i2] = charArray[i2 % length2];
        }
        return new String(cArr).concat(str);
    }

    /* renamed from: j */
    public static String m113517j(int i, char c) {
        if (i >= 0) {
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = c;
            }
            return new String(cArr);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Cannot pad a negative amount: ");
        stringBuffer.append(i);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    /* renamed from: k */
    public static String m113518k(String str, String str2, String str3) {
        if (m113511d(str) || m113511d(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int indexOf = str.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        C91135a aVar = new C91135a(str.length() + (length2 * 16));
        int i2 = -1;
        while (indexOf != -1) {
            aVar.mo125201a(str.substring(i, indexOf)).mo125201a(str3);
            i = indexOf + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            indexOf = str.indexOf(str2, i);
        }
        aVar.mo125201a(str.substring(i));
        return aVar.toString();
    }

    /* renamed from: l */
    public static String[] m113519l(String str, char c) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C90595a.f260301b;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < length) {
            if (str.charAt(i) == c) {
                if (z) {
                    arrayList.add(str.substring(i2, i));
                    z = false;
                }
                i2 = i + 1;
                i = i2;
            } else {
                i++;
                z = true;
            }
        }
        if (z) {
            arrayList.add(str.substring(i2, i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: m */
    public static String[] m113520m(String str, String str2) {
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C90595a.f260301b;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i = 0;
            z = false;
            i2 = 0;
            int i5 = 1;
            while (i < length) {
                if (Character.isWhitespace(str.charAt(i))) {
                    if (z) {
                        int i6 = i5 + 1;
                        if (i5 == -1) {
                            i = length;
                        }
                        arrayList.add(str.substring(i2, i));
                        i5 = i6;
                        z = false;
                    }
                    i2 = i + 1;
                    i = i2;
                } else {
                    i++;
                    z = true;
                }
            }
        } else {
            if (str2.length() == 1) {
                char charAt = str2.charAt(0);
                i4 = 0;
                z2 = false;
                i3 = 0;
                int i7 = 1;
                while (i4 < length) {
                    if (str.charAt(i4) == charAt) {
                        if (z2) {
                            int i8 = i7 + 1;
                            if (i7 == -1) {
                                i4 = length;
                            }
                            arrayList.add(str.substring(i3, i4));
                            i7 = i8;
                            z2 = false;
                        }
                        i3 = i4 + 1;
                        i4 = i3;
                    } else {
                        i4++;
                        z2 = true;
                    }
                }
            } else {
                int i9 = 0;
                z2 = false;
                i3 = 0;
                int i15 = 1;
                while (i4 < length) {
                    if (str2.indexOf(str.charAt(i4)) >= 0) {
                        if (z2) {
                            int i16 = i15 + 1;
                            if (i15 == -1) {
                                i4 = length;
                            }
                            arrayList.add(str.substring(i3, i4));
                            i15 = i16;
                            z2 = false;
                        }
                        i3 = i4 + 1;
                        i9 = i3;
                    } else {
                        i9 = i4 + 1;
                        z2 = true;
                    }
                }
            }
            i = i4;
            z = z2;
            i2 = i3;
        }
        if (z) {
            arrayList.add(str.substring(i2, i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: n */
    public static String m113521n(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            i += str.length();
        }
        if (i < 0) {
            i = 0;
        }
        return i > str.length() ? "" : str.substring(i);
    }

    /* renamed from: o */
    public static String m113522o(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0) {
            i2 += str.length();
        }
        if (i < 0) {
            i += str.length();
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        if (i > i2) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return str.substring(i, i2);
    }

    /* renamed from: p */
    public static String m113523p(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }
}
