package p598lq;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C31896o0;
import f40.C86709a0;
import ma1.C117543a;

/* renamed from: lq.e */
public class C34333e implements C31896o0.C31897a {
    /* renamed from: aJ */
    public void mo58416aJ(int i) {
        C117543a Cx0 = C117543a.Cx0();
        Cx0.getClass();
        try {
            Log.m105925i("MicroMsg.ExptService", "client upgrade now, reset last update time. previous version [%d]", Integer.valueOf(i));
            Cx0.f351660f = 0;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, 0);
            Cx0.vx0(3);
            Cx0.Jx0(false);
            Cx0.Mx0(3);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ExptService", e, "onAccountInitialized error[%s]", e.toString());
        }
    }
}
