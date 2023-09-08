package k33;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: k33.m */
public class C33823m {
    /* renamed from: a */
    public static String m40152a(String str, boolean z) {
        String str2;
        String str3 = C72994y1.f212832a;
        Log.m105924i("MicroMsg.VoicePrintLogic", "dbCachePath " + str3);
        if (str3.endsWith("/")) {
            str2 = str3 + str;
        } else {
            str2 = str3 + "/" + str;
        }
        Log.m105924i("MicroMsg.VoicePrintLogic", "genpath " + str2);
        if (Util.isNullOrNil(str2)) {
            return null;
        }
        if (z) {
            return str2;
        }
        new C86009m1(str2).mo119967g();
        return str2;
    }
}
