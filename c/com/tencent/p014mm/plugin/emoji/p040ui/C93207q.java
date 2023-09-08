package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import android.content.Intent;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.q */
public class C93207q implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f268767d;

    /* renamed from: e */
    public final /* synthetic */ EmojiAddCustomDialogUI f268768e;

    public C93207q(EmojiAddCustomDialogUI emojiAddCustomDialogUI, String str) {
        this.f268768e = emojiAddCustomDialogUI;
        this.f268767d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setClass(this.f268768e, EmojiStoreDetailUI.class);
        intent.putExtra("extra_id", this.f268767d);
        intent.putExtra("preceding_scence", 20);
        EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f268768e;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        EmojiAddCustomDialogUI emojiAddCustomDialogUI2 = emojiAddCustomDialogUI;
        C117292a.m165358d(emojiAddCustomDialogUI2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiAddCustomDialogUI$12", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiAddCustomDialogUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(emojiAddCustomDialogUI2, "com/tencent/mm/plugin/emoji/ui/EmojiAddCustomDialogUI$12", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f268768e.finish();
    }
}
