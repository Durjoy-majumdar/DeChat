package p665qq;

import com.tencent.p014mm.autogen.events.WeChatFrontBackEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import g81.C32343a;
import g81.C59378c;
import h81.C32735h;
import ma1.C117543a;

/* renamed from: qq.k */
public class C36055k extends IStaticListener<WeChatFrontBackEvent> {
    public boolean callback(IEvent iEvent) {
        WeChatFrontBackEvent weChatFrontBackEvent = (WeChatFrontBackEvent) iEvent;
        C117543a Cx0 = C117543a.Cx0();
        Cx0.getClass();
        if (weChatFrontBackEvent != null && weChatFrontBackEvent.f79057d.f79058a == 7) {
            Cx0.vx0(1);
            if (!C86709a0.m107522a()) {
                Log.m105928w("MicroMsg.ExptService", "account is not ready, don't get expt config");
            } else if (!MMApplicationContext.isMMProcess()) {
                Log.m105928w("MicroMsg.ExptService", "it is not mm process, why you call update expt?");
            } else {
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT, 0)).intValue();
                int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GET_EXPT_APP_INTERVAL_SEC_INT, 86400)).intValue();
                if (intValue2 <= 3600) {
                    Log.m105928w("MicroMsg.ExptService", "interval is less than 1 hour, something warn here!!!");
                    intValue2 = 3600;
                }
                if (Util.secondsToNow((long) intValue) >= ((long) intValue2)) {
                    Cx0.Mx0(1);
                }
            }
            if (!C86709a0.m107522a()) {
                Log.m105928w("MicroMsg.ExptService", "account is not ready, don't get expt config");
            } else if (!MMApplicationContext.isMMProcess()) {
                Log.m105928w("MicroMsg.ExptService", "it is not mm process, why you call update expt?");
            } else {
                int intValue3 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_REPORT_EXPT_APP_LAST_TIME_SEC_INT, 0)).intValue();
                int Qe = Cx0.mo58779Qe(C32735h.C32737c.clicfg_new_expt_report, 3600);
                if (Qe > 0 && Util.secondsToNow((long) intValue3) >= ((long) Qe)) {
                    C32343a.m39684a().getClass();
                    C86709a0.m107524d().mo123460f(new C59378c());
                }
            }
        }
        return false;
    }
}
