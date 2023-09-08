package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteImgDetailUI;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ke3.C88144b;
import nj3.C11184p0;
import p159gw.C98250h;
import pb1.C100695a0;
import pb1.C100734q;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.l */
public class C93573l implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FavoriteImgDetailUI.C93530h f270240d;

    /* renamed from: e */
    public final /* synthetic */ FavoriteImgDetailUI f270241e;

    public C93573l(FavoriteImgDetailUI favoriteImgDetailUI, FavoriteImgDetailUI.C93530h hVar) {
        this.f270241e = favoriteImgDetailUI;
        this.f270240d = hVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String w = C100734q.m131880w(this.f270240d.f270117a);
        if (!C86013q1.m106450k(w)) {
            Log.m105928w("MicroMsg.FavoriteImgDetailUI", "file not exists");
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C100734q.m131873s0(w, this.f270241e.getContext());
            C100695a0.m131729d(this.f270241e.f270091o.field_localId, 0, 0, -1);
        } else if (itemId == 2) {
            if (ImgUtil.isGif(w)) {
                Intent intent = new Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                C88144b.m109802t(this.f270241e, ".ui.transmit.SelectConversationUI", intent, 1);
            } else {
                C100734q.m131871r0(w, this.f270241e.getContext(), this.f270240d.f270117a.f299259I1);
            }
            C100695a0.m131729d(this.f270241e.f270091o.field_localId, 1, 0, -1);
        } else if (itemId == 3) {
            String string = this.f270241e.getString(C0966R.string.cr4);
            AppCompatActivity context = this.f270241e.getContext();
            String str = this.f270240d.f270117a.f299259I1;
            int i2 = FavoriteImgDetailUI.f270088w;
            if (Util.isNullOrNil(w)) {
                Log.m105928w("MicroMsg.FavoriteImgDetailUI", "save image fail, path is null");
            } else {
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(context, w, new C93569i(context, str, string));
            }
        }
    }
}
