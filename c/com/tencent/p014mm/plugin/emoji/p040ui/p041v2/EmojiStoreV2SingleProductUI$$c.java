package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.os.Message;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI$$c */
public class EmojiStoreV2SingleProductUI$$c extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ EmojiStoreV2SingleProductUI f12269a;

    public EmojiStoreV2SingleProductUI$$c(EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f12269a = emojiStoreV2SingleProductUI;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1001) {
            View view = this.f12269a.f268886A;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (i == 1002) {
            View view3 = this.f12269a.f268886A;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            sendEmptyMessage(1003);
        } else if (i == 1004) {
            EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f12269a;
            int i2 = EmojiStoreV2SingleProductUI.f268885U;
            emojiStoreV2SingleProductUI.mo127857I7();
        }
    }
}
