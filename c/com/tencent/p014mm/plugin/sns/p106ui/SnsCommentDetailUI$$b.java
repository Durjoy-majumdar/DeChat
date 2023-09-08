package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$b */
public final /* synthetic */ class SnsCommentDetailUI$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsCommentDetailUI f164376d;

    public /* synthetic */ SnsCommentDetailUI$$b(SnsCommentDetailUI snsCommentDetailUI) {
        this.f164376d = snsCommentDetailUI;
    }

    public final void onClick(View view) {
        SnsCommentDetailUI snsCommentDetailUI = this.f164376d;
        int i = SnsCommentDetailUI.f277824M1;
        snsCommentDetailUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsCommentDetailUI, array);
        SnsMethodCalculate.markStartTimeMs("lambda$setGroupIcon$3", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        int intValue = ((Integer) view.getTag()).intValue();
        snsCommentDetailUI.f277890l1 = null;
        SnsGroupDialog snsGroupDialog = new SnsGroupDialog(snsCommentDetailUI.getContext(), intValue, 2, 3);
        snsCommentDetailUI.f277890l1 = snsGroupDialog;
        snsGroupDialog.show();
        snsCommentDetailUI.f277890l1.f126908o = new SnsCommentDetailUI$$c();
        SnsMethodCalculate.markEndTimeMs("lambda$setGroupIcon$3", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C117292a.m165361g(snsCommentDetailUI, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
