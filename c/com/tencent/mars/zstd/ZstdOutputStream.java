package com.tencent.mars.zstd;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ZstdOutputStream extends FilterOutputStream {
    private static final int dstSize = ((int) recommendedCOutSize());
    private boolean closeFrameOnFlush;
    private byte[] dict;
    private byte[] dst;
    private long dstPos;
    private ZstdDictCompress fastDict;
    private boolean frameClosed;
    private boolean isClosed;
    private int level;
    private long srcPos;
    private long stream;
    private boolean useChecksum;

    public ZstdOutputStream(OutputStream outputStream, int i, boolean z, boolean z2) {
        super(outputStream);
        this.srcPos = 0;
        this.dstPos = 0;
        this.dst = null;
        this.isClosed = false;
        this.frameClosed = true;
        this.dict = null;
        this.fastDict = null;
        this.closeFrameOnFlush = z;
        this.level = i;
        this.useChecksum = z2;
        this.stream = createCStream();
        this.dst = new byte[dstSize];
    }

    private native int compressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    private static native long createCStream();

    private native int endStream(long j, byte[] bArr, int i);

    private native int flushStream(long j, byte[] bArr, int i);

    private static native int freeCStream(long j);

    private native int initCStream(long j, int i, int i2);

    private native int initCStreamWithDict(long j, byte[] bArr, int i, int i2, int i3);

    private native int initCStreamWithFastDict(long j, ZstdDictCompress zstdDictCompress, int i);

    private static native long recommendedCOutSize();

    public void close() {
        if (!this.isClosed) {
            if (!this.frameClosed) {
                long endStream = (long) endStream(this.stream, this.dst, dstSize);
                if (!Zstd.isError(endStream)) {
                    this.out.write(this.dst, 0, (int) this.dstPos);
                } else {
                    throw new IOException("Compression error: " + Zstd.getErrorName(endStream));
                }
            }
            freeCStream(this.stream);
            this.out.close();
            this.isClosed = true;
        }
    }

    public void finalize() {
        close();
    }

    public void flush() {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        } else if (!this.frameClosed) {
            if (this.closeFrameOnFlush) {
                long endStream = (long) endStream(this.stream, this.dst, dstSize);
                if (!Zstd.isError(endStream)) {
                    this.frameClosed = true;
                } else {
                    throw new IOException("Compression error: " + Zstd.getErrorName(endStream));
                }
            } else {
                long flushStream = (long) flushStream(this.stream, this.dst, dstSize);
                if (Zstd.isError(flushStream)) {
                    throw new IOException("Compression error: " + Zstd.getErrorName(flushStream));
                }
            }
            this.out.write(this.dst, 0, (int) this.dstPos);
            this.out.flush();
        }
    }

    public ZstdOutputStream setChecksum(boolean z) {
        if (this.frameClosed) {
            this.useChecksum = z;
            return this;
        }
        throw new IOException("Change of parameter on initialized stream");
    }

    public ZstdOutputStream setDict(byte[] bArr) {
        if (this.frameClosed) {
            this.fastDict = null;
            this.dict = bArr;
            return this;
        }
        throw new IOException("Change of parameter on initialized stream");
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (!this.isClosed) {
            if (this.frameClosed) {
                ZstdDictCompress zstdDictCompress = this.fastDict;
                if (zstdDictCompress != null) {
                    i3 = initCStreamWithFastDict(this.stream, zstdDictCompress, this.useChecksum ? 1 : 0);
                } else {
                    byte[] bArr2 = this.dict;
                    if (bArr2 != null) {
                        i3 = initCStreamWithDict(this.stream, bArr2, bArr2.length, this.level, this.useChecksum ? 1 : 0);
                    } else {
                        i3 = initCStream(this.stream, this.level, this.useChecksum ? 1 : 0);
                    }
                }
                long j = (long) i3;
                if (!Zstd.isError(j)) {
                    this.frameClosed = false;
                } else {
                    throw new IOException("Compression error: cannot create header: " + Zstd.getErrorName(j));
                }
            }
            int i4 = i2 + i;
            this.srcPos = (long) i;
            while (this.srcPos < ((long) i4)) {
                long compressStream = (long) compressStream(this.stream, this.dst, dstSize, bArr, i4);
                if (!Zstd.isError(compressStream)) {
                    long j2 = this.dstPos;
                    if (j2 > 0) {
                        this.out.write(this.dst, 0, (int) j2);
                    }
                } else {
                    throw new IOException("Compression error: " + Zstd.getErrorName(compressStream));
                }
            }
            return;
        }
        throw new IOException("Stream closed");
    }

    public ZstdOutputStream setDict(ZstdDictCompress zstdDictCompress) {
        if (this.frameClosed) {
            this.dict = null;
            this.fastDict = zstdDictCompress;
            return this;
        }
        throw new IOException("Change of parameter on initialized stream");
    }

    public ZstdOutputStream(OutputStream outputStream, int i, boolean z) {
        this(outputStream, i, z, false);
    }

    public ZstdOutputStream(OutputStream outputStream, int i) {
        this(outputStream, i, false);
    }

    public ZstdOutputStream(OutputStream outputStream) {
        this(outputStream, 3, false);
    }

    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
