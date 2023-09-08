package er1;

import android.content.DialogInterface;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import dp1.C58408t0;
import dp1.C58412u0;
import ht1.C60216z4;
import o40.C61926c;

/* renamed from: er1.y3 */
public final class C7926y3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60216z4.C8821a<Boolean> f26611d;

    public C7926y3(C60216z4.C8821a<Boolean> aVar) {
        this.f26611d = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C60216z4.C8821a<Boolean> aVar = this.f26611d;
        if (aVar != null) {
            aVar.mo6382a(Boolean.FALSE);
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
