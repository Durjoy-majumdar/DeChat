package p190l1;

import java.util.concurrent.CancellationException;

/* renamed from: l1.o */
public final class C61181o extends CancellationException {
    public C61181o(long j) {
        super("Timed out waiting for " + j + " ms");
    }
}
