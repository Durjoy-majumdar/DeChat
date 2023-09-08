package com.tencent.p014mm.plugin.expt.pageflow;

import com.tencent.p014mm.autogen.mmdata.rpt.PageFlowDetailStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import d91.C20449a;
import f40.C86718e;
import h81.C32735h;
import pa1.C35418c;

/* renamed from: com.tencent.mm.plugin.expt.pageflow.i */
public class C29897i {

    /* renamed from: a */
    public static C29897i f80988a;

    /* renamed from: a */
    public final void mo56974a(C32735h.C32737c cVar, PageFlowDetailStruct pageFlowDetailStruct) {
        MultiProcessMMKV multiProcessMMKV;
        C32735h.C32737c cVar2 = cVar;
        PageFlowDetailStruct pageFlowDetailStruct2 = pageFlowDetailStruct;
        if (MMApplicationContext.isMMProcess()) {
            long currentTicks = Util.currentTicks();
            int i = Util.getInt(C35418c.m40699b().mo60251c(cVar2, "", false), 0);
            if (i > 0) {
                int h = C86718e.m107549h();
                if (h == 0) {
                    multiProcessMMKV = null;
                } else {
                    multiProcessMMKV = MultiProcessMMKV.getMMKV(h + "_" + "WxPageFlowMerge");
                }
                if (multiProcessMMKV != null) {
                    String str = multiProcessMMKV.getString(cVar.name(), "") + "|" + pageFlowDetailStruct2.mo174258s(";");
                    long j = multiProcessMMKV.getLong(cVar.name() + "_rpttime", 0);
                    if ((str.length() >= i || Util.secondsToNow(j) > 3600) && pageFlowDetailStruct2.f343803h % 2 == 0) {
                        multiProcessMMKV.putLong(cVar.name() + "_rpttime", Util.nowSecond());
                        multiProcessMMKV.putString(cVar.name(), "");
                        C115669n.INSTANCE.kvStat(16562, str);
                        if (cVar2 == C32735h.C32737c.clicfg_weixin_mm_hell_hound) {
                            ThreadPool.post(new C115415g(this, str), "report_weixin_app_time");
                        }
                    } else {
                        multiProcessMMKV.putString(cVar.name(), str);
                    }
                    Log.m105927v("MicroMsg.MMPageReporter", "handle merge cost[%d]", Long.valueOf(Util.ticksToNow(currentTicks)));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo56975b(PageFlowDetailStruct pageFlowDetailStruct) {
        if (pageFlowDetailStruct != null) {
            int i = (int) pageFlowDetailStruct.f343803h;
            boolean z = false;
            if (i == 1 || i == 2) {
                mo56974a(C32735h.C32737c.clicfg_weixin_mm_app_mgr, pageFlowDetailStruct);
                if (Util.getInt(C35418c.m40699b().mo60251c(C32735h.C32737c.clicfg_weixin_rpt_mm_app_mgr, "", false), 0) > 0) {
                    pageFlowDetailStruct.mo86054n();
                }
            }
            if (i == 3 || i == 4) {
                mo56974a(C32735h.C32737c.clicfg_weixin_mm_life_call, pageFlowDetailStruct);
                if (Util.getInt(C35418c.m40699b().mo60251c(C32735h.C32737c.clicfg_weixin_rpt_mm_life_call, "", false), 0) > 0) {
                    pageFlowDetailStruct.mo86054n();
                }
            }
            if ((i == 7 || i == 8) && C20449a.m22052d() && C20449a.m22051c()) {
                mo56974a(C32735h.C32737c.clicfg_weixin_mm_hell_hound, pageFlowDetailStruct);
                if (Util.getInt(C35418c.m40699b().mo60251c(C32735h.C32737c.clicfg_weixin_rpt_mm_hell_hound, "", false), 0) > 0) {
                    z = true;
                }
                if (z) {
                    pageFlowDetailStruct.mo86054n();
                }
            }
        }
    }
}
