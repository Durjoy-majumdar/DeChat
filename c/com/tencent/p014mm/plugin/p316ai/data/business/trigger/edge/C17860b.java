package com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge;

import com.tencent.p014mm.autogen.events.EnterFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.CalendarFinderSyncStatisticsStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.CalendarStatisticsStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.EdgeInputArgsStruct;
import com.tencent.p014mm.pointers.PFloat;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import di3.C86312j;
import hh0.C20942f;
import ht1.C60200t1;
import ih0.C108461a;
import ih0.C117197j;
import ih0.C21092b;
import ih0.C33329e;
import lh0.C34262g;
import p749xh.C66277w3;
import te3.C64586nn1;
import te3.C64867yw;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.edge.b */
public class C17860b {

    /* renamed from: a */
    public EdgeInputArgsStruct f49234a = new EdgeInputArgsStruct();

    /* renamed from: a */
    public void mo22075a() {
        boolean z = C108461a.m146963b() >= 3;
        PFloat pFloat = new PFloat();
        C108461a.m146962a(pFloat);
        EdgeInputArgsStruct edgeInputArgsStruct = this.f49234a;
        edgeInputArgsStruct.f48282F = edgeInputArgsStruct.mo86045b(DownloadInfo.NETTYPE, NetStatusUtil.getIOSOldNetType(MMApplicationContext.getContext()) + "", true);
        edgeInputArgsStruct.f48283G = C117197j.wx0().f351082e;
        edgeInputArgsStruct.f48319j0 = z ? 1 : 0;
        edgeInputArgsStruct.f48321k0 = (long) ((int) (pFloat.value * 100.0f));
    }

    /* renamed from: b */
    public void mo22076b(EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent) {
        EdgeInputArgsStruct edgeInputArgsStruct = this.f49234a;
        edgeInputArgsStruct.f48278B = edgeInputArgsStruct.mo86045b("fromSid", enterFindMoreFriendsUIEvent.f48084d.f48085a, true);
        long j = enterFindMoreFriendsUIEvent.f48084d.f48086b;
        edgeInputArgsStruct.f48279C = j;
        edgeInputArgsStruct.mo86046c("fromSidStayTimeMs", j);
        edgeInputArgsStruct.f48280D = enterFindMoreFriendsUIEvent.f48084d.f48087c;
        edgeInputArgsStruct.f48281E = edgeInputArgsStruct.mo86045b("findFriendsEntryRedDot", C33329e.xx0().wx0(), true);
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        CalendarStatisticsStruct c = vx02.f92371i.mo33602c("calendar_statistics_discover");
        EdgeInputArgsStruct edgeInputArgsStruct2 = this.f49234a;
        long j2 = c.f48235e;
        edgeInputArgsStruct2.f48291O = j2;
        edgeInputArgsStruct2.mo86046c("calendarDiscoverFirstExposeTimeMs", j2);
        edgeInputArgsStruct2.f48292P = c.f48237g;
    }

    /* renamed from: c */
    public void mo22077c() {
        EdgeInputArgsStruct edgeInputArgsStruct = this.f49234a;
        edgeInputArgsStruct.f48306d = edgeInputArgsStruct.mo86045b("finderTipsId", "", true);
        edgeInputArgsStruct.f48308e = 0;
        edgeInputArgsStruct.f48310f = 0;
        EdgeInputArgsStruct edgeInputArgsStruct2 = this.f49234a;
        edgeInputArgsStruct2.f48312g = 0;
        edgeInputArgsStruct2.mo86046c("finderReceTimeMs", 0);
        edgeInputArgsStruct2.f48314h = 0;
        edgeInputArgsStruct2.f48316i = 0;
        C66277w3 f = C21092b.m23349i().mo32853f();
        if (f != null) {
            EdgeInputArgsStruct edgeInputArgsStruct3 = this.f49234a;
            edgeInputArgsStruct3.f48306d = edgeInputArgsStruct3.mo86045b("finderTipsId", f.field_tipsId, true);
            edgeInputArgsStruct3.f48308e = (long) f.field_ctrType;
            long j = f.field_time;
            edgeInputArgsStruct3.f48312g = j;
            edgeInputArgsStruct3.mo86046c("finderReceTimeMs", j);
            C64586nn1 g = C21092b.m23349i().mo32854g(f);
            if (g != null) {
                this.f49234a.f48313g0 = (long) g.f184514s;
                PInt pInt = new PInt();
                PString pString = new PString();
                if (C21092b.m23349i().mo32855h(g, pInt, pString)) {
                    EdgeInputArgsStruct edgeInputArgsStruct4 = this.f49234a;
                    edgeInputArgsStruct4.f48311f0 = edgeInputArgsStruct4.mo86045b("finderPushScene", pString.value, true);
                    edgeInputArgsStruct4.f48309e0 = (long) pInt.value;
                }
                C64867yw ywVar = g.f184512q;
                if (ywVar != null) {
                    EdgeInputArgsStruct edgeInputArgsStruct5 = this.f49234a;
                    edgeInputArgsStruct5.f48310f = (long) g.f184502d;
                    edgeInputArgsStruct5.f48314h = (long) ywVar.f186604d;
                    edgeInputArgsStruct5.f48316i = ywVar.f186606f;
                }
            }
        }
        EdgeInputArgsStruct edgeInputArgsStruct6 = this.f49234a;
        edgeInputArgsStruct6.f48330p = edgeInputArgsStruct6.mo86045b("liveTipsId", "", true);
        edgeInputArgsStruct6.f48332q = 0;
        edgeInputArgsStruct6.f48334r = 0;
        EdgeInputArgsStruct edgeInputArgsStruct7 = this.f49234a;
        edgeInputArgsStruct7.f48336s = 0;
        edgeInputArgsStruct7.mo86046c("liveReceTimeMs", 0);
        edgeInputArgsStruct7.f48337t = 0;
        edgeInputArgsStruct7.f48338u = 0;
        C66277w3 c = C21092b.m23349i().mo32850c();
        if (c != null) {
            EdgeInputArgsStruct edgeInputArgsStruct8 = this.f49234a;
            edgeInputArgsStruct8.f48330p = edgeInputArgsStruct8.mo86045b("liveTipsId", c.field_tipsId, true);
            edgeInputArgsStruct8.f48332q = (long) c.field_ctrType;
            long j2 = c.field_time;
            edgeInputArgsStruct8.f48336s = j2;
            edgeInputArgsStruct8.mo86046c("liveReceTimeMs", j2);
            C64586nn1 d = C21092b.m23349i().mo32851d(c);
            if (d != null) {
                this.f49234a.f48317i0 = (long) d.f184514s;
                PInt pInt2 = new PInt();
                if (C21092b.m23349i().mo32852e(d, pInt2)) {
                    this.f49234a.f48315h0 = (long) pInt2.value;
                }
                C64867yw ywVar2 = d.f184512q;
                if (ywVar2 != null) {
                    EdgeInputArgsStruct edgeInputArgsStruct9 = this.f49234a;
                    edgeInputArgsStruct9.f48334r = (long) d.f184502d;
                    edgeInputArgsStruct9.f48337t = (long) ywVar2.f186604d;
                    edgeInputArgsStruct9.f48338u = ywVar2.f186606f;
                }
            }
        }
        EdgeInputArgsStruct edgeInputArgsStruct10 = this.f49234a;
        edgeInputArgsStruct10.f48284H = (long) C20942f.yx0().f59378j.size();
        edgeInputArgsStruct10.f48285I = (long) C20942f.yx0().f59379n.size();
    }

    /* renamed from: d */
    public void mo22078d() {
        Class cls = C60200t1.class;
        EdgeInputArgsStruct edgeInputArgsStruct = this.f49234a;
        edgeInputArgsStruct.f48322l = C21092b.m23349i().mo32857k();
        C21092b.m23349i().getClass();
        edgeInputArgsStruct.f48324m = ((C60200t1) C86312j.m106911c(cls)).mo76889vp();
        edgeInputArgsStruct.f48318j = C21092b.m23349i().mo32858l();
        C21092b.m23349i().getClass();
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        edgeInputArgsStruct.f48320k = vx02.f92371i.mo33600a("last_expose_finder_reddot_ms", 0);
        edgeInputArgsStruct.f48341x = C21092b.m23349i().mo32856j();
        C21092b.m23349i().getClass();
        edgeInputArgsStruct.f48342y = ((C60200t1) C86312j.m106911c(cls)).mo76855hR();
        C21092b.m23349i().getClass();
        C34262g vx03 = C34262g.vx0();
        vx03.requireAccountInitialized();
        edgeInputArgsStruct.f48339v = vx03.f92371i.mo33600a("rece_finder_live_reddot_ms", 0);
        C21092b.m23349i().getClass();
        C34262g vx04 = C34262g.vx0();
        vx04.requireAccountInitialized();
        edgeInputArgsStruct.f48340w = vx04.f92371i.mo33600a("last_expose_finder_live_reddot_ms", 0);
        C20942f.yx0().getClass();
        C34262g vx05 = C34262g.vx0();
        vx05.requireAccountInitialized();
        edgeInputArgsStruct.f48286J = vx05.f92371i.mo33600a("last_finder_sync_ms", 0);
        edgeInputArgsStruct.f48325m0 = (long) C21092b.m23349i().mo32848a();
        edgeInputArgsStruct.f48323l0 = (long) C21092b.m23349i().mo32849b();
        C34262g vx06 = C34262g.vx0();
        vx06.requireAccountInitialized();
        CalendarFinderSyncStatisticsStruct d = vx06.f92371i.mo33603d("calendar_statistics_sync");
        EdgeInputArgsStruct edgeInputArgsStruct2 = this.f49234a;
        edgeInputArgsStruct2.f48287K = d.f48230e;
        edgeInputArgsStruct2.f48288L = d.f48231f;
        edgeInputArgsStruct2.f48289M = d.f48232g;
        edgeInputArgsStruct2.f48290N = d.f48233h;
        C34262g vx07 = C34262g.vx0();
        vx07.requireAccountInitialized();
        CalendarStatisticsStruct c = vx07.f92371i.mo33602c("calendar_statistics_finder");
        EdgeInputArgsStruct edgeInputArgsStruct3 = this.f49234a;
        long j = c.f48235e;
        edgeInputArgsStruct3.f48293Q = j;
        edgeInputArgsStruct3.mo86046c("calendarFinderRedDotFirstExposeTimeMs", j);
        edgeInputArgsStruct3.f48294R = c.f48236f;
        edgeInputArgsStruct3.f48295S = c.f48237g;
        edgeInputArgsStruct3.f48296T = c.f48240j;
        edgeInputArgsStruct3.f48297U = c.f48241k;
        edgeInputArgsStruct3.f48298V = c.f48242l;
        long j2 = c.f48238h;
        edgeInputArgsStruct3.f48299W = j2;
        edgeInputArgsStruct3.mo86047d("calendarFinderStayTimeSec", j2);
        C34262g vx08 = C34262g.vx0();
        vx08.requireAccountInitialized();
        CalendarStatisticsStruct c2 = vx08.f92371i.mo33602c("calendar_statistics_live");
        EdgeInputArgsStruct edgeInputArgsStruct4 = this.f49234a;
        long j3 = c2.f48235e;
        edgeInputArgsStruct4.f48300X = j3;
        edgeInputArgsStruct4.mo86046c("calendarLiveRedDotFirstExposeTimeMs", j3);
        edgeInputArgsStruct4.f48301Y = c2.f48236f;
        edgeInputArgsStruct4.f48302Z = c2.f48237g;
        edgeInputArgsStruct4.f48303a0 = c2.f48240j;
        edgeInputArgsStruct4.f48304b0 = c2.f48241k;
        edgeInputArgsStruct4.f48305c0 = c2.f48242l;
        long j4 = c2.f48238h;
        edgeInputArgsStruct4.f48307d0 = j4;
        edgeInputArgsStruct4.mo86047d("calendarLiveStayTimeSec", j4);
    }
}
