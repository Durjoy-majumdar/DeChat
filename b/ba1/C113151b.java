package ba1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import java.io.IOException;
import te3.C118441l14;

/* renamed from: ba1.b */
public final class C113151b {
    /* renamed from: a */
    public static synchronized C118441l14 m154818a() {
        synchronized (C113151b.class) {
            byte[] a = C116850b.m164831a("mkv_k_hellsscld");
            if (a != null) {
                if (a.length > 0) {
                    C118441l14 l142 = new C118441l14();
                    try {
                        l142.parseFrom(a);
                        return l142;
                    } catch (IOException e) {
                        Log.printErrStackTrace("HABBYGE-MALI.HellSessionCloudConfigDao", e, "SessionConfigCloud read", new Object[0]);
                        return null;
                    }
                }
            }
            Log.m105920e("HABBYGE-MALI.HellSessionCloudConfigDao", "HellSessionCloudConfigDao read(): NULL");
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized void m154819b(C118441l14 l142) {
        synchronized (C113151b.class) {
            try {
                C116850b.m164834d("mkv_k_hellsscld", l142.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSessionCloudConfigDao", e, "HellSessionCloudConfigDao writeBack", new Object[0]);
            }
        }
        return;
    }
}
