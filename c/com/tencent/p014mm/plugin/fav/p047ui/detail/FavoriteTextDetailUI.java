package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.p136ui.widget.MMLoadScrollView;
import com.tencent.p014mm.plugin.fav.p047ui.C93685p0;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sendtowework.TextData;
import di3.C86312j;
import f40.C86709a0;
import ie3.C87716k;
import java.util.ArrayList;
import java.util.HashMap;
import ke3.C88144b;
import lc3.C10485b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p629ny.C76979h;
import pb1.C100695a0;
import pb1.C100705f0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C101801kd0;
import te3.C101835rd0;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI */
public class FavoriteTextDetailUI extends BaseFavDetailReportUI {

    /* renamed from: r */
    public static final int f270157r = (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitFavText"), 100000) * 2);

    /* renamed from: j */
    public TextView f270158j;

    /* renamed from: n */
    public C100755z f270159n;

    /* renamed from: o */
    public C100755z f270160o;

    /* renamed from: p */
    public long f270161p;

    /* renamed from: q */
    public C11184p0 f270162q = new C93550c();

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI$a */
    public class C93544a implements MenuItem.OnMenuItemClickListener {
        public C93544a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavoriteTextDetailUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI$b */
    public class C93545b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI$b$a */
        public class C93546a implements C11182m0 {
            public C93546a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                if (FavoriteTextDetailUI.this.getIntent().getBooleanExtra("key_detail_can_share_to_friend", true)) {
                    e0Var.mo107142f(2, FavoriteTextDetailUI.this.getString(C0966R.string.crb));
                }
                e0Var.mo107142f(0, FavoriteTextDetailUI.this.getString(C0966R.string.cnp));
                e0Var.mo107142f(1, FavoriteTextDetailUI.this.getString(C0966R.string.cqz));
                e0Var.mo107142f(3, FavoriteTextDetailUI.this.getString(C0966R.string.cnr));
                e0Var.mo107142f(4, FavoriteTextDetailUI.this.getString(C0966R.string.f7944x1));
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI$b$b */
        public class C93547b implements C11184p0 {

            /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI$b$b$a */
            public class C93548a implements DialogInterface.OnClickListener {

                /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI$b$b$a$a */
                public class C93549a implements Runnable {

                    /* renamed from: d */
                    public final /* synthetic */ C89779i0 f270168d;

                    public C93549a(C89779i0 i0Var) {
                        this.f270168d = i0Var;
                    }

                    public void run() {
                        FavoriteTextDetailUI.this.f270015g.f295031p = true;
                        this.f270168d.dismiss();
                        Log.m105919d("MicroMsg.FavoriteTextDetailUI", "do del, local id %d", Long.valueOf(FavoriteTextDetailUI.this.f270161p));
                        FavoriteTextDetailUI.this.finish();
                    }
                }

                public C93548a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C100734q.m131856k(FavoriteTextDetailUI.this.f270161p, new C93549a(C76879j.m92723Q(FavoriteTextDetailUI.this.getContext(), "", FavoriteTextDetailUI.this.getString(C0966R.string.f7946x3), false, false, (DialogInterface.OnCancelListener) null)), 17);
                }
            }

            public C93547b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C101801kd0 kd02;
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    C100755z zVar = FavoriteTextDetailUI.this.f270159n;
                    if (zVar != null && zVar.field_favProto != null) {
                        Intent intent = new Intent();
                        intent.putExtra("key_value", FavoriteTextDetailUI.this.f270159n.field_favProto.f298628s);
                        intent.putExtra("key_max_count", FavoriteTextDetailUI.f270157r);
                        intent.putExtra("key_show_confirm", true);
                        intent.putExtra("key_fav_item_id", FavoriteTextDetailUI.this.f270159n.field_id);
                        C100734q.m131877u0(FavoriteTextDetailUI.this, ".ui.FavTextEditUI", intent, 1, (Bundle) null);
                        FavoriteTextDetailUI.this.f270015g.f295029n++;
                    }
                } else if (itemId == 1) {
                    FavoriteTextDetailUI favoriteTextDetailUI = FavoriteTextDetailUI.this;
                    C93685p0.m118380b(favoriteTextDetailUI, favoriteTextDetailUI.f270161p, favoriteTextDetailUI.f270015g);
                    FavoriteTextDetailUI.this.mo128401H7(5);
                } else if (itemId == 2) {
                    FavoriteTextDetailUI favoriteTextDetailUI2 = FavoriteTextDetailUI.this;
                    C100755z zVar2 = favoriteTextDetailUI2.f270159n;
                    if (!(zVar2 == null || (kd02 = zVar2.field_favProto) == null)) {
                        favoriteTextDetailUI2.f270015g.f295027l++;
                        String str = kd02.f298628s;
                        HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
                        if (Util.isNullOrNil(str)) {
                            Log.m105920e("MicroMsg.Fav.FavApiLogic", "shareTextToFriend content null");
                        } else {
                            Intent intent2 = new Intent();
                            if (str != null) {
                                TextData textData = new TextData(str);
                                intent2.putExtra("content_type_forward_to_wework", 1);
                                intent2.putExtra("Select_Data_Send_To_WeWork", textData);
                            }
                            intent2.putExtra("Retr_Msg_content", str);
                            intent2.putExtra("Retr_Msg_Type", 4);
                            intent2.putExtra("mutil_select_is_ret", true);
                            C88144b.m109801s(favoriteTextDetailUI2, ".ui.transmit.MsgRetransmitUI", intent2, (Bundle) null);
                        }
                        C100695a0.m131729d(FavoriteTextDetailUI.this.f270159n.field_localId, 1, 0, -1);
                    }
                    FavoriteTextDetailUI.this.mo128401H7(3);
                } else if (itemId == 3) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("key_fav_scene", 2);
                    intent3.putExtra("key_fav_item_id", FavoriteTextDetailUI.this.f270159n.field_localId);
                    C100734q.m131875t0(FavoriteTextDetailUI.this.getContext(), ".ui.FavTagEditUI", intent3, (Bundle) null);
                    FavoriteTextDetailUI favoriteTextDetailUI3 = FavoriteTextDetailUI.this;
                    favoriteTextDetailUI3.f270015g.f295030o++;
                    favoriteTextDetailUI3.mo128401H7(7);
                } else if (itemId == 4) {
                    C76879j.m92750u(FavoriteTextDetailUI.this.getContext(), FavoriteTextDetailUI.this.getString(C0966R.string.f7946x3), "", new C93548a(), (DialogInterface.OnClickListener) null);
                    FavoriteTextDetailUI.this.mo128401H7(6);
                }
            }
        }

        public C93545b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) FavoriteTextDetailUI.this.getContext(), 1, false);
            nVar.f225771i = new C93546a();
            nVar.f225782p = new C93547b();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI$c */
    public class C93550c implements C11184p0 {
        public C93550c() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C100755z zVar;
            C101801kd0 kd02;
            if (menuItem.getItemId() == 1 && (zVar = FavoriteTextDetailUI.this.f270159n) != null && (kd02 = zVar.field_favProto) != null) {
                ClipboardHelper.setText(kd02.f298628s);
                C76879j.m92726T(FavoriteTextDetailUI.this.getContext(), FavoriteTextDetailUI.this.getContext().getString(C0966R.string.f7938wv));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI$d */
    public class C93551d implements Runnable {
        public C93551d() {
        }

        public void run() {
            FavoriteTextDetailUI favoriteTextDetailUI = FavoriteTextDetailUI.this;
            int i = FavoriteTextDetailUI.f270157r;
            favoriteTextDetailUI.mo128449K7();
        }
    }

    /* renamed from: I7 */
    public MMLoadScrollView mo128398I7() {
        return (MMLoadScrollView) findViewById(C0966R.C0970id.j48);
    }

    /* renamed from: K7 */
    public final void mo128449K7() {
        C101801kd0 kd02;
        C101835rd0 rd02;
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(this.f270161p);
        this.f270159n = Yt;
        mo128399J7(Yt);
        C100755z zVar = this.f270159n;
        if (zVar == null || zVar.field_favProto == null) {
            Log.m105929w("MicroMsg.FavoriteTextDetailUI", "id[%d] info is null, return", Long.valueOf(this.f270161p));
            return;
        }
        C93575n.m118170a(this, zVar);
        C100755z zVar2 = this.f270160o;
        if (zVar2 == null || zVar2.field_edittime != this.f270159n.field_edittime) {
            C100755z zVar3 = this.f270159n;
            this.f270160o = zVar3;
            this.f270158j.setText(zVar3.field_favProto.f298628s);
            Bundle bundle = new Bundle();
            bundle.putString("key_wxa_short_link_launch_scene", "FAVORITE");
            C100755z zVar4 = this.f270159n;
            if (!(zVar4 == null || (kd02 = zVar4.field_favProto) == null || (rd02 = kd02.f298616d) == null)) {
                bundle.putInt("geta8key_scene", 14);
                bundle.putString("serverMsgID", rd02.f299358s);
                bundle.putString("msgUsername", rd02.f299348f);
                bundle.putString("geta8key_username", C100705f0.m131751b(rd02));
            }
            ((C76979h) C86312j.m106911c(C76979h.class)).k80(this.f270158j, 1, 3, bundle, C76979h.f224926w0, true, false);
            return;
        }
        Log.m105928w("MicroMsg.FavoriteTextDetailUI", "not change, return");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a7l;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (1 == i && -1 == i2) {
            C76879j.m92726T(getContext(), getString(C0966R.string.a2o));
            new MMHandler().postDelayed(new C93551d(), 250);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f270158j = (TextView) findViewById(C0966R.C0970id.f357648b04);
        this.f270161p = getIntent().getLongExtra("key_detail_info_id", -1);
        C87716k.f253994a = 5;
        new C45082x0(getContext()).mo70438d(this.f270158j, this, this.f270162q);
        setMMTitle(getString(C0966R.string.cn9));
        setBackBtn(new C93544a());
        addIconOptionMenu(0, (int) C0966R.string.k3h, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C93545b());
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, getString(C0966R.string.f7936wt));
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        mo128449K7();
    }
}
