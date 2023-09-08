package e60;

import com.tencent.p014mm.autogen.mmdata.rpt.LiveAnchorStartLiveStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveErrorCodeReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveLinkMicFinishStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveOpStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveVisitorEnterLiveStruct;
import com.tencent.p014mm.live.model.RoomLiveService;
import e60.C7599a;
import eb0.C75592q0;
import gy3.C87412m;
import k50.C60971a;

/* renamed from: e60.b */
public final class C58532b {

    /* renamed from: a */
    public static String f167566a = "";

    /* renamed from: b */
    public static LiveVisitorEnterLiveStruct f167567b = new LiveVisitorEnterLiveStruct();

    /* renamed from: a */
    public static final void m67945a(String str, long j, String str2, String str3, int i, int i2, int i3) {
        C87412m.m108594g(str, "roomId");
        C87412m.m108594g(str2, "micId");
        C87412m.m108594g(str3, "liveUserName");
        LiveErrorCodeReportStruct liveErrorCodeReportStruct = new LiveErrorCodeReportStruct();
        C7599a.C7600a aVar = C7599a.f25866a;
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        liveErrorCodeReportStruct.f156380g = (long) aVar.mo8729c(s, str3);
        String s2 = C75592q0.m90789s();
        C87412m.m108593f(s2, "getUsernameFromUserInfo()");
        liveErrorCodeReportStruct.f156381h = (long) aVar.mo8728b(s2, str);
        liveErrorCodeReportStruct.f156378e = j;
        liveErrorCodeReportStruct.f156379f = liveErrorCodeReportStruct.mo86045b("micId", str2, true);
        liveErrorCodeReportStruct.f156382i = (long) i;
        liveErrorCodeReportStruct.f156383j = (long) i2;
        liveErrorCodeReportStruct.f156384k = i3;
        liveErrorCodeReportStruct.mo86054n();
    }

    /* renamed from: b */
    public static final void m67946b(String str, long j, String str2, long j2, int i, int i2, String str3) {
        C87412m.m108594g(str, "roomId");
        C87412m.m108594g(str2, "micId");
        C87412m.m108594g(str3, "liveUserName");
        long currentTimeMillis = System.currentTimeMillis();
        LiveLinkMicFinishStruct liveLinkMicFinishStruct = new LiveLinkMicFinishStruct();
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        RoomLiveService.f157184P = false;
        liveLinkMicFinishStruct.f156385d = liveLinkMicFinishStruct.mo86045b("roomid", str, true);
        liveLinkMicFinishStruct.f156386e = j;
        liveLinkMicFinishStruct.f156392k = liveLinkMicFinishStruct.mo86045b("livemicid", str2, true);
        liveLinkMicFinishStruct.f156388g = (currentTimeMillis - j2) / ((long) 1000);
        liveLinkMicFinishStruct.f156389h = (long) i;
        liveLinkMicFinishStruct.f156390i = (long) i2;
        liveLinkMicFinishStruct.f156391j = liveLinkMicFinishStruct.mo86045b("liveusername", str3, true);
        liveLinkMicFinishStruct.f156394m = currentTimeMillis;
        liveLinkMicFinishStruct.f156393l = j2;
        liveLinkMicFinishStruct.f156395n = RoomLiveService.f157186R;
        liveLinkMicFinishStruct.f156396o = (long) RoomLiveService.f157197h.f133055i;
        liveLinkMicFinishStruct.mo86054n();
    }

    /* renamed from: c */
    public static final void m67947c(String str, long j, String str2, int i, int i2, String str3, int i3) {
        C87412m.m108594g(str, "roomId");
        C87412m.m108594g(str2, "anchorName");
        C87412m.m108594g(str3, "audienceUserName");
        LiveOpStruct liveOpStruct = new LiveOpStruct();
        liveOpStruct.f156401d = liveOpStruct.mo86045b("roomid", str, true);
        liveOpStruct.f156402e = j;
        liveOpStruct.f156406i = (long) i2;
        liveOpStruct.f156405h = (long) i;
        C7599a.C7600a aVar = C7599a.f25866a;
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        liveOpStruct.f156403f = (long) aVar.mo8729c(s, str2);
        String s2 = C75592q0.m90789s();
        C87412m.m108593f(s2, "getUsernameFromUserInfo()");
        liveOpStruct.f156404g = (long) aVar.mo8728b(s2, str);
        liveOpStruct.f156407j = System.currentTimeMillis();
        liveOpStruct.f156408k = liveOpStruct.mo86045b("audienceUserName", str3, true);
        liveOpStruct.f156409l = liveOpStruct.mo86045b("anchorusername", str2, true);
        liveOpStruct.f156410m = (long) i3;
        liveOpStruct.mo86054n();
    }

    /* renamed from: d */
    public static /* synthetic */ void m67948d(String str, long j, String str2, int i, int i2, String str3, int i3, int i4, Object obj) {
        m67947c(str, j, str2, i, i2, (i4 & 32) != 0 ? "" : str3, i3);
    }

    /* renamed from: e */
    public static final void m67949e(String str, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str2) {
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (!RoomLiveService.f157179K) {
            RoomLiveService.f157174F = -1;
            f167567b.f156451d = (long) RoomLiveService.f157180L;
            LiveVisitorEnterLiveStruct liveVisitorEnterLiveStruct = f167567b;
            liveVisitorEnterLiveStruct.f156452e = liveVisitorEnterLiveStruct.mo86045b("roomid", str, true);
            LiveVisitorEnterLiveStruct liveVisitorEnterLiveStruct2 = f167567b;
            liveVisitorEnterLiveStruct2.f156453f = j;
            liveVisitorEnterLiveStruct2.f156455h = (long) i;
            liveVisitorEnterLiveStruct2.f156456i = i2 < 0 ? 0 : (long) i2;
            liveVisitorEnterLiveStruct2.f156457j = (long) i3;
            liveVisitorEnterLiveStruct2.f156458k = (long) i4;
            liveVisitorEnterLiveStruct2.f156459l = (long) i5;
            liveVisitorEnterLiveStruct2.f156460m = (long) i6;
            liveVisitorEnterLiveStruct2.f156461n = (long) i7;
            liveVisitorEnterLiveStruct2.f156462o = liveVisitorEnterLiveStruct2.mo86045b("liveusername", str2, true);
            f167567b.mo86054n();
            RoomLiveService.f157179K = true;
            RoomLiveService.f157172D = 0;
            RoomLiveService.f157173E = 0;
            RoomLiveService.f157175G = 0;
            RoomLiveService.f157176H = 0;
            RoomLiveService.f157177I = 0;
            RoomLiveService.f157178J = 0;
            RoomLiveService.f157180L = 0;
            f167567b = new LiveVisitorEnterLiveStruct();
        }
    }

    /* renamed from: f */
    public static final void m67950f(String str, boolean z, boolean z2, String str2, boolean z3, int i, int i2, int i3) {
        String str3 = str;
        C87412m.m108594g(str, "roomId");
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (!RoomLiveService.f157169A) {
            int i4 = 0;
            RoomLiveService.f157214y = false;
            RoomLiveService.f157215z = false;
            RoomLiveService.f157169A = true;
            RoomLiveService.f157170B = false;
            RoomLiveService.f157213x = false;
            LiveAnchorStartLiveStruct liveAnchorStartLiveStruct = new LiveAnchorStartLiveStruct();
            long j = 1;
            liveAnchorStartLiveStruct.f156342d = 1;
            liveAnchorStartLiveStruct.f156343e = liveAnchorStartLiveStruct.mo86045b("roomid", str, true);
            liveAnchorStartLiveStruct.f156344f = z ? 1 : 0;
            liveAnchorStartLiveStruct.f156345g = z2 ? 1 : 0;
            String str4 = str2;
            liveAnchorStartLiveStruct.f156346h = liveAnchorStartLiveStruct.mo86045b("topic", str2, true);
            if (!z3) {
                j = 0;
            }
            liveAnchorStartLiveStruct.f156347i = j;
            int i5 = C60971a.C60973b.f173670a.mo85945b().f174704a;
            if (i5 == 0) {
                i4 = 2;
            } else if (i5 == 1) {
                i4 = 1;
            }
            liveAnchorStartLiveStruct.f156348j = (long) i4;
            liveAnchorStartLiveStruct.f156349k = (long) i;
            liveAnchorStartLiveStruct.f156350l = (long) i2;
            liveAnchorStartLiveStruct.f156351m = (long) i3;
            C7599a.C7600a aVar = C7599a.f25866a;
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            liveAnchorStartLiveStruct.f156352n = (long) aVar.mo8728b(s, str);
            liveAnchorStartLiveStruct.f156353o = (long) aVar.mo8727a(str);
            liveAnchorStartLiveStruct.mo86054n();
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m67951g(String str, boolean z, boolean z2, String str2, boolean z3, int i, int i2, int i3, int i4, Object obj) {
        m67950f(str, z, z2, str2, z3, i, i2, (i4 & 128) != 0 ? 0 : i3);
    }
}
