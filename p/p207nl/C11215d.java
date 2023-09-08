package p207nl;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import k20.C9556a;

/* renamed from: nl.d */
public final class C11215d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76922c f33071d;

    public C11215d(C76922c cVar) {
        this.f33071d = cVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        C115669n.INSTANCE.mo160131h(11596, 3);
        intent.setClassName(this.f33071d.f224784a, "com.tencent.mm.plugin.emoji.ui.EmojiCustomUI");
        intent.putExtra("key_emoji_panel_type", 0);
        Activity activity = this.f33071d.f224784a;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/emoji/util/EmojiCustomHelper$showOverSizeDialog$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/emoji/util/EmojiCustomHelper$showOverSizeDialog$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
