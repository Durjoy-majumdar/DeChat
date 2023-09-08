package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI$$c */
public class BaseEmojiStoreUI$$c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseEmojiStoreUI f268305d;

    public BaseEmojiStoreUI$$c(BaseEmojiStoreUI baseEmojiStoreUI, C93159a aVar) {
        this.f268305d = baseEmojiStoreUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f268305d.finish();
        return true;
    }
}
