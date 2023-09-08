package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.o0 */
public class C41357o0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111346d;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.o0$a */
    public class C41358a implements C11182m0 {
        public C41358a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            if (!Util.isNullOrNil(C41357o0.this.f111346d.f111162B)) {
                e0Var.mo107142f(5, C41357o0.this.f111346d.getString(C0966R.string.ceu));
            }
            e0Var.mo107142f(3, C41357o0.this.f111346d.getString(C0966R.string.ceq));
        }
    }

    public C41357o0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111346d = exdeviceProfileUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f111346d.getContext(), 1, false);
        nVar.f225771i = new C41358a();
        nVar.f225782p = this.f111346d.f111166F;
        nVar.mo107573q();
        return true;
    }
}
