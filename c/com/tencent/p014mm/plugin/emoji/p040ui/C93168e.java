package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.emoji.ui.e */
public class C93168e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f268689d;

    public C93168e(CustomSmileyPreviewUI customSmileyPreviewUI) {
        this.f268689d = customSmileyPreviewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CustomSmileyPreviewUI customSmileyPreviewUI = this.f268689d;
        customSmileyPreviewUI.mo127675L7(customSmileyPreviewUI.f268359w);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
