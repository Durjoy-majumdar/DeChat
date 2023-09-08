package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2RewardDetailUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import te3.C49978jd3;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI$$h */
public class EmojiStoreDetailUI$$h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f268647d;

    public EmojiStoreDetailUI$$h(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f268647d = emojiStoreDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.setClass(this.f268647d, EmojiStoreV2RewardDetailUI.class);
        intent.putExtra("extra_id", this.f268647d.f268597e);
        intent.putExtra("extra_iconurl", this.f268647d.f268627u.f298236e);
        intent.putExtra("extra_name", this.f268647d.f268627u.f298237f);
        C49978jd3 jd32 = this.f268647d.f268627u.f298229E;
        if (jd32 != null) {
            intent.putExtra("name", jd32.f136020e);
        }
        EmojiStoreDetailUI emojiStoreDetailUI = this.f268647d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        EmojiStoreDetailUI emojiStoreDetailUI2 = emojiStoreDetailUI;
        C117292a.m165358d(emojiStoreDetailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiStoreDetailUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(emojiStoreDetailUI2, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
