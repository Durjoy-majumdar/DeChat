package t24;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: t24.b */
public class C90368b extends Writer implements Serializable {

    /* renamed from: d */
    public final StringBuilder f259376d;

    public C90368b() {
        this.f259376d = new StringBuilder();
    }

    public Writer append(char c) {
        this.f259376d.append(c);
        return this;
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        return this.f259376d.toString();
    }

    public void write(String str) {
        if (str != null) {
            this.f259376d.append(str);
        }
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m168879append(char c) {
        this.f259376d.append(c);
        return this;
    }

    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f259376d.append(cArr, i, i2);
        }
    }

    public C90368b(int i) {
        this.f259376d = new StringBuilder(i);
    }

    public Writer append(CharSequence charSequence) {
        this.f259376d.append(charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m168880append(CharSequence charSequence) {
        this.f259376d.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i, int i2) {
        this.f259376d.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m168881append(CharSequence charSequence, int i, int i2) {
        this.f259376d.append(charSequence, i, i2);
        return this;
    }
}
