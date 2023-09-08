package com.tencent.mars.zstd;

import androidx.exifinterface.media.ExifInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZstdInputStream extends FilterInputStream {
    private static final int srcBuffSize = ((int) recommendedDInSize());
    private byte[] dict;
    private long dstPos;
    private ZstdDictDecompress fastDict;
    private boolean frameFinished;
    private boolean isClosed;
    private boolean isContinuous;
    private byte[] src;
    private long srcPos;
    private long srcSize;
    private long stream;

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
        this.dstPos = 0;
        this.srcPos = 0;
        this.srcSize = 0;
        this.src = null;
        this.isContinuous = false;
        this.frameFinished = true;
        this.isClosed = false;
        this.dict = null;
        this.fastDict = null;
        this.src = new byte[srcBuffSize];
        this.stream = createDStream();
    }

    private static native long createDStream();

    private native int decompressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    private static native int freeDStream(long j);

    private native int initDStream(long j);

    private native int initDStreamWithDict(long j, byte[] bArr, int i);

    private native int initDStreamWithFastDict(long j, ZstdDictDecompress zstdDictDecompress);

    private static native long recommendedDInSize();

    private static native long recommendedDOutSize();

    public int available() {
        if (!this.isClosed) {
            long j = this.srcSize;
            long j2 = this.srcPos;
            return j - j2 > 0 ? (int) (j - j2) : this.in.available();
        }
        throw new IOException("Stream closed");
    }

    public void close() {
        if (!this.isClosed) {
            freeDStream(this.stream);
            this.in.close();
            this.isClosed = true;
        }
    }

    public void finalize() {
        close();
    }

    public boolean getContinuous() {
        return this.isContinuous;
    }

    public boolean markSupported() {
        return false;
    }

    public int read(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        if (!this.isClosed) {
            if (this.frameFinished) {
                ZstdDictDecompress zstdDictDecompress = this.fastDict;
                if (zstdDictDecompress != null) {
                    i3 = initDStreamWithFastDict(this.stream, zstdDictDecompress);
                } else {
                    byte[] bArr2 = this.dict;
                    if (bArr2 != null) {
                        i3 = initDStreamWithDict(this.stream, bArr2, bArr2.length);
                    } else {
                        i3 = initDStream(this.stream);
                    }
                }
                long j2 = (long) i3;
                if (Zstd.isError(j2)) {
                    throw new IOException("Decompression error: " + Zstd.getErrorName(j2));
                }
            }
            if (i < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException("Requested lenght " + i2 + " from offset " + i + " in buffer of size " + bArr.length);
            }
            int i4 = i + i2;
            long j3 = (long) i;
            this.dstPos = j3;
            while (this.dstPos < ((long) i4)) {
                if (this.srcSize - this.srcPos == 0) {
                    long read = (long) this.in.read(this.src, 0, srcBuffSize);
                    this.srcSize = read;
                    this.srcPos = 0;
                    if (read < 0) {
                        this.srcSize = 0;
                        if (this.frameFinished) {
                            return -1;
                        }
                        if (this.isContinuous) {
                            j = this.dstPos;
                            return (int) (j - j3);
                        }
                        throw new IOException("Read error or truncated source");
                    }
                    this.frameFinished = false;
                }
                int decompressStream = decompressStream(this.stream, bArr, i4, this.src, (int) this.srcSize);
                long j4 = (long) decompressStream;
                if (Zstd.isError(j4)) {
                    throw new IOException("Decompression error: " + Zstd.getErrorName(j4));
                } else if (decompressStream == 0) {
                    this.frameFinished = true;
                    j = this.dstPos;
                    return (int) (j - j3);
                }
            }
            return i2;
        }
        throw new IOException("Stream closed");
    }

    public ZstdInputStream setContinuous(boolean z) {
        this.isContinuous = z;
        return this;
    }

    public ZstdInputStream setDict(byte[] bArr) {
        if (this.frameFinished) {
            this.dict = bArr;
            this.fastDict = null;
            return this;
        }
        throw new IOException("Change of parameter on initialized stream");
    }

    public long skip(long j) {
        int read;
        if (this.isClosed) {
            throw new IOException("Stream closed");
        } else if (j <= 0) {
            return 0;
        } else {
            int min = (int) Math.min(recommendedDOutSize(), j);
            byte[] bArr = new byte[min];
            long j2 = j;
            while (j2 > 0 && (read = read(bArr, 0, (int) Math.min((long) min, j2))) >= 0) {
                j2 -= (long) read;
            }
            return j - j2;
        }
    }

    public ZstdInputStream setDict(ZstdDictDecompress zstdDictDecompress) {
        if (this.frameFinished) {
            this.fastDict = zstdDictDecompress;
            this.dict = null;
            return this;
        }
        throw new IOException("Change of parameter on initialized stream");
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read > 0 ? bArr[0] & ExifInterface.MARKER : read;
    }
}
