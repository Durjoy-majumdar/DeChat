package com.tencent.p014mm.kara.feature.bridge;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GetSnsVideoFeatureGroupEvent;
import com.tencent.p014mm.kara.feature.feature.business.SnsVideoClickFeatureGroup;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import m30.C88694d;
import r30.C77484b;

/* renamed from: com.tencent.mm.kara.feature.bridge.KaraBridge */
public class KaraBridge {
    /* renamed from: a */
    public static void m80379a() {
        new IListener<GetSnsVideoFeatureGroupEvent>(C40008f.f107254d) {
            {
                this.__eventId = 601395912;
            }

            public boolean callback(IEvent iEvent) {
                GetSnsVideoFeatureGroupEvent getSnsVideoFeatureGroupEvent = (GetSnsVideoFeatureGroupEvent) iEvent;
                boolean z = false;
                Log.m105925i("KaraBridge", "snsid:%s", getSnsVideoFeatureGroupEvent.f236216d.f236217a);
                SnsInfo TE = C94866e1.Yx0().mo139807TE(getSnsVideoFeatureGroupEvent.f236216d.f236217a);
                if (TE != null) {
                    SnsVideoClickFeatureGroup snsVideoClickFeatureGroup = new SnsVideoClickFeatureGroup(TE);
                    C77484b.f225930b.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = MultiProcessMMKV.getDefault().getLong("SnsFeatureStorage_create_time_v1", 0);
                    if (j != 0 && currentTimeMillis - j > (((((long) C88694d.m110640c()) * 1000) * 60) * 60) * 24) {
                        C77484b.f225929a.getClass();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j2 = MultiProcessMMKV.getDefault().getLong("ChattingEventStorage_create_time_v1", 0);
                        if (j2 != 0 && currentTimeMillis2 - j2 > (((((long) C88694d.m110640c()) * 1000) * 60) * 60) * 24) {
                            z = true;
                        }
                    }
                    if (z) {
                        getSnsVideoFeatureGroupEvent.f236216d.f236218b = snsVideoClickFeatureGroup;
                    } else {
                        getSnsVideoFeatureGroupEvent.f236216d.f236218b = null;
                        Log.m105920e("KaraBridge", "SnsVideoClickFeatureGroup inValid");
                    }
                } else {
                    getSnsVideoFeatureGroupEvent.f236216d.f236218b = null;
                    Log.m105920e("KaraBridge", "snsInfo null");
                }
                return true;
            }
        }.alive();
    }
}
