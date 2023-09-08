package com.tencent.qqmusic.mediaplayer.util;

import androidx.exifinterface.media.ExifInterface;
import java.io.PrintStream;
import java.nio.ByteOrder;

public class BytesTransUtil {
    private static BytesTransUtil instance;
    private String TAG = "BytesTransUtil";

    private BytesTransUtil() {
    }

    public static BytesTransUtil getInstance() {
        if (instance == null) {
            instance = new BytesTransUtil();
        }
        return instance;
    }

    public int[] Bytes2Ints(byte[] bArr) {
        int length = bArr.length / 4;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            byte[] bArr2 = new byte[4];
            for (int i2 = 0; i2 < 4; i2++) {
                bArr2[i2] = bArr[(i * 4) + i2];
            }
            iArr[i] = getInt(bArr2);
            PrintStream printStream = System.out;
            printStream.println("2out->" + iArr[i]);
        }
        return iArr;
    }

    public long[] Bytes2Longs(byte[] bArr) {
        int length = bArr.length / 8;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            byte[] bArr2 = new byte[8];
            for (int i2 = 0; i2 < 8; i2++) {
                bArr2[i2] = bArr[(i * 8) + i2];
            }
            jArr[i] = getLong(bArr2);
        }
        return jArr;
    }

    public short[] Bytes2Shorts(short[] sArr, byte[] bArr) {
        byte[] bArr2 = new byte[2];
        for (int i = 0; i < sArr.length; i++) {
            System.arraycopy(bArr, i * 2, bArr2, 0, 2);
            sArr[i] = getShort(bArr2);
        }
        return sArr;
    }

    public byte[] Ints2Bytes(int[] iArr) {
        byte[] bArr = new byte[(iArr.length * 4)];
        for (int i = 0; i < iArr.length; i++) {
            byte[] bytes = getBytes(iArr[i]);
            PrintStream printStream = System.out;
            printStream.println("1out->" + iArr[i]);
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[(i * 4) + i2] = bytes[i2];
            }
        }
        return bArr;
    }

    public byte[] Longs2Bytes(long[] jArr) {
        byte[] bArr = new byte[(jArr.length * 8)];
        for (int i = 0; i < jArr.length; i++) {
            byte[] bytes = getBytes(jArr[i]);
            for (int i2 = 0; i2 < 8; i2++) {
                bArr[(i * 8) + i2] = bytes[i2];
            }
        }
        return bArr;
    }

    public byte[] Shorts2Bytes(short[] sArr) {
        byte[] bArr = new byte[(sArr.length * 2)];
        Shorts2Bytes(sArr, bArr);
        return bArr;
    }

    public byte[] getBytes(short s, boolean z) {
        byte[] bArr = new byte[2];
        if (z) {
            for (int i = 1; i >= 0; i--) {
                bArr[i] = (byte) (s & 255);
                s = (short) (s >> 8);
            }
        } else {
            for (int i2 = 0; i2 < 2; i2++) {
                bArr[i2] = (byte) (s & 255);
                s = (short) (s >> 8);
            }
        }
        return bArr;
    }

    public int getInt(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new IllegalArgumentException("byte array is null!");
        } else if (bArr.length <= 4) {
            int i = 0;
            if (z) {
                byte b = 0;
                while (i < bArr.length) {
                    b = (b << 8) | (bArr[i] & ExifInterface.MARKER);
                    i++;
                }
                return b;
            }
            for (int length = bArr.length - 1; length >= 0; length--) {
                i = (i << 8) | (bArr[length] & ExifInterface.MARKER);
            }
            return i;
        } else {
            throw new IllegalArgumentException("byte array size > 4 !");
        }
    }

    public long getLong(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new IllegalArgumentException("byte array is null!");
        } else if (bArr.length <= 8) {
            long j = 0;
            if (z) {
                for (byte b : bArr) {
                    j = (j << 8) | ((long) (b & ExifInterface.MARKER));
                }
            } else {
                for (int length = bArr.length - 1; length >= 0; length--) {
                    j = (j << 8) | ((long) (bArr[length] & ExifInterface.MARKER));
                }
            }
            return j;
        } else {
            throw new IllegalArgumentException("byte array size > 8 !");
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public short getShort(byte[] r3, boolean r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0034
            int r0 = r3.length
            r1 = 2
            if (r0 > r1) goto L_0x002c
            r0 = 0
            if (r4 == 0) goto L_0x0019
            r4 = 0
        L_0x000a:
            int r1 = r3.length
            if (r0 >= r1) goto L_0x002b
            int r4 = r4 << 8
            short r4 = (short) r4
            byte r1 = r3[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4 = r4 | r1
            short r4 = (short) r4
            int r0 = r0 + 1
            goto L_0x000a
        L_0x0019:
            int r4 = r3.length
            int r4 = r4 + -1
        L_0x001c:
            if (r4 < 0) goto L_0x002a
            int r0 = r0 << 8
            short r0 = (short) r0
            byte r1 = r3[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            short r0 = (short) r0
            int r4 = r4 + -1
            goto L_0x001c
        L_0x002a:
            r4 = r0
        L_0x002b:
            return r4
        L_0x002c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "byte array size > 2 !"
            r3.<init>(r4)
            throw r3
        L_0x0034:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "byte array is null!"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.util.BytesTransUtil.getShort(byte[], boolean):short");
    }

    public boolean testCPU() {
        return ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public void Shorts2Bytes(short[] sArr, byte[] bArr) {
        for (int i = 0; i < sArr.length; i++) {
            System.arraycopy(getBytes(sArr[i]), 0, bArr, i * 2, 2);
        }
    }

    public byte[] getBytes(int i, boolean z) {
        byte[] bArr = new byte[4];
        if (z) {
            for (int i2 = 3; i2 >= 0; i2--) {
                bArr[i2] = (byte) (i & 255);
                i >>= 8;
            }
        } else {
            System.out.println("1");
            for (int i3 = 0; i3 < 4; i3++) {
                bArr[i3] = (byte) (i & 255);
                i >>= 8;
            }
        }
        return bArr;
    }

    public byte[] getBytes(long j, boolean z) {
        byte[] bArr = new byte[8];
        if (z) {
            for (int i = 7; i >= 0; i--) {
                bArr[i] = (byte) ((int) (j & 255));
                j >>= 8;
            }
        } else {
            for (int i2 = 0; i2 < 8; i2++) {
                bArr[i2] = (byte) ((int) (j & 255));
                j >>= 8;
            }
        }
        return bArr;
    }

    public byte[] getBytes(int i) {
        return getBytes(i, testCPU());
    }

    public int getInt(byte[] bArr) {
        return getInt(bArr, testCPU());
    }

    public long getLong(byte[] bArr) {
        return getLong(bArr, testCPU());
    }

    public short getShort(byte[] bArr) {
        return getShort(bArr, testCPU());
    }

    public byte[] getBytes(short s) {
        return getBytes(s, testCPU());
    }

    public byte[] getBytes(long j) {
        return getBytes(j, testCPU());
    }
}
