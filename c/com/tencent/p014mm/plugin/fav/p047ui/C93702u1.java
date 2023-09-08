package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C93745z1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import pb1.C100699c0;
import pb1.C100734q;
import pb1.C100755z;
import pb1.C100759z0;
import pc1.C100774c;

/* renamed from: com.tencent.mm.plugin.fav.ui.u1 */
public class C93702u1 implements C100774c.C100778d {

    /* renamed from: a */
    public final /* synthetic */ FavoriteIndexUI f270498a;

    /* renamed from: com.tencent.mm.plugin.fav.ui.u1$a */
    public class C93703a implements DialogInterface.OnClickListener {
        public C93703a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            FavoriteIndexUI favoriteIndexUI = C93702u1.this.f270498a;
            AppCompatActivity context = favoriteIndexUI.getContext();
            FavoriteIndexUI favoriteIndexUI2 = C93702u1.this.f270498a;
            FavoriteIndexUI.m118088R7(favoriteIndexUI, context, 4105, favoriteIndexUI2.f269912H, favoriteIndexUI2.f269919P);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.u1$b */
    public class C93704b implements DialogInterface.OnClickListener {
        public C93704b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            List<C100755z> i2 = C93702u1.this.f270498a.f269912H.mo128379i(true);
            C93745z1.m118444a(C93702u1.this.f270498a.getContext(), i2, (C93745z1.C93749c) null, 28);
            C115669n.INSTANCE.mo160131h(11125, Integer.valueOf(((LinkedList) i2).size()), 3);
            FavoriteIndexUI favoriteIndexUI = C93702u1.this.f270498a;
            if (favoriteIndexUI.f269912H.f269981q) {
                favoriteIndexUI.mo128341U7();
            }
        }
    }

    public C93702u1(FavoriteIndexUI favoriteIndexUI) {
        this.f270498a = favoriteIndexUI;
    }

    /* renamed from: a */
    public void mo128359a() {
        if (this.f270498a.f269912H.mo128381j() > 0) {
            if (this.f270498a.f269912H.mo128381j() > 1) {
                Intent intent = new Intent();
                intent.putExtra("key_fav_scene", 3);
                C100734q.m131877u0(this.f270498a.getContext(), ".ui.FavTagEditUI", intent, 4104, (Bundle) null);
                C100699c0.m131739a("FavTagEditUI");
                for (C100755z next : this.f270498a.f269912H.mo128379i(false)) {
                    if (next != null) {
                        ((C100759z0) C86312j.m106911c(C100759z0.class)).mo61499ni(Long.valueOf(next.field_localId));
                    }
                }
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("key_fav_scene", 3);
            intent2.putExtra("key_fav_item_id", ((C100755z) ((LinkedList) this.f270498a.f269912H.mo128379i(false)).get(0)).field_localId);
            C100734q.m131875t0(this.f270498a.getContext(), ".ui.FavTagEditUI", intent2, (Bundle) null);
            C100699c0.m131739a("FavTagEditUI");
            FavoriteIndexUI favoriteIndexUI = this.f270498a;
            if (favoriteIndexUI.f269912H.f269981q) {
                favoriteIndexUI.mo128341U7();
            }
        }
    }

    /* renamed from: b */
    public void mo128360b() {
        if (FavoriteIndexUI.m118089T7(this.f270498a.f269912H.mo128379i(false), this.f270498a, new C93703a())) {
            FavoriteIndexUI favoriteIndexUI = this.f270498a;
            AppCompatActivity context = favoriteIndexUI.getContext();
            FavoriteIndexUI favoriteIndexUI2 = this.f270498a;
            FavoriteIndexUI.m118088R7(favoriteIndexUI, context, 4105, favoriteIndexUI2.f269912H, favoriteIndexUI2.f269919P);
        }
    }

    /* renamed from: c */
    public void mo128361c() {
        C76879j.m92750u(this.f270498a.getContext(), this.f270498a.getString(C0966R.string.cn5), "", new C93704b(), (DialogInterface.OnClickListener) null);
    }
}
