package uz3;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: uz3.a */
public class C118638a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m167310a(int i) {
        int i2 = i;
        String str = (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? 2 : 3)];
        if (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i2 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i2 == 3) {
            objArr[1] = "encode8to7";
        } else if (i2 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i2 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i2 == 10) {
            objArr[1] = "dropMarker";
        } else if (i2 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i2 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i2) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static byte[] m167311b(String[] strArr) {
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    String[] strArr2 = (String[]) strArr.clone();
                    strArr2[0] = strArr2[0].substring(1);
                    int i = 0;
                    for (String length : strArr2) {
                        i += length.length();
                    }
                    byte[] bArr = new byte[i];
                    int i2 = 0;
                    for (String str : strArr2) {
                        int length2 = str.length();
                        int i3 = 0;
                        while (i3 < length2) {
                            bArr[i2] = (byte) str.charAt(i3);
                            i3++;
                            i2++;
                        }
                    }
                    return bArr;
                } else if (charAt == 65535) {
                    strArr = (String[]) strArr.clone();
                    strArr[0] = strArr[0].substring(1);
                }
            }
            int i4 = 0;
            for (String length3 : strArr) {
                i4 += length3.length();
            }
            byte[] bArr2 = new byte[i4];
            int i5 = 0;
            for (String str2 : strArr) {
                int length4 = str2.length();
                int i6 = 0;
                while (i6 < length4) {
                    bArr2[i5] = (byte) str2.charAt(i6);
                    i6++;
                    i5++;
                }
            }
            for (int i7 = 0; i7 < i4; i7++) {
                bArr2[i7] = (byte) ((bArr2[i7] + Byte.MAX_VALUE) & 127);
            }
            int i8 = (i4 * 7) / 8;
            byte[] bArr3 = new byte[i8];
            int i9 = 0;
            byte b = 0;
            for (int i15 = 0; i15 < i8; i15++) {
                i9++;
                int i16 = b + 1;
                bArr3[i15] = (byte) (((bArr2[i9] & ExifInterface.MARKER) >>> b) + ((bArr2[i9] & ((1 << i16) - 1)) << (7 - b)));
                if (b == 6) {
                    i9++;
                    b = 0;
                } else {
                    b = i16;
                }
            }
            return bArr3;
        }
        m167310a(7);
        throw null;
    }
}
