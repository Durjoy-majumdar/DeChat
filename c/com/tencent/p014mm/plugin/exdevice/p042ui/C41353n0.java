package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.n0 */
public class C41353n0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111339d;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.n0$a */
    public class C41354a implements C11182m0 {
        public C41354a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(2, C41353n0.this.f111339d.getString(C0966R.string.cev));
        }
    }

    public C41353n0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111339d = exdeviceProfileUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f111339d.getContext(), 1, false);
        nVar.f225771i = new C41354a();
        nVar.f225782p = this.f111339d.f111166F;
        nVar.mo107573q();
        return true;
    }
}
