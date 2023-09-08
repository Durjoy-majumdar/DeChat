package lb0;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import js0.C9514m;
import lb0.C88394b;
import s24.C90125c;

/* renamed from: lb0.f */
public class C88424f extends BufferedInputStream {

    /* renamed from: d */
    public final /* synthetic */ C9514m f255436d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88424f(C88394b.C88419s sVar, InputStream inputStream, C9514m mVar) {
        super(inputStream);
        this.f255436d = mVar;
    }

    public void close() {
        try {
            super.close();
        } finally {
            URLConnection uRLConnection = (URLConnection) this.f255436d.f29691a;
            int i = C90125c.f258817a;
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
        }
    }
}
