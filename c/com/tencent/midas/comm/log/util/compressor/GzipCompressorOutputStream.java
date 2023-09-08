package com.tencent.midas.comm.log.util.compressor;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public class GzipCompressorOutputStream extends OutputStream {
    private final byte[] _header = {31, -117, 8, 0, 0, 0, 0, 0, 0, 0};
    private boolean closed;
    private final CRC32 crc = new CRC32();
    private final byte[] deflateBuffer = new byte[512];
    private final Deflater deflater;
    private final OutputStream out;

    public GzipCompressorOutputStream(OutputStream outputStream) {
        this.out = outputStream;
        this.deflater = new Deflater(-1, true);
    }

    private void deflate() {
        Deflater deflater2 = this.deflater;
        byte[] bArr = this.deflateBuffer;
        int deflate = deflater2.deflate(bArr, 0, bArr.length);
        if (deflate > 0) {
            this.out.write(this.deflateBuffer, 0, deflate);
        }
    }

    private void writeTrailer() {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt((int) this.crc.getValue());
        allocate.putInt(this.deflater.getTotalIn());
        this.out.write(allocate.array());
    }

    public void close() {
        if (!this.closed) {
            finish();
            this.deflater.end();
            this.out.close();
            this.closed = true;
        }
    }

    public void continued() {
        this.crc.reset();
        this.deflater.reset();
    }

    public void finish() {
        if (!this.deflater.finished()) {
            this.deflater.finish();
            while (!this.deflater.finished()) {
                deflate();
            }
            writeTrailer();
        }
    }

    public void flush() {
        this.out.flush();
    }

    public void write(int i) {
        write(new byte[]{(byte) (i & 255)}, 0, 1);
    }

    public void writeHeader() {
        this.out.write(this._header);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.deflater.finished()) {
            throw new IOException("Cannot write more data, the end of the compressed data stream has been reached");
        } else if (i2 > 0) {
            this.deflater.setInput(bArr, i, i2);
            while (!this.deflater.needsInput()) {
                deflate();
            }
            this.crc.update(bArr, i, i2);
        }
    }
}
