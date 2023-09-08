package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavAlbumContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p548hg.C98450d;
import p606mm.C99933h;
import pb1.C100695a0;
import pb1.C100717j0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import pc1.C100770a;
import qh0.C62619a;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C101834rc0;
import xb1.C102614d;
import z04.C66723k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/fav/ui/detail/FavoriteAlbumDetailUI;", "Lcom/tencent/mm/plugin/fav/ui/detail/BaseFavDetailReportUI;", "<init>", "()V", "ui-fav_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteAlbumDetailUI */
public final class FavoriteAlbumDetailUI extends BaseFavDetailReportUI {

    /* renamed from: o */
    public static final /* synthetic */ int f270024o = 0;

    /* renamed from: j */
    public C100755z f270025j;

    /* renamed from: n */
    public FavAlbumContainer f270026n;

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteAlbumDetailUI$b */
    public static final class C55657b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FavoriteAlbumDetailUI f158393d;

        /* renamed from: e */
        public final /* synthetic */ long f158394e;

        public C55657b(FavoriteAlbumDetailUI favoriteAlbumDetailUI, long j) {
            this.f158393d = favoriteAlbumDetailUI;
            this.f158394e = j;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteAlbumDetailUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FavoriteAlbumDetailUI favoriteAlbumDetailUI = this.f158393d;
            long j = this.f158394e;
            int i = FavoriteAlbumDetailUI.f270024o;
            favoriteAlbumDetailUI.getClass();
            C62619a aVar = new C62619a();
            aVar.f177833h = 5;
            ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(18, "album_enter_from_scene", aVar, C55659a.f158396a);
            Intent intent = new Intent();
            intent.setClassName(favoriteAlbumDetailUI, "com.tencent.mm.plugin.album.ui.AlbumGridUI");
            intent.putExtra("key_detail_info_id", j);
            intent.putExtra("album_enter_from_scene", 5);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            FavoriteAlbumDetailUI favoriteAlbumDetailUI2 = favoriteAlbumDetailUI;
            C117292a.m165358d(favoriteAlbumDetailUI2, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteAlbumDetailUI", "openAlbum", "(Landroid/content/Context;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            favoriteAlbumDetailUI.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(favoriteAlbumDetailUI2, "com/tencent/mm/plugin/fav/ui/detail/FavoriteAlbumDetailUI", "openAlbum", "(Landroid/content/Context;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteAlbumDetailUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteAlbumDetailUI$c */
    public static final class C55658c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FavoriteAlbumDetailUI f158395d;

        public C55658c(FavoriteAlbumDetailUI favoriteAlbumDetailUI) {
            this.f158395d = favoriteAlbumDetailUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f158395d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteAlbumDetailUI$a */
    public static final class C93501a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f270027d;

        public C93501a(Dialog dialog) {
            this.f270027d = dialog;
        }

        public final void run() {
            this.f270027d.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteAlbumDetailUI$d */
    public static final class C93502d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FavoriteAlbumDetailUI f270028d;

        /* renamed from: e */
        public final /* synthetic */ C100755z f270029e;

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteAlbumDetailUI$d$a */
        public static final class C93503a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ FavoriteAlbumDetailUI f270030d;

            public C93503a(FavoriteAlbumDetailUI favoriteAlbumDetailUI) {
                this.f270030d = favoriteAlbumDetailUI;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107142f(2, this.f270030d.getString(C0966R.string.crb));
                e0Var.mo107142f(0, this.f270030d.getString(C0966R.string.cnr));
                e0Var.mo107142f(1, this.f270030d.getContext().getString(C0966R.string.f7944x1));
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteAlbumDetailUI$d$b */
        public static final class C93504b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C100755z f270031d;

            /* renamed from: e */
            public final /* synthetic */ FavoriteAlbumDetailUI f270032e;

            /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteAlbumDetailUI$d$b$a */
            public static final class C93505a implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ FavoriteAlbumDetailUI f270033d;

                /* renamed from: e */
                public final /* synthetic */ C100755z f270034e;

                /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteAlbumDetailUI$d$b$a$a */
                public static final class C93506a implements Runnable {

                    /* renamed from: d */
                    public final /* synthetic */ FavoriteAlbumDetailUI f270035d;

                    /* renamed from: e */
                    public final /* synthetic */ C89779i0 f270036e;

                    /* renamed from: f */
                    public final /* synthetic */ C100755z f270037f;

                    public C93506a(FavoriteAlbumDetailUI favoriteAlbumDetailUI, C89779i0 i0Var, C100755z zVar) {
                        this.f270035d = favoriteAlbumDetailUI;
                        this.f270036e = i0Var;
                        this.f270037f = zVar;
                    }

                    public final void run() {
                        this.f270035d.f270015g.f295031p = true;
                        this.f270036e.dismiss();
                        Log.m105919d("MicroMsg.FavoriteAlbumDetailUI", "do del, local id %d", Long.valueOf(this.f270037f.field_localId));
                        this.f270035d.finish();
                    }
                }

                public C93505a(FavoriteAlbumDetailUI favoriteAlbumDetailUI, C100755z zVar) {
                    this.f270033d = favoriteAlbumDetailUI;
                    this.f270034e = zVar;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C89779i0 Q = C76879j.m92723Q(this.f270033d.getContext(), "", this.f270033d.getString(C0966R.string.f7946x3), false, false, (DialogInterface.OnCancelListener) null);
                    C100755z zVar = this.f270034e;
                    C100734q.m131856k(zVar.field_localId, new C93506a(this.f270033d, Q, zVar), 16);
                }
            }

            public C93504b(C100755z zVar, FavoriteAlbumDetailUI favoriteAlbumDetailUI) {
                this.f270031d = zVar;
                this.f270032e = favoriteAlbumDetailUI;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    Intent intent = new Intent();
                    intent.putExtra("key_fav_scene", 2);
                    intent.putExtra("key_fav_item_id", this.f270031d.field_localId);
                    C100734q.m131875t0(this.f270032e.getContext(), ".ui.FavTagEditUI", intent, (Bundle) null);
                    FavoriteAlbumDetailUI favoriteAlbumDetailUI = this.f270032e;
                    favoriteAlbumDetailUI.f270015g.f295030o++;
                    favoriteAlbumDetailUI.mo128401H7(7);
                } else if (itemId == 1) {
                    C76879j.m92750u(this.f270032e.getContext(), this.f270032e.getString(C0966R.string.f7946x3), "", new C93505a(this.f270032e, this.f270031d), (DialogInterface.OnClickListener) null);
                    this.f270032e.mo128401H7(6);
                } else if (itemId == 2) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Select_Conv_Type", 3);
                    intent2.putExtra("scene_from", 1);
                    intent2.putExtra("mutil_select_is_ret", true);
                    intent2.putExtra("select_fav_local_id", this.f270031d.field_localId);
                    C100717j0.m131779a(intent2, this.f270031d);
                    C88144b.m109802t(this.f270032e, ".ui.transmit.SelectConversationUI", intent2, 100);
                    C100695a0.m131729d(this.f270031d.field_localId, 1, 0, -1);
                    FavoriteAlbumDetailUI favoriteAlbumDetailUI2 = this.f270032e;
                    favoriteAlbumDetailUI2.f270015g.f295027l++;
                    favoriteAlbumDetailUI2.mo128401H7(3);
                }
            }
        }

        public C93502d(FavoriteAlbumDetailUI favoriteAlbumDetailUI, C100755z zVar) {
            this.f270028d = favoriteAlbumDetailUI;
            this.f270029e = zVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) this.f270028d.getContext(), 1, false);
            FavoriteAlbumDetailUI favoriteAlbumDetailUI = this.f270028d;
            nVar.f225771i = new C93503a(favoriteAlbumDetailUI);
            nVar.f225782p = new C93504b(this.f270029e, favoriteAlbumDetailUI);
            nVar.mo107573q();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d7t;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            String str = null;
            String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (intent != null) {
                str = intent.getStringExtra("custom_send_text");
            }
            C89779i0 Q = C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null);
            C87412m.m108593f(Q, "showProgressDlg(context,…tips), true, false, null)");
            C93501a aVar = new C93501a(Q);
            if (!Util.isNullOrNil(stringExtra)) {
                C87412m.m108591d(stringExtra);
                Object[] array = new C66723k(",").mo90760e(stringExtra, 0).toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                ArrayList<String> stringsToList = Util.stringsToList((String[]) array);
                C87412m.m108593f(stringsToList, "stringsToList(\n         …ypedArray()\n            )");
                for (String i3 : stringsToList) {
                    C93594f1.m118181i(this, i3, str, this.f270025j, aVar);
                }
                C75026b.m89951a(this, getString(C0966R.string.cmm));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        C13598b0 b0Var;
        C98450d.C59881a aVar;
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("key_detail_info_id", -1);
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(longExtra);
        this.f270025j = Yt;
        if (Yt != null) {
            setMMTitle(getString(C0966R.string.cn9));
            C93575n.m118170a(this, Yt);
            this.f270026n = new FavAlbumContainer((Context) this, C76577a.m92151b(this, 36), C76577a.m92151b(this, 0));
            LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.o6m);
            linearLayout.addView(this.f270026n, 0);
            TextView textView = (TextView) findViewById(C0966R.C0970id.o6n);
            if (textView != null) {
                C98450d dVar = (C98450d) C86312j.m106911c(C98450d.class);
                ArrayList arrayList = new ArrayList();
                LinkedList<C101834rc0> linkedList = Yt.field_favProto.f298618f;
                C87412m.m108593f(linkedList, "favItemInfo.favProto.dataList");
                for (C101834rc0 rc02 : linkedList) {
                    int i = rc02.f299258I;
                    if (i == 2) {
                        aVar = C98450d.C59881a.TYPE_IMG;
                    } else if (i == 4) {
                        aVar = C98450d.C59881a.TYPE_VIDEO;
                    }
                    arrayList.add(aVar);
                }
                textView.setText(dVar.km0(arrayList));
            }
            FavAlbumContainer favAlbumContainer = this.f270026n;
            if (favAlbumContainer != null) {
                favAlbumContainer.setAlbumFiller(new C100770a(Yt));
                favAlbumContainer.mo104368f(Yt.field_favProto.f298618f.size());
            }
            linearLayout.setOnClickListener(new C55657b(this, longExtra));
            setBackBtn(new C55658c(this));
            addIconOptionMenu(0, (int) C0966R.string.k3h, (int) C0966R.raw.actionbar_icon_dark_more, (MenuItem.OnMenuItemClickListener) new C93502d(this, Yt));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            finish();
        }
    }
}
