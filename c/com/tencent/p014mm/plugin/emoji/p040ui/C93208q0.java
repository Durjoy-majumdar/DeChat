package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.q0 */
public class C93208q0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f268769d;

    public C93208q0(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f268769d = emojiStoreDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.setClass(this.f268769d.getContext(), EmojiStoreV2DesignerUI.class);
        intent.putExtra("uin", this.f268769d.f268627u.f298229E.f136019d);
        intent.putExtra("name", this.f268769d.f268627u.f298229E.f136020e);
        intent.putExtra("headurl", this.f268769d.f268627u.f298229E.f136021f);
        intent.putExtra("rediret_url", this.f268769d.f268627u.f298227C);
        intent.putExtra("searchID", this.f268769d.f268594c1);
        intent.putExtra("extra_scence", 26);
        AppCompatActivity context = this.f268769d.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
