package com.tencent.p014mm.plugin.sns.abtest;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ViewGroup;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinishSendNotInterestSnsEvent;
import com.tencent.p014mm.autogen.events.SnsFinishBlockUserEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager */
public class NotInteresetABTestManager {

    /* renamed from: a */
    public static long f273610a;

    /* renamed from: b */
    public static IListener f273611b;

    /* renamed from: c */
    public static IListener f273612c;

    static {
        C40008f fVar = C40008f.f107254d;
        f273611b = new IListener<SnsFinishBlockUserEvent>(fVar) {
            {
                this.__eventId = -1604164515;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$1");
                SnsFinishBlockUserEvent snsFinishBlockUserEvent = (SnsFinishBlockUserEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$1");
                if (snsFinishBlockUserEvent instanceof SnsFinishBlockUserEvent) {
                    SnsFinishBlockUserEvent.C40167a aVar = snsFinishBlockUserEvent.f107763d;
                    boolean z = aVar.f107764a;
                    long j = aVar.f107765b;
                    Log.m105919d("MicroMsg.NotInteresetABTestManager", "blockUserEventListener callback, isBlock:%b, snsInfoSvrId:%b", Boolean.valueOf(z), Long.valueOf(j));
                    if (!(j == 0 || NotInteresetABTestManager.m119626a() == 0 || NotInteresetABTestManager.m119626a() != j)) {
                        if (z) {
                            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                        } else {
                            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                        }
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                        SnsMethodCalculate.markStartTimeMs("endAbTest", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                        NotInteresetABTestManager.f273610a = 0;
                        SnsMethodCalculate.markEndTimeMs("endAbTest", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$1");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$1");
                return false;
            }
        };
        f273612c = new IListener<FinishSendNotInterestSnsEvent>(fVar) {
            {
                this.__eventId = 1511451476;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$2");
                FinishSendNotInterestSnsEvent finishSendNotInterestSnsEvent = (FinishSendNotInterestSnsEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$2");
                if (finishSendNotInterestSnsEvent instanceof FinishSendNotInterestSnsEvent) {
                    FinishSendNotInterestSnsEvent.C92518a aVar = finishSendNotInterestSnsEvent.f264869d;
                    boolean z = aVar.f264870a;
                    long j = aVar.f264871b;
                    Log.m105919d("MicroMsg.NotInteresetABTestManager", "notInterestFinishEventListener callback, isNotInterest:%b, sndId:%d", Boolean.valueOf(z), Long.valueOf(j));
                    if (!(j == 0 || NotInteresetABTestManager.m119626a() == 0 || j != NotInteresetABTestManager.m119626a())) {
                        if (z) {
                            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                        } else {
                            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                        }
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                        SnsMethodCalculate.markStartTimeMs("endAbTest", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                        NotInteresetABTestManager.f273610a = 0;
                        SnsMethodCalculate.markEndTimeMs("endAbTest", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$2");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$2");
                return false;
            }
        };
    }

    /* renamed from: a */
    public static /* synthetic */ long m119626a() {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        long j = f273610a;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        return j;
    }

    /* renamed from: b */
    public static void m119627b(ContextMenu contextMenu, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("dealAddNotInterestContextMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        SnsMethodCalculate.markEndTimeMs("dealAddNotInterestContextMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
    }

    /* renamed from: c */
    public static void m119628c(Context context, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("startAbTest", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        SnsMethodCalculate.markEndTimeMs("startAbTest", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
    }
}
