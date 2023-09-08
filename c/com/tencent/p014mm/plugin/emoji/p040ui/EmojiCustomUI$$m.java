package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import j20.C117292a;
import j61.C60778e;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$m */
public class EmojiCustomUI$$m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiCustomUI f197841d;

    public EmojiCustomUI$$m(EmojiCustomUI emojiCustomUI) {
        this.f197841d = emojiCustomUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EmojiCustomUI emojiCustomUI = this.f197841d;
        Object[] objArr = new Object[1];
        ArrayList<String> arrayList2 = emojiCustomUI.f268431u;
        objArr[0] = Integer.valueOf(arrayList2 == null ? 0 : arrayList2.size());
        Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "topCustom mSelectedList size:%d", objArr);
        ArrayList<String> arrayList3 = emojiCustomUI.f268431u;
        if (arrayList3 == null || arrayList3.size() <= 0) {
            Log.m105928w("MicroMsg.emoji.EmojiCustomUI", "empty seleted list");
        } else {
            emojiCustomUI.f268428r = C76879j.m92723Q(emojiCustomUI, emojiCustomUI.getString(C0966R.string.a3h), emojiCustomUI.getString(C0966R.string.c_x), true, true, new C68873z(emojiCustomUI));
            ArrayList<String> arrayList4 = emojiCustomUI.f268431u;
            Object[] objArr2 = new Object[1];
            objArr2[0] = Integer.valueOf(arrayList4 == null ? 0 : arrayList4.size());
            Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "topSyncEmoji list size:%d", objArr2);
            if (arrayList4 == null || arrayList4.size() <= 0) {
                Log.m105924i("MicroMsg.emoji.EmojiCustomUI", "empty size.");
            } else {
                C86709a0.m107529k().f251779b.mo123460f(new C60778e(emojiCustomUI.f268432v, 3, emojiCustomUI.f268431u));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
