package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import nj3.C11184p0;
import nj3.C76879j;
import pb1.C100699c0;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;

/* renamed from: com.tencent.mm.plugin.fav.ui.y1 */
public class C93741y1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ int f270583d;

    /* renamed from: e */
    public final /* synthetic */ FavoriteIndexUI f270584e;

    /* renamed from: com.tencent.mm.plugin.fav.ui.y1$a */
    public class C93742a implements DialogInterface.OnClickListener {
        public C93742a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C93741y1 y1Var = C93741y1.this;
            if (y1Var.f270583d >= y1Var.f270584e.f269624h.getHeaderViewsCount()) {
                Log.m105925i("MicroMsg.FavoriteIndexUI", "do delete, long click info is %s", Integer.valueOf(C93741y1.this.f270583d));
                C93741y1 y1Var2 = C93741y1.this;
                FavoriteIndexUI favoriteIndexUI = y1Var2.f270584e;
                C100734q.m131858l(favoriteIndexUI.f269912H.getItem((y1Var2.f270583d - favoriteIndexUI.f269624h.getHeaderViewsCount()) - 1), (Runnable) null, 1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.y1$b */
    public class C93743b implements DialogInterface.OnClickListener {
        public C93743b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            FavoriteIndexUI favoriteIndexUI = C93741y1.this.f270584e;
            AppCompatActivity context = favoriteIndexUI.getContext();
            FavoriteIndexUI favoriteIndexUI2 = C93741y1.this.f270584e;
            FavoriteIndexUI.m118088R7(favoriteIndexUI, context, 4106, favoriteIndexUI2.f269912H, favoriteIndexUI2.f269919P);
        }
    }

    public C93741y1(FavoriteIndexUI favoriteIndexUI, int i) {
        this.f270584e = favoriteIndexUI;
        this.f270583d = i;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        FavoriteIndexUI favoriteIndexUI = this.f270584e;
        int i2 = FavoriteIndexUI.f269910R;
        favoriteIndexUI.getClass();
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                C76879j.m92708B(this.f270584e.getContext(), this.f270584e.getContext().getString(C0966R.string.cn4), "", this.f270584e.getContext().getString(C0966R.string.f7944x1), this.f270584e.getContext().getString(C0966R.string.bj_), new C93742a(), (DialogInterface.OnClickListener) null, C0966R.color.a_3);
            } else if (itemId == 1) {
                this.f270584e.f269911G = Util.nowSecond();
                Log.m105925i("MicroMsg.FavoriteIndexUI", "do edit, long click info is %s", Integer.valueOf(this.f270583d));
                FavoriteIndexUI favoriteIndexUI2 = this.f270584e;
                favoriteIndexUI2.f269914J = favoriteIndexUI2.f269912H.getItem((this.f270583d - favoriteIndexUI2.f269624h.getHeaderViewsCount()) - 1);
                FavoriteIndexUI favoriteIndexUI3 = this.f270584e;
                favoriteIndexUI3.f269912H.mo128371f(true, favoriteIndexUI3.f269914J);
                favoriteIndexUI3.f269624h.setOnItemLongClickListener((AdapterView.OnItemLongClickListener) null);
                favoriteIndexUI3.showOptionMenu(11, false);
                favoriteIndexUI3.f269913I.mo140210c(false, false, false);
            } else if (itemId == 2) {
                Log.m105925i("MicroMsg.FavoriteIndexUI", "do tag, long click info is %s", Integer.valueOf(this.f270583d));
                FavoriteIndexUI favoriteIndexUI4 = this.f270584e;
                C100755z h = favoriteIndexUI4.f269912H.getItem((this.f270583d - favoriteIndexUI4.f269624h.getHeaderViewsCount()) - 1);
                Intent intent = new Intent();
                intent.putExtra("key_fav_scene", 4);
                intent.putExtra("key_fav_item_id", h.field_localId);
                C100734q.m131875t0(this.f270584e.getContext(), ".ui.FavTagEditUI", intent, (Bundle) null);
                C100699c0.m131739a("FavTagEditUI");
            } else if (itemId == 3) {
                this.f270584e.f269911G = Util.nowSecond();
                Log.m105925i("MicroMsg.FavoriteIndexUI", "do transmit, long click info is %s", Integer.valueOf(this.f270583d));
                FavoriteIndexUI favoriteIndexUI5 = this.f270584e;
                favoriteIndexUI5.f269915K = (this.f270583d - favoriteIndexUI5.f269624h.getHeaderViewsCount()) - 1;
                FavoriteIndexUI favoriteIndexUI6 = this.f270584e;
                favoriteIndexUI6.f269919P = favoriteIndexUI6.f269912H.getItem(favoriteIndexUI6.f269915K);
                FavoriteIndexUI favoriteIndexUI7 = this.f270584e;
                favoriteIndexUI7.f269919P = favoriteIndexUI7.f269919P.clone();
                if (this.f270584e.f269919P != null) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(this.f270584e.f269919P);
                    if (FavoriteIndexUI.m118089T7(linkedList, this.f270584e, new C93743b())) {
                        FavoriteIndexUI favoriteIndexUI8 = this.f270584e;
                        AppCompatActivity context = favoriteIndexUI8.getContext();
                        FavoriteIndexUI favoriteIndexUI9 = this.f270584e;
                        FavoriteIndexUI.m118088R7(favoriteIndexUI8, context, 4106, favoriteIndexUI9.f269912H, favoriteIndexUI9.f269919P);
                    }
                }
            } else if (itemId == 4) {
                FavoriteIndexUI favoriteIndexUI10 = this.f270584e;
                C100755z h2 = favoriteIndexUI10.f269912H.getItem((this.f270583d - favoriteIndexUI10.f269624h.getHeaderViewsCount()) - 1);
                C101811md0 md02 = new C101811md0();
                md02.f298819j = 1;
                ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(this.f270584e.getContext(), h2, md02);
            } else if (itemId == 5) {
                Intent intent2 = new Intent();
                FavoriteIndexUI favoriteIndexUI11 = this.f270584e;
                intent2.putExtra("key_detail_info_id", favoriteIndexUI11.f269912H.getItem((this.f270583d - favoriteIndexUI11.f269624h.getHeaderViewsCount()) - 1).field_localId);
                intent2.setClassName(this.f270584e.getContext(), "com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI");
                FavoriteIndexUI favoriteIndexUI12 = this.f270584e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                FavoriteIndexUI favoriteIndexUI13 = favoriteIndexUI12;
                C117292a.m165358d(favoriteIndexUI13, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$7", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                favoriteIndexUI12.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(favoriteIndexUI13, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$7", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
