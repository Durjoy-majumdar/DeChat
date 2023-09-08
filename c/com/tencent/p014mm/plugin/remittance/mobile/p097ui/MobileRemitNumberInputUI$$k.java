package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75129p;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;
import xi2.C78842a;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$k */
public class MobileRemitNumberInputUI$$k implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MobileRemitNumberInputUI f203906d;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$k$a */
    public class C70535a implements C11182m0 {
        public C70535a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            for (int i = 0; i < MobileRemitNumberInputUI$$k.this.f203906d.f203891r.f136826i.size(); i++) {
                e0Var.mo107142f(i, MobileRemitNumberInputUI$$k.this.f203906d.f203891r.f136826i.get(i).f227478d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$k$b */
    public class C70536b implements C11184p0 {

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$k$b$a */
        public class C70537a extends C78842a {
            public C70537a() {
            }

            /* renamed from: c */
            public void mo6028c(Object obj) {
                Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "bottomSheet click jumpItem.action:exit");
                MobileRemitNumberInputUI$$k.this.f203906d.mo97196H7();
            }

            /* renamed from: f */
            public void mo97200f(Object obj) {
                Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "bottomSheet click jumpItem.action:continue");
            }
        }

        public C70536b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() >= MobileRemitNumberInputUI$$k.this.f203906d.f203891r.f136826i.size() || menuItem.getItemId() < 0) {
                Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "menuItem click menuItem.getItemId() illegal");
                return;
            }
            C75129p.m90108c(MobileRemitNumberInputUI$$k.this.f203906d.getContext(), MobileRemitNumberInputUI$$k.this.f203906d.f203891r.f136826i.get(menuItem.getItemId()), null, new C70537a());
            Log.m105925i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "menuItem click JumpItem:%s", C75129p.m90110e(MobileRemitNumberInputUI$$k.this.f203906d.f203891r.f136826i.get(menuItem.getItemId())));
        }
    }

    public MobileRemitNumberInputUI$$k(MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f203906d = mobileRemitNumberInputUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105918d("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "onMenuItemClick click");
        C77407n nVar = new C77407n((Context) this.f203906d.getContext(), 1, false);
        nVar.f225771i = new C70535a();
        nVar.f225782p = new C70536b();
        nVar.mo107573q();
        return false;
    }
}
