package eb0;

import java.text.SimpleDateFormat;
import java.util.Date;
import p823sg.C90193h;

/* renamed from: eb0.p0 */
public final class C7628p0 {
    /* renamed from: a */
    public static String m7761a(String str, long j) {
        String str2;
        String format = new SimpleDateFormat("ssHHmmMMddyy").format(new Date(j));
        if (str == null || str.length() <= 1) {
            str2 = format + "fffffff";
        } else {
            str2 = format + C90193h.m112878f(str.getBytes()).substring(0, 7);
        }
        return (str2 + String.format("%04x", new Object[]{Long.valueOf(j % 65535)})) + ((j % 7) + 100);
    }
}
