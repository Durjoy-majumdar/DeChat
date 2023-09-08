package na2;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.LruCache;

/* renamed from: na2.d */
public class C61638d {

    /* renamed from: a */
    public static LruCache<String, String> f175282a = new LruCache<>(20);

    /* renamed from: b */
    public static LruCache<String, Long> f175283b = new LruCache<>(20);

    /* renamed from: a */
    public static String m72350a(String str) {
        String str2 = null;
        if (!TextUtils.isEmpty(str) && f175282a.check(str)) {
            str2 = f175282a.get(str);
        }
        return str2 == null ? str : str2;
    }

    /* renamed from: b */
    public static boolean m72351b(String str) {
        return !TextUtils.isEmpty(str) && str.contains("wxshakemusic");
    }
}
