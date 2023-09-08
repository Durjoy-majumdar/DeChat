package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C93486a;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kg3.C76577a;
import lc1.c$$e;
import nj3.C76879j;
import p645pj.C77092c;
import pb1.C100695a0;
import pb1.C100702d1;
import pb1.C100703e0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101756ae0;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavSelectUI */
public class FavSelectUI extends FavBaseUI {

    /* renamed from: G */
    public String f269828G;

    /* renamed from: H */
    public String f269829H;

    /* renamed from: I */
    public FavoriteNormalAdapter f269830I = null;

    /* renamed from: J */
    public Set<Integer> f269831J = new HashSet();

    /* renamed from: K */
    public C100703e0 f269832K = new C100703e0();

    /* renamed from: L */
    public View.OnClickListener f269833L = new C93455e();

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSelectUI$a */
    public class C93449a implements Runnable {
        public C93449a() {
        }

        public void run() {
            FavSelectUI.this.f269830I.mo128369b();
            FavSelectUI.this.mo128232Q7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSelectUI$b */
    public class C93450b implements MenuItem.OnMenuItemClickListener {
        public C93450b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            FavSelectUI favSelectUI = FavSelectUI.this;
            intent.putExtra("key_to_user", favSelectUI.f269829H);
            intent.putExtra("key_fav_item_id", favSelectUI.f269828G);
            intent.putExtra("key_search_type", 1);
            intent.putExtra("key_enter_fav_search_from", 1);
            C100734q.m131877u0(favSelectUI.getContext(), ".ui.FavSearchUI", intent, 0, !C85875k4.m106211z() ? ActivityOptions.makeSceneTransitionAnimation(favSelectUI, new Pair[0]).toBundle() : null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSelectUI$c */
    public class C93451c implements MenuItem.OnMenuItemClickListener {
        public C93451c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavSelectUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSelectUI$d */
    public class C93452d implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ c$$e f269837a;

        /* renamed from: com.tencent.mm.plugin.fav.ui.FavSelectUI$d$a */
        public class C93453a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Dialog f269839d;

            /* renamed from: com.tencent.mm.plugin.fav.ui.FavSelectUI$d$a$a */
            public class C93454a implements Runnable {
                public C93454a() {
                }

                public void run() {
                    FavSelectUI.this.finish();
                }
            }

            public C93453a(Dialog dialog) {
                this.f269839d = dialog;
            }

            public void run() {
                Dialog dialog = this.f269839d;
                if (dialog != null) {
                    dialog.dismiss();
                }
                FavSelectUI favSelectUI = FavSelectUI.this;
                C75026b.m89951a(favSelectUI, favSelectUI.getString(C0966R.string.cmm));
                MMHandlerThread.postToMainThreadDelayed(new C93454a(), 1800);
            }
        }

        public C93452d(c$$e c__e) {
            this.f269837a = c__e;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            FavSelectUI.this.hideVKB();
            if (z) {
                C93594f1.m118181i(FavSelectUI.this.getContext(), FavSelectUI.this.f269829H, str, this.f269837a.f291387a, new C93453a(C76879j.m92723Q(FavSelectUI.this.getContext(), "", FavSelectUI.this.getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSelectUI$e */
    public class C93455e implements View.OnClickListener {
        public C93455e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavSelectUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int intValue = ((Integer) view.getTag()).intValue();
            Intent intent = new Intent();
            intent.putExtra("key_enter_fav_search_from", 1);
            if (intValue == 20) {
                intent.putExtra("key_to_user", FavSelectUI.this.f269829H);
                C93745z1.m118447d(FavSelectUI.this.getContext(), intent);
            } else {
                intent.putExtra("key_preset_search_type", intValue);
                intent.putExtra("key_to_user", FavSelectUI.this.f269829H);
                intent.putExtra("key_fav_item_id", FavSelectUI.this.f269828G);
                intent.putExtra("key_search_type", 1);
                AppCompatActivity context = FavSelectUI.this.getContext();
                if (FavSelectUI.this.f269830I.f269981q) {
                    intent.putExtra("key_search_type", 2);
                    C100734q.m131877u0(context, ".ui.FavFilterUI", intent, 4103, (Bundle) null);
                } else {
                    C100734q.m131875t0(context, ".ui.FavFilterUI", intent, (Bundle) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavSelectUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public boolean mo128223H7() {
        return ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq().getCount() > 0;
    }

    /* renamed from: K7 */
    public C93486a mo128226K7() {
        if (this.f269830I == null) {
            this.f269830I = new FavoriteNormalAdapter(getContext(), this.f269632s, false);
        }
        return this.f269830I;
    }

    /* renamed from: L7 */
    public View.OnClickListener mo128227L7() {
        return this.f269833L;
    }

    /* renamed from: O7 */
    public void mo128230O7() {
    }

    /* renamed from: P7 */
    public void mo128231P7() {
        this.f269625i.setCompoundDrawablesWithIntrinsicBounds(0, C0966R.C0969drawable.bfw, 0, 0);
        this.f269625i.setCompoundDrawablePadding(C76577a.m92151b(getContext(), 10));
        this.f269625i.setText(C0966R.string.cnu);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && -1 == i2) {
            finish();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f269829H = getIntent().getStringExtra("key_to_user");
        String stringExtra = getIntent().getStringExtra("key_fav_item_id");
        this.f269828G = stringExtra;
        if (stringExtra != null) {
            for (String str : stringExtra.split(",")) {
                int i = Util.getInt(str, Integer.MAX_VALUE);
                if (Integer.MAX_VALUE != i) {
                    ((HashSet) this.f269831J).add(Integer.valueOf(i));
                }
            }
        }
        ((HashSet) this.f269831J).remove(3);
        FavoriteNormalAdapter favoriteNormalAdapter = this.f269830I;
        favoriteNormalAdapter.f269993f = this.f269831J;
        C100703e0 e0Var = this.f269832K;
        e0Var.f295052a = false;
        e0Var.f295053b = false;
        favoriteNormalAdapter.f269994g = e0Var;
        this.f269627n.post(new C93449a());
        addIconOptionMenu(0, C0966R.raw.actionbar_icon_dark_search, new C93450b());
        setMMTitle((int) C0966R.string.cr9);
        setBackBtn(new C93451c());
    }

    public void onDestroy() {
        super.onDestroy();
        FavoriteNormalAdapter favoriteNormalAdapter = this.f269830I;
        if (favoriteNormalAdapter != null) {
            favoriteNormalAdapter.getClass();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        c$$e c__e = (c$$e) view.getTag();
        if (c__e == null) {
            Log.m105928w("MicroMsg.FavSelectUI", "on item click, holder is null");
            return;
        }
        C100755z zVar = c__e.f291387a;
        if (zVar == null) {
            Log.m105928w("MicroMsg.FavSelectUI", "on item click, info is null");
            return;
        }
        C100695a0.m131729d(zVar.field_localId, 1, 1, (i - this.f269624h.getHeaderViewsCount()) - 1);
        if (zVar.field_type != 19 || !C93663j.m118352a(zVar.field_favProto.f298610I)) {
            int i2 = zVar.field_type;
            if (i2 == 5) {
                C101756ae0 ae02 = zVar.field_favProto.f298622j;
                if (ae02 != null && ae02.f297879w == 1) {
                    C75026b.m89951a(this, getString(C0966R.string.f7262m));
                    return;
                }
            }
            if (i2 == 3) {
                C75026b.m89951a(this, getString(C0966R.string.f7261l));
            } else if (i2 != 8 || !C45628s0.m50738C(this.f269829H)) {
                int i3 = C0966R.string.cng;
                long h = C77092c.m93046h();
                if (zVar.field_type == 18) {
                    i3 = C0966R.string.cnf;
                    h = C77092c.m93045g();
                }
                long j2 = zVar.field_datatotalsize;
                Log.m105925i("MicroMsg.FavSelectUI", "fav total size:%s, limitSize:%s", Long.valueOf(j2), Long.valueOf(h));
                if (j2 > h) {
                    C75026b.m89951a(this, getString(i3, new Object[]{Util.getSizeKB(h)}));
                } else {
                    ((C100702d1) C86312j.m106911c(C100702d1.class)).mo123900yk(getContext(), this.f269829H, c__e.f291387a, C0966R.string.a2s, true, new C93452d(c__e));
                }
            } else {
                C75026b.m89951a(this, getString(C0966R.string.f7259j));
            }
        } else {
            C75026b.m89951a(this, getString(C0966R.string.f7258i));
        }
    }
}
