package p333e8;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: e8.q */
public final class C86465q extends BufferedOutputStream {

    /* renamed from: d */
    public boolean f251258d;

    public C86465q(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public void mo120888a(OutputStream outputStream) {
        C20528a.m22240d(this.f251258d);
        this.out = outputStream;
        this.count = 0;
        this.f251258d = false;
    }

    public void close() {
        this.f251258d = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        if (th != null) {
            int i = C20551y.f57835a;
            throw th;
        }
    }

    public C86465q(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
