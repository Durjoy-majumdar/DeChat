package com.tencent.p014mm.plugin.emoji.p040ui.fts;

import android.content.Intent;
import android.view.View;
import c00.C92330r;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiSendDialogUI;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.emoji.ui.fts.e */
public class C93183e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSEmojiDetailPageUI f268739d;

    public C93183e(FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f268739d = fTSEmojiDetailPageUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f268739d;
        int i = FTSEmojiDetailPageUI.f268694P;
        fTSEmojiDetailPageUI.getClass();
        ((C92330r) C86312j.m106911c(C92330r.class)).mo126126PR(fTSEmojiDetailPageUI.f268723u, fTSEmojiDetailPageUI.f268724v, fTSEmojiDetailPageUI.f268726x, 2, 0, 0, fTSEmojiDetailPageUI.f268725w);
        Intent intent = new Intent(fTSEmojiDetailPageUI, EmojiSendDialogUI.class);
        if (fTSEmojiDetailPageUI.f268702H == 1) {
            intent.putExtra("emoji_info", fTSEmojiDetailPageUI.f268720r);
        } else {
            intent.putExtra("emoji_info", fTSEmojiDetailPageUI.f268719q);
        }
        fTSEmojiDetailPageUI.startActivityForResult(intent, 1001);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
