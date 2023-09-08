package com.tencent.p014mm.plugin.recharge.p093ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.recharge.model.MallRechargeProduct;
import kg2.C46726g;

/* renamed from: com.tencent.mm.plugin.recharge.ui.s */
public class C70472s implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RechargeUI f203667d;

    public C70472s(RechargeUI rechargeUI) {
        this.f203667d = rechargeUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        RechargeUI rechargeUI = this.f203667d;
        MallRechargeProduct mallRechargeProduct = rechargeUI.f203587v;
        rechargeUI.mo97049I7(new C46726g(mallRechargeProduct.f203468e, mallRechargeProduct.f203467d, mallRechargeProduct.f203469f, rechargeUI.mo97052L7()));
    }
}
