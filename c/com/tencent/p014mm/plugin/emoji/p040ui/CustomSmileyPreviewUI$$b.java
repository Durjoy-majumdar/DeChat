package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import te3.C101866x70;

/* renamed from: com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$b */
public final /* synthetic */ class CustomSmileyPreviewUI$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f268369d;

    /* renamed from: e */
    public final /* synthetic */ C101866x70 f268370e;

    public /* synthetic */ CustomSmileyPreviewUI$$b(CustomSmileyPreviewUI customSmileyPreviewUI, C101866x70 x702) {
        this.f268369d = customSmileyPreviewUI;
        this.f268370e = x702;
    }

    public final void onClick(View view) {
        CustomSmileyPreviewUI customSmileyPreviewUI = this.f268369d;
        C101866x70 x702 = this.f268370e;
        int i = CustomSmileyPreviewUI.f268306a1;
        customSmileyPreviewUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(x702);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", customSmileyPreviewUI, array);
        int i2 = x702.f299857i;
        String str = x702.f299852d;
        String str2 = x702.f299853e;
        Intent intent = new Intent();
        intent.setClass(customSmileyPreviewUI.getContext(), EmojiStoreV2DesignerUI.class);
        intent.putExtra("uin", i2);
        intent.putExtra("name", str);
        intent.putExtra("headurl", str2);
        intent.putExtra("extra_scence", customSmileyPreviewUI.f268359w);
        AppCompatActivity context = customSmileyPreviewUI.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "navigateToDesigner", "(ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "navigateToDesigner", "(ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(customSmileyPreviewUI, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
