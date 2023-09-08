package t52;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import l20.C21388a;
import ob0.C117747y;
import ob0.C35142u;
import p327ct.C30914c;
import qe3.C89625d;
import s52.C36626n;

/* renamed from: t52.h */
public class C36958h implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C36626n vx02 = C36626n.vx0();
        vx02.getClass();
        if (i2 == 0 && i == 0 && !vx02.f97369f && C75592q0.m90763K()) {
            vx02.f97369f = true;
            boolean z = false;
            if ((C89625d.f257841g & -256) == 637534720) {
                C86709a0.m107528h();
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(270343, 0)).intValue();
                if (637534720 != intValue) {
                    Log.m105918d("MicroMsg.MallLogic", "Mall reddot show, targetV=" + 637534720 + ", clickedV=" + intValue);
                    z = true;
                }
            }
            if (z && C75592q0.m90761I()) {
                Log.m105918d("MicroMsg.MallLogic", "Show mall entry redot");
                ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33509r(262156, true);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(270343, 637534720);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_PUSH_DATE_LONG_SYNC, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
