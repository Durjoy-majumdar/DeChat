package k04;

import gy3.C87412m;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: k04.d */
public final class C88048d {
    /* renamed from: a */
    public final InputStream mo122496a(String str) {
        C87412m.m108594g(str, "path");
        ClassLoader classLoader = C88048d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
