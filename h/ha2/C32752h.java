package ha2;

import a70.C112760b;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.util.ArrayList;
import ua2.C101991b;

/* renamed from: ha2.h */
public class C32752h {

    /* renamed from: a */
    public static LruCache<String, String> f89139a = new LruCache<>(20);

    /* renamed from: b */
    public static LruCache<String, Boolean> f89140b = new LruCache<>(20);

    /* renamed from: c */
    public static LruCache<String, Integer> f89141c = new LruCache<>(20);

    /* renamed from: d */
    public static LruCache<String, Integer> f89142d = new LruCache<>(20);

    /* renamed from: e */
    public static LruCache<String, Long> f89143e = new LruCache<>(20);

    /* renamed from: f */
    public static LruCache<String, String> f89144f = new LruCache<>(20);

    /* renamed from: g */
    public static LruCache<String, Boolean> f89145g = new LruCache<>(20);

    /* renamed from: h */
    public static String f89146h = null;

    /* renamed from: i */
    public static int f89147i = 0;

    /* renamed from: a */
    public static String m39802a() {
        String str = f89146h;
        if (str != null) {
            return str;
        }
        String a = C98329e.m127105a();
        if (TextUtils.isEmpty(a)) {
            Log.m105925i("MicroMsg.Music.PieceCacheHelper", "retAccPath:%s is invalid", a);
            return C112760b.m154195C();
        }
        Log.m105925i("MicroMsg.Music.PieceCacheHelper", "getAccPath retAccPath:%s", a);
        f89146h = a;
        return a;
    }

    /* renamed from: b */
    public static String m39803b(String str) {
        return f89139a.check(str) ? f89139a.get(str) : "";
    }

    /* renamed from: c */
    public static String m39804c(String str) {
        String b = m39803b(str);
        if (TextUtils.isEmpty(b)) {
            Log.m105920e("MicroMsg.Music.PieceCacheHelper", "getMusicMIMEType musicId is empty!");
            return null;
        } else if (C98329e.m127108d()) {
            return ((C98327c) C101991b.m134284b(C98327c.class)).mo137648j0(b);
        } else {
            Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m39805d(String str) {
        if (f89145g.check(str)) {
            return f89145g.get(str).booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public static void m39806e(String str, int i) {
        if (str != null) {
            f89142d.put(str, Integer.valueOf(i));
        }
    }

    /* renamed from: f */
    public static void m39807f(String str) {
        String str2;
        Class cls = C98327c.class;
        if (TextUtils.isEmpty(m39803b(str))) {
            if (C98329e.m127108d()) {
                str2 = ((C98327c) C101991b.m134284b(cls)).mo137655x0(str);
            } else {
                Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(str2);
                C32751g gVar = new C32751g(arrayList);
                long j = 0;
                if (C32751g.f89137f == 0) {
                    if (C98329e.m127108d()) {
                        j = ((C98327c) C101991b.m134284b(cls)).mo137643Y();
                    } else {
                        Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
                    }
                    C32751g.f89137f = j;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - C32751g.f89137f <= C32749b.f89134d.longValue()) {
                    Log.m105920e("MicroMsg.Music.PieceCacheCleanController", "startClean the last clean time is in MUSIC_NO_SCAN_TIME time");
                } else {
                    C32751g.f89137f = currentTimeMillis;
                    Log.m105924i("MicroMsg.Music.PieceCacheCleanController", "start clean music file");
                    ThreadPool.post(new C32750f(gVar, currentTimeMillis), "PieceCacheCleanController");
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    f89139a.put(str, str2);
                }
            }
        }
    }
}
