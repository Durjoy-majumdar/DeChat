package pb3;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: pb3.c */
public abstract class C21965c extends FilterInputStream {
    public C21965c(InputStream inputStream) {
        super(inputStream);
    }

    public int available() {
        return this.in.available();
    }

    public void close() {
        this.in.close();
    }

    public synchronized void mark(int i) {
        this.in.mark(i);
    }

    public boolean markSupported() {
        return this.in.markSupported();
    }

    public int read() {
        return this.in.read();
    }

    public synchronized void reset() {
        this.in.reset();
    }

    public long skip(long j) {
        return this.in.skip(j);
    }

    public int read(byte[] bArr) {
        return this.in.read(bArr);
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.in.read(bArr, i, i2);
    }
}
