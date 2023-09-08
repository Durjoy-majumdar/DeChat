package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import bg0.C67236j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75592q0;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import lp3.C88633e;
import lp3.C88643g;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import qo3.C77407n;
import te3.C64303d0;
import te3.C64354f;
import te3.C78021z;

/* renamed from: com.tencent.mm.plugin.aa.ui.t1 */
public class C68337t1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78021z f196360d;

    /* renamed from: e */
    public final /* synthetic */ PaylistAAUI f196361e;

    /* renamed from: com.tencent.mm.plugin.aa.ui.t1$a */
    public class C68338a implements C11182m0 {
        public C68338a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            C64354f fVar;
            e0Var.add(0, 1, 1, (int) C0966R.string.hhp);
            if (!Util.isNullOrNil(C68337t1.this.f196361e.f196240I) && C68337t1.this.f196361e.f196240I.equals(C75592q0.m90789s())) {
                C68337t1 t1Var = C68337t1.this;
                C78021z zVar = t1Var.f196360d;
                if (zVar.f228669q == 1 && zVar.f228667o < zVar.f228665j) {
                    e0Var.mo107140d(2, t1Var.f196361e.getContext().getResources().getColor(C0966R.color.f2966ao), C68337t1.this.f196361e.getString(C0966R.string.f7279bb));
                }
            }
            int i = 4;
            if (!Util.isNullOrNil(C68337t1.this.f196361e.f196240I) && C68337t1.this.f196361e.f196240I.equals(C75592q0.m90789s())) {
                C68337t1 t1Var2 = C68337t1.this;
                C78021z zVar2 = t1Var2.f196360d;
                if (zVar2.f228669q == 1 && zVar2.f228663h == 4) {
                    e0Var.mo107140d(2, t1Var2.f196361e.getContext().getResources().getColor(C0966R.color.f2966ao), C68337t1.this.f196361e.getString(C0966R.string.f7279bb));
                }
            }
            LinkedList<C64303d0> linkedList = C68337t1.this.f196360d.f228657I;
            if (linkedList != null && linkedList.size() > 0) {
                for (C64303d0 next : C68337t1.this.f196360d.f228657I) {
                    if (!(Util.isNullOrNil(next.f182621d) || (fVar = next.f182622e) == null || fVar.f183061d == 0)) {
                        Log.m105925i("MicroMsg.Aa.PaylistAAUI", "add option :%s", next.f182621d);
                        e0Var.mo107142f(i, next.f182621d);
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.t1$b */
    public class C68339b implements C11184p0 {

        /* renamed from: com.tencent.mm.plugin.aa.ui.t1$b$a */
        public class C68340a implements DialogInterface.OnClickListener {
            public C68340a(C68339b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.Aa.PaylistAAUI", "onDialogClick() ");
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.t1$b$b */
        public class C68341b implements DialogInterface.OnClickListener {
            public C68341b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                PaylistAAUI paylistAAUI = C68337t1.this.f196361e;
                int i2 = PaylistAAUI.f196231R;
                paylistAAUI.hideLoading();
                Dialog dialog = paylistAAUI.f196252n;
                if (dialog != null && dialog.isShowing()) {
                    paylistAAUI.f196252n.dismiss();
                }
                if (paylistAAUI.f196252n == null) {
                    paylistAAUI.f196252n = C76879j.m92721O(paylistAAUI, (String) null, 3, C0966R.style.f8510l3, paylistAAUI.getString(C0966R.string.gas), true, true, new C68294j1(paylistAAUI));
                }
                C67236j.C67238b bVar = paylistAAUI.f196248g.f193070f;
                bVar.getClass();
                ((C88633e) C88643g.m110546d()).mo123061d(bVar).mo123062e(new C68300l1(paylistAAUI)).mo123065b(new C68297k1(paylistAAUI));
                C115669n.INSTANCE.mo160131h(13721, 4, 6, Integer.valueOf(paylistAAUI.f196247Q));
            }
        }

        public C68339b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            LinkedList<C64303d0> linkedList;
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                if (!Util.isNullOrNil(C68337t1.this.f196361e.f196239H)) {
                    if (C72996z1.m85844o5(C68337t1.this.f196361e.f196239H)) {
                        C76879j.m92711E(C68337t1.this.f196361e.getContext(), C68337t1.this.f196361e.getString(C0966R.string.l8v), "", C68337t1.this.f196361e.getString(C0966R.string.lkg), false, new C68340a(this));
                    } else {
                        Log.m105924i("MicroMsg.Aa.PaylistAAUI", "click OptionsMenu launchAAUI");
                        Intent intent = new Intent(C68337t1.this.f196361e.getContext(), LaunchAAUI.class);
                        intent.putExtra("enter_scene", 3);
                        intent.putExtra("chatroom_name", C68337t1.this.f196361e.f196239H);
                        PaylistAAUI paylistAAUI = C68337t1.this.f196361e;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        PaylistAAUI paylistAAUI2 = paylistAAUI;
                        C117292a.m165358d(paylistAAUI2, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/PaylistAAUI$6$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        paylistAAUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(paylistAAUI2, "com/tencent/mm/plugin/aa/ui/PaylistAAUI$6$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                int i2 = C68337t1.this.f196360d.f228672t;
                C115669n.INSTANCE.mo160131h(13721, 7, Integer.valueOf(i2 == 2 ? 1 : i2 == 1 ? 2 : 3));
            } else if (itemId == 2) {
                Log.m105924i("MicroMsg.Aa.PaylistAAUI", "click OptionsMenu stop AA");
                C115669n.INSTANCE.mo160131h(13721, 4, 5, Integer.valueOf(C68337t1.this.f196361e.f196247Q));
                C76879j.m92739j(C68337t1.this.f196361e, C0966R.string.f7278ba, -1, C0966R.string.f7280be, C0966R.string.f7926wf, new C68341b(), (DialogInterface.OnClickListener) null);
            }
            if (menuItem.getItemId() >= 4 && (linkedList = C68337t1.this.f196360d.f228657I) != null && linkedList.size() > 0) {
                LinkedList<C64303d0> linkedList2 = C68337t1.this.f196360d.f228657I;
                if (menuItem.getItemId() - 4 > linkedList2.size() - 1) {
                    Log.m105925i("MicroMsg.Aa.PaylistAAUI", "oversize  : %s ,size :%s", Integer.valueOf(menuItem.getItemId()), Integer.valueOf(linkedList2.size()));
                    return;
                }
                C64303d0 d0Var = linkedList2.get(menuItem.getItemId() - 4);
                Log.m105925i("MicroMsg.Aa.PaylistAAUI", "click option item : %s ,type:%s", d0Var.f182621d, Integer.valueOf(d0Var.f182622e.f183061d));
                C64354f fVar = d0Var.f182622e;
                int i3 = fVar.f183061d;
                if (i3 == 1) {
                    Log.m105925i("MicroMsg.Aa.PaylistAAUI", "textInfo.jumpInfo.url ：%s", fVar.f183062e);
                    C75228t.m90219L(C68337t1.this.f196361e.getContext(), d0Var.f182622e.f183062e, false);
                } else if (i3 == 2) {
                    Log.m105925i("MicroMsg.Aa.PaylistAAUI", "textInfo.jumpInfo.username ：%s", fVar.f183063f);
                    C64354f fVar2 = d0Var.f182622e;
                    C75228t.m90224Q(fVar2.f183063f, fVar2.f183064g, 0, 1000);
                } else if (i3 != 3) {
                    Log.m105920e("MicroMsg.Aa.PaylistAAUI", "unknow text info type");
                } else {
                    Log.m105920e("MicroMsg.Aa.PaylistAAUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
                }
            }
        }
    }

    public C68337t1(PaylistAAUI paylistAAUI, C78021z zVar) {
        this.f196361e = paylistAAUI;
        this.f196360d = zVar;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f196361e, 1, false);
        nVar.f225771i = new C68338a();
        nVar.f225782p = new C68339b();
        nVar.mo107573q();
        return true;
    }
}
