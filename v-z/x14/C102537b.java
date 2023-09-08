package x14;

import java.io.IOException;

/* renamed from: x14.b */
public class C102537b extends IOException {
    public C102537b(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C102537b m135381a() {
        return new C102537b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
