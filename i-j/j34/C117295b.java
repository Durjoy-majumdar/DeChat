package j34;

import e34.C116680b;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: j34.b */
public class C117295b {

    /* renamed from: a */
    public static final Map<String, String> f351158a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("*", "%2A");
        hashMap.put("+", "%20");
        hashMap.put("%7E", "~");
        f351158a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static String m165372a(String str) {
        C117296c.m165375b(str, "Cannot decode null object");
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new C116680b("Charset not found while decoding string: UTF-8", e);
        }
    }

    /* renamed from: b */
    public static String m165373b(String str) {
        C117296c.m165375b(str, "Cannot encode null object");
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            for (Map.Entry next : f351158a.entrySet()) {
                encode = encode.replaceAll(Pattern.quote((String) next.getKey()), (String) next.getValue());
            }
            return encode;
        } catch (UnsupportedEncodingException e) {
            throw new C116680b("Charset not found while encoding string: UTF-8", e);
        }
    }
}
