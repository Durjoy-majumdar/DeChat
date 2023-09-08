package mo1;

import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import dp1.C58408t0;
import dp1.C58412u0;
import o40.C61926c;
import qo3.C77407n;

/* renamed from: mo1.f */
public final class C10996f implements C77407n.C47880p {

    /* renamed from: a */
    public static final C10996f f32706a = new C10996f();

    public final void onDismiss() {
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.exitPageId = 6;
            FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
            if (finderFeedReportObject2 != null) {
                C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, false));
            }
        }
    }
}
