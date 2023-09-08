package pb3;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: pb3.b */
public class C21964b extends InputStream {

    /* renamed from: d */
    public C21963a f62181d;

    /* renamed from: e */
    public long f62182e;

    public C21964b(C86009m1 m1Var, long j, long j2) {
        int i;
        this.f62182e = j2;
        this.f62181d = new C21963a(C86013q1.m106422D(m1Var));
        long j3 = 0;
        while (true) {
            i = (j3 > j ? 1 : (j3 == j ? 0 : -1));
            if (i >= 0) {
                break;
            }
            long skip = this.f62181d.skip(j - j3);
            if (skip <= 0) {
                break;
            }
            j3 += skip;
        }
        if (i >= 0) {
            C21963a aVar = this.f62181d;
            synchronized (aVar) {
                aVar.f62180d = 0;
            }
            return;
        }
        throw new IOException("could not seek pos " + j);
    }

    public int available() {
        return (int) Math.min(this.f62182e - ((long) this.f62181d.f62180d), (long) this.f62181d.available());
    }

    public void close() {
        this.f62181d.close();
        super.close();
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public long skip(long j) {
        C21963a aVar = this.f62181d;
        return aVar.skip(Math.min(this.f62182e - ((long) aVar.f62180d), j));
    }

    public int read() {
        long j = this.f62182e;
        C21963a aVar = this.f62181d;
        if (j - ((long) aVar.f62180d) <= 0) {
            return -1;
        }
        return aVar.read();
    }

    public int read(byte[] bArr, int i, int i2) {
        long min = Math.min(this.f62182e - ((long) this.f62181d.f62180d), (long) i2);
        if (min != 0 || i2 <= 0) {
            return this.f62181d.read(bArr, i, (int) min);
        }
        return -1;
    }
}
