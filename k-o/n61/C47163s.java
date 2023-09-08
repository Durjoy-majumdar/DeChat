package n61;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiMineUI;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeUI;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import p626nv.C109759g;

/* renamed from: n61.s */
public final class C47163s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3HomeUI f126699d;

    public C47163s(EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f126699d = emojiStoreV3HomeUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f126699d;
        int i = EmojiStoreV3HomeUI.f110655v;
        emojiStoreV3HomeUI.getClass();
        Intent intent = new Intent();
        intent.setClass(emojiStoreV3HomeUI, EmojiMineUI.class);
        intent.putExtra("from_store", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        EmojiStoreV3HomeUI emojiStoreV3HomeUI2 = emojiStoreV3HomeUI;
        C117292a.m165358d(emojiStoreV3HomeUI2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI", "enterMine", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiStoreV3HomeUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(emojiStoreV3HomeUI2, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI", "enterMine", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C115627l lVar = (C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40();
        lVar.mo175762a(44);
        lVar.mo175775q("stickernavright");
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
