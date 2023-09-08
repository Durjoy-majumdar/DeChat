package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import i61.C76300m;
import nj3.C11184p0;
import te3.C49103d62;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.q */
public final class C93250q implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2DesignerUI f268963d;

    public C93250q(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
        this.f268963d = emojiStoreV2DesignerUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == 1000) {
            C49103d62 value = this.f268963d.f312446t.f294838d.getValue();
            if (value != null) {
                String str2 = value.f132145e + this.f268963d.getString(C0966R.string.n6l);
                AppCompatActivity context = this.f268963d.getContext();
                String str3 = value.f132146f;
                String str4 = value.f132147g;
                EmojiStoreV2DesignerUI emojiStoreV2DesignerUI = this.f268963d;
                String str5 = emojiStoreV2DesignerUI.f312441o;
                int i2 = emojiStoreV2DesignerUI.f312437h;
                String str6 = emojiStoreV2DesignerUI.f312439j;
                int i3 = EmojiLogic.f268226a;
                if (i2 != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("<xml>");
                    sb.append("<designeruin>" + i2 + "</designeruin>");
                    sb.append("<designername>" + str6 + "</designername>");
                    sb.append("<designerrediretcturl>" + str5 + "</designerrediretcturl>");
                    sb.append("</xml>");
                    str = sb.toString();
                    Log.m105925i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", str);
                } else {
                    str = null;
                }
                C76300m.m91726b(context, str2, str3, str4, str5, str, 10);
                C115669n.INSTANCE.mo160131h(13224, 3, 1, "", Integer.valueOf(this.f268963d.f312437h));
            }
        } else if (itemId == 1001) {
            C76300m.m91725a(this.f268963d.getContext(), 2002);
            this.f268963d.getContext().overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
            C115669n.INSTANCE.mo160131h(13224, 3, 2, "", Integer.valueOf(this.f268963d.f312437h));
        }
    }
}
