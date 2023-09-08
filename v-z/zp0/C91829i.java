package zp0;

import java.io.IOException;
import java.util.Locale;

/* renamed from: zp0.i */
public class C91829i extends IOException {

    /* renamed from: d */
    public final C91830a f262937d;

    /* renamed from: e */
    public final int f262938e;

    /* renamed from: f */
    public final String f262939f;

    /* renamed from: zp0.i$a */
    public enum C91830a {
        ENCODE,
        DECODE,
        SEND,
        TRANSFER,
        NETWORK,
        SERVER;
        

        /* renamed from: d */
        public final int f262947d;

        public String toString() {
            return String.format(Locale.ENGLISH, "%s(%d)", new Object[]{name(), Integer.valueOf(this.f262947d)});
        }
    }

    public C91829i(C91830a aVar, int i, String str) {
        super(String.format(Locale.US, "[%s %d %s]", new Object[]{aVar.toString(), Integer.valueOf(i), str}));
        this.f262937d = aVar;
        this.f262938e = i;
        this.f262939f = str;
    }

    public String toString() {
        return "CgiError{err=" + this.f262937d + ", errCode=" + this.f262938e + ", message='" + this.f262939f + '\'' + '}';
    }
}
