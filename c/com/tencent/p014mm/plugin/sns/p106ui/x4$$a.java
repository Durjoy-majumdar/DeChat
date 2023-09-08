package com.tencent.p014mm.plugin.sns.p106ui;

import a22.C67001a;
import android.content.Intent;
import android.view.View;
import b22.C28250a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.sns.ui.x4$$a */
public final /* synthetic */ class x4$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96313x4 f281662d;

    public /* synthetic */ x4$$a(C96313x4 x4Var) {
        this.f281662d = x4Var;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C96313x4 x4Var = this.f281662d;
        x4Var.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", x4Var, array);
        SnsMethodCalculate.markStartTimeMs("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        x4$$k x4__k = (view.getTag() == null || !(view.getTag() instanceof x4$$k)) ? null : (x4$$k) view.getTag();
        if (x4__k == null) {
            Log.m105928w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
            SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            C117292a.m165361g(x4Var, "com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        x4$$j x4__j = x4Var.f281659r;
        if (x4__j != null) {
            SnsMethodCalculate.markStartTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$1");
            int i = x4__k.f281687a;
            int i2 = x4__k.f281688b;
            BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = BaseSelectVisibleRangeUI.this;
            int i3 = BaseSelectVisibleRangeUI.f281300B;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            baseSelectVisibleRangeUI.getClass();
            SnsMethodCalculate.markStartTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            if (baseSelectVisibleRangeUI.f281309n != null) {
                str = "(Landroid/view/View;)V";
                str2 = "onClick";
                Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "gotoEditTag: groupPosition:%d, childPosition:%d", Integer.valueOf(i), Integer.valueOf(i2));
                Object child = baseSelectVisibleRangeUI.f281309n.getChild(i, i2);
                if (child != null && (child instanceof String)) {
                    String str4 = (String) child;
                    String f = ((C67001a) C28250a.m38138a()).mo90968f(str4);
                    Intent intent = new Intent();
                    intent.putExtra("label_id", f);
                    intent.putExtra("label_name", str4);
                    intent.putExtra("is_show_delete", false);
                    intent.putExtra("key_label_click_source", 3);
                    intent.putExtra("last_page_source_type", 1);
                    str3 = "android/view/View$OnClickListener";
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_new_contact_label_ui, 1) == 1) {
                        Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactEditLabel ");
                        C88144b.m109795m(baseSelectVisibleRangeUI.getContext(), "label", ".ui.ContactEditLabel", intent, 4002);
                    } else {
                        Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactLabelEditUI ");
                        C88144b.m109795m(baseSelectVisibleRangeUI.getContext(), "label", ".ui.ContactLabelEditUI", intent, 4002);
                    }
                    SnsMethodCalculate.markEndTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                    SnsMethodCalculate.markEndTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$1");
                }
            } else {
                str = "(Landroid/view/View;)V";
                str2 = "onClick";
            }
            str3 = "android/view/View$OnClickListener";
            SnsMethodCalculate.markEndTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            SnsMethodCalculate.markEndTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$1");
        } else {
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            str3 = "android/view/View$OnClickListener";
        }
        SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        C117292a.m165361g(x4Var, "com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter", str3, str2, str);
    }
}
