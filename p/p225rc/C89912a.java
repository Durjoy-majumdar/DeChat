package p225rc;

import androidx.exifinterface.media.ExifInterface;
import b34.C79664a;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: rc.a */
public class C89912a extends InputStream {

    /* renamed from: d */
    public final ByteBuffer f258369d;

    /* renamed from: e */
    public int f258370e;

    public C89912a(ByteBuffer byteBuffer) {
        this.f258369d = byteBuffer;
    }

    /* renamed from: a */
    public static void m112442a(ByteBuffer byteBuffer) {
        if (byteBuffer.getClass().getName().equals("java.nio.DirectByteBuffer")) {
            try {
                C79664a.m96761i(C79664a.m96761i(byteBuffer).mo109789b("cleaner", new Object[0]).f233575b).mo109789b("clean", new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public int available() {
        return this.f258369d.remaining();
    }

    /* renamed from: b */
    public synchronized void mo124214b(int i) {
        this.f258369d.position(i);
    }

    public void close() {
        super.close();
        m112442a(this.f258369d);
    }

    public synchronized void mark(int i) {
        this.f258370e = this.f258369d.position();
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        if (this.f258369d.hasRemaining()) {
            return this.f258369d.get() & ExifInterface.MARKER;
        }
        return -1;
    }

    public synchronized void reset() {
        this.f258369d.position(this.f258370e);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!this.f258369d.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, this.f258369d.remaining());
        this.f258369d.get(bArr, i, min);
        return min;
    }
}
