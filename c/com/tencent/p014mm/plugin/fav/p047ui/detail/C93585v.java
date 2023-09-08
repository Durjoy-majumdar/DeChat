package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C93685p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import pb1.C100734q;
import pb1.C100755z;
import qo3.C77407n;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.v */
public class C93585v implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavoriteVoiceDetailUI f270256d;

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.v$a */
    public class C93586a implements C11182m0 {
        public C93586a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(0, C93585v.this.f270256d.getString(C0966R.string.cnr));
            e0Var.mo107125a(2, C0966R.string.cqz);
            e0Var.mo107142f(1, C93585v.this.f270256d.getContext().getString(C0966R.string.f7944x1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.v$b */
    public class C93587b implements C11184p0 {

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.v$b$a */
        public class C93588a implements DialogInterface.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.fav.ui.detail.v$b$a$a */
            public class C93589a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C89779i0 f270260d;

                /* renamed from: e */
                public final /* synthetic */ long f270261e;

                /* renamed from: f */
                public final /* synthetic */ long f270262f;

                public C93589a(C89779i0 i0Var, long j, long j2) {
                    this.f270260d = i0Var;
                    this.f270261e = j;
                    this.f270262f = j2;
                }

                public void run() {
                    C93585v.this.f270256d.f270015g.f295031p = true;
                    this.f270260d.dismiss();
                    Log.m105919d("MicroMsg.FavoriteDetailUI", "do del fav voice, local id %d, fav id %d", Long.valueOf(this.f270261e), Long.valueOf(this.f270262f));
                    C93585v.this.f270256d.finish();
                }
            }

            public C93588a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C89779i0 Q = C76879j.m92723Q(C93585v.this.f270256d.getContext(), "", C93585v.this.f270256d.getString(C0966R.string.f7946x3), false, false, (DialogInterface.OnCancelListener) null);
                C100755z zVar = C93585v.this.f270256d.f270203j;
                long j = zVar.field_localId;
                C100734q.m131856k(j, new C93589a(Q, j, (long) zVar.field_id), 18);
            }
        }

        public C93587b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                Intent intent = new Intent();
                intent.putExtra("key_fav_scene", 2);
                intent.putExtra("key_fav_item_id", C93585v.this.f270256d.f270203j.field_localId);
                C100734q.m131875t0(C93585v.this.f270256d.getContext(), ".ui.FavTagEditUI", intent, (Bundle) null);
                FavoriteVoiceDetailUI favoriteVoiceDetailUI = C93585v.this.f270256d;
                favoriteVoiceDetailUI.f270015g.f295030o++;
                favoriteVoiceDetailUI.mo128401H7(7);
            } else if (itemId == 1) {
                C76879j.m92750u(C93585v.this.f270256d.getContext(), C93585v.this.f270256d.getString(C0966R.string.f7946x3), "", new C93588a(), (DialogInterface.OnClickListener) null);
                C93585v.this.f270256d.mo128401H7(6);
            } else if (itemId == 2) {
                FavoriteVoiceDetailUI favoriteVoiceDetailUI2 = C93585v.this.f270256d;
                C93685p0.m118380b(favoriteVoiceDetailUI2, favoriteVoiceDetailUI2.f270204n, favoriteVoiceDetailUI2.f270015g);
                C93585v.this.f270256d.mo128401H7(5);
            }
        }
    }

    public C93585v(FavoriteVoiceDetailUI favoriteVoiceDetailUI) {
        this.f270256d = favoriteVoiceDetailUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f270256d.getContext(), 1, false);
        nVar.f225771i = new C93586a();
        nVar.f225782p = new C93587b();
        nVar.mo107573q();
        return true;
    }
}
