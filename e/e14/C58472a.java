package e14;

import d14.C45253g;
import java.util.concurrent.CancellationException;

/* renamed from: e14.a */
public final class C58472a extends CancellationException {

    /* renamed from: d */
    public final transient C45253g<?> f167452d;

    public C58472a(C45253g<?> gVar) {
        super("Flow was aborted, no more elements needed");
        this.f167452d = gVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
