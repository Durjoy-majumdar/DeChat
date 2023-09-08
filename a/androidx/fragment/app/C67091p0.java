package androidx.fragment.app;

import java.io.Writer;

/* renamed from: androidx.fragment.app.p0 */
public final class C67091p0 extends Writer {

    /* renamed from: d */
    public StringBuilder f192681d = new StringBuilder(128);

    public C67091p0(String str) {
    }

    /* renamed from: a */
    public final void mo91170a() {
        if (this.f192681d.length() > 0) {
            this.f192681d.toString();
            StringBuilder sb = this.f192681d;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        mo91170a();
    }

    public void flush() {
        mo91170a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo91170a();
            } else {
                this.f192681d.append(c);
            }
        }
    }
}
