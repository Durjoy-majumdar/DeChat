package t24;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: t24.a */
public class C90367a extends OutputStream {

    /* renamed from: i */
    public static final byte[] f259370i = new byte[0];

    /* renamed from: d */
    public final List<byte[]> f259371d = new ArrayList();

    /* renamed from: e */
    public int f259372e;

    /* renamed from: f */
    public int f259373f;

    /* renamed from: g */
    public byte[] f259374g;

    /* renamed from: h */
    public int f259375h;

    public C90367a() {
        synchronized (this) {
            mo124579a(1024);
        }
    }

    /* renamed from: a */
    public final void mo124579a(int i) {
        if (this.f259372e < this.f259371d.size() - 1) {
            this.f259373f += this.f259374g.length;
            int i2 = this.f259372e + 1;
            this.f259372e = i2;
            this.f259374g = this.f259371d.get(i2);
            return;
        }
        byte[] bArr = this.f259374g;
        if (bArr == null) {
            this.f259373f = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f259373f);
            this.f259373f += this.f259374g.length;
        }
        this.f259372e++;
        byte[] bArr2 = new byte[i];
        this.f259374g = bArr2;
        this.f259371d.add(bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized byte[] mo124580b() {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.f259375h     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0009
            byte[] r0 = f259370i     // Catch:{ all -> 0x002f }
            monitor-exit(r7)
            return r0
        L_0x0009:
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x002f }
            java.util.List<byte[]> r2 = r7.f259371d     // Catch:{ all -> 0x002f }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x002f }
            r3 = 0
            r4 = 0
        L_0x0015:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x002d
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x002f }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x002f }
            int r6 = r5.length     // Catch:{ all -> 0x002f }
            int r6 = java.lang.Math.min(r6, r0)     // Catch:{ all -> 0x002f }
            java.lang.System.arraycopy(r5, r3, r1, r4, r6)     // Catch:{ all -> 0x002f }
            int r4 = r4 + r6
            int r0 = r0 - r6
            if (r0 != 0) goto L_0x0015
        L_0x002d:
            monitor-exit(r7)
            return r1
        L_0x002f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t24.C90367a.mo124580b():byte[]");
    }

    public void close() {
    }

    @Deprecated
    public String toString() {
        return new String(mo124580b(), Charset.defaultCharset());
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 != 0) {
            synchronized (this) {
                int i4 = this.f259375h;
                int i5 = i4 + i2;
                int i6 = i4 - this.f259373f;
                while (i2 > 0) {
                    int min = Math.min(i2, this.f259374g.length - i6);
                    System.arraycopy(bArr, i3 - i2, this.f259374g, i6, min);
                    i2 -= min;
                    if (i2 > 0) {
                        mo124579a(i5);
                        i6 = 0;
                    }
                }
                this.f259375h = i5;
            }
        }
    }

    public synchronized void write(int i) {
        int i2 = this.f259375h;
        int i3 = i2 - this.f259373f;
        if (i3 == this.f259374g.length) {
            mo124579a(i2 + 1);
            i3 = 0;
        }
        this.f259374g[i3] = (byte) i;
        this.f259375h++;
    }
}
