package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import qo3.C77407n;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.x */
public class C57437x implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ List f164521a;

    /* renamed from: b */
    public final /* synthetic */ SnsInfo f164522b;

    public C57437x(C57394a0 a0Var, List list, SnsInfo snsInfo) {
        this.f164521a = list;
        this.f164522b = snsInfo;
    }

    public void onDismiss() {
        SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$3");
        if (this.f164521a.contains(2)) {
            Log.m105924i("MiscroMsg.CommentDetailMenuManager", "[dismiss] didShow edit sns group");
            SnsReportHelper.f275506m0.mo131351L(2, false, C102236a0.m134728W(this.f164522b));
        }
        SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$3");
    }
}
