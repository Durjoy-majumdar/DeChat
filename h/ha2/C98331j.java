package ha2;

import com.tencent.p014mm.sdk.platformtools.Log;
import qc0.C101108q;

/* renamed from: ha2.j */
public class C98331j {
    /* renamed from: a */
    public static boolean m127116a(String str) {
        C101108q c = C98329e.m127107c(C32752h.m39803b(str));
        if (c != null) {
            return C98330i.m127112b(str) && C98330i.m127113c(str) > 0 && c.f295983e == 1;
        }
        Log.m105920e("MicroMsg.Audio.IndexBitMgr", "isQQAudioCacheValid pMusic is null!'");
        return false;
    }
}
