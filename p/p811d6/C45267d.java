package p811d6;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: d6.d */
public class C45267d {

    /* renamed from: d */
    public static final Pattern f122619d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e */
    public static final Pattern f122620e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a */
    public final String f122621a;

    /* renamed from: b */
    public final long f122622b;

    /* renamed from: c */
    public final boolean f122623c;

    public C45267d(String str) {
        str.getClass();
        Matcher matcher = f122619d.matcher(str);
        long parseLong = matcher.find() ? Long.parseLong(matcher.group(1)) : -1;
        this.f122622b = Math.max(0, parseLong);
        this.f122623c = parseLong >= 0;
        Matcher matcher2 = f122620e.matcher(str);
        if (matcher2.find()) {
            this.f122621a = matcher2.group(1);
            return;
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    /* renamed from: a */
    public static C45267d m50111a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                return new C45267d(sb.toString());
            }
            sb.append(readLine);
            sb.append(10);
        }
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.f122622b + ", partial=" + this.f122623c + ", uri='" + this.f122621a + '\'' + '}';
    }
}
