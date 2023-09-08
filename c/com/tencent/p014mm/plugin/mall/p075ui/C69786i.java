package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.DialogInterface;
import c63.C67345b;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.mall.ui.i */
public class C69786i implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ MallFunction f201393d;

    public C69786i(MallIndexBaseUI$$c mallIndexBaseUI$$c, MallFunction mallFunction) {
        this.f201393d = mallFunction;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.MallIndexBaseUI", "onFunctionItemClick: onCancel");
        C67345b.C0426a.m370b(this.f201393d.f209731d);
    }
}
