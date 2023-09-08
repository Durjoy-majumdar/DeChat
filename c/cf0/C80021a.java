package cf0;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: cf0.a */
public class C80021a extends FilterOutputStream {

    /* renamed from: d */
    public long f234443d = 0;

    public C80021a(OutputStream outputStream) {
        super(outputStream);
    }

    public void write(int i) {
        this.f234443d++;
        this.out.write(i);
    }

    public void write(byte[] bArr) {
        this.f234443d += (long) bArr.length;
        this.out.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f234443d += (long) i2;
        this.out.write(bArr, i, i2);
    }
}
