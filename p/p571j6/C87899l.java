package p571j6;

import java.io.Writer;

/* renamed from: j6.l */
public class C87899l extends Writer {

    /* renamed from: d */
    public final Writer f254427d;

    /* renamed from: e */
    public final char[] f254428e;

    /* renamed from: f */
    public int f254429f = 0;

    public C87899l(Writer writer, int i) {
        this.f254427d = writer;
        this.f254428e = new char[i];
    }

    public void close() {
    }

    public void flush() {
        this.f254427d.write(this.f254428e, 0, this.f254429f);
        this.f254429f = 0;
    }

    public void write(int i) {
        if (this.f254429f > this.f254428e.length - 1) {
            flush();
        }
        char[] cArr = this.f254428e;
        int i2 = this.f254429f;
        this.f254429f = i2 + 1;
        cArr[i2] = (char) i;
    }

    public void write(char[] cArr, int i, int i2) {
        if (this.f254429f > this.f254428e.length - i2) {
            flush();
            if (i2 > this.f254428e.length) {
                this.f254427d.write(cArr, i, i2);
                return;
            }
        }
        System.arraycopy(cArr, i, this.f254428e, this.f254429f, i2);
        this.f254429f += i2;
    }

    public void write(String str, int i, int i2) {
        if (this.f254429f > this.f254428e.length - i2) {
            flush();
            if (i2 > this.f254428e.length) {
                this.f254427d.write(str, i, i2);
                return;
            }
        }
        str.getChars(i, i + i2, this.f254428e, this.f254429f);
        this.f254429f += i2;
    }
}
