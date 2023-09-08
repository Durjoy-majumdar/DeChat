package ha2;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ja2.C98926a;
import qc0.C101108q;
import ua2.C101991b;

/* renamed from: ha2.e */
public class C98329e {
    /* renamed from: a */
    public static String m127105a() {
        if (m127108d()) {
            String b = ((C98327c) C101991b.m134284b(C98327c.class)).mo137646b();
            if (!Util.isNullOrNil(b)) {
                return b;
            }
        }
        Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        return C112760b.m154195C();
    }

    /* renamed from: b */
    public static C98926a m127106b(String str) {
        if (m127108d()) {
            return ((C98327c) C101991b.m134284b(C98327c.class)).mo137650k0(str);
        }
        Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        return new C98926a();
    }

    /* renamed from: c */
    public static C101108q m127107c(String str) {
        if (m127108d()) {
            return ((C98327c) C101991b.m134284b(C98327c.class)).mo137652t0(str);
        }
        Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        return null;
    }

    /* renamed from: d */
    public static boolean m127108d() {
        return C101991b.m134284b(C98327c.class) != null;
    }

    /* renamed from: e */
    public static void m127109e(String str, C98926a aVar) {
        if (m127108d()) {
            ((C98327c) C101991b.m134284b(C98327c.class)).mo137644Z(str, aVar);
        } else {
            Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        }
    }

    /* renamed from: f */
    public static void m127110f(String str, String str2) {
        if (m127108d()) {
            ((C98327c) C101991b.m134284b(C98327c.class)).mo137641N(str, str2);
        } else {
            Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        }
    }
}
