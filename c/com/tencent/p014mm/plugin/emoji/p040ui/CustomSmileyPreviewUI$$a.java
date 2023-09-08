package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import te3.C101866x70;

/* renamed from: com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$a */
public final /* synthetic */ class CustomSmileyPreviewUI$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f268367d;

    /* renamed from: e */
    public final /* synthetic */ C101866x70 f268368e;

    public /* synthetic */ CustomSmileyPreviewUI$$a(CustomSmileyPreviewUI customSmileyPreviewUI, C101866x70 x702) {
        this.f268367d = customSmileyPreviewUI;
        this.f268368e = x702;
    }

    public final void onClick(View view) {
        CustomSmileyPreviewUI customSmileyPreviewUI = this.f268367d;
        C101866x70 x702 = this.f268368e;
        int i = CustomSmileyPreviewUI.f268306a1;
        customSmileyPreviewUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(x702);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", customSmileyPreviewUI, array);
        String str = x702.f299856h;
        String str2 = x702.f299852d;
        String str3 = x702.f299858j;
        Intent intent = new Intent();
        intent.setClass(customSmileyPreviewUI, EmojiStoreDetailUI.class);
        intent.putExtra("extra_id", str);
        intent.putExtra("extra_name", str2);
        intent.putExtra("extra_coverurl", str3);
        intent.putExtra("preceding_scence", 4);
        intent.putExtra("call_by", 1);
        intent.putExtra("download_entrance_scene", customSmileyPreviewUI.f268359w);
        intent.putExtra("check_clickflag", true);
        String stringExtra = customSmileyPreviewUI.getIntent().getStringExtra("to_talker_name");
        if (!Util.isNullOrNil(stringExtra)) {
            intent.putExtra("to_talker_name", stringExtra);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(customSmileyPreviewUI, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "navigateToProduct", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        customSmileyPreviewUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(customSmileyPreviewUI, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "navigateToProduct", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(customSmileyPreviewUI, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
