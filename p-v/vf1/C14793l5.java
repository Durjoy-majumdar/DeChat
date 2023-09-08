package vf1;

import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import dp1.C58408t0;
import dp1.C58412u0;
import o40.C61926c;
import qo3.C77407n;

/* renamed from: vf1.l5 */
public final class C14793l5 implements C77407n.C47880p {

    /* renamed from: a */
    public static final C14793l5 f40776a = new C14793l5();

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
