package xz3;

import java.io.IOException;

/* renamed from: xz3.j */
public class C26601j extends IOException {

    /* renamed from: d */
    public C26607p f74023d = null;

    public C26601j(String str) {
        super(str);
    }

    /* renamed from: b */
    public static C26601j m34468b() {
        return new C26601j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public C26601j mo53581a(C26607p pVar) {
        this.f74023d = pVar;
        return this;
    }
}
