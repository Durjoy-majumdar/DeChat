package com.tencent.mars.zstd;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ZstdDirectBufferCompressingStream implements Closeable, Flushable {
    private boolean closed = false;
    private int consumed = 0;
    private byte[] dict = null;
    private ZstdDictCompress fastDict = null;
    private boolean initialized = false;
    private int level;
    private int produced = 0;
    private final long stream;
    private ByteBuffer target;

    public ZstdDirectBufferCompressingStream(ByteBuffer byteBuffer, int i) {
        this.target = byteBuffer;
        this.level = i;
        if (byteBuffer.isDirect()) {
            this.stream = createCStream();
            return;
        }
        throw new IllegalArgumentException("Target buffer should be a direct buffer");
    }

    private native int compressDirectByteBuffer(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private static native long createCStream();

    private native int endStream(long j, ByteBuffer byteBuffer, int i, int i2);

    private native int flushStream(long j, ByteBuffer byteBuffer, int i, int i2);

    private static native int freeCStream(long j);

    private native int initCStream(long j, int i);

    private native int initCStreamWithDict(long j, byte[] bArr, int i, int i2);

    private native int initCStreamWithFastDict(long j, ZstdDictCompress zstdDictCompress);

    private static native long recommendedCOutSize();

    public static int recommendedOutputBufferSize() {
        return (int) recommendedCOutSize();
    }

    public void close() {
        int endStream;
        if (!this.closed) {
            try {
                if (this.initialized) {
                    do {
                        long j = this.stream;
                        ByteBuffer byteBuffer = this.target;
                        endStream = endStream(j, byteBuffer, byteBuffer.position(), this.target.remaining());
                        long j2 = (long) endStream;
                        if (!Zstd.isError(j2)) {
                            ByteBuffer byteBuffer2 = this.target;
                            byteBuffer2.position(byteBuffer2.position() + this.produced);
                            ByteBuffer flushBuffer = flushBuffer(this.target);
                            this.target = flushBuffer;
                            if (!flushBuffer.isDirect()) {
                                throw new IllegalArgumentException("Target buffer should be a direct buffer");
                            } else if (endStream > 0) {
                                if (this.target.hasRemaining()) {
                                    continue;
                                } else {
                                    throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                                }
                            }
                        } else {
                            throw new IOException("Compression error: " + Zstd.getErrorName(j2));
                        }
                    } while (endStream > 0);
                }
            } finally {
                freeCStream(this.stream);
                this.closed = true;
                this.initialized = false;
                this.target = null;
            }
        }
    }

    public void compress(ByteBuffer byteBuffer) {
        int i;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a direct buffer");
        } else if (!this.closed) {
            if (!this.initialized) {
                ZstdDictCompress zstdDictCompress = this.fastDict;
                if (zstdDictCompress != null) {
                    i = initCStreamWithFastDict(this.stream, zstdDictCompress);
                } else {
                    byte[] bArr = this.dict;
                    if (bArr != null) {
                        i = initCStreamWithDict(this.stream, bArr, bArr.length, this.level);
                    } else {
                        i = initCStream(this.stream, this.level);
                    }
                }
                long j = (long) i;
                if (!Zstd.isError(j)) {
                    this.initialized = true;
                } else {
                    throw new IOException("Compression error: cannot create header: " + Zstd.getErrorName(j));
                }
            }
            while (byteBuffer.hasRemaining()) {
                if (!this.target.hasRemaining()) {
                    ByteBuffer flushBuffer = flushBuffer(this.target);
                    this.target = flushBuffer;
                    if (!flushBuffer.isDirect()) {
                        throw new IllegalArgumentException("Target buffer should be a direct buffer");
                    } else if (!this.target.hasRemaining()) {
                        throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                    }
                }
                long j2 = this.stream;
                ByteBuffer byteBuffer2 = this.target;
                long compressDirectByteBuffer = (long) compressDirectByteBuffer(j2, byteBuffer2, byteBuffer2.position(), this.target.remaining(), byteBuffer, byteBuffer.position(), byteBuffer.remaining());
                if (!Zstd.isError(compressDirectByteBuffer)) {
                    ByteBuffer byteBuffer3 = this.target;
                    byteBuffer3.position(byteBuffer3.position() + this.produced);
                    byteBuffer.position(byteBuffer.position() + this.consumed);
                } else {
                    throw new IOException("Compression error: " + Zstd.getErrorName(compressDirectByteBuffer));
                }
            }
        } else {
            throw new IOException("Stream closed");
        }
    }

    public void finalize() {
        close();
    }

    public void flush() {
        int flushStream;
        if (!this.closed && this.initialized) {
            do {
                long j = this.stream;
                ByteBuffer byteBuffer = this.target;
                flushStream = flushStream(j, byteBuffer, byteBuffer.position(), this.target.remaining());
                long j2 = (long) flushStream;
                if (!Zstd.isError(j2)) {
                    ByteBuffer byteBuffer2 = this.target;
                    byteBuffer2.position(byteBuffer2.position() + this.produced);
                    ByteBuffer flushBuffer = flushBuffer(this.target);
                    this.target = flushBuffer;
                    if (!flushBuffer.isDirect()) {
                        throw new IllegalArgumentException("Target buffer should be a direct buffer");
                    } else if (flushStream > 0 && !this.target.hasRemaining()) {
                        throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                    }
                } else {
                    throw new IOException("Compression error: " + Zstd.getErrorName(j2));
                }
            } while (flushStream > 0);
        }
    }

    public ByteBuffer flushBuffer(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public ZstdDirectBufferCompressingStream setDict(byte[] bArr) {
        if (!this.initialized) {
            this.dict = bArr;
            this.fastDict = null;
            return this;
        }
        throw new IOException("Change of parameter on initialized stream");
    }

    public ZstdDirectBufferCompressingStream setDict(ZstdDictCompress zstdDictCompress) {
        if (!this.initialized) {
            this.dict = null;
            this.fastDict = zstdDictCompress;
            return this;
        }
        throw new IOException("Change of parameter on initialized stream");
    }
}
