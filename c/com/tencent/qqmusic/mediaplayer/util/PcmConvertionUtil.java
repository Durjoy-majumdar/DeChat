package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.qqmusic.mediaplayer.BufferInfo;
import com.tencent.qqmusic.mediaplayer.FloatBufferInfo;

public class PcmConvertionUtil {
    private static void checkArrayLength(int[] iArr, int i) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("int Array must not be null or zero length");
        } else if (i > iArr.length) {
            throw new IllegalArgumentException("the length param can not larger than int Array length. param:" + i + ", int array length:" + iArr.length);
        }
    }

    private static void checkBufferLength(BufferInfo bufferInfo) {
        if (bufferInfo == null || bufferInfo.byteBuffer == null || bufferInfo.bufferSize <= 0) {
            throw new IllegalArgumentException("bufferInfo must not be null or zero length");
        }
    }

    private static void convertBitDepth24To16(BufferInfo bufferInfo, BufferInfo bufferInfo2, int i) {
        checkBufferLength(bufferInfo);
        if (bufferInfo2 == null) {
            throw new IllegalArgumentException("BufferInfo dest must not be null");
        } else if (i == 3) {
            int i2 = bufferInfo.bufferSize;
            bufferInfo2.setTempByteBufferCapacity(i2);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 % 3 != 0) {
                    bufferInfo2.tempByteBuffer[i3] = bufferInfo.byteBuffer[i4];
                    i3++;
                }
            }
            bufferInfo2.fillByte(bufferInfo2.tempByteBuffer, i3);
            bufferInfo2.bufferSize = i3;
        } else {
            throw new IllegalArgumentException("origin bit depth must be 3");
        }
    }

    private static void convertBitDepth32To16(BufferInfo bufferInfo, BufferInfo bufferInfo2, int i) {
        checkBufferLength(bufferInfo);
        if (bufferInfo2 == null) {
            throw new IllegalArgumentException("BufferInfo dest must not be null");
        } else if (i == 4) {
            int i2 = bufferInfo.bufferSize;
            bufferInfo2.setTempByteBufferCapacity(i2);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4 += 4) {
                DataConversionUtil.floatTo2Bytes(DataConversionUtil.bytesToFloat32bitInLittleEndian(bufferInfo.byteBuffer, i4), bufferInfo2.tempByteBuffer, i3);
                i3 += 2;
            }
            bufferInfo2.fillByte(bufferInfo2.tempByteBuffer, i3);
            bufferInfo2.bufferSize = i3;
        } else {
            throw new IllegalArgumentException("origin bit depth must be 4");
        }
    }

    public static void convertBitDepthTo16(BufferInfo bufferInfo, BufferInfo bufferInfo2, int i) {
        if (i == 2) {
            checkBufferLength(bufferInfo);
            bufferInfo.fillInto(bufferInfo2);
        } else if (i == 3) {
            convertBitDepth24To16(bufferInfo, bufferInfo2, i);
        } else if (i == 4) {
            convertBitDepth32To16(bufferInfo, bufferInfo2, i);
        } else {
            throw new IllegalArgumentException("not support originBitDepth, originBitDepth=" + i);
        }
    }

    public static void convertByteBufferToFloatBuffer(BufferInfo bufferInfo, FloatBufferInfo floatBufferInfo, int i) {
        checkBufferLength(bufferInfo);
        if (floatBufferInfo == null) {
            throw new IllegalArgumentException("BufferInfo dest must not be null");
        } else if (i > 0) {
            floatBufferInfo.setTempFloatBufferCapacity(bufferInfo.bufferSize / i);
            int i2 = bufferInfo.bufferSize;
            floatBufferInfo.bufferSize = i2 / i;
            DataConversionUtil.byteArrayToFloatArray(bufferInfo.byteBuffer, i2, i, floatBufferInfo.tempFloatBuffer);
            floatBufferInfo.fillFloat(floatBufferInfo.tempFloatBuffer, floatBufferInfo.bufferSize);
        } else {
            throw new IllegalArgumentException("bit depth must not be zero");
        }
    }

    private static void interpolateIn16Bit(BufferInfo bufferInfo, BufferInfo bufferInfo2, long j, long j2) {
        int i = bufferInfo.bufferSize / 2;
        float f = (float) i;
        int round = Math.round(((1.0f * f) / ((float) j)) * ((float) j2));
        short[] sArr = new short[i];
        short[] sArr2 = new short[round];
        DataConversionUtil.byteArray16BitToShortArray(bufferInfo.byteBuffer, bufferInfo.bufferSize, sArr);
        linearInterpolate(sArr, i, sArr2, round, ((float) round) / f);
        int i2 = round * 2;
        byte[] bArr = new byte[i2];
        DataConversionUtil.shortArrayToByteArray16Bit(sArr2, round, bArr);
        bufferInfo2.fillByte(bArr, i2);
    }

    private static void interpolateIn24Bit(BufferInfo bufferInfo, BufferInfo bufferInfo2, long j, long j2) {
        int i = bufferInfo.bufferSize / 3;
        float f = (float) i;
        int round = Math.round(((1.0f * f) / ((float) j)) * ((float) j2));
        int[] iArr = new int[i];
        int[] iArr2 = new int[round];
        DataConversionUtil.byteArray24BitToIntArray(bufferInfo.byteBuffer, bufferInfo.bufferSize, iArr);
        linearInterpolate(iArr, i, iArr2, round, ((float) round) / f);
        int i2 = round * 3;
        byte[] bArr = new byte[i2];
        DataConversionUtil.intArrayToByteArray24Bit(iArr2, round, bArr);
        bufferInfo2.fillByte(bArr, i2);
    }

    private static void interpolateIn32Bit(BufferInfo bufferInfo, BufferInfo bufferInfo2, long j, long j2) {
        int i = bufferInfo.bufferSize / 4;
        float f = (float) i;
        int round = Math.round(((1.0f * f) / ((float) j)) * ((float) j2));
        int[] iArr = new int[i];
        int[] iArr2 = new int[round];
        DataConversionUtil.byteArray32BitToIntArray(bufferInfo.byteBuffer, bufferInfo.bufferSize, iArr);
        linearInterpolate(iArr, i, iArr2, round, ((float) round) / f);
        int i2 = round * 4;
        byte[] bArr = new byte[i2];
        DataConversionUtil.intArrayToByteArray32Bit(iArr2, round, bArr);
        bufferInfo2.fillByte(bArr, i2);
    }

    private static void linearInterpolate(int[] iArr, int i, int[] iArr2, int i2, float f) {
        checkArrayLength(iArr, i);
        checkArrayLength(iArr2, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = ((float) i3) / f;
            int i4 = (int) f2;
            int i5 = i4 + 1;
            if (i5 >= i) {
                i5 = i - 1;
            }
            int i6 = iArr[i5];
            int i7 = iArr[i4];
            iArr2[i3] = (int) ((((float) (i6 - i7)) * (f2 - ((float) i4))) + ((float) i7));
        }
    }

    public static void reSample(BufferInfo bufferInfo, BufferInfo bufferInfo2, long j, long j2, int i) {
        checkBufferLength(bufferInfo);
        if (bufferInfo2 == null) {
            throw new IllegalArgumentException("BufferInfo dest must not be null");
        } else if (j == j2 || j2 <= 0 || j <= 0) {
            bufferInfo.fillInto(bufferInfo2);
        } else if (i == 2) {
            interpolateIn16Bit(bufferInfo, bufferInfo2, j, j2);
        } else if (i == 3) {
            interpolateIn24Bit(bufferInfo, bufferInfo2, j, j2);
        } else if (i != 4) {
            bufferInfo.fillInto(bufferInfo2);
        } else {
            interpolateIn32Bit(bufferInfo, bufferInfo2, j, j2);
        }
    }

    private static void checkArrayLength(short[] sArr, int i) {
        if (sArr == null || sArr.length == 0) {
            throw new IllegalArgumentException("short Array must not be null or zero length");
        } else if (i > sArr.length) {
            throw new IllegalArgumentException("the length param can not larger than short Array length. param:" + i + ", short array length:" + sArr.length);
        }
    }

    private static void linearInterpolate(short[] sArr, int i, short[] sArr2, int i2, float f) {
        checkArrayLength(sArr, i);
        checkArrayLength(sArr2, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = ((float) i3) / f;
            int i4 = (int) f2;
            int i5 = i4 + 1;
            if (i5 >= i) {
                i5 = i - 1;
            }
            short s = sArr[i5];
            short s2 = sArr[i4];
            sArr2[i3] = (short) ((int) ((((float) (s - s2)) * (f2 - ((float) i4))) + ((float) s2)));
        }
    }
}
