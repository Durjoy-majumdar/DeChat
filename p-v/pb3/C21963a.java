package pb3;

import java.io.InputStream;

/* renamed from: pb3.a */
public class C21963a extends C21965c {

    /* renamed from: d */
    public int f62180d;

    public C21963a(InputStream inputStream) {
        super(inputStream);
    }

    public int read(byte[] bArr) {
        int read = super.read(bArr);
        this.f62180d += read >= 0 ? read : 0;
        return read;
    }

    public long skip(long j) {
        long skip = super.skip(j);
        this.f62180d = (int) (((long) this.f62180d) + skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        this.f62180d += read >= 0 ? read : 0;
        return read;
    }

    public int read() {
        int read = super.read();
        this.f62180d += read >= 0 ? 1 : 0;
        return read;
    }
}
