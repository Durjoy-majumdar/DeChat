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
import java.util.LinkedList;
import nj3.C11184p0;
import nj3.C76879j;
import pb1.C100699c0;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;

/* renamed from: com.tencent.mm.plugin.fav.ui.b1 */
public class C93489b1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ int f269996d;

    /* renamed from: e */
    public final /* synthetic */ View f269997e;

    /* renamed from: f */
    public final /* synthetic */ FavSearchUI f269998f;

    /* renamed from: com.tencent.mm.plugin.fav.ui.b1$a */
    public class C93490a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100755z f269999d;

        /* renamed from: com.tencent.mm.plugin.fav.ui.b1$a$a */
        public class C93491a implements Runnable {
            public C93491a() {
            }

            public void run() {
                if (C93489b1.this.f269998f.f269809n != null) {
                    Log.m105926v("MicroMsg.FavSearchUI", "do refresh job");
                    C93489b1.this.f269998f.f269809n.mo128369b();
                    C93489b1.this.f269998f.f269809n.notifyDataSetChanged();
                }
            }
        }

        public C93490a(C100755z zVar) {
            this.f269999d = zVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C100734q.m131858l(this.f269999d, new C93491a(), 6);
            C93489b1 b1Var = C93489b1.this;
            FavSearchUI favSearchUI = b1Var.f269998f;
            int i2 = b1Var.f269996d;
            int i3 = FavSearchUI.f269788N;
            favSearchUI.mo128299O7(6, i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.b1$b */
    public class C93492b implements DialogInterface.OnClickListener {
        public C93492b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatActivity context = C93489b1.this.f269998f.getContext();
            FavSearchUI favSearchUI = C93489b1.this.f269998f;
            C93745z1.m118450g(context, 4106, favSearchUI.f269809n, favSearchUI.f269799K);
            C93489b1 b1Var = C93489b1.this;
            b1Var.f269998f.mo128299O7(3, b1Var.f269996d);
        }
    }

    public C93489b1(FavSearchUI favSearchUI, int i, View view) {
        this.f269998f = favSearchUI;
        this.f269996d = i;
        this.f269997e = view;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem != null) {
            FavSearchUI favSearchUI = this.f269998f;
            C100755z h = favSearchUI.f269809n.getItem((this.f269996d - favSearchUI.f269812q.getHeaderViewsCount()) - 1);
            int itemId = menuItem.getItemId();
            if (itemId != 0) {
                if (itemId == 1) {
                    Log.m105925i("MicroMsg.FavSearchUI", "do edit, long click info is %s", Integer.valueOf(this.f269996d));
                    FavSearchUI favSearchUI2 = this.f269998f;
                    favSearchUI2.getClass();
                    favSearchUI2.f269809n.mo128371f(true, h);
                    favSearchUI2.f269812q.setOnItemLongClickListener((AdapterView.OnItemLongClickListener) null);
                    favSearchUI2.f269800L.mo140210c(false, true, false);
                } else if (itemId == 2) {
                    Log.m105925i("MicroMsg.FavSearchUI", "do tag, long click info is %s", Integer.valueOf(this.f269996d));
                    Intent intent = new Intent();
                    intent.putExtra("key_fav_scene", 4);
                    intent.putExtra("key_fav_item_id", h.field_localId);
                    C100734q.m131875t0(this.f269998f.getContext(), ".ui.FavTagEditUI", intent, (Bundle) null);
                    C100699c0.m131739a("FavTagEditUI");
                    this.f269998f.mo128299O7(7, this.f269996d);
                } else if (itemId == 3) {
                    Log.m105925i("MicroMsg.FavSearchUI", "do transmit, long click info is %s", Integer.valueOf(this.f269996d));
                    FavSearchUI favSearchUI3 = this.f269998f;
                    favSearchUI3.f269799K = h;
                    favSearchUI3.f269799K = h.clone();
                    if (this.f269998f.f269799K != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(this.f269998f.f269799K);
                        if (FavoriteIndexUI.m118089T7(linkedList, this.f269998f, new C93492b())) {
                            AppCompatActivity context = this.f269998f.getContext();
                            FavSearchUI favSearchUI4 = this.f269998f;
                            C93745z1.m118450g(context, 4106, favSearchUI4.f269809n, favSearchUI4.f269799K);
                            this.f269998f.mo128299O7(3, this.f269996d);
                        }
                    }
                } else if (itemId == 4) {
                    C101811md0 md02 = new C101811md0();
                    md02.f298819j = 1;
                    ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(this.f269998f.getContext(), h, md02);
                } else if (itemId == 5) {
                    this.f269998f.f269809n.mo128383l(this.f269997e, this.f269996d, h);
                    this.f269998f.mo128299O7(8, this.f269996d);
                }
            } else if (this.f269996d >= this.f269998f.f269812q.getHeaderViewsCount()) {
                Log.m105925i("MicroMsg.FavSearchUI", "do delete, long click info is %s (isExistDetail:%s)", Integer.valueOf(this.f269996d), Boolean.valueOf(h.f295172Q0));
                if (h.f295172Q0) {
                    FavSearchUI.m118043K7(this.f269998f, this.f269997e, this.f269996d, h);
                } else {
                    C76879j.m92708B(this.f269998f.getContext(), this.f269998f.getContext().getString(C0966R.string.cn4), "", this.f269998f.getContext().getString(C0966R.string.f7944x1), this.f269998f.getContext().getString(C0966R.string.bj_), new C93490a(h), (DialogInterface.OnClickListener) null, C0966R.color.a_3);
                }
            }
        }
    }
}
