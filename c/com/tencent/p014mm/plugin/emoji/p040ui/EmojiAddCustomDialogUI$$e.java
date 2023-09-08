package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$e */
public class EmojiAddCustomDialogUI$$e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiAddCustomDialogUI f268404d;

    public EmojiAddCustomDialogUI$$e(EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f268404d = emojiAddCustomDialogUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        C115669n.INSTANCE.mo160131h(11596, 3);
        intent.setClass(this.f268404d.f268393o, EmojiCustomUI.class);
        intent.putExtra("key_emoji_panel_type", 0);
        EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f268404d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        EmojiAddCustomDialogUI emojiAddCustomDialogUI2 = emojiAddCustomDialogUI;
        C117292a.m165358d(emojiAddCustomDialogUI2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiAddCustomDialogUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiAddCustomDialogUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(emojiAddCustomDialogUI2, "com/tencent/mm/plugin/emoji/ui/EmojiAddCustomDialogUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
