package m34;

/* renamed from: m34.f */
public class C88695f extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88695f(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88695f(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
