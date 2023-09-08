package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.h */
public class C80153h implements C80151f {

    /* renamed from: d */
    public InputStream f234660d;

    /* renamed from: e */
    public final ZipEntry f234661e;

    /* renamed from: f */
    public final ZipFile f234662f;

    /* renamed from: g */
    public final long f234663g;

    /* renamed from: h */
    public boolean f234664h = true;

    /* renamed from: i */
    public long f234665i = 0;

    public C80153h(ZipFile zipFile, ZipEntry zipEntry) {
        this.f234662f = zipFile;
        this.f234661e = zipEntry;
        this.f234663g = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f234660d = inputStream;
        if (inputStream == null) {
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
    }

    public void close() {
        InputStream inputStream = this.f234660d;
        if (inputStream != null) {
            inputStream.close();
            this.f234664h = false;
        }
    }

    public boolean isOpen() {
        return this.f234664h;
    }

    public int read(ByteBuffer byteBuffer) {
        return mo110966w(byteBuffer, this.f234665i);
    }

    /* renamed from: w */
    public int mo110966w(ByteBuffer byteBuffer, long j) {
        if (this.f234660d != null) {
            int remaining = byteBuffer.remaining();
            long j2 = this.f234663g;
            long j3 = j2 - j;
            if (j3 <= 0) {
                return -1;
            }
            int i = (int) j3;
            if (remaining > i) {
                remaining = i;
            }
            InputStream inputStream = this.f234660d;
            if (inputStream != null) {
                long j4 = this.f234665i;
                if (j != j4) {
                    if (j > j2) {
                        j = j2;
                    }
                    if (j >= j4) {
                        inputStream.skip(j - j4);
                    } else {
                        inputStream.close();
                        InputStream inputStream2 = this.f234662f.getInputStream(this.f234661e);
                        this.f234660d = inputStream2;
                        if (inputStream2 != null) {
                            inputStream2.skip(j);
                        } else {
                            throw new IOException(this.f234661e.getName() + "'s InputStream is null");
                        }
                    }
                    this.f234665i = j;
                }
                if (byteBuffer.hasArray()) {
                    this.f234660d.read(byteBuffer.array(), 0, remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                } else {
                    byte[] bArr = new byte[remaining];
                    this.f234660d.read(bArr, 0, remaining);
                    byteBuffer.put(bArr, 0, remaining);
                }
                this.f234665i += (long) remaining;
                return remaining;
            }
            throw new IOException(this.f234661e.getName() + "'s InputStream is null");
        }
        throw new IOException("InputStream is null");
    }

    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
