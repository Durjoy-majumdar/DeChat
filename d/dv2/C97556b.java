package dv2;

import a22.C67001a;
import android.content.DialogInterface;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: dv2.b */
public class C97556b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseSelectVisibleRangeUI f286269d;

    public C97556b(BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        this.f286269d = baseSelectVisibleRangeUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$6");
        BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = this.f286269d;
        int i2 = BaseSelectVisibleRangeUI.f281300B;
        SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        baseSelectVisibleRangeUI.f281314s = true;
        SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        ((C67001a) C28250a.m38138a()).mo90963a(BaseSelectVisibleRangeUI.m123414L7(this.f286269d));
        BaseSelectVisibleRangeUI baseSelectVisibleRangeUI2 = this.f286269d;
        C89779i0 Q = C76879j.m92723Q(baseSelectVisibleRangeUI2, (String) null, baseSelectVisibleRangeUI2.getString(C0966R.string.jds), false, false, (DialogInterface.OnCancelListener) null);
        SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        baseSelectVisibleRangeUI2.f281316u = Q;
        SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$6");
    }
}
