package com.tencent.p014mm.plugin.emoji.p040ui;

import android.text.TextUtils;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import i61.C76300m;
import nj3.C11184p0;
import te3.C101776f80;

/* renamed from: com.tencent.mm.plugin.emoji.ui.x0 */
public class C93274x0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f269118d;

    public C93274x0(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f269118d = emojiStoreDetailUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == 1000) {
            String str2 = this.f269118d.f268627u.f298237f + this.f269118d.getString(C0966R.string.c9z);
            AppCompatActivity context = this.f269118d.getContext();
            EmojiStoreDetailUI emojiStoreDetailUI = this.f269118d;
            C101776f80 f802 = emojiStoreDetailUI.f268627u;
            String str3 = f802.f298238g;
            String str4 = f802.f298236e;
            String str5 = f802.f298227C;
            String str6 = emojiStoreDetailUI.f268597e;
            int i2 = EmojiLogic.f268226a;
            if (!TextUtils.isEmpty(str6)) {
                StringBuilder sb = new StringBuilder();
                sb.append("<xml>");
                sb.append("<productid>" + str6 + "</productid>");
                sb.append("</xml>");
                str = sb.toString();
                Log.m105925i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", str);
            } else {
                str = null;
            }
            C76300m.m91726b(context, str2, str3, str4, str5, str, 4);
            C115669n nVar = C115669n.INSTANCE;
            EmojiStoreDetailUI emojiStoreDetailUI2 = this.f269118d;
            nVar.mo160131h(13224, 0, 1, emojiStoreDetailUI2.f268597e, "", "", Integer.valueOf(EmojiLogic.m117482m(emojiStoreDetailUI2.mo127738J7())), Integer.valueOf(EmojiLogic.m117484o(this.f269118d.mo127738J7())), EmojiLogic.m117483n(this.f269118d.mo127738J7()));
        } else if (itemId == 1001) {
            C76300m.m91725a(this.f269118d.getContext(), 2002);
            this.f269118d.getContext().overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
            C115669n nVar2 = C115669n.INSTANCE;
            EmojiStoreDetailUI emojiStoreDetailUI3 = this.f269118d;
            nVar2.mo160131h(13224, 0, 2, emojiStoreDetailUI3.f268597e, "", "", Integer.valueOf(EmojiLogic.m117482m(emojiStoreDetailUI3.mo127738J7())), Integer.valueOf(EmojiLogic.m117484o(this.f269118d.mo127738J7())), EmojiLogic.m117483n(this.f269118d.mo127738J7()));
        }
    }
}
