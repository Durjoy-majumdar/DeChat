package p180jy;

import com.tencent.p014mm.autogen.events.AdLandingPagesDownloadEventEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ps2.C100900w;
import zt3.C119157j;

/* renamed from: jy.c */
public class C33709c extends IStaticListener<AdLandingPagesDownloadEventEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        AdLandingPagesDownloadEventEvent adLandingPagesDownloadEventEvent = (AdLandingPagesDownloadEventEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.AdLandingPagesDownloadEventListener", "AdLandingPagesDownloadEventEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        } else {
            String str = adLandingPagesDownloadEventEvent.f78708d.f78709a;
            if (!Util.isNullOrNil(str)) {
                SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPagesForMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                if (Util.isNullOrNil(str)) {
                    SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                } else {
                    ((C119157j) C119157j.f356862d).mo183875f(new C100900w(str));
                    SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        return false;
    }
}
