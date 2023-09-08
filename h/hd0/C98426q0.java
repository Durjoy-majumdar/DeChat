package hd0;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: hd0.q0 */
public class C98426q0 {

    /* renamed from: a */
    public static final AtomicLong f288661a = new AtomicLong(1);

    /* renamed from: a */
    public static String m127793a(String str) {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder();
        long currentTimeMillis = System.currentTimeMillis();
        sb.append(new SimpleDateFormat("yyMMddHHmmss", Locale.ENGLISH).format(new Date(currentTimeMillis)));
        String valueOf = String.valueOf(currentTimeMillis);
        sb.append(valueOf.substring(valueOf.length() - 3));
        sb.append(f288661a.getAndIncrement());
        if (str != null && (lastIndexOf = str.lastIndexOf("@")) >= 0) {
            sb.append(str.substring(lastIndexOf + 1));
        }
        return sb.toString();
    }
}
