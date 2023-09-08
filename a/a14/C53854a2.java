package a14;

import gy3.C87412m;
import java.util.concurrent.CancellationException;

/* renamed from: a14.a2 */
public final class C53854a2 extends CancellationException {

    /* renamed from: d */
    public final transient C53973z1 f151096d;

    public C53854a2(String str, Throwable th, C53973z1 z1Var) {
        super(str);
        this.f151096d = z1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C53854a2) {
                C53854a2 a2Var = (C53854a2) obj;
                if (!C87412m.m108589b(a2Var.getMessage(), getMessage()) || !C87412m.m108589b(a2Var.f151096d, this.f151096d) || !C87412m.m108589b(a2Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C87412m.m108591d(message);
        int hashCode = ((message.hashCode() * 31) + this.f151096d.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.f151096d;
    }
}
