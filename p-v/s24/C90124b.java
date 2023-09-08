package s24;

import com.tencent.xweb.file.XVFSFile;
import java.io.File;

/* renamed from: s24.b */
public class C90124b {

    /* renamed from: a */
    public static final char f258815a;

    /* renamed from: b */
    public static final char f258816b;

    static {
        Character.toString('.');
        char c = File.separatorChar;
        f258815a = c;
        if (c == '\\') {
            f258816b = XVFSFile.SEPARATOR_CHAR;
        } else {
            f258816b = '\\';
        }
    }

    /* renamed from: a */
    public static String m112766a(String str, String str2) {
        int e = m112770e(str2);
        if (e < 0) {
            return null;
        }
        if (e > 0) {
            return m112773h(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return m112773h(str2);
        }
        if (m112772g(str.charAt(length - 1))) {
            return m112773h(str + str2);
        }
        return m112773h(str + XVFSFile.SEPARATOR_CHAR + str2);
    }

    /* renamed from: b */
    public static void m112767b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (str.charAt(i) != 0) {
                i++;
            } else {
                throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }

    /* renamed from: c */
    public static String m112768c(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (m112771f(str) > lastIndexOf) {
            lastIndexOf = -1;
        }
        return lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
    }

    /* renamed from: d */
    public static String m112769d(String str) {
        if (str == null) {
            return null;
        }
        m112767b(str);
        return str.substring(m112771f(str) + 1);
    }

    /* renamed from: e */
    public static int m112770e(String str) {
        int min;
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length != 1) {
            if (charAt == '~') {
                int indexOf = str.indexOf(47, 1);
                int indexOf2 = str.indexOf(92, 1);
                if (indexOf == -1 && indexOf2 == -1) {
                    return length + 1;
                }
                if (indexOf == -1) {
                    indexOf = indexOf2;
                }
                if (indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                min = Math.min(indexOf, indexOf2);
            } else {
                char charAt2 = str.charAt(1);
                if (charAt2 == ':') {
                    char upperCase = Character.toUpperCase(charAt);
                    return (upperCase < 'A' || upperCase > 'Z') ? upperCase == '/' ? 1 : -1 : (length == 2 || !m112772g(str.charAt(2))) ? 2 : 3;
                } else if (!m112772g(charAt) || !m112772g(charAt2)) {
                    return m112772g(charAt) ? 1 : 0;
                } else {
                    int indexOf3 = str.indexOf(47, 2);
                    int indexOf4 = str.indexOf(92, 2);
                    if ((indexOf3 == -1 && indexOf4 == -1) || indexOf3 == 2 || indexOf4 == 2) {
                        return -1;
                    }
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    }
                    if (indexOf4 == -1) {
                        indexOf4 = indexOf3;
                    }
                    min = Math.min(indexOf3, indexOf4);
                }
            }
            return min + 1;
        } else if (charAt == '~') {
            return 2;
        } else {
            return m112772g(charAt) ? 1 : 0;
        }
    }

    /* renamed from: f */
    public static int m112771f(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    /* renamed from: g */
    public static boolean m112772g(char c) {
        return c == '/' || c == '\\';
    }

    /* renamed from: h */
    public static String m112773h(String str) {
        boolean z;
        char c = f258815a;
        if (str != null) {
            m112767b(str);
            int length = str.length();
            if (length == 0) {
                return str;
            }
            int e = m112770e(str);
            if (e >= 0) {
                int i = length + 2;
                char[] cArr = new char[i];
                str.getChars(0, str.length(), cArr, 0);
                char c2 = f258816b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (cArr[i2] == c2) {
                        cArr[i2] = c;
                    }
                }
                if (cArr[length - 1] != c) {
                    cArr[length] = c;
                    length++;
                    z = false;
                } else {
                    z = true;
                }
                int i3 = e + 1;
                int i4 = i3;
                while (i4 < length) {
                    if (cArr[i4] == c) {
                        int i5 = i4 - 1;
                        if (cArr[i5] == c) {
                            System.arraycopy(cArr, i4, cArr, i5, length - i4);
                            length--;
                            i4 = i5;
                        }
                    }
                    i4++;
                }
                int i6 = i3;
                while (i6 < length) {
                    if (cArr[i6] == c) {
                        int i7 = i6 - 1;
                        if (cArr[i7] == '.' && (i6 == i3 || cArr[i6 - 2] == c)) {
                            if (i6 == length - 1) {
                                z = true;
                            }
                            System.arraycopy(cArr, i6 + 1, cArr, i7, length - i6);
                            length -= 2;
                            i6 = i7;
                        }
                    }
                    i6++;
                }
                int i8 = e + 2;
                int i9 = i8;
                while (i9 < length) {
                    if (cArr[i9] == c && cArr[i9 - 1] == '.' && cArr[i9 - 2] == '.' && (i9 == i8 || cArr[i9 - 3] == c)) {
                        if (i9 != i8) {
                            if (i9 == length - 1) {
                                z = true;
                            }
                            int i15 = i9 - 4;
                            while (true) {
                                if (i15 < e) {
                                    int i16 = i9 + 1;
                                    System.arraycopy(cArr, i16, cArr, e, length - i9);
                                    length -= i16 - e;
                                    i9 = i3;
                                    break;
                                } else if (cArr[i15] == c) {
                                    int i17 = i15 + 1;
                                    System.arraycopy(cArr, i9 + 1, cArr, i17, length - i9);
                                    length -= i9 - i15;
                                    i9 = i17;
                                    break;
                                } else {
                                    i15--;
                                }
                            }
                        }
                    }
                    i9++;
                }
                return length <= 0 ? "" : length <= e ? new String(cArr, 0, length) : z ? new String(cArr, 0, length) : new String(cArr, 0, length - 1);
            }
        }
        return null;
    }
}
