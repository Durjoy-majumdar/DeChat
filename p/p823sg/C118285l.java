package p823sg;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;

/* renamed from: sg.l */
public class C118285l {
    /* renamed from: a */
    public static void m166850a(C118284k kVar, C118284k kVar2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            kVar.f353526a[kVar.f353527b + i2] = (byte) ((kVar2.f353526a[(i2 >> 3) + kVar2.f353527b] >> (i2 & 7)) & 1);
        }
    }

    /* renamed from: b */
    public static void m166851b(C118284k kVar, C118284k kVar2, int i, int i2) {
        m166858i(kVar2, kVar, i2);
        for (int i3 = 0; i3 < i - i2; i3++) {
            byte[] bArr = kVar.f353526a;
            int i4 = kVar.f353527b;
            bArr[i4 + i3] = bArr[i4 + i3 + i2];
        }
        for (int i5 = 0; i5 < i2; i5++) {
            kVar.f353526a[((kVar.f353527b + i5) + i) - i2] = kVar2.f353526a[kVar2.f353527b + i5];
        }
    }

    /* renamed from: c */
    public static void m166852c(C118284k kVar, C118284k kVar2, C118284k[] kVarArr, int i, C118284k kVar3, C118284k kVar4, C118284k kVar5, C118284k kVar6, C118284k kVar7, C118284k kVar8) {
        byte[] bArr = {58, 50, ExifInterface.START_CODE, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, v2encoder.enumCODEC_vcodec2, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7};
        byte[] bArr2 = {40, 8, 48, v2encoder.enumCODEC_vcodec2, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27, 34, 2, ExifInterface.START_CODE, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25};
        m166850a(kVar3, kVar2, 64);
        m166854e(kVar3, kVar3, bArr, 64, kVar8);
        if (i == 0) {
            for (int i2 = 0; i2 < 16; i2++) {
                m166858i(kVar5, kVar7, 32);
                m166853d(kVar7, kVarArr[i2], kVar4, kVar8);
                m166856g(kVar7, kVar6, 32);
                m166858i(kVar6, kVar5, 32);
            }
        } else {
            for (int i3 = 15; i3 >= 0; i3--) {
                m166858i(kVar5, kVar6, 32);
                m166853d(kVar6, kVarArr[i3], kVar4, kVar8);
                m166856g(kVar6, kVar7, 32);
                m166858i(kVar7, kVar5, 32);
            }
        }
        m166854e(kVar3, kVar3, bArr2, 64, kVar8);
        for (int i4 = 0; i4 < 8; i4++) {
            kVar.f353526a[kVar.f353527b + i4] = (byte) 0;
        }
        for (int i5 = 0; i5 < 64; i5++) {
            byte[] bArr3 = kVar.f353526a;
            int i6 = kVar.f353527b + (i5 >> 3);
            bArr3[i6] = (byte) (bArr3[i6] | (kVar3.f353526a[kVar3.f353527b + i5] << (i5 & 7)));
        }
    }

    /* renamed from: d */
    public static void m166853d(C118284k kVar, C118284k kVar2, C118284k kVar3, C118284k kVar4) {
        C118284k kVar5 = kVar;
        C118284k kVar6 = kVar3;
        C118284k kVar7 = kVar4;
        byte[] bArr = {32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 13, 14, 15, v2encoder.enumCODEC_vcodec2, 17, v2encoder.enumCODEC_vcodec2, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1};
        byte[] bArr2 = {v2encoder.enumCODEC_vcodec2, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25};
        m166854e(kVar6, kVar5, bArr, 48, kVar7);
        m166856g(kVar6, kVar2, 48);
        byte b = 0;
        byte[][][] bArr3 = {new byte[][]{new byte[]{14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7}, new byte[]{0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8}, new byte[]{4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0}, new byte[]{15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13}}, new byte[][]{new byte[]{15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10}, new byte[]{3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5}, new byte[]{0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15}, new byte[]{13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9}}, new byte[][]{new byte[]{10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8}, new byte[]{13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1}, new byte[]{13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7}, new byte[]{1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12}}, new byte[][]{new byte[]{7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15}, new byte[]{13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9}, new byte[]{10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4}, new byte[]{3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14}}, new byte[][]{new byte[]{2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9}, new byte[]{14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6}, new byte[]{4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14}, new byte[]{11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3}}, new byte[][]{new byte[]{12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11}, new byte[]{10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8}, new byte[]{9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6}, new byte[]{4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13}}, new byte[][]{new byte[]{4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1}, new byte[]{13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6}, new byte[]{1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2}, new byte[]{6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12}}, new byte[][]{new byte[]{13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7}, new byte[]{1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2}, new byte[]{7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8}, new byte[]{2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11}}};
        int i = kVar6.f353527b;
        int i2 = kVar5.f353527b;
        for (byte b2 = 8; b < b2; b2 = 8) {
            byte[] bArr4 = kVar6.f353526a;
            int i3 = kVar6.f353527b;
            m166850a(kVar5, new C118284k(bArr3[b][(byte) ((bArr4[i3 + 0] << 1) + bArr4[i3 + 5])][(byte) ((bArr4[i3 + 1] << 3) + (bArr4[i3 + 2] << 2) + (bArr4[i3 + 3] << 1) + bArr4[i3 + 4])]), 4);
            b = (byte) (b + 1);
            kVar6.f353527b += 6;
            kVar5.f353527b += 4;
        }
        kVar6.f353527b = i;
        kVar5.f353527b = i2;
        m166854e(kVar5, kVar5, bArr2, 32, kVar7);
    }

    /* renamed from: e */
    public static void m166854e(C118284k kVar, C118284k kVar2, byte[] bArr, int i, C118284k kVar3) {
        for (int i2 = 0; i2 < i; i2++) {
            kVar3.f353526a[kVar3.f353527b + i2] = kVar2.f353526a[(kVar2.f353527b + bArr[i2]) - 1];
        }
        m166858i(kVar, kVar3, i);
    }

    /* renamed from: f */
    public static char m166855f(byte[] bArr, byte[] bArr2, long j, int i, byte[] bArr3, int i2) {
        C118284k kVar;
        int i3;
        int i4;
        byte[] bArr4 = bArr3;
        C118284k kVar2 = new C118284k(bArr);
        C118284k kVar3 = new C118284k(bArr2);
        C118284k[] kVarArr = new C118284k[16];
        for (int i5 = 0; i5 < 16; i5++) {
            kVarArr[i5] = new C118284k(new byte[48]);
        }
        C118284k kVar4 = new C118284k(new byte[256]);
        byte[] bArr5 = new byte[24];
        C118284k kVar5 = new C118284k(new byte[64]);
        C118284k kVar6 = new C118284k();
        C118284k kVar7 = new C118284k();
        C118284k kVar8 = new C118284k();
        C118284k kVar9 = new C118284k();
        C118284k kVar10 = new C118284k(new byte[64]);
        C118284k kVar11 = new C118284k(new byte[48]);
        C118284k kVar12 = new C118284k(new byte[32]);
        C118284k kVar13 = new C118284k(new byte[9]);
        C118284k kVar14 = kVar12;
        C118284k kVar15 = kVar11;
        C118284k kVar16 = new C118284k(new byte[8]);
        if (bArr4 == null || bArr4.length <= 0) {
            return 0;
        }
        long j2 = (j + 7) & -8;
        long j3 = 0;
        if (j2 == 0) {
            return 0;
        }
        kVar6.f353527b = 0;
        kVar6.f353526a = kVar5.f353526a;
        kVar7.f353527b = 28;
        kVar7.f353526a = kVar5.f353526a;
        kVar8.f353527b = 0;
        kVar8.f353526a = kVar10.f353526a;
        kVar9.f353527b = 32;
        kVar9.f353526a = kVar10.f353526a;
        int i6 = 0;
        while (i6 < 24) {
            bArr5[0 + i6] = (byte) 0;
            i6++;
            kVar10 = kVar10;
        }
        C118284k kVar17 = kVar10;
        int i7 = i;
        if (i7 > 24) {
            i7 = 24;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            bArr5[0 + i8] = bArr4[0 + i8];
        }
        byte[] bArr6 = {57, 49, 41, 33, 25, 17, 9, 1, 58, 50, ExifInterface.START_CODE, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4};
        byte[] bArr7 = {14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10, 23, 19, 12, 4, 26, 8, v2encoder.enumCODEC_vcodec2, 7, 27, 20, 13, 2, 41, 52, 31, 37, 47, 55, 30, 40, 51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, ExifInterface.START_CODE, 50, 36, 29, 32};
        byte[] bArr8 = {1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1};
        int i9 = 0;
        while (true) {
            kVar = kVar16;
            if (i9 >= 64) {
                break;
            }
            kVar5.f353526a[kVar5.f353527b + i9] = (byte) ((bArr5[(i9 >> 3) + 0] >> (i9 & 7)) & 1);
            i9++;
            kVar16 = kVar;
            kVar9 = kVar9;
            bArr5 = bArr5;
        }
        C118284k kVar18 = kVar9;
        m166854e(kVar5, kVar5, bArr6, 56, kVar4);
        for (int i15 = 0; i15 < 16; i15++) {
            m166851b(kVar6, kVar4, 28, bArr8[i15]);
            m166851b(kVar7, kVar4, 28, bArr8[i15]);
            m166854e(kVarArr[i15], kVar5, bArr7, 48, kVar4);
        }
        int i16 = kVar3.f353527b;
        int i17 = kVar2.f353527b;
        if (i2 == 0) {
            i4 = i16;
            C118284k kVar19 = kVar8;
            C118284k kVar20 = kVar8;
            C118284k kVar21 = kVar;
            i3 = i17;
            m166852c(kVar2, kVar13, kVarArr, i2, kVar17, kVar15, kVar14, kVar19, kVar18, kVar4);
            m166858i(kVar21, kVar2, 8);
            kVar2.f353527b += 8;
            long j4 = j2 >> 3;
            while (j3 < j4) {
                m166857h(kVar21, kVar21, kVar3);
                m166852c(kVar2, kVar21, kVarArr, i2, kVar17, kVar15, kVar14, kVar20, kVar18, kVar4);
                m166858i(kVar21, kVar2, 8);
                j3++;
                kVar2.f353527b += 8;
                kVar3.f353527b += 8;
            }
        } else {
            i3 = i17;
            C118284k kVar22 = kVar8;
            i4 = i16;
            C118284k kVar23 = kVar;
            m166858i(kVar13, kVar3, 8);
            kVar3.f353527b += 8;
            long j5 = j2 >> 3;
            long j6 = 1;
            while (j6 < j5) {
                C118284k kVar24 = kVar13;
                m166852c(kVar23, kVar3, kVarArr, i2, kVar17, kVar15, kVar14, kVar22, kVar18, kVar4);
                m166857h(kVar2, kVar23, kVar24);
                m166858i(kVar24, kVar3, 8);
                j6++;
                kVar2.f353527b += 8;
                kVar3.f353527b += 8;
                kVar13 = kVar24;
            }
        }
        kVar3.f353527b = i4;
        kVar2.f353527b = i3;
        return 1;
    }

    /* renamed from: g */
    public static void m166856g(C118284k kVar, C118284k kVar2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = kVar.f353526a;
            int i3 = kVar.f353527b + i2;
            bArr[i3] = (byte) (bArr[i3] ^ kVar2.f353526a[kVar2.f353527b + i2]);
        }
    }

    /* renamed from: h */
    public static void m166857h(C118284k kVar, C118284k kVar2, C118284k kVar3) {
        for (int i = 0; i < 8; i++) {
            kVar.f353526a[kVar.f353527b + i] = (byte) (kVar2.f353526a[kVar2.f353527b + i] ^ kVar3.f353526a[kVar3.f353527b + i]);
        }
    }

    /* renamed from: i */
    public static void m166858i(C118284k kVar, C118284k kVar2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            kVar.f353526a[kVar.f353527b + i2] = kVar2.f353526a[kVar2.f353527b + i2];
        }
    }
}
