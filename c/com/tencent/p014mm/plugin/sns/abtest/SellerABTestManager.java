package com.tencent.p014mm.plugin.sns.abtest;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsFinishBlockUserEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.sns.abtest.SellerABTestManager */
public class SellerABTestManager {

    /* renamed from: a */
    public static Set<Long> f116470a = new HashSet();

    /* renamed from: b */
    public static IListener f116471b = new IListener<SnsFinishBlockUserEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1604164515;
        }

        public boolean callback(IEvent iEvent) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager$1");
            SnsFinishBlockUserEvent snsFinishBlockUserEvent = (SnsFinishBlockUserEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager$1");
            if (snsFinishBlockUserEvent instanceof SnsFinishBlockUserEvent) {
                SnsFinishBlockUserEvent.C40167a aVar = snsFinishBlockUserEvent.f107763d;
                boolean z = aVar.f107764a;
                long j = aVar.f107765b;
                Log.m105919d("MicroMsg.SellerABTestManager", "blockUserEventListener callback, isBlock:%b, snsInfoSvrId:%b", Boolean.valueOf(z), Long.valueOf(j));
                if (j != 0) {
                    Set<Long> set = SellerABTestManager.f116470a;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                    Set<Long> set2 = SellerABTestManager.f116470a;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                    if (((HashSet) set2).contains(Long.valueOf(j))) {
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                        SnsMethodCalculate.markStartTimeMs("endABTestWhenFinishBlock", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                        SnsMethodCalculate.markEndTimeMs("endABTestWhenFinishBlock", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager$1");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager$1");
            return false;
        }
    };

    /* renamed from: a */
    public static void m46659a() {
        SnsMethodCalculate.markStartTimeMs("startABTest", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
        SnsMethodCalculate.markEndTimeMs("startABTest", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
    }
}
