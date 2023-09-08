package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
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
import pb1.C100759z0;
import te3.C101811md0;

/* renamed from: com.tencent.mm.plugin.fav.ui.x */
public class C93724x implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ int f270555d;

    /* renamed from: e */
    public final /* synthetic */ View f270556e;

    /* renamed from: f */
    public final /* synthetic */ FavFilterUI f270557f;

    /* renamed from: com.tencent.mm.plugin.fav.ui.x$a */
    public class C93725a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100755z f270558d;

        /* renamed from: com.tencent.mm.plugin.fav.ui.x$a$a */
        public class C93726a implements Runnable {
            public C93726a() {
            }

            public void run() {
                if (C93724x.this.f270557f.f269694o != null) {
                    Log.m105926v("MicroMsg.FavFilterUI", "do refresh job");
                    C93724x.this.f270557f.f269694o.mo128369b();
                    C93724x.this.f270557f.f269694o.notifyDataSetChanged();
                }
            }
        }

        public C93725a(C100755z zVar) {
            this.f270558d = zVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C100734q.m131858l(this.f270558d, new C93726a(), 5);
            C93724x xVar = C93724x.this;
            FavFilterUI favFilterUI = xVar.f270557f;
            int i2 = xVar.f270555d;
            int i3 = FavFilterUI.f269680F;
            favFilterUI.mo128259M7(6, i2, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.x$b */
    public class C93727b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100755z f270561d;

        public C93727b(C100755z zVar) {
            this.f270561d = zVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C100759z0) C86312j.m106911c(C100759z0.class)).mo61498Sj(Long.valueOf(this.f270561d.field_localId));
            if (C93724x.this.f270557f.f269694o != null) {
                Log.m105926v("MicroMsg.FavFilterUI", "do refresh job after remove");
                C93724x.this.f270557f.f269694o.mo128369b();
                C93724x.this.f270557f.f269694o.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.x$c */
    public class C93728c implements DialogInterface.OnClickListener {
        public C93728c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatActivity context = C93724x.this.f270557f.getContext();
            FavFilterUI favFilterUI = C93724x.this.f270557f;
            C93745z1.m118450g(context, 4106, favFilterUI.f269694o, favFilterUI.f269683C);
            C93724x xVar = C93724x.this;
            xVar.f270557f.mo128259M7(3, xVar.f270555d, false);
        }
    }

    public C93724x(FavFilterUI favFilterUI, int i, View view) {
        this.f270557f = favFilterUI;
        this.f270555d = i;
        this.f270556e = view;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem != null) {
            FavFilterUI favFilterUI = this.f270557f;
            C100755z h = favFilterUI.f269694o.getItem((this.f270555d - favFilterUI.f269695p.getHeaderViewsCount()) - 1);
            switch (menuItem.getItemId()) {
                case 0:
                    if (this.f270555d >= this.f270557f.f269695p.getHeaderViewsCount()) {
                        Log.m105925i("MicroMsg.FavFilterUI", "do delete, long click info is %s (isExistDetail:%s)", Integer.valueOf(this.f270555d), Boolean.valueOf(h.f295172Q0));
                        if (h.f295172Q0) {
                            FavFilterUI.m117999I7(this.f270557f, this.f270556e, this.f270555d, h);
                            return;
                        } else {
                            C76879j.m92708B(this.f270557f.getContext(), this.f270557f.getContext().getString(C0966R.string.cn4), "", this.f270557f.getContext().getString(C0966R.string.f7944x1), this.f270557f.getContext().getString(C0966R.string.bj_), new C93725a(h), (DialogInterface.OnClickListener) null, C0966R.color.a_3);
                            return;
                        }
                    } else {
                        return;
                    }
                case 1:
                    Log.m105925i("MicroMsg.FavFilterUI", "do edit, long click info is %s", Integer.valueOf(this.f270555d));
                    FavFilterUI favFilterUI2 = this.f270557f;
                    favFilterUI2.getClass();
                    favFilterUI2.f269694o.mo128371f(true, h);
                    favFilterUI2.f269695p.setOnItemLongClickListener((AdapterView.OnItemLongClickListener) null);
                    favFilterUI2.f269684D.mo140210c(false, true, false);
                    return;
                case 2:
                    Log.m105925i("MicroMsg.FavFilterUI", "do tag, long click info is %s", Integer.valueOf(this.f270555d));
                    Intent intent = new Intent();
                    intent.putExtra("key_fav_scene", 4);
                    intent.putExtra("key_fav_item_id", h.field_localId);
                    C100734q.m131875t0(this.f270557f.getContext(), ".ui.FavTagEditUI", intent, (Bundle) null);
                    C100699c0.m131739a("FavTagEditUI");
                    this.f270557f.mo128259M7(7, this.f270555d, false);
                    return;
                case 3:
                    Log.m105925i("MicroMsg.FavFilterUI", "do transmit, long click info is %s", Integer.valueOf(this.f270555d));
                    FavFilterUI favFilterUI3 = this.f270557f;
                    favFilterUI3.f269683C = h;
                    favFilterUI3.f269683C = h.clone();
                    if (this.f270557f.f269683C != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(this.f270557f.f269683C);
                        if (FavoriteIndexUI.m118089T7(linkedList, this.f270557f, new C93728c())) {
                            AppCompatActivity context = this.f270557f.getContext();
                            FavFilterUI favFilterUI4 = this.f270557f;
                            C93745z1.m118450g(context, 4106, favFilterUI4.f269694o, favFilterUI4.f269683C);
                            this.f270557f.mo128259M7(3, this.f270555d, false);
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    C101811md0 md02 = new C101811md0();
                    md02.f298819j = 1;
                    ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(this.f270557f.getContext(), h, md02);
                    return;
                case 5:
                    this.f270557f.f269694o.mo128383l(this.f270556e, this.f270555d, h);
                    this.f270557f.mo128259M7(8, this.f270555d, false);
                    return;
                case 6:
                    if (this.f270555d >= this.f270557f.f269695p.getHeaderViewsCount()) {
                        Log.m105925i("MicroMsg.FavFilterUI", "do remove, long click info is %s (isExistDetail:%s)", Integer.valueOf(this.f270555d), Boolean.valueOf(h.f295172Q0));
                        C76879j.m92707A(this.f270557f.getContext(), this.f270557f.getContext().getString(C0966R.string.cqw), "", this.f270557f.getContext().getString(C0966R.string.a3d), this.f270557f.getContext().getString(C0966R.string.bj_), new C93727b(h), (DialogInterface.OnClickListener) null);
                        return;
                    }
                    return;
                case 7:
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_detail_info_id", h.field_localId);
                    intent2.setClassName(this.f270557f.getContext(), "com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI");
                    FavFilterUI favFilterUI5 = this.f270557f;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent2);
                    FavFilterUI favFilterUI6 = favFilterUI5;
                    C117292a.m165358d(favFilterUI6, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavFilterUI$11", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    favFilterUI5.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(favFilterUI6, "com/tencent/mm/plugin/fav/ui/FavFilterUI$11", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                default:
                    return;
            }
        }
    }
}
