package p823sg;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: sg.r */
public class C48380r {
    /* renamed from: a */
    public static String m53726a(String str, boolean z) {
        try {
            String i = C86013q1.m106448i(str, z);
            if (i == null) {
                return str;
            }
            Log.m105925i("MicroMsg.VFSFileOpEx", "exportExternalPath:%s to realPath:%s", str, i);
            return i;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.VFSFileOpEx", th, "exportExternalPath failed", new Object[0]);
            return str;
        }
    }
}
