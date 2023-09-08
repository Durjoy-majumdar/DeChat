package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.DialogInterface;
import c63.C67345b;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.mall.ui.h */
public class C69785h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MallFunction f201390d;

    /* renamed from: e */
    public final /* synthetic */ int f201391e;

    /* renamed from: f */
    public final /* synthetic */ MallIndexBaseUI$$c f201392f;

    public C69785h(MallIndexBaseUI$$c mallIndexBaseUI$$c, MallFunction mallFunction, int i) {
        this.f201392f = mallIndexBaseUI$$c;
        this.f201390d = mallFunction;
        this.f201391e = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.MallIndexBaseUI", "onFunctionItemClick: onClick");
        C67345b.C0426a.m370b(this.f201390d.f209731d);
        this.f201392f.f201181a.mo95935L7(this.f201390d, this.f201391e);
    }
}
