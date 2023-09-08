package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.j0 */
public class C41334j0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111308d;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.j0$a */
    public class C41335a implements C11182m0 {
        public C41335a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107144g(0, C41334j0.this.f111308d.getString(C0966R.string.cel), C0966R.raw.bottomsheet_icon_transmit);
            e0Var.mo107144g(1, C41334j0.this.f111308d.getString(C0966R.string.ceo), C0966R.raw.bottomsheet_icon_moment);
        }
    }

    public C41334j0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111308d = exdeviceProfileUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f111308d.getContext(), 1, false);
        nVar.f225771i = new C41335a();
        nVar.f225782p = this.f111308d.f111166F;
        nVar.mo107573q();
        return true;
    }
}
