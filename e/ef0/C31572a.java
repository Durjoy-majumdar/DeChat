package ef0;

import com.tencent.p014mm.patchligthdiff.hdiff.HPatch;
import com.tencent.stubs.logger.Log;
import java.io.File;

/* renamed from: ef0.a */
public class C31572a {
    /* renamed from: a */
    public static int m39461a(String str, String str2, String str3) {
        try {
            new File(str3).deleteOnExit();
            int patch = HPatch.patch(str, str2, str3, 262144);
            Log.m106505i("HdiffApk-CmdUtils", "hpatchz = code = " + patch);
            return patch;
        } catch (Exception e) {
            Log.m106505i("HdiffApk-CmdUtils", "hpatchz e = " + e);
            return 999;
        }
    }
}
