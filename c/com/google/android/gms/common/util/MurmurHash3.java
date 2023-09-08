package com.google.android.gms.common.util;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;

public class MurmurHash3 {
    private MurmurHash3() {
    }

    public static int murmurhash3_x86_32(byte[] bArr, int i, int i2, int i3) {
        int i4 = (i2 & -4) + i;
        while (i < i4) {
            int i5 = ((bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | (bArr[i + 3] << 24)) * -862048943;
            int i6 = i3 ^ (((i5 << 15) | (i5 >>> 17)) * 461845907);
            i3 = (((i6 >>> 19) | (i6 << 13)) * 5) - 430675100;
            i += 4;
        }
        int i7 = 0;
        int i8 = i2 & 3;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    i7 = (bArr[i4 + 2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2;
                }
                int i9 = i3 ^ i2;
                int i15 = (i9 ^ (i9 >>> 16)) * -2048144789;
                int i16 = (i15 ^ (i15 >>> 13)) * -1028477387;
                return i16 ^ (i16 >>> 16);
            }
            i7 |= (bArr[i4 + 1] & ExifInterface.MARKER) << 8;
        }
        int i17 = ((bArr[i4] & ExifInterface.MARKER) | i7) * -862048943;
        i3 ^= ((i17 >>> 17) | (i17 << 15)) * 461845907;
        int i94 = i3 ^ i2;
        int i152 = (i94 ^ (i94 >>> 16)) * -2048144789;
        int i162 = (i152 ^ (i152 >>> 13)) * -1028477387;
        return i162 ^ (i162 >>> 16);
    }
}
