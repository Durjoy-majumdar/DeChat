package n61;

import android.view.View;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import u73.C14135q;

/* renamed from: n61.t */
public final class C11134t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3HomeUI f32894d;

    public C11134t(EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f32894d = emojiStoreV3HomeUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f32894d;
        int i = EmojiStoreV3HomeUI.f110655v;
        emojiStoreV3HomeUI.getClass();
        ((C14135q) C86312j.m106911c(C14135q.class)).mo13549kN(MMApplicationContext.getContext(), new C11135u(emojiStoreV3HomeUI));
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
