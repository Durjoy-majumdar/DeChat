package hb2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import c30.C104289g;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCardActionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCommentReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MvEnterReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MvExitReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MvInfoReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MvLikeReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MvShareReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MvVideoEditPlayReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MvVideoPlayReportStruct;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import hb2.C59811e;
import i03.C60238a;
import i03.C60239b;
import i03.C60240c;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import o40.C61926c;
import p640ox.C77049b;
import sx3.C110818d0;
import sx3.C77813z;
import te3.C64488kb1;
import te3.C64519lb1;
import te3.C64621p23;
import te3.C64793w23;
import z04.C112551y;

/* renamed from: hb2.q */
public final class C59833q {

    /* renamed from: a */
    public static final C59833q f170832a = new C59833q();

    /* renamed from: b */
    public static int f170833b;

    /* renamed from: c */
    public static C64793w23 f170834c;

    /* renamed from: hb2.q$a */
    public static final class C59834a<T> implements Comparator {

        /* renamed from: d */
        public static final C59834a<T> f170835d = new C59834a<>();

        public int compare(Object obj, Object obj2) {
            Map.Entry entry = (Map.Entry) obj;
            Map.Entry entry2 = (Map.Entry) obj2;
            if (((Number) entry.getValue()).longValue() > ((Number) entry2.getValue()).longValue()) {
                return -1;
            }
            return ((Number) entry.getValue()).longValue() < ((Number) entry2.getValue()).longValue() ? 1 : 0;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m69726g(C59833q qVar, Context context, C64488kb1 kb12, C59822f fVar, int i, int i2, int i3, int i4, int i5, int i6, String str, int i7, int i8, Object obj) {
        int i9 = i8;
        qVar.mo84795f(context, kb12, fVar, i, i2, i3, (i9 & 64) != 0 ? 2 : i4, (i9 & 128) != 0 ? 1 : i5, (i9 & 256) != 0 ? 1 : i6, (i9 & 512) != 0 ? "" : str, (i9 & 1024) != 0 ? 2 : i7);
    }

    /* renamed from: a */
    public final long mo84790a(C59822f fVar) {
        C87412m.m108594g(fVar, "musicMv");
        return fVar.f170774v > 0 ? (fVar.f170775w + C31543z5.m39453c()) - fVar.f170774v : fVar.f170775w;
    }

    /* renamed from: b */
    public final C59835r mo84791b(Context context) {
        C87412m.m108594g(context, "context");
        C59830o oVar = C59830o.f170808a;
        HashMap<Integer, Long> hashMap = C59830o.f170816i;
        LinkedList<Map.Entry> linkedList = new LinkedList<>();
        linkedList.addAll(hashMap.entrySet());
        C77813z.m93909o(linkedList, C59834a.f170835d);
        long j = 1;
        long j2 = 1;
        for (Map.Entry entry : linkedList) {
            if (j < ((long) ((Number) entry.getKey()).intValue())) {
                j = (long) ((Number) entry.getKey()).intValue();
            }
            if (j2 > ((long) ((Number) entry.getKey()).intValue())) {
                j2 = (long) ((Number) entry.getKey()).intValue();
            }
        }
        Map.Entry entry2 = (Map.Entry) C110818d0.m150916N(linkedList);
        return new C59835r(j, j2, entry2 != null ? (long) ((Number) entry2.getKey()).intValue() : 0);
    }

    /* renamed from: c */
    public final long mo84792c(Context context) {
        C87412m.m108594g(context, "context");
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
        if (w232 == null) {
            return 0 / ((long) 1000);
        }
        if (w232.f186043q <= 0) {
            return (Util.currentTicks() - w232.f186041o) - w232.f186042p;
        }
        long currentTicks = Util.currentTicks() - w232.f186043q;
        Log.m105924i("MicroMsg.Mv.MvReportLogic", "pause music now, pauseTime:" + currentTicks);
        return (Util.currentTicks() - w232.f186041o) - currentTicks;
    }

    /* renamed from: d */
    public final void mo84793d(Context context, C64488kb1 kb12, C59822f fVar, int i, long j) {
        String str;
        FinderContact finderContact;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(kb12, "songInfo");
        Log.m105924i("MicroMsg.Mv.MvReportLogic", "reportComment, action:" + i);
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
        MvCommentReportStruct mvCommentReportStruct = new MvCommentReportStruct();
        if (w232 != null) {
            mvCommentReportStruct.f156522d = mvCommentReportStruct.mo86045b("ContextId", w232.f186034e, true);
            mvCommentReportStruct.f156532n = f170832a.mo84792c(context);
        }
        String str2 = kb12.f183904d;
        String str3 = null;
        mvCommentReportStruct.f156523e = mvCommentReportStruct.mo86045b("SongName", str2 != null ? C112551y.m153814n(str2, ",", " ", false) : null, true);
        String str4 = kb12.f183909i;
        mvCommentReportStruct.f156524f = mvCommentReportStruct.mo86045b("SongId", str4 != null ? C112551y.m153814n(str4, ",", " ", false) : null, true);
        mvCommentReportStruct.f156525g = mvCommentReportStruct.mo86045b("WebUrl", kb12.f183908h, true);
        mvCommentReportStruct.f156526h = mvCommentReportStruct.mo86045b("DataUrl", kb12.f183906f, true);
        String str5 = kb12.f183905e;
        if (str5 != null) {
            str3 = C112551y.m153814n(str5, ",", " ", false);
        }
        mvCommentReportStruct.f156536r = mvCommentReportStruct.mo86045b("Singer", str3, true);
        long j2 = (long) 1000;
        mvCommentReportStruct.f156531m = ((long) kb12.f183918u) / j2;
        if (fVar != null) {
            Long l = fVar.f170755c;
            mvCommentReportStruct.f156528j = mvCommentReportStruct.mo86045b("MvObjectId", C61926c.m72691p(l != null ? l.longValue() : 0), true);
            mvCommentReportStruct.f156529k = mvCommentReportStruct.mo86045b("MvNonceId", fVar.f170756d, true);
            FinderObject d = C59822f.f170752A.mo84779d(fVar);
            if (d == null || (finderContact = d.contact) == null || (str = finderContact.username) == null) {
                str = "";
            }
            mvCommentReportStruct.f156530l = mvCommentReportStruct.mo86045b("MvUserId", str, true);
            mvCommentReportStruct.f156533o = f170832a.mo84790a(fVar) / j2;
        }
        mvCommentReportStruct.f156527i = (long) i;
        mvCommentReportStruct.f156534p = mvCommentReportStruct.mo86045b("CommentId", String.valueOf(j), true);
        mvCommentReportStruct.mo86054n();
        mvCommentReportStruct.mo86056r();
    }

    /* renamed from: e */
    public final void mo84794e(Context context, C64488kb1 kb12, C59822f fVar) {
        String str;
        FinderContact finderContact;
        Context context2 = context;
        C64488kb1 kb13 = kb12;
        C59822f fVar2 = fVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(kb13, "songInfo");
        C87412m.m108594g(fVar2, "musicMv");
        Log.m105924i("MicroMsg.Mv.MvReportLogic", "reportMVExit");
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context2, 7, C64793w23.class);
        if (w232 == null) {
            w232 = f170834c;
        }
        MvExitReportStruct mvExitReportStruct = new MvExitReportStruct();
        if (w232 != null) {
            Log.m105924i("MicroMsg.Mv.MvReportLogic", "reportMVExit, isComment:" + w232.f186039j + ", isDragProcess:" + w232.f186040n + ", StartPlayMusicTick:" + w232.f186041o + ", PausePlayMusicTime:" + w232.f186042p + ", scene:" + w232.f186033d);
            mvExitReportStruct.f156603d = mvExitReportStruct.mo86045b("ContextId", w232.f186034e, true);
            String str2 = kb13.f183904d;
            String str3 = null;
            mvExitReportStruct.f156604e = mvExitReportStruct.mo86045b("SongName", str2 != null ? C112551y.m153814n(str2, ",", " ", false) : null, true);
            mvExitReportStruct.f156605f = mvExitReportStruct.mo86045b("WebUrl", kb13.f183908h, true);
            mvExitReportStruct.f156606g = mvExitReportStruct.mo86045b("DataUrl", kb13.f183906f, true);
            mvExitReportStruct.f156607h = (long) w232.f186033d;
            mvExitReportStruct.f156608i = mvExitReportStruct.mo86045b("FromSourceId", w232.f186036g, true);
            mvExitReportStruct.f156609j = mvExitReportStruct.mo86045b("AppId", kb13.f183907g, true);
            Long l = fVar2.f170755c;
            mvExitReportStruct.f156610k = mvExitReportStruct.mo86045b("mvObjectId", C61926c.m72691p(l != null ? l.longValue() : 0), true);
            mvExitReportStruct.f156611l = mvExitReportStruct.mo86045b("mvNonceId", fVar2.f170756d, true);
            String str4 = kb13.f183910j;
            mvExitReportStruct.f156612m = str4 == null || str4.length() == 0 ? 2 : 1;
            C59833q qVar = f170832a;
            C59835r b = qVar.mo84791b(context2);
            mvExitReportStruct.f156613n = b.f170836a;
            mvExitReportStruct.f156614o = b.f170837b;
            mvExitReportStruct.f156615p = (long) w232.f186037h;
            mvExitReportStruct.f156617r = (long) w232.f186039j;
            String str5 = kb13.f183909i;
            mvExitReportStruct.f156618s = mvExitReportStruct.mo86045b("SongId", str5 != null ? C112551y.m153814n(str5, ",", " ", false) : null, true);
            mvExitReportStruct.f156607h = (long) w232.f186033d;
            mvExitReportStruct.f156619t = (long) kb13.f183918u;
            mvExitReportStruct.f156620u = qVar.mo84792c(context2);
            mvExitReportStruct.f156616q = qVar.mo84790a(fVar2);
            Log.m105924i("MicroMsg.Mv.MvReportLogic", "playMusicTime:" + mvExitReportStruct.f156620u + ", PauseMusicTick:" + w232.f186043q + ", playMvTime:" + mvExitReportStruct.f156616q);
            mvExitReportStruct.f156621v = (long) w232.f186040n;
            FinderObject d = C59822f.f170752A.mo84779d(fVar2);
            if (d == null || (finderContact = d.contact) == null || (str = finderContact.username) == null) {
                str = "";
            }
            mvExitReportStruct.f156622w = mvExitReportStruct.mo86045b("mvUserId", str, true);
            String str6 = kb13.f183905e;
            if (str6 != null) {
                str3 = C112551y.m153814n(str6, ",", " ", false);
            }
            mvExitReportStruct.f156623x = mvExitReportStruct.mo86045b("Singer", str3, true);
            mvExitReportStruct.f156601A = mvExitReportStruct.mo86045b("PlaySameSongSessionId", C59829j.f170807i, true);
            if (fVar2.f170778z) {
                mvExitReportStruct.f156602B = 1;
            } else {
                mvExitReportStruct.f156602B = 2;
            }
            Log.m105924i("MicroMsg.Mv.MvReportLogic", "isMvWithBeat:" + fVar2.f170778z + ", playSameSongSessionId:" + C59829j.f170807i);
            mvExitReportStruct.f156624y = (long) w232.f186049w;
            mvExitReportStruct.f156625z = (long) w232.f186050x;
            w232.f186049w = 0;
            w232.f186050x = 0;
        }
        mvExitReportStruct.mo86054n();
        mvExitReportStruct.mo86056r();
    }

    /* renamed from: f */
    public final void mo84795f(Context context, C64488kb1 kb12, C59822f fVar, int i, int i2, int i3, int i4, int i5, int i6, String str, int i7) {
        String str2;
        Context context2 = context;
        C64488kb1 kb13 = kb12;
        int i8 = i;
        String str3 = str;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(kb13, "songInfo");
        C87412m.m108594g(fVar, "musicMv");
        C87412m.m108594g(str3, "jumpType");
        Log.m105924i("MicroMsg.Mv.MvReportLogic", "reportMvInfo, action:" + i8);
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
        MvInfoReportStruct mvInfoReportStruct = new MvInfoReportStruct();
        if (w232 != null) {
            mvInfoReportStruct.f156626d = mvInfoReportStruct.mo86045b("ContextId", w232.f186034e, true);
            String str4 = kb13.f183904d;
            String str5 = null;
            mvInfoReportStruct.f156627e = mvInfoReportStruct.mo86045b("SongName", str4 != null ? C112551y.m153814n(str4, ",", " ", false) : null, true);
            String str6 = kb13.f183909i;
            mvInfoReportStruct.f156628f = mvInfoReportStruct.mo86045b("SongId", str6 != null ? C112551y.m153814n(str6, ",", " ", false) : null, true);
            mvInfoReportStruct.f156629g = mvInfoReportStruct.mo86045b("WebUrl", kb13.f183908h, true);
            mvInfoReportStruct.f156630h = mvInfoReportStruct.mo86045b("DataUrl", kb13.f183906f, true);
            String str7 = kb13.f183905e;
            if (str7 != null) {
                str5 = C112551y.m153814n(str7, ",", " ", false);
            }
            mvInfoReportStruct.f156631i = mvInfoReportStruct.mo86045b("Singer", str5, true);
            long j = (long) i8;
            mvInfoReportStruct.f156632j = j;
            mvInfoReportStruct.f156633k = mvInfoReportStruct.mo86045b("AppId", kb13.f183907g, true);
            String str8 = kb13.f183910j;
            mvInfoReportStruct.f156634l = str8 == null || str8.length() == 0 ? 2 : 1;
            mvInfoReportStruct.f156635m = mvInfoReportStruct.mo86045b("Sect", kb13.f183913p, true);
            mvInfoReportStruct.f156636n = mvInfoReportStruct.mo86045b("CoverURL", kb13.f183912o, true);
            mvInfoReportStruct.f156632j = j;
            mvInfoReportStruct.f156638p = (long) i2;
            mvInfoReportStruct.f156639q = (long) i3;
            C64519lb1 lb12 = kb13.f183921x;
            mvInfoReportStruct.f156640r = mvInfoReportStruct.mo86045b("H5URL", (lb12 == null || (str2 = lb12.f184069d) == null) ? "" : C112551y.m153814n(str2, ",", " ", false), true);
            mvInfoReportStruct.f156641s = (long) i4;
            mvInfoReportStruct.f156643u = (long) i6;
            mvInfoReportStruct.f156642t = (long) i5;
            mvInfoReportStruct.f156644v = mvInfoReportStruct.mo86045b("JumpType", str3, true);
            mvInfoReportStruct.f156645w = (long) i7;
        }
        mvInfoReportStruct.mo86054n();
        mvInfoReportStruct.mo86056r();
    }

    /* renamed from: h */
    public final void mo84796h(Context context, C64488kb1 kb12, C59822f fVar, int i, int i2) {
        String str;
        FinderContact finderContact;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(kb12, "songInfo");
        C87412m.m108594g(fVar, "musicMv");
        Log.m105924i("MicroMsg.Mv.MvReportLogic", "reportMvLike, action:" + i);
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
        MvLikeReportStruct mvLikeReportStruct = new MvLikeReportStruct();
        if (w232 != null) {
            mvLikeReportStruct.f156646d = mvLikeReportStruct.mo86045b("ContextId", w232.f186034e, true);
            C59833q qVar = f170832a;
            mvLikeReportStruct.f156656n = qVar.mo84792c(context);
            mvLikeReportStruct.f156657o = qVar.mo84790a(fVar) / ((long) 1000);
        }
        String str2 = kb12.f183904d;
        String str3 = null;
        mvLikeReportStruct.f156647e = mvLikeReportStruct.mo86045b("SongName", str2 != null ? C112551y.m153814n(str2, ",", " ", false) : null, true);
        String str4 = kb12.f183909i;
        mvLikeReportStruct.f156648f = mvLikeReportStruct.mo86045b("SongId", str4 != null ? C112551y.m153814n(str4, ",", " ", false) : null, true);
        mvLikeReportStruct.f156649g = mvLikeReportStruct.mo86045b("WebUrl", kb12.f183908h, true);
        mvLikeReportStruct.f156650h = mvLikeReportStruct.mo86045b("DataUrl", kb12.f183906f, true);
        String str5 = kb12.f183905e;
        if (str5 != null) {
            str3 = C112551y.m153814n(str5, ",", " ", false);
        }
        mvLikeReportStruct.f156661s = mvLikeReportStruct.mo86045b("Singer", str3, true);
        mvLikeReportStruct.f156655m = ((long) kb12.f183918u) / ((long) 1000);
        Long l = fVar.f170755c;
        mvLikeReportStruct.f156652j = mvLikeReportStruct.mo86045b("MvObjectId", C61926c.m72691p(l != null ? l.longValue() : 0), true);
        mvLikeReportStruct.f156653k = mvLikeReportStruct.mo86045b("MvNonceId", fVar.f170756d, true);
        FinderObject d = C59822f.f170752A.mo84779d(fVar);
        if (d == null || (finderContact = d.contact) == null || (str = finderContact.username) == null) {
            str = "";
        }
        mvLikeReportStruct.f156654l = mvLikeReportStruct.mo86045b("MvUserId", str, true);
        mvLikeReportStruct.f156651i = (long) i;
        mvLikeReportStruct.f156662t = (long) i2;
        mvLikeReportStruct.mo86054n();
        mvLikeReportStruct.mo86056r();
    }

    /* renamed from: i */
    public final void mo84797i(Context context, C64488kb1 kb12, C59822f fVar, int i, int i2, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(kb12, "songInfo");
        C87412m.m108594g(fVar, "musicMv");
        C87412m.m108594g(str, "jumpType");
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
        f170834c = w232;
        MvEnterReportStruct mvEnterReportStruct = new MvEnterReportStruct();
        long j = 0;
        if (w232 != null) {
            mvEnterReportStruct.f156578d = mvEnterReportStruct.mo86045b("ContextId", w232.f186034e, true);
            mvEnterReportStruct.f156583i = (long) w232.f186033d;
            mvEnterReportStruct.f156584j = mvEnterReportStruct.mo86045b("FromSourceId", w232.f186036g, true);
            w232.f186044r = 0;
            w232.f186045s = 0;
            w232.f186048v = 0;
            w232.f186046t = 0;
            w232.f186047u = 2;
            if (w232.f186033d == 18) {
                f170833b = 18;
            }
        }
        String str2 = null;
        if (f170833b == 18 && (context instanceof Activity)) {
            Intent intent = ((Activity) context).getIntent();
            mvEnterReportStruct.f156569B = mvEnterReportStruct.mo86045b("SceneNote", intent != null ? intent.getStringExtra("key_mv_scene_note") : null, true);
        }
        String str3 = kb12.f183904d;
        mvEnterReportStruct.f156579e = mvEnterReportStruct.mo86045b("SongName", str3 != null ? C112551y.m153814n(str3, ",", " ", false) : null, true);
        mvEnterReportStruct.f156582h = mvEnterReportStruct.mo86045b("AppId", kb12.f183907g, true);
        mvEnterReportStruct.f156580f = mvEnterReportStruct.mo86045b("WebUrl", kb12.f183908h, true);
        mvEnterReportStruct.f156581g = mvEnterReportStruct.mo86045b("DataUrl", kb12.f183906f, true);
        String str4 = kb12.f183910j;
        mvEnterReportStruct.f156587m = str4 == null || str4.length() == 0 ? 2 : 1;
        Long l = fVar.f170755c;
        if (l != null) {
            j = l.longValue();
        }
        mvEnterReportStruct.f156585k = mvEnterReportStruct.mo86045b("MvObjectId", C61926c.m72691p(j), true);
        mvEnterReportStruct.f156586l = mvEnterReportStruct.mo86045b("MvNonceId", fVar.f170756d, true);
        String str5 = kb12.f183909i;
        mvEnterReportStruct.f156588n = mvEnterReportStruct.mo86045b("SongId", str5 != null ? C112551y.m153814n(str5, ",", " ", false) : null, true);
        mvEnterReportStruct.f156589o = 1;
        String str6 = kb12.f183905e;
        if (str6 != null) {
            str2 = C112551y.m153814n(str6, ",", " ", false);
        }
        mvEnterReportStruct.f156596v = mvEnterReportStruct.mo86045b("Singer", str2, true);
        mvEnterReportStruct.f156573F = mvEnterReportStruct.mo86045b("PlaySameSongSessionId", C59829j.f170807i, true);
        Log.m105924i("MicroMsg.Mv.MvReportLogic", "reportMvMainUIEnter struct.contextId:" + mvEnterReportStruct.f156578d + ", playSameSongSessionId:" + mvEnterReportStruct.f156573F);
        mvEnterReportStruct.mo86054n();
        mvEnterReportStruct.mo86056r();
    }

    /* renamed from: j */
    public final void mo84798j(Context context, C64621p23 p232, int i, C59811e eVar, C60238a aVar, C60239b bVar) {
        String str;
        C87412m.m108594g(context, "context");
        if (p232 != null && eVar != null && aVar != null && bVar != null) {
            aVar.f171736c = Util.ticksToNow(aVar.f171734a);
            C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
            MvVideoEditPlayReportStruct mvVideoEditPlayReportStruct = new MvVideoEditPlayReportStruct();
            int i2 = 1;
            if (w232 != null) {
                mvVideoEditPlayReportStruct.f156679e = mvVideoEditPlayReportStruct.mo86045b("contextId", w232.f186034e, true);
                mvVideoEditPlayReportStruct.f156678d = (long) w232.f186033d;
            }
            C59811e.C59820h hVar = eVar.f170731n;
            boolean c = hVar != null ? hVar.mo84770c() : false;
            boolean z = eVar.f170732o != null;
            FinderObject finderObject = p232.f184739d;
            if (finderObject == null || (str = Long.valueOf(finderObject.f164794id).toString()) == null) {
                str = "";
            }
            mvVideoEditPlayReportStruct.f156680f = mvVideoEditPlayReportStruct.mo86045b("mvObjectId", str, true);
            FinderObject finderObject2 = p232.f184739d;
            mvVideoEditPlayReportStruct.f156681g = mvVideoEditPlayReportStruct.mo86045b("mvNonceId", finderObject2 != null ? finderObject2.objectNonceId : null, true);
            mvVideoEditPlayReportStruct.f156682h = i;
            mvVideoEditPlayReportStruct.f156683i = z ? 2 : 1;
            if (!c) {
                i2 = 2;
            }
            mvVideoEditPlayReportStruct.f156684j = i2;
            mvVideoEditPlayReportStruct.f156685k = aVar.f171735b;
            mvVideoEditPlayReportStruct.f156686l = (long) aVar.f171737d;
            mvVideoEditPlayReportStruct.f156687m = (long) aVar.f171743j;
            mvVideoEditPlayReportStruct.f156688n = (long) aVar.f171744k;
            mvVideoEditPlayReportStruct.mo86054n();
            aVar.f171734a = Util.currentTicks();
            bVar.f171745a = 0;
            bVar.f171746b = 0;
            bVar.f171747c = 0;
            bVar.f171748d = 0;
            mvVideoEditPlayReportStruct.mo86056r();
        }
    }

    /* renamed from: k */
    public final void mo84799k(Context context, C64488kb1 kb12, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(kb12, "songInfo");
        Log.m105924i("MicroMsg.Mv.MvReportLogic", "reportMvMusicCardAction, action:" + i);
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
        MvCardActionReportStruct mvCardActionReportStruct = new MvCardActionReportStruct();
        if (w232 != null) {
            mvCardActionReportStruct.f156512d = mvCardActionReportStruct.mo86045b("ContextId", w232.f186034e, true);
            mvCardActionReportStruct.f156519k = (long) w232.f186033d;
            mvCardActionReportStruct.f156520l = mvCardActionReportStruct.mo86045b("FromSourceId", w232.f186036g, true);
        }
        String str = kb12.f183904d;
        String str2 = null;
        mvCardActionReportStruct.f156513e = mvCardActionReportStruct.mo86045b("SongName", str != null ? C112551y.m153814n(str, ",", " ", false) : null, true);
        String str3 = kb12.f183909i;
        mvCardActionReportStruct.f156514f = mvCardActionReportStruct.mo86045b("SongId", str3 != null ? C112551y.m153814n(str3, ",", " ", false) : null, true);
        mvCardActionReportStruct.f156515g = mvCardActionReportStruct.mo86045b("WebUrl", kb12.f183908h, true);
        mvCardActionReportStruct.f156516h = mvCardActionReportStruct.mo86045b("DataUrl", kb12.f183906f, true);
        String str4 = kb12.f183905e;
        if (str4 != null) {
            str2 = C112551y.m153814n(str4, ",", " ", false);
        }
        mvCardActionReportStruct.f156517i = mvCardActionReportStruct.mo86045b("Singer", str2, true);
        mvCardActionReportStruct.f156521m = mvCardActionReportStruct.mo86045b("AppId", kb12.f183907g, true);
        mvCardActionReportStruct.f156518j = (long) i;
        mvCardActionReportStruct.mo86054n();
        mvCardActionReportStruct.mo86056r();
    }

    /* renamed from: l */
    public final void mo84800l(Context context, C59822f fVar, C60240c cVar) {
        String str;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(fVar, "musicMv");
        if (cVar != null && !cVar.f171754e.isEmpty()) {
            cVar.f171752c = Util.ticksToNow(cVar.f171751b);
            C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
            MvVideoPlayReportStruct mvVideoPlayReportStruct = new MvVideoPlayReportStruct();
            if (w232 != null) {
                mvVideoPlayReportStruct.f156690e = mvVideoPlayReportStruct.mo86045b("contextId", w232.f186034e, true);
                mvVideoPlayReportStruct.f156689d = (long) w232.f186033d;
            }
            mvVideoPlayReportStruct.f156692g = mvVideoPlayReportStruct.mo86045b("mvNonceId", fVar.f170756d, true);
            Long l = fVar.f170755c;
            mvVideoPlayReportStruct.f156691f = mvVideoPlayReportStruct.mo86045b("mvObjectId", l != null ? l.toString() : null, true);
            mvVideoPlayReportStruct.f156693h = cVar.f171753d;
            mvVideoPlayReportStruct.f156695j = cVar.f171752c;
            Collection<C60238a> values = cVar.f171754e.values();
            C87412m.m108593f(values, "playInfo.mediaReportInfo.values");
            int i = 0;
            for (C60238a aVar : values) {
                i += aVar.f171737d;
            }
            mvVideoPlayReportStruct.f156694i = (long) i;
            try {
                C104289g gVar = new C104289g();
                for (Map.Entry next : cVar.f171754e.entrySet()) {
                    C104289g gVar2 = new C104289g();
                    gVar2.mo145954o("firstFrame", ((C60238a) next.getValue()).f171735b);
                    gVar2.mo145954o("playTime", ((C60238a) next.getValue()).f171736c);
                    gVar2.mo145953n("waitCount", ((C60238a) next.getValue()).f171737d);
                    gVar2.mo145953n("renderTime", ((C60238a) next.getValue()).f171740g);
                    if (((C60238a) next.getValue()).f171744k != 1000) {
                        gVar2.mo145953n("errType", ((C60238a) next.getValue()).f171743j);
                        gVar2.mo145953n("errCode", ((C60238a) next.getValue()).f171744k);
                    }
                    if (((C60238a) next.getValue()).f171741h > 0) {
                        gVar2.mo145953n("ptsNegative", ((C60238a) next.getValue()).f171741h);
                    }
                    if (((C60238a) next.getValue()).f171742i > 0) {
                        gVar2.mo145953n("ptsOutOfBound", ((C60238a) next.getValue()).f171742i);
                    }
                    gVar.put(String.valueOf(((Number) next.getKey()).intValue()), gVar2);
                }
                String gVar3 = gVar.toString();
                C87412m.m108593f(gVar3, "obj.toString()");
                str = C112551y.m153814n(gVar3, ",", ";", false);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MV.MvReportInfo", e, "getJson", new Object[0]);
                str = "";
            }
            mvVideoPlayReportStruct.f156696k = mvVideoPlayReportStruct.mo86045b("VideoPlayInfo", str, true);
            Collection<C60238a> values2 = cVar.f171754e.values();
            C87412m.m108593f(values2, "mediaReportInfo.values");
            int i2 = 0;
            for (C60238a aVar2 : values2) {
                i2 += aVar2.f171744k != 1000 ? 1 : 0;
            }
            mvVideoPlayReportStruct.f156697l = (long) i2;
            mvVideoPlayReportStruct.mo86054n();
            cVar.f171754e.clear();
            C60239b bVar = cVar.f171750a;
            if (bVar != null) {
                bVar.f171745a = 0;
                bVar.f171746b = 0;
                bVar.f171747c = 0;
                bVar.f171748d = 0;
            }
            mvVideoPlayReportStruct.mo86056r();
        }
    }

    /* renamed from: m */
    public final void mo84801m(Context context, C64488kb1 kb12, C59822f fVar, int i, int i2, String str, int i3) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(kb12, "songInfo");
        C87412m.m108594g(fVar, "musicMv");
        C87412m.m108594g(str, "fromSourceId");
        MvShareReportStruct mvShareReportStruct = new MvShareReportStruct();
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
        if (w232 != null) {
            mvShareReportStruct.f156663d = mvShareReportStruct.mo86045b("ContextId", w232.f186034e, true);
        }
        String str2 = kb12.f183904d;
        String str3 = null;
        mvShareReportStruct.f156664e = mvShareReportStruct.mo86045b("SongName", str2 != null ? C112551y.m153814n(str2, ",", " ", false) : null, true);
        String str4 = kb12.f183909i;
        if (str4 != null) {
            str3 = C112551y.m153814n(str4, ",", " ", false);
        }
        mvShareReportStruct.f156665f = mvShareReportStruct.mo86045b("SongId", str3, true);
        mvShareReportStruct.f156666g = mvShareReportStruct.mo86045b("WebUrl", kb12.f183908h, true);
        mvShareReportStruct.f156667h = mvShareReportStruct.mo86045b("DataUrl", kb12.f183906f, true);
        mvShareReportStruct.f156672m = mvShareReportStruct.mo86045b("AppId", kb12.f183907g, true);
        mvShareReportStruct.f156675p = mvShareReportStruct.mo86045b("Singer", kb12.f183905e, true);
        mvShareReportStruct.f156673n = (long) i2;
        mvShareReportStruct.f156668i = (long) i;
        mvShareReportStruct.f156674o = mvShareReportStruct.mo86045b("FromSourceId", str, true);
        mvShareReportStruct.f156676q = 2;
        FinderObject d = C59822f.f170752A.mo84779d(fVar);
        if (d != null) {
            mvShareReportStruct.f156669j = mvShareReportStruct.mo86045b("MvObjectId", C61926c.m72691p(d.f164794id), true);
            mvShareReportStruct.f156670k = mvShareReportStruct.mo86045b("MvNonceId", d.objectNonceId, true);
            mvShareReportStruct.f156671l = mvShareReportStruct.mo86045b("MvUserId", d.username, true);
        }
        mvShareReportStruct.f156677r = (long) i3;
        mvShareReportStruct.mo86054n();
        mvShareReportStruct.mo86056r();
    }
}
