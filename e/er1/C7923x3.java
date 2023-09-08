package er1;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import di3.C7335d;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58412u0;
import gy3.C87412m;
import ht1.C60216z4;
import o40.C61926c;

/* renamed from: er1.x3 */
public final class C7923x3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f26606d;

    /* renamed from: e */
    public final /* synthetic */ C60216z4.C8821a<Boolean> f26607e;

    public C7923x3(Activity activity, C60216z4.C8821a<Boolean> aVar) {
        this.f26606d = activity;
        this.f26607e = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        ((C58684b) c).qy0(this.f26606d, (String) null);
        C60216z4.C8821a<Boolean> aVar = this.f26607e;
        if (aVar != null) {
            aVar.mo6382a(Boolean.TRUE);
        }
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.exitPageId = 7;
            FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
            if (finderFeedReportObject2 != null) {
                C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, false));
            }
        }
    }
}
