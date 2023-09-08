package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;

class Mp3DecodeBase {
    public static boolean hasId3v2(byte[] bArr, int i) {
        return bArr != null && i >= 3 && bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51;
    }

    public static boolean isVBRIVBRHeader(byte[] bArr, int i) {
        return bArr != null && i >= 4 && bArr[0] == 86 && bArr[1] == 66 && bArr[2] == 82 && bArr[3] == 73;
    }

    public static boolean isXingVBRheader(byte[] bArr, int i) {
        if (bArr != null && i >= 4) {
            byte b = bArr[0];
            if (b == 88 && bArr[1] == 105 && bArr[2] == 110 && bArr[3] == 103) {
                return true;
            }
            return b == 73 && bArr[1] == 110 && bArr[2] == 102 && bArr[3] == 111;
        }
    }

    public static int readByte(byte[] bArr, int i) {
        return readByte(bArr, 0, i);
    }

    public static int readInt(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 < 4 || bArr.length < i2 + i) {
            return -1;
        }
        return (bArr[i + 3] & ExifInterface.MARKER) | ((bArr[i] & ExifInterface.MARKER) << 24) | ((bArr[i + 1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[i + 2] & ExifInterface.MARKER) << 8);
    }

    public static long readLong(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 < 4 || bArr.length < i2 + i) {
            return -1;
        }
        return (long) ((bArr[i + 3] & ExifInterface.MARKER) | ((bArr[i] & ExifInterface.MARKER) << 24) | ((bArr[i + 1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[i + 2] & ExifInterface.MARKER) << 8));
    }

    public static int readShort(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 < 2 || bArr.length < i2 + i) {
            return -1;
        }
        return (bArr[i + 1] & ExifInterface.MARKER) | ((bArr[i] & ExifInterface.MARKER) << 8);
    }

    public static int readUnsignedInt24(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 < 3 || bArr.length < i2 + i) {
            return -1;
        }
        return (bArr[i + 2] & ExifInterface.MARKER) | ((bArr[i] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[i + 1] & ExifInterface.MARKER) << 8);
    }

    public static int readByte(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 < 1 || bArr.length < i2 + i) {
            return -1;
        }
        return bArr[i] & ExifInterface.MARKER;
    }

    public static int readInt(byte[] bArr, int i) {
        return readInt(bArr, 0, i);
    }

    public static long readLong(byte[] bArr, int i) {
        return readLong(bArr, 0, i);
    }

    public static int readShort(byte[] bArr, int i) {
        return readShort(bArr, 0, i);
    }

    public static int readUnsignedInt24(byte[] bArr, int i) {
        return readUnsignedInt24(bArr, 0, i);
    }
}
