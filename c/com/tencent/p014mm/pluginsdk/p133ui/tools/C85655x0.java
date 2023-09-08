package com.tencent.p014mm.pluginsdk.p133ui.tools;

import gy3.C87412m;
import java.io.InputStream;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.x0 */
public final class C85655x0 extends InputStream {

    /* renamed from: d */
    public InputStream f249616d;

    /* renamed from: e */
    public InputStream f249617e;

    public C85655x0(InputStream inputStream, InputStream inputStream2) {
        C87412m.m108594g(inputStream, "first");
        C87412m.m108594g(inputStream2, "second");
        this.f249616d = inputStream;
        this.f249617e = inputStream2;
    }

    public int available() {
        return this.f249616d.available() + this.f249617e.available();
    }

    public void close() {
        this.f249616d.close();
        this.f249617e.close();
    }

    public synchronized void mark(int i) {
        this.f249616d.mark(i);
        this.f249617e.mark(i - this.f249616d.available());
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int read = this.f249616d.read();
        if (read != -1) {
            return read;
        }
        return this.f249617e.read();
    }

    public synchronized void reset() {
        this.f249616d.reset();
        this.f249617e.reset();
    }

    public long skip(long j) {
        long skip = this.f249616d.skip(j);
        return skip < j ? skip + this.f249617e.skip(j - skip) : skip;
    }

    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        return 0;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (bArr == null) {
            return 0;
        }
        int read = this.f249616d.read(bArr, i, i2);
        if (read != -1) {
            i3 = read;
        }
        if (i3 >= i2) {
            return i3;
        }
        int read2 = this.f249617e.read(bArr, i + i3, i2 - i3);
        if (read2 == -1) {
            return -1;
        }
        return i3 + read2;
    }
}
