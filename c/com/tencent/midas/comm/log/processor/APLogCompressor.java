package com.tencent.midas.comm.log.processor;

import com.tencent.midas.comm.log.util.compressor.CachedByteArrayStream;
import com.tencent.midas.comm.log.util.compressor.GzipCompressorOutputStream;
import java.io.IOException;

public class APLogCompressor {
    private GzipCompressorOutputStream gziper = null;
    private CachedByteArrayStream out = null;

    public static APLogCompressor create() {
        APLogCompressor aPLogCompressor = new APLogCompressor();
        try {
            aPLogCompressor.out = new CachedByteArrayStream(512);
            aPLogCompressor.gziper = new GzipCompressorOutputStream(aPLogCompressor.out);
            return aPLogCompressor;
        } catch (IOException unused) {
            return null;
        }
    }

    public void close() {
        GzipCompressorOutputStream gzipCompressorOutputStream = this.gziper;
        if (gzipCompressorOutputStream != null) {
            gzipCompressorOutputStream.close();
        }
        CachedByteArrayStream cachedByteArrayStream = this.out;
        if (cachedByteArrayStream != null) {
            cachedByteArrayStream.close();
        }
    }

    public synchronized byte[] compress(byte[] bArr) {
        this.gziper.continued();
        this.out.reset();
        this.gziper.writeHeader();
        this.gziper.write(bArr, 0, bArr.length);
        this.gziper.finish();
        this.gziper.flush();
        return this.out.toByteArray();
    }
}
