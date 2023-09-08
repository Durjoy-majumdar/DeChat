package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2SingleProductDialogUI;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiMineUI$$a */
public final /* synthetic */ class EmojiMineUI$$a implements View.OnClickListener {
    public final void onClick(View view) {
        int i = EmojiMineUI.f268499u;
        Object obj = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        Context context = view.getContext();
        C87412m.m108594g(context, "context");
        Intent intent = new Intent(context, EmojiStoreV2SingleProductDialogUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiRecommendPrivacySettingsUI$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/emoji/ui/EmojiRecommendPrivacySettingsUI$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(new Object(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
