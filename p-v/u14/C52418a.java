package u14;

import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import y14.C53486a;

/* renamed from: u14.a */
public class C52418a {
    /* renamed from: a */
    public static int m58674a(int i, boolean z) {
        return C53486a.m60000c(i) + 1;
    }

    /* renamed from: b */
    public static int m58675b(int i, C89349b bVar) {
        if (bVar == null) {
            return 0;
        }
        return C53486a.m60000c(i) + C53486a.m59998a(bVar.f257327a.length) + bVar.f257327a.length;
    }

    /* renamed from: c */
    public static int m58676c(int i, double d) {
        return C53486a.m60000c(i) + 8;
    }

    /* renamed from: d */
    public static int m58677d(int i, float f) {
        return C53486a.m60000c(i) + 4;
    }

    /* renamed from: e */
    public static int m58678e(int i, int i2) {
        return i2 >= 0 ? C53486a.m60000c(i) + C53486a.m59998a(i2) : C53486a.m60000c(i) + 10;
    }

    /* renamed from: f */
    public static int m58679f(int i, int i2) {
        return m58678e(i, i2);
    }

    /* renamed from: g */
    public static int m58680g(int i, int i2, LinkedList<?> linkedList) {
        int i3;
        int i4 = 0;
        if (linkedList == null) {
            return 0;
        }
        switch (i2) {
            case 1:
                int i5 = 0;
                while (i4 < linkedList.size()) {
                    i5 = i3 + m58683j(i, (String) linkedList.get(i4));
                    i4++;
                }
                break;
            case 2:
                int i6 = 0;
                while (i4 < linkedList.size()) {
                    i6 = i3 + m58678e(i, ((Integer) linkedList.get(i4)).intValue());
                    i4++;
                }
                break;
            case 3:
                int i7 = 0;
                while (i4 < linkedList.size()) {
                    i7 = i3 + m58681h(i, ((Long) linkedList.get(i4)).longValue());
                    i4++;
                }
                break;
            case 4:
                int i8 = 0;
                while (i4 < linkedList.size()) {
                    i8 = i3 + m58676c(i, ((Double) linkedList.get(i4)).doubleValue());
                    i4++;
                }
                break;
            case 5:
                int i9 = 0;
                while (i4 < linkedList.size()) {
                    i9 = i3 + m58677d(i, ((Float) linkedList.get(i4)).floatValue());
                    i4++;
                }
                break;
            case 6:
                int i15 = 0;
                while (i4 < linkedList.size()) {
                    i15 = i3 + m58675b(i, (C89349b) linkedList.get(i4));
                    i4++;
                }
                break;
            case 7:
                int i16 = 0;
                while (i4 < linkedList.size()) {
                    i16 = i3 + m58674a(i, ((Boolean) linkedList.get(i4)).booleanValue());
                    i4++;
                }
                break;
            case 8:
                i3 = 0;
                while (i4 < linkedList.size()) {
                    i3 += m58682i(i, ((C47465a) linkedList.get(i4)).computeSize());
                    i4++;
                }
                break;
            default:
                throw new IllegalArgumentException("The data type was not found, the id used was " + i2);
        }
        return i3;
    }

    /* renamed from: h */
    public static int m58681h(int i, long j) {
        return C53486a.m60000c(i) + C53486a.m59999b(j);
    }

    /* renamed from: i */
    public static int m58682i(int i, int i2) {
        return C53486a.m60000c(i) + C53486a.m59998a(i2) + i2;
    }

    /* renamed from: j */
    public static int m58683j(int i, String str) {
        if (str == null) {
            return 0;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return C53486a.m60000c(i) + C53486a.m59998a(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException("UTF-8 not supported.");
        }
    }

    /* renamed from: k */
    public static int m58684k(int i, int i2, LinkedList<?> linkedList) {
        int i3;
        int i4;
        int i5 = 0;
        if (linkedList == null) {
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalArgumentException("The data type was not found, the id used was " + i2);
            } else if (linkedList.size() <= 0) {
                return 0;
            } else {
                int i6 = 0;
                while (i5 < linkedList.size()) {
                    i6 += C53486a.m59999b(((Long) linkedList.get(i5)).longValue());
                    i5++;
                }
                i3 = i6 + C53486a.m59998a(i6);
                i4 = C53486a.m60000c(i);
            }
        } else if (linkedList.size() <= 0) {
            return 0;
        } else {
            int i7 = 0;
            while (i5 < linkedList.size()) {
                i7 += C53486a.m59998a(((Integer) linkedList.get(i5)).intValue());
                i5++;
            }
            i3 = i7 + C53486a.m59998a(i7);
            i4 = C53486a.m60000c(i);
        }
        return i3 + i4;
    }

    /* renamed from: l */
    public static int m58685l(int i, LinkedList<?> linkedList) {
        int i2;
        int i3 = 0;
        if (linkedList == null) {
            return 0;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException("The data type was not found, the id used was " + i);
            } else if (linkedList.size() <= 0) {
                return 0;
            } else {
                i2 = 0;
                while (i3 < linkedList.size()) {
                    i2 += C53486a.m59999b(((Long) linkedList.get(i3)).longValue());
                    i3++;
                }
            }
        } else if (linkedList.size() <= 0) {
            return 0;
        } else {
            int i4 = 0;
            while (i3 < linkedList.size()) {
                i4 = i2 + C53486a.m59998a(((Integer) linkedList.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }
}
