package nr2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import h81.C32735h;
import p761yd.C38993b;

/* renamed from: nr2.a */
public final class C35014a {

    /* renamed from: a */
    public static final C35014a f93965a = new C35014a();

    /* renamed from: b */
    public static boolean f93966b;

    /* renamed from: a */
    public final boolean mo59824a() {
        f93966b = C38993b.m41993c(C32735h.C32737c.clicfg_sns_record_resolution_ratio_9_16, true);
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_USE_NEW_RECORD_INT_SYNC, 0);
        if (j == 0) {
            Log.m105924i("MicroMsg.SnsRecordPostNewConfig", "enableRecordWithFixedResolutionFlag " + f93966b);
            return f93966b;
        } else if (j != 2) {
            if (f93966b) {
                Log.m105924i("MicroMsg.SnsRecordPostNewConfig", "enableRecordWithFixedResolutionFlag false");
                f93966b = false;
            }
            return false;
        } else {
            if (!f93966b) {
                Log.m105924i("MicroMsg.SnsRecordPostNewConfig", "enableRecordWithFixedResolutionFlag true");
                f93966b = true;
            }
            return true;
        }
    }
}
