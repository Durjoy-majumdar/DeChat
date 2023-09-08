package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EnterFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.events.QuitFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderReddotExposeStrategyStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.api.TPOptionalID;
import di3.C86312j;
import eb0.C31543z5;
import te3.C49712hj1;
import te3.C64586nn1;
import te3.C64867yw;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotTrigger */
public class FinderRedDotTrigger {

    /* renamed from: a */
    public FinderReddotExposeStrategyStruct f158562a = new FinderReddotExposeStrategyStruct();

    /* renamed from: b */
    public IListener<EnterFindMoreFriendsUIEvent> f158563b;

    /* renamed from: c */
    public IListener<QuitFindMoreFriendsUIEvent> f158564c;

    public FinderRedDotTrigger() {
        C40008f fVar = C40008f.f107254d;
        this.f158563b = new IListener<EnterFindMoreFriendsUIEvent>(fVar) {
            {
                this.__eventId = 281608775;
            }

            public boolean callback(IEvent iEvent) {
                EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent = (EnterFindMoreFriendsUIEvent) iEvent;
                long currentTicks = Util.currentTicks();
                if (!(enterFindMoreFriendsUIEvent == null || enterFindMoreFriendsUIEvent.f48084d == null)) {
                    try {
                        FinderRedDotTrigger.m63383a(FinderRedDotTrigger.this, "FinderEntrance");
                        FinderRedDotTrigger.m63383a(FinderRedDotTrigger.this, "NearbyEntrance");
                        FinderRedDotTrigger.m63383a(FinderRedDotTrigger.this, "FinderLiveEntrance");
                        FinderRedDotTrigger.m63383a(FinderRedDotTrigger.this, "FinderMentionEntrance");
                        boolean b = FinderRedDotTrigger.m63384b(FinderRedDotTrigger.this, "FinderEntrance") | false | FinderRedDotTrigger.m63384b(FinderRedDotTrigger.this, "NearbyEntrance") | FinderRedDotTrigger.m63384b(FinderRedDotTrigger.this, "FinderLiveEntrance") | FinderRedDotTrigger.m63385c(FinderRedDotTrigger.this, "FinderEntrance") | FinderRedDotTrigger.m63385c(FinderRedDotTrigger.this, "NearbyEntrance") | FinderRedDotTrigger.m63385c(FinderRedDotTrigger.this, "FinderLiveEntrance");
                        if (b) {
                            FinderRedDotTrigger.this.getClass();
                            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).f157802n.mo84538g(506365, 10, (C49712hj1) null);
                        }
                        Log.m105925i("MicroMsg.FinderRedDotTrigger", "Finder Reddot Trigger handle enter event cost[%d] needSync[%b]", Long.valueOf(Util.ticksToNow(currentTicks)), Boolean.valueOf(b));
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.FinderRedDotTrigger", e, "", new Object[0]);
                    }
                }
                return false;
            }
        };
        this.f158564c = new IListener<QuitFindMoreFriendsUIEvent>(fVar) {
            {
                this.__eventId = -971114274;
            }

            public boolean callback(IEvent iEvent) {
                QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent = (QuitFindMoreFriendsUIEvent) iEvent;
                long currentTicks = Util.currentTicks();
                if (!(quitFindMoreFriendsUIEvent == null || quitFindMoreFriendsUIEvent.f48110d == null)) {
                    try {
                        FinderRedDotTrigger.m63386d(FinderRedDotTrigger.this, quitFindMoreFriendsUIEvent, "FinderEntrance", TPOptionalID.f349338xc9bdf6cd);
                        FinderRedDotTrigger.m63386d(FinderRedDotTrigger.this, quitFindMoreFriendsUIEvent, "NearbyEntrance", 150);
                        FinderRedDotTrigger.m63386d(FinderRedDotTrigger.this, quitFindMoreFriendsUIEvent, "FinderLiveEntrance", 152);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.FinderRedDotTrigger", e, "", new Object[0]);
                    }
                    Log.m105925i("MicroMsg.FinderRedDotTrigger", "Finder Reddot Trigger handle quit event cost[%d]", Long.valueOf(Util.ticksToNow(currentTicks)));
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    public static void m63383a(FinderRedDotTrigger finderRedDotTrigger, String str) {
        finderRedDotTrigger.getClass();
        Log.m105919d("MicroMsg.FinderRedDotTrigger", "noteRedDotExposeCount path[%s] = exposeCount[%d]", str, Integer.valueOf(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77264e6(str)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m63384b(com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotTrigger r13, java.lang.String r14) {
        /*
            r13.getClass()
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            java.lang.String r2 = "path"
            gy3.C87412m.m108594g(r14, r2)
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r1.mo77227G5(r14)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0065
            te3.nn1 r5 = r2.mo77308o2(r14)
            r6 = 0
            if (r5 == 0) goto L_0x0026
            te3.yw r7 = r5.f184512q
            goto L_0x0027
        L_0x0026:
            r7 = r6
        L_0x0027:
            if (r7 == 0) goto L_0x0065
            if (r5 == 0) goto L_0x002e
            int r7 = r5.f184517v
            goto L_0x002f
        L_0x002e:
            r7 = 0
        L_0x002f:
            if (r7 <= 0) goto L_0x0065
            if (r5 == 0) goto L_0x0036
            te3.yw r7 = r5.f184512q
            goto L_0x0037
        L_0x0036:
            r7 = r6
        L_0x0037:
            gy3.C87412m.m108591d(r7)
            int r7 = r7.f186607g
            if (r7 != 0) goto L_0x0065
            int r7 = eb0.C31543z5.m39455e()
            long r7 = (long) r7
            long r9 = r2.field_time
            r11 = 1000(0x3e8, float:1.401E-42)
            long r11 = (long) r11
            long r9 = r9 / r11
            long r7 = r7 - r9
            if (r5 == 0) goto L_0x004f
            int r9 = r5.f184517v
            goto L_0x0050
        L_0x004f:
            r9 = 0
        L_0x0050:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0065
            if (r5 == 0) goto L_0x0059
            te3.yw r6 = r5.f184512q
        L_0x0059:
            gy3.C87412m.m108591d(r6)
            r6.f186607g = r3
            com.tencent.mm.plugin.finder.extension.reddot.w r1 = r1.f158524a
            r2.mo77314v2(r1, r3)
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            if (r1 == 0) goto L_0x007a
            r2 = 3
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            te3.nn1 r0 = r0.mo77246R5(r14)
            r13.mo77292f(r2, r0)
        L_0x007a:
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r4] = r14
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            r13[r3] = r14
            java.lang.String r14 = "MicroMsg.FinderRedDotTrigger"
            java.lang.String r0 = "checkRedDotColdTimeExpiredWhenEnter path[%s] needSync[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r0, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotTrigger.m63384b(com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotTrigger, java.lang.String):boolean");
    }

    /* renamed from: c */
    public static boolean m63385c(FinderRedDotTrigger finderRedDotTrigger, String str) {
        boolean z;
        finderRedDotTrigger.getClass();
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77246R5(str);
        int e = finderRedDotTrigger.mo77291e(R5);
        if (e == 1) {
            finderRedDotTrigger.mo77292f(1, R5);
            z = true;
        } else {
            z = false;
        }
        Log.m105919d("MicroMsg.FinderRedDotTrigger", "checkRedDotExposeLimitWhenEnter path[%s] = strategy[%d] needSync[%b]", str, Integer.valueOf(e), Boolean.valueOf(z));
        return z;
    }

    /* renamed from: d */
    public static void m63386d(FinderRedDotTrigger finderRedDotTrigger, QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent, String str, int i) {
        Class cls = FinderCommonFeatureService.class;
        finderRedDotTrigger.getClass();
        int i2 = Util.getInt(quitFindMoreFriendsUIEvent.f48110d.f48112b, -1);
        if (i2 <= -1 || i2 >= 255) {
            i2 = -1;
        }
        if (i2 > -1 && i2 != i) {
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5(str);
            int e = finderRedDotTrigger.mo77291e(R5);
            if (e == 2) {
                finderRedDotTrigger.mo77292f(2, R5);
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5(str);
            }
            if (e == 1) {
                finderRedDotTrigger.mo77292f(100, R5);
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5(str);
            }
            Log.m105919d("MicroMsg.FinderRedDotTrigger", "checkFinderRedDotExposeLimitWhenQuit path[%s] = strategy[%d]", str, Integer.valueOf(e));
        }
    }

    /* renamed from: e */
    public final int mo77291e(C64586nn1 nn12) {
        C64867yw ywVar;
        if (nn12 != null && (ywVar = nn12.f184512q) != null && nn12.f184515t > 0 && nn12.f184516u > 0) {
            try {
                Log.m105919d("MicroMsg.FinderRedDotTrigger", "checkFinderTipsShowInfo path=%s [%d %d] strategy=%d", nn12.f184507i, Integer.valueOf(ywVar.f186604d), Integer.valueOf(nn12.f184515t), Integer.valueOf(nn12.f184516u));
                int i = nn12.f184512q.f186604d;
                int i2 = nn12.f184515t;
                if (i >= i2 && i >= i2) {
                    return nn12.f184516u;
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* renamed from: f */
    public final void mo77292f(int i, C64586nn1 nn12) {
        if (nn12 != null && nn12.f184512q != null) {
            try {
                C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77227G5(nn12.f184507i);
                FinderReddotExposeStrategyStruct finderReddotExposeStrategyStruct = this.f158562a;
                finderReddotExposeStrategyStruct.f156011i = i;
                finderReddotExposeStrategyStruct.f156007e = finderReddotExposeStrategyStruct.mo86045b("Path", nn12.f184507i, true);
                finderReddotExposeStrategyStruct.f156008f = nn12.f184515t;
                finderReddotExposeStrategyStruct.f156009g = nn12.f184516u;
                finderReddotExposeStrategyStruct.f156010h = nn12.f184512q.f186604d;
                finderReddotExposeStrategyStruct.f156006d = finderReddotExposeStrategyStruct.mo86045b("TipsId", G5 != null ? G5.field_tipsId : "", true);
                finderReddotExposeStrategyStruct.f156012j = (long) nn12.f184517v;
                finderReddotExposeStrategyStruct.f156013k = C31543z5.m39453c();
                finderReddotExposeStrategyStruct.mo86054n();
            } catch (Exception unused) {
            }
        }
    }
}
