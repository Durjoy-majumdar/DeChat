package p823sg;

import com.tencent.p014mm.pointers.PByteArray;

/* renamed from: sg.d */
public class C118283d {
    /* renamed from: a */
    public static int m166848a(PByteArray pByteArray, byte[] bArr, byte[] bArr2) {
        if (pByteArray == null || bArr == null || bArr2 == null || bArr.length < 0 || bArr2.length <= 0) {
            return 2;
        }
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        pByteArray.value = bArr3;
        char f = C118285l.m166855f(bArr3, bArr, (long) length, bArr2.length, bArr2, 1);
        int i = 12;
        if (f == 0) {
            return 12;
        }
        byte b = pByteArray.value[(length - 1) - 8];
        if (b > 0 && b <= 8) {
            int i2 = (length - b) - 8;
            byte[] bArr4 = new byte[i2];
            i = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                bArr4[i3] = pByteArray.value[i3];
            }
            pByteArray.value = bArr4;
        }
        return i;
    }

    /* renamed from: b */
    public static int m166849b(PByteArray pByteArray, byte[] bArr, byte[] bArr2) {
        if (pByteArray == null || bArr == null || bArr2 == null || bArr.length < 0 || bArr2.length <= 0) {
            return 2;
        }
        int length = 8 - (bArr.length % 8);
        if (length == 0) {
            length = 8;
        }
        int length2 = bArr.length + length;
        byte[] bArr3 = new byte[length2];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = bArr[i];
        }
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[bArr.length + i2] = (byte) length;
        }
        byte[] bArr4 = new byte[(bArr.length + length + 32)];
        pByteArray.value = bArr4;
        if (C118285l.m166855f(bArr4, bArr3, (long) length2, bArr2.length, bArr2, 0) == 0) {
            return 11;
        }
        int length3 = bArr.length + length + 8;
        byte[] bArr5 = new byte[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            bArr5[i3] = pByteArray.value[i3];
        }
        pByteArray.value = bArr5;
        return 0;
    }
}
