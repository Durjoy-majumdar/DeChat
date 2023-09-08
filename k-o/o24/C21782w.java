package o24;

import androidx.exifinterface.media.ExifInterface;
import gy3.C87412m;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o24.w */
public final class C21782w extends InputStream {

    /* renamed from: d */
    public final /* synthetic */ C21783x f61727d;

    public C21782w(C21783x xVar) {
        this.f61727d = xVar;
    }

    public int available() {
        C21783x xVar = this.f61727d;
        if (!xVar.f61729e) {
            return (int) Math.min(xVar.f61728d.f61695e, (long) Integer.MAX_VALUE);
        }
        throw new IOException("closed");
    }

    public void close() {
        this.f61727d.close();
    }

    public int read() {
        C21783x xVar = this.f61727d;
        if (!xVar.f61729e) {
            C21766h hVar = xVar.f61728d;
            if (hVar.f61695e == 0 && xVar.f61730f.mo32327L0(hVar, (long) 8192) == -1) {
                return -1;
            }
            return this.f61727d.f61728d.readByte() & ExifInterface.MARKER;
        }
        throw new IOException("closed");
    }

    public String toString() {
        return this.f61727d + ".inputStream()";
    }

    public int read(byte[] bArr, int i, int i2) {
        C87412m.m108594g(bArr, "data");
        if (!this.f61727d.f61729e) {
            C21753b.m24816b((long) bArr.length, (long) i, (long) i2);
            C21783x xVar = this.f61727d;
            C21766h hVar = xVar.f61728d;
            if (hVar.f61695e == 0 && xVar.f61730f.mo32327L0(hVar, (long) 8192) == -1) {
                return -1;
            }
            return this.f61727d.f61728d.mo34133e(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
