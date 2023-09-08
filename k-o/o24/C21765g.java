package o24;

import androidx.exifinterface.media.ExifInterface;
import gy3.C87412m;
import java.io.InputStream;

/* renamed from: o24.g */
public final class C21765g extends InputStream {

    /* renamed from: d */
    public final /* synthetic */ C21766h f61693d;

    public C21765g(C21766h hVar) {
        this.f61693d = hVar;
    }

    public int available() {
        return (int) Math.min(this.f61693d.f61695e, (long) Integer.MAX_VALUE);
    }

    public void close() {
    }

    public int read() {
        C21766h hVar = this.f61693d;
        if (hVar.f61695e > 0) {
            return hVar.readByte() & ExifInterface.MARKER;
        }
        return -1;
    }

    public String toString() {
        return this.f61693d + ".inputStream()";
    }

    public int read(byte[] bArr, int i, int i2) {
        C87412m.m108594g(bArr, "sink");
        return this.f61693d.mo34133e(bArr, i, i2);
    }
}
