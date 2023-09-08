package fx0;

import by0.C16825a;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.pluginsdk.model.C44545a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C19641z0;
import eb0.C20583z;
import gy3.C87412m;
import jx0.C33702b;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import p007bo.C16801f;
import pe3.C47465a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import te3.C48859bi;
import te3.C48961c6;
import te3.C48998cg0;
import te3.C49148di;
import te3.C49229e4;
import te3.C50127kg;
import te3.C50819pf;
import te3.C50823pg;
import te3.C51135ro3;
import te3.C51968xg;
import wc3.C22881c;

/* renamed from: fx0.e */
public final class C45822e implements l0$$e {

    /* renamed from: d */
    public static final C45822e f123721d = new C45822e();

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C48998cg0 cg02;
        Log.m105925i("MicroMsg.BizStrategyManager", "doBizStrategy callback %d/%d %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        int i3 = C45823f.f123722a;
        C13601g gVar = C45823f.f123723b;
        ((MultiProcessMMKV) ((C36570n) gVar).getValue()).putLong("biz_time_line_strategy_last_time", System.currentTimeMillis());
        if (i == 0 && i2 == 0) {
            int i4 = C45823f.f123722a;
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizStrategyResp");
            C49148di diVar = (C49148di) aVar;
            C48859bi biVar = diVar.f132336f;
            if (biVar != null) {
                Log.m105925i("MicroMsg.BizStrategyManager", "alvinluo updateBizStrategyControlInfo RefreshInterval = %d", Integer.valueOf(biVar.f131127d));
                if (biVar.f131127d > 0) {
                    ((MultiProcessMMKV) ((C36570n) gVar).getValue()).putLong("biz_time_line_fetch_interval", (long) biVar.f131127d);
                }
            }
            if ((i4 & 2) != 0) {
                C22881c cVar2 = C22881c.f65777a;
                C48961c6 c6Var = diVar.f132335e;
                if (c6Var != null) {
                    cVar2.mo36059d().putBoolean("biz_time_line_has_fetch_strategy", true);
                    cVar2.mo36059d().putBoolean("biz_time_line_need_preload", c6Var.f131535e);
                    cVar2.mo36059d().putBoolean("biz_time_line_need_preload_fold", c6Var.f131534d);
                    cVar2.mo36059d().putBoolean("biz_time_preload_at_foreground", c6Var.f131541n);
                    cVar2.mo36059d().putBoolean("biz_time_preload_at_chat_list", c6Var.f131542o);
                    cVar2.mo36059d().putBoolean("biz_time_preload_at_biz_box_expose", c6Var.f131543p);
                    if (c6Var.f131537g > 0) {
                        cVar2.mo36059d().putInt("biz_time_line_need_preload_interval", c6Var.f131537g);
                    }
                    if (c6Var.f131536f > 0) {
                        cVar2.mo36059d().putInt("biz_time_line_need_preload_top_num", c6Var.f131536f);
                    }
                    if (c6Var.f131538h > 0) {
                        cVar2.mo36059d().putInt("biz_time_line_msg_sync_gap", c6Var.f131538h);
                    }
                    if (c6Var.f131539i > 0) {
                        cVar2.mo36059d().putInt("biz_time_line_pic_download_gap", c6Var.f131539i);
                    }
                    if (c6Var.f131540j > 0) {
                        cVar2.mo36059d().putInt("biz_time_line_pic_limit_minute", c6Var.f131540j);
                    }
                    Log.m105924i("MicroMsg.BizImagePreloadStrategy", "CoverPreloadInfo: NeedPreload = " + c6Var.f131535e + ", NeedPreloadFold = " + c6Var.f131534d + ", PreloadInterval = " + c6Var.f131537g + ", PreloadTopNum = " + c6Var.f131537g + ", PreloadSyncGap = " + c6Var.f131538h + ", PreloadPicGap = " + c6Var.f131539i + ", NeedPreloadAtForeground = " + c6Var.f131541n + ", NeedPreloadAtChatList = " + c6Var.f131542o + ", NeedPreloadAtAppMsgExpose = " + c6Var.f131543p);
                }
            }
            if ((i4 & 8) != 0) {
                C45825h.m51117k(diVar);
            }
            if ((i4 & 16) != 0) {
                C19627t tVar = C19627t.f55586a;
                C49229e4 e4Var = diVar.f132339i;
                if (e4Var != null) {
                    C19627t.f55592g = e4Var.f132675e;
                    tVar.mo25826H(e4Var.f132674d);
                }
            }
            if ((i4 & 32) != 0) {
                C20583z.C20584b bVar = C20583z.f57949a;
                C51135ro3 ro32 = diVar.f132340j;
                if (ro32 != null) {
                    Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", "updateSvrSwitch = " + ro32.f141061d);
                    int i5 = ro32.f141061d;
                    if (i5 == 1) {
                        bVar.mo32230c().encode("BizTLRecommendFeedsSvrOpen", false);
                    } else if (i5 == 2) {
                        bVar.mo32230c().encode("BizTLRecommendFeedsSvrOpen", true);
                    }
                    bVar.mo32230c().encode("BizTLRecommendFeedsRefreshFreq", ro32.f141062e);
                    bVar.mo32230c().encode("BizTLRecommendFeedsTimingPreload", ro32.f141063f);
                    Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", "BizTLRecommendFeedsTimingPreload = " + ro32.f141063f);
                }
            }
            if ((i4 & 128) != 0) {
                C19428d dVar = C19428d.f54856a;
                C50819pf pfVar = diVar.f132342o;
                int i6 = pfVar != null ? pfVar.f139739d : 0;
                dVar.mo25176k().encode("SvrOpenFlag", i6);
                Log.m105918d("MicroMsg.BizFinderLiveLogic", "svrOpenFlag = " + i6);
            }
            if ((i4 & 512) != 0) {
                C19641z0 z0Var = C19641z0.f55645a;
                C50127kg kgVar = diVar.f132344q;
                if (kgVar != null) {
                    MultiProcessMMKV d = z0Var.mo25861d();
                    boolean z = kgVar.f136774d;
                    C19641z0.f55655k = z;
                    C13598b0 b0Var = C13598b0.f38549a;
                    d.encode("ReSortBizMsgRetrieveInvalidExposureCard", z);
                    z0Var.mo25861d().encode("ReSortBizMsgValidExposureAreaRatio", kgVar.f136775e);
                    z0Var.mo25861d().encode("ReSortBizMsgValidExposurePeriod", kgVar.f136776f);
                    z0Var.mo25861d().encode("ReSortBizMsgRedDotSample", kgVar.f136777g);
                    z0Var.mo25861d().encode("ReSortBizMsgRecMsgReportSample", kgVar.f136778h);
                    z0Var.mo25861d().encode("ReSortBizMsgRecMsgReportMaxCount", kgVar.f136779i);
                    z0Var.mo25861d().encode("ReSortBizMsgRecommendReasonMode", kgVar.f136780j);
                    Log.m105924i("MicroMsg.BizTimeLineResortLogic", "saveConfig RetrieveInvalidExposureCard=" + kgVar.f136774d + ", ValidExposureAreaRatio=" + kgVar.f136775e + ", ValidExposurePeriod=" + kgVar.f136776f + ", RedDotSample=" + kgVar.f136777g + ", RecMsgReportSample=" + kgVar.f136778h + "， RecMsgReportMaxCount=" + kgVar.f136779i + ", RecommendReasonMode=" + kgVar.f136780j);
                }
                C16801f fVar = C16801f.f45399a;
                C50823pg pgVar = diVar.f132346s;
                if (pgVar != null) {
                    ((MultiProcessMMKV) ((C36570n) C16801f.f45400b).getValue()).encode("BizResortV2ControlFlag", pgVar.f139747d);
                    Log.m105924i("MicroMsg.BizFlutterHelper", "saveConfig controlFlag=" + pgVar.f139747d);
                }
            }
            if ((i4 & 1024) != 0) {
                C33702b bVar2 = C33702b.f91166a;
                C51968xg xgVar = diVar.f132345r;
                if (xgVar != null) {
                    ((MultiProcessMMKV) ((C36570n) C33702b.f91167b).getValue()).encode("personal_center_main_table", xgVar.toByteArray());
                }
            }
            if (!((i4 & 2048) == 0 || (cg02 = diVar.f132347t) == null)) {
                C16825a aVar2 = C16825a.f45444a;
                Log.m105924i("MicroMsg.MPVideoPreviewMgr", "autoPlayTriggerThresholdInMs= " + cg02.f131706d);
                ((MultiProcessMMKV) ((C36570n) C16825a.f45446c).getValue()).putInt("auto_play_trigger_threshold_in_ms", cg02.f131706d);
                C16825a.f45447d = cg02.f131706d;
            }
            if ((i4 & 256) != 0) {
                C44545a.f120794a.mo69327e(diVar.f132343p);
            }
        }
        return 0;
    }
}
