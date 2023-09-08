package vp0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import rx3.C13601g;
import rx3.C36568h;
import vp0.C90856b;
import xp0.C38789a;
import xp0.C38798c;
import yp0.C91539c;

/* renamed from: vp0.a */
public final class C90854a {

    /* renamed from: a */
    public static final C90854a f260826a = new C90854a();

    /* renamed from: b */
    public static C38798c f260827b = new C38789a();

    /* renamed from: c */
    public static final C13601g f260828c = C36568h.m40985a(C90855a.f260829d);

    /* renamed from: vp0.a$a */
    public static final class C90855a extends C87413o implements C32224a<C91539c> {

        /* renamed from: d */
        public static final C90855a f260829d = new C90855a();

        public C90855a() {
            super(0);
        }

        public Object invoke() {
            return new C91539c(C90854a.f260827b);
        }
    }

    /* renamed from: a */
    public final boolean mo124951a(HttpsURLConnection httpsURLConnection) {
        C87412m.m108594g(httpsURLConnection, "urlConnection");
        try {
            C90856b b = C90856b.C90858b.m113942b(C90856b.f260830b, (X509TrustManager) null, 1, (Object) null);
            if (b == null) {
                return false;
            }
            SSLContext instance = SSLContext.getInstance("SSL");
            instance.init((KeyManager[]) null, (TrustManager[]) new C90856b[]{b}, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AndroidCheckServerTrustedIssueFixer", e, "doFix for HttpsURLConnection, fix fail", new Object[0]);
            return false;
        }
    }
}
