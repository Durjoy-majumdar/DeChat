package p978i9;

import java.io.IOException;

/* renamed from: i9.d */
public class C108420d extends IOException {
    public C108420d(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C108420d m146904a() {
        return new C108420d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
