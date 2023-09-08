package ao1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C58408t0;
import fp1.C59266a;
import fp1.C59267b;
import fp1.C59268c;
import ht1.C60213x3;

/* renamed from: ao1.c1 */
public final class C54263c1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PostMainUIC f152302d;

    public C54263c1(PostMainUIC postMainUIC) {
        this.f152302d = postMainUIC;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2 = "";
        if (C54264e.f152304b != null) {
            Log.m105924i("Finder.PostCallbackMgr", "doCallback state:" + 2 + " errMsg:" + str2);
            C60213x3 x3Var = C54264e.f152304b;
            if (x3Var != null) {
                x3Var.mo5408a(2, str2);
            }
            C54264e.f152304b = null;
            this.f152302d.getActivity().finish();
        } else {
            this.f152302d.mo78420Q3(false);
        }
        C59266a aVar = C59266a.f169452a;
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (!(finderFeedReportObject == null || (str = finderFeedReportObject.flowId) == null)) {
            str2 = str;
        }
        C59268c cVar = C59267b.f169453a;
        aVar.mo84410b(str2, C59267b.f169460h);
    }
}
