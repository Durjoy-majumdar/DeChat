package w91;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import te3.C22531uq1;

/* renamed from: w91.a */
public final class C22879a {
    /* renamed from: a */
    public final C22531uq1 mo36049a() {
        byte[] a = C116850b.m164831a("hell_fntbck_pter_mmkv_key");
        if (a == null || a.length <= 0) {
            return null;
        }
        C22531uq1 uq12 = new C22531uq1();
        try {
            uq12.parseFrom(a);
            return uq12;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.FrontBackDao", e, "_doReadFrontBack parse", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo36050b(C22531uq1 uq12) {
        try {
            C116850b.m164834d("hell_fntbck_pter_mmkv_key", uq12.toByteArray());
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.FrontBackDao", e, "writeBackFrontBack", new Object[0]);
        }
    }
}
