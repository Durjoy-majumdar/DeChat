package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.autogen.events.KvReportEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.AiSessionInfoStruct;
import com.tencent.p014mm.plugin.p316ai.service.AiService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.Scheduler;
import di3.C86312j;
import h81.C32735h;
import hh0.C20942f;
import ih0.C21092b;
import java.util.HashSet;
import jh0.C33573a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.SessionChangeTrigger */
public class SessionChangeTrigger implements C29082e {

    /* renamed from: a */
    public HashSet<String> f79634a = null;

    /* renamed from: b */
    public int f79635b = 0;

    /* renamed from: c */
    public long f79636c = 0;

    /* renamed from: d */
    public long f79637d = Scheduler.RE_SCHEDULER_APPEND_TIME;

    /* renamed from: e */
    public boolean f79638e = true;

    /* renamed from: f */
    public IListener<ExptChangeEvent> f79639f;

    /* renamed from: g */
    public IListener<KvReportEvent> f79640g;

    public SessionChangeTrigger() {
        C40008f fVar = C40008f.f107254d;
        this.f79639f = new IListener<ExptChangeEvent>(fVar) {
            {
                this.__eventId = -31521245;
            }

            public boolean callback(IEvent iEvent) {
                ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
                SessionChangeTrigger.this.mo56443d();
                return false;
            }
        };
        this.f79640g = new IListener<KvReportEvent>(fVar) {
            {
                this.__eventId = -624982229;
            }

            public boolean callback(IEvent iEvent) {
                HashSet<String> hashSet;
                KvReportEvent kvReportEvent = (KvReportEvent) iEvent;
                if (!MMApplicationContext.isMainProcess() || kvReportEvent == null || kvReportEvent.f78853d == null) {
                    return false;
                }
                SessionChangeTrigger sessionChangeTrigger = SessionChangeTrigger.this;
                if (sessionChangeTrigger.f79635b <= 0 || (hashSet = sessionChangeTrigger.f79634a) == null || hashSet.isEmpty() || kvReportEvent.f78853d.f78854a != 21948 || Util.milliSecondsToNow(SessionChangeTrigger.this.f79636c) <= SessionChangeTrigger.this.f79637d) {
                    return false;
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C29083g(this, kvReportEvent));
                return false;
            }
        };
        mo56443d();
    }

    /* renamed from: c */
    public static void m38545c(SessionChangeTrigger sessionChangeTrigger, String str) {
        HashSet<String> hashSet;
        boolean z;
        sessionChangeTrigger.getClass();
        long currentTicks = Util.currentTicks();
        if (sessionChangeTrigger.f79635b <= 0 || (hashSet = sessionChangeTrigger.f79634a) == null || hashSet.isEmpty()) {
            return;
        }
        if (((AiService) C86312j.m106911c(AiService.class)).i10()) {
            Log.m105926v("MicroMsg.LauncherUITrigger", "discover tab had red dot, ignore");
            return;
        }
        if (sessionChangeTrigger.f79638e) {
            if (C21092b.m23349i().mo32857k() >= C33573a.m40126b()) {
                if (C21092b.m23349i().mo32856j() >= C33573a.m40126b()) {
                    Log.m105924i("MicroMsg.LauncherUITrigger", "finder & finder live is dau, don't request");
                    return;
                }
            }
        }
        if (!Util.isNullOrNil(str)) {
            AiSessionInfoStruct aiSessionInfoStruct = new AiSessionInfoStruct(str);
            if (sessionChangeTrigger.f79634a.contains(aiSessionInfoStruct.f79111f)) {
                sessionChangeTrigger.f79636c = Util.nowMilliSecond();
                z = C20942f.yx0().Gx0(sessionChangeTrigger.f79635b);
            } else {
                z = false;
            }
            if (z) {
                C115669n.INSTANCE.mo175913w(1559, 160, 1);
            }
            Log.m105925i("MicroMsg.LauncherUITrigger", "handleSessionChange sync[%b] finderSyncScene[%d] nextSid [%s] lastHandleTimeMs[%d] cost[%d]", Boolean.valueOf(z), Integer.valueOf(sessionChangeTrigger.f79635b), aiSessionInfoStruct.f79111f, Long.valueOf(sessionChangeTrigger.f79636c), Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }

    /* renamed from: a */
    public void mo22060a() {
        this.f79639f.alive();
        this.f79640g.alive();
    }

    /* renamed from: b */
    public void mo22061b() {
        this.f79639f.dead();
        this.f79640g.dead();
    }

    /* renamed from: d */
    public final void mo56443d() {
        String[] split;
        Class cls = C32735h.class;
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_ai_launcherui_session, "");
        HashSet<String> hashSet = new HashSet<>();
        if (!Util.isNullOrNil(Y60) && (split = Y60.split(",")) != null && split.length > 0) {
            for (String add : split) {
                hashSet.add(add);
            }
        }
        this.f79634a = hashSet;
        this.f79635b = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_ai_launcherui_findersync, 0);
        this.f79637d = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_finder_ai_launcherui_findersync_freq, 300000);
        this.f79638e = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_finder_ai_launcherui_need_control_dau, true);
        Log.m105925i("MicroMsg.LauncherUITrigger", "resetControl handleSessionSet[%s] finderSyncScene[%d] handleFreqControlMs[%d] needControlDau[%b]", this.f79634a, Integer.valueOf(this.f79635b), Long.valueOf(this.f79637d), Boolean.valueOf(this.f79638e));
    }
}
