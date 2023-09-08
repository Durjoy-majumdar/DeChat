package ht1;

import com.tencent.p014mm.autogen.mmdata.rpt.MvCardActionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MvShareReportStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import la2.C99364n;
import qc0.C101106m;
import rx3.C13598b0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: ht1.t5 */
public final class C60205t5 {

    /* renamed from: a */
    public static final C60205t5 f171719a = new C60205t5();

    /* renamed from: b */
    public static final void m70388b(MvCardActionReportStruct mvCardActionReportStruct) {
        C87412m.m108594g(mvCardActionReportStruct, "struct");
        Log.m105924i("MicroMsg.MusicActionReportLogic", "reportMvMusicCardAction, action:" + mvCardActionReportStruct.f156518j + ", scene:" + mvCardActionReportStruct.f156519k);
        C101106m k = C99364n.m129616h().mo138832k();
        if (k != null) {
            String str = k.f295962g;
            String str2 = null;
            mvCardActionReportStruct.f156513e = mvCardActionReportStruct.mo86045b("SongName", str != null ? C112551y.m153814n(str, ",", " ", false) : null, true);
            String str3 = k.f295963h;
            if (str3 != null) {
                str2 = C112551y.m153814n(str3, ",", " ", false);
            }
            mvCardActionReportStruct.f156517i = mvCardActionReportStruct.mo86045b("Singer", str2, true);
            mvCardActionReportStruct.f156515g = mvCardActionReportStruct.mo86045b("WebUrl", k.f295968p, true);
            mvCardActionReportStruct.f156516h = mvCardActionReportStruct.mo86045b("DataUrl", k.f295966n, true);
            mvCardActionReportStruct.f156521m = mvCardActionReportStruct.mo86045b("AppId", k.f295972t, true);
            Log.m105924i("MicroMsg.MusicActionReportLogic", "song:" + mvCardActionReportStruct.f156513e + ", singer:" + mvCardActionReportStruct.f156517i + ", appId:" + mvCardActionReportStruct.f156521m);
        } else {
            Log.m105920e("MicroMsg.MusicActionReportLogic", "buildCommonReportStruct, musicWrapper must not be null");
        }
        mvCardActionReportStruct.mo86054n();
        mvCardActionReportStruct.mo86056r();
    }

    /* renamed from: a */
    public final void mo85202a(C72963f4 f4Var, boolean z, boolean z2, String str) {
        C87412m.m108594g(f4Var, "msg");
        C87412m.m108594g(str, "fromSourceId");
        MvShareReportStruct mvShareReportStruct = new MvShareReportStruct();
        String content = f4Var.getContent();
        if (z) {
            String content2 = f4Var.getContent();
            C87412m.m108593f(content2, "msg.content");
            int D = C112550d0.m153768D(content2, XVFSFile.PATH_SEPARATOR_CHAR, 0, false, 6, (Object) null);
            if (D != -1) {
                String content3 = f4Var.getContent();
                C87412m.m108593f(content3, "msg.content");
                content = content3.substring(D + 1);
                C87412m.m108593f(content, "this as java.lang.String).substring(startIndex)");
            }
        }
        C13598b0 b0Var = null;
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null) {
            mvShareReportStruct.f156664e = mvShareReportStruct.mo86045b("SongName", u.f195570f, true);
            mvShareReportStruct.f156675p = mvShareReportStruct.mo86045b("Singer", u.f195574g, true);
            mvShareReportStruct.f156666g = mvShareReportStruct.mo86045b("WebUrl", u.f195586j, true);
            mvShareReportStruct.f156667h = mvShareReportStruct.mo86045b("DataUrl", u.f195530T, true);
            mvShareReportStruct.f156672m = mvShareReportStruct.mo86045b("AppId", u.f195562d, true);
            C72916m mVar = (C72916m) u.mo93555w(C72916m.class);
            if (mVar != null) {
                mvShareReportStruct.f156669j = mvShareReportStruct.mo86045b("MvObjectId", mVar.f212521d, true);
                mvShareReportStruct.f156670k = mvShareReportStruct.mo86045b("MvNonceId", mVar.f212522e, true);
                mvShareReportStruct.f156671l = mvShareReportStruct.mo86045b("MvUserId", mVar.f212524g, true);
                b0Var = C13598b0.f38549a;
            }
        }
        if (b0Var != null) {
            mvShareReportStruct.f156674o = mvShareReportStruct.mo86045b("FromSourceId", str, true);
            mvShareReportStruct.f156668i = 3;
            long j = 2;
            mvShareReportStruct.f156673n = 2;
            if (!z2) {
                j = 1;
            }
            mvShareReportStruct.f156676q = j;
            mvShareReportStruct.mo86054n();
            mvShareReportStruct.mo86056r();
        }
    }
}
