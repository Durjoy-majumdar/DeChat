package dt2;

import ob0.C89132b;
import te3.C49335eu3;

/* renamed from: dt2.b */
public class C45450b<Response extends C49335eu3> extends C89132b<Response> {

    /* renamed from: i */
    public final String f123021i = "MicroMsg.SnsCgi";

    /* renamed from: dt2.b$a */
    public static final class C45451a extends Exception {

        /* renamed from: d */
        public final int f123022d;

        public C45451a(int i, int i2, String str) {
            super("CGI returns error: errorType=" + i + ", errorCode=" + i2 + ", message=" + str);
            this.f123022d = i2;
        }
    }
}
