package ba1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import java.io.IOException;
import te3.C64220a24;

/* renamed from: ba1.g */
public final class C113155g {
    /* renamed from: a */
    public static C64220a24 m154832a() {
        byte[] a = C116850b.m164831a("mkv_k_hellsubascld");
        if (a == null || a.length <= 0) {
            Log.m105920e("HABBYGE-MALI.HellSessionUBACloudConfigDao", "HellSessionUBACloudConfigDao read(): NULL");
            return null;
        }
        C64220a24 a242 = new C64220a24();
        try {
            a242.parseFrom(a);
            return a242;
        } catch (IOException e) {
            Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBACloudConfigDao", e, "SessionUBACloudConfig read", new Object[0]);
            return null;
        }
    }
}
