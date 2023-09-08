package p180jy;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.SnsClearDBEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import os2.C100400e0;
import p749xh.C102661q8;

/* renamed from: jy.x1 */
public class C99081x1 extends IStaticListener<SnsClearDBEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        SnsClearDBEvent snsClearDBEvent = (SnsClearDBEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.SnsClearDbListener", "SnsClearDBEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        } else {
            int i = C94897n1.f274990d;
            SnsMethodCalculate.markStartTimeMs("printAllDbFeedsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            Cursor bF = C94866e1.Yx0().mo139815bF("", "", 0, 0);
            if (bF != null) {
                Log.m105924i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId begin");
                while (bF.moveToNext()) {
                    SnsInfo snsInfo = new SnsInfo();
                    snsInfo.convertFrom(bF);
                    Log.m105924i("MicroMsg.SnsInfoStorageLogic", snsInfo.getSnsId());
                }
                Log.m105924i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId end");
                bF.close();
            }
            SnsMethodCalculate.markEndTimeMs("printAllDbFeedsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            C100400e0 Yx0 = C94866e1.Yx0();
            Yx0.getClass();
            SnsMethodCalculate.markStartTimeMs("clearInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            Yx0.f294108d.execSQL(C102661q8.TABLE_NAME, "delete from SnsInfo");
            SnsMethodCalculate.markEndTimeMs("clearInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            C94866e1.Xx0().mo139776Lo("@__weixintimtline");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        return false;
    }
}
