package oi3;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: oi3.a */
public class C89230a extends InputStream {

    /* renamed from: d */
    public final RandomAccessFile f257101d;

    /* renamed from: e */
    public long f257102e = -1;

    /* renamed from: f */
    public long f257103f;

    /* renamed from: g */
    public long f257104g;

    /* renamed from: h */
    public final long f257105h;

    public C89230a(File file) {
        long length = file.length();
        this.f257101d = new RandomAccessFile(file, "r");
        this.f257105h = file.length();
        mo123549a(0, length);
    }

    /* renamed from: a */
    public void mo123549a(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("rangeOffset must be >= 0");
        } else if (j2 >= 0) {
            long j3 = j + j2;
            if (j3 > this.f257105h) {
                throw new IllegalArgumentException("Read range exceeds file length");
            } else if (j3 >= 0) {
                this.f257103f = j;
                this.f257104g = j2;
                this.f257102e = j;
                reset();
                this.f257102e = -1;
            } else {
                throw new IllegalArgumentException("Insane input size not supported");
            }
        } else {
            throw new IllegalArgumentException("rangeLength must be >= 0");
        }
    }

    public int available() {
        long filePointer = this.f257104g - (this.f257101d.getFilePointer() - this.f257103f);
        if (filePointer > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) filePointer;
    }

    public void close() {
        this.f257101d.close();
    }

    public void mark(int i) {
        try {
            this.f257102e = this.f257101d.getFilePointer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        if (available() <= 0) {
            return -1;
        }
        return this.f257101d.read();
    }

    public void reset() {
        long j = this.f257102e;
        if (j >= 0) {
            this.f257101d.seek(j);
            return;
        }
        throw new IOException("mark not set");
    }

    public long skip(long j) {
        int available;
        if (j <= 0 || (available = available()) <= 0) {
            return 0;
        }
        int min = (int) Math.min((long) available, j);
        RandomAccessFile randomAccessFile = this.f257101d;
        long j2 = (long) min;
        randomAccessFile.seek(randomAccessFile.getFilePointer() + j2);
        return j2;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        return this.f257101d.read(bArr, i, Math.min(i2, available));
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
