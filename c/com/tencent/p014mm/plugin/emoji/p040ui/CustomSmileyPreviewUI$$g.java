package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$g */
public class CustomSmileyPreviewUI$$g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f268374d;

    public CustomSmileyPreviewUI$$g(CustomSmileyPreviewUI customSmileyPreviewUI) {
        this.f268374d = customSmileyPreviewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CustomSmileyPreviewUI customSmileyPreviewUI = this.f268374d;
        CustomSmileyPreviewUI.m117568H7(customSmileyPreviewUI, !customSmileyPreviewUI.f268325R0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
