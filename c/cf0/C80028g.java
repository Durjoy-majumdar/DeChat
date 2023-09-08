package cf0;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: cf0.g */
public class C80028g extends InputStream {

    /* renamed from: d */
    public final RandomAccessFile f234458d;

    /* renamed from: e */
    public long f234459e = -1;

    /* renamed from: f */
    public long f234460f;

    /* renamed from: g */
    public long f234461g;

    /* renamed from: h */
    public final long f234462h;

    public C80028g(File file) {
        long length = file.length();
        this.f234458d = new RandomAccessFile(file, "r");
        this.f234462h = file.length();
        mo110269a(0, length);
    }

    /* renamed from: a */
    public void mo110269a(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("rangeOffset must be >= 0");
        } else if (j2 >= 0) {
            long j3 = j + j2;
            if (j3 > this.f234462h) {
                throw new IllegalArgumentException("Read range exceeds file length");
            } else if (j3 >= 0) {
                this.f234460f = j;
                this.f234461g = j2;
                this.f234459e = j;
                reset();
                this.f234459e = -1;
            } else {
                throw new IllegalArgumentException("Insane input size not supported");
            }
        } else {
            throw new IllegalArgumentException("rangeLength must be >= 0");
        }
    }

    public int available() {
        long filePointer = this.f234461g - (this.f234458d.getFilePointer() - this.f234460f);
        if (filePointer > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) filePointer;
    }

    public void close() {
        this.f234458d.close();
    }

    public void mark(int i) {
        try {
            this.f234459e = this.f234458d.getFilePointer();
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
        return this.f234458d.read();
    }

    public void reset() {
        long j = this.f234459e;
        if (j >= 0) {
            this.f234458d.seek(j);
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
        RandomAccessFile randomAccessFile = this.f234458d;
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
        return this.f234458d.read(bArr, i, Math.min(i2, available));
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
