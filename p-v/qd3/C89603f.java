package qd3;

import java.io.IOException;

/* renamed from: qd3.f */
public final class C89603f extends IOException {

    /* renamed from: d */
    public final int f257792d;

    /* renamed from: e */
    public final IOException f257793e;

    public C89603f(int i, IOException iOException) {
        this.f257792d = i;
        this.f257793e = iOException;
    }

    public String toString() {
        return "UnknownConnectionError{httpStatusCode=" + this.f257792d + ", realException=" + this.f257793e + '}';
    }
}
