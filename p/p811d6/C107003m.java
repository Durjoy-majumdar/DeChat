package p811d6;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: d6.m */
public class C107003m {
    /* renamed from: a */
    public static String m144805a(String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error decoding url", e);
        }
    }
}
