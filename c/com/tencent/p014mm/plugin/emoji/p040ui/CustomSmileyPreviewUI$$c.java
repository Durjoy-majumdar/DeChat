package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.View;
import di0.C86299o;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76630x0;
import te3.C49811i80;
import te3.C50795p80;

/* renamed from: com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$c */
public final /* synthetic */ class CustomSmileyPreviewUI$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f110572d;

    /* renamed from: e */
    public final /* synthetic */ C49811i80 f110573e;

    public /* synthetic */ CustomSmileyPreviewUI$$c(CustomSmileyPreviewUI customSmileyPreviewUI, C49811i80 i802) {
        this.f110572d = customSmileyPreviewUI;
        this.f110573e = i802;
    }

    public final void onClick(View view) {
        CustomSmileyPreviewUI customSmileyPreviewUI = this.f110572d;
        C49811i80 i802 = this.f110573e;
        int i = CustomSmileyPreviewUI.f268306a1;
        customSmileyPreviewUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(i802);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", customSmileyPreviewUI, array);
        C50795p80 p802 = i802.f135163h;
        if (p802 == null) {
            C117292a.m165361g(customSmileyPreviewUI, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C86299o oVar = new C86299o();
        oVar.f250930b = p802.f139634d;
        oVar.f250939k = 1204;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(customSmileyPreviewUI, oVar);
        customSmileyPreviewUI.f268339Y0 = 1;
        C117292a.m165361g(customSmileyPreviewUI, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
