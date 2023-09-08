package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$k */
public class EmojiCustomUI$$k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiCustomUI f80935d;

    public EmojiCustomUI$$k(EmojiCustomUI emojiCustomUI) {
        this.f80935d = emojiCustomUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f80935d.f268430t.ordinal() == 0) {
            EmojiCustomUI emojiCustomUI = this.f80935d;
            C76879j.m92707A(emojiCustomUI.getContext(), emojiCustomUI.getResources().getString(C0966R.string.c_m), "", emojiCustomUI.getResources().getString(C0966R.string.c_k), emojiCustomUI.getResources().getString(C0966R.string.f7926wf), new C29876x(emojiCustomUI), (DialogInterface.OnClickListener) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
