package p180jy;

import com.tencent.p014mm.autogen.events.CleanError0831Event;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import os2.C100399d0;

/* renamed from: jy.g */
public class C33724g extends IStaticListener<CleanError0831Event> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.CleanError0831EventListener");
        CleanError0831Event cleanError0831Event = (CleanError0831Event) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.CleanError0831EventListener");
        C100399d0 Xx0 = C94866e1.Xx0();
        Xx0.getClass();
        SnsMethodCalculate.markStartTimeMs("cleanError", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        Log.m105925i("MicroMsg.SnsExtStorage", "clean Error sql %s ret  %s", "update snsExtInfo3 set md5 = '', faults = '';", Boolean.valueOf(Xx0.f294085e.execSQL("snsExtInfo3", "update snsExtInfo3 set md5 = '', faults = '';")));
        SnsMethodCalculate.markEndTimeMs("cleanError", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.CleanError0831EventListener");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.CleanError0831EventListener");
        return false;
    }
}
