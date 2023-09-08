package p570iy;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import dm2.C58325i;
import eb0.C31543z5;
import ms2.C47100l;
import p749xh.C38549d8;
import pe3.C47465a;
import zt3.C119157j;

/* renamed from: iy.l */
public class C98889l implements C58325i<C47100l> {

    /* renamed from: a */
    public final /* synthetic */ int f289893a;

    public C98889l(C98890m mVar, int i) {
        this.f289893a = i;
    }

    /* renamed from: a */
    public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1");
        C47100l lVar = (C47100l) aVar;
        SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1");
        if (lVar == null || TextUtils.isEmpty(lVar.f126570d)) {
            SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1");
        } else {
            String str = lVar.f126570d;
            long e = (long) C31543z5.m39455e();
            ((C119157j) C119157j.f356862d).mo183876g(new C98888k(this, e, str), "WebSearchReportLogic.TagSearchReport");
            SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1");
        }
        SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1");
    }
}
