package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;
import td2.C77891a;

/* renamed from: com.tencent.mm.plugin.remittance.ui.q0 */
public class C70935q0 implements C77891a.C77892a {

    /* renamed from: a */
    public final /* synthetic */ RemittanceDetailUI f205382a;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.q0$a */
    public class C70936a implements DialogInterface.OnClickListener {
        public C70936a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C70935q0.this.f205382a.mo97379M7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.q0$b */
    public class C70937b implements DialogInterface.OnClickListener {
        public C70937b(C70935q0 q0Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public C70935q0(RemittanceDetailUI remittanceDetailUI) {
        this.f205382a = remittanceDetailUI;
    }

    public void onClick(View view) {
        RemittanceDetailUI remittanceDetailUI = this.f205382a;
        C76879j.m92707A(remittanceDetailUI, remittanceDetailUI.getString(C0966R.string.f361192i11, new Object[]{remittanceDetailUI.mo97382P7(remittanceDetailUI.f204727T0, false)}), this.f205382a.getString(C0966R.string.a2d), this.f205382a.getString(C0966R.string.i16), this.f205382a.getString(C0966R.string.f7926wf), new C70936a(), new C70937b(this));
    }
}
