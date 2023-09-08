package j24;

import e24.C20509c;
import java.io.IOException;
import o24.C21769k;

/* renamed from: j24.e */
public final class C21161e {

    /* renamed from: a */
    public static final C21769k f59837a = C21769k.f61697h.mo34164a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f59838b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f59839c = new String[64];

    /* renamed from: d */
    public static final String[] f59840d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f59840d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C20509c.m22204j("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f59839c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f59839c;
            strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
        }
        String[] strArr4 = f59839c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f59839c;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = f59839c;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = f59840d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static String m23585a(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String[] strArr = f59838b;
        String j = b < strArr.length ? strArr[b] : C20509c.m22204j("0x%02x", Byte.valueOf(b));
        if (b2 == 0) {
            str = "";
        } else {
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    str = b2 == 1 ? "ACK" : f59840d[b2];
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr2 = f59839c;
                    String str2 = b2 < strArr2.length ? strArr2[b2] : f59840d[b2];
                    str = (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = f59840d[b2];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = j;
        objArr[4] = str;
        return C20509c.m22204j("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: b */
    public static IOException m23586b(String str, Object... objArr) {
        throw new IOException(C20509c.m22204j(str, objArr));
    }
}
