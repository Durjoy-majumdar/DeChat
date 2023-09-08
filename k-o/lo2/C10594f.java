package lo2;

import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: lo2.f */
public final class C10594f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBox f31949d;

    public C10594f(CheckBox checkBox) {
        this.f31949d = checkBox;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/helper/AdCombineFollowHfScreenHelper$showHfScreen$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$2");
        CheckBox checkBox = this.f31949d;
        if (checkBox == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/helper/AdCombineFollowHfScreenHelper$showHfScreen$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z = true;
        if (checkBox.isChecked()) {
            z = false;
        }
        checkBox.setChecked(z);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/helper/AdCombineFollowHfScreenHelper$showHfScreen$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
