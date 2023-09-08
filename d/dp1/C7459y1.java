package dp1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import kj2.C61103a;
import o40.C61926c;
import te3.C49712hj1;
import up1.C14362s;

/* renamed from: dp1.y1 */
public final class C7459y1 extends C58403t {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7459y1(MMActivity mMActivity, C49712hj1 hj12) {
        super(mMActivity, hj12);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
    }

    /* renamed from: N1 */
    public final <T extends C61103a> T mo8609N1(T t, C14362s sVar) {
        if (t instanceof FinderLbsCardExposeReportStruct) {
            FinderLbsCardExposeReportStruct finderLbsCardExposeReportStruct = (FinderLbsCardExposeReportStruct) t;
            finderLbsCardExposeReportStruct.f9834i = finderLbsCardExposeReportStruct.mo86045b("cardid", sVar.mo13667b(), true);
            finderLbsCardExposeReportStruct.f9836k = (long) sVar.mo13668c().f136854o;
            finderLbsCardExposeReportStruct.f9837l = finderLbsCardExposeReportStruct.mo86045b("cardTag", sVar.mo13669d(), true);
            String str = sVar.mo13668c().f136851i;
            if (str == null) {
                str = "";
            }
            finderLbsCardExposeReportStruct.f9838m = finderLbsCardExposeReportStruct.mo86045b("cardStatus", str, true);
        } else if (t instanceof FinderLbsCardActionReportStruct) {
            FinderLbsCardActionReportStruct finderLbsCardActionReportStruct = (FinderLbsCardActionReportStruct) t;
            finderLbsCardActionReportStruct.f9823j = finderLbsCardActionReportStruct.mo86045b("cardid", sVar.mo13667b(), true);
            finderLbsCardActionReportStruct.f9824k = (long) sVar.mo13668c().f136854o;
            finderLbsCardActionReportStruct.f9825l = finderLbsCardActionReportStruct.mo86045b("cardTag", sVar.mo13669d(), true);
        }
        return t;
    }

    /* renamed from: P1 */
    public final <T extends C61103a> T mo8610P1(T t) {
        if (t instanceof FinderLbsCardExposeReportStruct) {
            FinderLbsCardExposeReportStruct finderLbsCardExposeReportStruct = (FinderLbsCardExposeReportStruct) t;
            finderLbsCardExposeReportStruct.f9829d = finderLbsCardExposeReportStruct.mo86045b("sessionid", this.f167327h.f134670d, true);
            finderLbsCardExposeReportStruct.f9830e = finderLbsCardExposeReportStruct.mo86045b("contextid", this.f167327h.f134671e, true);
            finderLbsCardExposeReportStruct.f9831f = finderLbsCardExposeReportStruct.mo86045b("clickTabContextId", this.f167327h.f134672f, true);
        } else if (t instanceof FinderLbsCardActionReportStruct) {
            FinderLbsCardActionReportStruct finderLbsCardActionReportStruct = (FinderLbsCardActionReportStruct) t;
            finderLbsCardActionReportStruct.f9817d = finderLbsCardActionReportStruct.mo86045b("Sessionid", this.f167327h.f134670d, true);
            finderLbsCardActionReportStruct.f9818e = finderLbsCardActionReportStruct.mo86045b("contextid", this.f167327h.f134671e, true);
            finderLbsCardActionReportStruct.f9819f = finderLbsCardActionReportStruct.mo86045b("clickTabContextId", this.f167327h.f134672f, true);
        }
        return t;
    }

    /* renamed from: Q1 */
    public final <T extends C61103a> T mo8611Q1(T t, BaseFinderFeed baseFinderFeed) {
        if (t instanceof FinderLbsCardExposeReportStruct) {
            FinderLbsCardExposeReportStruct finderLbsCardExposeReportStruct = (FinderLbsCardExposeReportStruct) t;
            finderLbsCardExposeReportStruct.f9842q = finderLbsCardExposeReportStruct.mo86045b("feedid", C61926c.m72691p(baseFinderFeed.getItemId()), true);
            finderLbsCardExposeReportStruct.f9847v = finderLbsCardExposeReportStruct.mo86045b("SessionBuffer", baseFinderFeed.mo3526z(), true);
            finderLbsCardExposeReportStruct.f9849x = finderLbsCardExposeReportStruct.mo86045b("lng", String.valueOf(baseFinderFeed.mo3513o().getLocation().f182661d), true);
            finderLbsCardExposeReportStruct.f9848w = finderLbsCardExposeReportStruct.mo86045b("lat", String.valueOf(baseFinderFeed.mo3513o().getLocation().f182662e), true);
        } else if (t instanceof FinderLbsCardActionReportStruct) {
            FinderLbsCardActionReportStruct finderLbsCardActionReportStruct = (FinderLbsCardActionReportStruct) t;
            finderLbsCardActionReportStruct.f9826m = finderLbsCardActionReportStruct.mo86045b("feedid", C61926c.m72691p(baseFinderFeed.getItemId()), true);
            finderLbsCardActionReportStruct.f9828o = finderLbsCardActionReportStruct.mo86045b("SessionBuffer", baseFinderFeed.mo3526z(), true);
        }
        return t;
    }
}
