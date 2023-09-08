package e14;

import java.util.concurrent.CancellationException;

/* renamed from: e14.o */
public final class C58498o extends CancellationException {
    public C58498o() {
        super("Child of the scoped flow was cancelled");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
