package vz2;

import android.content.Context;
import az2.C39674e;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.TextStateCardExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.TextStateFriendTopicListStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.TextStatusCliPostStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.TextStatusHistoryPageV2Struct;
import com.tencent.p014mm.autogen.mmdata.rpt.TextStatusNotificationCliOpStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.TextStatusOperateCliLogStruct;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dm2.C58325i;
import eb0.C31543z5;
import gy3.C87412m;
import hz2.C60235a;
import kj2.C61103a;
import p606mm.C99933h;
import p640ox.C77049b;
import p749xh.C38549d8;
import p773yy.C66710j;
import pe3.C47465a;
import qy2.C47904x;
import qy2.C77459z;
import rx3.C13598b0;
import rz2.C48200b;
import rz2.C48201c;
import su0.C13781a;
import uz2.C52678e0;
import uz2.C78315f0;
import uz2.C78318v1;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: vz2.d */
public final class C78501d {

    /* renamed from: a */
    public static final C78501d f229945a = new C78501d();

    /* renamed from: vz2.d$a */
    public static final class C78502a<T extends C47465a> implements C58325i {

        /* renamed from: a */
        public final /* synthetic */ C78318v1 f229946a;

        public C78502a(C78318v1 v1Var) {
            this.f229946a = v1Var;
        }

        /* renamed from: a */
        public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
            C78318v1 v1Var = (C78318v1) aVar;
            Log.m105924i("MicroMsg.TextStatus.tsReport", "postReportByTextStatusEditActivity onActionDone " + i + ' ' + z + ' ' + this.f229946a.f229500d);
        }
    }

    /* renamed from: e */
    public static void m94804e(C78501d dVar, String str, Long l, String str2, String str3, int i, Object obj) {
        C13598b0 b0Var;
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        dVar.getClass();
        if (str != null) {
            ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(8, "StatusTextPost_" + str, C78318v1.class, new C78500c(str, l, str2, str3));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105924i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
        }
    }

    /* renamed from: g */
    public static void m94805g(C78501d dVar, long j, String str, String str2, long j2, String str3, long j3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            C78315f0 b = dVar.mo108456b();
            str2 = b != null ? b.f229428d : null;
            if (str2 == null) {
                str2 = "";
            }
        }
        if ((i & 8) != 0) {
            j2 = 0;
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            j3 = 0;
        }
        dVar.getClass();
        Class cls = C47904x.class;
        C87412m.m108594g(str, "actionResult");
        C87412m.m108594g(str2, "sessionId");
        TextStatusOperateCliLogStruct textStatusOperateCliLogStruct = new TextStatusOperateCliLogStruct();
        textStatusOperateCliLogStruct.f194614e = j;
        textStatusOperateCliLogStruct.f194615f = textStatusOperateCliLogStruct.mo86045b("ActionResult", str, true);
        textStatusOperateCliLogStruct.f194616g = C31543z5.m39453c();
        textStatusOperateCliLogStruct.f194613d = textStatusOperateCliLogStruct.mo86045b("SessionID", str2, true);
        textStatusOperateCliLogStruct.f194621l = textStatusOperateCliLogStruct.mo86045b("SceneSessionID", ((C47904x) C86312j.m106911c(cls)).mo72664YY(), true);
        textStatusOperateCliLogStruct.f194622m = textStatusOperateCliLogStruct.mo86045b("PageID", ((C47904x) C86312j.m106911c(cls)).F00(), true);
        textStatusOperateCliLogStruct.f194617h = j2;
        textStatusOperateCliLogStruct.f194618i = textStatusOperateCliLogStruct.mo86045b("ToStatusID", str3, true);
        textStatusOperateCliLogStruct.f194619j = j3;
        textStatusOperateCliLogStruct.mo86054n();
        f229945a.mo108460l(textStatusOperateCliLogStruct);
    }

    /* renamed from: h */
    public static void m94806h(C78501d dVar, Context context, long j, String str, C48201c cVar, long j2, long j3, long j4, long j5, Integer num, int i, Object obj) {
        boolean z;
        Context context2 = context;
        int i2 = i;
        String str2 = "";
        String str3 = (i2 & 4) != 0 ? str2 : str;
        C48201c cVar2 = (i2 & 8) != 0 ? null : cVar;
        long j6 = (i2 & 16) != 0 ? 0 : j2;
        long j7 = (i2 & 32) != 0 ? 0 : j3;
        long j8 = (i2 & 64) != 0 ? -1 : j4;
        long j9 = (i2 & 128) != 0 ? 0 : j5;
        Integer num2 = (i2 & 256) != 0 ? 0 : num;
        dVar.getClass();
        Class cls = C47904x.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str3, "actionResult");
        C47465a Wi0 = ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context2, 9, C78315f0.class);
        if (Wi0 == null) {
            Log.m105920e("MicroMsg.TextStatus.tsReport", "report null err :" + context.getClass().getSimpleName());
            Wi0 = new C78315f0();
            z = false;
        } else {
            z = true;
        }
        if (cVar2 != null || (cVar2 = C39674e.f106452d.mo62253n0(((C78315f0) Wi0).f229429e)) != null) {
            TextStateCardExposeStruct textStateCardExposeStruct = new TextStateCardExposeStruct();
            C78315f0 f0Var = (C78315f0) Wi0;
            textStateCardExposeStruct.f194488d = textStateCardExposeStruct.mo86045b("SessionID", f0Var.f229428d, true);
            textStateCardExposeStruct.f194478D = textStateCardExposeStruct.mo86045b("SceneSessionID", ((C47904x) C86312j.m106911c(cls)).mo72664YY(), true);
            textStateCardExposeStruct.f194479E = textStateCardExposeStruct.mo86045b("PageID", ((C47904x) C86312j.m106911c(cls)).F00(), true);
            C52678e0 a = C66710j.C53637a.m60171a(cVar2, false, 1, (Object) null);
            textStateCardExposeStruct.f194489e = textStateCardExposeStruct.mo86045b("TopicID", a.f147087d, true);
            long j15 = j6;
            textStateCardExposeStruct.f194484J = (long) a.f147099s;
            textStateCardExposeStruct.f194485K = textStateCardExposeStruct.mo86045b("ClusterID", C48200b.m53530c(a), true);
            textStateCardExposeStruct.f194490f = textStateCardExposeStruct.mo86045b("TextStatusID", cVar2.field_StatusID, true);
            textStateCardExposeStruct.f194492h = textStateCardExposeStruct.mo86045b("IconID", cVar2.field_IconID, true);
            String d = C60235a.m70504d(a);
            if (d == null) {
                d = str2;
            }
            textStateCardExposeStruct.f194493i = textStateCardExposeStruct.mo86045b("SourceID", d, true);
            textStateCardExposeStruct.f194494j = textStateCardExposeStruct.mo86045b("SourceActivityID", C60235a.m70501a(a), true);
            textStateCardExposeStruct.f194495k = textStateCardExposeStruct.mo86045b("SourceName", C60235a.m70505e(a), true);
            textStateCardExposeStruct.f194496l = textStateCardExposeStruct.mo86045b("SourceExtraInfo", f0Var.f229430f, true);
            textStateCardExposeStruct.f194497m = textStateCardExposeStruct.mo86045b("CurrLikeIcon", f0Var.f229431g, true);
            textStateCardExposeStruct.f194498n = (long) f0Var.f229432h;
            textStateCardExposeStruct.f194499o = (long) f0Var.f229433i;
            textStateCardExposeStruct.f194500p = textStateCardExposeStruct.mo86045b("AuthorUsername", f0Var.f229429e, true);
            textStateCardExposeStruct.f194501q = C87412m.m108589b(C13781a.m13082a(), f0Var.f229429e) ? 1 : 2;
            textStateCardExposeStruct.f194502r = (long) f0Var.f229434j;
            textStateCardExposeStruct.f194483I = num2 != null ? (long) num2.intValue() : 0;
            textStateCardExposeStruct.f194503s = f0Var.f229435n > 0 ? 1 : 0;
            textStateCardExposeStruct.f194504t = j8 != -1 ? j8 : (long) f0Var.f229436o;
            textStateCardExposeStruct.f194505u = j;
            textStateCardExposeStruct.f194506v = textStateCardExposeStruct.mo86045b("ActionResult", str3, true);
            if (!z) {
                textStateCardExposeStruct.f194506v = textStateCardExposeStruct.mo86045b("ActionResult", textStateCardExposeStruct.f194506v + "_error", true);
            }
            textStateCardExposeStruct.f194507w = C31543z5.m39453c();
            textStateCardExposeStruct.f194508x = f0Var.f229437p;
            textStateCardExposeStruct.f194509y = textStateCardExposeStruct.mo86045b("SourceFeedID", f0Var.f229438q, true);
            textStateCardExposeStruct.f194510z = f0Var.f229439r;
            textStateCardExposeStruct.f194475A = f0Var.f229440s;
            textStateCardExposeStruct.f194476B = f0Var.f229441t;
            Long l = cVar2.field_option;
            textStateCardExposeStruct.f194477C = (((l == null ? 0 : l.longValue()) & 4) > 0 ? 1 : (((l == null ? 0 : l.longValue()) & 4) == 0 ? 0 : -1)) != 0 ? 1 : 2;
            textStateCardExposeStruct.f194480F = j15;
            textStateCardExposeStruct.f194481G = j7;
            textStateCardExposeStruct.f194482H = j9;
            C78501d dVar2 = f229945a;
            textStateCardExposeStruct.f194486L = dVar2.mo108455a();
            if (IStatusIconHelperKt.m39109a().mo62289a(cVar2.field_IconID)) {
                str2 = IStatusIconHelperKt.m39109a().mo62301m(a);
            }
            textStateCardExposeStruct.f194487M = textStateCardExposeStruct.mo86045b("CustomTitle", str2, true);
            textStateCardExposeStruct.mo86054n();
            dVar2.mo108460l(textStateCardExposeStruct);
        }
    }

    /* renamed from: i */
    public static void m94807i(C78501d dVar, long j, String str, int i, String str2, String str3, String str4, int i2, long j2, long j3, String str5, Integer num, String str6, int i3, Object obj) {
        String str7;
        int i4 = i3;
        String str8 = "";
        String str9 = (i4 & 2) != 0 ? str8 : str;
        int i5 = 0;
        int i6 = (i4 & 4) != 0 ? 0 : i;
        String str10 = (i4 & 8) != 0 ? str8 : str2;
        String str11 = (i4 & 16) != 0 ? str8 : str3;
        if ((i4 & 32) != 0) {
            C78315f0 b = dVar.mo108456b();
            str7 = b != null ? b.f229428d : null;
            if (str7 == null) {
                str7 = str8;
            }
        } else {
            str7 = str4;
        }
        if ((i4 & 64) == 0) {
            i5 = i2;
        }
        long j4 = (i4 & 128) != 0 ? 0 : j2;
        long j5 = (i4 & 256) != 0 ? 0 : j3;
        String str12 = (i4 & 512) != 0 ? null : str5;
        Integer num2 = (i4 & 1024) != 0 ? null : num;
        String str13 = (i4 & 2048) != 0 ? str8 : str6;
        dVar.getClass();
        C87412m.m108594g(str9, "iconId");
        C87412m.m108594g(str10, "toUserName");
        C87412m.m108594g(str11, "uvPerIcon");
        C87412m.m108594g(str7, "sessionId");
        C87412m.m108594g(str13, "contentList");
        C48201c n0 = C39674e.f106452d.mo62253n0(C13781a.m13082a());
        String str14 = n0 != null ? n0.field_IconID : null;
        if (str14 != null) {
            str8 = str14;
        }
        long j6 = (!C112551y.m153811k(str9) && !C112551y.m153811k(str8) && C87412m.m108589b(str9, str8)) ? 1 : 0;
        TextStateFriendTopicListStruct textStateFriendTopicListStruct = new TextStateFriendTopicListStruct();
        Integer num3 = num2;
        String str15 = str12;
        textStateFriendTopicListStruct.f194512e = j;
        textStateFriendTopicListStruct.f194513f = textStateFriendTopicListStruct.mo86045b("IconID", str9, true);
        textStateFriendTopicListStruct.f194515h = i6;
        textStateFriendTopicListStruct.f194514g = textStateFriendTopicListStruct.mo86045b("ToUsername", str10, true);
        textStateFriendTopicListStruct.f194516i = textStateFriendTopicListStruct.mo86045b("UvPerIcon", str11, true);
        textStateFriendTopicListStruct.f194517j = (long) i5;
        textStateFriendTopicListStruct.f194519l = j6;
        textStateFriendTopicListStruct.f194521n = j4;
        textStateFriendTopicListStruct.f194511d = textStateFriendTopicListStruct.mo86045b("SessionID", str7, true);
        textStateFriendTopicListStruct.f194520m = textStateFriendTopicListStruct.mo86045b("SceneSessionID", ((C47904x) C86312j.m106911c(C47904x.class)).mo72664YY(), true);
        textStateFriendTopicListStruct.f194518k = j5;
        textStateFriendTopicListStruct.f194522o = dVar.mo108455a();
        textStateFriendTopicListStruct.f194524q = num3 != null ? (long) num3.intValue() : -1;
        textStateFriendTopicListStruct.f194523p = textStateFriendTopicListStruct.mo86045b("CustomTitle", str15, true);
        textStateFriendTopicListStruct.f194525r = textStateFriendTopicListStruct.mo86045b("ContentList", str13, true);
        textStateFriendTopicListStruct.mo86054n();
        f229945a.mo108460l(textStateFriendTopicListStruct);
    }

    /* renamed from: j */
    public static void m94808j(C78501d dVar, long j, String str, String str2, int i, String str3, int i2, int i3, int i4, int i5, String str4, String str5, String str6, String str7, String str8, int i6, Object obj) {
        String str9;
        String str10;
        String str11 = str2;
        int i7 = i6;
        String str12 = (i7 & 2) != 0 ? "" : str;
        int i8 = 0;
        int i9 = (i7 & 8) != 0 ? 0 : i;
        if ((i7 & 16) != 0) {
            C78315f0 b = dVar.mo108456b();
            str9 = b != null ? b.f229428d : null;
            if (str9 == null) {
                str9 = "";
            }
        } else {
            str9 = str3;
        }
        int i15 = (i7 & 32) != 0 ? 0 : i2;
        int i16 = (i7 & 64) != 0 ? 0 : i3;
        int i17 = (i7 & 128) != 0 ? 0 : i4;
        if ((i7 & 256) == 0) {
            i8 = i5;
        }
        String str13 = (i7 & 512) != 0 ? "" : str4;
        String str14 = (i7 & 1024) != 0 ? "" : str5;
        String str15 = (i7 & 2048) != 0 ? "" : str6;
        String str16 = (i7 & 4096) != 0 ? "" : str7;
        String str17 = (i7 & 8192) != 0 ? "" : str8;
        dVar.getClass();
        C87412m.m108594g(str11, "NotificationSessionID");
        C87412m.m108594g(str9, "SessionID");
        String str18 = "";
        C87412m.m108594g(str13, "ToUserSessionID");
        C87412m.m108594g(str14, "ToUserIconID");
        C87412m.m108594g(str15, "ToUserSourceID");
        C87412m.m108594g(str16, "ToUserHashTag");
        C87412m.m108594g(str17, "ToUserStatusID");
        String str19 = str17;
        TextStatusNotificationCliOpStruct textStatusNotificationCliOpStruct = new TextStatusNotificationCliOpStruct();
        textStatusNotificationCliOpStruct.f194599f = j;
        textStatusNotificationCliOpStruct.f194601h = C31543z5.m39453c();
        textStatusNotificationCliOpStruct.f194600g = textStatusNotificationCliOpStruct.mo86045b("ActionResult", str12, true);
        textStatusNotificationCliOpStruct.f194598e = textStatusNotificationCliOpStruct.mo86045b("NotificationSessionID", str11, true);
        textStatusNotificationCliOpStruct.f194602i = (long) i9;
        textStatusNotificationCliOpStruct.f194597d = textStatusNotificationCliOpStruct.mo86045b("SessionID", str9, true);
        textStatusNotificationCliOpStruct.f194603j = (long) i15;
        textStatusNotificationCliOpStruct.f194604k = (long) i16;
        textStatusNotificationCliOpStruct.f194605l = (long) i17;
        textStatusNotificationCliOpStruct.f194606m = (long) i8;
        textStatusNotificationCliOpStruct.f194607n = textStatusNotificationCliOpStruct.mo86045b("ToUserSessionID", str13, true);
        textStatusNotificationCliOpStruct.f194608o = textStatusNotificationCliOpStruct.mo86045b("ToUserIconID", str14, true);
        textStatusNotificationCliOpStruct.f194609p = textStatusNotificationCliOpStruct.mo86045b("ToUserSourceID", str15, true);
        textStatusNotificationCliOpStruct.f194610q = textStatusNotificationCliOpStruct.mo86045b("ToUserHashTag", str16, true);
        textStatusNotificationCliOpStruct.f194611r = textStatusNotificationCliOpStruct.mo86045b("ToUserStatusID", str19, true);
        C48201c n0 = C39674e.f106452d.mo62253n0(C13781a.m13082a());
        textStatusNotificationCliOpStruct.f194612s = textStatusNotificationCliOpStruct.mo86045b("MyCurrentStatusID", (n0 == null || (str10 = n0.field_StatusID) == null) ? str18 : str10, true);
        textStatusNotificationCliOpStruct.mo86054n();
        dVar.mo108460l(textStatusNotificationCliOpStruct);
    }

    /* renamed from: k */
    public static void m94809k(C78501d dVar, long j, long j2, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            C78315f0 b = dVar.mo108456b();
            str = b != null ? b.f229428d : null;
            if (str == null) {
                str = "";
            }
        }
        dVar.getClass();
        C87412m.m108594g(str, "SessionID");
        TextStatusHistoryPageV2Struct textStatusHistoryPageV2Struct = new TextStatusHistoryPageV2Struct();
        textStatusHistoryPageV2Struct.f194595f = j;
        textStatusHistoryPageV2Struct.f194596g = j2;
        textStatusHistoryPageV2Struct.f194593d = textStatusHistoryPageV2Struct.mo86045b("SessionID", str, true);
        textStatusHistoryPageV2Struct.f194594e = textStatusHistoryPageV2Struct.mo86045b("SceneSessionID", ((C47904x) C86312j.m106911c(C47904x.class)).mo72664YY(), true);
        textStatusHistoryPageV2Struct.mo86054n();
        dVar.mo108460l(textStatusHistoryPageV2Struct);
    }

    /* renamed from: a */
    public final long mo108455a() {
        if (IStatusIconHelperKt.m39109a().mo62279I()) {
            return 4;
        }
        if (IStatusIconHelperKt.m39109a().mo62311w()) {
            return 5;
        }
        if (IStatusIconHelperKt.m39109a().mo62275E()) {
            return 3;
        }
        return (IStatusIconHelperKt.m39109a().mo62277G() || IStatusIconHelperKt.m39109a().mo62273C() || IStatusIconHelperKt.m39109a().mo62274D() || IStatusIconHelperKt.m39109a().mo62312x() || IStatusIconHelperKt.m39109a().mo62310v()) ? 2 : 1;
    }

    /* renamed from: b */
    public final C78315f0 mo108456b() {
        try {
            return (C78315f0) ((C99933h) C86312j.m106911c(C99933h.class)).mo84402PX(9, "TextStatusCardExposed");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final long mo108457c() {
        if (IStatusIconHelperKt.m39109a().mo62278H()) {
            return 2;
        }
        if (IStatusIconHelperKt.m39109a().mo62277G()) {
            return 3;
        }
        if (IStatusIconHelperKt.m39109a().mo62275E()) {
            return 4;
        }
        if (IStatusIconHelperKt.m39109a().mo62310v()) {
            return 5;
        }
        if (IStatusIconHelperKt.m39109a().mo62311w()) {
            return 6;
        }
        return IStatusIconHelperKt.m39109a().mo62312x() ? 7 : 1;
    }

    /* renamed from: d */
    public final void mo108458d(C77459z zVar, long j) {
        C13598b0 b0Var;
        if (zVar != null) {
            TextStatusCliPostStruct textStatusCliPostStruct = new TextStatusCliPostStruct();
            textStatusCliPostStruct.f194555d = textStatusCliPostStruct.mo86045b("SessionID", Util.nullAs(zVar.f229403h, ""), true);
            textStatusCliPostStruct.f194557e = textStatusCliPostStruct.mo86045b("CliPostID", String.valueOf(zVar.f229405j), true);
            textStatusCliPostStruct.f194559f = zVar.f229404i;
            textStatusCliPostStruct.f194561g = zVar.f229405j;
            textStatusCliPostStruct.f194565i = j;
            textStatusCliPostStruct.f194567j = C31543z5.m39453c();
            textStatusCliPostStruct.f194541P = zVar.f229406n;
            textStatusCliPostStruct.f194542Q = zVar.f229407o;
            textStatusCliPostStruct.f194543R = 0;
            textStatusCliPostStruct.f194538M = (long) zVar.f229408p;
            textStatusCliPostStruct.f194539N = (long) zVar.f229409q;
            textStatusCliPostStruct.f194540O = textStatusCliPostStruct.mo86045b("FinalCustomTitle", zVar.f229410r, true);
            textStatusCliPostStruct.f194551Z = (long) zVar.f229415w;
            textStatusCliPostStruct.f194566i0 = textStatusCliPostStruct.mo86045b("WeRunInfo", zVar.f229416x, true);
            textStatusCliPostStruct.f194568j0 = textStatusCliPostStruct.mo86045b("PaymentInfo", zVar.f229417y, true);
            textStatusCliPostStruct.f194572l0 = textStatusCliPostStruct.mo86045b("PostRecomIconID", IStatusIconHelperKt.m39109a().mo62294f(), true);
            C78501d dVar = f229945a;
            textStatusCliPostStruct.f194574m0 = dVar.mo108457c();
            textStatusCliPostStruct.f194584r0 = zVar.f229399d.f147226E;
            textStatusCliPostStruct.mo86054n();
            dVar.mo108460l(textStatusCliPostStruct);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.TextStatus.tsReport", "postReportByTextStatusDoWhatActivity: param is null");
        }
    }

    /* renamed from: f */
    public final void mo108459f(boolean z, C78318v1 v1Var) {
        C13598b0 b0Var;
        if (v1Var != null) {
            if (z) {
                ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(8, "StatusTextPost_" + v1Var.f229500d, v1Var, new C78502a(v1Var));
            } else {
                ((C119157j) C119157j.f356862d).mo183875f(new C78503e(v1Var, 3L, "", ""));
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.TextStatus.tsReport", "postReportByTextStatusEditActivity: postData is null, " + z);
        }
    }

    /* renamed from: l */
    public final void mo108460l(C61103a aVar) {
        String q = aVar.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("MicroMsg.TextStatus.tsReport", "report%s %s", Integer.valueOf(aVar.mo1004j()), C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
