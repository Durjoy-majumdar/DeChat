package g34;

import e34.C116680b;
import j34.C117296c;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: g34.g */
public class C116916g {

    /* renamed from: a */
    public int f350342a;

    /* renamed from: b */
    public String f350343b;

    /* renamed from: c */
    public InputStream f350344c;

    public C116916g(HttpURLConnection httpURLConnection) {
        boolean z;
        try {
            httpURLConnection.connect();
            this.f350342a = httpURLConnection.getResponseCode();
            HashMap hashMap = new HashMap();
            Iterator<String> it = httpURLConnection.getHeaderFields().keySet().iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                hashMap.put(next, (String) httpURLConnection.getHeaderFields().get(next).get(0));
            }
            int i = this.f350342a;
            if (i >= 200 && i < 400) {
                z = true;
            }
            this.f350344c = z ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        } catch (UnknownHostException e) {
            throw new C116680b("The IP address of a host could not be determined.", e);
        }
    }

    /* renamed from: a */
    public String mo180885a() {
        int read;
        String str = this.f350343b;
        if (str == null) {
            InputStream inputStream = this.f350344c;
            C117296c.m165375b(inputStream, "Cannot get String from a null object");
            try {
                char[] cArr = new char[65536];
                StringBuilder sb = new StringBuilder();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                do {
                    read = inputStreamReader.read(cArr, 0, 65536);
                    if (read > 0) {
                        sb.append(cArr, 0, read);
                        continue;
                    }
                } while (read >= 0);
                inputStreamReader.close();
                str = sb.toString();
                this.f350343b = str;
            } catch (IOException e) {
                throw new IllegalStateException("Error while reading response body", e);
            }
        }
        return str;
    }
}
