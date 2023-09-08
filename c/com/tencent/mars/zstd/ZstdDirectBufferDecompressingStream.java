package com.tencent.mars.zstd;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ZstdDirectBufferDecompressingStream implements Closeable {
    private boolean closed = false;
    private int consumed;
    private byte[] dict = null;
    private ZstdDictDecompress fastDict = null;
    private boolean finishedFrame = false;
    private boolean initialized = false;
    private int produced;
    private ByteBuffer source;
    private final long stream;
    private boolean streamEnd = false;

    public ZstdDirectBufferDecompressingStream(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            this.source = byteBuffer;
            this.stream = createDStream();
            return;
        }
        throw new IllegalArgumentException("Source buffer should be a direct buffer");
    }

    private static native long createDStream();

    private native long decompressStream(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private static native int freeDStream(long j);

    private native int initDStream(long j);

    private native int initDStreamWithDict(long j, byte[] bArr, int i);

    private native int initDStreamWithFastDict(long j, ZstdDictDecompress zstdDictDecompress);

    private void initStream() {
        int i;
        ZstdDictDecompress zstdDictDecompress = this.fastDict;
        if (zstdDictDecompress != null) {
            i = initDStreamWithFastDict(this.stream, zstdDictDecompress);
        } else {
            byte[] bArr = this.dict;
            i = bArr != null ? initDStreamWithDict(this.stream, bArr, bArr.length) : initDStream(this.stream);
        }
        long j = (long) i;
        if (!Zstd.isError(j)) {
            this.initialized = true;
            return;
        }
        throw new IOException("Decompression error: " + Zstd.getErrorName(j));
    }

    private static native int recommendedDOutSize();

    public static int recommendedTargetBufferSize() {
        return recommendedDOutSize();
    }

    public void close() {
        if (!this.closed) {
            try {
                if (this.initialized) {
                    freeDStream(this.stream);
                }
            } finally {
                this.closed = true;
                this.initialized = false;
            }
        }
    }

    public void finalize() {
        if (!this.closed && this.initialized) {
            freeDStream(this.stream);
        }
        this.source = null;
    }

    public boolean hasRemaining() {
        return !this.streamEnd && (this.source.hasRemaining() || !this.finishedFrame);
    }

    public int read(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Target buffer should be a direct buffer");
        } else if (!this.closed) {
            boolean z = false;
            if (this.streamEnd) {
                return 0;
            }
            if (!this.initialized) {
                initStream();
            }
            long j = this.stream;
            int position = byteBuffer.position();
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.source;
            long decompressStream = decompressStream(j, byteBuffer, position, remaining, byteBuffer2, byteBuffer2.position(), this.source.remaining());
            if (!Zstd.isError(decompressStream)) {
                ByteBuffer byteBuffer3 = this.source;
                byteBuffer3.position(byteBuffer3.position() + this.consumed);
                byteBuffer.position(byteBuffer.position() + this.produced);
                if (!this.source.hasRemaining()) {
                    ByteBuffer refill = refill(this.source);
                    this.source = refill;
                    if (!refill.isDirect()) {
                        throw new IllegalArgumentException("Source buffer should be a direct buffer");
                    }
                }
                if (decompressStream == 0) {
                    z = true;
                }
                this.finishedFrame = z;
                if (z) {
                    if (this.source.hasRemaining()) {
                        initStream();
                    } else {
                        this.streamEnd = true;
                    }
                }
                return this.produced;
            }
            throw new IOException(Zstd.getErrorName(decompressStream));
        } else {
            throw new IOException("Stream closed");
        }
    }

    public ByteBuffer refill(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public ZstdDirectBufferDecompressingStream setDict(byte[] bArr) {
        if (!this.initialized) {
            this.dict = bArr;
            this.fastDict = null;
            return this;
        }
        throw new IOException("Change of parameter on initialized stream");
    }

    public ZstdDirectBufferDecompressingStream setDict(ZstdDictDecompress zstdDictDecompress) {
        if (!this.initialized) {
            this.fastDict = zstdDictDecompress;
            this.dict = null;
            return this;
        }
        throw new IOException("Change of parameter on initialized stream");
    }
}
