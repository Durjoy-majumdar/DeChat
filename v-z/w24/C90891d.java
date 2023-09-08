package w24;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: w24.d */
public class C90891d extends RuntimeException implements C90889b {

    /* renamed from: d */
    public C90890c f260870d = new C90890c(this);

    /* renamed from: e */
    public Throwable f260871e;

    public C90891d(Throwable th) {
        this.f260871e = th;
    }

    /* renamed from: a */
    public final void mo124982a(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }

    public Throwable getCause() {
        return this.f260871e;
    }

    public String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        Throwable th = this.f260871e;
        if (th != null) {
            return th.toString();
        }
        return null;
    }

    public void printStackTrace() {
        C90890c cVar = this.f260870d;
        PrintStream printStream = System.err;
        cVar.getClass();
        synchronized (printStream) {
            PrintWriter printWriter = new PrintWriter(printStream, false);
            cVar.mo124984a(printWriter);
            printWriter.flush();
        }
    }

    public C90891d(String str, Throwable th) {
        super(str);
        this.f260871e = th;
    }

    public void printStackTrace(PrintStream printStream) {
        C90890c cVar = this.f260870d;
        cVar.getClass();
        synchronized (printStream) {
            PrintWriter printWriter = new PrintWriter(printStream, false);
            cVar.mo124984a(printWriter);
            printWriter.flush();
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        this.f260870d.mo124984a(printWriter);
    }
}
