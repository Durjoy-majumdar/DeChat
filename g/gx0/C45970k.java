package gx0;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.tools.C74866y0;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactPlainListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p214om.C11502f;
import p248ug.C52574z;

/* renamed from: gx0.k */
public class C45970k implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45973l f123983d;

    /* renamed from: gx0.k$a */
    public class C45971a implements C11182m0 {
        public C45971a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            Class cls = C52574z.class;
            ((C52574z) C86312j.m106911c(cls)).Qp0(C45970k.this.f123983d.f123987b);
            if (!((C52574z) C86312j.m106911c(cls)).mo73529Hh(C45970k.this.f123983d.f123987b)) {
                String zs = ((C52574z) C86312j.m106911c(cls)).mo73536zs(C45970k.this.f123983d.f123987b);
                if (Util.isNullOrNil(zs)) {
                    e0Var.mo107135b(2, C0966R.string.ari, C0966R.raw.ofm_add_icon);
                } else {
                    e0Var.mo107144g(2, zs, C0966R.raw.ofm_add_icon);
                }
            }
            e0Var.mo107135b(3, C0966R.string.f360380cb1, C0966R.raw.actionbar_goto_disabled_biz_icon);
            e0Var.mo107135b(4, C0966R.string.f7375ef, C0966R.raw.actionbar_setting_white_icon);
        }
    }

    /* renamed from: gx0.k$b */
    public class C45972b implements C11184p0 {
        public C45972b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Class cls = C52574z.class;
            int itemId = menuItem.getItemId();
            if (itemId == 2) {
                String Oc = ((C52574z) C86312j.m106911c(cls)).mo73532Oc(C45970k.this.f123983d.f123987b);
                if (!Util.isNullOrNil(Oc)) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", Oc);
                    Log.m105925i("EnterpriseBizEntranceListHelper", "KRawUrl :%s", Oc);
                    intent.putExtra("useJs", true);
                    intent.addFlags(67108864);
                    C88144b.m109795m(C45970k.this.f123983d.f123986a, "webview", ".ui.tools.WebViewUI", intent, 0);
                    return;
                }
                ((C52574z) C86312j.m106911c(cls)).Qp0(C45970k.this.f123983d.f123987b);
                C45973l lVar = C45970k.this.f123983d;
                ((C52574z) C86312j.m106911c(cls)).mo73531Lg(lVar.f123986a, lVar.f123987b);
            } else if (itemId == 3) {
                Intent intent2 = new Intent(C45970k.this.f123983d.f123986a, EnterpriseBizContactPlainListUI.class);
                intent2.putExtra("enterprise_biz_name", C45970k.this.f123983d.f123987b);
                intent2.putExtra("enterprise_scene", 2);
                Activity activity = C45970k.this.f123983d.f123986a;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListHelper$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity2, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListHelper$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (itemId == 4) {
                Intent intent3 = new Intent();
                intent3.putExtra("Contact_User", C45970k.this.f123983d.f123987b);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent3, C45970k.this.f123983d.f123986a);
            }
        }
    }

    public C45970k(C45973l lVar) {
        this.f123983d = lVar;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C74866y0 y0Var = this.f123983d.f123988c;
        if (y0Var != null) {
            y0Var.mo104068a();
            this.f123983d.f123988c = null;
        }
        C45973l lVar = this.f123983d;
        lVar.f123988c = new C74866y0(lVar.f123986a);
        C74866y0 y0Var2 = this.f123983d.f123988c;
        y0Var2.f220117u = new C45971a();
        y0Var2.f220118v = new C45972b();
        y0Var2.mo103923d();
        return false;
    }
}
