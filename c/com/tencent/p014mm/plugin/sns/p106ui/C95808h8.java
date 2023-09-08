package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.sns.ui.h8 */
public class C95808h8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsWsFoldDetailUI f279561d;

    public C95808h8(SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f279561d = snsWsFoldDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$4");
        Log.m105924i("MicroMsg.SnsWsFoldDetailUI", "click unfold button");
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        snsReportHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("clickUnfoldButton", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        snsReportHelper.f275536b0.f266176l = 1;
        SnsMethodCalculate.markEndTimeMs("clickUnfoldButton", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsWsFoldDetailUI snsWsFoldDetailUI = this.f279561d;
        int i = SnsWsFoldDetailUI.f279030C;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        snsWsFoldDetailUI.getClass();
        SnsMethodCalculate.markStartTimeMs("showUnfoldListBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        String string = snsWsFoldDetailUI.getString(C0966R.string.m_n);
        C72996z1 z1Var = snsWsFoldDetailUI.f279044r;
        if (z1Var != null) {
            int i2 = z1Var.f149500H;
            if (i2 == 1) {
                string = snsWsFoldDetailUI.getString(C0966R.string.m_l);
            } else if (i2 == 2) {
                string = snsWsFoldDetailUI.getString(C0966R.string.m_k);
            }
        }
        C77407n nVar = new C77407n((Context) snsWsFoldDetailUI, 1, true);
        nVar.mo107568m(string, 17, C76577a.m92151b(snsWsFoldDetailUI.getContext(), 14));
        nVar.f225771i = new C95816i8(snsWsFoldDetailUI);
        nVar.f225782p = new C95974j8(snsWsFoldDetailUI);
        nVar.mo107573q();
        SnsMethodCalculate.markEndTimeMs("showUnfoldListBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$4");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
