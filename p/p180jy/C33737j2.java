package p180jy;

import as2.C28128e;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.autogen.events.SnsResetLuckyEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.io.IOException;
import java.nio.charset.Charset;
import ms2.C47099k;

/* renamed from: jy.j2 */
public class C33737j2 extends IStaticListener<SnsResetLuckyEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsResetLuckyListener");
        SnsResetLuckyEvent snsResetLuckyEvent = (SnsResetLuckyEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsResetLuckyListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.SnsResetLuckyListener", "SnsResetLuckyEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsResetLuckyListener");
        } else {
            C28128e.m38100a().getClass();
            SnsMethodCalculate.markStartTimeMs("unMarkLuckyAlert", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLMARKFULLSCREEN_STRING_SYNC;
            SnsMethodCalculate.markStartTimeMs("unmardRedotList", "com.tencent.mm.plugin.sns.lucky.model.RedDotUtil");
            C47099k kVar = new C47099k();
            try {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, new String(kVar.toByteArray(), Charset.forName(KindaConfigCacheStg.SAVE_CHARSET)));
            } catch (IOException e) {
                Log.m105928w("MicroMsg.RedDotUtil", "mardRedotList save exception:" + e.getLocalizedMessage());
            }
            SnsMethodCalculate.markEndTimeMs("unmardRedotList", "com.tencent.mm.plugin.sns.lucky.model.RedDotUtil");
            SnsMethodCalculate.markEndTimeMs("unMarkLuckyAlert", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsResetLuckyListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsResetLuckyListener");
        return false;
    }
}
