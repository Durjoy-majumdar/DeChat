package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2RewardUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import te3.C101776f80;
import te3.C49978jd3;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI$$g */
public class EmojiStoreDetailUI$$g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f268646d;

    public EmojiStoreDetailUI$$g(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f268646d = emojiStoreDetailUI;
    }

    public void onClick(View view) {
        C49978jd3 jd32;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.setClass(this.f268646d, EmojiStoreV2RewardUI.class);
        intent.putExtra("extra_id", this.f268646d.f268597e);
        intent.putExtra("extra_name", this.f268646d.f268627u.f298237f);
        C101776f80 f802 = this.f268646d.f268627u;
        if (!(f802 == null || (jd32 = f802.f298229E) == null)) {
            intent.putExtra("name", jd32.f136020e);
        }
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f268646d.f268593b1);
        intent.putExtra("pageType", 1);
        intent.putExtra("searchID", this.f268646d.f268594c1);
        EmojiStoreDetailUI emojiStoreDetailUI = this.f268646d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        EmojiStoreDetailUI emojiStoreDetailUI2 = emojiStoreDetailUI;
        C117292a.m165358d(emojiStoreDetailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiStoreDetailUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(emojiStoreDetailUI2, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C115669n.INSTANCE.mo160131h(12738, this.f268646d.f268597e, 1, Integer.valueOf(this.f268646d.f268593b1), 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
