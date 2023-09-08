package p180jy;

import com.tencent.p014mm.autogen.events.SnsNewSyncObjectEvent;
import com.tencent.p014mm.plugin.sns.model.C30414s1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94879h0;
import com.tencent.p014mm.plugin.sns.model.C94916o0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import fs2.C32163a;
import h81.C32735h;
import java.util.Date;
import kj2.C117407d;
import lc3.C10485b;
import p212oe.C117750b;
import p212oe.C117762j;
import vr2.C102236a0;

/* renamed from: jy.f2 */
public class C33723f2 extends IStaticListener<SnsNewSyncObjectEvent> {
    public boolean callback(IEvent iEvent) {
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        SnsNewSyncObjectEvent snsNewSyncObjectEvent = (SnsNewSyncObjectEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        C30414s1 Ix0 = C94866e1.Ix0();
        Ix0.getClass();
        Class cls2 = C10485b.class;
        SnsMethodCalculate.markStartTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        try {
            if (Ix0.mo57373a()) {
                Date date = new Date();
                int hours = (date.getHours() * 60) + date.getMinutes();
                if (C102236a0.m134752k(Ix0.f82030d, hours)) {
                    Log.m105925i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  %d in %s", Integer.valueOf(hours), Ix0.f82030d.toArray());
                    SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        int b = ((C10485b) C86709a0.m107533q(cls2)).vh0().mo107404b("SnsImgPreLoadingSmallImage", 1);
        int b2 = ((C10485b) C86709a0.m107533q(cls2)).vh0().mo107404b("SnsImgPreLoadingBigImage", 1);
        SnsMethodCalculate.markStartTimeMs("getSnsRedDotPreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_red_dot_preload, 1);
        C32163a.f85505k = Qe;
        SnsMethodCalculate.markEndTimeMs("getSnsRedDotPreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        SnsMethodCalculate.markStartTimeMs("getTimeLineOutPreloadInterval", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int i = 1200;
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_timeline_out_preload_interval, 1200);
        C32163a.f85502h = Qe2;
        SnsMethodCalculate.markEndTimeMs("getTimeLineOutPreloadInterval", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        Log.m105925i("MicroMsg.SnsPreTimelineService", " preloadingSamllImage %d preloadingBigImage %d preloadingVideo %d preloadingInterval %d", Integer.valueOf(b), Integer.valueOf(b2), Integer.valueOf(Qe), Integer.valueOf(Qe2));
        if (b > 0 || b2 > 0 || Qe > 0) {
            if (Qe2 > 0) {
                i = Qe2;
            }
            if (Ix0.f82028b || Ix0.f82029c || Util.secondsToNow(Ix0.f82027a) < ((long) i)) {
                Log.m105925i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  isInChatting:%b, isInSnsTimeline:%b", Boolean.valueOf(Ix0.f82028b), Boolean.valueOf(Ix0.f82029c));
                SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
                return false;
            }
            if (!C94916o0.m120461j1("@__weixintimtline")) {
                Log.m105924i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked: doing timeline");
                SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            } else if (!C117750b.m166053k(82) || !C117762j.f352167e) {
                C86709a0.m107528h();
                if (!C86709a0.m107529k().f251779b.mo123461g(new C94879h0(), 0)) {
                    Log.m105924i("MicroMsg.SnsPreTimelineService", "newObjectSync triggered");
                    C94916o0.m120462n1("@__weixintimtline");
                }
                Ix0.f82027a = Util.nowSecond();
                SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            } else {
                Log.m105924i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked: on doze mode");
                C117407d.INSTANCE.idkeyStat(1540, (long) 82, 1, false);
                SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        return false;
    }
}
