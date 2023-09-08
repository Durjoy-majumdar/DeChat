package com.tencent.qqmusic.mediaplayer.util;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.nio.ByteOrder;

public class DataConversionUtil {
    private static final float BASE_16BIT = 32768.0f;
    private static final float BASE_32BIT = 2.14748365E9f;
    private static final boolean IS_LITTLE_ENDIAN = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN);

    public static int byteArray16BitToShortArray(byte[] bArr, int i, short[] sArr) {
        checkByteArrayLength(bArr, i);
        checkShortArrayLength(sArr, i / 2);
        if (i % 2 == 0) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && i3 < sArr.length) {
                sArr[i3] = IS_LITTLE_ENDIAN ? bytesToShort16bitInLittleEndian(bArr, i2) : bytesToShort16bitInBigEndian(bArr, i2);
                i2 += 2;
                i3++;
            }
            return i3;
        }
        throw new IllegalArgumentException("length of byteArray must be multiple of 2");
    }

    public static int byteArray24BitToIntArray(byte[] bArr, int i, int[] iArr) {
        checkByteArrayLength(bArr, i);
        checkIntArrayLength(iArr, i / 3);
        if (i % 3 == 0) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && i3 < iArr.length) {
                iArr[i3] = IS_LITTLE_ENDIAN ? bytesToInt24bitInLittleEndian(bArr, i2) : bytesToInt24bitInBigEndian(bArr, i2);
                i2 += 3;
                i3++;
            }
            return i3;
        }
        throw new IllegalArgumentException("length of byteArray must be multiple of 3");
    }

    public static int byteArray32BitToIntArray(byte[] bArr, int i, int[] iArr) {
        checkByteArrayLength(bArr, i);
        checkIntArrayLength(iArr, i / 4);
        if (i % 4 == 0) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && i3 < iArr.length) {
                iArr[i3] = IS_LITTLE_ENDIAN ? bytesToInt32bitInLittleEndian(bArr, i2) : bytesToInt32bitInBigEndian(bArr, i2);
                i2 += 4;
                i3++;
            }
            return i3;
        }
        throw new IllegalArgumentException("length of byteArray must be multiple of 4");
    }

    public static int byteArrayToFloatArray(byte[] bArr, int i, int i2, float[] fArr) {
        checkByteArrayLength(bArr, i);
        checkFloatArrayLength(fArr, i / i2);
        checkByteArrayProperty(i, i2);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            fArr[i3 / i2] = i2 == 3 ? bytesToFloat24bit(bArr, i3) : bytesToFloat32bit(bArr, i3);
            i3 += i2;
            i4++;
        }
        return i4;
    }

    public static float bytesToFloat24bit(byte[] bArr, int i) {
        return IS_LITTLE_ENDIAN ? bytesToFloat24bitInLittleEndian(bArr, i) : bytesToFloat24bitInBigEndian(bArr, i);
    }

    public static float bytesToFloat24bitInBigEndian(byte[] bArr, int i) {
        return ((float) bytesToInt24bitInBigEndian(bArr, i)) / BASE_32BIT;
    }

    public static float bytesToFloat24bitInLittleEndian(byte[] bArr, int i) {
        return ((float) bytesToInt24bitInLittleEndian(bArr, i)) / BASE_32BIT;
    }

    public static float bytesToFloat32bit(byte[] bArr, int i) {
        return IS_LITTLE_ENDIAN ? bytesToFloat32bitInLittleEndian(bArr, i) : bytesToFloat32bitInBigEndian(bArr, i);
    }

    public static float bytesToFloat32bitInBigEndian(byte[] bArr, int i) {
        return ((float) bytesToInt32bitInBigEndian(bArr, i)) / BASE_32BIT;
    }

    public static float bytesToFloat32bitInLittleEndian(byte[] bArr, int i) {
        return ((float) bytesToInt32bitInLittleEndian(bArr, i)) / BASE_32BIT;
    }

    public static int bytesToInt24bitInBigEndian(byte[] bArr, int i) {
        return ((bArr[i] & ExifInterface.MARKER) << 24) | ((bArr[i + 2] << 8) & 255) | ((bArr[i + 1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
    }

    public static int bytesToInt24bitInLittleEndian(byte[] bArr, int i) {
        return ((bArr[i + 2] & ExifInterface.MARKER) << 24) | ((bArr[i] << 8) & 255) | ((bArr[i + 1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
    }

    public static int bytesToInt32bitInBigEndian(byte[] bArr, int i) {
        return ((bArr[i] & ExifInterface.MARKER) << 24) | (bArr[i + 3] & ExifInterface.MARKER) | ((bArr[i + 2] & ExifInterface.MARKER) << 8) | ((bArr[i + 1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
    }

    public static int bytesToInt32bitInLittleEndian(byte[] bArr, int i) {
        return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
    }

    public static short bytesToShort16bitInBigEndian(byte[] bArr, int i) {
        return (short) (((bArr[i] & ExifInterface.MARKER) << 8) | (bArr[i + 1] & ExifInterface.MARKER));
    }

    public static short bytesToShort16bitInLittleEndian(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & ExifInterface.MARKER) << 8) | (bArr[i] & ExifInterface.MARKER));
    }

    private static void checkByteArrayLength(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("byte Array must not be null or zero length");
        } else if (i > bArr.length) {
            throw new IllegalArgumentException("the length param can not larger than byte Array length. param:" + i + ", byte array length:" + bArr.length);
        }
    }

    private static void checkByteArrayProperty(int i, int i2) {
        if (i2 > 4 || i2 < 3) {
            throw new IllegalArgumentException("bytesPerSample of " + i2 + " is not supported");
        } else if (i % i2 != 0) {
            throw new IllegalArgumentException("length of byteArray must be multiple of bytesPerSample");
        }
    }

    private static void checkFloatArrayLength(float[] fArr, int i) {
        if (fArr == null || fArr.length == 0) {
            throw new IllegalArgumentException("float Array must not be null or zero length");
        } else if (i > fArr.length) {
            throw new IllegalArgumentException("the length param can not larger than float Array length. param:" + i + ", float array length:" + fArr.length);
        }
    }

    private static void checkIntArrayLength(int[] iArr, int i) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("int Array must not be null or zero length");
        } else if (i > iArr.length) {
            throw new IllegalArgumentException("the length param can not larger than int Array length. param:" + i + ", int array length:" + iArr.length);
        }
    }

    private static void checkShortArrayLength(short[] sArr, int i) {
        if (sArr == null || sArr.length == 0) {
            throw new IllegalArgumentException("short Array must not be null or zero length");
        } else if (i > sArr.length) {
            throw new IllegalArgumentException("the length param can not larger than short Array length. param:" + i + ", short array length:" + sArr.length);
        }
    }

    public static void floatTo2Bytes(float f, byte[] bArr, int i) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < -1.0f) {
            f = -1.0f;
        }
        shortTo2Bytes((short) ((int) (f * BASE_16BIT)), bArr, i);
    }

    public static int intArrayToByteArray24Bit(int[] iArr, int i, byte[] bArr) {
        checkIntArrayLength(iArr, i);
        checkByteArrayLength(bArr, i * 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            intTo3Bytes(iArr[i2], bArr, i3);
            i2++;
            i3 += 3;
        }
        return i3;
    }

    public static int intArrayToByteArray32Bit(int[] iArr, int i, byte[] bArr) {
        checkIntArrayLength(iArr, i);
        checkByteArrayLength(bArr, i * 4);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            intTo4Bytes(iArr[i2], bArr, i3);
            i2++;
            i3 += 4;
        }
        return i3;
    }

    public static void intTo3Bytes(int i, byte[] bArr, int i2) {
        if (IS_LITTLE_ENDIAN) {
            bArr[i2] = (byte) ((i >> 8) & 255);
            bArr[i2 + 1] = (byte) ((i >> 16) & 255);
            bArr[i2 + 2] = (byte) ((i >> 24) & 255);
            return;
        }
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2] = (byte) ((i >> 24) & 255);
    }

    public static void intTo4Bytes(int i, byte[] bArr, int i2) {
        if (IS_LITTLE_ENDIAN) {
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            return;
        }
        bArr[i2 + 3] = (byte) (i & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2] = (byte) ((i >> 24) & 255);
    }

    public static int shortArrayToByteArray16Bit(short[] sArr, int i, byte[] bArr) {
        checkShortArrayLength(sArr, i);
        checkByteArrayLength(bArr, i * 2);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            shortTo2Bytes(sArr[i2], bArr, i3);
            i2++;
            i3 += 2;
        }
        return i3;
    }

    public static void shortTo2Bytes(short s, byte[] bArr, int i) {
        if (IS_LITTLE_ENDIAN) {
            bArr[i] = (byte) (s & 255);
            bArr[i + 1] = (byte) ((s >> 8) & 255);
            return;
        }
        bArr[i + 1] = (byte) (s & 255);
        bArr[i] = (byte) ((s >> 8) & 255);
    }
}
