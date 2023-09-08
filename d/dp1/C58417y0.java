package dp1;

import android.content.Context;
import android.util.ArrayMap;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c30.C104289g;
import cm1.C55033u;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ActivityBrowseClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.CommentItemClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.DailyPaperExpoClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FeedManuClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderAdIconExpoClickNewStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderAtFeedReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBacktoTopStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderClickPatMusicIconStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderCommentClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderExpandSubCommentStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedAvatarClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedTabSwitchStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderForwardStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderHotSearchClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderHottabClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderInteractionSearchStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveOpenWxaShopReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLivePreWarmEndReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLivePreWarmStartReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveStatisticsReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLocationRequestStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderModeMessageStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderMsgItemClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPersonalCenterEventStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderProfileAtPersonStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderProfileFeedClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderProfilePostBtnReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderRealLikeActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderRealLikeExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderRedDotCancelStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderRedDotStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSearchActionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSearchClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSearchResultExposeClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSettingExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSysMsgActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSysMsgItemClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderTagClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderTagForwardStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderTopicFilterTextExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderTraceActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderUnflodActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveNotifyReplaceStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MentionedFeedFilterStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.NewPoiDetailFinderStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenSmallappShopStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppAtChannelsStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAtTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.NetworkUtil;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import ei3.C86522b;
import er1.C58771q3;
import er1.C7865r3;
import f40.C86709a0;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hp1.C8703w0;
import ht1.C60169f4;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import je1.C33554b4;
import je1.C33559s2;
import je1.C33562u2;
import jq3.C60905o;
import kj2.C117407d;
import lf1.C10500a;
import o40.C11348f;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import os1.C11739f;
import p166hy.C60229z;
import p185kq.C10383h;
import p749xh.C66261f3;
import pe1.C35464c;
import pf1.C11920q;
import rs1.C13442s8;
import rs1.C13448t;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C51822we1;
import te3.C64682rk1;
import te3.C64689rq2;
import te3.C64827xe1;
import tf0.C13887q1;
import up1.C37521f;
import vp1.C65834e;
import wc3.C15133e0;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;
import zc1.C66785b;

@C86522b
/* renamed from: dp1.y0 */
public final class C58417y0 extends C86301e implements C60169f4 {

    /* renamed from: d */
    public final String f167350d = "Finder.FinderReportLogic";

    /* renamed from: e */
    public String f167351e = "";

    /* renamed from: f */
    public String f167352f = "";

    /* renamed from: g */
    public final LongSparseArray<Long> f167353g = new LongSparseArray<>();

    /* renamed from: h */
    public HashMap<String, C45435i2> f167354h = new HashMap<>();

    /* renamed from: i */
    public final LongSparseArray<Long> f167355i;

    /* renamed from: j */
    public final SparseArray<Long> f167356j;

    /* renamed from: n */
    public final BigInteger f167357n;

    /* renamed from: o */
    public boolean f167358o;

    /* renamed from: p */
    public boolean f167359p;

    /* renamed from: dp1.y0$a */
    public static final class C31233a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ long f83683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31233a(long j) {
            super(0);
            this.f83683d = j;
        }

        public Object invoke() {
            return C61926c.m72691p(this.f83683d);
        }
    }

    public C58417y0() {
        new ArrayMap();
        this.f167355i = new LongSparseArray<>();
        this.f167356j = new SparseArray<>();
        this.f167357n = BigInteger.ONE.shiftLeft(64);
    }

    public static /* synthetic */ void Dy0(C58417y0 y0Var, FinderPoiFeedUI.C3005a aVar, long j, C49712hj1 hj12, String str, String str2, String str3, long j2, int i, Object obj) {
        y0Var.Cy0(aVar, j, hj12, str, str2, str3, (i & 64) != 0 ? 0 : j2);
    }

    public static void Gx0(C58417y0 y0Var, C49712hj1 hj12, String str, int i, int i2, String str2, String str3, int i3, long j, int i4, int i5, Object obj) {
        if ((i5 & 64) != 0) {
            i3 = 0;
        }
        if ((i5 & 128) != 0) {
            j = 0;
        }
        if ((i5 & 256) != 0) {
            i4 = 0;
        }
        y0Var.getClass();
        C87412m.m108594g(str, "requestId");
        C87412m.m108594g(str2, "tagText");
        C87412m.m108594g(str3, "queryText");
        FinderInteractionSearchStruct finderInteractionSearchStruct = new FinderInteractionSearchStruct();
        finderInteractionSearchStruct.f155372f = finderInteractionSearchStruct.mo86045b("SearchSessionId", y0Var.f167352f, true);
        finderInteractionSearchStruct.f155373g = finderInteractionSearchStruct.mo86045b("RequestId", str, true);
        finderInteractionSearchStruct.f155374h = i;
        finderInteractionSearchStruct.f155375i = i2;
        finderInteractionSearchStruct.f155377k = 0;
        finderInteractionSearchStruct.f155378l = finderInteractionSearchStruct.mo86045b("TagText", str2, true);
        finderInteractionSearchStruct.f155379m = finderInteractionSearchStruct.mo86045b("QueryText", str3, true);
        finderInteractionSearchStruct.f155380n = i3;
        finderInteractionSearchStruct.f155381o = finderInteractionSearchStruct.mo86045b("ItemId", ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(j), true);
        finderInteractionSearchStruct.f155382p = i4;
        if (hj12 != null) {
            finderInteractionSearchStruct.f155370d = finderInteractionSearchStruct.mo86045b("SessionId", hj12.f134670d, true);
            finderInteractionSearchStruct.f155376j = hj12.f134675i;
            finderInteractionSearchStruct.f155371e = finderInteractionSearchStruct.mo86045b("ClicktabcontextId", hj12.f134672f, true);
            finderInteractionSearchStruct.f155383q = finderInteractionSearchStruct.mo86045b("ContextID", hj12.f134671e, true);
        }
        finderInteractionSearchStruct.mo86054n();
        y0Var.Ec0(finderInteractionSearchStruct);
    }

    public static /* synthetic */ void Iy0(C58417y0 y0Var, Context context, boolean z, boolean z2, int i, boolean z3, int i2, Object obj) {
        y0Var.Hy0(context, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, i, (i2 & 16) != 0 ? false : z3);
    }

    public static void Nx0(C58417y0 y0Var, String str, int i, int i2, int i3, int i4, int i5, String str2, String str3, long j, C49712hj1 hj12, int i6, int i7, int i8, Object obj) {
        int i9 = i8;
        int i15 = (i9 & 16) != 0 ? 0 : i4;
        int i16 = (i9 & 32) != 0 ? 0 : i5;
        String str4 = (i9 & 64) != 0 ? "" : str2;
        String str5 = (i9 & 128) != 0 ? "" : str3;
        long j2 = (i9 & 256) != 0 ? 0 : j;
        C49712hj1 hj13 = (i9 & 512) != 0 ? null : hj12;
        int i17 = (i9 & 1024) != 0 ? 0 : i6;
        int i18 = (i9 & 2048) != 0 ? 0 : i7;
        y0Var.getClass();
        C87412m.m108594g(str, "currUI");
        C87412m.m108594g(str5, "redDotWording");
        y0Var.Lx0(str, i, i2, i3, i15, i16, str4, str5, j2, hj13, i17, i18, "");
    }

    public static void Ny0(C58417y0 y0Var, Context context, long j, int i, int i2, String str, boolean z, boolean z2, C104289g gVar, int i3, int i4, int i5, int i6, int i7, String str2, long j2, long j3, int i8, int i9, int i15, int i16, int i17, String str3, boolean z3, int i18, int i19, int i25, Object obj) {
        long j4;
        int i26;
        int i27;
        String str4;
        String str5;
        StringBuilder sb;
        boolean z4;
        JSONObject jSONObject;
        boolean z5;
        C13448t tVar;
        C58417y0 y0Var2 = y0Var;
        Context context2 = context;
        String str6 = str;
        boolean z6 = z;
        boolean z7 = z2;
        C104289g gVar2 = gVar;
        int i28 = i25;
        int i29 = (i28 & 1024) != 0 ? 0 : i5;
        int i35 = (i28 & 2048) != 0 ? 0 : i6;
        int i36 = (i28 & 4096) != 0 ? 0 : i7;
        String str7 = "";
        String str8 = (i28 & 8192) != 0 ? str7 : str2;
        long j5 = (i28 & 16384) != 0 ? 0 : j2;
        int i37 = (65536 & i28) != 0 ? 0 : i8;
        int i38 = (i28 & 131072) != 0 ? 0 : i9;
        int i39 = (i28 & 262144) != 0 ? 0 : i15;
        int i44 = (i28 & 524288) != 0 ? 0 : i16;
        int i45 = (i28 & 1048576) != 0 ? 0 : i17;
        if ((i28 & 2097152) == 0) {
            str7 = str3;
        }
        boolean z8 = (i28 & 4194304) != 0 ? false : z3;
        int i46 = (i28 & 8388608) != 0 ? 0 : i18;
        int i47 = (i28 & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? -1 : i19;
        y0Var.getClass();
        Class<C13448t> cls = C13448t.class;
        int i48 = i47;
        String str9 = "report_extra_data";
        int i49 = i29;
        Class cls2 = C60229z.class;
        int i54 = i37;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str6, "contextId");
        C87412m.m108594g(gVar2, "data");
        C87412m.m108594g(str8, "adPosId");
        C87412m.m108594g(str7, "playSequence");
        try {
            C104289g gVar3 = new C104289g();
            int i55 = z7 ? 2 : 1;
            int i56 = i36;
            String str10 = str8;
            String str11 = str7;
            int i57 = z6 ? 1 : 0;
            long c = C31543z5.m39453c();
            gVar3.mo145953n("report_type", i55);
            gVar3.put("advert_group_id", gVar2.optString(FirebaseAnalytics.C113379b.GROUP_ID));
            gVar3.put("trace_id", gVar2.optString("traceid"));
            String optString = gVar2.optString("apurl");
            String optString2 = gVar2.optString("rl");
            String str12 = optString;
            if (!z7) {
                optString2 = str12;
            }
            gVar3.put("report_link", optString2);
            gVar3.mo145953n("pos_type", gVar2.optInt("pos_type"));
            gVar3.mo145953n("click_pos", 0);
            gVar3.mo145953n("ad_w", i3);
            gVar3.mo145953n("ad_h", i4);
            gVar3.mo145954o("aid", j5);
            gVar3.put(LocaleUtil.PORTUGUESE, gVar2.opt(LocaleUtil.PORTUGUESE));
            gVar3.mo145966q("viewable", z6);
            gVar3.mo145953n("screen_cnt", 1);
            gVar3.mo145953n("from_h5", 0);
            gVar3.mo145953n("from_game", 0);
            gVar3.mo145953n("exposure_type", i57);
            C104289g gVar4 = new C104289g();
            gVar4.mo145953n("page_x", i35);
            int i58 = i56;
            gVar4.mo145953n("page_y", i58);
            gVar4.mo145953n("screen_x", i35);
            gVar4.mo145953n("screen_y", i58);
            gVar4.mo145953n("ad_number", 1);
            gVar4.mo145953n("ad_unit_number", 1);
            gVar4.mo145953n("ad_index", 0);
            gVar4.mo145954o("page_enter_time", j3);
            C7865r3 r3Var = C7865r3.f26468a;
            gVar4.mo145953n("phone_screen_width", r3Var.mo8970c());
            gVar4.mo145953n("phone_screen_height", r3Var.mo8968a());
            C13598b0 b0Var = C13598b0.f38549a;
            gVar3.put("wxa_report_detail", gVar4);
            C104289g gVar5 = new C104289g();
            gVar5.put("oaid", ((C60229z) C86312j.m106911c(cls2)).mo85224r4());
            gVar5.put("imei", ((C60229z) C86312j.m106911c(cls2)).d00());
            gVar5.put("common_device_id", ((C60229z) C86312j.m106911c(cls2)).mo85225rD());
            gVar3.put("ext_click_comm", gVar5.toString());
            gVar3.put("pos_id", str10);
            C104289g gVar6 = new C104289g();
            gVar6.put("context_id", str6);
            gVar6.mo145953n("pos", i54);
            gVar3.put("channels_extra_data", gVar6.toString());
            int i59 = i49;
            gVar3.mo145953n("click_pos", i59);
            i26 = i38;
            try {
                gVar3.mo145953n("outer_duration", i26);
                gVar3.mo145953n("play_count", i39);
                int i64 = i44;
                gVar3.mo145953n("play_total_time", i64);
                gVar3.mo145953n("video_total_time", i45);
                String str13 = str11;
                gVar3.put("play_sequence", str13);
                String str14 = str9;
                gVar3.put(str14, gVar2.opt(str14));
                boolean z9 = z8;
                gVar3.mo145966q("card_show_flag", z9);
                int i65 = i46;
                gVar3.mo145953n("card_delay_sec", i65);
                long j6 = c;
                try {
                    gVar3.mo145954o("report_ts", j6);
                    if (i48 >= 0) {
                        i27 = i48;
                        gVar3.mo145953n("expose_report_mode", i27);
                    } else {
                        i27 = i48;
                    }
                    str4 = "viewable";
                    str5 = y0Var.f167350d;
                    sb = new StringBuilder();
                    j4 = j5;
                } catch (Exception e) {
                    e = e;
                    boolean z15 = z;
                    j4 = j5;
                    int i66 = i2;
                    C10500a aVar = C10500a.f31736a;
                    C10500a.m10435a(aVar, 4, j, i, j4, z, "e=" + e, i2, i26, false, (String) null, 768, (Object) null);
                    Log.printErrStackTrace(y0Var.f167350d, e, "reportExpose", new Object[0]);
                }
                try {
                    sb.append("reportHardAdvertisement actionType=");
                    try {
                        sb.append(i2);
                        sb.append(", reportType=");
                        sb.append(i55);
                        sb.append(", clickPos=");
                        sb.append(i59);
                        sb.append(", exposureType=");
                        sb.append(i57);
                        sb.append(" outerDuration=");
                        sb.append(i26);
                        sb.append(", playTotalTime=");
                        sb.append(i64);
                        sb.append(", playSequence=");
                        sb.append(str13);
                        sb.append(", isCardShown=");
                        sb.append(z9);
                        sb.append(", cardDelaySec: ");
                        sb.append(i65);
                        sb.append(", reportTs: ");
                        sb.append(j6);
                        sb.append(", exposeReportMode: ");
                        sb.append(i27);
                        Log.m105924i(str5, sb.toString());
                        String gVar7 = gVar3.toString();
                        C87412m.m108593f(gVar7, "json.toString()");
                        C86709a0.m107524d().mo123460f(new C33562u2(j, i, i2, gVar7));
                        z4 = true;
                        if (i27 != 1) {
                            z4 = false;
                        }
                        C10500a.m10435a(C10500a.f31736a, z2 ? 1 : 0, j, i, j4, z, gVar7, i2, i26, z4, (String) null, 512, (Object) null);
                        jSONObject = new JSONObject();
                        z5 = z;
                    } catch (Exception e2) {
                        e = e2;
                        boolean z16 = z;
                        C10500a aVar2 = C10500a.f31736a;
                        C10500a.m10435a(aVar2, 4, j, i, j4, z, "e=" + e, i2, i26, false, (String) null, 768, (Object) null);
                        Log.printErrStackTrace(y0Var.f167350d, e, "reportExpose", new Object[0]);
                    }
                } catch (Exception e3) {
                    e = e3;
                    int i67 = i2;
                    boolean z162 = z;
                    C10500a aVar22 = C10500a.f31736a;
                    C10500a.m10435a(aVar22, 4, j, i, j4, z, "e=" + e, i2, i26, false, (String) null, 768, (Object) null);
                    Log.printErrStackTrace(y0Var.f167350d, e, "reportExpose", new Object[0]);
                }
            } catch (Exception e4) {
                e = e4;
                j4 = j5;
                int i662 = i2;
                C10500a aVar222 = C10500a.f31736a;
                C10500a.m10435a(aVar222, 4, j, i, j4, z, "e=" + e, i2, i26, false, (String) null, 768, (Object) null);
                Log.printErrStackTrace(y0Var.f167350d, e, "reportExpose", new Object[0]);
            }
            try {
                jSONObject.put("isViewable", z5);
                jSONObject.put("isVideoExpose", z4);
                boolean z17 = z2;
                jSONObject.put("isClick", z17);
                String str15 = z17 ? "click" : z5 ? str4 : z4 ? "original-video" : "original-component";
                C39818r rVar = C39818r.f106831a;
                Context context3 = context;
                Class<C13448t> cls3 = cls;
                C13448t tVar2 = (C13448t) rVar.mo62443b(context3).mo62449e(cls3);
                if (tVar2 != null) {
                    tVar2.mo12876c3(j, "reportFinderAdHard-" + str15, jSONObject, j4);
                }
                if (!z17 && (tVar = (C13448t) rVar.mo62443b(context3).mo62449e(cls3)) != null) {
                    tVar.f38119e.put(Long.valueOf(j), Boolean.TRUE);
                }
            } catch (Exception e5) {
                e = e5;
                C10500a aVar2222 = C10500a.f31736a;
                C10500a.m10435a(aVar2222, 4, j, i, j4, z, "e=" + e, i2, i26, false, (String) null, 768, (Object) null);
                Log.printErrStackTrace(y0Var.f167350d, e, "reportExpose", new Object[0]);
            }
        } catch (Exception e6) {
            e = e6;
            i26 = i38;
            j4 = j5;
            int i6622 = i2;
            C10500a aVar22222 = C10500a.f31736a;
            C10500a.m10435a(aVar22222, 4, j, i, j4, z, "e=" + e, i2, i26, false, (String) null, 768, (Object) null);
            Log.printErrStackTrace(y0Var.f167350d, e, "reportExpose", new Object[0]);
        }
    }

    public static /* synthetic */ void Py0(C58417y0 y0Var, String str, boolean z, boolean z2, C104289g gVar, int i, int i2, int i3, int i4, int i5, String str2, long j, long j2, int i6, int i7, Object obj) {
        int i8 = i7;
        y0Var.Oy0(str, z, z2, gVar, i, i2, (i8 & 64) != 0 ? 0 : i3, (i8 & 128) != 0 ? 0 : i4, (i8 & 256) != 0 ? 0 : i5, (i8 & 512) != 0 ? "" : str2, (i8 & 1024) != 0 ? 0 : j, j2, (i8 & 4096) != 0 ? 0 : i6);
    }

    public static /* synthetic */ void Qx0(C58417y0 y0Var, C49712hj1 hj12, long j, RecyclerView recyclerView, int i, String str, int i2, Object obj) {
        int i3 = (i2 & 8) != 0 ? 0 : i;
        if ((i2 & 16) != 0) {
            str = "";
        }
        y0Var.Px0(hj12, j, recyclerView, i3, str);
    }

    public static void Qy0(C58417y0 y0Var, Context context, boolean z, long j, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        y0Var.getClass();
        C87412m.m108594g(context, "context");
        C104289g gVar = new C104289g();
        gVar.put("feedid", C61926c.m72691p(j));
        gVar.mo145953n("is_spam", z2 ? 1 : 0);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "kvJson.toString()");
        String n = C112551y.m153814n(gVar2, ",", ";", false);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        y0Var.Cx0(z ? 1 : 0, "new_fav_add", n, f != null ? f.mo12861q3() : null);
    }

    public static /* synthetic */ void Ty0(C58417y0 y0Var, Context context, boolean z, long j, int i, String str, int i2, int i3, Object obj) {
        y0Var.Sy0(context, z, j, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? 0 : i2);
    }

    public static /* synthetic */ void Ux0(C58417y0 y0Var, C49712hj1 hj12, long j, int i, int i2, int i3, String str, int i4, boolean z, boolean z2, int i5, int i6, Object obj) {
        int i7 = i6;
        y0Var.Tx0(hj12, j, i, i2, i3, str, i4, (i7 & 128) != 0 ? false : z, (i7 & 256) != 0 ? false : z2, (i7 & 512) != 0 ? 0 : i5);
    }

    public static void cy0(C58417y0 y0Var, String str, String str2, int i, int i2, String str3, int i3, int i4, int i5, String str4, int i6, int i7, C49712hj1 hj12, String str5, int i8, int i9, Object obj) {
        int i15 = i9;
        C49712hj1 hj13 = (i15 & 2048) != 0 ? null : hj12;
        String str6 = "";
        String str7 = (i15 & 4096) != 0 ? str6 : str5;
        int i16 = (i15 & 8192) != 0 ? 0 : i8;
        y0Var.getClass();
        FinderSearchResultExposeClickStruct finderSearchResultExposeClickStruct = new FinderSearchResultExposeClickStruct();
        finderSearchResultExposeClickStruct.f156040d = finderSearchResultExposeClickStruct.mo86045b("RequestId", str == null ? str6 : str, true);
        finderSearchResultExposeClickStruct.f156041e = finderSearchResultExposeClickStruct.mo86045b("Query", str2 == null ? str6 : str2, true);
        finderSearchResultExposeClickStruct.f156042f = i;
        finderSearchResultExposeClickStruct.f156043g = i2;
        String str8 = str3;
        finderSearchResultExposeClickStruct.f156044h = finderSearchResultExposeClickStruct.mo86045b("ItemId", str3, true);
        finderSearchResultExposeClickStruct.f156045i = i3;
        finderSearchResultExposeClickStruct.f156046j = i4;
        finderSearchResultExposeClickStruct.f156047k = i5;
        if (hj13 != null) {
            finderSearchResultExposeClickStruct.f156048l = finderSearchResultExposeClickStruct.mo86045b("SessionId", hj13.f134670d, true);
            finderSearchResultExposeClickStruct.f156050n = hj13.f134675i;
            finderSearchResultExposeClickStruct.f156049m = finderSearchResultExposeClickStruct.mo86045b("ClicktabcontextId", hj13.f134672f, true);
        }
        finderSearchResultExposeClickStruct.f156051o = finderSearchResultExposeClickStruct.mo86045b("SearchSessionid", str4, true);
        finderSearchResultExposeClickStruct.f156052p = i6;
        finderSearchResultExposeClickStruct.f156053q = i7;
        if (str7 != null) {
            str6 = str7;
        }
        finderSearchResultExposeClickStruct.f156055s = finderSearchResultExposeClickStruct.mo86045b("hotWordId", str6, true);
        finderSearchResultExposeClickStruct.f156056t = i16;
        finderSearchResultExposeClickStruct.mo86054n();
        C58417y0 y0Var2 = y0Var;
        y0Var.Ec0(finderSearchResultExposeClickStruct);
    }

    public static /* synthetic */ void ey0(C58417y0 y0Var, Context context, long j, boolean z, long j2, long j3, boolean z2, long j4, String str, String str2, int i, Object obj) {
        int i2 = i;
        y0Var.dy0(context, j, z, j2, j3, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? 0 : j4, (i2 & 128) != 0 ? "" : str, (i2 & 256) != 0 ? "" : str2);
    }

    public static void fy0(C58417y0 y0Var, Context context, long j, long j2, boolean z, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            z = false;
        }
        if ((i3 & 16) != 0) {
            i = 1;
        }
        if ((i3 & 32) != 0) {
            i2 = 1;
        }
        if ((i3 & 64) != 0) {
            str = "";
        }
        y0Var.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "udfKv");
        FinderSettingExposeStruct finderSettingExposeStruct = new FinderSettingExposeStruct();
        finderSettingExposeStruct.f156057d = j;
        finderSettingExposeStruct.f156058e = j2;
        finderSettingExposeStruct.f156059f = z ? 1 : 0;
        finderSettingExposeStruct.f156060g = (long) i;
        finderSettingExposeStruct.f156061h = (long) i2;
        finderSettingExposeStruct.f156062i = finderSettingExposeStruct.mo86045b("udf_kv", str, true);
        finderSettingExposeStruct.mo86054n();
        y0Var.Ec0(finderSettingExposeStruct);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void ky0(dp1.C58417y0 r40, long r41, int r43, long r44, java.lang.String r46, te3.C49712hj1 r47, long r48, com.tencent.p014mm.plugin.finder.storage.FinderItem r50, int r51, java.lang.Object r52) {
        /*
            r0 = r40
            r1 = r43
            r2 = r44
            r4 = r46
            r5 = r47
            r6 = r51 & 32
            if (r6 == 0) goto L_0x0011
            r9 = 0
            goto L_0x0013
        L_0x0011:
            r9 = r48
        L_0x0013:
            r6 = r51 & 64
            if (r6 == 0) goto L_0x0019
            r6 = 0
            goto L_0x001b
        L_0x0019:
            r6 = r50
        L_0x001b:
            r40.getClass()
            java.lang.Class<wc3.e0> r12 = wc3.C15133e0.class
            java.lang.String r13 = "receiver"
            gy3.C87412m.m108594g(r4, r13)
            if (r5 == 0) goto L_0x002c
            int r14 = r5.f134675i
            r7 = r41
            goto L_0x002f
        L_0x002c:
            r7 = r41
            r14 = 0
        L_0x002f:
            dp1.i2 r14 = r0.mo83349vP(r7, r14)
            if (r14 == 0) goto L_0x0038
            te3.we1 r14 = r14.f122975a
            goto L_0x0039
        L_0x0038:
            r14 = 0
        L_0x0039:
            java.lang.String r11 = ""
            if (r14 == 0) goto L_0x0041
            java.lang.String r15 = r14.f143989i
            if (r15 != 0) goto L_0x004a
        L_0x0041:
            if (r5 == 0) goto L_0x0046
            java.lang.String r15 = r5.f134681r
            goto L_0x0047
        L_0x0046:
            r15 = 0
        L_0x0047:
            if (r15 != 0) goto L_0x004a
            r15 = r11
        L_0x004a:
            c30.g r16 = new c30.g
            r16.<init>()
            c30.g r13 = new c30.g     // Catch:{ all -> 0x005e }
            r13.<init>((java.lang.String) r15)     // Catch:{ all -> 0x005e }
            java.lang.String r15 = "menu_exp_time"
            long r7 = dp1.C7433e1.f25623b     // Catch:{ all -> 0x005c }
            r13.mo145954o(r15, r7)     // Catch:{ all -> 0x005c }
            goto L_0x0067
        L_0x005c:
            r16 = r13
        L_0x005e:
            java.lang.String r7 = r0.f167350d
            java.lang.String r8 = "finderShareFeedReport json error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            r13 = r16
        L_0x0067:
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r40.Br0(r41)
            java.lang.String r8 = "udfKv.toString()"
            java.lang.String r15 = ";"
            r52 = r6
            java.lang.String r6 = ","
            r16 = 2
            r41 = r8
            java.lang.String r8 = "jump_id"
            r42 = r8
            java.lang.String r8 = "client_udf_kv"
            r18 = r8
            java.lang.String r8 = "SessionBuffer"
            r19 = r13
            java.lang.String r13 = "GroupID"
            r20 = r8
            java.lang.String r8 = "ExtraInfo"
            r21 = r14
            java.lang.String r14 = "ContextId"
            r22 = r13
            java.lang.String r13 = "ClickTabContextId"
            r23 = r8
            java.lang.String r8 = "TagId"
            r24 = r6
            java.lang.String r6 = "Tag"
            r25 = r15
            java.lang.String r15 = "CurrentPageName"
            r26 = r12
            java.lang.String r12 = "ForwardToUsr"
            r27 = r9
            java.lang.String r9 = "FeedUsr"
            java.lang.String r10 = "FeedId"
            r29 = r14
            java.lang.String r14 = "Sessionid"
            r30 = 1
            r32 = r13
            if (r7 == 0) goto L_0x0225
            com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct r13 = new com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct
            r13.<init>()
            r33 = r8
            if (r5 == 0) goto L_0x00bf
            java.lang.String r8 = r5.f134670d
            if (r8 != 0) goto L_0x00c0
        L_0x00bf:
            r8 = r11
        L_0x00c0:
            r5 = 1
            java.lang.String r8 = r13.mo86045b(r14, r8, r5)
            r13.f155322d = r8
            r8 = r6
            long r5 = (long) r1
            r13.f155323e = r5
            r13.f155324f = r2
            long r1 = r7.getId()
            java.lang.String r1 = r0.xx0(r1)
            r2 = 1
            java.lang.String r1 = r13.mo86045b(r10, r1, r2)
            r13.f155326h = r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r7.getFeedObject()
            java.lang.String r1 = r1.username
            java.lang.String r1 = r13.mo86045b(r9, r1, r2)
            r13.f155327i = r1
            java.lang.String r1 = r13.mo86045b(r12, r4, r2)
            r13.f155328j = r1
            int r1 = r7.getLikeCount()
            long r1 = (long) r1
            r13.f155329k = r1
            int r1 = r7.getCommentCount()
            long r1 = (long) r1
            r13.f155330l = r1
            int r1 = r7.getFriendLikeCount()
            long r1 = (long) r1
            r13.f155331m = r1
            r1 = 1
            java.lang.String r2 = r13.mo86045b(r15, r11, r1)
            r13.f155332n = r2
            int r2 = r7.getMediaType()
            long r2 = (long) r2
            r13.f155333o = r2
            r5 = r8
            java.lang.String r2 = r13.mo86045b(r5, r11, r1)
            r13.f155334p = r2
            r6 = r33
            java.lang.String r2 = r13.mo86045b(r6, r11, r1)
            r13.f155335q = r2
            r8 = r47
            if (r8 == 0) goto L_0x0128
            int r1 = r8.f134675i
            long r1 = (long) r1
            goto L_0x012a
        L_0x0128:
            r1 = 0
        L_0x012a:
            r13.f155336r = r1
            if (r8 == 0) goto L_0x0132
            java.lang.String r1 = r8.f134672f
            if (r1 != 0) goto L_0x0133
        L_0x0132:
            r1 = r11
        L_0x0133:
            r2 = r32
            r3 = 1
            java.lang.String r1 = r13.mo86045b(r2, r1, r3)
            r13.f155337s = r1
            if (r8 == 0) goto L_0x0142
            java.lang.String r1 = r8.f134671e
            if (r1 != 0) goto L_0x0143
        L_0x0142:
            r1 = r11
        L_0x0143:
            r2 = r29
            r3 = 1
            java.lang.String r1 = r13.mo86045b(r2, r1, r3)
            r13.f155338t = r1
            r1 = r27
            r13.f155340v = r1
            di3.d r1 = di3.C86312j.m106911c(r26)
            wc3.e0 r1 = (wc3.C15133e0) r1
            int r1 = r1.getItemCount()
            if (r1 <= 0) goto L_0x015f
            r1 = r30
            goto L_0x0161
        L_0x015f:
            r1 = 0
        L_0x0161:
            r13.f155319D = r1
            if (r8 == 0) goto L_0x0173
            java.lang.String r1 = r8.f134681r
            if (r1 == 0) goto L_0x0173
            r3 = r24
            r2 = r25
            r4 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r2, r4)
            goto L_0x0178
        L_0x0173:
            r3 = r24
            r2 = r25
            r1 = r11
        L_0x0178:
            r4 = r23
            r5 = 1
            java.lang.String r1 = r13.mo86045b(r4, r1, r5)
            r13.f155341w = r1
            if (r8 == 0) goto L_0x018d
            java.lang.String r1 = r8.f134682s
            if (r1 == 0) goto L_0x018d
            r4 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r2, r4)
            goto L_0x018e
        L_0x018d:
            r1 = r11
        L_0x018e:
            r13.mo76253s(r1)
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r7.getFinderObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x01a0
            te3.ve1 r1 = r1.feedBgmInfo
            if (r1 == 0) goto L_0x01a0
            java.lang.String r1 = r1.f185874e
            goto L_0x01a1
        L_0x01a0:
            r1 = 0
        L_0x01a1:
            r4 = r22
            r5 = 1
            java.lang.String r1 = r13.mo86045b(r4, r1, r5)
            r13.f155344z = r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r7.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x01b9
            te3.ve1 r1 = r1.feedBgmInfo
            if (r1 == 0) goto L_0x01b9
            te3.td1 r1 = r1.f185873d
            goto L_0x01ba
        L_0x01b9:
            r1 = 0
        L_0x01ba:
            if (r1 == 0) goto L_0x01e1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r7.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x01cf
            te3.ve1 r1 = r1.feedBgmInfo
            if (r1 == 0) goto L_0x01cf
            te3.td1 r1 = r1.f185873d
            if (r1 == 0) goto L_0x01cf
            java.lang.String r1 = r1.f185534d
            goto L_0x01d0
        L_0x01cf:
            r1 = 0
        L_0x01d0:
            if (r1 == 0) goto L_0x01db
            int r1 = r1.length()
            if (r1 != 0) goto L_0x01d9
            goto L_0x01db
        L_0x01d9:
            r1 = 0
            goto L_0x01dc
        L_0x01db:
            r1 = 1
        L_0x01dc:
            if (r1 != 0) goto L_0x01e1
            r4 = r16
            goto L_0x01e3
        L_0x01e1:
            r4 = r30
        L_0x01e3:
            r13.f155316A = r4
            if (r21 == 0) goto L_0x01ec
            r7 = r21
            java.lang.String r1 = r7.f143985e
            goto L_0x01ed
        L_0x01ec:
            r1 = 0
        L_0x01ed:
            r4 = r20
            r5 = 1
            java.lang.String r1 = r13.mo86045b(r4, r1, r5)
            r13.f155339u = r1
            java.lang.String r1 = r19.toString()
            r4 = r41
            gy3.C87412m.m108593f(r1, r4)
            r4 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r2, r4)
            r2 = r18
            java.lang.String r1 = r13.mo86045b(r2, r1, r5)
            r13.f155321F = r1
            if (r8 == 0) goto L_0x0214
            java.lang.String r1 = r8.f134686w
            if (r1 != 0) goto L_0x0213
            goto L_0x0214
        L_0x0213:
            r11 = r1
        L_0x0214:
            r1 = r42
            r2 = 1
            java.lang.String r1 = r13.mo86045b(r1, r11, r2)
            r13.f155320E = r1
            r13.mo86054n()
            r0.Ec0(r13)
            goto L_0x03a8
        L_0x0225:
            r36 = r42
            r37 = r18
            r38 = r20
            r13 = r24
            r34 = r27
            r7 = r29
            r0 = r32
            r39 = r8
            r8 = r5
            r5 = r6
            r6 = r39
            if (r52 == 0) goto L_0x03a8
            r24 = r13
            com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct r13 = new com.tencent.mm.autogen.mmdata.rpt.FinderForwardStruct
            r13.<init>()
            r29 = r7
            if (r8 == 0) goto L_0x024a
            java.lang.String r7 = r8.f134670d
            if (r7 != 0) goto L_0x024b
        L_0x024a:
            r7 = r11
        L_0x024b:
            r32 = r0
            r0 = 1
            java.lang.String r7 = r13.mo86045b(r14, r7, r0)
            r13.f155322d = r7
            long r0 = (long) r1
            r13.f155323e = r0
            r13.f155324f = r2
            long r0 = r52.getId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = 1
            java.lang.String r0 = r13.mo86045b(r10, r0, r1)
            r13.f155326h = r0
            java.lang.String r0 = r52.getUserName()
            java.lang.String r0 = r13.mo86045b(r9, r0, r1)
            r13.f155327i = r0
            java.lang.String r0 = r13.mo86045b(r12, r4, r1)
            r13.f155328j = r0
            r2 = 0
            r13.f155329k = r2
            r13.f155330l = r2
            r13.f155331m = r2
            java.lang.String r0 = r13.mo86045b(r15, r11, r1)
            r13.f155332n = r0
            int r0 = r52.getMediaType()
            long r9 = (long) r0
            r13.f155333o = r9
            java.lang.String r0 = r13.mo86045b(r5, r11, r1)
            r13.f155334p = r0
            java.lang.String r0 = r13.mo86045b(r6, r11, r1)
            r13.f155335q = r0
            if (r8 == 0) goto L_0x029f
            int r0 = r8.f134675i
            long r0 = (long) r0
            goto L_0x02a0
        L_0x029f:
            r0 = r2
        L_0x02a0:
            r13.f155336r = r0
            if (r8 == 0) goto L_0x02a8
            java.lang.String r0 = r8.f134672f
            if (r0 != 0) goto L_0x02a9
        L_0x02a8:
            r0 = r11
        L_0x02a9:
            r1 = r32
            r4 = 1
            java.lang.String r0 = r13.mo86045b(r1, r0, r4)
            r13.f155337s = r0
            if (r8 == 0) goto L_0x02b8
            java.lang.String r0 = r8.f134671e
            if (r0 != 0) goto L_0x02b9
        L_0x02b8:
            r0 = r11
        L_0x02b9:
            r1 = r29
            r4 = 1
            java.lang.String r0 = r13.mo86045b(r1, r0, r4)
            r13.f155338t = r0
            r0 = r34
            r13.f155340v = r0
            di3.d r0 = di3.C86312j.m106911c(r26)
            wc3.e0 r0 = (wc3.C15133e0) r0
            int r0 = r0.getItemCount()
            if (r0 <= 0) goto L_0x02d4
            r2 = r30
        L_0x02d4:
            r13.f155319D = r2
            if (r8 == 0) goto L_0x02e6
            java.lang.String r0 = r8.f134681r
            if (r0 == 0) goto L_0x02e6
            r2 = r24
            r1 = r25
            r3 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r2, r1, r3)
            goto L_0x02eb
        L_0x02e6:
            r2 = r24
            r1 = r25
            r0 = r11
        L_0x02eb:
            r3 = r23
            r4 = 1
            java.lang.String r0 = r13.mo86045b(r3, r0, r4)
            r13.f155341w = r0
            if (r8 == 0) goto L_0x0300
            java.lang.String r0 = r8.f134682s
            if (r0 == 0) goto L_0x0300
            r3 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r2, r1, r3)
            goto L_0x0302
        L_0x0300:
            r3 = 0
            r0 = r11
        L_0x0302:
            r13.mo76253s(r0)
            if (r8 == 0) goto L_0x0310
            java.lang.String r0 = r8.f134682s
            if (r0 == 0) goto L_0x0310
            java.lang.String r0 = z04.C112551y.m153814n(r0, r2, r1, r3)
            goto L_0x0311
        L_0x0310:
            r0 = r11
        L_0x0311:
            r13.mo76253s(r0)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r52.getFinderObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0323
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x0323
            java.lang.String r0 = r0.f185874e
            goto L_0x0324
        L_0x0323:
            r0 = 0
        L_0x0324:
            r3 = r22
            r4 = 1
            java.lang.String r0 = r13.mo86045b(r3, r0, r4)
            r13.f155344z = r0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r52.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x033c
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x033c
            te3.td1 r0 = r0.f185873d
            goto L_0x033d
        L_0x033c:
            r0 = 0
        L_0x033d:
            if (r0 == 0) goto L_0x0364
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r52.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0352
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x0352
            te3.td1 r0 = r0.f185873d
            if (r0 == 0) goto L_0x0352
            java.lang.String r0 = r0.f185534d
            goto L_0x0353
        L_0x0352:
            r0 = 0
        L_0x0353:
            if (r0 == 0) goto L_0x035e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x035c
            goto L_0x035e
        L_0x035c:
            r0 = 0
            goto L_0x035f
        L_0x035e:
            r0 = 1
        L_0x035f:
            if (r0 != 0) goto L_0x0364
            r3 = r16
            goto L_0x0366
        L_0x0364:
            r3 = r30
        L_0x0366:
            r13.f155316A = r3
            if (r21 == 0) goto L_0x036f
            r14 = r21
            java.lang.String r0 = r14.f143985e
            goto L_0x0370
        L_0x036f:
            r0 = 0
        L_0x0370:
            r3 = r38
            r4 = 1
            java.lang.String r0 = r13.mo86045b(r3, r0, r4)
            r13.f155339u = r0
            java.lang.String r0 = r19.toString()
            r3 = r41
            gy3.C87412m.m108593f(r0, r3)
            r3 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r2, r1, r3)
            r1 = r37
            java.lang.String r0 = r13.mo86045b(r1, r0, r4)
            r13.f155321F = r0
            if (r8 == 0) goto L_0x0397
            java.lang.String r0 = r8.f134686w
            if (r0 != 0) goto L_0x0396
            goto L_0x0397
        L_0x0396:
            r11 = r0
        L_0x0397:
            r0 = r36
            r1 = 1
            java.lang.String r0 = r13.mo86045b(r0, r11, r1)
            r13.f155320E = r0
            r13.mo86054n()
            r0 = r40
            r0.Ec0(r13)
        L_0x03a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58417y0.ky0(dp1.y0, long, int, long, java.lang.String, te3.hj1, long, com.tencent.mm.plugin.finder.storage.FinderItem, int, java.lang.Object):void");
    }

    /* renamed from: AJ */
    public final void mo83275AJ(long j, int i) {
        FinderItem Br0 = Br0(j);
        if (Br0 != null) {
            FeedManuClickStruct feedManuClickStruct = new FeedManuClickStruct();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            feedManuClickStruct.f155013d = feedManuClickStruct.mo86045b("SessionId", Wb, true);
            feedManuClickStruct.f155014e = feedManuClickStruct.mo86045b("FeedId", C61926c.m72691p(Br0.getId()), true);
            long j2 = (long) i;
            feedManuClickStruct.f155021l = j2;
            feedManuClickStruct.f155015f = (long) Br0.getLikeCount();
            feedManuClickStruct.f155016g = (long) Br0.getCommentCount();
            feedManuClickStruct.f155017h = (long) Br0.getFriendLikeCount();
            feedManuClickStruct.f155020k = (long) Br0.getMediaType();
            feedManuClickStruct.f155018i = feedManuClickStruct.mo86045b("CurrentPageName", "", true);
            feedManuClickStruct.f155019j = j2;
            feedManuClickStruct.mo86054n();
            Ec0(feedManuClickStruct);
        }
    }

    public final void Ax0(long j, String str, int i, long j2, int i2) {
        C87412m.m108594g(str, "topic");
        FinderItem Br0 = Br0(j);
        if (Br0 != null) {
            FinderTagClickStruct finderTagClickStruct = new FinderTagClickStruct();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            finderTagClickStruct.f156130d = finderTagClickStruct.mo86045b("SessionId", Wb, true);
            finderTagClickStruct.f156131e = finderTagClickStruct.mo86045b("CurrentPageName", "", true);
            finderTagClickStruct.f156132f = (long) i2;
            finderTagClickStruct.f156133g = finderTagClickStruct.mo86045b("feedid", xx0(Br0.getId()), true);
            finderTagClickStruct.f156134h = (long) Br0.getMediaType();
            finderTagClickStruct.f156135i = finderTagClickStruct.mo86045b("Tag", C112551y.m153814n(C58771q3.f168268a.mo83811b(str, i, j2), ",", ";", false), true);
            finderTagClickStruct.f156136j = finderTagClickStruct.mo86045b("TagId", "", true);
            finderTagClickStruct.f156137k = (long) Br0.getFeedObject().likeCount;
            finderTagClickStruct.f156138l = (long) Br0.getFeedObject().commentCount;
            finderTagClickStruct.f156139m = (long) Br0.getFeedObject().friendLikeCount;
            finderTagClickStruct.mo86054n();
            Ec0(finderTagClickStruct);
        }
    }

    public final void Ay0(long j, long j2, long j3, C49712hj1 hj12) {
        ActivityBrowseClickStruct activityBrowseClickStruct = new ActivityBrowseClickStruct();
        activityBrowseClickStruct.f154921h = j;
        activityBrowseClickStruct.f154922i = activityBrowseClickStruct.mo86045b("EventTime", String.valueOf(C31543z5.m39453c()), true);
        activityBrowseClickStruct.f154923j = j2;
        activityBrowseClickStruct.f154924k = activityBrowseClickStruct.mo86045b("ActivityId", C61926c.m72691p(j3), true);
        activityBrowseClickStruct.f154920g = hj12 != null ? (long) hj12.f134675i : 0;
        String str = null;
        activityBrowseClickStruct.f154917d = activityBrowseClickStruct.mo86045b("SessionId", hj12 != null ? hj12.f134670d : null, true);
        activityBrowseClickStruct.f154918e = activityBrowseClickStruct.mo86045b("ClickTabContextid", hj12 != null ? hj12.f134672f : null, true);
        if (hj12 != null) {
            str = hj12.f134671e;
        }
        activityBrowseClickStruct.f154919f = activityBrowseClickStruct.mo86045b("FinderContexId", str, true);
        activityBrowseClickStruct.mo86054n();
        Ec0(activityBrowseClickStruct);
    }

    public final FinderItem Br0(long j) {
        FinderItem e = C65834e.f189316a.mo89871e(j);
        if (e != null) {
            return e;
        }
        C8703w0 w0Var = C8703w0.f27927a;
        FinderItem finderItem = C8703w0.f27930d.get(Long.valueOf(j));
        if (finderItem != null) {
            return finderItem;
        }
        ConcurrentHashMap<Long, FinderItem> concurrentHashMap = FinderTopicFeedUI.f14881D;
        FinderItem finderItem2 = FinderTopicFeedUI.f14881D.get(Long.valueOf(j));
        if (finderItem2 != null) {
            return finderItem2;
        }
        ConcurrentHashMap<Long, FinderItem> concurrentHashMap2 = FinderAtTimelineUI.f14230G;
        return FinderAtTimelineUI.f14230G.get(Long.valueOf(j));
    }

    public final void Bx0(long j, int i) {
        FinderItem Br0 = Br0(j);
        if (Br0 != null) {
            FinderProfileFeedClickStruct finderProfileFeedClickStruct = new FinderProfileFeedClickStruct();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            finderProfileFeedClickStruct.f155909d = finderProfileFeedClickStruct.mo86045b("SessionId", Wb, true);
            finderProfileFeedClickStruct.f155910e = (long) i;
            finderProfileFeedClickStruct.f155911f = finderProfileFeedClickStruct.mo86045b("Tag", C112551y.m153814n(C58771q3.f168268a.mo83810a(Br0), ",", ";", false), true);
            finderProfileFeedClickStruct.f155912g = finderProfileFeedClickStruct.mo86045b("TagId", "", true);
            finderProfileFeedClickStruct.f155913h = finderProfileFeedClickStruct.mo86045b("feedid", xx0(Br0.getId()), true);
            finderProfileFeedClickStruct.f155914i = (long) Br0.getFeedObject().likeCount;
            finderProfileFeedClickStruct.mo86054n();
            Ec0(finderProfileFeedClickStruct);
        }
    }

    public final void By0(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        String str = null;
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        FinderProfilePostBtnReportStruct finderProfilePostBtnReportStruct = new FinderProfilePostBtnReportStruct();
        finderProfilePostBtnReportStruct.f155915d = finderProfilePostBtnReportStruct.mo86045b("SessionId", q3 != null ? q3.f134670d : null, true);
        finderProfilePostBtnReportStruct.f155916e = finderProfilePostBtnReportStruct.mo86045b("ClickTabContextid", q3 != null ? q3.f134672f : null, true);
        finderProfilePostBtnReportStruct.f155918g = q3 != null ? (long) q3.f134675i : 0;
        finderProfilePostBtnReportStruct.f155920i = finderProfilePostBtnReportStruct.mo86045b("EventTime", String.valueOf(System.currentTimeMillis()), true);
        if (q3 != null) {
            str = q3.f134671e;
        }
        finderProfilePostBtnReportStruct.f155917f = finderProfilePostBtnReportStruct.mo86045b("FinderContexId", str, true);
        finderProfilePostBtnReportStruct.f155919h = (long) i;
        finderProfilePostBtnReportStruct.f155921j = (long) i2;
        finderProfilePostBtnReportStruct.mo86054n();
        Ec0(finderProfilePostBtnReportStruct);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        r3 = (r3 = r3.f122975a).f143985e;
     */
    /* renamed from: Cu */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo83281Cu(long r3, int r5) {
        /*
            r2 = this;
            java.util.HashMap<java.lang.String, dp1.i2> r0 = r2.f167354h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r3 = 95
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            java.lang.Object r3 = r0.get(r3)
            dp1.i2 r3 = (dp1.C45435i2) r3
            if (r3 == 0) goto L_0x0026
            te3.we1 r3 = r3.f122975a
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f143985e
            if (r3 != 0) goto L_0x0028
        L_0x0026:
            java.lang.String r3 = ""
        L_0x0028:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58417y0.mo83281Cu(long, int):java.lang.String");
    }

    public final void Cx0(int i, String str, String str2, C49712hj1 hj12) {
        C87412m.m108594g(str, "eid");
        C87412m.m108594g(str2, "udfKv");
        FinderShowInWXProfileStruct finderShowInWXProfileStruct = new FinderShowInWXProfileStruct();
        finderShowInWXProfileStruct.f9902g = i;
        finderShowInWXProfileStruct.mo1039u(String.valueOf(C31543z5.m39453c()));
        finderShowInWXProfileStruct.mo1038t(str);
        finderShowInWXProfileStruct.mo1042x(str2);
        if (hj12 != null) {
            String str3 = hj12.f134670d;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            finderShowInWXProfileStruct.mo1041w(str3);
            String str5 = hj12.f134671e;
            if (str5 == null) {
                str5 = str4;
            }
            finderShowInWXProfileStruct.mo1040v(str5);
            finderShowInWXProfileStruct.mo1037s(String.valueOf(hj12.f134675i));
            String str6 = hj12.f134672f;
            if (str6 != null) {
                str4 = str6;
            }
            finderShowInWXProfileStruct.f9906k = finderShowInWXProfileStruct.mo86045b("clicktabcontextid", str4, true);
            finderShowInWXProfileStruct.f9907l = finderShowInWXProfileStruct.mo86045b("ref_commentscene", String.valueOf(hj12.f134677n), true);
        }
        finderShowInWXProfileStruct.mo86054n();
        Ec0(finderShowInWXProfileStruct);
    }

    public final void Cy0(FinderPoiFeedUI.C3005a aVar, long j, C49712hj1 hj12, String str, String str2, String str3, long j2) {
        C87412m.m108594g(aVar, "action");
        NewPoiDetailFinderStruct newPoiDetailFinderStruct = new NewPoiDetailFinderStruct();
        newPoiDetailFinderStruct.f156698d = (long) aVar.ordinal();
        newPoiDetailFinderStruct.f156699e = C31543z5.m39453c();
        newPoiDetailFinderStruct.f156700f = j2;
        newPoiDetailFinderStruct.f156701g = j;
        String str4 = null;
        newPoiDetailFinderStruct.f156702h = newPoiDetailFinderStruct.mo86045b("Contextid", hj12 != null ? hj12.f134671e : null, true);
        if (hj12 != null) {
            str4 = hj12.f134670d;
        }
        newPoiDetailFinderStruct.f156703i = newPoiDetailFinderStruct.mo86045b("Sessionid", str4, true);
        newPoiDetailFinderStruct.f156704j = newPoiDetailFinderStruct.mo86045b("POIID", str, true);
        newPoiDetailFinderStruct.f156705k = newPoiDetailFinderStruct.mo86045b("POIDetail", str2, true);
        newPoiDetailFinderStruct.f156707m = newPoiDetailFinderStruct.mo86045b("sourceid", str3, true);
        newPoiDetailFinderStruct.mo86054n();
        Ec0(newPoiDetailFinderStruct);
    }

    public final void Dx0(int i, int i2, int i3, boolean z, int i4, int i5, int i6, boolean z2, boolean z3, C49712hj1 hj12) {
        String str;
        String str2;
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        StringBuilder sb = new StringBuilder();
        sb.append(Wb);
        sb.append(',');
        sb.append(i);
        sb.append(',');
        sb.append(i2);
        sb.append(',');
        sb.append(i3);
        sb.append(',');
        sb.append(z ? 1 : 0);
        sb.append(',');
        sb.append(i4);
        sb.append(',');
        sb.append(i5);
        sb.append(',');
        sb.append(i6);
        sb.append(',');
        sb.append(z2 ? 1 : 0);
        sb.append(',');
        sb.append(z3 ^ true ? 1 : 0);
        sb.append(',');
        String str3 = "";
        if (hj12 == null || (str = hj12.f134671e) == null) {
            str = str3;
        }
        sb.append(str);
        sb.append(',');
        if (!(hj12 == null || (str2 = hj12.f134672f) == null)) {
            str3 = str2;
        }
        sb.append(str3);
        String sb4 = sb.toString();
        String str4 = this.f167350d;
        Log.m105924i(str4, "18947 " + sb4);
        C117407d.INSTANCE.kvStat(18947, sb4);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[Catch:{ all -> 0x0066 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ec0(kj2.C61103a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "struct"
            gy3.C87412m.m108594g(r11, r0)
            boolean r0 = r11 instanceof com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedDataStruct
            java.lang.String r1 = " "
            java.lang.String r2 = "\r\n"
            java.lang.String r3 = "struct.toShowString()"
            r4 = 32
            java.lang.String r5 = "report"
            r6 = 0
            if (r0 == 0) goto L_0x006b
            r0 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r0 = (com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedDataStruct) r0
            java.lang.String r7 = r0.f155238k
            r8 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r8 = (com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedDataStruct) r8     // Catch:{ all -> 0x0066 }
            r9 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r9 = (com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedDataStruct) r9     // Catch:{ all -> 0x0066 }
            java.lang.String r9 = r9.f155238k     // Catch:{ all -> 0x0066 }
            if (r9 == 0) goto L_0x002e
            int r9 = r9.length()     // Catch:{ all -> 0x0066 }
            if (r9 != 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r9 = 0
            goto L_0x002f
        L_0x002e:
            r9 = 1
        L_0x002f:
            if (r9 != 0) goto L_0x0034
            java.lang.String r9 = "..."
            goto L_0x0035
        L_0x0034:
            r9 = r7
        L_0x0035:
            r8.mo76252s(r9)     // Catch:{ all -> 0x0066 }
            java.lang.String r8 = r10.f167350d     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r9.<init>()     // Catch:{ all -> 0x0066 }
            r9.append(r5)     // Catch:{ all -> 0x0066 }
            r5 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r5 = (com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedDataStruct) r5     // Catch:{ all -> 0x0066 }
            r5 = 18054(0x4686, float:2.5299E-41)
            r9.append(r5)     // Catch:{ all -> 0x0066 }
            r9.append(r4)     // Catch:{ all -> 0x0066 }
            java.lang.String r11 = r11.mo1006q()     // Catch:{ all -> 0x0066 }
            gy3.C87412m.m108593f(r11, r3)     // Catch:{ all -> 0x0066 }
            java.lang.String r11 = z04.C112551y.m153814n(r11, r2, r1, r6)     // Catch:{ all -> 0x0066 }
            r9.append(r11)     // Catch:{ all -> 0x0066 }
            java.lang.String r11 = r9.toString()     // Catch:{ all -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r11)     // Catch:{ all -> 0x0066 }
            r0.mo76252s(r7)
            goto L_0x0094
        L_0x0066:
            r11 = move-exception
            r0.mo76252s(r7)
            throw r11
        L_0x006b:
            java.lang.String r0 = r10.f167350d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            int r5 = r11.mo1004j()
            r7.append(r5)
            r7.append(r4)
            java.lang.String r11 = r11.mo1006q()
            gy3.C87412m.m108593f(r11, r3)
            java.lang.String r11 = z04.C112551y.m153814n(r11, r2, r1, r6)
            r7.append(r11)
            java.lang.String r11 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58417y0.Ec0(kj2.a):void");
    }

    public final void Ex0(long j) {
        FinderItem Br0 = Br0(j);
        if (Br0 != null) {
            FinderObject feedObject = Br0.getFeedObject();
            String str = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb() + ',' + xx0(feedObject.f164794id) + ',' + feedObject.username + ',' + feedObject.recommendType + ',' + Br0.getMediaType();
            Log.m105924i(this.f167350d, "18974 " + str);
            C117407d.INSTANCE.kvStat(18974, str);
        }
    }

    public final void Ey0(String str, int i, C49712hj1 hj12, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "resId");
        WeAppAtChannelsStruct weAppAtChannelsStruct = new WeAppAtChannelsStruct();
        weAppAtChannelsStruct.f156955d = weAppAtChannelsStruct.mo86045b("AppID", str, true);
        weAppAtChannelsStruct.f156956e = (long) i;
        weAppAtChannelsStruct.f156961j = weAppAtChannelsStruct.mo86045b("pageResrouceID", str2, true);
        if (hj12 != null) {
            weAppAtChannelsStruct.f156958g = weAppAtChannelsStruct.mo86045b("ContextId", hj12.f134671e, true);
            weAppAtChannelsStruct.f156960i = (long) hj12.f134675i;
            weAppAtChannelsStruct.f156959h = weAppAtChannelsStruct.mo86045b("click_tab_context_id", hj12.f134672f, true);
            weAppAtChannelsStruct.f156957f = weAppAtChannelsStruct.mo86045b("sessionID", hj12.f134670d, true);
        }
        weAppAtChannelsStruct.mo86054n();
        Ec0(weAppAtChannelsStruct);
    }

    public final void Fx0(String str, String str2, int i, int i2, int i3, int i4, C49712hj1 hj12, String str3, String str4) {
        FinderHotSearchClickStruct finderHotSearchClickStruct = new FinderHotSearchClickStruct();
        if (hj12 != null) {
            finderHotSearchClickStruct.f155350d = finderHotSearchClickStruct.mo86045b("sessionid", hj12.f134670d, true);
            finderHotSearchClickStruct.f155351e = finderHotSearchClickStruct.mo86045b("clickTabContextid", hj12.f134672f, true);
            finderHotSearchClickStruct.f155352f = hj12.f134675i;
        }
        finderHotSearchClickStruct.f155358l = finderHotSearchClickStruct.mo86045b("reasonId", str2 != null ? C112551y.m153814n(str2, ",", ";", false) : "", true);
        finderHotSearchClickStruct.f155353g = finderHotSearchClickStruct.mo86045b("ItemId", str, true);
        finderHotSearchClickStruct.f155354h = i;
        finderHotSearchClickStruct.f155355i = i2;
        finderHotSearchClickStruct.f155356j = i3;
        finderHotSearchClickStruct.f155357k = i4;
        finderHotSearchClickStruct.f155359m = finderHotSearchClickStruct.mo86045b("hotWordId", str3, true);
        finderHotSearchClickStruct.f155360n = finderHotSearchClickStruct.mo86045b("requestId", str4, true);
        finderHotSearchClickStruct.mo86054n();
        Ec0(finderHotSearchClickStruct);
    }

    public final void Fy0(int i, String str, String str2, C49712hj1 hj12) {
        C87412m.m108594g(str, "eid");
        C87412m.m108594g(str2, "udfKv");
        MentionedFeedFilterStruct mentionedFeedFilterStruct = new MentionedFeedFilterStruct();
        mentionedFeedFilterStruct.f156503f = i;
        mentionedFeedFilterStruct.f156504g = mentionedFeedFilterStruct.mo86045b("event_time", String.valueOf(C31543z5.m39453c()), true);
        mentionedFeedFilterStruct.f156505h = mentionedFeedFilterStruct.mo86045b("eid", str, true);
        mentionedFeedFilterStruct.f156506i = mentionedFeedFilterStruct.mo86045b("udf_kv", C112551y.m153814n(str2, ",", ";", false), true);
        if (hj12 != null) {
            mentionedFeedFilterStruct.f156501d = mentionedFeedFilterStruct.mo86045b("sessionid", hj12.f134670d, true);
            mentionedFeedFilterStruct.f156502e = mentionedFeedFilterStruct.mo86045b("findercontextid", hj12.f134672f, true);
        }
        mentionedFeedFilterStruct.mo86054n();
        Ec0(mentionedFeedFilterStruct);
    }

    /* renamed from: Gr */
    public void mo83290Gr(Context context, boolean z, boolean z2, String str, String str2, String str3, String str4, long j, long j2, String str5, String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        Context context2 = context;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str7, "liveid");
        C87412m.m108594g(str8, "finderid");
        C87412m.m108594g(str9, "shopwindowid");
        C87412m.m108594g(str10, "sessionid");
        C87412m.m108594g(str11, "appuin");
        C87412m.m108594g(str12, "appVersion");
        FinderLivePreWarmEndReportStruct finderLivePreWarmEndReportStruct = new FinderLivePreWarmEndReportStruct();
        finderLivePreWarmEndReportStruct.f155601d = finderLivePreWarmEndReportStruct.mo86045b("appuin", str11, true);
        finderLivePreWarmEndReportStruct.f155603f = 10;
        finderLivePreWarmEndReportStruct.f155602e = finderLivePreWarmEndReportStruct.mo86045b("appversion", str12, true);
        finderLivePreWarmEndReportStruct.f155610m = z ? 1 : 0;
        finderLivePreWarmEndReportStruct.f155611n = z2 ? 1 : 0;
        finderLivePreWarmEndReportStruct.f155605h = finderLivePreWarmEndReportStruct.mo86045b("liveid", str7, true);
        finderLivePreWarmEndReportStruct.f155606i = finderLivePreWarmEndReportStruct.mo86045b("finderid", str8, true);
        finderLivePreWarmEndReportStruct.f155607j = finderLivePreWarmEndReportStruct.mo86045b("shopwindowid", str9, true);
        finderLivePreWarmEndReportStruct.f155608k = finderLivePreWarmEndReportStruct.mo86045b("sessionid", str10, true);
        finderLivePreWarmEndReportStruct.f155609l = 0;
        finderLivePreWarmEndReportStruct.f155604g = finderLivePreWarmEndReportStruct.mo86045b("networktype", String.valueOf(NetworkUtil.getCurrentNetWorkStatus(context)), true);
        finderLivePreWarmEndReportStruct.f155612o = j;
        finderLivePreWarmEndReportStruct.f155613p = j2;
        finderLivePreWarmEndReportStruct.mo86054n();
    }

    public final void Gy0(long j, int i, int i2, int i3, int i4, String str, C49712hj1 hj12) {
        C87412m.m108594g(str, "mutualAdInfo");
        FinderAdIconExpoClickNewStruct finderAdIconExpoClickNewStruct = new FinderAdIconExpoClickNewStruct();
        finderAdIconExpoClickNewStruct.f155022d = finderAdIconExpoClickNewStruct.mo86045b("feedid", xx0(j), true);
        finderAdIconExpoClickNewStruct.f155024f = (long) i;
        finderAdIconExpoClickNewStruct.f155025g = (long) i2;
        if (i2 == 2) {
            C104289g gVar = new C104289g();
            gVar.mo145953n("duration", i4);
            gVar.mo145953n("playpercent", (int) (((((float) i3) * 1.0f) / ((float) i4)) * ((float) 100)));
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "playInfo.toString()");
            finderAdIconExpoClickNewStruct.f155026h = finderAdIconExpoClickNewStruct.mo86045b("feedplayinfo", C112551y.m153814n(gVar2, ",", ";", false), true);
        }
        finderAdIconExpoClickNewStruct.f155027i = finderAdIconExpoClickNewStruct.mo86045b("MutualAdInfo", C112551y.m153814n(str, ",", ";", false), true);
        if (hj12 != null) {
            String str2 = hj12.f134681r;
            String str3 = "";
            finderAdIconExpoClickNewStruct.f155030l = finderAdIconExpoClickNewStruct.mo86045b("ExtraInfo", str2 != null ? C112551y.m153814n(str2, ",", ";", false) : str3, true);
            String str4 = hj12.f134682s;
            if (str4 != null) {
                str3 = C112551y.m153814n(str4, ",", ";", false);
            }
            finderAdIconExpoClickNewStruct.f155031m = finderAdIconExpoClickNewStruct.mo86045b("enterSourceInfo", str3, true);
            finderAdIconExpoClickNewStruct.f155028j = finderAdIconExpoClickNewStruct.mo86045b("sessionbuffer", C112551y.m153814n(((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(j, hj12.f134675i), ",", ";", false), true);
            finderAdIconExpoClickNewStruct.f155029k = finderAdIconExpoClickNewStruct.mo86045b("Contextid", hj12.f134671e, true);
            finderAdIconExpoClickNewStruct.f155023e = (long) hj12.f134675i;
        }
        finderAdIconExpoClickNewStruct.mo86054n();
        Ec0(finderAdIconExpoClickNewStruct);
    }

    public void H90(long j, int i, long j2, boolean z, boolean z2, int i2, C104289g gVar, String str, int i3, int i4, int i5, int i6) {
        C104289g gVar2 = gVar;
        C87412m.m108594g(gVar2, "data");
        C87412m.m108594g(str, "bypassData");
        int i7 = 1;
        int i8 = z2 ? 2 : 1;
        if (!z) {
            i7 = 0;
        }
        try {
            C104289g gVar3 = new C104289g();
            gVar3.mo145953n("report_type", i8);
            String optString = gVar2.optString("apurl");
            String optString2 = gVar2.optString("rl");
            if (z2) {
                optString = optString2;
            }
            gVar3.put("report_link", optString);
            gVar3.mo145953n("exposure_type", i7);
            gVar3.put("pos_id", gVar2.optString("ad_posid"));
            gVar3.mo145953n("click_pos", i2);
            gVar3.mo145953n("outer_duration", i3);
            gVar3.mo145953n("play_count", i4);
            gVar3.mo145953n("play_total_time", i5);
            gVar3.mo145953n("video_total_time", i6);
            gVar3.put("report_extra_data", gVar2.opt("report_extra_data"));
            gVar3.mo145954o("report_ts", C31543z5.m39453c());
            String gVar4 = gVar3.toString();
            C87412m.m108593f(gVar4, "json.toString()");
            C86709a0.m107524d().mo123460f(new C33559s2(j, i, gVar4, str));
        } catch (Exception unused) {
            long j3 = j2;
            C11348f.C11349a.m11178b(C59319a.f169618b, "finderCommentAdReport", false, (C11348f.C11352b) null, false, false, new C31233a(j2), 28, (Object) null);
        }
    }

    public final void Hx0(Context context, int i) {
        C87412m.m108594g(context, "context");
        FinderLocationRequestStruct finderLocationRequestStruct = new FinderLocationRequestStruct();
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        if (f != null) {
            finderLocationRequestStruct.f79116e = finderLocationRequestStruct.mo86045b("SessionId", f.f38099o, true);
        } else {
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            finderLocationRequestStruct.f79116e = finderLocationRequestStruct.mo86045b("SessionId", Wb, true);
        }
        finderLocationRequestStruct.f79115d = (long) i;
        finderLocationRequestStruct.mo86054n();
        Ec0(finderLocationRequestStruct);
    }

    public final void Hy0(Context context, boolean z, boolean z2, int i, boolean z3) {
        C87412m.m108594g(context, "context");
        C104289g gVar = new C104289g();
        gVar.mo145953n("is_logo", z2 ? 1 : 0);
        gVar.mo145953n("finder_type", i);
        if (z) {
            gVar.mo145953n("click_type", z3 ? 1 : 2);
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "kvJson.toString()");
        String n = C112551y.m153814n(gVar2, ",", ";", false);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        Cx0(z ? 1 : 0, "comment_avatar", n, f != null ? f.mo12861q3() : null);
    }

    public final void Ix0(int i, int i2, int i3) {
        FinderModeMessageStruct finderModeMessageStruct = new FinderModeMessageStruct();
        finderModeMessageStruct.f155710d = (long) i;
        finderModeMessageStruct.f155711e = (long) i2;
        finderModeMessageStruct.f155712f = (long) i3;
        finderModeMessageStruct.mo86054n();
        Ec0(finderModeMessageStruct);
    }

    public final void Jx0(C49712hj1 hj12, long j, int i, String str) {
        C87412m.m108594g(hj12, "contextObj");
        if (Br0(j) != null) {
            FinderRealLikeActionStruct finderRealLikeActionStruct = new FinderRealLikeActionStruct();
            finderRealLikeActionStruct.f155928j = (long) hj12.f134675i;
            finderRealLikeActionStruct.f155926h = finderRealLikeActionStruct.mo86045b("ContextId", hj12.f134671e, true);
            finderRealLikeActionStruct.f155927i = finderRealLikeActionStruct.mo86045b("ClickTabContextId", hj12.f134672f, true);
            finderRealLikeActionStruct.f155925g = finderRealLikeActionStruct.mo86045b("SessionId", hj12.f134670d, true);
            finderRealLikeActionStruct.f155924f = finderRealLikeActionStruct.mo86045b("Feedid", C61926c.m72691p(j), true);
            if (str == null) {
                str = "";
            }
            finderRealLikeActionStruct.f155923e = finderRealLikeActionStruct.mo86045b("Username", str, true);
            finderRealLikeActionStruct.f155922d = (long) i;
            finderRealLikeActionStruct.mo86054n();
            Ec0(finderRealLikeActionStruct);
        }
    }

    public final void Jy0(C49712hj1 hj12, boolean z, int i, String str) {
        C87412m.m108594g(str, "referer");
        int i2 = z ? 1 : 0;
        try {
            C104289g gVar = new C104289g();
            gVar.mo145953n(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
            byte[] decode = Base64.decode(str, 0);
            C87412m.m108593f(decode, "decode(referer, Base64.DEFAULT)");
            gVar.put("referer", new C104289g(new String(decode, C119027c.f356488a)));
            C104289g gVar2 = new C104289g();
            gVar2.put("jump_info", gVar);
            gVar2.mo145953n("position", i - 1);
            C7435f2.f25626a.mo8577a(hj12, "feed_jumpicon", i2, gVar2);
        } catch (JSONException e) {
            Log.m105920e(this.f167350d, e.getMessage());
        }
    }

    /* renamed from: K6 */
    public void mo83298K6(Context context, boolean z, int i, String str, String str2, int i2, String str3, boolean z2, boolean z3, String str4, String str5, String str6, String str7) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        Context context2 = context;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str8, "clickId");
        C87412m.m108594g(str9, "appId");
        C87412m.m108594g(str10, "preWarmPath");
        C87412m.m108594g(str11, "liveid");
        C87412m.m108594g(str12, "finderid");
        C87412m.m108594g(str13, "shopwindowid");
        C87412m.m108594g(str14, "sessionid");
        FinderLiveOpenWxaShopReportStruct finderLiveOpenWxaShopReportStruct = new FinderLiveOpenWxaShopReportStruct();
        finderLiveOpenWxaShopReportStruct.f155553i = i2;
        finderLiveOpenWxaShopReportStruct.f155548d = z ? 1 : 0;
        finderLiveOpenWxaShopReportStruct.f155549e = i;
        finderLiveOpenWxaShopReportStruct.f155563s = finderLiveOpenWxaShopReportStruct.mo86045b("clickId", str8, true);
        finderLiveOpenWxaShopReportStruct.f155550f = finderLiveOpenWxaShopReportStruct.mo86045b("appId", str9, true);
        finderLiveOpenWxaShopReportStruct.f155551g = 0;
        finderLiveOpenWxaShopReportStruct.f155555k = finderLiveOpenWxaShopReportStruct.mo86045b("preWarmPath", str10, true);
        finderLiveOpenWxaShopReportStruct.f155556l = z2 ? 1 : 0;
        finderLiveOpenWxaShopReportStruct.f155557m = z3 ? 1 : 0;
        finderLiveOpenWxaShopReportStruct.f155558n = finderLiveOpenWxaShopReportStruct.mo86045b("liveId", str11, true);
        finderLiveOpenWxaShopReportStruct.f155559o = finderLiveOpenWxaShopReportStruct.mo86045b("finderId", str12, true);
        finderLiveOpenWxaShopReportStruct.f155560p = finderLiveOpenWxaShopReportStruct.mo86045b("shopwindowId", str13, true);
        finderLiveOpenWxaShopReportStruct.f155561q = finderLiveOpenWxaShopReportStruct.mo86045b("sessionId", str14, true);
        finderLiveOpenWxaShopReportStruct.f155552h = 10;
        finderLiveOpenWxaShopReportStruct.f155554j = finderLiveOpenWxaShopReportStruct.mo86045b("networkType", String.valueOf(NetworkUtil.getCurrentNetWorkStatus(context)), true);
        finderLiveOpenWxaShopReportStruct.f155562r = C31543z5.m39453c();
        finderLiveOpenWxaShopReportStruct.mo86054n();
    }

    public final void Kx0(C49712hj1 hj12, String str, long j, int i, String str2) {
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(str, "exposeItems");
        C87412m.m108594g(str2, "enterContextId");
        if (Br0(j) != null) {
            FinderRealLikeExposeStruct finderRealLikeExposeStruct = new FinderRealLikeExposeStruct();
            finderRealLikeExposeStruct.f155935j = (long) hj12.f134675i;
            finderRealLikeExposeStruct.f155930e = finderRealLikeExposeStruct.mo86045b("ContextId", hj12.f134671e, true);
            finderRealLikeExposeStruct.f155931f = finderRealLikeExposeStruct.mo86045b("ClickTabContextId", hj12.f134672f, true);
            finderRealLikeExposeStruct.f155937l = finderRealLikeExposeStruct.mo86045b("EnterContextId", str2, true);
            finderRealLikeExposeStruct.f155929d = finderRealLikeExposeStruct.mo86045b("SessionId", hj12.f134670d, true);
            finderRealLikeExposeStruct.f155934i = finderRealLikeExposeStruct.mo86045b("FeedId", C61926c.m72691p(j), true);
            finderRealLikeExposeStruct.f155933h = i > 0 ? 1 : 0;
            finderRealLikeExposeStruct.f155932g = finderRealLikeExposeStruct.mo86045b("ExposeItems", str, true);
            finderRealLikeExposeStruct.f155936k = (long) i;
            finderRealLikeExposeStruct.mo86054n();
            Ec0(finderRealLikeExposeStruct);
        }
    }

    public final void Ky0(long j, long j2, long j3, String str, long j4, int i) {
        C87412m.m108594g(str, "paperWording");
        DailyPaperExpoClickStruct dailyPaperExpoClickStruct = new DailyPaperExpoClickStruct();
        dailyPaperExpoClickStruct.f154952d = dailyPaperExpoClickStruct.mo86045b("Feedid", xx0(j), true);
        dailyPaperExpoClickStruct.f154954f = j2;
        dailyPaperExpoClickStruct.f154955g = dailyPaperExpoClickStruct.mo86045b("DailyPaperId", xx0(j3), true);
        dailyPaperExpoClickStruct.f154956h = dailyPaperExpoClickStruct.mo86045b("DailyPaperWording", str, true);
        dailyPaperExpoClickStruct.f154958j = j4;
        long c = C31543z5.m39453c();
        dailyPaperExpoClickStruct.f154953e = c;
        dailyPaperExpoClickStruct.mo86048e("actiontimestampms", c);
        dailyPaperExpoClickStruct.f154957i = dailyPaperExpoClickStruct.mo86045b("SessionBuffer", mo83281Cu(j, i), true);
        dailyPaperExpoClickStruct.mo86054n();
        Ec0(dailyPaperExpoClickStruct);
    }

    public final void Lx0(String str, int i, int i2, int i3, int i4, int i5, String str2, String str3, long j, C49712hj1 hj12, int i6, int i7, String str4) {
        String str5;
        String str6;
        String str7 = str;
        String str8 = str3;
        C49712hj1 hj13 = hj12;
        String str9 = str4;
        C87412m.m108594g(str, "currUI");
        C87412m.m108594g(str8, "redDotWording");
        C87412m.m108594g(str9, "report_ext_info");
        FinderRedDotStruct finderRedDotStruct = new FinderRedDotStruct();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String str10 = "";
        if (Wb == null) {
            Wb = str10;
        }
        finderRedDotStruct.f155988d = finderRedDotStruct.mo86045b("SessionId", Wb, true);
        finderRedDotStruct.f155989e = finderRedDotStruct.mo86045b("CurrUI", str, true);
        finderRedDotStruct.f155990f = (long) i;
        finderRedDotStruct.f155991g = (long) i2;
        finderRedDotStruct.f155993i = (long) i3;
        long j2 = 2;
        finderRedDotStruct.f155994j = BuildInfo.DEBUG ? 0 : 2;
        finderRedDotStruct.f155992h = (long) i4;
        finderRedDotStruct.f155996l = finderRedDotStruct.mo86045b("RedDotId", str2 == null ? str10 : str2, true);
        finderRedDotStruct.f155995k = (long) i5;
        finderRedDotStruct.f155997m = finderRedDotStruct.mo86045b("RedDotWording", str8, true);
        finderRedDotStruct.f155998n = finderRedDotStruct.mo86045b("FeedId", xx0(j), true);
        if (hj13 == null || (str5 = hj13.f134671e) == null) {
            str5 = str10;
        }
        finderRedDotStruct.f155999o = finderRedDotStruct.mo86045b("ContextId", str5, true);
        if (!(hj13 == null || (str6 = hj13.f134672f) == null)) {
            str10 = str6;
        }
        finderRedDotStruct.f156000p = finderRedDotStruct.mo86045b("ClickTabContextId", str10, true);
        C37521f.f99374d.getClass();
        finderRedDotStruct.f156001q = C37521f.f99420i1.mo60266n().intValue() == 1 ? 2 : 1;
        if (((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77253Y5()) {
            j2 = 1;
        }
        finderRedDotStruct.f156002r = j2;
        finderRedDotStruct.f156003s = (long) i6;
        finderRedDotStruct.f156004t = (long) i7;
        if (!Util.isNullOrNil(str4)) {
            finderRedDotStruct.f156005u = finderRedDotStruct.mo86045b("ExtInfo", str9, true);
        }
        finderRedDotStruct.mo86054n();
        Ec0(finderRedDotStruct);
    }

    public final void Ly0(Context context, boolean z, boolean z2) {
        C87412m.m108594g(context, "context");
        if (this.f167358o) {
            C104289g gVar = new C104289g();
            gVar.mo145953n("hasfeed", z2 ? 1 : 0);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "kvJson.toString()");
            String n = C112551y.m153814n(gVar2, ",", ";", false);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            Cx0(z ? 1 : 0, "post_moment", n, f != null ? f.mo12861q3() : null);
        }
    }

    public final void Mx0(String str, int i, int i2, int i3, String str2, String str3, long j, String str4, int i4, String str5, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i15;
        int i16 = i;
        String str6 = str4;
        C87412m.m108594g(str, "currUI");
        C87412m.m108594g(str2, "redDotId");
        C87412m.m108594g(str3, "redDotWording");
        C87412m.m108594g(str6, "contextId");
        C87412m.m108594g(str5, "report_ext_info");
        C37521f.f99374d.getClass();
        int i17 = 4;
        if (C37521f.f99420i1.mo60266n().intValue() == 1) {
            if (i16 != -1) {
                if (i16 != 5) {
                    if (i16 == 1) {
                        i8 = 5;
                    } else if (i16 != 2) {
                        if (i16 == 7) {
                            i17 = i4;
                            i8 = 8;
                        } else if (i16 != 8) {
                            switch (i16) {
                                case 1001:
                                    i15 = 6;
                                    break;
                                case 1002:
                                    break;
                                case 1003:
                                    i9 = 3;
                                    break;
                                case 1004:
                                    i7 = 3;
                                    break;
                                case 1005:
                                    i8 = 9;
                                    i17 = 100;
                                    break;
                                default:
                                    return;
                            }
                        } else {
                            i17 = i4;
                            i8 = 7;
                        }
                        i6 = 0;
                        C49712hj1 hj12 = new C49712hj1();
                        hj12.f134671e = str6;
                        hj12.f134672f = "";
                        Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj12, 0, i5, str5);
                    } else {
                        i8 = 1;
                    }
                    i17 = 3;
                    i6 = 0;
                    C49712hj1 hj122 = new C49712hj1();
                    hj122.f134671e = str6;
                    hj122.f134672f = "";
                    Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj122, 0, i5, str5);
                }
                i15 = 1;
                i17 = 1;
                i6 = 0;
                C49712hj1 hj1222 = new C49712hj1();
                hj1222.f134671e = str6;
                hj1222.f134672f = "";
                Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj1222, 0, i5, str5);
            }
            i17 = i4;
            i9 = 2;
            i6 = 1;
            C49712hj1 hj12222 = new C49712hj1();
            hj12222.f134671e = str6;
            hj12222.f134672f = "";
            Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj12222, 0, i5, str5);
        } else if (i16 == -1 || i16 == 1002) {
            i9 = 2;
            i17 = 6;
            i6 = 1;
            C49712hj1 hj122222 = new C49712hj1();
            hj122222.f134671e = str6;
            hj122222.f134672f = "";
            Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj122222, 0, i5, str5);
        } else if (i16 == 1) {
            i9 = 1;
            i17 = 3;
            i6 = 1;
            C49712hj1 hj1222222 = new C49712hj1();
            hj1222222.f134671e = str6;
            hj1222222.f134672f = "";
            Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj1222222, 0, i5, str5);
        } else if (i16 == 2) {
            i7 = 1;
        } else if (i16 != 3) {
            if (i16 == 4) {
                i7 = 3;
            } else if (i16 == 5) {
                i7 = 1;
                i17 = 1;
            } else if (i16 != 7) {
                if (i16 != 8) {
                    return;
                }
                i8 = 7;
                i6 = 0;
                C49712hj1 hj12222222 = new C49712hj1();
                hj12222222.f134671e = str6;
                hj12222222.f134672f = "";
                Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj12222222, 0, i5, str5);
            } else {
                i8 = 8;
                i17 = 3;
                i6 = 0;
                C49712hj1 hj122222222 = new C49712hj1();
                hj122222222.f134671e = str6;
                hj122222222.f134672f = "";
                Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj122222222, 0, i5, str5);
            }
            i6 = 2;
            C49712hj1 hj1222222222 = new C49712hj1();
            hj1222222222.f134671e = str6;
            hj1222222222.f134672f = "";
            Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj1222222222, 0, i5, str5);
        } else {
            i9 = 3;
            i6 = 1;
            C49712hj1 hj12222222222 = new C49712hj1();
            hj12222222222.f134671e = str6;
            hj12222222222.f134672f = "";
            Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj12222222222, 0, i5, str5);
        }
        i17 = 3;
        i6 = 2;
        C49712hj1 hj122222222222 = new C49712hj1();
        hj122222222222.f134671e = str6;
        hj122222222222.f134672f = "";
        Lx0(str, i7, i2, i17, i6, i3, str2, str3, j, hj122222222222, 0, i5, str5);
    }

    public final void My0(String str, int i, C49712hj1 hj12) {
        C87412m.m108594g(str, "exposeFeedId");
        C87412m.m108594g(hj12, "contextObj");
        C117407d.INSTANCE.mo160131h(20585, str, Long.valueOf(C31543z5.m39453c()), Integer.valueOf(i), Integer.valueOf(hj12.f134675i), hj12.f134672f, hj12.f134670d);
    }

    public final void N40(String str, String str2) {
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(str2, "action");
        FinderTraceActionStruct finderTraceActionStruct = new FinderTraceActionStruct();
        finderTraceActionStruct.f156164f = finderTraceActionStruct.mo86045b("ContextId", str, true);
        finderTraceActionStruct.f156162d = finderTraceActionStruct.mo86045b("Action", str2, true);
        finderTraceActionStruct.f156163e = C31543z5.m39453c();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderTraceActionStruct.f156165g = finderTraceActionStruct.mo86045b("SessionId", Wb, true);
        finderTraceActionStruct.f156166h = BuildInfo.DEBUG ? 0 : 1;
        finderTraceActionStruct.mo86054n();
        Ec0(finderTraceActionStruct);
    }

    public final void Ox0(int i, String str, String str2, int i2) {
        C87412m.m108594g(str, "tipsId");
        C87412m.m108594g(str2, "revokeId");
        FinderRedDotCancelStruct finderRedDotCancelStruct = new FinderRedDotCancelStruct();
        finderRedDotCancelStruct.f155938d = (long) i;
        finderRedDotCancelStruct.f155940f = (long) C31543z5.m39455e();
        finderRedDotCancelStruct.f155939e = finderRedDotCancelStruct.mo86045b("TipsId", str, true);
        finderRedDotCancelStruct.f155942h = finderRedDotCancelStruct.mo86045b("RevokeId", str2, true);
        C37521f.f99374d.getClass();
        finderRedDotCancelStruct.f155941g = C37521f.f99420i1.mo60266n().intValue() == 1 ? 2 : 1;
        finderRedDotCancelStruct.f155943i = (long) i2;
        finderRedDotCancelStruct.mo86054n();
        Ec0(finderRedDotCancelStruct);
    }

    public final void Oy0(String str, boolean z, boolean z2, C104289g gVar, int i, int i2, int i3, int i4, int i5, String str2, long j, long j2, int i6) {
        String str3 = str;
        boolean z3 = z;
        C104289g gVar2 = gVar;
        String str4 = str2;
        Class cls = C60229z.class;
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(gVar2, "data");
        C87412m.m108594g(str4, "adPosId");
        try {
            C104289g gVar3 = new C104289g();
            gVar3.mo145953n("report_type", z2 ? 2 : 1);
            gVar3.put("advert_group_id", gVar2.optString(FirebaseAnalytics.C113379b.GROUP_ID));
            gVar3.put("trace_id", gVar2.optString("traceid"));
            String optString = gVar2.optString("apurl");
            String optString2 = gVar2.optString("rl");
            if (z2) {
                optString = optString2;
            }
            gVar3.put("report_link", optString);
            gVar3.mo145953n("pos_type", gVar2.optInt("pos_type"));
            gVar3.mo145953n("click_pos", 0);
            gVar3.mo145953n("ad_w", i);
            gVar3.mo145953n("ad_h", i2);
            gVar3.put(LocaleUtil.PORTUGUESE, gVar2.opt(LocaleUtil.PORTUGUESE));
            gVar3.mo145966q("viewable", z);
            gVar3.mo145953n("screen_cnt", 1);
            gVar3.mo145953n("from_h5", 0);
            gVar3.mo145953n("from_game", 0);
            gVar3.mo145953n("exposure_type", z3 ? 1 : 0);
            C104289g gVar4 = new C104289g();
            gVar4.mo145953n("screen_x", i4);
            gVar4.mo145953n("screen_y", i5);
            gVar4.mo145953n("ad_unit_number", 1);
            gVar4.mo145953n("ad_number", 1);
            gVar4.mo145953n("ad_index", 0);
            gVar4.mo145954o("page_enter_time", j2);
            C7865r3 r3Var = C7865r3.f26468a;
            gVar4.mo145953n("phone_screen_width", r3Var.mo8970c());
            gVar4.mo145953n("phone_screen_height", r3Var.mo8968a());
            C13598b0 b0Var = C13598b0.f38549a;
            gVar3.put("wxa_report_detail", gVar4);
            C104289g gVar5 = new C104289g();
            gVar5.put("oaid", ((C60229z) C86312j.m106911c(cls)).mo85224r4());
            gVar5.put("imei", ((C60229z) C86312j.m106911c(cls)).d00());
            gVar5.put("common_device_id", ((C60229z) C86312j.m106911c(cls)).mo85225rD());
            gVar3.put("ext_click_comm", gVar5.toString());
            gVar3.put("pos_id", str4);
            gVar3.mo145954o("aid", j);
            C104289g gVar6 = new C104289g();
            gVar6.put("context_id", str);
            gVar6.mo145953n("pos", i6);
            gVar3.put("channels_extra_data", gVar6.toString());
            String gVar7 = gVar3.toString();
            C87412m.m108593f(gVar7, "json.toString()");
            C86709a0.m107524d().mo123460f(new C33554b4(1, gVar7));
        } catch (Exception e) {
            Log.printErrStackTrace(this.f167350d, e, "reportExpose", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x021a, code lost:
        if ((r3 == null || r3.length() == 0) == false) goto L_0x021f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Px0(te3.C49712hj1 r20, long r21, androidx.recyclerview.widget.RecyclerView r23, int r24, java.lang.String r25) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r4 = r23
            r5 = r25
            java.lang.String r6 = "contextObj"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "recyclerView"
            gy3.C87412m.m108594g(r4, r6)
            java.lang.String r6 = "udfKv"
            gy3.C87412m.m108594g(r5, r6)
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r0.Br0(r2)
            if (r6 == 0) goto L_0x0241
            com.tencent.mm.autogen.mmdata.rpt.FinderFlowClickStruct r7 = new com.tencent.mm.autogen.mmdata.rpt.FinderFlowClickStruct
            r7.<init>()
            int r8 = r1.f134675i
            long r8 = (long) r8
            r7.f155260d = r8
            java.lang.String r8 = r1.f134670d
            java.lang.String r9 = "SessionId"
            r10 = 1
            java.lang.String r8 = r7.mo86045b(r9, r8, r10)
            r7.f155261e = r8
            java.lang.String r8 = r1.f134671e
            java.lang.String r9 = "ContextId"
            java.lang.String r8 = r7.mo86045b(r9, r8, r10)
            r7.f155262f = r8
            java.lang.String r8 = r1.f134672f
            java.lang.String r9 = "ClickTabContextId"
            java.lang.String r8 = r7.mo86045b(r9, r8, r10)
            r7.f155263g = r8
            java.lang.String r8 = o40.C61926c.m72691p(r21)
            java.lang.String r9 = "ClickFeedid"
            java.lang.String r8 = r7.mo86045b(r9, r8, r10)
            r7.f155264h = r8
            long r8 = eb0.C31543z5.m39453c()
            r7.f155267k = r8
            java.lang.String r8 = r1.f134679p
            java.lang.String r9 = ";"
            java.lang.String r11 = ","
            java.lang.String r12 = ""
            r13 = 0
            if (r8 == 0) goto L_0x006b
            java.lang.String r8 = z04.C112551y.m153814n(r8, r11, r9, r13)
            goto L_0x006c
        L_0x006b:
            r8 = r12
        L_0x006c:
            java.lang.String r14 = "PageTag"
            java.lang.String r8 = r7.mo86045b(r14, r8, r10)
            r7.f155268l = r8
            int r8 = r6.getMediaType()
            long r14 = (long) r8
            r7.f155270n = r14
            er1.w3 r8 = er1.C58784w3.f168295a
            r8.getClass()
            org.json.JSONObject r14 = er1.C58784w3.f168307m
            if (r14 != 0) goto L_0x00a5
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r15 = kg3.C76577a.m92145A(r15)
            java.lang.String r10 = "screenwidth"
            r14.put(r10, r15)
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r10 = kg3.C76577a.m92159j(r10)
            java.lang.String r15 = "screenheight"
            r14.put(r15, r10)
            er1.C58784w3.f168307m = r14
        L_0x00a5:
            org.json.JSONObject r10 = er1.C58784w3.f168307m
            if (r10 != 0) goto L_0x00ae
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
        L_0x00ae:
            java.lang.String r10 = r10.toString()
            java.lang.String r14 = "FinderUtil.getScreenInfo().toString()"
            gy3.C87412m.m108593f(r10, r14)
            java.lang.String r10 = z04.C112551y.m153814n(r10, r11, r9, r13)
            java.lang.String r14 = "ScreenInfo"
            r15 = 1
            java.lang.String r10 = r7.mo86045b(r14, r10, r15)
            r7.f155271o = r10
            r8.getClass()
            rx3.l r10 = r8.mo83974w0(r4, r13)
            A r14 = r10.f38555d
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            B r10 = r10.f38556e
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.util.List r4 = r8.mo83903U(r14, r10, r4)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00ea:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0133
            java.lang.Object r10 = r4.next()
            ef1.i r10 = (ef1.C58564i) r10
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            cm1.i2 r15 = r10.f167636a
            long r16 = r15.getItemId()
            java.lang.String r15 = o40.C61926c.m72691p(r16)
            java.lang.String r13 = "feedid"
            r14.put(r13, r15)
            int r13 = r10.f167637b
            java.lang.String r15 = "feedindex"
            r14.put(r15, r13)
            jq3.q r10 = r10.f167638c
            if (r10 == 0) goto L_0x012e
            int r13 = r10.f29680a
            r15 = 1
            int r13 = r13 + r15
            java.lang.String r15 = "x"
            r14.put(r15, r13)
            int r13 = r10.f29681b
            java.lang.String r15 = "width"
            r14.put(r15, r13)
            int r10 = r10.f29682c
            java.lang.String r13 = "height"
            r14.put(r13, r10)
        L_0x012e:
            r8.put(r14)
            r13 = 0
            goto L_0x00ea
        L_0x0133:
            java.lang.String r4 = r8.toString()
            java.lang.String r8 = "FinderUtil.getCurrentScr…(recyclerView).toString()"
            gy3.C87412m.m108593f(r4, r8)
            r8 = 0
            java.lang.String r4 = z04.C112551y.m153814n(r4, r11, r9, r8)
            java.lang.String r8 = "AllFeedInfo"
            r10 = 1
            java.lang.String r4 = r7.mo86045b(r8, r4, r10)
            r7.f155265i = r4
            it1.c$a r4 = it1.C60625c.f172729q
            int r8 = r1.f134675i
            long r13 = r4.mo85583a(r8)
            r7.f155266j = r13
            int r4 = r1.f134675i
            java.lang.String r2 = r0.mo83281Cu(r2, r4)
            java.lang.String r3 = "SessionBuffer"
            r4 = 1
            java.lang.String r2 = r7.mo86045b(r3, r2, r4)
            r7.f155269m = r2
            int r2 = r1.f134675i
            r3 = 15
            r13 = 2
            r17 = 1
            if (r2 != r3) goto L_0x01a0
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r6.getFeedObject()
            int r2 = r2.recommendReasonType
            r3 = 1
            if (r2 == r3) goto L_0x018a
            switch(r2) {
                case 9: goto L_0x0187;
                case 10: goto L_0x0185;
                case 11: goto L_0x0182;
                case 12: goto L_0x017f;
                case 13: goto L_0x017c;
                default: goto L_0x0179;
            }
        L_0x0179:
            r2 = 0
            goto L_0x018c
        L_0x017c:
            r2 = 4
            goto L_0x018c
        L_0x017f:
            r2 = 5
            goto L_0x018c
        L_0x0182:
            r2 = 3
            goto L_0x018c
        L_0x0185:
            r2 = r13
            goto L_0x018c
        L_0x0187:
            r2 = 6
            goto L_0x018c
        L_0x018a:
            r2 = r17
        L_0x018c:
            r7.f155272p = r2
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r6.getFeedObject()
            java.lang.String r2 = r2.recommendReason
            if (r2 != 0) goto L_0x0197
            r2 = r12
        L_0x0197:
            java.lang.String r3 = "RecommendWording"
            r4 = 1
            java.lang.String r2 = r7.mo86045b(r3, r2, r4)
            r7.f155273q = r2
        L_0x01a0:
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x01ce
            te3.ef1 r2 = r2.event
            if (r2 == 0) goto L_0x01ce
            long r2 = r2.f132898d
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            java.lang.String r3 = "ActivityID"
            r4 = 1
            java.lang.String r2 = r7.mo86045b(r3, r2, r4)
            r7.f155276t = r2
            r2 = r24
            long r2 = (long) r2
            r7.f155277u = r2
            java.lang.String r2 = r1.f134685v
            if (r2 != 0) goto L_0x01c5
            r2 = r12
        L_0x01c5:
            java.lang.String r3 = "ActivityInfo"
            r4 = 1
            java.lang.String r2 = r7.mo86045b(r3, r2, r4)
            r7.f155278v = r2
        L_0x01ce:
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x01e0
            te3.ve1 r2 = r2.feedBgmInfo
            if (r2 == 0) goto L_0x01e0
            java.lang.String r2 = r2.f185874e
            if (r2 != 0) goto L_0x01df
            goto L_0x01e0
        L_0x01df:
            r12 = r2
        L_0x01e0:
            java.lang.String r2 = "GroupID"
            r3 = 1
            java.lang.String r2 = r7.mo86045b(r2, r12, r3)
            r7.f155274r = r2
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            r3 = 0
            if (r2 == 0) goto L_0x01f9
            te3.ve1 r2 = r2.feedBgmInfo
            if (r2 == 0) goto L_0x01f9
            te3.td1 r2 = r2.f185873d
            goto L_0x01fa
        L_0x01f9:
            r2 = r3
        L_0x01fa:
            if (r2 == 0) goto L_0x021d
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x020e
            te3.ve1 r2 = r2.feedBgmInfo
            if (r2 == 0) goto L_0x020e
            te3.td1 r2 = r2.f185873d
            if (r2 == 0) goto L_0x020e
            java.lang.String r3 = r2.f185534d
        L_0x020e:
            if (r3 == 0) goto L_0x0219
            int r2 = r3.length()
            if (r2 != 0) goto L_0x0217
            goto L_0x0219
        L_0x0217:
            r2 = 0
            goto L_0x021a
        L_0x0219:
            r2 = 1
        L_0x021a:
            if (r2 != 0) goto L_0x021d
            goto L_0x021f
        L_0x021d:
            r13 = r17
        L_0x021f:
            r7.f155275s = r13
            java.lang.String r1 = r1.f134686w
            java.lang.String r2 = "jump_id"
            r3 = 1
            java.lang.String r1 = r7.mo86045b(r2, r1, r3)
            r7.f155279w = r1
            r1 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r5, r11, r9, r1)
            java.lang.String r2 = "udf_kv"
            r3 = 1
            java.lang.String r1 = r7.mo86045b(r2, r1, r3)
            r7.f155280x = r1
            r7.mo86054n()
            r0.Ec0(r7)
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58417y0.Px0(te3.hj1, long, androidx.recyclerview.widget.RecyclerView, int, java.lang.String):void");
    }

    public final void Rx0(C49712hj1 hj12, long j, String str, int i) {
        C13598b0 b0Var;
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(str, "finderUsername");
        FinderClickStruct finderClickStruct = new FinderClickStruct();
        finderClickStruct.f155144d = finderClickStruct.mo86045b("SessionId", hj12.f134670d, true);
        String str2 = "";
        finderClickStruct.f155145e = finderClickStruct.mo86045b("ClickUI", str2, true);
        finderClickStruct.f155159s = (long) hj12.f134675i;
        finderClickStruct.f155147g = finderClickStruct.mo86045b("FeedUsr", str, true);
        finderClickStruct.f155148h = 3;
        finderClickStruct.f155149i = (long) i;
        finderClickStruct.f155151k = finderClickStruct.mo86045b("ReplyUsr", str2, true);
        finderClickStruct.f155152l = 2;
        finderClickStruct.f155162v = finderClickStruct.mo86045b("ContextId", hj12.f134671e, true);
        finderClickStruct.f155163w = finderClickStruct.mo86045b("ClickTabContextId", hj12.f134672f, true);
        FinderItem Br0 = Br0(j);
        if (Br0 != null) {
            finderClickStruct.f155146f = finderClickStruct.mo86045b("FeedId", xx0(j), true);
            finderClickStruct.f155153m = (long) Br0.getFeedObject().likeCount;
            finderClickStruct.f155154n = (long) Br0.getFeedObject().commentCount;
            finderClickStruct.f155155o = (long) Br0.getFeedObject().friendLikeCount;
            finderClickStruct.f155156p = (long) Br0.getMediaType();
            finderClickStruct.f155157q = finderClickStruct.mo86045b("Tag", C112551y.m153814n(C58771q3.f168268a.mo83810a(Br0), ",", ";", false), true);
            finderClickStruct.f155158r = finderClickStruct.mo86045b("TagId", str2, true);
            finderClickStruct.f155164x = finderClickStruct.mo86045b("SessionBuffer", mo83281Cu(j, hj12.f134677n), true);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            finderClickStruct.f155146f = finderClickStruct.mo86045b("FeedId", "0", true);
            finderClickStruct.f155157q = finderClickStruct.mo86045b("Tag", str2, true);
            finderClickStruct.f155158r = finderClickStruct.mo86045b("TagId", str2, true);
        }
        String str3 = hj12.f134681r;
        finderClickStruct.f155166z = finderClickStruct.mo86045b("ExtraInfo", str3 != null ? C112551y.m153814n(str3, ",", ";", false) : str2, true);
        String str4 = hj12.f134682s;
        if (str4 != null) {
            str2 = C112551y.m153814n(str4, ",", ";", false);
        }
        finderClickStruct.f155142A = finderClickStruct.mo86045b("enterSourceInfo", str2, true);
        finderClickStruct.mo86054n();
        Ec0(finderClickStruct);
    }

    public final void Ry0(C49712hj1 hj12, String str, String str2, int i, int i2) {
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(str, "poiText");
        C87412m.m108594g(str2, "filterTextItems");
        FinderTopicFilterTextExposeStruct finderTopicFilterTextExposeStruct = new FinderTopicFilterTextExposeStruct();
        finderTopicFilterTextExposeStruct.f156153e = finderTopicFilterTextExposeStruct.mo86045b("Sessionid", hj12.f134670d, true);
        finderTopicFilterTextExposeStruct.f156154f = finderTopicFilterTextExposeStruct.mo86045b("Contextid", hj12.f134671e, true);
        finderTopicFilterTextExposeStruct.f156155g = finderTopicFilterTextExposeStruct.mo86045b("ClickTabContextid", hj12.f134672f, true);
        finderTopicFilterTextExposeStruct.f156152d = (long) hj12.f134677n;
        finderTopicFilterTextExposeStruct.f156156h = finderTopicFilterTextExposeStruct.mo86045b("PoiText", str, true);
        finderTopicFilterTextExposeStruct.f156157i = finderTopicFilterTextExposeStruct.mo86045b("FilterTextItems", str2, true);
        finderTopicFilterTextExposeStruct.f156158j = (long) i;
        finderTopicFilterTextExposeStruct.f156159k = (long) i2;
        int i3 = hj12.f134675i;
        if (i3 == 22) {
            finderTopicFilterTextExposeStruct.f156160l = 1;
        } else if (i3 == 26) {
            finderTopicFilterTextExposeStruct.f156160l = 2;
        }
        finderTopicFilterTextExposeStruct.f156161m = (long) i3;
        finderTopicFilterTextExposeStruct.mo86054n();
        Ec0(finderTopicFilterTextExposeStruct);
    }

    public final void Sx0(int i, int i2, int i3, C49712hj1 hj12) {
        C87412m.m108594g(hj12, "contextObj");
        FinderHottabClickStruct finderHottabClickStruct = new FinderHottabClickStruct();
        finderHottabClickStruct.f155361d = (long) hj12.f134675i;
        finderHottabClickStruct.f155362e = finderHottabClickStruct.mo86045b("Sessionid", hj12.f134670d, true);
        finderHottabClickStruct.f155363f = finderHottabClickStruct.mo86045b("Contextid", hj12.f134671e, true);
        finderHottabClickStruct.f155364g = finderHottabClickStruct.mo86045b("ClickTabContextid", hj12.f134672f, true);
        finderHottabClickStruct.f155362e = finderHottabClickStruct.mo86045b("Sessionid", hj12.f134670d, true);
        finderHottabClickStruct.f155366i = C31543z5.m39453c();
        finderHottabClickStruct.f155365h = (long) i;
        finderHottabClickStruct.f155367j = (long) i2;
        finderHottabClickStruct.f155368k = (long) i3;
        finderHottabClickStruct.f155369l = 1;
        finderHottabClickStruct.mo86054n();
        Ec0(finderHottabClickStruct);
    }

    public final void Sy0(Context context, boolean z, long j, int i, String str, int i2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "error");
        C104289g gVar = new C104289g();
        gVar.mo145954o("feedid", j);
        gVar.mo145953n("click_result", i);
        gVar.put("fail_reason", str);
        if (z) {
            gVar.mo145953n("from_action", i2);
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "kvJson.toString()");
        String n = C112551y.m153814n(gVar2, ",", ";", false);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        Cx0(z ? 1 : 0, "launch_promotion", n, f != null ? f.mo12861q3() : null);
    }

    public final void Tx0(C49712hj1 hj12, long j, int i, int i2, int i3, String str, int i4, boolean z, boolean z2, int i5) {
        C49712hj1 hj13 = hj12;
        long j2 = j;
        String str2 = str;
        C87412m.m108594g(hj13, "contextObj");
        C87412m.m108594g(str2, "replyUsername");
        FinderItem Br0 = Br0(j2);
        if (Br0 != null) {
            FinderClickStruct finderClickStruct = new FinderClickStruct();
            finderClickStruct.f155144d = finderClickStruct.mo86045b("SessionId", hj13.f134670d, true);
            String str3 = "";
            finderClickStruct.f155145e = finderClickStruct.mo86045b("ClickUI", str3, true);
            finderClickStruct.f155146f = finderClickStruct.mo86045b("FeedId", xx0(j2), true);
            finderClickStruct.f155147g = finderClickStruct.mo86045b("FeedUsr", Br0.getUserName(), true);
            finderClickStruct.f155148h = (long) i;
            finderClickStruct.f155149i = (long) i2;
            finderClickStruct.f155150j = (long) i3;
            finderClickStruct.f155151k = finderClickStruct.mo86045b("ReplyUsr", str2, true);
            finderClickStruct.f155152l = (long) i4;
            finderClickStruct.f155153m = (long) Br0.getLikeCount();
            finderClickStruct.f155154n = (long) Br0.getCommentCount();
            finderClickStruct.f155155o = (long) Br0.getFriendLikeCount();
            finderClickStruct.f155156p = (long) Br0.getMediaType();
            finderClickStruct.f155157q = finderClickStruct.mo86045b("Tag", C112551y.m153814n(C58771q3.f168268a.mo83810a(Br0), ",", ";", false), true);
            finderClickStruct.f155158r = finderClickStruct.mo86045b("TagId", str3, true);
            finderClickStruct.f155159s = (long) hj13.f134675i;
            long j3 = 1;
            finderClickStruct.f155160t = C87412m.m108589b(Br0.getUserName(), C66785b.f191882e.mo90662O5()) ? 1 : 0;
            finderClickStruct.f155161u = z ? 1 : 0;
            String str4 = hj13.f134671e;
            if (str4 == null) {
                str4 = str3;
            }
            finderClickStruct.f155162v = finderClickStruct.mo86045b("ContextId", str4, true);
            String str5 = hj13.f134672f;
            if (str5 == null) {
                str5 = str3;
            }
            finderClickStruct.f155163w = finderClickStruct.mo86045b("ClickTabContextId", str5, true);
            finderClickStruct.f155164x = finderClickStruct.mo86045b("SessionBuffer", mo83281Cu(j2, hj13.f134675i), true);
            if (!z2) {
                j3 = 0;
            }
            finderClickStruct.f155165y = j3;
            String str6 = hj13.f134681r;
            finderClickStruct.f155166z = finderClickStruct.mo86045b("ExtraInfo", str6 != null ? C112551y.m153814n(str6, ",", ";", false) : str3, true);
            String str7 = hj13.f134682s;
            if (str7 != null) {
                str3 = C112551y.m153814n(str7, ",", ";", false);
            }
            finderClickStruct.f155142A = finderClickStruct.mo86045b("enterSourceInfo", str3, true);
            finderClickStruct.f155143B = (long) i5;
            finderClickStruct.mo86054n();
            Ec0(finderClickStruct);
        }
    }

    /* renamed from: U3 */
    public void mo83314U3(C64682rk1 rk12, int i, long j, String str, C49712hj1 hj12, long j2) {
        String str2;
        String str3;
        String str4;
        String str5;
        C104289g gVar;
        String str6;
        String str7;
        String str8;
        C87412m.m108594g(rk12, "shareObj");
        C87412m.m108594g(str, "receiver");
        FinderForwardStruct finderForwardStruct = new FinderForwardStruct();
        String str9 = "";
        if (hj12 == null || (str2 = hj12.f134670d) == null) {
            str2 = str9;
        }
        finderForwardStruct.f155322d = finderForwardStruct.mo86045b("Sessionid", str2, true);
        finderForwardStruct.f155323e = (long) i;
        finderForwardStruct.f155324f = j;
        finderForwardStruct.f155326h = finderForwardStruct.mo86045b("FeedId", rk12.f185183d, true);
        finderForwardStruct.f155327i = finderForwardStruct.mo86045b("FeedUsr", rk12.f185184e, true);
        finderForwardStruct.f155328j = finderForwardStruct.mo86045b("ForwardToUsr", str, true);
        finderForwardStruct.f155329k = 0;
        finderForwardStruct.f155330l = 0;
        finderForwardStruct.f155331m = 0;
        finderForwardStruct.f155332n = finderForwardStruct.mo86045b("CurrentPageName", str9, true);
        finderForwardStruct.f155333o = (long) rk12.f185188i;
        finderForwardStruct.f155334p = finderForwardStruct.mo86045b("Tag", str9, true);
        finderForwardStruct.f155335q = finderForwardStruct.mo86045b("TagId", str9, true);
        finderForwardStruct.f155336r = hj12 != null ? (long) hj12.f134675i : 0;
        if (hj12 == null || (str3 = hj12.f134672f) == null) {
            str3 = str9;
        }
        finderForwardStruct.f155337s = finderForwardStruct.mo86045b("ClickTabContextId", str3, true);
        if (hj12 == null || (str4 = hj12.f134671e) == null) {
            str4 = str9;
        }
        finderForwardStruct.f155338t = finderForwardStruct.mo86045b("ContextId", str4, true);
        finderForwardStruct.f155340v = j2;
        finderForwardStruct.f155319D = ((C15133e0) C86312j.m106911c(C15133e0.class)).getItemCount() > 0 ? 1 : 0;
        finderForwardStruct.f155341w = finderForwardStruct.mo86045b("ExtraInfo", (hj12 == null || (str8 = hj12.f134681r) == null) ? str9 : C112551y.m153814n(str8, ",", ";", false), true);
        finderForwardStruct.mo76253s((hj12 == null || (str7 = hj12.f134682s) == null) ? str9 : C112551y.m153814n(str7, ",", ";", false));
        finderForwardStruct.f155344z = finderForwardStruct.mo86045b("GroupID", str9, true);
        finderForwardStruct.f155316A = 1;
        C45435i2 vP = mo83349vP(Util.getLong(rk12.f185183d, 0), hj12 != null ? hj12.f134675i : 0);
        String str10 = null;
        C51822we1 we12 = vP != null ? vP.f122975a : null;
        finderForwardStruct.f155339u = finderForwardStruct.mo86045b("SessionBuffer", we12 != null ? we12.f143985e : null, true);
        if (we12 == null || (str5 = we12.f143989i) == null) {
            if (hj12 != null) {
                str10 = hj12.f134681r;
            }
            str5 = str10 == null ? str9 : str10;
        }
        C104289g gVar2 = new C104289g();
        try {
            gVar = new C104289g(str5);
            try {
                gVar.mo145954o("menu_exp_time", C7433e1.f25623b);
            } catch (Throwable unused) {
                gVar2 = gVar;
            }
        } catch (Throwable unused2) {
            Log.m105924i(this.f167350d, "finderShareFeedReport json error");
            gVar = gVar2;
            String gVar3 = gVar.toString();
            C87412m.m108593f(gVar3, "udfKv.toString()");
            finderForwardStruct.f155321F = finderForwardStruct.mo86045b("client_udf_kv", C112551y.m153814n(gVar3, ",", ";", false), true);
            str9 = str6;
            finderForwardStruct.f155320E = finderForwardStruct.mo86045b("jump_id", str9, true);
            finderForwardStruct.mo86054n();
            Ec0(finderForwardStruct);
        }
        String gVar32 = gVar.toString();
        C87412m.m108593f(gVar32, "udfKv.toString()");
        finderForwardStruct.f155321F = finderForwardStruct.mo86045b("client_udf_kv", C112551y.m153814n(gVar32, ",", ";", false), true);
        if (!(hj12 == null || (str6 = hj12.f134686w) == null)) {
            str9 = str6;
        }
        finderForwardStruct.f155320E = finderForwardStruct.mo86045b("jump_id", str9, true);
        finderForwardStruct.mo86054n();
        Ec0(finderForwardStruct);
    }

    public final void Uy0(String str, int i) {
        C87412m.m108594g(str, "contextId");
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        long c = C31543z5.m39453c();
        C115669n.INSTANCE.mo160131h(21875, Wb, str, 118, Integer.valueOf(i), Long.valueOf(c), "finder_team_msg", "");
    }

    public final void Vx0(int i, int i2, int i3, int i4, long j) {
        String str;
        FinderMsgItemClickStruct finderMsgItemClickStruct = new FinderMsgItemClickStruct();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderMsgItemClickStruct.f155713d = finderMsgItemClickStruct.mo86045b("SessionId", Wb, true);
        finderMsgItemClickStruct.f155714e = (long) i;
        finderMsgItemClickStruct.f155718i = (long) i2;
        finderMsgItemClickStruct.f155715f = (long) i3;
        finderMsgItemClickStruct.f155716g = (long) i4;
        int i5 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i5 == 0) {
            str = "0";
        } else if (i5 > 0) {
            str = Long.toString(j, 10);
        } else {
            char[] cArr = new char[64];
            long j2 = (j >>> 1) / ((long) 5);
            long j3 = (long) 10;
            int i6 = 63;
            cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
            while (j2 > 0) {
                i6--;
                cArr[i6] = Character.forDigit((int) (j2 % j3), 10);
                j2 /= j3;
            }
            str = new String(cArr, i6, 64 - i6);
        }
        finderMsgItemClickStruct.f155717h = finderMsgItemClickStruct.mo86045b("feedid", str, true);
        finderMsgItemClickStruct.mo86054n();
        Ec0(finderMsgItemClickStruct);
    }

    public final void Vy0(Context context, long j) {
        C87412m.m108594g(context, "context");
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
        FinderShowInWXProfileStruct finderShowInWXProfileStruct = new FinderShowInWXProfileStruct();
        finderShowInWXProfileStruct.mo1041w(q3.f134670d);
        finderShowInWXProfileStruct.mo1040v(q3.f134671e);
        finderShowInWXProfileStruct.mo1037s(String.valueOf(q3.f134675i));
        finderShowInWXProfileStruct.f9902g = 0;
        finderShowInWXProfileStruct.mo1038t("textstatus_in_menu");
        finderShowInWXProfileStruct.mo1039u(String.valueOf(C31543z5.m39453c()));
        finderShowInWXProfileStruct.mo1042x(new C104289g().put("feedid", C61926c.m72691p(j)).toString());
        finderShowInWXProfileStruct.mo86054n();
    }

    public final void Wx0(int i, int i2, int i3, long j) {
        String str;
        FinderMsgItemClickStruct finderMsgItemClickStruct = new FinderMsgItemClickStruct();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderMsgItemClickStruct.f155713d = finderMsgItemClickStruct.mo86045b("SessionId", Wb, true);
        finderMsgItemClickStruct.f155714e = (long) i;
        finderMsgItemClickStruct.f155718i = 0;
        finderMsgItemClickStruct.f155715f = (long) i2;
        finderMsgItemClickStruct.f155716g = (long) i3;
        int i4 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i4 == 0) {
            str = "0";
        } else if (i4 > 0) {
            str = Long.toString(j, 10);
        } else {
            char[] cArr = new char[64];
            long j2 = (j >>> 1) / ((long) 5);
            long j3 = (long) 10;
            int i5 = 63;
            cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
            while (j2 > 0) {
                i5--;
                cArr[i5] = Character.forDigit((int) (j2 % j3), 10);
                j2 /= j3;
            }
            str = new String(cArr, i5, 64 - i5);
        }
        finderMsgItemClickStruct.f155717h = finderMsgItemClickStruct.mo86045b("feedid", str, true);
        finderMsgItemClickStruct.mo86054n();
        Ec0(finderMsgItemClickStruct);
    }

    public final void Wy0(Context context, C11920q qVar, long j, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(qVar, "finderJumpInfoEx");
        FinderJumpInfo finderJumpInfo = qVar.f34827a;
        if (3 == finderJumpInfo.jumpinfo_type) {
            NativeInfo nativeInfo = finderJumpInfo.native_info;
            C49712hj1 hj12 = null;
            Integer valueOf = nativeInfo != null ? Integer.valueOf(nativeInfo.native_type) : null;
            if ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 8)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("msgId", j);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "kvJson.toString()");
                String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                Cx0(z ? 1 : 0, "link_msg_topic", n, hj12);
            }
        }
    }

    public final void Xx0(int i, String str, String str2, long j, int i2) {
        FinderItem Br0 = Br0(j);
        if (Br0 != null) {
            FinderCommentClickStruct finderCommentClickStruct = new FinderCommentClickStruct();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            finderCommentClickStruct.f155167d = finderCommentClickStruct.mo86045b("SessionId", Wb, true);
            finderCommentClickStruct.f155168e = finderCommentClickStruct.mo86045b("ClickUI", "", true);
            finderCommentClickStruct.f155169f = finderCommentClickStruct.mo86045b("FeedId", xx0(j), true);
            finderCommentClickStruct.f155170g = finderCommentClickStruct.mo86045b("FeedUsr", Br0.getUserName(), true);
            finderCommentClickStruct.f155171h = (long) Br0.getLikeCount();
            finderCommentClickStruct.f155172i = (long) Br0.getCommentCount();
            finderCommentClickStruct.f155173j = (long) Br0.getFriendLikeCount();
            finderCommentClickStruct.f155174k = i2;
            finderCommentClickStruct.f155175l = (long) i;
            C37521f.f99374d.getClass();
            finderCommentClickStruct.f155176m = C37521f.f99288T0.mo60266n().intValue() == 1 ? 1 : 0;
            finderCommentClickStruct.f155177n = finderCommentClickStruct.mo86045b("ContextId", str, true);
            finderCommentClickStruct.f155178o = finderCommentClickStruct.mo86045b("ClickTabContextId", str2, true);
            finderCommentClickStruct.mo86054n();
            Ec0(finderCommentClickStruct);
        }
    }

    public final int Xy0(int i) {
        if (i == 15) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i != 17) {
            return i != 18 ? 0 : 1;
        }
        return 3;
    }

    public final void Yx0(int i, long j) {
        FinderSysMsgItemClickStruct finderSysMsgItemClickStruct = new FinderSysMsgItemClickStruct();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderSysMsgItemClickStruct.f156127d = finderSysMsgItemClickStruct.mo86045b("SessionId", Wb, true);
        finderSysMsgItemClickStruct.f156128e = (long) i;
        finderSysMsgItemClickStruct.f156129f = j;
        finderSysMsgItemClickStruct.mo86054n();
        Ec0(finderSysMsgItemClickStruct);
    }

    /* renamed from: Z6 */
    public void mo83323Z6(String str, String str2, String str3, int i, long j, C55033u uVar, int i2, int i3, int i4, String str4) {
        C87412m.m108594g(uVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        C87412m.m108594g(str4, "adReportData");
        CommentItemClickStruct commentItemClickStruct = new CommentItemClickStruct();
        if (str == null) {
            str = "";
        }
        commentItemClickStruct.f154940d = commentItemClickStruct.mo86045b("SessionId", str, true);
        if (str2 == null) {
            str2 = "";
        }
        commentItemClickStruct.f154941e = commentItemClickStruct.mo86045b("ContextId", str2, true);
        if (str3 == null) {
            str3 = "";
        }
        commentItemClickStruct.f154942f = commentItemClickStruct.mo86045b("ClickTabContextId", str3, true);
        commentItemClickStruct.f154943g = (long) i;
        commentItemClickStruct.f154944h = commentItemClickStruct.mo86045b("feedid", C61926c.m72691p(j), true);
        commentItemClickStruct.f154947k = (long) qy0(i2);
        String str5 = uVar.f154492d.mo89532o2().report_json;
        commentItemClickStruct.f154948l = commentItemClickStruct.mo86045b("reportJson", str5 != null ? C112551y.m153814n(str5, ",", ";", false) : null, true);
        long j2 = ((long) i3) - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        commentItemClickStruct.f154949m = j2;
        commentItemClickStruct.f154950n = (long) i4;
        commentItemClickStruct.f154951o = commentItemClickStruct.mo86045b("ad_report_data", C112551y.m153814n(str4, ",", ";", false), true);
        int c = uVar.mo75c();
        if (c == 1) {
            commentItemClickStruct.f154945i = commentItemClickStruct.mo86045b("rootCommentid", C61926c.m72691p(uVar.f154492d.mo89531n2()), true);
            commentItemClickStruct.f154946j = commentItemClickStruct.mo86045b("subCommentid", "", true);
        } else if (c == 2) {
            commentItemClickStruct.f154945i = commentItemClickStruct.mo86045b("rootCommentid", C61926c.m72691p(uVar.f154492d.field_actionInfo.f186500h), true);
            commentItemClickStruct.f154946j = commentItemClickStruct.mo86045b("subCommentid", C61926c.m72691p(uVar.f154492d.mo89531n2()), true);
        } else {
            return;
        }
        commentItemClickStruct.mo86054n();
        Ec0(commentItemClickStruct);
    }

    public final void Zx0(int i, int i2, C49712hj1 hj12, int i3) {
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(hj12, "contextObj");
        FinderFeedTabSwitchStruct finderFeedTabSwitchStruct = new FinderFeedTabSwitchStruct();
        long j = 0;
        finderFeedTabSwitchStruct.f155252d = i > 0 ? (long) i : 0;
        if (i2 > 0) {
            j = (long) i2;
        }
        finderFeedTabSwitchStruct.f155253e = j;
        finderFeedTabSwitchStruct.f155254f = C31543z5.m39453c();
        finderFeedTabSwitchStruct.f155255g = finderFeedTabSwitchStruct.mo86045b("Sessionid", hj12.f134670d, true);
        finderFeedTabSwitchStruct.f155259k = finderFeedTabSwitchStruct.mo86045b("ContextID", hj12.f134671e, true);
        finderFeedTabSwitchStruct.f155256h = finderFeedTabSwitchStruct.mo86045b("ClickContextid", hj12.f134672f, true);
        finderFeedTabSwitchStruct.f155258j = (long) i3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4 && ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("finder_tl_hot_tab") != null) {
                        finderFeedTabSwitchStruct.f155257i = 1;
                    }
                } else if (((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("TLFollow") != null) {
                    finderFeedTabSwitchStruct.f155257i = 1;
                }
            } else if (((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("finder_tl_nearby_tab") != null) {
                finderFeedTabSwitchStruct.f155257i = 1;
            }
        } else if (((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("TLRecommendTab") != null) {
            finderFeedTabSwitchStruct.f155257i = 1;
        }
        finderFeedTabSwitchStruct.mo86054n();
        Ec0(finderFeedTabSwitchStruct);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_ALL_CLICK_TAB_CONTEXT_ID_STRING, finderFeedTabSwitchStruct.f155256h);
        if (i2 != 2) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TAB_CLICK_TAB_CONTEXT_ID_STRING, finderFeedTabSwitchStruct.f155256h);
        }
        Log.m105925i(this.f167350d, "finderReportTabChange clickTabContextId [%s] toTab[%d]", finderFeedTabSwitchStruct.f155256h, Integer.valueOf(i2));
    }

    public final void ay0(int i, String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, C49712hj1 hj12) {
        FinderSearchActionReportStruct finderSearchActionReportStruct = new FinderSearchActionReportStruct();
        finderSearchActionReportStruct.f156016f = (long) i;
        finderSearchActionReportStruct.f156017g = finderSearchActionReportStruct.mo86045b("searchSessionId", str, true);
        finderSearchActionReportStruct.f156018h = finderSearchActionReportStruct.mo86045b("requestId", str2, true);
        finderSearchActionReportStruct.f156019i = finderSearchActionReportStruct.mo86045b(SearchIntents.EXTRA_QUERY, str3, true);
        finderSearchActionReportStruct.f156020j = (long) i2;
        finderSearchActionReportStruct.f156021k = (long) i3;
        finderSearchActionReportStruct.f156023m = (long) i4;
        finderSearchActionReportStruct.f156024n = (long) i5;
        finderSearchActionReportStruct.f156025o = (long) i6;
        if (hj12 != null) {
            finderSearchActionReportStruct.f156014d = finderSearchActionReportStruct.mo86045b("sessionId", hj12.f134670d, true);
            finderSearchActionReportStruct.f156022l = (long) hj12.f134675i;
            finderSearchActionReportStruct.f156015e = finderSearchActionReportStruct.mo86045b("ClickTabContextId", hj12.f134672f, true);
        }
        finderSearchActionReportStruct.mo86054n();
        Ec0(finderSearchActionReportStruct);
    }

    public final void by0(String str, String str2, int i, int i2, String str3, int i3, int i4, int i5, String str4, int i6, int i7, C49712hj1 hj12) {
        FinderSearchClickStruct finderSearchClickStruct = new FinderSearchClickStruct();
        finderSearchClickStruct.f156026d = finderSearchClickStruct.mo86045b("RequestId", str, true);
        finderSearchClickStruct.f156027e = finderSearchClickStruct.mo86045b("Query", str2, true);
        finderSearchClickStruct.f156028f = i;
        finderSearchClickStruct.f156029g = i2;
        finderSearchClickStruct.f156030h = finderSearchClickStruct.mo86045b("ItemId", str3, true);
        finderSearchClickStruct.f156031i = i3;
        finderSearchClickStruct.f156032j = i4;
        finderSearchClickStruct.f156033k = i5;
        if (hj12 != null) {
            finderSearchClickStruct.f156034l = finderSearchClickStruct.mo86045b("sessionid", hj12.f134670d, true);
            finderSearchClickStruct.f156036n = hj12.f134675i;
            finderSearchClickStruct.f156035m = finderSearchClickStruct.mo86045b("clicktabcontextid", hj12.f134672f, true);
        }
        finderSearchClickStruct.f156037o = finderSearchClickStruct.mo86045b("searchSessionid", str4, true);
        finderSearchClickStruct.f156038p = i6;
        finderSearchClickStruct.f156039q = i7;
        finderSearchClickStruct.mo86054n();
        Ec0(finderSearchClickStruct);
    }

    /* renamed from: d */
    public void mo83327d(int i, long j, long j2, int i2, int i3, long j3, long j4, long j5, long j6, int i4, int i5, String str, int i6, int i7, String str2, int i8, int i9, String str3, String str4, String str5, long j7, long j8) {
        long j9 = j3;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        C87412m.m108594g(str6, "statistics");
        C87412m.m108594g(str7, "cgiErrmsg");
        C87412m.m108594g(str8, "liveEventMsg");
        C87412m.m108594g(str9, "extra");
        C87412m.m108594g(str10, "snn");
        FinderLiveStatisticsReportStruct finderLiveStatisticsReportStruct = new FinderLiveStatisticsReportStruct();
        finderLiveStatisticsReportStruct.f155671d = BuildInfo.DEBUG ? 0 : 3;
        finderLiveStatisticsReportStruct.f155672e = i;
        finderLiveStatisticsReportStruct.f155673f = i2;
        finderLiveStatisticsReportStruct.f155674g = i3;
        finderLiveStatisticsReportStruct.f155675h = ((C13887q1) C86312j.m106911c(C13887q1.class)).vl0();
        finderLiveStatisticsReportStruct.f155676i = j9;
        finderLiveStatisticsReportStruct.f155677j = j4;
        finderLiveStatisticsReportStruct.f155678k = j5;
        finderLiveStatisticsReportStruct.f155679l = j6;
        finderLiveStatisticsReportStruct.f155680m = i4;
        finderLiveStatisticsReportStruct.f155681n = i5;
        finderLiveStatisticsReportStruct.f155682o = finderLiveStatisticsReportStruct.mo86045b("statistics", C112551y.m153814n(str6, ",", ";", false), true);
        finderLiveStatisticsReportStruct.f155683p = i6;
        finderLiveStatisticsReportStruct.f155684q = i7;
        finderLiveStatisticsReportStruct.f155685r = finderLiveStatisticsReportStruct.mo86045b("cgiErrmsg", str7, true);
        finderLiveStatisticsReportStruct.f155686s = i8;
        finderLiveStatisticsReportStruct.f155687t = i9;
        finderLiveStatisticsReportStruct.f155688u = finderLiveStatisticsReportStruct.mo86045b("liveEventMsg", str8, true);
        finderLiveStatisticsReportStruct.f155689v = finderLiveStatisticsReportStruct.mo86045b("extra", str9, true);
        finderLiveStatisticsReportStruct.f155690w = finderLiveStatisticsReportStruct.mo86045b("snn", str10, true);
        finderLiveStatisticsReportStruct.f155691x = j7;
        finderLiveStatisticsReportStruct.f155692y = j8;
        finderLiveStatisticsReportStruct.f155693z = finderLiveStatisticsReportStruct.mo86045b("localsession", MD5Util.getMD5String(C75592q0.m90789s() + C75592q0.m90783m() + j9), true);
        finderLiveStatisticsReportStruct.f155669F0 = j;
        finderLiveStatisticsReportStruct.f155670G0 = j2;
        finderLiveStatisticsReportStruct.mo86054n();
        Ec0(finderLiveStatisticsReportStruct);
    }

    /* renamed from: dc */
    public int mo83328dc(int i) {
        if (i == 1) {
            return 18;
        }
        if (i == 2) {
            return 15;
        }
        if (i != 3) {
            return i != 4 ? 3 : 20;
        }
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C35464c<Integer> cVar = C37521f.f99315W0;
        if (cVar.mo60266n().intValue() == 2) {
            return 170;
        }
        fVar.getClass();
        return cVar.mo60266n().intValue() == 1 ? 155 : 17;
    }

    /* renamed from: dv */
    public final void mo83329dv(FinderObject finderObject, C49712hj1 hj12) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        if (hj12 != null) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(finderObject, hj12.f134675i);
        }
    }

    public final void dy0(Context context, long j, boolean z, long j2, long j3, boolean z2, long j4, String str, String str2) {
        Context context2 = context;
        long j5 = j;
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str3, "redDotCountDetail");
        C87412m.m108594g(str4, "finderUsername");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        String str5 = null;
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        FinderPersonalCenterEventStruct finderPersonalCenterEventStruct = new FinderPersonalCenterEventStruct();
        if (q3 != null) {
            str5 = q3.f134670d;
        }
        finderPersonalCenterEventStruct.f155749d = finderPersonalCenterEventStruct.mo86045b("sessionid", str5, true);
        finderPersonalCenterEventStruct.f155750e = j5;
        finderPersonalCenterEventStruct.mo86046c("EnterTimeMs", j);
        long j6 = 1;
        finderPersonalCenterEventStruct.f155751f = z ? 1 : 0;
        finderPersonalCenterEventStruct.f155752g = j2;
        finderPersonalCenterEventStruct.f155753h = j3;
        finderPersonalCenterEventStruct.f155754i = System.currentTimeMillis();
        if (!z2) {
            j6 = 0;
        }
        finderPersonalCenterEventStruct.f155755j = j6;
        finderPersonalCenterEventStruct.f155756k = j4;
        finderPersonalCenterEventStruct.f155757l = finderPersonalCenterEventStruct.mo86045b("RedDotCountDetail", str3, true);
        if (str2.length() > 0) {
            finderPersonalCenterEventStruct.f155758m = finderPersonalCenterEventStruct.mo86045b("finderusername", str4, true);
        }
        finderPersonalCenterEventStruct.mo86054n();
    }

    /* renamed from: ex */
    public void mo83331ex(List<String> list, List<String> list2) {
        C87412m.m108594g(list, "newIds");
        C87412m.m108594g(list2, "oldIds");
        LiveNotifyReplaceStruct liveNotifyReplaceStruct = new LiveNotifyReplaceStruct();
        liveNotifyReplaceStruct.f156397d = (long) list.size();
        liveNotifyReplaceStruct.f156398e = (long) list2.size();
        liveNotifyReplaceStruct.f156399f = liveNotifyReplaceStruct.mo86045b("NewTipsIDs", oy0(list, "|"), true);
        liveNotifyReplaceStruct.f156400g = liveNotifyReplaceStruct.mo86045b("DeleteTipsIDs", oy0(list2, "|"), true);
        liveNotifyReplaceStruct.mo86054n();
        Ec0(liveNotifyReplaceStruct);
    }

    public final void gy0(int i, boolean z, String str, long j, String str2, C49712hj1 hj12) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C87412m.m108594g(str, "receiver");
        FinderForwardStruct finderForwardStruct = new FinderForwardStruct();
        finderForwardStruct.f155336r = hj12 != null ? (long) hj12.f134675i : 0;
        finderForwardStruct.f155323e = (long) i;
        finderForwardStruct.f155324f = z ? 1 : 2;
        finderForwardStruct.f155340v = j;
        finderForwardStruct.f155328j = finderForwardStruct.mo86045b("ForwardToUsr", str, true);
        String str9 = "";
        if (hj12 == null || (str3 = hj12.f134670d) == null) {
            str3 = str9;
        }
        finderForwardStruct.f155322d = finderForwardStruct.mo86045b("Sessionid", str3, true);
        if (hj12 == null || (str4 = hj12.f134672f) == null) {
            str4 = str9;
        }
        finderForwardStruct.f155337s = finderForwardStruct.mo86045b("ClickTabContextId", str4, true);
        if (hj12 == null || (str5 = hj12.f134671e) == null) {
            str5 = str9;
        }
        finderForwardStruct.f155338t = finderForwardStruct.mo86045b("ContextId", str5, true);
        finderForwardStruct.f155341w = finderForwardStruct.mo86045b("ExtraInfo", (hj12 == null || (str8 = hj12.f134681r) == null) ? str9 : C112551y.m153814n(str8, ",", ";", false), true);
        finderForwardStruct.mo76253s((hj12 == null || (str7 = hj12.f134682s) == null) ? str9 : C112551y.m153814n(str7, ",", ";", false));
        if (str2 == null) {
            str2 = str9;
        }
        finderForwardStruct.f155318C = finderForwardStruct.mo86045b("ActivityID", str2, true);
        if (!(hj12 == null || (str6 = hj12.f134686w) == null)) {
            str9 = str6;
        }
        finderForwardStruct.f155320E = finderForwardStruct.mo86045b("jump_id", str9, true);
        C104289g gVar = new C104289g();
        gVar.mo145954o("menu_exp_time", C7433e1.f25623b);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "kvJson.toString()");
        finderForwardStruct.f155321F = finderForwardStruct.mo86045b("client_udf_kv", C112551y.m153814n(gVar2, ",", ";", false), true);
        finderForwardStruct.mo86054n();
        Ec0(finderForwardStruct);
    }

    public final void hy0(long j, int i, long j2, String str, long j3, C49712hj1 hj12) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C87412m.m108594g(str, "receiver");
        FinderForwardStruct finderForwardStruct = new FinderForwardStruct();
        finderForwardStruct.f155336r = hj12 != null ? (long) hj12.f134675i : 0;
        finderForwardStruct.f155323e = (long) i;
        finderForwardStruct.f155324f = j2;
        finderForwardStruct.f155340v = j3;
        finderForwardStruct.f155328j = finderForwardStruct.mo86045b("ForwardToUsr", str, true);
        String str8 = "";
        if (hj12 == null || (str2 = hj12.f134670d) == null) {
            str2 = str8;
        }
        finderForwardStruct.f155322d = finderForwardStruct.mo86045b("Sessionid", str2, true);
        finderForwardStruct.f155339u = finderForwardStruct.mo86045b("SessionBuffer", mo83281Cu(j, hj12 != null ? hj12.f134675i : 0), true);
        if (hj12 == null || (str3 = hj12.f134672f) == null) {
            str3 = str8;
        }
        finderForwardStruct.f155337s = finderForwardStruct.mo86045b("ClickTabContextId", str3, true);
        if (hj12 == null || (str4 = hj12.f134671e) == null) {
            str4 = str8;
        }
        finderForwardStruct.f155338t = finderForwardStruct.mo86045b("ContextId", str4, true);
        finderForwardStruct.f155341w = finderForwardStruct.mo86045b("ExtraInfo", (hj12 == null || (str7 = hj12.f134681r) == null) ? str8 : C112551y.m153814n(str7, ",", ";", false), true);
        finderForwardStruct.mo76253s((hj12 == null || (str6 = hj12.f134682s) == null) ? str8 : C112551y.m153814n(str6, ",", ";", false));
        finderForwardStruct.f155317B = finderForwardStruct.mo86045b("ColumnId", C61926c.m72691p(j), true);
        if (!(hj12 == null || (str5 = hj12.f134686w) == null)) {
            str8 = str5;
        }
        finderForwardStruct.f155320E = finderForwardStruct.mo86045b("jump_id", str8, true);
        C104289g gVar = new C104289g();
        gVar.mo145954o("menu_exp_time", C7433e1.f25623b);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "kvJson.toString()");
        finderForwardStruct.f155321F = finderForwardStruct.mo86045b("client_udf_kv", C112551y.m153814n(gVar2, ",", ";", false), true);
        finderForwardStruct.mo86054n();
        Ec0(finderForwardStruct);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bd, code lost:
        r6 = r6.feedBgmInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void iy0(long r5, int r7, long r8, java.lang.String r10, int r11, int r12, java.lang.String r13, java.lang.String r14) {
        /*
            r4 = this;
            java.lang.String r0 = "fromUser"
            gy3.C87412m.m108594g(r10, r0)
            com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct
            r0.<init>()
            java.lang.Class<h81.i> r1 = h81.C59774i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.i r1 = (h81.C59774i) r1
            java.lang.String r1 = r1.mo84751Wb()
            if (r1 != 0) goto L_0x001a
            java.lang.String r1 = ""
        L_0x001a:
            java.lang.String r2 = "SessionId"
            r3 = 1
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f155182d = r1
            long r1 = (long) r7
            r0.f155183e = r1
            r0.f155184f = r8
            java.lang.String r7 = "SourceUsr"
            java.lang.String r7 = r0.mo86045b(r7, r10, r3)
            r0.f155185g = r7
            java.lang.String r7 = r4.xx0(r5)
            java.lang.String r8 = "FeedId"
            java.lang.String r7 = r0.mo86045b(r8, r7, r3)
            r0.f155186h = r7
            long r7 = (long) r11
            r0.f155191m = r7
            long r7 = (long) r12
            r0.f155192n = r7
            if (r14 == 0) goto L_0x004c
            java.lang.String r7 = "contextid"
            java.lang.String r7 = r0.mo86045b(r7, r14, r3)
            r0.f155197s = r7
        L_0x004c:
            if (r13 == 0) goto L_0x0056
            java.lang.String r7 = "ActivityID"
            java.lang.String r7 = r0.mo86045b(r7, r13, r3)
            r0.f155196r = r7
        L_0x0056:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r4.Br0(r5)
            if (r5 == 0) goto L_0x0101
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r5.getFeedObject()
            java.lang.String r6 = r6.username
            java.lang.String r7 = "FeedUsr"
            java.lang.String r6 = r0.mo86045b(r7, r6, r3)
            r0.f155187i = r6
            er1.q3 r6 = er1.C58771q3.f168268a
            java.lang.String r6 = r6.mo83810a(r5)
            java.lang.String r7 = ","
            java.lang.String r8 = ";"
            r9 = 0
            java.lang.String r6 = z04.C112551y.m153814n(r6, r7, r8, r9)
            java.lang.String r7 = "Tag"
            java.lang.String r6 = r0.mo86045b(r7, r6, r3)
            r0.f155188j = r6
            java.util.LinkedList r6 = r5.getMediaList()
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r8 = r6.hasNext()
            r10 = 1
            if (r8 == 0) goto L_0x00b4
            java.lang.Object r8 = r6.next()
            te3.rq2 r8 = (te3.C64689rq2) r8
            java.lang.String r8 = r8.f185283w
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x00ac
            r10 = 0
        L_0x00ac:
            r0.f155190l = r10
            rx3.b0 r8 = rx3.C13598b0.f38549a
            r7.add(r8)
            goto L_0x0094
        L_0x00b4:
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r5.getFinderObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            r7 = 0
            if (r6 == 0) goto L_0x00c4
            te3.ve1 r6 = r6.feedBgmInfo
            if (r6 == 0) goto L_0x00c4
            java.lang.String r6 = r6.f185874e
            goto L_0x00c5
        L_0x00c4:
            r6 = r7
        L_0x00c5:
            java.lang.String r8 = "GroupID"
            java.lang.String r6 = r0.mo86045b(r8, r6, r3)
            r0.f155193o = r6
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r5.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x00dc
            te3.ve1 r6 = r6.feedBgmInfo
            if (r6 == 0) goto L_0x00dc
            te3.td1 r6 = r6.f185873d
            goto L_0x00dd
        L_0x00dc:
            r6 = r7
        L_0x00dd:
            if (r6 == 0) goto L_0x00ff
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
            if (r5 == 0) goto L_0x00f1
            te3.ve1 r5 = r5.feedBgmInfo
            if (r5 == 0) goto L_0x00f1
            te3.td1 r5 = r5.f185873d
            if (r5 == 0) goto L_0x00f1
            java.lang.String r7 = r5.f185534d
        L_0x00f1:
            if (r7 == 0) goto L_0x00fb
            int r5 = r7.length()
            if (r5 != 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r3 = 0
        L_0x00fb:
            if (r3 != 0) goto L_0x00ff
            r10 = 2
        L_0x00ff:
            r0.f155194p = r10
        L_0x0101:
            r0.mo86054n()
            r4.Ec0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58417y0.iy0(long, int, long, java.lang.String, int, int, java.lang.String, java.lang.String):void");
    }

    public final void j80(FinderObject finderObject, int i) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        ry0(finderObject);
        long j = finderObject.f164794id;
        String str = finderObject.sessionBuffer;
        C64827xe1 xe12 = finderObject.client_local_buffer;
        py0(j, i, str, xe12 != null ? xe12.f186293d : 0);
    }

    /* renamed from: jw */
    public final int mo83336jw() {
        if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            return 1;
        }
        if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
            return 2;
        }
        if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
            return 3;
        }
        if (NetStatusUtil.is4G(MMApplicationContext.getContext())) {
            return 4;
        }
        return NetStatusUtil.is5G(MMApplicationContext.getContext()) ? 5 : 0;
    }

    public final void jy0(long j, int i, String str, int i2, int i3, String str2) {
        String str3 = str;
        C87412m.m108594g(str3, "fromUser");
        iy0(j, i, 1, str3, i2, i3, (String) null, str2);
    }

    public final void ly0(int i, String str, String str2, int i2) {
        String str3 = str;
        String str4 = str2;
        int i3 = i2;
        C87412m.m108594g(str3, "fromUser");
        C87412m.m108594g(str4, "topic");
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        StringBuilder sb = new StringBuilder();
        sb.append(Wb);
        sb.append(',');
        sb.append(i);
        sb.append(",3,");
        sb.append(str3);
        sb.append(",0,,");
        C58771q3 q3Var = C58771q3.f168268a;
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            if (i3 == 2) {
                String str5 = (String) C112550d0.m153785U(str2, new String[]{"·"}, false, 0, 6, (Object) null).get(0);
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put("topic", str5);
            } else {
                jSONObject.put("topic", str4);
            }
            jSONObject.put("type", i3);
            jSONObject.put("count", 0);
            jSONArray.put(jSONObject);
        } catch (Exception unused) {
        }
        sb.append(C112551y.m153814n(q3Var.mo83811b(str4, i3, 0), ",", ";", false) + ",,,");
        C117407d.INSTANCE.kvStat(18944, sb.toString());
    }

    public final void my0(int i, boolean z, String str, int i2, long j, String str2, int i3) {
        C87412m.m108594g(str, "topic");
        C87412m.m108594g(str2, "receiver");
        FinderTagForwardStruct finderTagForwardStruct = new FinderTagForwardStruct();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderTagForwardStruct.f156140d = finderTagForwardStruct.mo86045b("SessionId", Wb, true);
        finderTagForwardStruct.f156141e = (long) i;
        finderTagForwardStruct.f156142f = z ? 1 : 2;
        finderTagForwardStruct.f156143g = finderTagForwardStruct.mo86045b("Tag", C112551y.m153814n(C58771q3.f168268a.mo83811b(str, i2, j), ",", ";", false), true);
        finderTagForwardStruct.f156144h = finderTagForwardStruct.mo86045b("TagId", "", true);
        finderTagForwardStruct.f156145i = j;
        finderTagForwardStruct.f156146j = finderTagForwardStruct.mo86045b("ForwardToUsr", str2, true);
        finderTagForwardStruct.mo86054n();
        Ec0(finderTagForwardStruct);
    }

    public final void ny0(C55033u uVar, int i, int i2) {
        C87412m.m108594g(uVar, "rootComment");
        FinderItem Br0 = Br0(uVar.f154492d.field_feedId);
        if (Br0 != null) {
            FinderExpandSubCommentStruct finderExpandSubCommentStruct = new FinderExpandSubCommentStruct();
            finderExpandSubCommentStruct.f155201d = (long) i;
            finderExpandSubCommentStruct.f155202e = (long) uVar.f154492d.mo89540v2().size();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            int i3 = 1;
            finderExpandSubCommentStruct.f155203f = finderExpandSubCommentStruct.mo86045b("SessionId", Wb, true);
            finderExpandSubCommentStruct.f155204g = finderExpandSubCommentStruct.mo86045b("FeedId", xx0(Br0.getId()), true);
            finderExpandSubCommentStruct.f155205h = finderExpandSubCommentStruct.mo86045b("FeedUsername", Br0.getUserName(), true);
            finderExpandSubCommentStruct.f155208k = System.currentTimeMillis();
            finderExpandSubCommentStruct.f155206i = finderExpandSubCommentStruct.mo86045b("CommentUsername", uVar.f154492d.getUsername(), true);
            finderExpandSubCommentStruct.f155207j = (long) uVar.f154492d.getLikeCount();
            finderExpandSubCommentStruct.f155209l = finderExpandSubCommentStruct.mo86045b("CommentId", xx0(uVar.getItemId()), true);
            finderExpandSubCommentStruct.f155210m = (long) uVar.f154492d.mo89534q2();
            if (i2 == 7 || i2 == 8) {
                finderExpandSubCommentStruct.f155211n = 1;
            } else {
                finderExpandSubCommentStruct.f155211n = 2;
            }
            if ((uVar.f154492d.mo89533p2() & 8) <= 0 && (uVar.f154492d.mo89533p2() & 2) <= 0) {
                i3 = 2;
            }
            finderExpandSubCommentStruct.f155212o = (long) i3;
            finderExpandSubCommentStruct.f155213p = (long) i2;
            finderExpandSubCommentStruct.mo86054n();
            Ec0(finderExpandSubCommentStruct);
        }
    }

    public final String oy0(List<String> list, String str) {
        StringBuilder sb = new StringBuilder("");
        for (String append : list) {
            sb.append(append);
            sb.append(str);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "builder.toString()");
        return C112550d0.m153780P(sb4, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r0 = r0.f122975a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void py0(long r6, int r8, java.lang.String r9, long r10) {
        /*
            r5 = this;
            if (r9 == 0) goto L_0x0399
            r0 = 0
            java.lang.String r1 = ","
            java.lang.String r2 = ";"
            java.lang.String r9 = z04.C112551y.m153814n(r9, r1, r2, r0)
            dp1.i2 r0 = r5.mo83349vP(r6, r8)
            if (r0 == 0) goto L_0x0018
            te3.we1 r0 = r0.f122975a
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.f143989i
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            dp1.i2 r1 = new dp1.i2
            r1.<init>(r9)
            te3.we1 r9 = r1.f122975a
            r9.f143984d = r6
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            long r10 = eb0.C31543z5.m39453c()
        L_0x002d:
            r9.f143986f = r10
            te3.we1 r9 = r1.f122975a
            r9.f143989i = r0
            r9 = 1
            if (r8 == r9) goto L_0x036d
            r10 = 2
            if (r8 == r10) goto L_0x0340
            r10 = 8
            if (r8 == r10) goto L_0x0313
            r10 = 9
            if (r8 == r10) goto L_0x02e5
            r10 = 15
            if (r8 == r10) goto L_0x02b7
            r10 = 16
            if (r8 == r10) goto L_0x02b7
            r10 = 26
            if (r8 == r10) goto L_0x0289
            r10 = 27
            if (r8 == r10) goto L_0x0289
            r10 = 32
            if (r8 == r10) goto L_0x036d
            r10 = 33
            if (r8 == r10) goto L_0x0313
            r10 = 59
            if (r8 == r10) goto L_0x025b
            r10 = 60
            if (r8 == r10) goto L_0x025b
            r10 = 119(0x77, float:1.67E-43)
            if (r8 == r10) goto L_0x022d
            r10 = 120(0x78, float:1.68E-43)
            if (r8 == r10) goto L_0x022d
            r10 = 138(0x8a, float:1.93E-43)
            if (r8 == r10) goto L_0x01ff
            r10 = 139(0x8b, float:1.95E-43)
            if (r8 == r10) goto L_0x01ff
            r10 = 155(0x9b, float:2.17E-43)
            java.lang.String r11 = "_156"
            java.lang.String r0 = "_155"
            if (r8 == r10) goto L_0x01c2
            r10 = 156(0x9c, float:2.19E-43)
            if (r8 == r10) goto L_0x0185
            switch(r8) {
                case 6: goto L_0x0157;
                case 21: goto L_0x0129;
                case 22: goto L_0x02e5;
                case 23: goto L_0x0157;
                case 24: goto L_0x0129;
                case 35: goto L_0x0340;
                case 43: goto L_0x02b7;
                case 81: goto L_0x00fb;
                case 96: goto L_0x00fb;
                case 170: goto L_0x00e3;
                case 171: goto L_0x00cb;
                case 192: goto L_0x00b3;
                case 199: goto L_0x009b;
                default: goto L_0x0080;
            }
        L_0x0080:
            java.util.HashMap<java.lang.String, dp1.i2> r9 = r5.f167354h
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r11 = 95
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.put(r8, r1)
            goto L_0x0399
        L_0x009b:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_199"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x00b3:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_192"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x00cb:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_171"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x00e3:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_170"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x00fb:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_81"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_96"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x0129:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_24"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_21"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x0157:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_6"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_23"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x0185:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r8.put(r10, r1)
            up1.f r8 = up1.C37521f.f99374d
            r8.getClass()
            pe1.c<java.lang.Integer> r8 = up1.C37521f.f99324X0
            java.lang.Object r8 = r8.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r9) goto L_0x0399
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x01c2:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r8.put(r10, r1)
            up1.f r8 = up1.C37521f.f99374d
            r8.getClass()
            pe1.c<java.lang.Integer> r8 = up1.C37521f.f99324X0
            java.lang.Object r8 = r8.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r9) goto L_0x0399
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x01ff:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_138"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_139"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x022d:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_119"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_120"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x025b:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_59"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_60"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x0289:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_26"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_27"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x02b7:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_15"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_16"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x02e5:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_9"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_22"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x0313:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_33"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_8"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x0340:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_35"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_2"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            goto L_0x0399
        L_0x036d:
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_32"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
            java.util.HashMap<java.lang.String, dp1.i2> r8 = r5.f167354h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r10 = "_1"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.put(r9, r1)
        L_0x0399:
            android.util.LongSparseArray<java.lang.Long> r8 = r5.f167353g
            long r9 = eb0.C31543z5.m39453c()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8.put(r6, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58417y0.py0(long, int, java.lang.String, long):void");
    }

    public final int qy0(int i) {
        if (i == 4) {
            return 1;
        }
        if (i != 5) {
            return i != 7 ? 0 : 3;
        }
        return 2;
    }

    public final void ry0(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        if (finderObject.client_local_buffer == null) {
            C64827xe1 xe12 = new C64827xe1();
            finderObject.client_local_buffer = xe12;
            xe12.f186293d = C31543z5.m39453c();
        }
    }

    public final void sy0(Context context, boolean z, int i, boolean z2, boolean z3) {
        C87412m.m108594g(context, "context");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        String str = null;
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        FinderUnflodActionStruct finderUnflodActionStruct = new FinderUnflodActionStruct();
        long j = 0;
        finderUnflodActionStruct.f156167d = q3 != null ? (long) q3.f134675i : 0;
        finderUnflodActionStruct.f156168e = finderUnflodActionStruct.mo86045b("Sessionid", q3 != null ? q3.f134670d : null, true);
        finderUnflodActionStruct.f156169f = finderUnflodActionStruct.mo86045b("Contextid", q3 != null ? q3.f134671e : null, true);
        if (q3 != null) {
            str = q3.f134672f;
        }
        finderUnflodActionStruct.f156170g = finderUnflodActionStruct.mo86045b("ClickTabContextid", str, true);
        if (q3 != null) {
            j = q3.f134676j;
        }
        finderUnflodActionStruct.f156171h = finderUnflodActionStruct.mo86045b("feedid", C61926c.m72691p(j), true);
        long j2 = 1;
        finderUnflodActionStruct.f156172i = z ? 1 : 2;
        finderUnflodActionStruct.f156173j = (long) i;
        finderUnflodActionStruct.f156174k = z2 ? 2 : 1;
        if (z3) {
            j2 = 2;
        }
        finderUnflodActionStruct.f156175l = j2;
        finderUnflodActionStruct.mo86054n();
    }

    public final void ty0(String str, int i, int i2, int i3, int i4) {
        C87412m.m108594g(str, "profileUsername");
        C117407d.INSTANCE.kvStat(20698, str + ',' + i + ',' + i2 + ',' + i3 + ',' + i4);
    }

    public void uv0(long j, String str, String str2, long j2, String str3, String str4, String str5) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "clickId");
        C87412m.m108594g(str3, "sessionid");
        C87412m.m108594g(str4, "setting");
        C87412m.m108594g(str5, "requestId");
        OpenSmallappShopStruct openSmallappShopStruct = new OpenSmallappShopStruct();
        openSmallappShopStruct.f156758d = System.currentTimeMillis();
        openSmallappShopStruct.f156759e = j;
        openSmallappShopStruct.f156762h = openSmallappShopStruct.mo86045b("appid", str, true);
        openSmallappShopStruct.f156765k = openSmallappShopStruct.mo86045b("clickid", str2, true);
        openSmallappShopStruct.f156760f = j2;
        openSmallappShopStruct.f156764j = openSmallappShopStruct.mo86045b("finderid", C66785b.f191882e.mo90662O5(), true);
        openSmallappShopStruct.f156763i = openSmallappShopStruct.mo86045b("session_id", str3, true);
        openSmallappShopStruct.f156761g = openSmallappShopStruct.mo86045b("setting", str4, true);
        openSmallappShopStruct.f156766l = openSmallappShopStruct.mo86045b("requestID", str5, true);
        openSmallappShopStruct.mo86054n();
        Ec0(openSmallappShopStruct);
    }

    public final void uy0(String str, int i, int i2) {
        C87412m.m108594g(str, "fromUsername");
        C117407d.INSTANCE.kvStat(20699, str + ',' + i + ',' + i2);
    }

    /* renamed from: vP */
    public final C45435i2 mo83349vP(long j, int i) {
        HashMap<String, C45435i2> hashMap = this.f167354h;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        return hashMap.get(sb.toString());
    }

    public final void vx0(Context context, long j, String str, C11920q qVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "key");
        C87412m.m108594g(qVar, "infoEx");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        boolean z = false;
        C45435i2 vP = mo83349vP(j, f != null ? f.mo12861q3().f134675i : 0);
        Integer num = null;
        C51822we1 we12 = vP != null ? vP.f122975a : null;
        if (we12 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("jumpinfoType", qVar.f34827a.jumpinfo_type);
                NativeInfo nativeInfo = qVar.f34827a.native_info;
                if (nativeInfo != null) {
                    num = Integer.valueOf(nativeInfo.native_type);
                }
                jSONObject.put("nativeType", num);
                jSONObject.put("wording", qVar.f34827a.wording);
                String str2 = we12.f143989i;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.length() == 0) {
                    z = true;
                }
                JSONObject jSONObject2 = z ? new JSONObject() : new JSONObject(str2);
                JSONObject optJSONObject = jSONObject2.optJSONObject("jumpicon_info");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                optJSONObject.put("jumpicon_info", jSONObject);
                jSONObject2.put(str, optJSONObject);
                we12.f143989i = jSONObject2.toString();
            } catch (JSONException e) {
                Log.m105920e(this.f167350d, e.getMessage());
            }
        }
    }

    public final void vy0(int i, int i2, String str) {
        C87412m.m108594g(str, "msgId");
        FinderSysMsgActionStruct finderSysMsgActionStruct = new FinderSysMsgActionStruct();
        finderSysMsgActionStruct.f156124d = (long) i;
        finderSysMsgActionStruct.f156125e = (long) i2;
        finderSysMsgActionStruct.f156126f = finderSysMsgActionStruct.mo86045b("msgId", str, true);
        finderSysMsgActionStruct.mo86054n();
        Ec0(finderSysMsgActionStruct);
    }

    public void w30(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str7, "appuin");
        C87412m.m108594g(str8, "preWarmPath");
        C87412m.m108594g(str9, "liveid");
        C87412m.m108594g(str10, "finderid");
        C87412m.m108594g(str11, "shopwindowid");
        C87412m.m108594g(str12, "sessionid");
        FinderLivePreWarmStartReportStruct finderLivePreWarmStartReportStruct = new FinderLivePreWarmStartReportStruct();
        finderLivePreWarmStartReportStruct.f155614d = finderLivePreWarmStartReportStruct.mo86045b("appuin", str7, true);
        finderLivePreWarmStartReportStruct.f155615e = 0;
        finderLivePreWarmStartReportStruct.f155616f = 10;
        finderLivePreWarmStartReportStruct.f155618h = finderLivePreWarmStartReportStruct.mo86045b("prewarmpath", str8, true);
        finderLivePreWarmStartReportStruct.f155619i = z ? 1 : 0;
        finderLivePreWarmStartReportStruct.f155620j = z2 ? 1 : 0;
        finderLivePreWarmStartReportStruct.f155621k = finderLivePreWarmStartReportStruct.mo86045b("liveid", str9, true);
        finderLivePreWarmStartReportStruct.f155622l = finderLivePreWarmStartReportStruct.mo86045b("finderid", str10, true);
        finderLivePreWarmStartReportStruct.f155623m = finderLivePreWarmStartReportStruct.mo86045b("shopwindowid", str11, true);
        finderLivePreWarmStartReportStruct.f155624n = finderLivePreWarmStartReportStruct.mo86045b("sessionid", str12, true);
        finderLivePreWarmStartReportStruct.f155617g = finderLivePreWarmStartReportStruct.mo86045b("networktype", String.valueOf(NetworkUtil.getCurrentNetWorkStatus(context)), true);
        finderLivePreWarmStartReportStruct.f155625o = C31543z5.m39453c();
        finderLivePreWarmStartReportStruct.mo86054n();
    }

    public final void wx0(C60905o oVar, long j, FinderItem finderItem) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(finderItem, "feedObject");
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
        boolean z = false;
        int currentPosSec = finderVideoLayout != null ? finderVideoLayout.getCurrentPosSec() : 0;
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        C45435i2 vP = mo83349vP(j, f != null ? f.mo12861q3().f134675i : 0);
        C51822we1 we12 = vP != null ? vP.f122975a : null;
        if (we12 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(finderItem.getMediaList());
                jSONObject.put("video_duration", rq22 != null ? rq22.f185269g : 0);
                jSONObject.put("current_play_sec", currentPosSec);
                String str = we12.f143989i;
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    z = true;
                }
                JSONObject jSONObject2 = z ? new JSONObject() : new JSONObject(str);
                jSONObject2.put("video_play_info", jSONObject);
                we12.f143989i = jSONObject2.toString();
            } catch (JSONException e) {
                Log.m105920e(this.f167350d, e.getMessage());
            }
        }
    }

    public final void wy0(Context context, int i, int i2, Integer num) {
        C87412m.m108594g(context, "context");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        FinderClickPatMusicIconStruct finderClickPatMusicIconStruct = new FinderClickPatMusicIconStruct();
        finderClickPatMusicIconStruct.f155137d = System.currentTimeMillis();
        finderClickPatMusicIconStruct.f155138e = (long) i;
        finderClickPatMusicIconStruct.f155139f = (long) i2;
        long j = 0;
        finderClickPatMusicIconStruct.f155140g = q3 != null ? (long) q3.f134675i : 0;
        if (num != null) {
            j = (long) num.intValue();
        }
        finderClickPatMusicIconStruct.f155141h = j;
        finderClickPatMusicIconStruct.mo86054n();
    }

    public final String xx0(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        if (valueOf.signum() < 0) {
            valueOf = valueOf.add(this.f167357n);
        }
        String bigInteger = valueOf.toString();
        C87412m.m108593f(bigInteger, "b.toString()");
        return bigInteger;
    }

    public final void xy0(int i, String str, String str2, String str3, C49712hj1 hj12) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "profileBizUin");
        C87412m.m108594g(hj12, "contextObj");
        FinderProfileAtPersonStruct finderProfileAtPersonStruct = new FinderProfileAtPersonStruct();
        finderProfileAtPersonStruct.f155901d = (long) i;
        finderProfileAtPersonStruct.f155903f = finderProfileAtPersonStruct.mo86045b("ProfileUsername", str, true);
        finderProfileAtPersonStruct.f155904g = finderProfileAtPersonStruct.mo86045b("ProfileBizUin", str2, true);
        finderProfileAtPersonStruct.f155905h = finderProfileAtPersonStruct.mo86045b("ExtInfo", str3, true);
        finderProfileAtPersonStruct.f155906i = finderProfileAtPersonStruct.mo86045b("Contextid", hj12.f134671e, true);
        String str4 = hj12.f134681r;
        String str5 = "";
        finderProfileAtPersonStruct.f155907j = finderProfileAtPersonStruct.mo86045b("ExtraInfo", str4 != null ? C112551y.m153814n(str4, ",", ";", false) : str5, true);
        String str6 = hj12.f134682s;
        if (str6 != null) {
            str5 = C112551y.m153814n(str6, ",", ";", false);
        }
        finderProfileAtPersonStruct.f155908k = finderProfileAtPersonStruct.mo86045b("EnterSourceInfo", str5, true);
        finderProfileAtPersonStruct.mo86054n();
        Ec0(finderProfileAtPersonStruct);
    }

    /* renamed from: yP */
    public final String mo83357yP() {
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        return uuid;
    }

    public final void yx0(int i, long j, int i2, int i3, String str) {
        FinderFeedAvatarClickStruct finderFeedAvatarClickStruct = new FinderFeedAvatarClickStruct();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderFeedAvatarClickStruct.f155220d = finderFeedAvatarClickStruct.mo86045b("SessionId", Wb, true);
        finderFeedAvatarClickStruct.f155227k = finderFeedAvatarClickStruct.mo86045b("FeedId", xx0(j), true);
        finderFeedAvatarClickStruct.f155229m = (long) i;
        finderFeedAvatarClickStruct.f155228l = (long) i2;
        long j2 = 1;
        if (i2 == 7 || i2 == 8) {
            finderFeedAvatarClickStruct.f155224h = 1;
        } else {
            finderFeedAvatarClickStruct.f155224h = 2;
        }
        finderFeedAvatarClickStruct.f155222f = (long) i3;
        if (str == null) {
            str = "";
        }
        finderFeedAvatarClickStruct.f155221e = finderFeedAvatarClickStruct.mo86045b("FinderUsername", str, true);
        finderFeedAvatarClickStruct.f155223g = finderFeedAvatarClickStruct.mo86045b("Username", C66785b.f191882e.mo90662O5(), true);
        FinderItem Br0 = Br0(j);
        if (Br0 != null) {
            finderFeedAvatarClickStruct.f155225i = (long) Br0.getLikeCount();
            finderFeedAvatarClickStruct.f155226j = (long) Br0.getCommentCount();
        }
        if (BuildInfo.DEBUG) {
            j2 = 0;
        }
        finderFeedAvatarClickStruct.f155230n = j2;
        finderFeedAvatarClickStruct.mo86054n();
        Ec0(finderFeedAvatarClickStruct);
    }

    public final void yy0(long j, String str, long j2, String str2, C49712hj1 hj12) {
        C87412m.m108594g(str, "action");
        FinderAtFeedReportStruct finderAtFeedReportStruct = new FinderAtFeedReportStruct();
        finderAtFeedReportStruct.f155032d = j;
        finderAtFeedReportStruct.f155033e = finderAtFeedReportStruct.mo86045b("Action", str, true);
        finderAtFeedReportStruct.f155038j = j2;
        finderAtFeedReportStruct.f155039k = finderAtFeedReportStruct.mo86045b("ActivityId", str2, true);
        finderAtFeedReportStruct.f155037i = hj12 != null ? (long) hj12.f134675i : 0;
        String str3 = null;
        finderAtFeedReportStruct.f155034f = finderAtFeedReportStruct.mo86045b("SessionId", hj12 != null ? hj12.f134670d : null, true);
        finderAtFeedReportStruct.f155035g = finderAtFeedReportStruct.mo86045b("ClickTabContextid", hj12 != null ? hj12.f134672f : null, true);
        if (hj12 != null) {
            str3 = hj12.f134671e;
        }
        finderAtFeedReportStruct.f155036h = finderAtFeedReportStruct.mo86045b("FinderContexId", str3, true);
        finderAtFeedReportStruct.mo86054n();
        Ec0(finderAtFeedReportStruct);
    }

    public final void zx0(C49712hj1 hj12, int i, int i2) {
        C87412m.m108594g(hj12, "contextObj");
        FinderBacktoTopStruct finderBacktoTopStruct = new FinderBacktoTopStruct();
        finderBacktoTopStruct.f155080g = (long) hj12.f134675i;
        boolean z = true;
        finderBacktoTopStruct.f155077d = finderBacktoTopStruct.mo86045b("Sessionid", hj12.f134670d, true);
        finderBacktoTopStruct.f155078e = finderBacktoTopStruct.mo86045b("Contextid", hj12.f134671e, true);
        finderBacktoTopStruct.f155079f = finderBacktoTopStruct.mo86045b("ClickTabContextId", hj12.f134672f, true);
        finderBacktoTopStruct.f155081h = (long) i;
        if (i2 != 0) {
            C11739f fVar = (C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
            boolean z2 = false;
            if (fVar.f34367q) {
                if (C86709a0.m107535s().mo121142i().mo119689j(fVar.mo11601d3(i2), 0) >= 3) {
                    fVar.f34367q = false;
                    z = false;
                }
                z2 = z;
            }
            finderBacktoTopStruct.f155082i = z2 ? 1 : 0;
        }
        finderBacktoTopStruct.mo86054n();
        Ec0(finderBacktoTopStruct);
    }

    public final void zy0(String str, String str2, String str3, int i, long j, long j2, long j3, int i2) {
        C117407d dVar = C117407d.INSTANCE;
        Object[] objArr = new Object[8];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[1] = str2;
        if (str3 == null) {
            str3 = "";
        }
        objArr[2] = str3;
        objArr[3] = Integer.valueOf(i);
        objArr[4] = C61926c.m72691p(j);
        objArr[5] = Long.valueOf(j2);
        objArr[6] = Long.valueOf(j3);
        objArr[7] = Integer.valueOf(qy0(i2));
        dVar.mo160131h(21834, objArr);
    }
}
