package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$l */
public class EmojiCustomUI$$l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiCustomUI f197840d;

    public EmojiCustomUI$$l(EmojiCustomUI emojiCustomUI) {
        this.f197840d = emojiCustomUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EmojiCustomUI emojiCustomUI = this.f197840d;
        ArrayList<String> arrayList2 = emojiCustomUI.f268431u;
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator<String> it = emojiCustomUI.f268431u.iterator();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                String next = it.next();
                if ("9bd1281af3a31710a45b84d736363691".equals(next)) {
                    z = true;
                }
                if ("08f223fa83f1ca34e143d1e580252c7c".equals(next)) {
                    z2 = true;
                }
            }
            if (z || z2) {
                Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "deleteEmoji: forbid, %s, %s", Boolean.valueOf(z), Boolean.valueOf(z2));
                C76879j.m92707A(emojiCustomUI.getContext(), emojiCustomUI.getString(C0966R.string.c5l, new Object[]{z2 ? emojiCustomUI.getString(C0966R.string.f360368c63) : emojiCustomUI.getString(C0966R.string.c6h)}), "", "", emojiCustomUI.getString(C0966R.string.f8028zq), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        C76879j.m92708B(emojiCustomUI.getContext(), emojiCustomUI.getResources().getString(C0966R.string.c5r), "", emojiCustomUI.getResources().getString(C0966R.string.f7944x1), emojiCustomUI.getResources().getString(C0966R.string.f7926wf), new C68872w(emojiCustomUI), (DialogInterface.OnClickListener) null, C0966R.color.a_4);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
