package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EnterFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.events.QuitFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.CalendarStatisticsStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FindFriendsEntryRedDotStruct;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C59774i;
import ht1.C60200t1;
import ih0.C21092b;
import ih0.C33329e;
import jh0.C33573a;
import kj2.C117407d;
import lh0.C34262g;
import lh0.C34270j;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.FindMoreFriendsUIReporter */
public class FindMoreFriendsUIReporter implements C29082e {

    /* renamed from: a */
    public String f49179a;

    /* renamed from: b */
    public String f49180b;

    /* renamed from: c */
    public IListener<QuitFindMoreFriendsUIEvent> f49181c;

    /* renamed from: d */
    public IListener<EnterFindMoreFriendsUIEvent> f49182d;

    public FindMoreFriendsUIReporter() {
        C40008f fVar = C40008f.f107254d;
        this.f49181c = new IListener<QuitFindMoreFriendsUIEvent>(fVar) {
            {
                this.__eventId = -971114274;
            }

            public boolean callback(IEvent iEvent) {
                QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent = (QuitFindMoreFriendsUIEvent) iEvent;
                try {
                    FindMoreFriendsUIReporter.m18226c(FindMoreFriendsUIReporter.this, quitFindMoreFriendsUIEvent);
                    FindMoreFriendsUIReporter.m18227d(FindMoreFriendsUIReporter.this, quitFindMoreFriendsUIEvent);
                    FindMoreFriendsUIReporter.this.getClass();
                    int i = Util.getInt(quitFindMoreFriendsUIEvent.f48110d.f48112b, -1);
                    if (i > -1) {
                        if (i < 255) {
                            C117407d.INSTANCE.idkeyStat(1437, (long) i, 1, false);
                            return false;
                        }
                    }
                    C117407d.INSTANCE.idkeyStat(1437, 255, 1, false);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        this.f49182d = new IListener<EnterFindMoreFriendsUIEvent>(fVar) {
            {
                this.__eventId = 281608775;
            }

            public boolean callback(IEvent iEvent) {
                EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent = (EnterFindMoreFriendsUIEvent) iEvent;
                try {
                    FindMoreFriendsUIReporter.this.f49179a = C21092b.m23349i().mo32859m("FinderEntrance");
                    FindMoreFriendsUIReporter.this.f49180b = C21092b.m23349i().mo32859m("FinderLiveEntrance");
                    FindMoreFriendsUIReporter findMoreFriendsUIReporter = FindMoreFriendsUIReporter.this;
                    Log.m105919d("MicroMsg.FindMoreFriendsUIReporter", "enter ui enterUIWithFinderJson[%s]  enterUIWithFinderLiveJson[%s]", findMoreFriendsUIReporter.f49179a, findMoreFriendsUIReporter.f49180b);
                    FindMoreFriendsUIReporter.m18228e(FindMoreFriendsUIReporter.this);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FindMoreFriendsUIReporter", e, "enter ui but finder reddot json error", new Object[0]);
                }
                return false;
            }
        };
    }

    /* renamed from: c */
    public static void m18226c(FindMoreFriendsUIReporter findMoreFriendsUIReporter, QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent) {
        findMoreFriendsUIReporter.getClass();
        int i = (Util.isEqual(quitFindMoreFriendsUIEvent.f48110d.f48112b, "143") || Util.isEqual(quitFindMoreFriendsUIEvent.f48110d.f48112b, "155")) ? 1 : 0;
        C34270j jVar = new C34270j();
        boolean isNullOrNil = true ^ Util.isNullOrNil(findMoreFriendsUIReporter.f49180b);
        long nowMilliSecond = Util.nowMilliSecond();
        jVar.field_ds = Util.getInt(C33573a.m40125a().format(Long.valueOf(nowMilliSecond)), -1);
        jVar.field_actionMs = nowMilliSecond;
        jVar.field_hour = C33573a.m40128d(nowMilliSecond);
        jVar.field_isGoToFinderUI = i;
        jVar.field_hadFinderRedDot = Util.isNullOrNil(findMoreFriendsUIReporter.f49179a) ^ true ? 1 : 0;
        jVar.field_hadFinderLiveRedDot = isNullOrNil ? 1 : 0;
        ((C119157j) C119157j.f356862d).mo183876g(new C29081b(findMoreFriendsUIReporter, jVar), "Ai_thread");
    }

    /* renamed from: d */
    public static void m18227d(FindMoreFriendsUIReporter findMoreFriendsUIReporter, QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent) {
        Class cls = C60200t1.class;
        findMoreFriendsUIReporter.getClass();
        long currentTicks = Util.currentTicks();
        int[] vx02 = C33329e.xx0().vx0();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(quitFindMoreFriendsUIEvent.f48110d.f48111a);
        stringBuffer.append(",");
        stringBuffer.append("2");
        stringBuffer.append(",");
        stringBuffer.append(quitFindMoreFriendsUIEvent.f48110d.f48112b);
        stringBuffer.append(",");
        stringBuffer.append(quitFindMoreFriendsUIEvent.f48110d.f48113c);
        stringBuffer.append(",");
        stringBuffer.append(quitFindMoreFriendsUIEvent.f48110d.f48114d);
        stringBuffer.append(",");
        QuitFindMoreFriendsUIEvent.C17686a aVar = quitFindMoreFriendsUIEvent.f48110d;
        stringBuffer.append(aVar.f48114d - aVar.f48113c);
        stringBuffer.append(",");
        int i = 0;
        while (true) {
            int i2 = 2;
            if (i >= 13) {
                break;
            }
            if (i != 12) {
                int i3 = vx02[i];
                if (i3 != 0) {
                    i2 = i3;
                }
                stringBuffer.append(i2);
                stringBuffer.append(",");
            } else if (((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83772S5()) {
                int i4 = vx02[i];
                if (i4 != 0) {
                    i2 = i4;
                }
                stringBuffer.append(i2);
                stringBuffer.append(",");
            } else {
                stringBuffer.append(-1);
                stringBuffer.append(",");
            }
            i++;
        }
        FindFriendsEntryRedDotStruct findFriendsEntryRedDotStruct = new FindFriendsEntryRedDotStruct(stringBuffer.toString());
        findFriendsEntryRedDotStruct.f48370w = findFriendsEntryRedDotStruct.mo86045b("Reserved1", "", true);
        findFriendsEntryRedDotStruct.f48371x = findFriendsEntryRedDotStruct.mo86045b("Reserved2", "", true);
        findFriendsEntryRedDotStruct.f48372y = findFriendsEntryRedDotStruct.mo86045b("Reserved3", "", true);
        WeChatTabRedDotEvent.C28853a aVar2 = C33329e.xx0().f90355f.get(2);
        findFriendsEntryRedDotStruct.f48373z = findFriendsEntryRedDotStruct.mo86045b("FindFriendsTab", aVar2 == null ? "" : String.format("{\"tabId\":%d;\"redDot\":%d;\"unread\":%d}", new Object[]{Integer.valueOf(aVar2.f79063a), Integer.valueOf(aVar2.f79064b ? 1 : 0), Integer.valueOf(aVar2.f79065c)}), true);
        String str = "1";
        if (Util.isEqual(str, findFriendsEntryRedDotStruct.f48368u) && Util.isNullOrNil(findMoreFriendsUIReporter.f49179a)) {
            findMoreFriendsUIReporter.f49179a = C21092b.m23349i().mo32859m("FinderEntrance");
        }
        if (Util.isEqual(str, findFriendsEntryRedDotStruct.f48369v) && Util.isNullOrNil(findMoreFriendsUIReporter.f49180b)) {
            findMoreFriendsUIReporter.f49180b = C21092b.m23349i().mo32859m("FinderLiveEntrance");
        }
        findFriendsEntryRedDotStruct.f48344A = findFriendsEntryRedDotStruct.mo86045b("FinderJson", findMoreFriendsUIReporter.f49179a, true);
        findFriendsEntryRedDotStruct.f48345B = findFriendsEntryRedDotStruct.mo86045b("FinderLiveJson", findMoreFriendsUIReporter.f49180b, true);
        findFriendsEntryRedDotStruct.f48346C = findFriendsEntryRedDotStruct.mo86045b("SessionId", ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb(), true);
        findFriendsEntryRedDotStruct.f48347D = findFriendsEntryRedDotStruct.mo86045b("IsShowFinderEntrance", C21092b.m23349i().mo32860n() ? str : "0", true);
        C21092b.m23349i().getClass();
        findFriendsEntryRedDotStruct.f48348E = findFriendsEntryRedDotStruct.mo86045b("IsShowFinderRedDot", ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77253Y5() ? str : "0", true);
        findFriendsEntryRedDotStruct.f48349F = findFriendsEntryRedDotStruct.mo86045b("IsShowFinderLiveEntrance", C21092b.m23349i().mo32861o() ? str : "0", true);
        C21092b.m23349i().getClass();
        if (!((C60200t1) C86312j.m106911c(cls)).Nt0().mo77235K5()) {
            str = "0";
        }
        findFriendsEntryRedDotStruct.f48350G = findFriendsEntryRedDotStruct.mo86045b("IsShowFinderLiveRedDot", str, true);
        findFriendsEntryRedDotStruct.mo86054n();
        findMoreFriendsUIReporter.f49180b = "";
        findMoreFriendsUIReporter.f49179a = "";
        Log.m105925i("MicroMsg.FindMoreFriendsUIReporter", "report find friend getSessionId[%s] IsShowFinderEntrance[%s] IsShowFinderLiveEntrance[%s]IsShowFinderRedDot[%s] IsShowFinderLiveRedDot[%s]", findFriendsEntryRedDotStruct.f48346C, findFriendsEntryRedDotStruct.f48347D, findFriendsEntryRedDotStruct.f48349F, findFriendsEntryRedDotStruct.f48348E, findFriendsEntryRedDotStruct.f48350G);
        Log.m105925i("MicroMsg.FindMoreFriendsUIReporter", "report find friend cost[%d] [%s]", Long.valueOf(Util.ticksToNow(currentTicks)), findFriendsEntryRedDotStruct.mo1006q());
    }

    /* renamed from: e */
    public static void m18228e(FindMoreFriendsUIReporter findMoreFriendsUIReporter) {
        findMoreFriendsUIReporter.getClass();
        long currentTicks = Util.currentTicks();
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        CalendarStatisticsStruct c = vx02.f92371i.mo33602c("calendar_statistics_discover");
        if (c.f48235e == 0) {
            long nowMilliSecond = Util.nowMilliSecond();
            c.f48235e = nowMilliSecond;
            c.mo86046c("firstExposeTimeMs", nowMilliSecond);
        }
        c.f48237g++;
        C34262g vx03 = C34262g.vx0();
        vx03.requireAccountInitialized();
        vx03.f92371i.mo33605f("calendar_statistics_discover", c);
        Log.m105925i("MicroMsg.FindMoreFriendsUIReporter", "noteFindMoreFriendsUIInfo struct[%s] cost[%d]", c.mo1005p(), Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: a */
    public void mo22060a() {
        this.f49181c.alive();
        this.f49182d.alive();
    }

    /* renamed from: b */
    public void mo22061b() {
        this.f49181c.dead();
        this.f49182d.dead();
    }
}
