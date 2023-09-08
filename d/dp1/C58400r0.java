package dp1;

import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import di3.C86301e;
import eb0.C31543z5;
import ei3.C86522b;
import gy3.C87412m;
import o40.C61926c;
import qo1.C63291f;

@C86522b
/* renamed from: dp1.r0 */
public final class C58400r0 extends C86301e implements C63291f {
    /* renamed from: Dc */
    public FinderFeedReportObject mo83237Dc() {
        return C58408t0.f167337b;
    }

    /* renamed from: XL */
    public void mo83238XL(RecordMediaReportInfo recordMediaReportInfo) {
        C87412m.m108594g(recordMediaReportInfo, "reportInfo");
        C58408t0.f167336a.mo83257c(recordMediaReportInfo);
    }

    public void i20(String str, String str2) {
        C87412m.m108594g(str, "postId");
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.postId = str;
            if (str2 != null) {
                finderFeedReportObject.editId = str2;
            }
        }
    }

    /* renamed from: md */
    public void mo83240md(int i, boolean z) {
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.exitPageId = i;
            if (i == 4) {
                finderFeedReportObject.sendOrExitButtonTime = C31543z5.m39453c();
            }
            FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
            if (finderFeedReportObject2 != null) {
                C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, z));
            }
        }
    }
}
