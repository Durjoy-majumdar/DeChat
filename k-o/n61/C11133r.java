package n61;

import android.view.View;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: n61.r */
public final class C11133r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3HomeUI f32893d;

    public C11133r(EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f32893d = emojiStoreV3HomeUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.EmojiStoreV3HomeUI", "finish");
        this.f32893d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
