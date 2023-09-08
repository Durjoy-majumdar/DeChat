package m34;

/* renamed from: m34.e */
public class C117530e extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117530e(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117530e(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
