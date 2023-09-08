package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.LabelContainerView;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI$$f */
public class EmojiStoreV2SingleProductUI$$f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2SingleProductUI f268929d;

    public EmojiStoreV2SingleProductUI$$f(EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f268929d = emojiStoreV2SingleProductUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        LabelContainerView labelContainerView = this.f268929d.f268894I;
        if (labelContainerView == null || labelContainerView.getVisibility() != 0) {
            this.f268929d.finish();
            return false;
        }
        this.f268929d.f268894I.setVisibility(8);
        EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f268929d;
        emojiStoreV2SingleProductUI.showOptionMenu(1001, emojiStoreV2SingleProductUI.f268887B);
        this.f268929d.setMMTitle((int) C0966R.string.c98);
        return false;
    }
}
