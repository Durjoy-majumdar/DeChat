package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ke3.C88144b;
import nj3.C11184p0;
import p159gw.C98250h;
import pb1.C100695a0;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.r */
public class C93579r implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FavoriteVideoPlayUI f270247d;

    public C93579r(FavoriteVideoPlayUI favoriteVideoPlayUI) {
        this.f270247d = favoriteVideoPlayUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("mutil_select_is_ret", true);
            if (C86013q1.m106450k(this.f270247d.f270180e)) {
                intent.putExtra("image_path", this.f270247d.f270180e);
            } else {
                intent.putExtra("image_path", this.f270247d.f270181f);
            }
            intent.putExtra("Retr_Msg_Type", 1);
            C88144b.m109802t(this.f270247d.getContext(), ".ui.transmit.SelectConversationUI", intent, 1);
            FavoriteVideoPlayUI favoriteVideoPlayUI = this.f270247d;
            if (favoriteVideoPlayUI.f270196x == 0) {
                C100695a0.m131729d(favoriteVideoPlayUI.getIntent().getLongExtra("key_detail_info_id", 0), 1, 0, -1);
            }
        } else if (itemId == 2) {
            FavoriteVideoPlayUI favoriteVideoPlayUI2 = this.f270247d;
            String str = favoriteVideoPlayUI2.f270181f;
            favoriteVideoPlayUI2.getClass();
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137342Lm(favoriteVideoPlayUI2.getContext(), str, new C93580s(favoriteVideoPlayUI2, str, favoriteVideoPlayUI2));
        }
    }
}
