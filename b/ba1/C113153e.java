package ba1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import te3.C110971t14;

/* renamed from: ba1.e */
public class C113153e {
    /* renamed from: a */
    public static C110971t14 m154822a() {
        byte[] a = C116850b.m164831a("mkv_k_hellsionpgcldc");
        if (a == null || a.length <= 0) {
            Log.m105920e("HABBYGE-MALI.HellSessionPageCloudConfigDao", "HellSessionPageCloudConfigDao read(): NULL");
            return null;
        }
        C110971t14 t142 = new C110971t14();
        try {
            t142.parseFrom(a);
            return t142;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.HellSessionPageCloudConfigDao", e, "HellSessionPageCloudConfigDao read", new Object[0]);
            return null;
        }
    }
}
