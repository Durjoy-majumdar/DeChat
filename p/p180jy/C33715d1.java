package p180jy;

import com.tencent.p014mm.autogen.events.OmitAllResendSnsEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import os2.C100400e0;
import os2.C100411k0;

/* renamed from: jy.d1 */
public class C33715d1 extends IStaticListener<OmitAllResendSnsEvent> {
    /* JADX INFO: finally extract failed */
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        OmitAllResendSnsEvent omitAllResendSnsEvent = (OmitAllResendSnsEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.OmitAllResendSnsListener", "OmitAllResendSnsEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        } else {
            ArrayList arrayList = omitAllResendSnsEvent.f78885d.f78886a;
            C100400e0 Yx0 = C94866e1.Yx0();
            Yx0.getClass();
            SnsMethodCalculate.markStartTimeMs("omitResendSns", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            C100411k0 Bx0 = C94866e1.Bx0();
            long a = Bx0.mo125613a();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i = (int) longValue;
                    SnsInfo LL = Yx0.mo139800LL(i);
                    if (LL != null) {
                        LL.setOmittedFailResend();
                        Log.m105919d("MicroMsg.SnsInfoStorage", "snsInfoId:%d, setOmitFailResend", Long.valueOf(longValue));
                        Yx0.Rv0(i, LL);
                    }
                }
                Bx0.endTransaction(a);
                SnsMethodCalculate.markEndTimeMs("omitResendSns", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
            } catch (Throwable th) {
                Bx0.endTransaction(a);
                SnsMethodCalculate.markEndTimeMs("omitResendSns", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                throw th;
            }
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        return false;
    }
}
