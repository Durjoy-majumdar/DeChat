package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EnterFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.autogen.events.QuitFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.events.TabRedDotChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.CalendarStatisticsStruct;
import com.tencent.p014mm.plugin.p316ai.service.AiService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import h81.C32735h;
import hh0.C20942f;
import ht1.C60200t1;
import ih0.C21092b;
import java.util.HashSet;
import ky2.C10432i;
import lh0.C34262g;
import p749xh.C66277w3;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.NearLiveTrigger */
public class NearLiveTrigger implements C29082e {

    /* renamed from: a */
    public HashSet<String> f49206a = null;

    /* renamed from: b */
    public HashSet<String> f49207b = null;

    /* renamed from: c */
    public boolean f49208c = false;

    /* renamed from: d */
    public long f49209d = 0;

    /* renamed from: e */
    public long f49210e = 300000;

    /* renamed from: f */
    public IListener<QuitFindMoreFriendsUIEvent> f49211f;

    /* renamed from: g */
    public IListener<EnterFindMoreFriendsUIEvent> f49212g;

    /* renamed from: h */
    public IListener<TabRedDotChangeEvent> f49213h;

    /* renamed from: i */
    public IListener<ExptChangeEvent> f49214i;

    public NearLiveTrigger() {
        C40008f fVar = C40008f.f107254d;
        this.f49211f = new IListener<QuitFindMoreFriendsUIEvent>(fVar) {
            {
                this.__eventId = -971114274;
            }

            public boolean callback(IEvent iEvent) {
                QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent = (QuitFindMoreFriendsUIEvent) iEvent;
                try {
                    NearLiveTrigger.m18245c(NearLiveTrigger.this, quitFindMoreFriendsUIEvent);
                    NearLiveTrigger.m18246d(NearLiveTrigger.this, quitFindMoreFriendsUIEvent);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.NearLiveTrigger", e, "", new Object[0]);
                }
                return false;
            }
        };
        this.f49212g = new IListener<EnterFindMoreFriendsUIEvent>(fVar) {
            {
                this.__eventId = 281608775;
            }

            public boolean callback(IEvent iEvent) {
                EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent = (EnterFindMoreFriendsUIEvent) iEvent;
                try {
                    NearLiveTrigger.m18247e(NearLiveTrigger.this, enterFindMoreFriendsUIEvent);
                    NearLiveTrigger.m18248f(NearLiveTrigger.this, enterFindMoreFriendsUIEvent);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.NearLiveTrigger", e, "", new Object[0]);
                }
                return false;
            }
        };
        this.f49213h = new IListener<TabRedDotChangeEvent>(fVar) {
            {
                this.__eventId = -148697651;
            }

            public boolean callback(IEvent iEvent) {
                try {
                    TabRedDotChangeEvent.C28839a aVar = ((TabRedDotChangeEvent) iEvent).f79024d;
                    if (aVar.f79025a == 2) {
                        NearLiveTrigger.m18249g(NearLiveTrigger.this, aVar);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.NearLiveTrigger", e, "", new Object[0]);
                }
                return false;
            }
        };
        this.f49214i = new IListener<ExptChangeEvent>(fVar) {
            {
                this.__eventId = -31521245;
            }

            public boolean callback(IEvent iEvent) {
                ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
                NearLiveTrigger.this.mo22067j();
                return false;
            }
        };
        mo22067j();
    }

    /* renamed from: c */
    public static void m18245c(NearLiveTrigger nearLiveTrigger, QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent) {
        int i;
        nearLiveTrigger.getClass();
        Log.m105919d("MicroMsg.NearLiveTrigger", "quit notify live sync toSid [%s] quitControlMap[%s]", quitFindMoreFriendsUIEvent.f48110d.f48112b, nearLiveTrigger.f49206a);
        if (nearLiveTrigger.f49206a.contains(quitFindMoreFriendsUIEvent.f48110d.f48112b) && (i = Util.getInt(quitFindMoreFriendsUIEvent.f48110d.f48112b, -1)) > -1 && i < 255) {
            nearLiveTrigger.mo22065h(i);
            String.format("live quit find more friends ui [%d] ", new Object[]{Integer.valueOf(i)});
            C115669n.INSTANCE.mo175913w(1559, 210, 1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m18246d(com.tencent.p014mm.plugin.p316ai.data.business.trigger.NearLiveTrigger r12, com.tencent.p014mm.autogen.events.QuitFindMoreFriendsUIEvent r13) {
        /*
            r12.getClass()
            java.lang.Class<ht1.t1> r12 = ht1.C60200t1.class
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent$a r2 = r13.f48110d
            java.lang.String r2 = r2.f48112b
            java.lang.String r3 = "152"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00df
            com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent$a r13 = r13.f48110d
            java.lang.String r13 = r13.f48112b
            java.lang.String r2 = "150"
            boolean r13 = r2.equals(r13)
            if (r13 == 0) goto L_0x0023
            goto L_0x00df
        L_0x0023:
            r13 = 0
            di3.d r2 = di3.C86312j.m106911c(r12)
            ht1.t1 r2 = (ht1.C60200t1) r2
            ht1.b4 r2 = r2.Nt0()
            java.lang.String r3 = "FinderLiveEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r2.mo77227G5(r3)
            if (r2 != 0) goto L_0x0046
            di3.d r12 = di3.C86312j.m106911c(r12)
            ht1.t1 r12 = (ht1.C60200t1) r12
            ht1.b4 r12 = r12.Nt0()
            java.lang.String r2 = "NearbyEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r12.mo77227G5(r2)
        L_0x0046:
            if (r2 == 0) goto L_0x0079
            lh0.g r12 = lh0.C34262g.vx0()
            r12.requireAccountInitialized()
            lh0.e r12 = r12.f92370h
            java.lang.String r13 = r2.field_tipsId
            lh0.b r13 = r12.mo59525Yt(r13)
            if (r13 == 0) goto L_0x0079
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r13.field_enterBusinessMs = r3
            lh0.g r12 = lh0.C34262g.vx0()
            r12.requireAccountInitialized()
            lh0.e r12 = r12.f92370h
            r12.getClass()
            zt3.t r3 = zt3.C119157j.f356862d
            lh0.d r4 = new lh0.d
            r4.<init>(r12, r13)
            zt3.j r3 = (zt3.C119157j) r3
            java.lang.String r12 = "Ai_thread"
            r3.mo183876g(r4, r12)
        L_0x0079:
            r12 = 1
            r3 = 0
            if (r2 == 0) goto L_0x007f
            r2 = 1
            goto L_0x0080
        L_0x007f:
            r2 = 0
        L_0x0080:
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            lh0.g r6 = lh0.C34262g.vx0()
            r6.requireAccountInitialized()
            lh0.f r6 = r6.f92371i
            java.lang.String r7 = "calendar_statistics_live"
            com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct r6 = r6.mo33602c(r7)
            long r8 = r6.f48241k
            r10 = 1
            long r8 = r8 + r10
            r6.f48241k = r8
            if (r2 == 0) goto L_0x00a1
            long r8 = r6.f48242l
            long r8 = r8 + r10
            r6.f48242l = r8
        L_0x00a1:
            lh0.g r2 = lh0.C34262g.vx0()
            r2.requireAccountInitialized()
            lh0.f r2 = r2.f92371i
            r2.mo33605f(r7, r6)
            r2 = 2
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r6 = r6.mo1006q()
            r7[r3] = r6
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r7[r12] = r4
            java.lang.String r4 = "MicroMsg.NearLiveTrigger"
            java.lang.String r5 = "noteEnterLive info[%s] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r7)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2[r3] = r0
            if (r13 == 0) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            java.lang.String r13 = "null"
        L_0x00d8:
            r2[r12] = r13
            java.lang.String r12 = "check if enter finder cost[%d] info[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r2)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p316ai.data.business.trigger.NearLiveTrigger.m18246d(com.tencent.mm.plugin.ai.data.business.trigger.NearLiveTrigger, com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent):void");
    }

    /* renamed from: e */
    public static void m18247e(NearLiveTrigger nearLiveTrigger, EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent) {
        int i;
        nearLiveTrigger.getClass();
        Log.m105919d("MicroMsg.NearLiveTrigger", "enter notify live sync fromSid [%s] enterControlMap[%s]", enterFindMoreFriendsUIEvent.f48084d.f48085a, nearLiveTrigger.f49206a);
        if (nearLiveTrigger.f49207b.contains(enterFindMoreFriendsUIEvent.f48084d.f48085a) && (i = Util.getInt(enterFindMoreFriendsUIEvent.f48084d.f48085a, -1)) > -1 && i < 255) {
            nearLiveTrigger.mo22065h(i);
            String.format("live enter find more friends ui [%d] ", new Object[]{Integer.valueOf(i)});
            C115669n.INSTANCE.mo175913w(1559, 211, 1);
        }
    }

    /* renamed from: f */
    public static void m18248f(NearLiveTrigger nearLiveTrigger, EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent) {
        nearLiveTrigger.getClass();
        long currentTicks = Util.currentTicks();
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        CalendarStatisticsStruct c = vx02.f92371i.mo33602c("calendar_statistics_live");
        C66277w3 c2 = C21092b.m23349i().mo32850c();
        if (c2 != null) {
            if (!Util.isEqual(c2.field_tipsId, c.f48239i)) {
                c.f48239i = c.mo86045b("lastTipsId", c2.field_tipsId, true);
                c.f48240j++;
            }
            if (C21092b.m23349i().mo32851d(c2) != null) {
                c.f48237g++;
                if (c.f48235e == 0) {
                    long nowMilliSecond = Util.nowMilliSecond();
                    c.f48235e = nowMilliSecond;
                    c.mo86046c("firstExposeTimeMs", nowMilliSecond);
                    c.f48236f = (long) c2.field_ctrInfo.f144670e;
                }
            }
        }
        if (enterFindMoreFriendsUIEvent != null && (enterFindMoreFriendsUIEvent.f48084d.f48085a.equals("152") || enterFindMoreFriendsUIEvent.f48084d.f48085a.equals("150"))) {
            long j = c.f48238h + (enterFindMoreFriendsUIEvent.f48084d.f48086b / 1000);
            c.f48238h = j;
            c.mo86047d("totalStayTimeSec", j);
        }
        C34262g vx03 = C34262g.vx0();
        vx03.requireAccountInitialized();
        vx03.f92371i.mo33605f("calendar_statistics_live", c);
        Log.m105925i("MicroMsg.NearLiveTrigger", "noteLiveRedDotExposeInfo info[%s] cost[%d]", c.mo1006q(), Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: g */
    public static void m18249g(NearLiveTrigger nearLiveTrigger, TabRedDotChangeEvent.C28839a aVar) {
        if (nearLiveTrigger.f49208c) {
            Log.m105925i("MicroMsg.NearLiveTrigger", "tabRedDotChangeToNotifyLiveSync [%b %d] [%b %d]", Boolean.valueOf(aVar.f79026b), Integer.valueOf(aVar.f79027c), Boolean.valueOf(aVar.f79028d), Integer.valueOf(aVar.f79029e));
            boolean z = aVar.f79026b;
            int i = 249;
            if ((z || !aVar.f79028d) && ((z || aVar.f79027c != 0 || aVar.f79029e <= 0) && aVar.f79027c == aVar.f79029e)) {
                i = 0;
            }
            if (i > 0) {
                nearLiveTrigger.mo22065h(i);
                String.format("live tab red dot change [%d] ", new Object[]{Integer.valueOf(i)});
                C115669n.INSTANCE.mo175913w(1559, 212, 1);
            }
        }
    }

    /* renamed from: a */
    public void mo22060a() {
        this.f49211f.alive();
        this.f49212g.alive();
        this.f49213h.alive();
        this.f49214i.alive();
    }

    /* renamed from: b */
    public void mo22061b() {
        this.f49211f.dead();
        this.f49212g.dead();
        this.f49213h.dead();
        this.f49214i.dead();
    }

    /* renamed from: h */
    public final void mo22065h(int i) {
        ((AiService) C86312j.m106911c(AiService.class)).getClass();
        boolean z = !((70368744177664L & C75592q0.m90781k()) != 0);
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        boolean G5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83760G5();
        Log.m105925i("MicroMsg.AiService", "[isShowLiveEntrance] openNearbyLiveFriends:%s isEnable:%s, isTeenMode:%s", Boolean.valueOf(z), Boolean.valueOf(G5), Boolean.valueOf(e));
        if (!(G5 && z && !e)) {
            Log.m105926v("MicroMsg.NearLiveTrigger", "live is closed, don't request");
            C115669n.INSTANCE.mo175913w(1559, 214, 1);
        } else if (Util.milliSecondsToNow(this.f49209d) <= this.f49210e) {
            Log.m105927v("MicroMsg.NearLiveTrigger", "live syn freq control lastFinderSyncMs[%d] finderSyncFreqControl[%d]", Long.valueOf(this.f49209d), Long.valueOf(this.f49210e));
            C115669n.INSTANCE.mo175913w(1559, 213, 1);
        } else {
            this.f49209d = Util.nowMilliSecond();
            int i2 = i + 20000;
            C20942f.yx0().Gx0(i2);
            Log.printInfoStack("MicroMsg.NearLiveTrigger", "pure notify live sync scene[%d]", Integer.valueOf(i2));
        }
    }

    /* renamed from: i */
    public final HashSet<String> mo22066i(String str) {
        String[] split;
        HashSet<String> hashSet = new HashSet<>();
        if (!Util.isNullOrNil(str) && (split = str.split(",")) != null && split.length > 0) {
            for (String add : split) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    /* renamed from: j */
    public final void mo22067j() {
        Class cls = C32735h.class;
        this.f49206a = mo22066i(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_live_ai_quit_scene, ""));
        this.f49207b = mo22066i(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_live_ai_enter_scene, ""));
        this.f49208c = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_live_ai_tab_reddot, false);
        this.f49210e = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_ai_sync_freq, 300000);
        Log.m105925i("MicroMsg.NearLiveTrigger", "reset control tabRedDotControl[%b] quitControlMap[%s] enterControlMap[%s] finderSyncFreqControl[%d]", Boolean.valueOf(this.f49208c), this.f49206a, this.f49207b, Long.valueOf(this.f49210e));
    }
}
