package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.f1 */
public class C4679f1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponCardUI f19648d;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.f1$a */
    public class C4680a implements DialogInterface.OnCancelListener {
        public C4680a(C4679f1 f1Var) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    public C4679f1(IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f19648d = iPCallShareCouponCardUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f19648d;
        iPCallShareCouponCardUI.f19567p = C76879j.m92723Q(iPCallShareCouponCardUI.getContext(), this.f19648d.getContext().getString(C0966R.string.a3h), this.f19648d.getContext().getString(C0966R.string.f361476k62), true, true, new C4680a(this));
        IPCallShareCouponCardUI iPCallShareCouponCardUI2 = this.f19648d;
        iPCallShareCouponCardUI2.f19565n.mo183214b(iPCallShareCouponCardUI2, iPCallShareCouponCardUI2.getContext());
    }
}
