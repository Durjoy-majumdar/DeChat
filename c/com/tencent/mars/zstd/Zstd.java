package com.tencent.mars.zstd;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Zstd {
    public static native long compress(byte[] bArr, byte[] bArr2, int i);

    public static byte[] compress(byte[] bArr) {
        return compress(bArr, 3);
    }

    public static native long compressBound(long j);

    public static native long compressByteArray(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, int i5);

    public static native long compressDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, int i5);

    public static native long compressDirectByteBufferFastDict(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ZstdDictCompress zstdDictCompress);

    public static native long compressDirectByteBufferUsingDict(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, byte[] bArr, int i5);

    public static native long compressFastDict(byte[] bArr, int i, byte[] bArr2, int i2, int i3, ZstdDictCompress zstdDictCompress);

    public static native long compressUsingDict(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4);

    @Deprecated
    public static long compressUsingDict(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return compressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3, i);
    }

    public static native long decompress(byte[] bArr, byte[] bArr2);

    public static byte[] decompress(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        long decompress = decompress(bArr2, bArr);
        if (!isError(decompress)) {
            return decompress != ((long) i) ? Arrays.copyOfRange(bArr2, 0, (int) decompress) : bArr2;
        }
        throw new RuntimeException(getErrorName(decompress));
    }

    public static native long decompressByteArray(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static native long decompressDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public static native long decompressDirectByteBufferFastDict(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ZstdDictDecompress zstdDictDecompress);

    public static native long decompressDirectByteBufferUsingDict(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, byte[] bArr);

    public static native long decompressFastDict(byte[] bArr, int i, byte[] bArr2, int i2, int i3, ZstdDictDecompress zstdDictDecompress);

    public static native long decompressUsingDict(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3);

    @Deprecated
    public static long decompressUsingDict(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decompressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    public static native long decompressedDirectByteBufferSize(ByteBuffer byteBuffer, int i, int i2);

    public static long decompressedSize(ByteBuffer byteBuffer) {
        return decompressedDirectByteBufferSize(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public static native long decompressedSize(byte[] bArr);

    public static native String getErrorName(long j);

    public static native boolean isError(long j);

    public static long trainFromBuffer(byte[][] bArr, byte[] bArr2) {
        return trainFromBuffer(bArr, bArr2, false);
    }

    public static native long trainFromBuffer(byte[][] bArr, byte[] bArr2, boolean z);

    public static long trainFromBufferDirect(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2) {
        return trainFromBufferDirect(byteBuffer, iArr, byteBuffer2, false);
    }

    public static native long trainFromBufferDirect(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z);

    public static byte[] compress(byte[] bArr, int i) {
        long compressBound = compressBound((long) bArr.length);
        if (compressBound <= 2147483647L) {
            byte[] bArr2 = new byte[((int) compressBound)];
            long compress = compress(bArr2, bArr, i);
            if (!isError(compress)) {
                return Arrays.copyOfRange(bArr2, 0, (int) compress);
            }
            throw new RuntimeException(getErrorName(compress));
        }
        throw new RuntimeException("Max output size is greater than MAX_INT");
    }

    public static byte[] compressUsingDict(byte[] bArr, byte[] bArr2, int i) {
        long compressBound = compressBound((long) bArr.length);
        if (compressBound <= 2147483647L) {
            byte[] bArr3 = new byte[((int) compressBound)];
            long compressUsingDict = compressUsingDict(bArr3, 0, bArr, 0, bArr.length, bArr2, i);
            if (!isError(compressUsingDict)) {
                return Arrays.copyOfRange(bArr3, 0, (int) compressUsingDict);
            }
            throw new RuntimeException(getErrorName(compressUsingDict));
        }
        throw new RuntimeException("Max output size is greater than MAX_INT");
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuf must be a direct buffer");
        } else if (byteBuffer.isDirect()) {
            long decompressDirectByteBuffer = decompressDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
            if (!isError(decompressDirectByteBuffer)) {
                byteBuffer2.position(byteBuffer2.limit());
                int i = (int) decompressDirectByteBuffer;
                byteBuffer.position(byteBuffer.position() + i);
                return i;
            }
            throw new RuntimeException(getErrorName(decompressDirectByteBuffer));
        } else {
            throw new IllegalArgumentException("dstBuf must be a direct buffer");
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuf must be a direct buffer");
        } else if (byteBuffer.isDirect()) {
            long compressDirectByteBuffer = compressDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), i);
            if (!isError(compressDirectByteBuffer)) {
                byteBuffer2.position(byteBuffer2.limit());
                int i2 = (int) compressDirectByteBuffer;
                byteBuffer.position(byteBuffer.position() + i2);
                return i2;
            }
            throw new RuntimeException(getErrorName(compressDirectByteBuffer));
        } else {
            throw new IllegalArgumentException("dstBuf must be a direct buffer");
        }
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, int i) {
        if (byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            long decompressDirectByteBuffer = decompressDirectByteBuffer(allocateDirect, 0, i, byteBuffer, byteBuffer.position(), byteBuffer.limit());
            if (!isError(decompressDirectByteBuffer)) {
                byteBuffer.position(byteBuffer.limit());
                return allocateDirect;
            }
            throw new RuntimeException(getErrorName(decompressDirectByteBuffer));
        }
        throw new IllegalArgumentException("srcBuf must be a direct buffer");
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, int i) {
        if (byteBuffer.isDirect()) {
            long compressBound = compressBound((long) (byteBuffer.limit() - byteBuffer.position()));
            if (compressBound <= 2147483647L) {
                int i2 = (int) compressBound;
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
                long compressDirectByteBuffer = compressDirectByteBuffer(allocateDirect, 0, i2, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), i);
                if (!isError(compressDirectByteBuffer)) {
                    byteBuffer.position(byteBuffer.limit());
                    allocateDirect.limit((int) compressDirectByteBuffer);
                    return allocateDirect;
                }
                throw new RuntimeException(getErrorName(compressDirectByteBuffer));
            }
            throw new RuntimeException("Max output size is greater than MAX_INT");
        }
        throw new IllegalArgumentException("srcBuf must be a direct buffer");
    }

    public static byte[] decompress(byte[] bArr, ZstdDictDecompress zstdDictDecompress, int i) {
        byte[] bArr2 = new byte[i];
        long decompressFastDict = decompressFastDict(bArr2, 0, bArr, 0, bArr.length, zstdDictDecompress);
        if (!isError(decompressFastDict)) {
            return decompressFastDict != ((long) i) ? Arrays.copyOfRange(bArr2, 0, (int) decompressFastDict) : bArr2;
        }
        throw new RuntimeException(getErrorName(decompressFastDict));
    }

    public static long decompress(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decompressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    public static byte[] decompress(byte[] bArr, byte[] bArr2, int i) {
        byte[] bArr3 = new byte[i];
        long decompressUsingDict = decompressUsingDict(bArr3, 0, bArr, 0, bArr.length, bArr2);
        if (!isError(decompressUsingDict)) {
            return decompressUsingDict != ((long) i) ? Arrays.copyOfRange(bArr3, 0, (int) decompressUsingDict) : bArr3;
        }
        throw new RuntimeException(getErrorName(decompressUsingDict));
    }

    public static byte[] compress(byte[] bArr, ZstdDictCompress zstdDictCompress) {
        long compressBound = compressBound((long) bArr.length);
        if (compressBound <= 2147483647L) {
            byte[] bArr2 = new byte[((int) compressBound)];
            long compressFastDict = compressFastDict(bArr2, 0, bArr, 0, bArr.length, zstdDictCompress);
            if (!isError(compressFastDict)) {
                return Arrays.copyOfRange(bArr2, 0, (int) compressFastDict);
            }
            throw new RuntimeException(getErrorName(compressFastDict));
        }
        throw new RuntimeException("Max output size is greater than MAX_INT");
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) {
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuff must be a direct buffer");
        } else if (byteBuffer.isDirect()) {
            long decompressDirectByteBufferUsingDict = decompressDirectByteBufferUsingDict(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), bArr);
            if (!isError(decompressDirectByteBufferUsingDict)) {
                byteBuffer2.position(byteBuffer2.limit());
                int i = (int) decompressDirectByteBufferUsingDict;
                byteBuffer.position(byteBuffer.position() + i);
                return i;
            }
            throw new RuntimeException(getErrorName(decompressDirectByteBufferUsingDict));
        } else {
            throw new IllegalArgumentException("dstBuff must be a direct buffer");
        }
    }

    public static long compress(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return compressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3, i);
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr, int i) {
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuf must be a direct buffer");
        } else if (byteBuffer.isDirect()) {
            long compressDirectByteBufferUsingDict = compressDirectByteBufferUsingDict(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), bArr, i);
            if (!isError(compressDirectByteBufferUsingDict)) {
                byteBuffer2.position(byteBuffer2.limit());
                int i2 = (int) compressDirectByteBufferUsingDict;
                byteBuffer.limit(i2);
                return i2;
            }
            throw new RuntimeException(getErrorName(compressDirectByteBufferUsingDict));
        } else {
            throw new IllegalArgumentException("dstBuf must be a direct buffer");
        }
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, byte[] bArr, int i) {
        if (byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            long decompressDirectByteBufferUsingDict = decompressDirectByteBufferUsingDict(allocateDirect, 0, i, byteBuffer, byteBuffer.position(), byteBuffer.limit(), bArr);
            if (!isError(decompressDirectByteBufferUsingDict)) {
                byteBuffer.position(byteBuffer.limit());
                return allocateDirect;
            }
            throw new RuntimeException(getErrorName(decompressDirectByteBufferUsingDict));
        }
        throw new IllegalArgumentException("srcBuff must be a direct buffer");
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, byte[] bArr, int i) {
        if (byteBuffer.isDirect()) {
            long compressBound = compressBound((long) (byteBuffer.limit() - byteBuffer.position()));
            if (compressBound <= 2147483647L) {
                int i2 = (int) compressBound;
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
                long compressDirectByteBufferUsingDict = compressDirectByteBufferUsingDict(allocateDirect, 0, i2, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), bArr, i);
                if (!isError(compressDirectByteBufferUsingDict)) {
                    byteBuffer.position(byteBuffer.limit());
                    allocateDirect.limit((int) compressDirectByteBufferUsingDict);
                    return allocateDirect;
                }
                throw new RuntimeException(getErrorName(compressDirectByteBufferUsingDict));
            }
            throw new RuntimeException("Max output size is greater than MAX_INT");
        }
        throw new IllegalArgumentException("srcBuf must be a direct buffer");
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ZstdDictDecompress zstdDictDecompress) {
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuff must be a direct buffer");
        } else if (byteBuffer.isDirect()) {
            long decompressDirectByteBufferFastDict = decompressDirectByteBufferFastDict(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), zstdDictDecompress);
            if (!isError(decompressDirectByteBufferFastDict)) {
                byteBuffer2.position(byteBuffer2.limit());
                int i = (int) decompressDirectByteBufferFastDict;
                byteBuffer.position(byteBuffer.position() + i);
                return i;
            }
            throw new RuntimeException(getErrorName(decompressDirectByteBufferFastDict));
        } else {
            throw new IllegalArgumentException("dstBuff must be a direct buffer");
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ZstdDictCompress zstdDictCompress) {
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuf must be a direct buffer");
        } else if (byteBuffer.isDirect()) {
            long compressDirectByteBufferFastDict = compressDirectByteBufferFastDict(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), zstdDictCompress);
            if (!isError(compressDirectByteBufferFastDict)) {
                byteBuffer2.position(byteBuffer2.limit());
                int i = (int) compressDirectByteBufferFastDict;
                byteBuffer.limit(i);
                return i;
            }
            throw new RuntimeException(getErrorName(compressDirectByteBufferFastDict));
        } else {
            throw new IllegalArgumentException("dstBuf must be a direct buffer");
        }
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, ZstdDictDecompress zstdDictDecompress, int i) {
        if (byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            long decompressDirectByteBufferFastDict = decompressDirectByteBufferFastDict(allocateDirect, 0, i, byteBuffer, byteBuffer.position(), byteBuffer.limit(), zstdDictDecompress);
            if (!isError(decompressDirectByteBufferFastDict)) {
                byteBuffer.position(byteBuffer.limit());
                return allocateDirect;
            }
            throw new RuntimeException(getErrorName(decompressDirectByteBufferFastDict));
        }
        throw new IllegalArgumentException("srcBuff must be a direct buffer");
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, ZstdDictCompress zstdDictCompress) {
        if (byteBuffer.isDirect()) {
            long compressBound = compressBound((long) (byteBuffer.limit() - byteBuffer.position()));
            if (compressBound <= 2147483647L) {
                int i = (int) compressBound;
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
                long compressDirectByteBufferFastDict = compressDirectByteBufferFastDict(allocateDirect, 0, i, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), zstdDictCompress);
                if (!isError(compressDirectByteBufferFastDict)) {
                    byteBuffer.position(byteBuffer.limit());
                    allocateDirect.limit((int) compressDirectByteBufferFastDict);
                    return allocateDirect;
                }
                throw new RuntimeException(getErrorName(compressDirectByteBufferFastDict));
            }
            throw new RuntimeException("Max output size is greater than MAX_INT");
        }
        throw new IllegalArgumentException("srcBuf must be a direct buffer");
    }
}
