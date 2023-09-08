package gg0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindQQUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import hg0.C46057k0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import qo3.C77407n;

/* renamed from: gg0.t */
public class C107796t implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BindQQUI f322623d;

    /* renamed from: gg0.t$a */
    public class C107797a implements C11182m0 {
        public C107797a(C107796t tVar) {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.setHeaderTitle((int) C0966R.string.ake);
            e0Var.mo107125a(0, C0966R.string.k6b);
        }
    }

    /* renamed from: gg0.t$b */
    public class C107798b implements C11184p0 {
        public C107798b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                BindQQUI bindQQUI = C107796t.this.f322623d;
                bindQQUI.getClass();
                C86709a0.m107524d().mo123460f(new C46057k0(1));
                bindQQUI.f344319f = C76879j.m92723Q(bindQQUI, bindQQUI.getString(C0966R.string.a3h), bindQQUI.getString(C0966R.string.f360085a04), true, true, new C107795q(bindQQUI));
            }
        }
    }

    public C107796t(BindQQUI bindQQUI) {
        this.f322623d = bindQQUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        AppCompatActivity context = this.f322623d.getContext();
        LayoutInflater.from(context);
        C77407n nVar = new C77407n((Context) context, 1, false);
        C76874e0 e0Var = new C76874e0(context);
        new C76874e0(context);
        C107797a aVar = new C107797a(this);
        C107798b bVar = new C107798b();
        e0Var.clear();
        C76874e0 e0Var2 = new C76874e0(context);
        aVar.onCreateMMMenu(e0Var2);
        if (e0Var2.mo107176v()) {
            Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            nVar.f225771i = aVar;
            nVar.f225782p = bVar;
            nVar.f225761d = null;
            nVar.f225725D = null;
            nVar.mo107573q();
        }
        return false;
    }
}
