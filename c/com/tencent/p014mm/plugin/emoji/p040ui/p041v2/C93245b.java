package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2BaseFragment;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.b */
public class C93245b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2BaseFragment f268950d;

    public C93245b(EmojiStoreV2BaseFragment emojiStoreV2BaseFragment) {
        this.f268950d = emojiStoreV2BaseFragment;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f268950d.isScreenEnable()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f268950d.f268791N;
        if (onMenuItemClickListener != null) {
            ((EmojiStoreV2BaseFragment.C93221b) onMenuItemClickListener).onMenuItemClick((MenuItem) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
