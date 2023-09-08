package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EnterFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.autogen.events.KvReportEvent;
import com.tencent.p014mm.autogen.events.QuitFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.events.TabRedDotChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.CalendarStatisticsStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.KvEnterSessionStruct;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.p316ai.service.AiService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import h81.C32735h;
import hh0.C20942f;
import ht1.C60200t1;
import ih0.C21092b;
import ih0.C21093g;
import ih0.C21095o;
import java.util.HashSet;
import lh0.C21436f;
import lh0.C34262g;
import p749xh.C66277w3;
import te3.C64586nn1;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.FinderTrigger */
public class FinderTrigger implements C29082e {

    /* renamed from: a */
    public HashSet<String> f49185a = null;

    /* renamed from: b */
    public HashSet<String> f49186b = null;

    /* renamed from: c */
    public boolean f49187c = false;

    /* renamed from: d */
    public long f49188d = 0;

    /* renamed from: e */
    public long f49189e = 300000;

    /* renamed from: f */
    public long f49190f = 0;

    /* renamed from: g */
    public long f49191g = 0;

    /* renamed from: h */
    public boolean f49192h = false;

    /* renamed from: i */
    public long f49193i = 2000;

    /* renamed from: j */
    public long f49194j = 60000;

    /* renamed from: k */
    public int f49195k = 1;

    /* renamed from: l */
    public IListener<QuitFindMoreFriendsUIEvent> f49196l;

    /* renamed from: m */
    public IListener<EnterFindMoreFriendsUIEvent> f49197m;

    /* renamed from: n */
    public IListener<TabRedDotChangeEvent> f49198n;

    /* renamed from: o */
    public IListener<KvReportEvent> f49199o;

    /* renamed from: p */
    public IListener<ExptChangeEvent> f49200p;

    public FinderTrigger() {
        C40008f fVar = C40008f.f107254d;
        this.f49196l = new IListener<QuitFindMoreFriendsUIEvent>(fVar) {
            {
                this.__eventId = -971114274;
            }

            public boolean callback(IEvent iEvent) {
                QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent = (QuitFindMoreFriendsUIEvent) iEvent;
                try {
                    FinderTrigger.m18231c(FinderTrigger.this, quitFindMoreFriendsUIEvent);
                    FinderTrigger.m18232d(FinderTrigger.this, quitFindMoreFriendsUIEvent);
                    FinderTrigger.m18233e(FinderTrigger.this, quitFindMoreFriendsUIEvent);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FinderTrigger", e, "", new Object[0]);
                }
                return false;
            }
        };
        this.f49197m = new IListener<EnterFindMoreFriendsUIEvent>(fVar) {
            {
                this.__eventId = 281608775;
            }

            public boolean callback(IEvent iEvent) {
                EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent = (EnterFindMoreFriendsUIEvent) iEvent;
                try {
                    FinderTrigger.m18234f(FinderTrigger.this, enterFindMoreFriendsUIEvent);
                    FinderTrigger.m18235g(FinderTrigger.this);
                    FinderTrigger.m18236h(FinderTrigger.this, enterFindMoreFriendsUIEvent);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FinderTrigger", e, "", new Object[0]);
                }
                return false;
            }
        };
        this.f49198n = new IListener<TabRedDotChangeEvent>(fVar) {
            {
                this.__eventId = -148697651;
            }

            public boolean callback(IEvent iEvent) {
                try {
                    TabRedDotChangeEvent.C28839a aVar = ((TabRedDotChangeEvent) iEvent).f79024d;
                    if (aVar.f79025a == 2) {
                        FinderTrigger.m18237i(FinderTrigger.this, aVar);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FinderTrigger", e, "", new Object[0]);
                }
                return false;
            }
        };
        this.f49199o = new IListener<KvReportEvent>(fVar) {
            {
                this.__eventId = -624982229;
            }

            public boolean callback(IEvent iEvent) {
                KvReportEvent.C28769a aVar;
                KvReportEvent kvReportEvent = (KvReportEvent) iEvent;
                if (kvReportEvent == null || (aVar = kvReportEvent.f78853d) == null) {
                    return false;
                }
                if (aVar.f78854a == 19943) {
                    ((C119157j) C119157j.f356862d).mo183876g(new C17854c(this, kvReportEvent), "Ai_thread");
                }
                if (kvReportEvent.f78853d.f78854a != 18054) {
                    return false;
                }
                ((C119157j) C119157j.f356862d).mo183876g(new C17855d(this, kvReportEvent), "Ai_thread");
                return false;
            }
        };
        this.f49200p = new IListener<ExptChangeEvent>(fVar) {
            {
                this.__eventId = -31521245;
            }

            public boolean callback(IEvent iEvent) {
                ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
                FinderTrigger.this.mo22064n();
                return false;
            }
        };
        mo22064n();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m18231c(com.tencent.p014mm.plugin.p316ai.data.business.trigger.FinderTrigger r24, com.tencent.p014mm.autogen.events.QuitFindMoreFriendsUIEvent r25) {
        /*
            r0 = r24
            r24.getClass()
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r3 = r25
            com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent$a r3 = r3.f48110d
            java.lang.String r3 = r3.f48112b
            java.lang.String r4 = "143"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0019
            goto L_0x0115
        L_0x0019:
            r3 = 0
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.t1 r4 = (ht1.C60200t1) r4
            ht1.b4 r4 = r4.Nt0()
            java.lang.String r5 = "FinderEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = r4.mo77227G5(r5)
            if (r4 == 0) goto L_0x0099
            lh0.g r3 = lh0.C34262g.vx0()
            r3.requireAccountInitialized()
            lh0.e r3 = r3.f92370h
            java.lang.String r5 = r4.field_tipsId
            lh0.b r3 = r3.mo59525Yt(r5)
            if (r3 == 0) goto L_0x0079
            ih0.b r5 = ih0.C21092b.m23349i()
            te3.nn1 r5 = r5.mo32854g(r4)
            if (r5 == 0) goto L_0x0059
            te3.yw r5 = r5.f184512q
            if (r5 == 0) goto L_0x0059
            int r6 = r5.f186604d
            r3.field_exposeCount = r6
            long r6 = r5.f186606f
            r3.field_exposeFirstMs = r6
            long r5 = r5.f186608h
            r3.field_exposeLastMs = r5
        L_0x0059:
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r3.field_enterBusinessMs = r5
            lh0.g r5 = lh0.C34262g.vx0()
            r5.requireAccountInitialized()
            lh0.e r5 = r5.f92370h
            r5.getClass()
            zt3.t r6 = zt3.C119157j.f356862d
            lh0.d r7 = new lh0.d
            r7.<init>(r5, r3)
            zt3.j r6 = (zt3.C119157j) r6
            java.lang.String r5 = "Ai_thread"
            r6.mo183876g(r7, r5)
        L_0x0079:
            long r5 = r4.field_aiScene
            r7 = 10000(0x2710, double:4.9407E-320)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x008d
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1559(0x617, double:7.702E-321)
            r13 = 243(0xf3, double:1.2E-321)
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            goto L_0x00a4
        L_0x008d:
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 1559(0x617, double:7.702E-321)
            r20 = 242(0xf2, double:1.196E-321)
            r22 = 1
            r17.mo175913w(r18, r20, r22)
            goto L_0x00a4
        L_0x0099:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1559(0x617, double:7.702E-321)
            r8 = 241(0xf1, double:1.19E-321)
            r10 = 1
            r5.mo175913w(r6, r8, r10)
        L_0x00a4:
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x00aa
            r4 = 1
            goto L_0x00ab
        L_0x00aa:
            r4 = 0
        L_0x00ab:
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            lh0.g r9 = lh0.C34262g.vx0()
            r9.requireAccountInitialized()
            lh0.f r9 = r9.f92371i
            java.lang.String r10 = "calendar_statistics_finder"
            com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct r9 = r9.mo33602c(r10)
            long r11 = r9.f48241k
            r13 = 1
            long r11 = r11 + r13
            r9.f48241k = r11
            if (r4 == 0) goto L_0x00cc
            long r11 = r9.f48242l
            long r11 = r11 + r13
            r9.f48242l = r11
        L_0x00cc:
            lh0.g r11 = lh0.C34262g.vx0()
            r11.requireAccountInitialized()
            lh0.f r11 = r11.f92371i
            r11.mo33605f(r10, r9)
            r0.f49192h = r4
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r9 = r9.mo1006q()
            r4[r6] = r9
            boolean r0 = r0.f49192h
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4[r5] = r0
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r7 = 2
            r4[r7] = r0
            java.lang.String r0 = "MicroMsg.FinderTrigger"
            java.lang.String r8 = "noteEnterFinder info[%s] isEnterFinderWithRedDot[%b] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r4)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4[r6] = r1
            if (r3 == 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            java.lang.String r3 = "null"
        L_0x010e:
            r4[r5] = r3
            java.lang.String r1 = "check if enter finder cost[%d] info[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r4)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p316ai.data.business.trigger.FinderTrigger.m18231c(com.tencent.mm.plugin.ai.data.business.trigger.FinderTrigger, com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent):void");
    }

    /* renamed from: d */
    public static void m18232d(FinderTrigger finderTrigger, QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent) {
        finderTrigger.getClass();
        Class cls = C60200t1.class;
        KvEnterSessionStruct kvEnterSessionStruct = new KvEnterSessionStruct();
        kvEnterSessionStruct.f48530d = kvEnterSessionStruct.mo86045b("Sessionid", quitFindMoreFriendsUIEvent.f48110d.f48112b, true);
        long j = quitFindMoreFriendsUIEvent.f48110d.f48114d;
        kvEnterSessionStruct.f48531e = j;
        kvEnterSessionStruct.mo86048e("EnterTimeStampMs", j);
        C64586nn1 R5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderEntrance");
        C55718s0 G5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderEntrance");
        if (G5 != null) {
            kvEnterSessionStruct.f48534h = kvEnterSessionStruct.mo86045b("RedDotTipsID", G5.field_tipsId, true);
            kvEnterSessionStruct.f48532f = (long) G5.field_ctrInfo.f144670e;
            kvEnterSessionStruct.f48535i = G5.field_aiScene;
        }
        if (R5 != null) {
            kvEnterSessionStruct.f48533g = (long) R5.f184502d;
        }
        kvEnterSessionStruct.mo86054n();
        Log.m105925i("MicroMsg.FinderTrigger", "reportFinderRedDotInfo [%s]", kvEnterSessionStruct.mo1006q());
    }

    /* renamed from: e */
    public static void m18233e(FinderTrigger finderTrigger, QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent) {
        int i;
        finderTrigger.getClass();
        Log.m105919d("MicroMsg.FinderTrigger", "quit notify live sync toSid [%s] quitControlMap[%s]", quitFindMoreFriendsUIEvent.f48110d.f48112b, finderTrigger.f49185a);
        if (finderTrigger.f49185a.contains(quitFindMoreFriendsUIEvent.f48110d.f48112b) && (i = Util.getInt(quitFindMoreFriendsUIEvent.f48110d.f48112b, -1)) > -1 && i < 255) {
            finderTrigger.mo22062l(i);
            String.format("finder quit find more friends ui [%d] ", new Object[]{Integer.valueOf(i)});
            C115669n.INSTANCE.mo175913w(1559, 200, 1);
        }
    }

    /* renamed from: f */
    public static void m18234f(FinderTrigger finderTrigger, EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent) {
        int i;
        finderTrigger.getClass();
        Log.m105919d("MicroMsg.FinderTrigger", "enter notify live sync fromSid [%s] enterControlMap[%s]", enterFindMoreFriendsUIEvent.f48084d.f48085a, finderTrigger.f49186b);
        if (finderTrigger.f49186b.contains(enterFindMoreFriendsUIEvent.f48084d.f48085a) && (i = Util.getInt(enterFindMoreFriendsUIEvent.f48084d.f48085a, -1)) > -1 && i < 255) {
            finderTrigger.mo22062l(i);
            String.format("finder enter find more friends ui [%d] ", new Object[]{Integer.valueOf(i)});
            C115669n.INSTANCE.mo175913w(1559, 201, 1);
        }
    }

    /* renamed from: g */
    public static void m18235g(FinderTrigger finderTrigger) {
        FinderTrigger finderTrigger2 = finderTrigger;
        if (finderTrigger2.f49190f > 0) {
            long max = Math.max(C21092b.m23349i().mo32858l(), finderTrigger2.f49191g);
            long c = C31543z5.m39453c();
            boolean z = c - max > finderTrigger2.f49190f * 3600000;
            if (z) {
                finderTrigger2.f49191g = c;
                finderTrigger2.mo22062l(13000);
                C115669n.INSTANCE.mo175913w(1559, 99, 1);
            }
            Log.m105925i("MicroMsg.FinderTrigger", "check last get reddot sync[%b] time[%d %d]", Boolean.valueOf(z), Long.valueOf(c), Long.valueOf(max));
        }
    }

    /* renamed from: h */
    public static void m18236h(FinderTrigger finderTrigger, EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent) {
        finderTrigger.getClass();
        long currentTicks = Util.currentTicks();
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        CalendarStatisticsStruct c = vx02.f92371i.mo33602c("calendar_statistics_finder");
        C66277w3 f = C21092b.m23349i().mo32853f();
        if (f != null) {
            if (!Util.isEqual(f.field_tipsId, c.f48239i)) {
                c.f48239i = c.mo86045b("lastTipsId", f.field_tipsId, true);
                c.f48240j++;
            }
            if (C21092b.m23349i().mo32854g(f) != null) {
                c.f48237g++;
                if (c.f48235e == 0) {
                    long nowMilliSecond = Util.nowMilliSecond();
                    c.f48235e = nowMilliSecond;
                    c.mo86046c("firstExposeTimeMs", nowMilliSecond);
                    c.f48236f = (long) f.field_ctrInfo.f144670e;
                }
            }
        }
        C34262g vx03 = C34262g.vx0();
        vx03.requireAccountInitialized();
        vx03.f92371i.mo33605f("calendar_statistics_finder", c);
        Log.m105925i("MicroMsg.FinderTrigger", "noteFinderRedDotExposeInfo info[%s] cost[%d]", c.mo1006q(), Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: i */
    public static void m18237i(FinderTrigger finderTrigger, TabRedDotChangeEvent.C28839a aVar) {
        if (finderTrigger.f49187c) {
            Log.m105925i("MicroMsg.FinderTrigger", "tabRedDotChangeToNotifyFinderSync [%b %d] [%b %d]", Boolean.valueOf(aVar.f79026b), Integer.valueOf(aVar.f79027c), Boolean.valueOf(aVar.f79028d), Integer.valueOf(aVar.f79029e));
            boolean z = aVar.f79026b;
            int i = 249;
            if ((z || !aVar.f79028d) && ((z || aVar.f79027c != 0 || aVar.f79029e <= 0) && aVar.f79027c == aVar.f79029e)) {
                i = 0;
            }
            if (i > 0) {
                finderTrigger.mo22062l(i);
                String.format("finder tab red dot change [%d] ", new Object[]{Integer.valueOf(i)});
                C115669n.INSTANCE.mo175913w(1559, 202, 1);
            }
        }
    }

    /* renamed from: j */
    public static void m18238j(FinderTrigger finderTrigger, String str) {
        String[] split;
        int i;
        int i2;
        FinderTrigger finderTrigger2 = finderTrigger;
        finderTrigger.getClass();
        if (!Util.isNullOrNil(str) && (split = str.split(",")) != null && split.length >= 5) {
            String str2 = split[1];
            String str3 = split[6];
            if ("All".equals(str2)) {
                long j = Util.getLong(split[3], 0) / 1000;
                long j2 = Util.getLong(split[4], 0) / 1000;
                long currentTicks = Util.currentTicks();
                long j3 = j2 - j;
                C34262g vx02 = C34262g.vx0();
                vx02.requireAccountInitialized();
                vx02.f92371i.mo33604e("last_enter_finder_time", j);
                C34262g vx03 = C34262g.vx0();
                vx03.requireAccountInitialized();
                vx03.f92371i.mo33604e("last_exit_finder_time", j2);
                C34262g vx04 = C34262g.vx0();
                vx04.requireAccountInitialized();
                CalendarStatisticsStruct c = vx04.f92371i.mo33602c("calendar_statistics_finder");
                long j4 = c.f48238h + j3;
                c.f48238h = j4;
                c.mo86047d("totalStayTimeSec", j4);
                c.f48245o = c.mo86045b("stayTimeSecList", j3 + "#" + c.f48245o, true);
                c.f48246p = c.mo86045b("vvCountList", finderTrigger2.f49195k + "#" + c.f48246p, true);
                C34262g vx05 = C34262g.vx0();
                vx05.requireAccountInitialized();
                vx05.f92371i.mo33605f("calendar_statistics_finder", c);
                C34262g vx06 = C34262g.vx0();
                vx06.requireAccountInitialized();
                C21436f fVar = vx06.f92371i;
                int i3 = finderTrigger2.f49195k;
                MultiProcessMMKV b = fVar.mo33601b();
                if (b != null) {
                    b.putInt("last_finder_vv", i3);
                }
                finderTrigger2.f49195k = 1;
                Log.m105919d("MicroMsg.FinderTrigger", "saveFinderInfoWhenQuit info[%s] cost[%d]", c.mo1006q(), Long.valueOf(Util.ticksToNow(currentTicks)));
            }
            if ("143".equals(str3) && "All".equals(str2) && finderTrigger2.f49192h) {
                C34262g vx07 = C34262g.vx0();
                vx07.requireAccountInitialized();
                CalendarStatisticsStruct c2 = vx07.f92371i.mo33602c("calendar_statistics_finder");
                int b2 = C21092b.m23349i().mo32849b();
                int a = C21092b.m23349i().mo32848a();
                long j5 = Util.getLong(split[2], 0);
                if (j5 <= finderTrigger2.f49193i) {
                    c2.f48243m++;
                    i = b2 + 1;
                    i2 = 0;
                } else if (j5 >= finderTrigger2.f49194j) {
                    c2.f48244n++;
                    i2 = a + 1;
                    i = 0;
                } else {
                    return;
                }
                C21092b.m23349i().getClass();
                C34262g vx08 = C34262g.vx0();
                vx08.requireAccountInitialized();
                MultiProcessMMKV b3 = vx08.f92371i.mo33601b();
                if (b3 != null) {
                    b3.putInt("finder_deep_read_count", i2);
                }
                C21092b.m23349i().getClass();
                C34262g vx09 = C34262g.vx0();
                vx09.requireAccountInitialized();
                MultiProcessMMKV b4 = vx09.f92371i.mo33601b();
                if (b4 != null) {
                    b4.putInt("finder_drop_reddot_count", i);
                }
                C34262g vx010 = C34262g.vx0();
                vx010.requireAccountInitialized();
                vx010.f92371i.mo33605f("calendar_statistics_finder", c2);
                Log.m105919d("MicroMsg.FinderTrigger", "finder 19943 finderDropRedDotCount[%d]  finderDeepReadCount[%d] curFinderStayTimeMs[%d]", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j5));
            }
        }
    }

    /* renamed from: k */
    public static void m18239k(FinderTrigger finderTrigger, String str) {
        String[] split;
        int i;
        finderTrigger.getClass();
        C21095o oVar = ((C21093g) C86312j.m106911c(C21093g.class)).f59648e;
        int i2 = -1;
        if (oVar != null) {
            i2 = Util.getInt(oVar.f59651a, -1);
        }
        if ((i2 == 143 || i2 == 155) && !Util.isNullOrNil(str) && (split = str.split(",")) != null && split.length > 7 && 17 == (i = Util.getInt(split[2], 0))) {
            finderTrigger.f49195k++;
            Log.m105927v("MicroMsg.FinderTrigger", "finder 18054 [%s] [%s] [%d] finderVvCount[%d]", Integer.valueOf(i2), split[0], Integer.valueOf(i), Integer.valueOf(finderTrigger.f49195k));
        }
    }

    /* renamed from: a */
    public void mo22060a() {
        this.f49196l.alive();
        this.f49197m.alive();
        this.f49198n.alive();
        this.f49200p.alive();
        this.f49199o.alive();
    }

    /* renamed from: b */
    public void mo22061b() {
        this.f49196l.dead();
        this.f49197m.dead();
        this.f49198n.dead();
        this.f49200p.dead();
        this.f49199o.dead();
    }

    /* renamed from: l */
    public final void mo22062l(int i) {
        if (!((AiService) C86312j.m106911c(AiService.class)).k90()) {
            Log.m105926v("MicroMsg.FinderTrigger", "finder is closed, don't request");
            C115669n.INSTANCE.mo175913w(1559, 204, 1);
        } else if (Util.milliSecondsToNow(this.f49188d) <= this.f49189e) {
            Log.m105927v("MicroMsg.FinderTrigger", "finder syn freq control lastFinderSyncMs[%d] finderSyncFreqControl[%d]", Long.valueOf(this.f49188d), Long.valueOf(this.f49189e));
            C115669n.INSTANCE.mo175913w(1559, 203, 1);
        } else {
            this.f49188d = Util.nowMilliSecond();
            int i2 = i + 10000;
            C20942f.yx0().Gx0(i2);
            Log.printInfoStack("MicroMsg.FinderTrigger", "pure notify finder sync finderSync[%d]", Integer.valueOf(i2));
        }
    }

    /* renamed from: m */
    public final HashSet<String> mo22063m(String str) {
        String[] split;
        HashSet<String> hashSet = new HashSet<>();
        if (!Util.isNullOrNil(str) && (split = str.split(",")) != null && split.length > 0) {
            for (String add : split) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    /* renamed from: n */
    public final void mo22064n() {
        Class cls = C32735h.class;
        this.f49185a = mo22063m(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_ai_quit_scene, ""));
        this.f49186b = mo22063m(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_ai_enter_scene, ""));
        this.f49187c = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_finder_ai_tab_reddot, false);
        this.f49189e = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_finder_ai_sync_freq, 300000);
        this.f49190f = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_finder_ai_send_hour_gap, 0);
        this.f49191g = 0;
        this.f49193i = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32738b.clicfg_finder_ai_drop_reddot_time, 2000);
        this.f49194j = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32738b.clicfg_finder_ai_deep_read_time, 60000);
        Log.m105925i("MicroMsg.FinderTrigger", "reset control tabRedDotControl[%b] quitControlMap[%s] enterControlMap[%s] finderSyncFreqControl[%d] lastFinderSendHourGap[%d]", Boolean.valueOf(this.f49187c), this.f49185a, this.f49186b, Long.valueOf(this.f49189e), Long.valueOf(this.f49190f));
    }
}
